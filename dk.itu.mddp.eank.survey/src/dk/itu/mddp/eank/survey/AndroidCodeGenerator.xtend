package dk.itu.mddp.eank.survey

import survey.SurveyPackage
import org.eclipse.emf.common.util.URI
import survey.Model
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.XtextResource
import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated
import survey.Survey
import survey.Open
import survey.Dichotomous
import survey.MultipleChoice
import survey.Ranking
import survey.Rating
import survey.Staple
import survey.Choice
import survey.ConstantSum
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import survey.Question
import java.util.List
import org.eclipse.emf.common.util.EList

class AndroidCodeGenerator{
	val static instanceFileName = "test-files/Tes.survey"

	// this method reads textual syntax and saves XMI syntax
	def static void main(String[] args) {

		// register our meta-model package for abstract syntax
		SurveyPackage.eINSTANCE.eClass

		val injector = new MyDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration
		val resourceSet = injector.getInstance(typeof(XtextResourceSet))
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, true);

		val uri = URI::createURI(instanceFileName)
		var resource = resourceSet.getResource(uri, true) /* true means follow proxies */

		val Model m = resource.getContents().get(0) as Model
		val questions = m.surveys.get(0).questions
		questions.forEach[changeChoices]
		println(toTemplate(m.surveys.get(0)).toString())


