package dk.itu.mddp.eank.survey

import java.util.HashMap
import survey.Survey
import survey.Question
import java.util.ArrayList

class QuestionMapping {
	
	public static var map = new HashMap<Question, Integer>(); //make getters
	public	static var goToMap = new HashMap<Question, Integer>();
		static var next = new HashMap<Question, Integer>();
		static var usedList = new ArrayList<Integer>();
	
	def static HashMap<Question, Integer> MapQuestions(Survey it){
		val survey = Transformation.changeChoices(it)
		val questions = survey.questions
			questions.forEach[q, i | map.put(q,i)]
			questions.forEach[q | //parent question q
				var localQuestions = Transformation.forkMap(q)
	
				if(localQuestions != null)
				{
					localQuestions.forEach[localQuestion |
						for(p:0..localQuestion.size)
						{										
							if(p!=localQuestion.size)
							{
								usedList.add(map.get(localQuestion.get(p)))							
							}
						}
					]
				}			
	
			]
			questions.forEach[q | //parent question q
				var localQuestions = Transformation.forkMap(q)
				if(!goToMap.containsKey(q)){
					var to = map.get(q)+1;
					while(usedList.contains(to))
					{
						to=to+1
					}
					goToMap.put(q, to)
				}
	
				if(localQuestions != null)
				{
					localQuestions.forEach[localQuestion |
						for(p:0..localQuestion.size)
						{										
							if(p!=localQuestion.size)
							{
	
								if(p!=localQuestion.size-1)
								{
									goToMap.put(localQuestion.get(p), map.get(localQuestion.get(p+1)))
								}					
								else{
									goToMap.put(localQuestion.get(p),goToMap.get(q));//go to its parents next question 
								}
								//localQuestion.forEach[forkQuestion |
									//usedList.add(map.get(forkQuestion))						
	
	
								//]
							}
						}
					]
				}
			]
			return goToMap;
	}	


}