package dk.itu.mddp.eank.survey

import survey.SurveyPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.XtextResource
import org.xtext.example.mydsl.generator.MyDslGenerator
import org.eclipse.emf.mwe.internal.core.ast.util.Injector
import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated
import java.util.HashMap
import org.eclipse.emf.common.util.EList
import java.util.List
import java.util.ArrayList
import survey.Question
import survey.Survey
import survey.Open
import survey.Rating
import survey.Staple
import survey.MultipleChoice
import survey.ConstantSum
import survey.Ranking
import survey.Fork

class CodeGenerator {
	val static instanceFileName = "test-files/Tes.survey"
	static var map = new HashMap<Question, Integer>();
	static var goToMap = new HashMap<Question, Integer>();
	static var next = new HashMap<Question, Integer>();
	static var usedList = new ArrayList<Integer>();
	
	// this method reads textual syntax and saves XMI syntax
	def static void main (String[] args) {
		
		// register our meta-model package for abstract syntax
		SurveyPackage.eINSTANCE.eClass
				
		val injector = new MyDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration
		val resourceSet = injector.getInstance(typeof(XtextResourceSet))
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, true);

		val uri = URI::createURI(instanceFileName)
		var resource = resourceSet.getResource(uri, true)			/* true means follow proxies */

		val Survey m = resource.getContents() as Survey
		val questions = m.questions
		
