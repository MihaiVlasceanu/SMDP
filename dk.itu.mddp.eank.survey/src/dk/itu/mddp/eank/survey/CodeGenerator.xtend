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

abstract class CodeGenerator {
	protected var goToMap = new HashMap<Question, Integer>();
	protected var questionMap = new HashMap<Question, Integer>();
	new( HashMap<Question, Integer> goToMap, HashMap<Question, Integer> questionMap) {
		this.goToMap = goToMap
		this.questionMap = questionMap
	}
	
	def abstract String toTemplate(Survey it)

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