		//		if(Constraints.Constraint(m.surveys.get(0)))
		//			println("All constraints passed!")w
		//		else
		//			println("Constraints Failed")
		//		println(MyDslGenerator.compileToJava(m).toString().replaceAll("object", "Object"))
		val outputURI = URI.createFileURI("test-files/test-output.xmi")
		resource.URI = resource.resourceSet.getURIConverter.normalize(outputURI)
		resource.save(null)
	}
	
	def static dispatch changeChoices(Open it)
	{
		
	}
	def static dispatch changeChoices(Rating it)
	{
		
	}
	def static dispatch changeChoices(Staple it)
	{
		
	}
	def static dispatch changeChoices(MultipleChoice it)
	{
		fork.forEach[f | 
			choice.forEach[c | 
				if(f.on.exists[x | x.name == c.name])
				{
					f.on.remove(f.on.findFirst[x | x.name == c.name])
					f.on.add(c)
				}
			]
		]

	}
	def static dispatch changeChoices(ConstantSum it)
	{
		fork.forEach[f | 
			choices.forEach[c | 
				if(f.on.exists[x | x.name == c.name])
				{
					f.on.remove(f.on.findFirst[x | x.name == c.name])
					f.on.add(c)
				}
			]
		]
	}
	def static dispatch changeChoices(Ranking it)
	{
		fork.forEach[f | 
			choices.forEach[c | 
				if(f.on.exists[x | x.name == c.name])
				{
					f.on.remove(f.on.findFirst[x | x.name == c.name])
					f.on.add(c)
				}
			]
		]
	}

	
	def static dispatch toTemplate(Survey it) {
		'''
package com.smdp.surveytoandroid;

import java.util.ArrayList;

import com.smdp.surveytoandroid.questionstructure.Choice;
import com.smdp.surveytoandroid.questionstructure.DichotomousQuestion;
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

	def static dispatch toTemplate(Open it) {
				'''
				OpenQuestion «it.name» = new OpenQuestion ("«it.name»","«it.question»",«it.isRequired»);
				questions.add(«it.name»);			

				'''
	}

	def static dispatch toTemplate(Dichotomous it) {
				'''DichotomousQuestion «it.name» = new DichotomousQuestion ("«it.name»","«it.question»",«it.isRequired»);
questions.add(«it.name»);				
				
				'''
	}
		//multiple choice fork template	
		def static dispatch toTemplate(String forkname, String forkarrayname,  EList<Question> questions, String choicename, String questionname) {
			'''
			Fork «forkname» = new Fork ();
			ArrayList<Questionable> «forkarrayname» = new ArrayList<Questionable>();
			«FOR q : questions»«forkarrayname».add(«q.name»); «ENDFOR»
			«forkname».bindingChoiceQuest.put("«choicename»",«forkarrayname»);
			«questionname».forks.add(«forkname»);
				
			'''
	}
	
			//rank + sum const fork template
			def static dispatch toTemplate(String forkname, String forkarrayname,  EList<Question> questions, String choicename,String questionname, int min, int max) {
			'''
			Fork «forkname» = new Fork («min», «max»);
			ArrayList<Questionable> «forkarrayname» = new ArrayList<Questionable>();
			«FOR q : questions»«forkarrayname».add(«q.name»); «ENDFOR»
			«forkname».bindingChoiceQuest.put("«choicename»",«forkarrayname»);
			«questionname».forks.add(«forkname»);
				
			'''
	}
	
			//rate + staple fork template
			def static dispatch toTemplate(String forkname, String forkarrayname, EList<Question> questions,String questionname, int min, int max) {
			'''
			Fork «forkname» = new Fork («min», «max»);
			ArrayList<Questionable> «forkarrayname» = new ArrayList<Questionable>();
			«FOR q : questions»«forkarrayname».add(«q.name»); «ENDFOR»
			«forkname».forkQues.add(«forkarrayname»);
			«questionname».forks.add(«forkname»);
				
			'''
	}
	
	

	def static dispatch toTemplate(MultipleChoice it) {
			//name for the choice array
			var arrName = "arrMulti" + it.name
			//name for the specific fork
			var forkName = "fork" + it.name
			//name for fork array
			var forkArrName =  "forkArr" + it.name
			
			'''
			ArrayList<Choice> «arrName» = new ArrayList<Choice>();
			«FOR c : it.choice»«toTemplate(c, arrName)»«ENDFOR»MultipleChoiceQuestion «it.name» = new MultipleChoiceQuestion ("«it.name»","«it.question»",«it.isRequired», "«it.other»", «arrName» );		
			
			«FOR p:0..it.choice.size-1»		
			 «FOR q:0..(it.fork.size-1)» 
			 «IF (it.fork.get(q).on.contains(it.choice.get(p)))»«toTemplate(forkName,forkArrName,it.fork.get(q).questions,it.choice.get(p).name, it.name)» « ENDIF »«ENDFOR»
			«ENDFOR»
			questions.add(«it.name»);	
			
			'''
	}

		def static dispatch toTemplate(Choice it, String arrname) {
			
			'''
			«arrname».add(new Choice ("«it.name»","«it.description»")); 
			'''
	}
	
	def static dispatch toTemplate(Ranking it) {
			//name for the choice array
			var arrName = "arrRank" + it.name
			//name for the specific fork
			var forkName = "fork" + it.name
			//name for fork array
			var forkArrName =  "forkArr" + it.name
			'''
			ArrayList<Choice> «arrName» = new ArrayList<Choice>();
			«FOR c : it.choices» «toTemplate(c, arrName)»«ENDFOR»RankingQuestion «it.name» = new RankingQuestion ("«it.name»","«it.question»",«it.isRequired», «arrName»);
			
			«FOR p : choices»
			 «FOR q : fork»				
«««			 «FOR q:0..(it.fork.size-1)» 
			 «IF (q.on.contains(p))»
			 «toTemplate(forkName,forkArrName,q.questions,p.name, it.name, q.min, q.max)» 
			 « ENDIF »«ENDFOR»
			«ENDFOR»
			questions.add(«it.name»);
			
			'''
	}
		def static dispatch toTemplate(ConstantSum it) {
			//name for the choice array
			var arrName = "arrRank" + it.name
			//name for the specific fork
			var forkName = "fork" + it.name
			//name for fork array
			var forkArrName =  "forkArr" + it.name
			'''
			ArrayList<Choice> «arrName» = new ArrayList<Choice>();
			«FOR c : it.choices» «toTemplate(c, arrName)»«ENDFOR»SumConstantQuestion «it.name» = new SumConstantQuestion ("«it.name»","«it.question»",«it.isRequired», «it.constant»,«arrName» );
			 
«««			 «FOR p:0..it.choices.size-1»
			 «FOR p : choices»
			 «FOR q : fork»				
«««			 «FOR q:0..(it.fork.size-1)» 
			 «IF (q.on.contains(p))»«toTemplate(forkName,forkArrName,q.questions,p.name, it.name, q.min, q.max)» « ENDIF »«ENDFOR»
			«ENDFOR»
			questions.add(«it.name»);			

			'''
	}

	def static dispatch toTemplate(Rating it) {
				//name for the specific fork
				var forkName = "fork" + it.name
				//name for fork array
				var forkArrName =  "forkArr" + it.name
				'''
				RatingQuestion «it.name» = new RatingQuestion ("«it.name»","«it.question» ",«it.isRequired», «it.min», «it.max», "«it.first»"," «it.last»");
				«FOR q:0..(it.fork.size-1)» 
			 	«IF it.fork.size >0»«toTemplate(forkName,forkArrName,it.fork.get(q).questions, it.name,it.fork.get(q).min, it.fork.get(q).max)» « ENDIF »«ENDFOR»
				questions.add(«it.name»);				

				'''
	}

	def static dispatch toTemplate(Staple it) {
					//name for the specific fork
					var forkName = "fork" + it.name
					//name for fork array
					var forkArrName =  "forkArr" + it.name
					'''
					Staple «it.name» = new Staple ("«it.name»","«it.question»",«it.isRequired»,«it.min»,«it.max»,"«it.first»", "«it.last»", "«it.mid»");
					«FOR q:0..(it.fork.size-1)» 
			 		«IF it.fork.size >0»«toTemplate(forkName,forkArrName,it.fork.get(q).questions, it.name,it.fork.get(q).min, it.fork.get(q).max)» « ENDIF »«ENDFOR»
					questions.add(«it.name»);
				
					'''
	}
	
}
