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

class Constraints {
	
	static var map = new HashMap<Question, Integer>();
	static var goToMap = new HashMap<Question, Integer>();
	static var usedList = new ArrayList<Integer>();
	def static boolean CheckLoop(Survey it){
		questions.forEach[q, i | map.put(q,i)]
		questions.forEach[q |
			var localQuestions = CodeGenerator.forkMap(q)
			if(localQuestions != null)
			{
				localQuestions.forEach[localQuestion |
					localQuestion.forall[forkQuestion |
						if(!usedList.contains(map.get(forkQuestion)))
							usedList.add(map.get(forkQuestion))
						else 
							return false
					]
				]
			}
		]	
		true
	}
	def static dispatch boolean Constraint(Survey it){
		
		val names = it.questions.map[name]
		CheckLoop  &&
		names.forall[x | names.filter[y | y == x].size == 1] 
		&&
		questions.forall[ x | qConstraint(x)]
	}
	def static dispatch boolean qConstraint(Open it){
		true
	}
	def static dispatch boolean qConstraint(MultipleChoice it){
		fork.forall[x | Constraint(x, it)]
	}
	def static dispatch boolean qConstraint(Ranking it){
		fork.forall[x | Constraint(x, it)]
	}
	def static dispatch boolean qConstraint(Rating it){
		fork.forall[x | Constraint(x, it)]
	}
	def static dispatch boolean qConstraint(Staple it){
		fork.forall[x | Constraint(x, it)]
	}
	def static dispatch boolean qConstraint(ConstantSum it){
		fork.forall[x | Constraint(x, it)]
	}
	def static boolean Constraint(Fork it, Question q){
		!questions.contains(q)
	}
	def static boolean CheckForkLoop(EList<Question> list, Fork it){
		true
	}


}