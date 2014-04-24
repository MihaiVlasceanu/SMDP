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
import java.util.List
import java.util.ArrayList

class Constraints {	
	static val  map = new HashMap<Question, Integer>();
	static val  goToMap = new HashMap<Question, Integer>();
	static val  usedList = new ArrayList<Integer>();
	def static boolean CreateMap(Survey it){
		questions.forEach[question, iterator| map.put(question,iterator)] 	//Puts all the questions in the main map
		
		questions.forEach[question, iIterator | 							//Iterates questions again
			if(!goToMap.containsKey(question)){								//Checks the question whether or not they exist in the goToMap
			val localQuestions = forkMap(question) 							//Maps all the forks questions as a List of List of type Question
				if(localQuestions != null && localQuestions.size > 0){ 		//Checks Whether the list is null or empty
					localQuestions.forEach[localFork, qIterator | 			//Iterates all the lists 
							localFork.forEach[localQuestion, pIterator |	//Iterates the single questions 
								goToMap.put(localQuestion, pIterator + 1) 	//Puts question in the map with the a key based on the current sinqle question index  + 1
								usedList.add(pIterator + 1)					//adds the previously used key to the used list
						]
					]
				}
			}
		]
		true
	}
	def static dispatch boolean Constraint(Survey it){
		CreateMap
		val map2 = map
		val goToMap2 = goToMap
		val usedList2 = usedList
		val names = it.questions.map[name]
		names.forall[x | names.filter[y | y == x].size == 1] 
		&&
		questions.forall[ x | qConstraint(x)]
	}
	
	def static dispatch List<EList<Question>> forkMap(Open it)
	{		
			null;
	}
	def static dispatch List<List<Question>> forkMap(MultipleChoice it)
	{
			fork.map[getQuestions]
	}
	def static dispatch List<List<Question>> forkMap(Ranking it)
	{
			fork.map[getQuestions]
	}
	def static dispatch List<List<Question>> forkMap(Rating it)
	{		
			fork.map[getQuestions]
	}
	
	def static dispatch  List<List<Question>> forkMap(Staple it)
	{		
			fork.map[getQuestions]
	}
	def static dispatch  List<List<Question>> forkMap(ConstantSum it)
	{		
			fork.map[getQuestions]
	}
	def static List<Question> getQuestions(Fork it)
	{
			questions.map[x | x] 			
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