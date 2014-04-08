package dk.itu.mddp.eank.survey

import survey.Survey
import survey.Question
import survey.Ranking
import survey.Fork
import survey.Rating
import survey.Dichotomous

class Constraints {
	def static dispatch boolean Constraint(Survey it){
		val names = it.questions.map[name]
		names.forall[x | 1== names.filter[y | y == x].size] 
		&&
		questions.forall[Constraint]
	}
	def static dispatch boolean Contstraint(Dichotomous it){
		
		true
	}
	def static dispatch boolean Contstraint(Question it){
		
		true
	}
	def static dispatch boolean Constraint(Ranking it){
		true
	}
	def static dispatch boolean Constraint(Rating s){
		s.fork.forall[!questions.contains[s]]
	}
	

}