package dk.itu.mddp.eank.survey;

import dk.itu.mddp.eank.survey.CodeGenerator;
import survey.ConstantSum;
import survey.MultipleChoice;
import survey.Open;
import survey.Ranking;
import survey.Rating;
import survey.Staple;

@SuppressWarnings("all")
public class HtmlCodeGenerator extends CodeGenerator {
  /**
   * HTML generator for the Open type question
   */
  public void toTemplate(final Open it, final int to) {
    throw new Error("Unresolved compilation problems:"
      + "\nThis expression is not allowed in this context, since it doesn\'t cause any side effects.");
  }
  
  /**
   * HTML generator for the MultipleChoice question type
   */
  public void toTemplate(final MultipleChoice it, final int to) {
    throw new Error("Unresolved compilation problems:"
      + "\nThis expression is not allowed in this context, since it doesn\'t cause any side effects.");
  }
  
  /**
   * HTML generator for the Ranking question type
   */
  public void toTemplate(final Ranking it, final int to) {
    throw new Error("Unresolved compilation problems:"
      + "\nThis expression is not allowed in this context, since it doesn\'t cause any side effects.");
  }
  
  public void toTemplate(final Rating it, final int to) {
    throw new Error("Unresolved compilation problems:"
      + "\nThis expression is not allowed in this context, since it doesn\'t cause any side effects.");
  }
  
  public void toTemplate(final ConstantSum it, final int to) {
    throw new Error("Unresolved compilation problems:"
      + "\nThis expression is not allowed in this context, since it doesn\'t cause any side effects.");
  }
  
  /**
   * Generator for the Staple question
   */
  public void toTemplate(final Staple it, final int to) {
    throw new Error("Unresolved compilation problems:"
      + "\nThis expression is not allowed in this context, since it doesn\'t cause any side effects.");
  }
}
