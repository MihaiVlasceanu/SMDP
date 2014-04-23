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
import survey.MultipleChoice
import survey.Ranking
import survey.Rating
import survey.Staple
import java.util.HashMap
import org.eclipse.emf.common.util.EList
import java.util.List
import java.util.ArrayList
import survey.Fork
import survey.ConstantSum

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
//		for(i: 0..questions.size-1)
//		{
//				map.put(questions.get(i), i)								
//		}
		questions.forEach[q, i | map.put(q,i)]
		questions.forEach[q |
			var localQuestions = forkMap(q)
			if(localQuestions != null)
			{
				localQuestions.forEach[localQuestion |
					localQuestion.forEach[forkQuestion |
						usedList.add(map.get(forkQuestion))
						
					]
				]
			}
		]
//		for(i: 0..questions.size-1)
//		{
//			
//					var localQuestions = forkMap(questions.get(i))
//					if(localQuestions!=null){
//						for(q: 0..localQuestions.size)					
//						{
//							if(q!=localQuestions.size)
//							{
//								for(p: 0..localQuestions.get(q).size)
//								{
//									if(p!=localQuestions.get(q).size)
//									{
//										usedList.add(map.get(localQuestions.get(q).get(p)));	
//									}
//								}
//							}
//						}						
//						
//					}									
//		}		
		
		var  goToMap2 =goToMap;
		println(toTemplate(m.surveys.get(0)).toString())
