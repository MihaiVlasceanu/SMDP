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
		
		if(names.forall[x | names.filter[y | y == x].size == 1])
		{
			result = true
		}
		else
		{
			println("Names are not unique")
			result = false
		}
		if(questions.forall[qConstraint])
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
	def static dispatch boolean qConstraint(Open it){
		true
	}
	def static dispatch boolean qConstraint(MultipleChoice it){
		fork.forall[x | Constraint(x, it)]
		&&
		fork.forall[x | x.questions.toSet.size == x.questions.size]
		&&
		fork.forall[Constraint]
	}
	def static dispatch boolean qConstraint(Ranking it){
		fork.forall[x | Constraint(x, it)] 
		&&
		fork.forall[x | x.questions.toSet.size == x.questions.size]
		&&
		fork.forall[Constraint]
	}
	def static dispatch boolean qConstraint(Rating it){
		fork.forall[x | Constraint(x, it)]
		&&
		fork.forall[x | x.questions.toSet.size == x.questions.size]
		
	}
	def static dispatch boolean qConstraint(Staple it){
		fork.forall[x | Constraint(x, it)]
		&&
		fork.forall[x | x.questions.toSet.size == x.questions.size]
		
	}
	def static dispatch boolean qConstraint(ConstantSum it){
		constant >= 0
		&&
		fork.forall[x | Constraint(x, it)]
		&&
		fork.forall[x | x.questions.toSet.size == x.questions.size]
		&&
		fork.forall[Constraint]
	}
	def static boolean Constraint(Fork it, Question q){
		!questions.contains(q)
	}
	def static boolean CheckForkLoop(EList<Question> list, Fork it){
		true
	}
	def static boolean Constraint(ChoiceFork it)
	{
		it.on.toSet.size == on.size
	}
	def static boolean Constraint(RankingSumFork it)
	{
		it.on.toSet.size == on.size
	}


}