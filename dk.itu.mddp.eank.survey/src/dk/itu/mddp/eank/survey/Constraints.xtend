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
class Constraints {
	
	
	def static boolean CreateMap(Survey it){
		val map = new HashMap<Question, String>()
		questions.forEach[x | map.put(x, x.name)]
		true		
	}
	def static dispatch boolean Constraint(Survey it){
		CreateMap
		val names = it.questions.map[name]
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