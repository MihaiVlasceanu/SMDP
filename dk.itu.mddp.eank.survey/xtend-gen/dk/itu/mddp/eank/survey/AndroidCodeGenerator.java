package dk.itu.mddp.eank.survey;

import dk.itu.mddp.eank.survey.CodeGenerator;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import survey.Choice;
import survey.ChoiceFork;
import survey.ConstantSum;
import survey.MultipleChoice;
import survey.Open;
import survey.Question;
import survey.Ranking;
import survey.RankingSumFork;
import survey.Rating;
import survey.RatingFork;
import survey.Staple;
import survey.Survey;

@SuppressWarnings("all")
public class AndroidCodeGenerator extends CodeGenerator {
  public AndroidCodeGenerator(final HashMap<Question,Integer> goToMap, final HashMap<Question,Integer> questionMap) {
    super(goToMap, questionMap);
  }
 
  public String getTemplate(final Survey it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package com.smdp.surveytoandroid;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.smdp.surveytoandroid.questionstructure.Choice;");
    _builder.newLine();
    _builder.append("import com.smdp.surveytoandroid.questionstructure.Fork;");
    _builder.newLine();
    _builder.append("import com.smdp.surveytoandroid.questionstructure.MultipleChoiceQuestion;");
    _builder.newLine();
    _builder.append("import com.smdp.surveytoandroid.questionstructure.OpenQuestion;");
    _builder.newLine();
    _builder.append("import com.smdp.surveytoandroid.questionstructure.Questionable;");
    _builder.newLine();
    _builder.append("import com.smdp.surveytoandroid.questionstructure.RankingQuestion;");
    _builder.newLine();
    _builder.append("import com.smdp.surveytoandroid.questionstructure.RatingQuestion;");
    _builder.newLine();
    _builder.append("import com.smdp.surveytoandroid.questionstructure.SumConstantQuestion;");
    _builder.newLine();
    _builder.append("import com.smdp.surveytoandroid.questionstructure.Staple;");
    _builder.newLine();
    _builder.append("import com.smdp.surveytoandroid.questionstructure.Survey;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class CodeGenData {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static ArrayList<Questionable> questions = new ArrayList<Questionable>();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ArrayList<Questionable> addQuestionsToArrList() {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Survey ");
    String _name = it.getName();
    _builder.append(_name, "\t\t");
    _builder.append(" = new Survey (\"");
    String _name_1 = it.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    {
      EList<Question> _questions = it.getQuestions();
      for(final Question question : _questions) {
        CharSequence _template = this.toTemplate(question);
        _builder.append(_template, "\t\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return questions;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}\t");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected CharSequence _toTemplate(final Open it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("OpenQuestion ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(" = new OpenQuestion (\"");
    String _name_1 = it.getName();
    _builder.append(_name_1, "");
    _builder.append("\",\"");
    String _question = it.getQuestion();
    _builder.append(_question, "");
    _builder.append("\",");
    boolean _isIsRequired = it.isIsRequired();
    _builder.append(_isIsRequired, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("questions.add(");
    String _name_2 = it.getName();
    _builder.append(_name_2, "");
    _builder.append(");\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _toTemplate(final String forkname, final String forkarrayname, final EList<Question> questions, final String choicename, final String questionname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Fork ");
    _builder.append(forkname, "");
    _builder.append(" = new Fork();");
    _builder.newLineIfNotEmpty();
    _builder.append("ArrayList<Questionable> ");
    _builder.append(forkarrayname, "");
    _builder.append(" = new ArrayList<Questionable>();");
    _builder.newLineIfNotEmpty();
    {
      for(final Question q : questions) {
        _builder.append(forkarrayname, "");
        _builder.append(".add(");
        String _name = q.getName();
        _builder.append(_name, "");
        _builder.append("); ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(forkname, "");
    _builder.append(".bindingChoiceQuest.put(\"");
    _builder.append(choicename, "");
    _builder.append("\",");
    _builder.append(forkarrayname, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append(questionname, "");
    _builder.append(".forks.add(");
    _builder.append(forkname, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _toTemplate(final String forkname, final String forkarrayname, final EList<Question> questions, final String choicename, final String questionname, final int min, final int max) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Fork ");
    _builder.append(forkname, "");
    _builder.append(" = new Fork(");
    _builder.append(min, "");
    _builder.append(", ");
    _builder.append(max, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("ArrayList<Questionable> ");
    _builder.append(forkarrayname, "");
    _builder.append(" = new ArrayList<Questionable>();");
    _builder.newLineIfNotEmpty();
    {
      for(final Question q : questions) {
        _builder.append(forkarrayname, "");
        _builder.append(".add(");
        String _name = q.getName();
        _builder.append(_name, "");
        _builder.append("); ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(forkname, "");
    _builder.append(".bindingChoiceQuest.put(\"");
    _builder.append(choicename, "");
    _builder.append("\",");
    _builder.append(forkarrayname, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append(questionname, "");
    _builder.append(".forks.add(");
    _builder.append(forkname, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _toTemplate(final String forkname, final String forkarrayname, final EList<Question> questions, final String questionname, final int min, final int max) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Fork ");
    _builder.append(forkname, "");
    _builder.append(" = new Fork (");
    _builder.append(min, "");
    _builder.append(", ");
    _builder.append(max, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("ArrayList<Questionable> ");
    _builder.append(forkarrayname, "");
    _builder.append(" = new ArrayList<Questionable>();");
    _builder.newLineIfNotEmpty();
    {
      for(final Question q : questions) {
        _builder.append(forkarrayname, "");
        _builder.append(".add(");
        String _name = q.getName();
        _builder.append(_name, "");
        _builder.append("); ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(forkname, "");
    _builder.append(".forkQues.add(");
    _builder.append(forkarrayname, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append(questionname, "");
    _builder.append(".forks.add(");
    _builder.append(forkname, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _toTemplate(final MultipleChoice it) {
    CharSequence _xblockexpression = null;
    {
      String _name = it.getName();
      String arrName = ("arrMulti" + _name);
      String _name_1 = it.getName();
      String _lowerCase = _name_1.toLowerCase();
      String forkName = (_lowerCase + "ForkId");
      String _name_2 = it.getName();
      String _lowerCase_1 = _name_2.toLowerCase();
      String forkArrName = (_lowerCase_1 + "ForkArrId");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("ArrayList<Choice> ");
      _builder.append(arrName, "");
      _builder.append(" = new ArrayList<Choice>();");
      _builder.newLineIfNotEmpty();
      {
        EList<Choice> _choice = it.getChoice();
        for(final Choice c : _choice) {
          CharSequence _template = this.toTemplate(c, arrName);
          _builder.append(_template, "");
        }
      }
      _builder.append("MultipleChoiceQuestion ");
      String _name_3 = it.getName();
      _builder.append(_name_3, "");
      _builder.append(" = new MultipleChoiceQuestion (\"");
      String _name_4 = it.getName();
      _builder.append(_name_4, "");
      _builder.append("\",\"");
      String _question = it.getQuestion();
      _builder.append(_question, "");
      _builder.append("\",");
      boolean _isIsRequired = it.isIsRequired();
      _builder.append(_isIsRequired, "");
      _builder.append(", \"");
      String _other = it.getOther();
      _builder.append(_other, "");
      _builder.append("\", ");
      _builder.append(arrName, "");
      _builder.append(" );\t\t");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<Choice> _choice_1 = it.getChoice();
        for(final Choice p : _choice_1) {
          {
            EList<ChoiceFork> _forks = it.getForks();
            for(final ChoiceFork q : _forks) {
              {
                EList<Choice> _on = q.getOn();
                boolean _contains = _on.contains(p);
                if (_contains) {
                  EList<Question> _questions = q.getQuestions();
                  String _name_5 = p.getName();
                  String _name_6 = it.getName();
                  CharSequence _template_1 = this.toTemplate(forkName, forkArrName, _questions, _name_5, _name_6);
                  _builder.append(_template_1, "");
                  _builder.append(" ");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _builder.append("questions.add(");
      String _name_7 = it.getName();
      _builder.append(_name_7, "");
      _builder.append(");\t");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _toTemplate(final Choice it, final String arrname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(arrname, "");
    _builder.append(".add(new Choice (\"");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append("\",\"");
    String _description = it.getDescription();
    _builder.append(_description, "");
    _builder.append("\")); ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _toTemplate(final Ranking it) {
    CharSequence _xblockexpression = null;
    {
      String _name = it.getName();
      String arrName = ("arrRank" + _name);
      String _name_1 = it.getName();
      String _lowerCase = _name_1.toLowerCase();
      String forkName = (_lowerCase + "ForkId");
      String _name_2 = it.getName();
      String _lowerCase_1 = _name_2.toLowerCase();
      String forkArrName = (_lowerCase_1 + "ForkArrId");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("ArrayList<Choice> ");
      _builder.append(arrName, "");
      _builder.append(" = new ArrayList<Choice>();");
      _builder.newLineIfNotEmpty();
      {
        EList<Choice> _choices = it.getChoices();
        for(final Choice c : _choices) {
          _builder.append(" ");
          CharSequence _template = this.toTemplate(c, arrName);
          _builder.append(_template, "");
        }
      }
      _builder.append("RankingQuestion ");
      String _name_3 = it.getName();
      _builder.append(_name_3, "");
      _builder.append(" = new RankingQuestion (\"");
      String _name_4 = it.getName();
      _builder.append(_name_4, "");
      _builder.append("\",\"");
      String _question = it.getQuestion();
      _builder.append(_question, "");
      _builder.append("\",");
      boolean _isIsRequired = it.isIsRequired();
      _builder.append(_isIsRequired, "");
      _builder.append(", ");
      _builder.append(arrName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<Choice> _choices_1 = it.getChoices();
        for(final Choice p : _choices_1) {
          {
            EList<RankingSumFork> _forks = it.getForks();
            for(final RankingSumFork q : _forks) {
              {
                EList<Choice> _on = q.getOn();
                boolean _contains = _on.contains(p);
                if (_contains) {
                  EList<RankingSumFork> _forks_1 = it.getForks();
                  int _indexOf = _forks_1.indexOf(q);
                  String _plus = (forkName + Integer.valueOf(_indexOf));
                  EList<Question> _questions = q.getQuestions();
                  String _name_5 = p.getName();
                  String _name_6 = it.getName();
                  int _min = q.getMin();
                  int _max = q.getMax();
                  CharSequence _template_1 = this.toTemplate(_plus, forkArrName, _questions, _name_5, _name_6, _min, _max);
                  _builder.append(_template_1, "");
                  _builder.append(" ");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _builder.append("questions.add(");
      String _name_7 = it.getName();
      _builder.append(_name_7, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _toTemplate(final ConstantSum it) {
    CharSequence _xblockexpression = null;
    {
      String _name = it.getName();
      String arrName = ("arrConstSum" + _name);
      String _name_1 = it.getName();
      String _lowerCase = _name_1.toLowerCase();
      String forkName = (_lowerCase + "ForkId");
      String _name_2 = it.getName();
      String _lowerCase_1 = _name_2.toLowerCase();
      String forkArrName = (_lowerCase_1 + "ForkArrId");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("ArrayList<Choice> ");
      _builder.append(arrName, "");
      _builder.append(" = new ArrayList<Choice>();");
      _builder.newLineIfNotEmpty();
      {
        EList<Choice> _choices = it.getChoices();
        for(final Choice c : _choices) {
          _builder.append(" ");
          CharSequence _template = this.toTemplate(c, arrName);
          _builder.append(_template, "");
        }
      }
      _builder.append("ConstantSumQuestion ");
      String _name_3 = it.getName();
      _builder.append(_name_3, "");
      _builder.append(" = new ConstantSumQuestion (\"");
      String _name_4 = it.getName();
      _builder.append(_name_4, "");
      _builder.append("\",\"");
      String _question = it.getQuestion();
      _builder.append(_question, "");
      _builder.append("\",");
      boolean _isIsRequired = it.isIsRequired();
      _builder.append(_isIsRequired, "");
      _builder.append(", ");
      int _constant = it.getConstant();
      _builder.append(_constant, "");
      _builder.append(",");
      _builder.append(arrName, "");
      _builder.append(" );");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.newLine();
      {
        EList<Choice> _choices_1 = it.getChoices();
        for(final Choice p : _choices_1) {
          {
            EList<RankingSumFork> _forks = it.getForks();
            for(final RankingSumFork q : _forks) {
              {
                EList<Choice> _on = q.getOn();
                boolean _contains = _on.contains(p);
                if (_contains) {
                  EList<RankingSumFork> _forks_1 = it.getForks();
                  int _indexOf = _forks_1.indexOf(q);
                  String _plus = (forkName + Integer.valueOf(_indexOf));
                  EList<Question> _questions = q.getQuestions();
                  String _name_5 = p.getName();
                  String _name_6 = it.getName();
                  int _min = q.getMin();
                  int _max = q.getMax();
                  CharSequence _template_1 = this.toTemplate(_plus, forkArrName, _questions, _name_5, _name_6, _min, _max);
                  _builder.append(_template_1, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _builder.append("questions.add(");
      String _name_7 = it.getName();
      _builder.append(_name_7, "");
      _builder.append(");\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _toTemplate(final Rating it) {
    CharSequence _xblockexpression = null;
    {
      String _name = it.getName();
      String _lowerCase = _name.toLowerCase();
      String forkName = (_lowerCase + "ForkId");
      String _name_1 = it.getName();
      String _lowerCase_1 = _name_1.toLowerCase();
      String forkArrName = (_lowerCase_1 + "ForkArrId");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("RatingQuestion ");
      String _name_2 = it.getName();
      _builder.append(_name_2, "");
      _builder.append(" = new RatingQuestion (\"");
      String _name_3 = it.getName();
      _builder.append(_name_3, "");
      _builder.append("\",\"");
      String _question = it.getQuestion();
      _builder.append(_question, "");
      _builder.append(" \",");
      boolean _isIsRequired = it.isIsRequired();
      _builder.append(_isIsRequired, "");
      _builder.append(", ");
      int _min = it.getMin();
      _builder.append(_min, "");
      _builder.append(", ");
      int _max = it.getMax();
      _builder.append(_max, "");
      _builder.append(", \"");
      String _first = it.getFirst();
      _builder.append(_first, "");
      _builder.append("\",\" ");
      String _last = it.getLast();
      _builder.append(_last, "");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<RatingFork> _forks = it.getForks();
        for(final RatingFork q : _forks) {
          {
            EList<RatingFork> _forks_1 = it.getForks();
            int _size = _forks_1.size();
            boolean _greaterThan = (_size > 0);
            if (_greaterThan) {
              EList<Question> _questions = q.getQuestions();
              String _name_4 = it.getName();
              int _min_1 = q.getMin();
              int _max_1 = q.getMax();
              CharSequence _template = this.toTemplate(forkName, forkArrName, _questions, _name_4, _min_1, _max_1);
              _builder.append(_template, "");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("questions.add(");
      String _name_5 = it.getName();
      _builder.append(_name_5, "");
      _builder.append(");\t\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _toTemplate(final Staple it) {
    CharSequence _xblockexpression = null;
    {
      String _name = it.getName();
      String _lowerCase = _name.toLowerCase();
      String forkName = (_lowerCase + "ForkId");
      String _name_1 = it.getName();
      String _lowerCase_1 = _name_1.toLowerCase();
      String forkArrName = (_lowerCase_1 + "ForkArrId");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Staple ");
      String _name_2 = it.getName();
      _builder.append(_name_2, "");
      _builder.append(" = new Staple (\"");
      String _name_3 = it.getName();
      _builder.append(_name_3, "");
      _builder.append("\",\"");
      String _question = it.getQuestion();
      _builder.append(_question, "");
      _builder.append("\",");
      boolean _isIsRequired = it.isIsRequired();
      _builder.append(_isIsRequired, "");
      _builder.append(",\"");
      String _first = it.getFirst();
      _builder.append(_first, "");
      _builder.append("\", \"");
      String _last = it.getLast();
      _builder.append(_last, "");
      _builder.append("\", \"");
      String _mid = it.getMid();
      _builder.append(_mid, "");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<RatingFork> _forks = it.getForks();
        for(final RatingFork q : _forks) {
          {
            EList<RatingFork> _forks_1 = it.getForks();
            int _size = _forks_1.size();
            boolean _greaterThan = (_size > 0);
            if (_greaterThan) {
              EList<Question> _questions = q.getQuestions();
              String _name_4 = it.getName();
              int _min = q.getMin();
              int _max = q.getMax();
              CharSequence _template = this.toTemplate(forkName, forkArrName, _questions, _name_4, _min, _max);
              _builder.append(_template, "");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("questions.add(");
      String _name_5 = it.getName();
      _builder.append(_name_5, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence toTemplate(final Question it) {
    if (it instanceof ConstantSum) {
      return _toTemplate((ConstantSum)it);
    } else if (it instanceof MultipleChoice) {
      return _toTemplate((MultipleChoice)it);
    } else if (it instanceof Open) {
      return _toTemplate((Open)it);
    } else if (it instanceof Ranking) {
      return _toTemplate((Ranking)it);
    } else if (it instanceof Rating) {
      return _toTemplate((Rating)it);
    } else if (it instanceof Staple) {
      return _toTemplate((Staple)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public CharSequence toTemplate(final String forkname, final String forkarrayname, final EList<Question> questions, final String choicename, final String questionname) {
    {
      return _toTemplate(forkname, forkarrayname, questions, choicename, questionname);
    }
  }
  
  public CharSequence toTemplate(final String forkname, final String forkarrayname, final EList<Question> questions, final String choicename, final String questionname, final int min, final int max) {
    {
      return _toTemplate(forkname, forkarrayname, questions, choicename, questionname, min, max);
    }
  }
  
  public CharSequence toTemplate(final String forkname, final String forkarrayname, final EList<Question> questions, final String questionname, final int min, final int max) {
    {
      return _toTemplate(forkname, forkarrayname, questions, questionname, min, max);
    }
  }
  
  public CharSequence toTemplate(final Choice it, final String arrname) {
    {
      return _toTemplate(it, arrname);
    }
  }
}
