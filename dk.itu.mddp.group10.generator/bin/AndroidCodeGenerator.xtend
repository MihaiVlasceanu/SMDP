import survey.Survey
import survey.Open
import survey.MultipleChoice
import survey.Ranking
import survey.Rating
import survey.Staple
import survey.Choice
import survey.ConstantSum
import survey.Question
import org.eclipse.emf.common.util.EList
import java.util.HashMap

class AndroidCodeGenerator extends CodeGenerator {	
	new(HashMap<Question, Integer> goToMap, HashMap<Question, Integer> questionMap)
	{
		super(goToMap, questionMap)
	}
	override String getTemplate(Survey it) {
		'''
		package com.smdp.surveytoandroid;
		
		import java.util.ArrayList;
		
		import com.smdp.surveytoandroid.questionstructure.Choice;
		import com.smdp.surveytoandroid.questionstructure.Fork;
		import com.smdp.surveytoandroid.questionstructure.MultipleChoiceQuestion;
		import com.smdp.surveytoandroid.questionstructure.OpenQuestion;
		import com.smdp.surveytoandroid.questionstructure.Questionable;
		import com.smdp.surveytoandroid.questionstructure.RankingQuestion;
		import com.smdp.surveytoandroid.questionstructure.RatingQuestion;
		import com.smdp.surveytoandroid.questionstructure.ConstantSumQuestion;
		import com.smdp.surveytoandroid.questionstructure.StapleQuestion;
		import com.smdp.surveytoandroid.questionstructure.Survey;
		
		public class CodeGenData {
			
			private static ArrayList<Questionable> questions = new ArrayList<Questionable>();
			
			public static String getSurveyName() {
				
				Survey «it.name» = new Survey ("«it.name»");
				String surveyName = «it.name».getName();
				return surveyName;
		}
		
			public static ArrayList<Questionable> addQuestionsToArrList() {
		
		«FOR question : it.questions»«toTemplate(question)»«ENDFOR»
			«FOR question : it.questions»
				«IF(question instanceof MultipleChoice)»
					«FOR p : question.choices»
			 		«FOR q : question.forks»		 				
			 		«IF (q.on.contains(p))» «toTemplate(q.questions,p.description, question.name, question.forks.indexOf(q).toString)» 
			 		«ENDIF »«ENDFOR»
					«ENDFOR»
				«ENDIF»
				«IF(question instanceof Ranking)»
					«FOR p : question.choices»
			 		«FOR q : question.forks»		 				
			 		«IF (q.on.contains(p))» «toTemplate(q.questions,p.description, question.name, q.min, q.max, question.forks.indexOf(q).toString)» 
			 		«ENDIF »«ENDFOR»
					«ENDFOR»
				«ENDIF»
				«IF(question instanceof ConstantSum)»
					«FOR p : question.choices»
			 		«FOR q : question.forks»		 				
			 		«IF (q.on.contains(p))» «toTemplate(q.questions,p.description, question.name,q.min, q.max, question.forks.indexOf(q).toString)» 
			 		«ENDIF »«ENDFOR»
					«ENDFOR»
				«ENDIF»
				«IF(question instanceof Rating)»
					«FOR q : question.forks»	
					 «IF (question.forks.size >0)»«toTemplate(q.questions, question.name, q.min, q.max,question.forks.indexOf(q).toString )»
					 «ENDIF »«ENDFOR»
				«ENDIF»
				«IF(question instanceof Staple)»
					«FOR q : question.forks»	
				 	«IF (question.forks.size >0)»«toTemplate(q.questions, question.name, q.min, q.max,question.forks.indexOf(q).toString )»
				 	«ENDIF »«ENDFOR»
				«ENDIF»
			«ENDFOR»
				return questions;
			}
		}	
		'''
	}
	//open question template
	def dispatch toTemplate(Open it) {
				'''
				OpenQuestion «it.name» = new OpenQuestion ("«it.name»","«it.question»",«it.isRequired»);
				questions.add(«it.name»);			

				'''
	}

