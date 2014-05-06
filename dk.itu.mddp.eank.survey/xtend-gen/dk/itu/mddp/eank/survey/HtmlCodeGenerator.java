package dk.itu.mddp.eank.survey;

import com.google.common.base.Objects;
import dk.itu.mddp.eank.survey.CodeGenerator;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import survey.Choice;
import survey.ChoiceFork;
import survey.ConstantSum;
import survey.MultipleChoice;
import survey.Open;
import survey.Question;
import survey.Ranking;
import survey.RankingSumFork;
import survey.Rating;
import survey.Staple;
import survey.Survey;

@SuppressWarnings("all")
public class HtmlCodeGenerator extends CodeGenerator {
  public HtmlCodeGenerator(final HashMap<Question,Integer> goToMap, final HashMap<Question,Integer> questionMap) {
    super(goToMap, questionMap);
  }
  
  /**
   * HTML generator for the Open type question
   */
  public String toTemplate(final Survey it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      EList<Question> _questions = it.getQuestions();
      int _size = _questions.size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer i : _upTo) {
        CharSequence _xblockexpression = null;
        {
          EList<Question> _questions_1 = it.getQuestions();
          Question _get = _questions_1.get((i).intValue());
          Integer to = this.goToMap.get(_get);
          EList<Question> _questions_2 = it.getQuestions();
          Question _get_1 = _questions_2.get((i).intValue());
          _xblockexpression = this.toTemplate(_get_1, (to).intValue());
        }
        _builder.append(_xblockexpression, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected CharSequence _toTemplate(final Open it, final int to) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<form method=\"POST\" action=\"\" id=\"");
    String _name = it.getName();
    String _normalize = CodeGenerator.normalize(_name);
    _builder.append(_normalize, "");
    _builder.append("\" class=\"smdp");
    {
      boolean _isIsRequired = it.isIsRequired();
      if (_isIsRequired) {
        _builder.append(" required");
      }
    }
    _builder.append("\" autocomplete=\"off\" role=\"form\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div class=\"question_container\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h3 class=\"smdp_question\">");
    String _question = it.getQuestion();
    _builder.append(_question, "\t");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div class=\"options_container\">");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<textarea class=\"form-control\" rows=\"5\" cols=\"40\" name=\"");
    String _name_1 = it.getName();
    String _normalize_1 = CodeGenerator.normalize(_name_1);
    _builder.append(_normalize_1, "      ");
    _builder.append("\" onkeyup=\"return Survey.validateTextarea(this);\"></textarea>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<button type=\"button\" class=\"btn btn-primary btn-sm btn-block\"");
    {
      boolean _isIsRequired_1 = it.isIsRequired();
      if (_isIsRequired_1) {
        _builder.append(" disabled=\"disabled\"");
      }
    }
    _builder.append(" name=\"submitQuestion\" onclick=\"return Survey.saveAnswerData(\'#");
    String _name_2 = it.getName();
    String _normalize_2 = CodeGenerator.normalize(_name_2);
    _builder.append(_normalize_2, "");
    _builder.append("\', ");
    _builder.append(to, "");
    _builder.append(");\">Next Question <span class=\"glyphicon glyphicon-chevron-right\"></span></button>");
    _builder.newLineIfNotEmpty();
    _builder.append("</form>\t");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * HTML generator for the MultipleChoice question type
   */
  protected CharSequence _toTemplate(final MultipleChoice it, final int to) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<form method=\"POST\" action=\"\" id=\"");
    String _name = it.getName();
    String _normalize = CodeGenerator.normalize(_name);
    _builder.append(_normalize, "");
    _builder.append("\" class=\"smdp");
    {
      boolean _isIsRequired = it.isIsRequired();
      if (_isIsRequired) {
        _builder.append(" required");
      }
    }
    _builder.append("\" autocomplete=\"off\" role=\"form\">");
    _builder.newLineIfNotEmpty();
    _builder.append("<div class=\"question_container\">");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<h3 class=\"smdp_question\">");
    String _question = it.getQuestion();
    _builder.append(_question, "      ");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<div class=\"options_container\">");
    _builder.newLine();
    {
      EList<Choice> _choice = it.getChoice();
      for(final Choice choice : _choice) {
        _builder.append("<div class=\"checkbox\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<label>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<input type=\"checkbox\" name=\"");
        String _name_1 = it.getName();
        _builder.append(_name_1, "\t\t");
        _builder.append("\" id=\"option_");
        String _name_2 = choice.getName();
        String _normalize_1 = CodeGenerator.normalize(_name_2);
        _builder.append(_normalize_1, "\t\t");
        _builder.append("\" value=\"");
        String _description = choice.getDescription();
        _builder.append(_description, "\t\t");
        _builder.append("\" onClick=\"return Survey.changeSubmitButtonStatus(this);\" data-next=\"");
        {
          EList<ChoiceFork> _forks = it.getForks();
          for(final ChoiceFork fork : _forks) {
            {
              EList<Choice> _on = fork.getOn();
              boolean _contains = _on.contains(choice);
              if (_contains) {
                EList<Question> _questions = fork.getQuestions();
                Question _get = _questions.get(0);
                Integer _get_1 = this.questionMap.get(_get);
                int _plus = ((_get_1).intValue() + 1);
                _builder.append(_plus, "\t\t");
              }
            }
          }
        }
        _builder.append("\" /> ");
        String _description_1 = choice.getDescription();
        _builder.append(_description_1, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</label>");
        _builder.newLine();
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    {
      boolean _and = false;
      String _other = it.getOther();
      boolean _notEquals = (!Objects.equal(_other, null));
      if (!_notEquals) {
        _and = false;
      } else {
        String _other_1 = it.getOther();
        boolean _equals = _other_1.equals("");
        boolean _not = (!_equals);
        _and = _not;
      }
      if (_and) {
        _builder.append("<div class=\"checkbox\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<label class=\"other\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<input type=\"checkbox\" name=\"");
        String _other_2 = it.getOther();
        String _normalize_2 = CodeGenerator.normalize(_other_2);
        _builder.append(_normalize_2, "\t\t");
        _builder.append("\" id=\"option_");
        String _other_3 = it.getOther();
        String _normalize_3 = CodeGenerator.normalize(_other_3);
        _builder.append(_normalize_3, "\t\t");
        _builder.append("\" value=\"");
        String _other_4 = it.getOther();
        String _normalize_4 = CodeGenerator.normalize(_other_4);
        _builder.append(_normalize_4, "\t\t");
        _builder.append("\" onClick=\"return Survey.changeSubmitButtonStatus(this);\' />");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t  \t\t\t");
        String _other_5 = it.getOther();
        _builder.append(_other_5, "\t\t  \t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</label>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<input type=\"text\" class=\"form-control other\" id=\'");
        String _other_6 = it.getOther();
        String _normalize_5 = CodeGenerator.normalize(_other_6);
        _builder.append(_normalize_5, "\t");
        _builder.append("\' maxlength=\'30\' data-for=\"#option_");
        String _other_7 = it.getOther();
        String _normalize_6 = CodeGenerator.normalize(_other_7);
        _builder.append(_normalize_6, "\t");
        _builder.append("\" onClick=\'Survey.updateOther(this);\' />\"");
        _builder.newLineIfNotEmpty();
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<button type=\"button\" class=\"btn btn-primary btn-sm btn-block\"");
    {
      boolean _isIsRequired_1 = it.isIsRequired();
      if (_isIsRequired_1) {
        _builder.append(" disabled=\"disabled\"");
      }
    }
    _builder.append(" name=\"submitQuestion\" onclick=\"return Survey.saveAnswerData(\'#");
    String _name_3 = it.getName();
    String _normalize_7 = CodeGenerator.normalize(_name_3);
    _builder.append(_normalize_7, "\t");
    _builder.append("\', ");
    _builder.append(to, "\t");
    _builder.append(");\">Next Question <span class=\"glyphicon glyphicon-chevron-right\"></span></button>");
    _builder.newLineIfNotEmpty();
    _builder.append("</form>");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * HTML generator for the Ranking question type
   */
  protected CharSequence _toTemplate(final Ranking it, final int to) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<form method=\"POST\" action=\"\" id=\"");
    String _name = it.getName();
    String _normalize = CodeGenerator.normalize(_name);
    _builder.append(_normalize, "");
    _builder.append("\" class=\"smdp");
    {
      boolean _isIsRequired = it.isIsRequired();
      if (_isIsRequired) {
        _builder.append(" required");
      }
    }
    _builder.append("\" autocomplete=\"off\" role=\"form\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div class=\"question_container\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h3 class=\"smdp_question\">");
    String _question = it.getQuestion();
    _builder.append(_question, "\t\t");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"options_container\">");
    _builder.newLine();
    {
      EList<Choice> _choices = it.getChoices();
      for(final Choice choice : _choices) {
        _builder.append("<div class=\"form-group\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<label for=\"ranking_");
        String _name_1 = choice.getName();
        String _normalize_1 = CodeGenerator.normalize(_name_1);
        _builder.append(_normalize_1, "\t");
        _builder.append("\" class=\"col-xs-9 control-label\">");
        String _description = choice.getDescription();
        _builder.append(_description, "\t");
        _builder.append("</label>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<div class=\"col-xs-3\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<input type=\"number\" class=\"form-control rating\" id=\"ranking_");
        String _name_2 = choice.getName();
        String _normalize_2 = CodeGenerator.normalize(_name_2);
        _builder.append(_normalize_2, "\t\t");
        _builder.append("\" maxlength=\"2\" onkeyup=\"return ");
        {
          boolean _and = false;
          EList<RankingSumFork> _forks = it.getForks();
          int _size = _forks.size();
          boolean _greaterThan = (_size > 0);
          if (!_greaterThan) {
            _and = false;
          } else {
            EList<RankingSumFork> _forks_1 = it.getForks();
            final Function1<RankingSumFork,Boolean> _function = new Function1<RankingSumFork,Boolean>() {
              public Boolean apply(final RankingSumFork f) {
                EList<Choice> _on = f.getOn();
                return Boolean.valueOf(_on.contains(choice));
              }
            };
            boolean _exists = IterableExtensions.<RankingSumFork>exists(_forks_1, _function);
            _and = _exists;
          }
          if (_and) {
            _builder.append("Fork.calculate(this, \'ranking_");
            String _name_3 = choice.getName();
            String _normalize_3 = CodeGenerator.normalize(_name_3);
            _builder.append(_normalize_3, "\t\t");
            _builder.append("\')");
          } else {
            _builder.append("Survey.rankingUpdate(this)");
          }
        }
        _builder.append(";\" data-next=\"\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<button type=\"button\" class=\"btn btn-primary btn-sm btn-block\"");
    {
      boolean _isIsRequired_1 = it.isIsRequired();
      if (_isIsRequired_1) {
        _builder.append(" disabled=\"disabled\"");
      }
    }
    _builder.append(" name=\"submitQuestion\" onclick=\"return Survey.saveAnswerData(\'#");
    String _name_4 = it.getName();
    String _normalize_4 = CodeGenerator.normalize(_name_4);
    _builder.append(_normalize_4, "\t");
    _builder.append("\', ");
    _builder.append(to, "\t");
    _builder.append(");\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("Next Question <span class=\"glyphicon glyphicon-chevron-right\"></span>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</button>");
    _builder.newLine();
    _builder.append("</form>");
    _builder.newLine();
    _builder.newLine();
    {
      EList<RankingSumFork> _forks_2 = it.getForks();
      int _size_1 = _forks_2.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        _builder.append("<script type=\"text/javascript\">");
        _builder.newLine();
        _builder.append("var Fork = Fork || {};");
        _builder.newLine();
        _builder.append("Fork = (function(){");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("return {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("calculate: function(input, targetid)");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("{");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("// Get the field object");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("var numberField = (typeof input !== \'undefined\' ? jQuery(input) : false);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("      ");
        _builder.append("if(numberField !== false)");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("{");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("// Actul inout value");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("var value = numberField.val();");
        _builder.newLine();
        {
          EList<RankingSumFork> _forks_3 = it.getForks();
          for(final RankingSumFork fork : _forks_3) {
            {
              EList<Question> _questions = fork.getQuestions();
              int _size_2 = _questions.size();
              boolean _greaterThan_2 = (_size_2 > 0);
              if (_greaterThan_2) {
                _builder.append("\t\t");
                _builder.append("if (Survey.isBetween(value, ");
                int _min = fork.getMin();
                _builder.append(_min, "\t\t");
                _builder.append(", ");
                int _max = fork.getMax();
                _builder.append(_max, "\t\t");
                _builder.append(")) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("numberField.attr(Survey.SURVEY_FORK_SEL, \'");
                EList<Question> _questions_1 = fork.getQuestions();
                final Function1<Question,String> _function_1 = new Function1<Question,String>() {
                  public String apply(final Question q) {
                    String _name = q.getName();
                    return CodeGenerator.toInt(_name);
                  }
                };
                String _join = IterableExtensions.<Question>join(_questions_1, ",", _function_1);
                _builder.append(_join, "\t\t\t");
                _builder.append("\');");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("        ");
        _builder.append("numberField.on(\'keyup keypress blur change\', function() {");
        _builder.newLine();
        _builder.append("          ");
        _builder.append("return Survey.rankingUpdate(this);");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("});");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("})(jQuery);");
        _builder.newLine();
        _builder.append("</script>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected CharSequence _toTemplate(final Rating it, final int to) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<form method=\"POST\" action=\"\" id=\"");
    String _name = it.getName();
    String _normalize = CodeGenerator.normalize(_name);
    _builder.append(_normalize, "");
    _builder.append("\" class=\"smdp");
    {
      boolean _isIsRequired = it.isIsRequired();
      if (_isIsRequired) {
        _builder.append(" required");
      }
    }
    _builder.append("\" autocomplete=\"off\" role=\"form\">");
    _builder.newLineIfNotEmpty();
    _builder.append("<div class=\"question_container\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h3 class=\"smdp_question\">");
    String _question = it.getQuestion();
    _builder.append(_question, "\t");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<div class=\"options_container\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table class=\"table table-striped table-bordered table-condensed\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<tr>");
    _builder.newLine();
    {
      int _min = it.getMin();
      int _max = it.getMax();
      IntegerRange _upTo = new IntegerRange(_min, _max);
      for(final Integer p : _upTo) {
        {
          if (((p).intValue() > 0)) {
            _builder.append("<th>(+");
            _builder.append(p, "");
            _builder.append(") ");
            {
              int _max_1 = it.getMax();
              boolean _equals = ((p).intValue() == _max_1);
              if (_equals) {
                String _last = it.getLast();
                _builder.append(_last, "");
              }
            }
            {
              int _min_1 = it.getMin();
              boolean _equals_1 = ((p).intValue() == _min_1);
              if (_equals_1) {
                String _first = it.getFirst();
                _builder.append(_first, "");
              }
            }
            _builder.append("</th>");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          if (((p).intValue() < 0)) {
            _builder.append("<th>(");
            _builder.append(p, "");
            _builder.append(") ");
            {
              int _max_2 = it.getMax();
              boolean _equals_2 = ((p).intValue() == _max_2);
              if (_equals_2) {
                String _last_1 = it.getLast();
                _builder.append(_last_1, "");
              }
            }
            {
              int _min_2 = it.getMin();
              boolean _equals_3 = ((p).intValue() == _min_2);
              if (_equals_3) {
                String _first_1 = it.getFirst();
                _builder.append(_first_1, "");
              }
            }
            _builder.append("</th>");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<tr>");
    {
      int _min_3 = it.getMin();
      int _max_3 = it.getMax();
      IntegerRange _upTo_1 = new IntegerRange(_min_3, _max_3);
      for(final Integer p_1 : _upTo_1) {
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("<td>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<label class=\"radio-inline\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t  \t");
        _builder.append("<input type=\"radio\" id=\"option_");
        _builder.append(p_1, "\t\t\t  \t");
        _builder.append("\" name=\"option_");
        String _name_1 = it.getName();
        _builder.append(_name_1, "\t\t\t  \t");
        _builder.append("\" value=\"");
        _builder.append(p_1, "\t\t\t  \t");
        _builder.append("\" onclick=\"return Survey.ratingUpdate(this);\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("</label>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</td>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</table>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<button type=\"button\" class=\"btn btn-primary btn-sm btn-block\"");
    {
      boolean _isIsRequired_1 = it.isIsRequired();
      if (_isIsRequired_1) {
        _builder.append(" disabled=\"disabled\"");
      }
    }
    _builder.append(" name=\"submitQuestion\" onclick=\"return Survey.saveAnswerData(\'#");
    String _name_2 = it.getName();
    String _normalize_1 = CodeGenerator.normalize(_name_2);
    _builder.append(_normalize_1, "");
    _builder.append("\', ");
    _builder.append(to, "");
    _builder.append(");\">Next Question <span class=\"glyphicon glyphicon-chevron-right\"></span></button>");
    _builder.newLineIfNotEmpty();
    _builder.append("</form>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _toTemplate(final ConstantSum it, final int to) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<form method=\"POST\" action=\"\" id=\"");
    String _name = it.getName();
    String _normalize = CodeGenerator.normalize(_name);
    _builder.append(_normalize, "");
    _builder.append("\" class=\"smdp");
    {
      boolean _isIsRequired = it.isIsRequired();
      if (_isIsRequired) {
        _builder.append(" required");
      }
    }
    _builder.append("\" autocomplete=\"off\" role=\"form\" data-href=\"");
    int _constant = it.getConstant();
    _builder.append(_constant, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("<div class=\"question_container\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h3 class=\"smdp_question\">");
    String _question = it.getQuestion();
    _builder.append(_question, "\t");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<div class=\"options_container\">");
    _builder.newLine();
    {
      EList<Choice> _choices = it.getChoices();
      for(final Choice choice : _choices) {
        _builder.append("<div class=\"form-group\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<label class=\"col-xs-8 control-label\">");
        String _description = choice.getDescription();
        _builder.append(_description, "\t");
        _builder.append("</label>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<div class=\"col-xs-4\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<input type=\"number\" class=\"form-control rating\" id=\"sum_");
        String _name_1 = choice.getName();
        String _normalize_1 = CodeGenerator.normalize(_name_1);
        _builder.append(_normalize_1, "\t\t");
        _builder.append("\" maxlength=\"3\" onkeyup=\"return ");
        {
          boolean _and = false;
          EList<RankingSumFork> _forks = it.getForks();
          int _size = _forks.size();
          boolean _greaterThan = (_size > 0);
          if (!_greaterThan) {
            _and = false;
          } else {
            EList<RankingSumFork> _forks_1 = it.getForks();
            final Function1<RankingSumFork,Boolean> _function = new Function1<RankingSumFork,Boolean>() {
              public Boolean apply(final RankingSumFork f) {
                EList<Choice> _on = f.getOn();
                return Boolean.valueOf(_on.contains(choice));
              }
            };
            boolean _exists = IterableExtensions.<RankingSumFork>exists(_forks_1, _function);
            _and = _exists;
          }
          if (_and) {
            _builder.append("Fork.calculate(this, \'sum_");
            String _name_2 = choice.getName();
            String _normalize_2 = CodeGenerator.normalize(_name_2);
            _builder.append(_normalize_2, "\t\t");
            _builder.append("\')");
          } else {
            _builder.append("Survey.constantSumUpdate(this)");
          }
        }
        _builder.append(";\" name=\"sum_");
        String _name_3 = choice.getName();
        String _normalize_3 = CodeGenerator.normalize(_name_3);
        _builder.append(_normalize_3, "\t\t");
        _builder.append("\" data-next=\"\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("      ");
    _builder.append("<div class=\"form-group\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<label class=\"col-xs-3 control-label label-total\">");
    int _constant_1 = it.getConstant();
    _builder.append(_constant_1, "        ");
    _builder.append("</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<button type=\"button\" class=\"btn btn-primary btn-sm btn-block\"");
    {
      boolean _isIsRequired_1 = it.isIsRequired();
      if (_isIsRequired_1) {
        _builder.append(" disabled=\"disabled\"");
      }
    }
    _builder.append(" name=\"submitQuestion\" onclick=\"return Survey.saveAnswerData(\'#");
    String _name_4 = it.getName();
    String _normalize_4 = CodeGenerator.normalize(_name_4);
    _builder.append(_normalize_4, "    ");
    _builder.append("\', ");
    _builder.append(to, "    ");
    _builder.append(");\">Next Question <span class=\"glyphicon glyphicon-chevron-right\"></span></button>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</form>");
    _builder.newLine();
    _builder.newLine();
    {
      EList<RankingSumFork> _forks_2 = it.getForks();
      int _size_1 = _forks_2.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        _builder.append("<script type=\"text/javascript\">");
        _builder.newLine();
        _builder.append("var Fork = Fork || {};");
        _builder.newLine();
        _builder.append("Fork = (function(){");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("return {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("calculate: function(input, targetid)");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("{");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("// Get the field object");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("var numberField = (typeof input !== \'undefined\' ? jQuery(input) : false);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("      ");
        _builder.append("if(numberField !== false)");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("{");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("// Actul inout value");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("var value = numberField.val();");
        _builder.newLine();
        {
          EList<RankingSumFork> _forks_3 = it.getForks();
          for(final RankingSumFork fork : _forks_3) {
            {
              EList<Question> _questions = fork.getQuestions();
              int _size_2 = _questions.size();
              boolean _greaterThan_2 = (_size_2 > 0);
              if (_greaterThan_2) {
                _builder.append("\t\t");
                _builder.append("if (Survey.isBetween(value, ");
                int _min = fork.getMin();
                _builder.append(_min, "\t\t");
                _builder.append(", ");
                int _max = fork.getMax();
                _builder.append(_max, "\t\t");
                _builder.append(")) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("numberField.attr(Survey.SURVEY_FORK_SEL, \'");
                EList<Question> _questions_1 = fork.getQuestions();
                final Function1<Question,String> _function_1 = new Function1<Question,String>() {
                  public String apply(final Question q) {
                    String _name = q.getName();
                    return CodeGenerator.toInt(_name);
                  }
                };
                String _join = IterableExtensions.<Question>join(_questions_1, ",", _function_1);
                _builder.append(_join, "\t\t\t");
                _builder.append("\');");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("        ");
        _builder.append("numberField.on(\'keyup keypress blur change\', function() {");
        _builder.newLine();
        _builder.append("          ");
        _builder.append("return Survey.constantSumUpdate(this);");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("});");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("})(jQuery);");
        _builder.newLine();
        _builder.append("</script>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  /**
   * Generator for the Staple question
   */
  protected CharSequence _toTemplate(final Staple it, final int to) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<form method=\"POST\" action=\"\" id=\"");
    String _name = it.getName();
    String _normalize = CodeGenerator.normalize(_name);
    _builder.append(_normalize, "");
    _builder.append("\" class=\"smdp");
    {
      boolean _isIsRequired = it.isIsRequired();
      if (_isIsRequired) {
        _builder.append(" required");
      }
    }
    _builder.append("\" autocomplete=\"off\" role=\"form\">");
    _builder.newLineIfNotEmpty();
    _builder.append("<div class=\"question_container\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h3 class=\"smdp_question\">");
    String _question = it.getQuestion();
    _builder.append(_question, "\t");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<div class=\"options_container\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table class=\"table table-striped table-bordered table-condensed\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<tr>");
    _builder.newLine();
    {
      IntegerRange _upTo = new IntegerRange((-5), 5);
      for(final Integer p : _upTo) {
        {
          if (((p).intValue() > 0)) {
            _builder.append("<th>(+");
            _builder.append(p, "");
            _builder.append(") ");
            {
              if (((p).intValue() == 5)) {
                String _last = it.getLast();
                _builder.append(_last, "");
              }
            }
            {
              if (((p).intValue() == (-5))) {
                String _first = it.getFirst();
                _builder.append(_first, "");
              }
            }
            _builder.append("</th>");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          if (((p).intValue() == 0)) {
            _builder.append("<th>");
            String _mid = it.getMid();
            _builder.append(_mid, "");
            _builder.append("</th>");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          if (((p).intValue() < 0)) {
            _builder.append("<th>(");
            _builder.append(p, "");
            _builder.append(") ");
            {
              if (((p).intValue() == 5)) {
                String _last_1 = it.getLast();
                _builder.append(_last_1, "");
              }
            }
            {
              if (((p).intValue() == (-5))) {
                String _first_1 = it.getFirst();
                _builder.append(_first_1, "");
              }
            }
            _builder.append("</th>");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<tr>");
    {
      IntegerRange _upTo_1 = new IntegerRange((-5), 5);
      for(final Integer p_1 : _upTo_1) {
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("<td>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<label class=\"radio-inline\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t  \t");
        _builder.append("<input type=\"radio\" id=\"option_");
        _builder.append(p_1, "\t\t\t  \t");
        _builder.append("\" name=\"option_");
        String _name_1 = it.getName();
        _builder.append(_name_1, "\t\t\t  \t");
        _builder.append("\" value=\"");
        _builder.append(p_1, "\t\t\t  \t");
        _builder.append("\" onclick=\"return Survey.ratingUpdate(this);\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("</label>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</td>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</table>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<button type=\"button\" class=\"btn btn-primary btn-sm btn-block\"");
    {
      boolean _isIsRequired_1 = it.isIsRequired();
      if (_isIsRequired_1) {
        _builder.append(" disabled=\"disabled\"");
      }
    }
    _builder.append(" name=\"submitQuestion\" onclick=\"return Survey.saveAnswerData(\'#");
    String _name_2 = it.getName();
    String _normalize_1 = CodeGenerator.normalize(_name_2);
    _builder.append(_normalize_1, "");
    _builder.append("\', ");
    _builder.append(to, "");
    _builder.append(");\">Next Question <span class=\"glyphicon glyphicon-chevron-right\"></span></button>");
    _builder.newLineIfNotEmpty();
    _builder.append("</form>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toTemplate(final Question it, final int to) {
    if (it instanceof ConstantSum) {
      return _toTemplate((ConstantSum)it, to);
    } else if (it instanceof MultipleChoice) {
      return _toTemplate((MultipleChoice)it, to);
    } else if (it instanceof Open) {
      return _toTemplate((Open)it, to);
    } else if (it instanceof Ranking) {
      return _toTemplate((Ranking)it, to);
    } else if (it instanceof Rating) {
      return _toTemplate((Rating)it, to);
    } else if (it instanceof Staple) {
      return _toTemplate((Staple)it, to);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, to).toString());
    }
  }
}