		//Changes all choices so they reference the correct ID within the question
		//Previously it would reference the first occurence of the choice with that name
		questions.forEach[changeChoices]

//		for(i: 0..questions.size-1)
//		{
//				map.put(questions.get(i), i)								
//		}
		questions.forEach[q, i | map.put(q,i)]
		questions.forEach[q | //parent question q
			var localQuestions = forkMap(q)
			
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
			var localQuestions = forkMap(q)
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
		println(toTemplate(m).toString())
//		if(Constraints.Constraint(m.surveys.get(0)))
//			println("All constraints passed!")w
//		else
//			println("Constraints Failed")
//		println(MyDslGenerator.compileToJava(m).toString().replaceAll("object", "Object"))

		if(Constraints.Constraint(m))
			println("All constraints passed!")
		else
			println("Constraints Failed")

		val outputURI = URI.createFileURI("test-files/test-output.xmi")
		resource.URI = resource.resourceSet.getURIConverter.normalize(outputURI)
		resource.save (null)
		 
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
		//Iterates all the forks and checks for their choices
		forks.forEach[f | 
			choice.forEach[c | 
				//When the forks's "on" contains the current choice with the same name 
				if(f.on.exists[x | x.name == c.name])
				{
					//it removes this choice 
					f.on.remove(f.on.findFirst[x | x.name == c.name])
					//and adds the choice that is within the question's choices
					f.on.add(c)
				}
			]
		]

	}
	def static dispatch changeChoices(ConstantSum it)
	{
		forks.forEach[f | 
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
		forks.forEach[f | 
			choices.forEach[c | 
				if(f.on.exists[x | x.name == c.name])
				{
					f.on.remove(f.on.findFirst[x | x.name == c.name])
					f.on.add(c)
				}
			]
		]
	}
	
		
	def static dispatch List<EList<Question>> forkMap(Open it)
	{		
			return null;
	}
	
	def static dispatch List<EList<Question>> forkMap(MultipleChoice it)
	{
			return it.forks.map[getQuestions]
	}
	def static dispatch List<EList<Question>> forkMap(Ranking it)
	{
			return it.forks.map[getQuestions]
	}
	def static dispatch List<EList<Question>> forkMap(Rating it)
	{		
			return it.forks.map[getQuestions]
	}
	def static dispatch List<EList<Question>> forkMap(ConstantSum it)
	{		
			return it.forks.map[getQuestions]
	}
	
	def static dispatch  List<EList<Question>> forkMap(Staple it)
	{		
			return it.forks.map[getQuestions]
	}
	
	def static List<EList<Question>> getQuestions(Fork it)
	{
			return questions.map[] 			
	}
	//***Code generation start
	
	
	def static dispatch toTemplate(Survey it)
	{				
		'''
		
		«FOR i:0..questions.size-1»
		«{ var to=goToMap.get(questions.get(i))
		toTemplate(questions.get(i), to);

		}»
		«ENDFOR»
		'''
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
		«FOR choice : it.choice »		      
			<div class="checkbox">
				<label>
					<input type="checkbox" name="« it.name »" id="option_« normalize(choice.name) »" value="«choice.description»" onClick="return Survey.changeSubmitButtonStatus(this);" data-next="«FOR fork : it.forks »« IF fork.on.contains(choice) »« map.get(fork.questions.get(0)) + 1 »« ENDIF »«ENDFOR»" /> « choice.description»
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
		«FOR choice : choices»
				<div class="form-group">
					<label for="ranking_«normalize(choice.name)»" class="col-xs-9 control-label">«choice.description»</label>
					<div class="col-xs-3">
						<input type="number" class="form-control rating" id="ranking_«normalize(choice.name)»" maxlength="2" onkeyup="return « IF it.forks.size > 0 && it.forks.exists[f | f.on.contains(choice)] »Fork.calculate(this, 'ranking_«normalize(choice.name)»')« ELSE »Survey.rankingUpdate(this)« ENDIF »;" data-next="" />
					</div>
				</div>
		«ENDFOR»
			</div>
			<button type="button" class="btn btn-primary btn-sm btn-block"« IF (it.isRequired) » disabled="disabled"« ENDIF » name="submitQuestion" onclick="return Survey.saveAnswerData('#« normalize(it.name) »', « to »);">
				Next Question <span class="glyphicon glyphicon-chevron-right"></span>
			</button>
		</form>
		
		« IF it.forks.size > 0»
		<script type="text/javascript">
		var Fork = Fork || {};
		Fork = (function(){
		  return {
		    calculate: function(input, targetid)
		    {
		      // Get the field object
		      var numberField = (typeof input !== 'undefined' ? jQuery(input) : false);
		
		      if(numberField !== false)
		      {
		        // Actul inout value
		        var value = numberField.val();
				« FOR forks : it.forks »
				« IF forks.questions.size > 0»
				if (Survey.isBetween(value, « forks.min », « forks.max »)) {
					numberField.attr(Survey.SURVEY_FORK_SEL, '« forks.questions.join(",", [q | toInt(q.name)]) »');
				}
				« ENDIF »
		        « ENDFOR »
		        numberField.on('keyup keypress blur change', function() {
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
					<input type="number" class="form-control rating" id="sum_« normalize(choice.name) »" maxlength="3" onkeyup="return « IF it.forks.size > 0 && it.forks.exists[f | f.on.contains(choice)] »Fork.calculate(this, 'sum_«normalize(choice.name)»')« ELSE »Survey.constantSumUpdate(this)« ENDIF »;" name="sum_« normalize(choice.name) »" data-next="" />
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
		
		« IF it.forks.size > 0»
		<script type="text/javascript">
		var Fork = Fork || {};
		Fork = (function(){
		  return {
		    calculate: function(input, targetid)
		    {
		      // Get the field object
		      var numberField = (typeof input !== 'undefined' ? jQuery(input) : false);
		
		      if(numberField !== false)
		      {
		        // Actul inout value
		        var value = numberField.val();
				« FOR forks : it.forks »
				« IF forks.questions.size > 0»
				if (Survey.isBetween(value, « forks.min », « forks.max »)) {
					numberField.attr(Survey.SURVEY_FORK_SEL, '« forks.questions.join(",", [q | toInt(q.name)]) »');
				}
				« ENDIF »
		        « ENDFOR »
		        numberField.on('keyup keypress blur change', function() {
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