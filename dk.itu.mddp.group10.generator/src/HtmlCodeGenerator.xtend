import survey.Survey
import survey.Open
import survey.MultipleChoice
import survey.Ranking
import survey.Rating
import survey.ConstantSum
import survey.Staple
import java.util.HashMap
import survey.Questionimport java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter

class HtmlCodeGenerator extends CodeGenerator 
{
	new(HashMap<Question, Integer> goToMap, HashMap<Question, Integer> questionMap)
	{
		super(goToMap, questionMap)
	}
	/**
	 * HTML generator for the Open type question
	 */
	def String getTemplate(Survey it)
	{
		'''
		«questions.forEach[question |
				var to=goToMap.get(question)
				toTemplate(question, to)
			]»
			
		'''
		
	}
	override void generate(Survey it)
	{
		questions.forEach[question |
			var to=goToMap.get(question)
			saveResource(it, question, toTemplate(question, to))
			println(toTemplate(question,to))
		]
		
		generateHtmlIndex(it)
	}
	
	def dispatch toTemplate(Open it, int to)

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
	def dispatch toTemplate(MultipleChoice it, int to)
	{
		'''
		<form method="POST" action="" id="« normalize(it.name) »" class="smdp« IF (it.isRequired) » required« ENDIF »" autocomplete="off" role="form">
		<div class="question_container">
		      <h3 class="smdp_question">«it.question»</h3>
		</div>
		<div class="options_container">
		«FOR choice : it.choices »		      
			<div class="checkbox">
				<label>
					<input type="checkbox" name="« it.name »" id="option_« normalize(choice.name) »" value="«choice.description»" onClick="return Survey.changeSubmitButtonStatus(this);" data-next="«FOR fork : it.forks »« IF fork.on.contains(choice) »« questionMap.get(fork.questions.get(0)) + 1 »« ENDIF »«ENDFOR»" /> « choice.description»
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
	def dispatch toTemplate(Ranking it, int to)
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
				« FOR fork : it.forks »
				« IF fork.questions.size > 0»
				if (Survey.isBetween(value, « fork.min », « fork.max »)) {
					numberField.attr(Survey.SURVEY_FORK_SEL, '« fork.questions.join(",", [q | toInt(q.name)]) »');
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
	def dispatch toTemplate(Rating it, int to)
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
	

	def dispatch toTemplate(ConstantSum it, int to)
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
				« FOR fork : it.forks »
				« IF fork.questions.size > 0»
				if (Survey.isBetween(value, « fork.min », « fork.max »)) {
					numberField.attr(Survey.SURVEY_FORK_SEL, '« fork.questions.join(",", [q | toInt(q.name)]) »');
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
	def dispatch toTemplate(Staple it, int to)
	{
			'''
			<form method="POST" action="" id="« normalize(it.name) »" class="smdp« IF (it.isRequired) » required« ENDIF »" autocomplete="off" role="form">
			<div class="question_container">
				<h3 class="smdp_question">«it.question»</h3>
			</div>
			<div class="options_container">
				<table class="table table-striped table-bordered table-condensed">
					<tr>
		    		«FOR p: -5..5»
					«IF(p>0)»<th>(+«p») «IF(p==5)»«it.last»«ENDIF»«IF(p==-5)»«it.first»«ENDIF»</th>«ENDIF»
					«IF(p==((0)))»<th>«it.mid»</th>«ENDIF»
					«IF(p<0)»<th>(«p») «IF(p==5)»«it.last»«ENDIF»«IF(p==-5)»«it.first»«ENDIF»</th>«ENDIF»
					«ENDFOR»
					</tr>
					<tr>«FOR p:-5..5»
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
	
	def dispatch getHtmlIndexTemplate(Survey it)
	{
		'''
		<!DOCTYPE html>
		<html lang="en">
		  <head>
		    <meta charset="utf-8">
		    <meta http-equiv="X-UA-Compatible" content="IE=edge">
		    <meta name="viewport" content="width=device-width, initial-scale=1">
		    <title>« it.name »</title>
		
		    <!-- Bootstrap -->
		    <link href="css/bootstrap.min.css" rel="stylesheet">
		    <link href='http://fonts.googleapis.com/css?family=Roboto:400,500italic,500,400italic,300,100italic,100,300italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
		    
		    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
		    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		    <!--[if lt IE 9]>
		      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
		    <![endif]-->
		    <link href="css/style.css" rel="stylesheet">
		    <link href="css/csspinner.css" rel="stylesheet">
		  </head>
		  <body>
		    <nav class="navbar navbar-default" role="navigation">
		      <div class="container-fluid">
		        <!-- Brand and toggle get grouped for better mobile display -->
		        <div class="navbar-header">
		          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		            <span class="sr-only">Toggle navigation</span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		          </button>
		          <a class="navbar-brand" href="#">« it.name »</a>
		        </div>
		        </div><!-- /.navbar-collapse -->
		      </div><!-- /.container-fluid -->
		    </nav>
		
		    <div class="pg">
		      <div class="gc">
		        <div class="qd">
		          <h3 class="smdp_question">Welcome to our Survey Demo! <br /> Please press 'Start' to begin!</h3>
		          <span class="glyphicon glyphicon-question-sign smdp"></span>
		
		          <button type="button" class="btn btn-primary btn-sm btn-block start" name="submitQuestion" onclick="return Survey.initSurvey('« normalize(it.name) »');" disabled="disabled">Please wait ...</button>
		        </div>
		      </div>
		    </div>
		    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
		    <!-- Include all compiled plugins (below), or include individual files as needed -->
		    <script src="js/bootstrap.min.js"></script>
		    <script src="js/jquery.cookie.js"></script>
		    <script src="js/survey.js"></script>
		  </body>
		</html>
		'''
	}
	
	def dispatch generateHtmlIndex(Survey it)
	{
		// App name
		var AppName  = normalize(it.name)
		// HTML file name
		var fileName = "webapplication" + File.separator + "index.html"
		// Folder String path
		var directory = "webapplication"
		// Create the folder path
		var folder  = new File(directory)
		if(!folder.isDirectory())
		{
			folder.mkdirs()
		}
		
		// Crate the file
		var html 	= new File(fileName)

		if(!html.isFile)
		{
			html.createNewFile()
		} else {
			html.delete()
			html.createNewFile()
		}
		
		try {
			var writer = new PrintWriter(new BufferedWriter(new FileWriter(html, true)))
		
			writer.println(getHtmlIndexTemplate(it))
		
			writer.close()
		} catch(IOException ex)
		{
			println(ex.getMessage())
		}
	}
	
	/**
	 * Outputs each question to its' own html file
	 */
	def static saveResource(Survey it, Question question, CharSequence template)
	{
		// App name
		var AppName  = normalize(it.name)
		// HTML file name
		var fileName = "webapplication" + File.separator+ "surveys" + File.separator + AppName + File.separator + "html" + File.separator + question.name.toLowerCase + ".html"
		// Folder String path
		var directory = "webapplication" + File.separator+ "surveys" + File.separator + AppName + File.separator + "html"
		// Create the folder path
		var folder  = new File(directory)
		if(!folder.isDirectory())
		{
			folder.mkdirs()
		}
		
		// Crate the file
		var html 	= new File(fileName)

		if(!html.isFile)
		{
			html.createNewFile()
		} else {
			html.delete()
		}
		
		try {
			var writer = new PrintWriter(new BufferedWriter(new FileWriter(html, true)))
		
			writer.println(template)
		
			writer.close()
		} catch(IOException ex)
		{
			println(ex.getMessage())
		}
		
	}
	
}