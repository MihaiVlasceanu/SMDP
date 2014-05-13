import survey.Survey
import survey.Question
import survey.Ranking
import survey.Fork
import survey.Rating
import survey.Staple
import survey.Open
import survey.ConstantSum
import survey.MultipleChoice
import org.eclipse.emf.common.util.EList
import java.util.HashMap
import java.util.ArrayList
import survey.RatingFork
import survey.RankingSumFork
import survey.ChoiceFork

class Constraints {
	
	
	static var result = true
	def static boolean CheckLoop(Survey it){
		result = true
		val map = new HashMap<Question, Integer>();
		val goToMap = new HashMap<Question, Integer>();
		val usedList = new ArrayList<Integer>();
		
		questions.forEach[q, i | map.put(q,i)]
		questions.forEach[q |
			usedList.add(map.get(q))
			var localQuestions = Transformation.forkMap(q)
			if(localQuestions != null)
			{
				localQuestions.forEach[localQuestion |
					localQuestion.forEach[forkQuestion |
						if(!usedList.contains(map.get(forkQuestion)))
						{
							result = true
						}
						else 
						{
							println("Question " + q.name + " loops to " + forkQuestion.name)
							result = false
						}
							
					]
				]
			}
		]	
		result
	}
	def static dispatch boolean Constraint(Survey it){
		var result = true
		val names = it.questions.map[name]
		if(CheckLoop)
		{
			result = true
		} 
		else
		{
			println("Survey is looping")
			result = false
		}
		//Checks if there are any duplicate question names
		if(names.toSet.size == names.size)
		{
			result = true
		}
		else
		{
			println("Names are not unique")
			result = false
		}
		//Checks for additional constraints, in regards to forking
		var tuplestuff = questions.map[Constraint -> it.name]
		
		tuplestuff.forEach[x | println(x.key + ", " + x.value)]
		if(tuplestuff.forall[x | x.key == true])
		{
			result = true
		}
		else
		{
			println("Fork issues")
			result = false
		}
		result
	}
	def static dispatch boolean Constraint(Open it){
		//Returns true because Open questions do not have forks
		true
	}
	def static dispatch boolean Constraint(MultipleChoice it){
		//Checks if the questions forks do not reference to the the parent question
		forks.forall[x | Constraint(x, it)]
		&&
		//Checks if the forks references to the same question several times
		forks.forall[questions.toSet.size == questions.size]
		&&
		//Checks if the forks reference to the same choice several times
		forks.forall[on.toSet.size == on.size]
	}
	def static dispatch boolean Constraint(Ranking it){
		val choiceCount = choices.size
//		var selfReference = forks.forall[x | Constraint(x, it)] 
//		var duplicateQuestions = forks.forall[x | x.questions.toSet.size == x.questions.size]
//		var duplicateChoices = forks.forall[on.toSet.size == on.size]
//		var rangeOutOfBounds = forks.forall[Constraint(choiceCount)]
//		
//		println(
//		"Self Reference: " + selfReference + 
//		" Duplicate Questions: " + duplicateQuestions +  
//		" Duplicate Choices :" + duplicateChoices + 
//		" Out of Bounds" + rangeOutOfBounds +
//		"Choice Count: " + choiceCount)
//		 
		
		forks.forall[x | Constraint(x, it)] 
		&&
		forks.forall[x | x.questions.toSet.size == x.questions.size]
		&&
		forks.forall[on.toSet.size == on.size]
		&&
		//Checks if a ranking forks's min and max are within bounds
		forks.forall[Constraint(choiceCount)]
	}
	def static dispatch boolean Constraint(Rating it){
		min >= 0 && max > 0
		&&
		forks.forall[x | Constraint(x, it)]
		&&
		forks.forall[questions.toSet.size == questions.size]
		
	}
	def static dispatch boolean Constraint(Staple it){
		forks.forall[x | Constraint(x, it)]
		&&
		forks.forall[questions.toSet.size == questions.size]
		
	}
	def static dispatch boolean Constraint(ConstantSum it){
		constant >= 0
		&&
		forks.forall[x | Constraint(x, it)]
		&&
		forks.forall[questions.toSet.size == questions.size]
		&&
		forks.forall[on.toSet.size == on.size]
	}
	def static boolean Constraint(Fork it, Question q){
		!questions.contains(q)
	}
	def static boolean Constraint(RankingSumFork it, int choiceCount)
	{
		
		max <= choiceCount && min >= 0
	}
	def static boolean Constraint(RatingFork it, Rating q)
	{
		
		max <= q.max && min >= q.min
	}
	def static boolean Constraint(RatingFork it, Staple q)
	{
		
		max <= 5 && min >= -5
	}


}