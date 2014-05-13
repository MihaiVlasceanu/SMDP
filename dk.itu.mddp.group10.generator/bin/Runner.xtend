import survey.SurveyPackage
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.common.util.URI
import survey.Surveyimport org.xtext.example.mydsl.MyDslStandaloneSetupGenerated

class Runner {
		
	def static void main (String[] args) {
	
		// register our meta-model package for abstract syntax
		SurveyPackage.eINSTANCE.eClass
		val instanceFileName = "test-files/test.ask"
		val injector = new MyDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration
		val resourceSet = injector.getInstance(typeof(XtextResourceSet))
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, true);
		val uri = URI::createURI(instanceFileName)
		var resource = resourceSet.getResource(uri, true)			/* true means follow proxies */
		val Survey m = resource.getContents().get(0) as Survey
		val survey = Transformation.changeChoices(m)
		//Changes all choices so they reference the correct ID within the question
		//Previously it would reference the first occurence of the choice with that name
		if(Constraints.Constraint(m))
		{
			println("All constraints passed!")
			generate(survey)
			
		}
		else
			println("Constraints Failed")
	
		val outputURI = URI.createFileURI("test-files/test-output.xmi")
		resource.URI = resource.resourceSet.getURIConverter.normalize(outputURI)
		resource.save (null)

	}
	def static void generate(Survey it){
		
		QuestionMapping.MapQuestions(it)
		var  goToMap = QuestionMapping.goToMap
		var questionMap =QuestionMapping.map
		val CodeGenerator htmlGenerator = new HtmlCodeGenerator(goToMap, questionMap)
		val CodeGenerator androidGenerator = new AndroidCodeGenerator(goToMap, questionMap)
		println(htmlGenerator.getTemplate(it).toString())
		println(androidGenerator.getTemplate(it).toString())
	}

	
}