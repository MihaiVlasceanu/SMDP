import java.util.HashMap
import survey.Question
import survey.Survey

abstract class CodeGenerator {
	protected var goToMap = new HashMap<Question, Integer>();
	protected var questionMap = new HashMap<Question, Integer>();
	new( HashMap<Question, Integer> goToMap, HashMap<Question, Integer> questionMap) {
		this.goToMap = goToMap
		this.questionMap = questionMap
	}
	
	def abstract String getTemplate(Survey it)

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