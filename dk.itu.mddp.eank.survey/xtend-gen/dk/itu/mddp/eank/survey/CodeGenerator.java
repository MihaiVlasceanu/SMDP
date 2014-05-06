package dk.itu.mddp.eank.survey;

import java.util.HashMap;
import survey.Question;
import survey.Survey;

@SuppressWarnings("all")
public abstract class CodeGenerator {
  protected HashMap<Question,Integer> goToMap = new HashMap<Question, Integer>();
  
  protected HashMap<Question,Integer> questionMap = new HashMap<Question, Integer>();
  
  public CodeGenerator(final HashMap<Question,Integer> goToMap, final HashMap<Question,Integer> questionMap) {
    this.goToMap = goToMap;
    this.questionMap = questionMap;
  }
  
  public abstract String toTemplate(final Survey it);
  
  /**
   * Removes all non-alphanumeric characters in a string
   */
  public static String normalize(final String string) {
    return string.replaceAll("(^[^a-zA-Z])*(\\W+)", "");
  }
  
  public static String toInt(final String name) {
    return name.replaceAll("([^0-9])*", "");
  }
}
