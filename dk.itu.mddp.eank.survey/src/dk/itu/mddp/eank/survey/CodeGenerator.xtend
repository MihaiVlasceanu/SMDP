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

class CodeGenerator {
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
						
							for(p:0..localQuestions.get(q).size-1)//specific fork
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
		
		'''«FOR i:0..questions.size-1»
		
		«{ var to=i+1;
		if(goToMap.containsKey(questions.get(i))){
			to=goToMap.get(questions.get(i));
		}
		else{
			  while(usedList.contains(to))
			  {
			  	to=to+1;	
			  }
			  
		  }
		
		
		toTemplate(questions.get(i),i, to)
		}
		»
		
		
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
		'''Not Implemented'''
		
		
	}
	def static dispatch toTemplate(MultipleChoice it, int i, int to)
	{
		'''
				<form method="POST" action="" id="form-survey-question_1" class="smdp" autocomplete="off" role="form">
		    <div class="question_container">
		      <h3 class="smdp_question">«it.question»</h3>
		    </div>
		    <div class="options_container">
		  
		      «FOR p:0..it.choice.size-1»		      
					<div class="checkbox">
						<label>
							<input type="checkbox" name="«it.choice.get(p).description»" id="option_«it.choice.get(p).description»" value="«it.choice.get(p).description»" onClick="return Survey.changeSubmitButtonStatus(this); data-next="«
									»«FOR q:0..it.fork.size-1»«
		      							»«if(fork.get(q).on.contains(it.choice.get(p))){map.get(fork.get(q).questions.get(0))}»«

		      						»«ENDFOR»" />
		    	      			«it.choice.get(p).description»
						</label>
					</div>
			«ENDFOR»
			«if(it.other!=null && !it.other.equals(""))
			{				
				  "<div class='checkbox'>"+
			        "<label class='other''>"+
			          "<input type='checkbox' name='Other' id='option_other' value='other' onClick='return Survey.changeSubmitButtonStatus(this);' />"+
			          it.other+ 
			        "</label>"+
			        "<input type='text' class='form-control other' id='optionsRadios2' maxlength='30' data-for='#option_other' onClick='Survey.updateOther(this);' />"+
			      "</div>"+		
		      "</div>"
			}
				»
			    
		      <button type="button" class="btn btn-primary btn-sm btn-block" disabled="disabled" name="submitQuestion" onclick="return Survey.saveAnswerData('#form-survey-question_«i»', «to»);">Next Question <span class="glyphicon glyphicon-chevron-right"></span></button>
		</form>
				
		'''
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