//		if(Constraints.Constraint(m.surveys.get(0)))
//			println("All constraints passed!")w
//		else
//			println("Constraints Failed")
//		println(MyDslGenerator.compileToJava(m).toString().replaceAll("object", "Object"))

		if(Constraints.Constraint(m.surveys.get(0)))
			println("All constraints passed!")
		else
			println("Constraints Failed")

		val outputURI = URI.createFileURI("test-files/test-output.xmi")
		resource.URI = resource.resourceSet.getURIConverter.normalize(outputURI)
		resource.save (null)
		 
	}

	
	static var map = new HashMap<Question, Integer>();
	static var goToMap = new HashMap<Question, Integer>();
	static var usedList = new ArrayList<Integer>();
		
	def static dispatch List<EList<Question>> forkMap(Open it)
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
	def static dispatch List<EList<Question>> forkMap(ConstantSum it)
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
		//var toto = 0;
		'''«FOR i:0..questions.size-1»
		
		«{ var to=i+1;		
		  while(usedList.contains(to))
		  {
		  	to=to+1;	
		  }

		
		
		toTemplate(questions.get(i), to)

		}
		
		
		»
		
		
		«ENDFOR»'''
	} 
	

		
	

	/**
	 * HTML generator for the Open type question
	 */
	def static dispatch toTemplate(Open it, int to)

	{
		'''
		<form method="POST" action="" id="« normalize(it.name) »" class="smdp« IF (it.isRequired) » required« ENDIF »" autocomplete="off" role="form">
			<div class="question_container">
			<h3 class="smdp_question">«it.question»</h3>
			</div>
		    <div class="options_container">
		      <textarea class="form-control" rows="5" cols="40" name="« normalize(it.name) »" onkeyup="return Survey.validateTextarea(this);"></textarea>
		    </div>
		<button type="button" class="btn btn-primary btn-sm btn-block"« IF (it.isRequired) » disabled="disabled"« ENDIF » name="submitQuestion" onclick="return Survey.saveAnswerData('#« normalize(it.name) »', «to»);">Next Question <span class="glyphicon glyphicon-chevron-right"></span></button>
		</form>	
		'''				
	}

	/**
	 * HTML generator for the MultipleChoice question type
	 */
	def static dispatch toTemplate(MultipleChoice it, int to)
	{
		'''
		<form method="POST" action="" id="« normalize(it.name) »" class="smdp« IF (it.isRequired) » required« ENDIF »" autocomplete="off" role="form">
		<div class="question_container">
		      <h3 class="smdp_question">«it.question»</h3>
		</div>
		<div class="options_container">
		«FOR p:0..it.choice.size-1»		      
			<div class="checkbox">
				<label>
					<input type="checkbox" name="« it.name »" id="option_« normalize(it.choice.get(p).name) »" value="«it.choice.get(p).description»" onClick="return Survey.changeSubmitButtonStatus(this);" data-next="«FOR q:0..(it.fork.size-1) »« IF (it.fork.get(q).on.contains(it.choice.get(p))) »« map.get(fork.get(q).questions.get(0)) + 1 »« ENDIF »«ENDFOR»" /> «it.choice.get(p).description»
				</label>
			</div>
		«ENDFOR»
		« IF it.other != null && !it.other.equals("")»
			<div class="checkbox">
				<label class="other">
					<input type="checkbox" name="« normalize(it.other) »" id="option_« normalize(it.other) »" value="« normalize(it.other) »" onClick="return Survey.changeSubmitButtonStatus(this);' />
		  			« it.other »
				</label>
				<input type="text" class="form-control other" id='« normalize(it.other) »' maxlength='30' data-for="#option_« normalize(it.other) »" onClick='Survey.updateOther(this);' />"
			</div>
		« ENDIF »
			</div>
			<button type="button" class="btn btn-primary btn-sm btn-block"« IF (it.isRequired) » disabled="disabled"« ENDIF » name="submitQuestion" onclick="return Survey.saveAnswerData('#« normalize(it.name) »', «to»);">Next Question <span class="glyphicon glyphicon-chevron-right"></span></button>
		</form>
		'''
	}
	
	/**
	 * HTML generator for the Ranking question type
	 */
	def static dispatch toTemplate(Ranking it, int to)
	{
			'''
			<form method="POST" action="" id="« normalize(it.name) »" class="smdp« IF (it.isRequired) » required« ENDIF »" autocomplete="off" role="form">
				<div class="question_container">
					<h3 class="smdp_question">« it.question »</h3>
				</div>
				<div class="options_container">
			«FOR p:0..it.choices.size-1»
					<div class="form-group">
						<label for="ranking_«normalize(it.choices.get(p).name)»" class="col-xs-9 control-label">«it.choices.get(p).description»</label>
						<div class="col-xs-3">
							<input type="number" class="form-control rating" id="ranking_«normalize(it.choices.get(p).name)»" maxlength="2" onkeyup="return « IF it.fork.size > 0»Fork.calculate.constantSumUpdate« ELSE »Survey.constantSumUpdate« ENDIF »(this);" name="rating_«normalize(it.choices.get(p).name)»" data-next="«FOR q:0..(it.fork.size-1) »« IF (it.fork.get(q).on.contains(it.choices.get(p))) »« map.get(fork.get(q).questions.get(0)) + 1 »« ENDIF »«ENDFOR»" />
						</div>
					</div>
			«ENDFOR»
				</div>
				<button type="button" class="btn btn-primary btn-sm btn-block"« IF (it.isRequired) » disabled="disabled"« ENDIF » name="submitQuestion" onclick="return Survey.saveAnswerData('#« normalize(it.name) »', « to »);">
					Next Question <span class="glyphicon glyphicon-chevron-right"></span>
				</button>
			</form>
			
			« IF it.fork.size > 0»
			<script type="text/javascript">
				var Fork = Fork || {};
				Fork = (function(){
				  return {
				    calculate: function(input)
				    {
				      // Get the field object
				      var numberField = (typeof input !== 'undefined' ? jQuery(input) : false);
				
				      if(numberField !== false)
				      {
				        // Actul inout value
				        var value = numberField.val();
						« FOR p : 0.. (it.fork.size - 1) »
						if (Survey.isBetween(value, « it.fork.get(p).min », « it.fork.get(p).max »)) {
							numberField.attr(Survey.SURVEY_FORK_SEL, « toInt(it.fork.get(p).questions.get(0).name) »);
						}
				        « ENDFOR »
				        numberField.on('keyUp', function() {
				          return Survey.rankingUpdate(this);
				        });
				      }
				    }
				  }
				})(jQuery);
			</script>
			« ENDIF »
			'''
	}
	def static dispatch toTemplate(Rating it, int to)
	{
					'''
			<form method="POST" action="" id="« normalize(it.name) »" class="smdp« IF (it.isRequired) » required« ENDIF »" autocomplete="off" role="form">
			<div class="question_container">
				<h3 class="smdp_question">«it.question»</h3>
			</div>
			<div class="options_container">
				<table class="table table-striped table-bordered table-condensed">
					<tr>
		    		«FOR p: it.min..it.max»
					«IF(p>0)»<th>(+«p») «IF(p==it.max)»«it.last»«ENDIF»«IF(p==it.min)»«it.first»«ENDIF»</th>«ENDIF»
					«IF(p<0)»<th>(«p») «IF(p==it.max)»«it.last»«ENDIF»«IF(p==it.min)»«it.first»«ENDIF»</th>«ENDIF»
					«ENDFOR»
					</tr>
					<tr>«FOR p:it.min..it.max-1»
						<td>
							<label class="radio-inline">
							  	<input type="radio" id="option_«p»" name="option_« it.name »" value="«p»" onclick="return Survey.ratingUpdate(this);">
							</label>
						</td>
						«ENDFOR»
					</tr>
				</table>
			</div>
			<button type="button" class="btn btn-primary btn-sm btn-block"« IF (it.isRequired) » disabled="disabled"« ENDIF » name="submitQuestion" onclick="return Survey.saveAnswerData('#« normalize(it.name) »', «to»);">Next Question <span class="glyphicon glyphicon-chevron-right"></span></button>
			</form>
			'''
	}
	

	def static dispatch toTemplate(ConstantSum it, int to)
	{
		'''
		<form method="POST" action="" id="« normalize(it.name) »" class="smdp« IF (it.isRequired) » required« ENDIF »" autocomplete="off" role="form" data-href="«it.constant»">
		<div class="question_container">
			<h3 class="smdp_question">« it.question »</h3>
		</div>
		<div class="options_container">
	    «FOR choice : choices»
			<div class="form-group">
				<label class="col-xs-8 control-label">«choice.description»</label>
		        <div class="col-xs-4">
		          <input type="number" class="form-control rating" id="« it.name »" maxlength="3" onkeyup="return « IF it.fork.size > 0»Fork.calculate.constantSumUpdate« ELSE »Survey.constantSumUpdate« ENDIF »(this);" name="sum_« normalize(choice.name) »" />
		        </div>
		      </div>
		«ENDFOR»
		      <div class="form-group">
		        <label class="col-xs-3 control-label label-total">« it.constant »</label>
		      </div>
			</div>
		    <button type="button" class="btn btn-primary btn-sm btn-block"« IF (it.isRequired) » disabled="disabled"« ENDIF » name="submitQuestion" onclick="return Survey.saveAnswerData('#« normalize(it.name) »', «to»);">Next Question <span class="glyphicon glyphicon-chevron-right"></span></button>
		</div>
		</form>
		
		« IF it.fork.size > 0»
		<script type="text/javascript">
				var Fork = Fork || {};
				Fork = (function(){
				  return {
				    calculate: function(input)
				    {
				      // Get the field object
				      var numberField = (typeof input !== 'undefined' ? jQuery(input) : false);
				
				      if(numberField !== false)
				      {
				        // Actul inout value
				        var value = numberField.val();
						« FOR p : 0.. (it.fork.size - 1) »
						if (Survey.isBetween(value, « it.fork.get(p).min », « it.fork.get(p).max »)) {
							numberField.attr(Survey.SURVEY_FORK_SEL, « toInt(it.fork.get(p).questions.get(0).name) »);
						}
				        « ENDFOR »
				        numberField.on('keyUp', function() {
				          return Survey.constantSumUpdate(this);
				        });
				      }
				    }
				  }
				})(jQuery);
			</script>
		« ENDIF »
		'''
	}	
	
	/**
	 * Generator for the Staple question
	 */
	def static dispatch toTemplate(Staple it, int to)
	{
			'''
			<form method="POST" action="" id="« normalize(it.name) »" class="smdp« IF (it.isRequired) » required« ENDIF »" autocomplete="off" role="form">
			<div class="question_container">
				<h3 class="smdp_question">«it.question»</h3>
			</div>
			<div class="options_container">
				<table class="table table-striped table-bordered table-condensed">
					<tr>
		    		«FOR p: it.min..it.max»
					«IF(p>0)»<th>(+«p») «IF(p==it.max)»«it.last»«ENDIF»«IF(p==it.min)»«it.first»«ENDIF»</th>«ENDIF»
					«IF(p==((it.max+it.min)/2))»<th>«it.mid»</th>«ENDIF»
					«IF(p<0)»<th>(«p») «IF(p==it.max)»«it.last»«ENDIF»«IF(p==it.min)»«it.first»«ENDIF»</th>«ENDIF»
					«ENDFOR»
					</tr>
					<tr>«FOR p:it.min..it.max»
						<td>
							<label class="radio-inline">
							  	<input type="radio" id="option_«p»" name="option_« it.name »" value="«p»" onclick="return Survey.ratingUpdate(this);">
							</label>
						</td>
						«ENDFOR»
					</tr>
				</table>
			</div>
			<button type="button" class="btn btn-primary btn-sm btn-block"« IF (it.isRequired) » disabled="disabled"« ENDIF » name="submitQuestion" onclick="return Survey.saveAnswerData('#« normalize(it.name) »', «to»);">Next Question <span class="glyphicon glyphicon-chevron-right"></span></button>
			</form>
			'''
	}
	
	/**
	 * Removes all non-alphanumeric characters in a string
	 */
	def static normalize(String string) {
		string.replaceAll("(^[^a-zA-Z])*(\\W+)", "")
	}
	
	def static toInt(String name)
	{
		name.replaceAll("([^0-9])*", "")
	}

}