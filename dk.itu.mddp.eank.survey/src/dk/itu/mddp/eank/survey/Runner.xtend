package dk.itu.mddp.eank.survey

import survey.SurveyPackage
import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.common.util.URI
import survey.Survey
import survey.ConstantSum
import survey.MultipleChoice
import survey.Staple
import survey.Ranking
import survey.Open
import survey.Rating
import java.util.HashMap
import survey.Question
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.EList
import survey.Fork

class Runner {
		
		def static void main (String[] args) {
		
		// register our meta-model package for abstract syntax
		SurveyPackage.eINSTANCE.eClass
		val instanceFileName = "test-files/Tes.survey"
		val injector = new MyDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration
		val resourceSet = injector.getInstance(typeof(XtextResourceSet))
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, true);

		val uri = URI::createURI(instanceFileName)
		var resource = resourceSet.getResource(uri, true)			/* true means follow proxies */

		val Survey m = resource.getContents().get(0) as Survey
		val survey = Transformation.changeChoices(m)
		val questions = survey.questions
		//Changes all choices so they reference the correct ID within the question
		//Previously it would reference the first occurence of the choice with that name
		

		

		QuestionMapping.MapQuestions(m)
		var  goToMap = QuestionMapping.goToMap
		var questionMap =QuestionMapping.map
		val CodeGenerator generator = new HtmlCodeGenerator(goToMap, questionMap)
		println(generator.toTemplate(survey).toString())


		if(Constraints.Constraint(m))
			println("All constraints passed!")
		else
			println("Constraints Failed")

		val outputURI = URI.createFileURI("test-files/test-output.xmi")
		resource.URI = resource.resourceSet.getURIConverter.normalize(outputURI)
		resource.save (null)

	}

	
}