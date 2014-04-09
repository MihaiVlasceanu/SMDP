package dk.itu.mddp.eank.survey

import survey.SurveyPackage
import org.eclipse.emf.common.util.URI
import survey.Model
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.XtextResource
import org.xtext.example.mydsl.generator.MyDslGenerator
import org.eclipse.emf.mwe.internal.core.ast.util.Injector
import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated
import survey.Survey
import survey.Question
import survey.Open
import survey.Dichotomous
import survey.MultipleChoice
import survey.Ranking
import survey.Rating
import survey.Staple
import java.util.HashMap
import org.eclipse.emf.common.util.EList
import java.util.List
import java.util.ArrayList
import survey.Fork

class HTMLGenerator {
	val static instanceFileName = "test-files/Tes.survey"
	// this method reads textual syntax and saves XMI syntax
	def static void main (String[] args) {
		
		// register our meta-model package for abstract syntax
		SurveyPackage.eINSTANCE.eClass
				
		val injector = new MyDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration
		val resourceSet = injector.getInstance(typeof(XtextResourceSet))
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, true);

		val uri = URI::createURI(instanceFileName)
		var resource = resourceSet.getResource(uri, true)			/* true means follow proxies */

		val Model m = resource.getContents().get(0) as Model
		val questions = m.surveys.get(0).questions
		for(i: 0..questions.size-1)
		{
				map.put(questions.get(i), i)								
		}
		for(i: 0..questions.size-1)
		{
			
			if(!goToMap.containsKey(questions.get(i)))
				{
					var localQuestions = forkMap(questions.get(i))
					if(localQuestions!=null && localQuestions.size>0)
					{
						for(q: 0..localQuestions.size-1)
						{
						
							for(p:0..localQuestions.get(q).size-1)
							{
								if(p+1!=localQuestions.get(q).size-1)
								{
									goToMap.put(localQuestions.get(q).get(p),p+1)																	
									usedList.add(p+1)
								}								
							}														
						}
					}
									
				}					
		}
		var  goToMap2 =goToMap;
		println(goToMap2.get(1))
		println(toTemplate(m.surveys.get(0)).toString())
//		if(Constraints.Constraint(m.surveys.get(0)))
//			println("All constraints passed!")w
//		else
//			println("Constraints Failed")
//		println(MyDslGenerator.compileToJava(m).toString().replaceAll("object", "Object"))
		val outputURI = URI.createFileURI("test-files/test-output.xmi")
		resource.URI = resource.resourceSet.getURIConverter.normalize(outputURI)
		resource.save (null)
		 
	}
	
	static var  map = new HashMap<Question, Integer>();
	static var  goToMap = new HashMap<Question, Integer>();
	static var  usedList = new ArrayList<Integer>();
		
	def static dispatch List<EList<Question>> forkMap(Open it)
	{		
			return null;
	}

	def static dispatch ArrayList<EList<Question>> forkMap(Dichotomous it)
	{			
			return null; 
		
		
	}
	def static dispatch List<EList<Question>> forkMap(MultipleChoice it)
	{
			return it.fork.map[getQuestions]
	}
	def static dispatch List<EList<Question>> forkMap(Ranking it)
	{
			return it.fork.map[getQuestions]
	}
	def static dispatch List<EList<Question>> forkMap(Rating it)
	{		
			return it.fork.map[getQuestions]
	}
	
	def static dispatch  List<EList<Question>> forkMap(Staple it)
	{		
			return it.fork.map[getQuestions]
	}
	
	def static List<EList<Question>> getQuestions(Fork it)
	{
			return questions.map[] 			
	}
	//***Code generation start
	
	
	def static dispatch toTemplate(Survey it)
	{				
		var to =0;
		'''«FOR i:0..questions.size-1»
		
		«{ to=i+1;
		if(goToMap.containsKey(it)){
			to=goToMap.get(it);
		}
		else{
			 while(!usedList.contains(to))
			 {
			 	to=to+1;	
			 }
			 
		 }
		}
		»
		«toTemplate(questions.get(i),i, to)»
		
		
		«ENDFOR»'''
	} 
	
	def static dispatch toTemplate(Open it, int i, int to)
	{
		
		
		'''
		<form method='POST' action='' id='form-survey-question_«i»' class='smdp' autocomplete='off' role='form'>
			<div class="question_container">
			<h3 class="smdp_question">«it.question»</h3>
			</div>
		   <div class="options_container">
		     <textarea class="form-control" rows="3" cols="40" name="comments" onkeyup="return Survey.validateTextarea(this);"></textarea>
		   </div>
      		<button type="button" class="btn btn-primary btn-sm btn-block" disabled="disabled" name="submitQuestion" onclick="return Survey.saveAnswerData('#form-survey-question_«i»', «to»);">Next Question <span class="glyphicon glyphicon-chevron-right"></span></button>
		</form>	
		'''				
	}

	def static dispatch toTemplate(Dichotomous it, int i, int to)
	{
		var nextNoQuestions = ""
		if(it.onNo!==null && it.onNo.questions!=null){
			for(p: 0..it.onNo.questions.size-1)
			{
						var to2 =map.get(it.onNo.questions.get(p))
						nextNoQuestions=nextNoQuestions+","+to2												
			}
			nextNoQuestions=nextNoQuestions.substring(1);
		}
		
		
		var nextYesQuestions = ""
		if(it.onYes!==null && it.onYes.questions!=null){
			for(p: 0..it.onYes.questions.size-1)
			{
						nextYesQuestions=nextYesQuestions+","+map.get(it.onYes.questions.get(p))
			}
			nextYesQuestions=nextYesQuestions.substring(1);
		}
		
		'''
		<form method="POST" action="" id="form-survey-question_«i»" class="smdp" autocomplete="off" role="form">
			<div class="question_container">
		     <h3 class="smdp_question">«it.question»</h3>
		   </div>
		   <div class="options_container">
		     <div class="radio">
		       <label>
		         <input type="radio" name="student" id="student_yes" value="yes" onClick="return Survey.changeSubmitButtonStatus(this); data-next="«nextYesQuestions»" />
		         Yes
		       </label>
		     </div>
		
		     <div class="radio">
		       <label>
		         <input type="radio" name="student" id="student_no" value="no" onClick="return Survey.changeSubmitButtonStatus(this);" data-next="«nextNoQuestions»" />
		         No
		       </label>
		     </div>

      		</div>
      		<button type="button" class="btn btn-primary btn-sm btn-block" disabled="disabled" name="submitQuestion" onclick="return Survey.saveAnswerData('#form-survey-question_«i»',«goToMap.get(it)»);">Next Question <span class="glyphicon glyphicon-chevron-right"></span></button>
		</form>
'''
		
		
	}
	def static dispatch toTemplate(MultipleChoice it, int i, int to)
	{
		'''«it.question»'''
		}
	def static dispatch toTemplate(Ranking it, int i, int to)
	{
			'''«it.question»'''
	}
	def static dispatch toTemplate(Rating it, int i, int to)
	{
			'''«it.question»'''
	}
	def static dispatch toTemplate(Staple it, int i, int to)
	{
			'''«it.question»'''
	}
}