	//multiple choice forks template	
	def dispatch toTemplate( EList<Question> questions, String choicename, String questionname, String forkid) {
			//name for the specific forks
			var forkName = questionname.toLowerCase + "ForkId" + forkid
			//name for forks array 
			var forkArrName = questionname.toLowerCase + "ForkArrId" + forkid
				'''
				Fork «forkName» = new Fork();
				ArrayList<Questionable> «forkArrName» = new ArrayList<Questionable>();
				«FOR q : questions»«forkArrName».add(«q.name»); «ENDFOR»
				«forkName».bindingChoiceQuest.put("«choicename»",«forkArrName»);
				«questionname».forks.add(«forkName»);
						
				'''
	}
	
	//rank + constant sum forks template
	def dispatch toTemplate(  EList<Question> questions, String choicename,String questionname, int min, int max, String forkid) {
			//name for the specific forks
			var forkName = questionname.toLowerCase + "ForkId" + forkid
			//name for forks array 
			var forkArrName = questionname.toLowerCase + "ForkArrId" + forkid
			
			'''
			Fork «forkName» = new Fork(«min», «max»);
			ArrayList<Questionable> «forkArrName» = new ArrayList<Questionable>();
			«FOR q : questions»«forkArrName».add(«q.name»); «ENDFOR»
			«forkName».bindingChoiceQuest.put("«choicename»",«forkArrName»);
			«questionname».forks.add(«forkName»);
				
			'''
	}
	
	//rate + staple forks template
	def dispatch toTemplate(EList<Question> questions,String questionname, int min, int max, String forkid) {
			//name for the specific forks
			var forkName = questionname.toLowerCase + "ForkId" + forkid
			//name for forks array 
			var forkArrName = questionname.toLowerCase + "ForkArrId" + forkid
			
			'''
			Fork «forkName» = new Fork («min», «max»);
			«FOR q : questions»«forkName».forkQues.add(«q.name»); «ENDFOR»
			«questionname».forks.add(«forkName»);
				
			'''
	}
	
	
	//multiple choice template
	def dispatch toTemplate(MultipleChoice it) {
			//name for the choice array
			var arrName = "arrMulti" + it.name

			'''
			ArrayList<Choice> «arrName» = new ArrayList<Choice>();
			«FOR c : it.choices»«toTemplate(c, arrName)»«ENDFOR»MultipleChoiceQuestion «it.name» = new MultipleChoiceQuestion ("«it.name»","«it.question»",«it.isRequired», "«it.other»", «arrName» );		

			questions.add(«it.name»);	
			
			'''
	}
	//choice template	
	def dispatch toTemplate(Choice it, String arrname) {
			
			'''
			«arrname».add(new Choice ("«it.name»","«it.description»")); 
			'''
	}
	//ranking question template
	def dispatch toTemplate(Ranking it) {
			//name for the choice array
			var arrName = "arrRank" + it.name

			'''
			ArrayList<Choice> «arrName» = new ArrayList<Choice>();
			«FOR c : it.choices» «toTemplate(c, arrName)»«ENDFOR»RankingQuestion «it.name» = new RankingQuestion ("«it.name»","«it.question»",«it.isRequired», «arrName»);
			
			questions.add(«it.name»);
			
			'''
	}
	//cosntantSum question template
	def dispatch toTemplate(ConstantSum it) {
			//name for the choice array
			var arrName = "arrConstSum" + it.name

			'''
			ArrayList<Choice> «arrName» = new ArrayList<Choice>();
			«FOR c : it.choices» «toTemplate(c, arrName)»«ENDFOR»ConstantSumQuestion «it.name» = new ConstantSumQuestion ("«it.name»","«it.question»",«it.isRequired», «it.constant»,«arrName» );

			questions.add(«it.name»);			

			'''
	}
	//rating question template
	def dispatch toTemplate(Rating it) {

				'''
				RatingQuestion «it.name» = new RatingQuestion ("«it.name»","«it.question» ",«it.isRequired», «it.min», «it.max», "«it.first»"," «it.last»");
				
				questions.add(«it.name»);				

				'''
	}
	//staple question template
	def dispatch toTemplate(Staple it) {
					'''
					StapleQuestion «it.name» = new StapleQuestion ("«it.name»","«it.question»",«it.isRequired»,"«it.first»", "«it.last»", "«it.mid»");
					
					questions.add(«it.name»);
				
					'''
	}
	
}
