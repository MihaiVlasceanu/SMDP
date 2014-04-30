package dk.itu.mddp.eank.survey

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
			var localQuestions = CodeGenerator.forkMap(q)
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
		if(questions.forall[Constraint])
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
		fork.forall[x | Constraint(x, it)]
		&&
		//Checks if the fork references to the same question several times
		fork.forall[questions.toSet.size == questions.size]
		&&
		//Checks if the forks reference to the same choice several times
		fork.forall[on.toSet.size == on.size]
	}
	def static dispatch boolean Constraint(Ranking it){
		val choiceCount = choices.size
		fork.forall[x | Constraint(x, it)] 
		&&
		fork.forall[x | x.questions.toSet.size == x.questions.size]
		&&
		fork.forall[on.toSet.size == on.size]
		&&
		//Checks if a ranking fork's min and max are within bounds
		fork.forall[Constraint(choiceCount)]
	}
	def static dispatch boolean Constraint(Rating it){
		min >= 0 && max > 0
		&&
		fork.forall[x | Constraint(x, it)]
		&&
		fork.forall[questions.toSet.size == questions.size]
		
	}
	def static dispatch boolean Constraint(Staple it){
		fork.forall[x | Constraint(x, it)]
		&&
		fork.forall[questions.toSet.size == questions.size]
		
	}
	def static dispatch boolean Constraint(ConstantSum it){
		constant >= 0
		&&
		fork.forall[x | Constraint(x, it)]
		&&
		fork.forall[questions.toSet.size == questions.size]
		&&
		fork.forall[on.toSet.size == on.size]
	}
	def static boolean Constraint(Fork it, Question q){
		!questions.contains(q)
	}
	def static boolean Constraint(RankingSumFork it, int choiceCount)
	{
		
		max <= choiceCount && min >= choiceCount
	}


}