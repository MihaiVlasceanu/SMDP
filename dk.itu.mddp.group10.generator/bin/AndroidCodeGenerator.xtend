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
		import com.smdp.surveytoandroid.questionstructure.SumConstantQuestion;
		import com.smdp.surveytoandroid.questionstructure.Staple;
		import com.smdp.surveytoandroid.questionstructure.Survey;
		
		public class CodeGenData {
			
			private static ArrayList<Questionable> questions = new ArrayList<Questionable>();
		
			public static ArrayList<Questionable> addQuestionsToArrList() {
		
				Survey «it.name» = new Survey ("«it.name»");
				
				«FOR question : it.questions»«toTemplate(question)»«ENDFOR»
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
	def dispatch toTemplate(String forkname, String forkarrayname,  EList<Question> questions, String choicename, String questionname) {
			'''
			Fork «forkname» = new Fork();
			ArrayList<Questionable> «forkarrayname» = new ArrayList<Questionable>();
			«FOR q : questions»«forkarrayname».add(«q.name»); «ENDFOR»
			«forkname».bindingChoiceQuest.put("«choicename»",«forkarrayname»);
			«questionname».forks.add(«forkname»);
				
			'''
	}
	
	//rank + sum constant forks template
	def dispatch toTemplate(String forkname, String forkarrayname,  EList<Question> questions, String choicename,String questionname, int min, int max) {
			'''
			Fork «forkname» = new Fork(«min», «max»);
			ArrayList<Questionable> «forkarrayname» = new ArrayList<Questionable>();
			«FOR q : questions»«forkarrayname».add(«q.name»); «ENDFOR»
			«forkname».bindingChoiceQuest.put("«choicename»",«forkarrayname»);
			«questionname».forks.add(«forkname»);
				
			'''
	}
	
	//rate + staple forks template
	def dispatch toTemplate(String forkname, String forkarrayname, EList<Question> questions,String questionname, int min, int max) {
			'''
			Fork «forkname» = new Fork («min», «max»);
			ArrayList<Questionable> «forkarrayname» = new ArrayList<Questionable>();
			«FOR q : questions»«forkarrayname».add(«q.name»); «ENDFOR»
			«forkname».forkQues.add(«forkarrayname»);
			«questionname».forks.add(«forkname»);
				
			'''
	}
	
	
	//multiple choice template
	def dispatch toTemplate(MultipleChoice it) {
			//name for the choice array
			var arrName = "arrMulti" + it.name
			//name for the specific forks
			var forkName = it.name.toLowerCase + "ForkId"
			//name for forks array 
			var forkArrName = it.name.toLowerCase + "ForkArrId"
			'''
			ArrayList<Choice> «arrName» = new ArrayList<Choice>();
			«FOR c : it.choices»«toTemplate(c, arrName)»«ENDFOR»MultipleChoiceQuestion «it.name» = new MultipleChoiceQuestion ("«it.name»","«it.question»",«it.isRequired», "«it.other»", «arrName» );		
			
			«FOR p : choices»
			 «FOR q : forks»		 				
			 «IF (q.on.contains(p))»
			 «toTemplate(forkName,forkArrName,q.questions,p.name, it.name)» 
			 « ENDIF »«ENDFOR»
			«ENDFOR»
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
			//name for the specific forks 
			var forkName = it.name.toLowerCase + "ForkId"
			//name for forks array
			var forkArrName = it.name.toLowerCase + "ForkArrId"
			'''
			ArrayList<Choice> «arrName» = new ArrayList<Choice>();
			«FOR c : it.choices» «toTemplate(c, arrName)»«ENDFOR»
			RankingQuestion «it.name» = new RankingQuestion ("«it.name»","«it.question»",«it.isRequired», «arrName»);
			«FOR p : choices»
			 «FOR q : forks»				
			 «IF (q.on.contains(p))»
			 «toTemplate(forkName + forks.indexOf(q),forkArrName,q.questions,p.name, it.name, q.min, q.max)» 
			 « ENDIF »«ENDFOR»
			«ENDFOR»
			questions.add(«it.name»);
			
			'''
	}
	//cosntantSum question template
	def dispatch toTemplate(ConstantSum it) {
			//name for the choice array
			var arrName = "arrConstSum" + it.name
			//name for the specific forks 
			var forkName = it.name.toLowerCase + "ForkId"
			//name for forks array
			var forkArrName = it.name.toLowerCase + "ForkArrId"
			'''
			ArrayList<Choice> «arrName» = new ArrayList<Choice>();
			«FOR c : it.choices» «toTemplate(c, arrName)»«ENDFOR»ConstantSumQuestion «it.name» = new ConstantSumQuestion ("«it.name»","«it.question»",«it.isRequired», «it.constant»,«arrName» );
			 
			«FOR p : choices»
			 «FOR q : forks»				
			 «IF (q.on.contains(p))»«toTemplate(forkName + forks.indexOf(q),forkArrName,q.questions,p.name, it.name, q.min, q.max)»
			 « ENDIF »«ENDFOR»
			«ENDFOR»
			questions.add(«it.name»);			

			'''
	}
	//rating question template
	def dispatch toTemplate(Rating it) {
			var forkName = it.name.toLowerCase + "ForkId"
			var forkArrName = it.name.toLowerCase + "ForkArrId"
			'''
			RatingQuestion «it.name» = 
			new RatingQuestion ("«it.name»","«it.question» ",«it.isRequired», «it.min», «it.max», "«it.first»"," «it.last»");
			«FOR q : forks»	
			 «IF (it.forks.size >0)»«toTemplate(forkName,forkArrName,q.questions, it.name, q.min, q.max)»
			 « ENDIF »«ENDFOR»
			questions.add(«it.name»);'''
	}
	//staple question template
	def dispatch toTemplate(Staple it) {
			//name for the specific forks 
			var forkName = it.name.toLowerCase + "ForkId"
			//name for forks array
			var forkArrName = it.name.toLowerCase + "ForkArrId"
					'''
					Staple «it.name» = new Staple ("«it.name»","«it.question»",«it.isRequired»,"«it.first»", "«it.last»", "«it.mid»");
					
					«FOR q : forks»	
					 «IF (it.forks.size >0)»«toTemplate(forkName,forkArrName,q.questions, it.name, q.min, q.max)»
				 	 « ENDIF »«ENDFOR»
					questions.add(«it.name»);
				
					'''
	}
	
}
