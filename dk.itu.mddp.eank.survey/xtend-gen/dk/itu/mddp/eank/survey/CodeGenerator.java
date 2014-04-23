package dk.itu.mddp.eank.survey;

import com.google.common.base.Objects;
import com.google.inject.Injector;
import dk.itu.mddp.eank.survey.Constraints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated;
import survey.Choice;
import survey.ChoiceFork;
import survey.Fork;
import survey.Model;
import survey.MultipleChoice;
import survey.Open;
import survey.Question;
import survey.Ranking;
import survey.RankingSumFork;
import survey.Rating;
import survey.RatingFork;
import survey.Staple;
import survey.Survey;
import survey.SurveyPackage;

@SuppressWarnings("all")
public class CodeGenerator {
  private final static String instanceFileName = "test-files/Tes.survey";
  
  public static void main(final String[] args) {
    try {
      SurveyPackage.eINSTANCE.eClass();
      MyDslStandaloneSetupGenerated _myDslStandaloneSetupGenerated = new MyDslStandaloneSetupGenerated();
      final Injector injector = _myDslStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
      resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.valueOf(true));
      final URI uri = URI.createURI(CodeGenerator.instanceFileName);
      Resource resource = resourceSet.getResource(uri, true);
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      final Model m = ((Model) _get);
      EList<Survey> _surveys = m.getSurveys();
      Survey _get_1 = _surveys.get(0);
      final EList<Question> questions = _get_1.getQuestions();
      int _size = questions.size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for (final Integer i : _upTo) {
        Question _get_2 = questions.get((i).intValue());
        CodeGenerator.map.put(_get_2, i);
      }
      int _size_1 = questions.size();
      int _minus_1 = (_size_1 - 1);
      IntegerRange _upTo_1 = new IntegerRange(0, _minus_1);
      for (final Integer i_1 : _upTo_1) {
        Question _get_3 = questions.get((i_1).intValue());
        boolean _containsKey = CodeGenerator.goToMap.containsKey(_get_3);
        boolean _not = (!_containsKey);
        if (_not) {
          Question _get_4 = questions.get((i_1).intValue());
          List<EList<Question>> localQuestions = CodeGenerator.forkMap(_get_4);
          boolean _and = false;
          boolean _notEquals = (!Objects.equal(localQuestions, null));
          if (!_notEquals) {
            _and = false;
          } else {
            int _size_2 = localQuestions.size();
            boolean _greaterThan = (_size_2 > 0);
            _and = (_notEquals && _greaterThan);
          }
          if (_and) {
            int _size_3 = localQuestions.size();
            int _minus_2 = (_size_3 - 1);
            IntegerRange _upTo_2 = new IntegerRange(0, _minus_2);
            for (final Integer q : _upTo_2) {
              EList<Question> _get_5 = localQuestions.get((q).intValue());
              int _size_4 = _get_5.size();
              int _minus_3 = (_size_4 - 1);
              IntegerRange _upTo_3 = new IntegerRange(0, _minus_3);
              for (final Integer p : _upTo_3) {
                int _plus = ((p).intValue() + 1);
                EList<Question> _get_6 = localQuestions.get((q).intValue());
                int _size_5 = _get_6.size();
                int _minus_4 = (_size_5 - 1);
                boolean _notEquals_1 = (_plus != _minus_4);
                if (_notEquals_1) {
                  EList<Question> _get_7 = localQuestions.get((q).intValue());
                  Question _get_8 = _get_7.get((p).intValue());
                  int _plus_1 = ((p).intValue() + 1);
                  CodeGenerator.goToMap.put(_get_8, Integer.valueOf(_plus_1));
                  int _plus_2 = ((p).intValue() + 1);
                  CodeGenerator.usedList.add(Integer.valueOf(_plus_2));
                }
              }
            }
          }
        }
      }
      HashMap<Question,Integer> goToMap2 = CodeGenerator.goToMap;
      EList<Survey> _surveys_1 = m.getSurveys();
      Survey _get_9 = _surveys_1.get(0);
      CharSequence _template = CodeGenerator.toTemplate(_get_9);
      String _string = _template.toString();
      InputOutput.<String>println(_string);
      EList<Survey> _surveys_2 = m.getSurveys();
      Survey _get_10 = _surveys_2.get(0);
      boolean _Constraint = Constraints.Constraint(_get_10);
      if (_Constraint) {
        InputOutput.<String>println("All constraints passed!");
      } else {
        InputOutput.<String>println("Constraints Failed");
      }
      final URI outputURI = URI.createFileURI("test-files/test-output.xmi");
      ResourceSet _resourceSet = resource.getResourceSet();
      URIConverter _uRIConverter = _resourceSet.getURIConverter();
      URI _normalize = _uRIConverter.normalize(outputURI);
      resource.setURI(_normalize);
      resource.save(null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private static HashMap<Question,Integer> map = new Function0<HashMap<Question,Integer>>() {
    public HashMap<Question,Integer> apply() {
      HashMap<Question,Integer> _hashMap = new HashMap<Question, Integer>();
      return _hashMap;
    }
  }.apply();
  
  private static HashMap<Question,Integer> goToMap = new Function0<HashMap<Question,Integer>>() {
    public HashMap<Question,Integer> apply() {
      HashMap<Question,Integer> _hashMap = new HashMap<Question, Integer>();
      return _hashMap;
    }
  }.apply();
  
  private static ArrayList<Integer> usedList = new Function0<ArrayList<Integer>>() {
    public ArrayList<Integer> apply() {
      ArrayList<Integer> _arrayList = new ArrayList<Integer>();
      return _arrayList;
    }
  }.apply();
  
  protected static List<EList<Question>> _forkMap(final Open it) {
    return null;
  }
  
  protected static List<EList<Question>> _forkMap(final MultipleChoice it) {
    EList<ChoiceFork> _fork = it.getFork();
    final Function1<ChoiceFork,EList<Question>> _function = new Function1<ChoiceFork,EList<Question>>() {
      public EList<Question> apply(final ChoiceFork it) {
        EList<Question> _questions = it.getQuestions();
        return _questions;
      }
    };
    return ListExtensions.<ChoiceFork, EList<Question>>map(_fork, _function);
  }
  
  protected static List<EList<Question>> _forkMap(final Ranking it) {
    EList<RankingSumFork> _fork = it.getFork();
    final Function1<RankingSumFork,EList<Question>> _function = new Function1<RankingSumFork,EList<Question>>() {
      public EList<Question> apply(final RankingSumFork it) {
        EList<Question> _questions = it.getQuestions();
        return _questions;
      }
    };
    return ListExtensions.<RankingSumFork, EList<Question>>map(_fork, _function);
  }
  
  protected static List<EList<Question>> _forkMap(final Rating it) {
    EList<RatingFork> _fork = it.getFork();
    final Function1<RatingFork,EList<Question>> _function = new Function1<RatingFork,EList<Question>>() {
      public EList<Question> apply(final RatingFork it) {
        EList<Question> _questions = it.getQuestions();
        return _questions;
      }
    };
    return ListExtensions.<RatingFork, EList<Question>>map(_fork, _function);
  }
  
  protected static List<EList<Question>> _forkMap(final Staple it) {
    EList<RatingFork> _fork = it.getFork();
    final Function1<RatingFork,EList<Question>> _function = new Function1<RatingFork,EList<Question>>() {
      public EList<Question> apply(final RatingFork it) {
        EList<Question> _questions = it.getQuestions();
        return _questions;
      }
    };
    return ListExtensions.<RatingFork, EList<Question>>map(_fork, _function);
  }
  
  public static List<EList<Question>> getQuestions(final Fork it) {
    EList<Question> _questions = it.getQuestions();
    final Function1<Question,EList<Question>> _function = new Function1<Question,EList<Question>>() {
      public EList<Question> apply(final Question it) {
        return null;
      }
    };
    return ListExtensions.<Question, EList<Question>>map(_questions, _function);
  }
  
  protected static CharSequence _toTemplate(final Survey it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Question> _questions = it.getQuestions();
      int _size = _questions.size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer i : _upTo) {
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        CharSequence _xblockexpression = null;
        {
          int to = ((i).intValue() + 2);
          EList<Question> _questions_1 = it.getQuestions();
          Question _get = _questions_1.get((i).intValue());
          boolean _containsKey = CodeGenerator.goToMap.containsKey(_get);
          if (_containsKey) {
            EList<Question> _questions_2 = it.getQuestions();
            Question _get_1 = _questions_2.get((i).intValue());
            Integer _get_2 = CodeGenerator.goToMap.get(_get_1);
            to = (_get_2).intValue();
          } else {
            boolean _contains = CodeGenerator.usedList.contains(Integer.valueOf(to));
            boolean _while = _contains;
            while (_while) {
              int _plus = (to + 1);
              to = _plus;
              boolean _contains_1 = CodeGenerator.usedList.contains(Integer.valueOf(to));
              _while = _contains_1;
            }
          }
          EList<Question> _questions_3 = it.getQuestions();
          Question _get_3 = _questions_3.get((i).intValue());
          CharSequence _template = CodeGenerator.toTemplate(_get_3, (i).intValue(), to);
          _xblockexpression = (_template);
        }
        _builder.append(_xblockexpression, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected static CharSequence _toTemplate(final Open it, final int i, final int to) {
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
    _builder.append(_question, "	");
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
  
  protected static CharSequence _toTemplate(final MultipleChoice it, final int i, final int to) {
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
      int _size = _choice.size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer p : _upTo) {
        _builder.append("<div class=\"checkbox\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<label>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<input type=\"checkbox\" name=\"");
        String _name_1 = it.getName();
        _builder.append(_name_1, "		");
        _builder.append("\" id=\"option_");
        EList<Choice> _choice_1 = it.getChoice();
        Choice _get = _choice_1.get((p).intValue());
        String _name_2 = _get.getName();
        String _normalize_1 = CodeGenerator.normalize(_name_2);
        _builder.append(_normalize_1, "		");
        _builder.append("\" value=\"");
        EList<Choice> _choice_2 = it.getChoice();
        Choice _get_1 = _choice_2.get((p).intValue());
        String _description = _get_1.getDescription();
        _builder.append(_description, "		");
        _builder.append("\" onClick=\"return Survey.changeSubmitButtonStatus(this);\" data-next=");
        {
          EList<ChoiceFork> _fork = it.getFork();
          int _size_1 = _fork.size();
          int _minus_1 = (_size_1 - 1);
          IntegerRange _upTo_1 = new IntegerRange(0, _minus_1);
          for(final Integer q : _upTo_1) {
            {
              EList<ChoiceFork> _fork_1 = it.getFork();
              ChoiceFork _get_2 = _fork_1.get((q).intValue());
              EList<Choice> _on = _get_2.getOn();
              EList<Choice> _choice_3 = it.getChoice();
              Choice _get_3 = _choice_3.get((p).intValue());
              boolean _contains = _on.contains(_get_3);
              if (_contains) {
                EList<ChoiceFork> _fork_2 = it.getFork();
                ChoiceFork _get_4 = _fork_2.get((q).intValue());
                EList<Question> _questions = _get_4.getQuestions();
                Question _get_5 = _questions.get(0);
                Integer _get_6 = CodeGenerator.map.get(_get_5);
                int _plus = ((_get_6).intValue() + 1);
                _builder.append(_plus, "		");
              }
            }
          }
        }
        _builder.append("\" /> ");
        EList<Choice> _choice_4 = it.getChoice();
        Choice _get_7 = _choice_4.get((p).intValue());
        String _description_1 = _get_7.getDescription();
        _builder.append(_description_1, "		");
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
        _and = (_notEquals && _not);
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
        _builder.append(_normalize_2, "		");
        _builder.append("\" id=\"option_");
        String _other_3 = it.getOther();
        String _normalize_3 = CodeGenerator.normalize(_other_3);
        _builder.append(_normalize_3, "		");
        _builder.append("\" value=\"");
        String _other_4 = it.getOther();
        String _normalize_4 = CodeGenerator.normalize(_other_4);
        _builder.append(_normalize_4, "		");
        _builder.append("\" onClick=\"return Survey.changeSubmitButtonStatus(this);\' />");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t  \t\t\t");
        String _other_5 = it.getOther();
        _builder.append(_other_5, "		  			");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</label>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<input type=\"text\" class=\"form-control other\" id=\'");
        String _other_6 = it.getOther();
        String _normalize_5 = CodeGenerator.normalize(_other_6);
        _builder.append(_normalize_5, "	");
        _builder.append("\' maxlength=\'30\' data-for=\"#option_");
        String _other_7 = it.getOther();
        String _normalize_6 = CodeGenerator.normalize(_other_7);
        _builder.append(_normalize_6, "	");
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
    _builder.append(_normalize_7, "	");
    _builder.append("\', ");
    _builder.append(to, "	");
    _builder.append(");\">Next Question <span class=\"glyphicon glyphicon-chevron-right\"></span></button>");
    _builder.newLineIfNotEmpty();
    _builder.append("</form>");
    _builder.newLine();
    return _builder;
  }
  
  protected static CharSequence _toTemplate(final Ranking it, final int i, final int to) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<form method=\"POST\" action=\"\" id=\"");
    String _name = it.getName();
    String _normalize = CodeGenerator.normalize(_name);
    _builder.append(_normalize, "");
    _builder.append("\" class=\"smdp\" autocomplete=\"off\" role=\"form\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div class=\"question_container\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h3 class=\"smdp_question\">");
    String _question = it.getQuestion();
    _builder.append(_question, "		");
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
      int _size = _choices.size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer p : _upTo) {
        _builder.append("<div class=\"form-group\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<label for=\"ranking_");
        EList<Choice> _choices_1 = it.getChoices();
        Choice _get = _choices_1.get((p).intValue());
        String _name_1 = _get.getName();
        String _normalize_1 = CodeGenerator.normalize(_name_1);
        _builder.append(_normalize_1, "	");
        _builder.append("\" class=\"col-xs-9 control-label\">");
        EList<Choice> _choices_2 = it.getChoices();
        Choice _get_1 = _choices_2.get((p).intValue());
        String _description = _get_1.getDescription();
        _builder.append(_description, "	");
        _builder.append("</label>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<div class=\"col-xs-3\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<input type=\"number\" class=\"form-control rating\" id=\"ranking_");
        EList<Choice> _choices_3 = it.getChoices();
        Choice _get_2 = _choices_3.get((p).intValue());
        String _name_2 = _get_2.getName();
        String _normalize_2 = CodeGenerator.normalize(_name_2);
        _builder.append(_normalize_2, "		");
        _builder.append("\" maxlength=\"2\" onkeyup=\"return Survey.rankingUpdate(this);\" name=\"rating_");
        EList<Choice> _choices_4 = it.getChoices();
        Choice _get_3 = _choices_4.get((p).intValue());
        String _name_3 = _get_3.getName();
        String _normalize_3 = CodeGenerator.normalize(_name_3);
        _builder.append(_normalize_3, "		");
        _builder.append("\" data-next=\"");
        {
          EList<RankingSumFork> _fork = it.getFork();
          int _size_1 = _fork.size();
          int _minus_1 = (_size_1 - 1);
          IntegerRange _upTo_1 = new IntegerRange(0, _minus_1);
          for(final Integer q : _upTo_1) {
            {
              EList<RankingSumFork> _fork_1 = it.getFork();
              RankingSumFork _get_4 = _fork_1.get((q).intValue());
              EList<Choice> _on = _get_4.getOn();
              EList<Choice> _choices_5 = it.getChoices();
              Choice _get_5 = _choices_5.get((p).intValue());
              boolean _contains = _on.contains(_get_5);
              if (_contains) {
                EList<RankingSumFork> _fork_2 = it.getFork();
                RankingSumFork _get_6 = _fork_2.get((q).intValue());
                EList<Question> _questions = _get_6.getQuestions();
                Question _get_7 = _questions.get(0);
                Integer _get_8 = CodeGenerator.map.get(_get_7);
                int _plus = ((_get_8).intValue() + 1);
                _builder.append(_plus, "		");
              }
            }
          }
        }
        _builder.append("\" />");
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
      boolean _isIsRequired = it.isIsRequired();
      if (_isIsRequired) {
        _builder.append(" disabled=\"disabled\"");
      }
    }
    _builder.append(" name=\"submitQuestion\" onclick=\"return Survey.saveAnswerData(\'#");
    String _name_4 = it.getName();
    String _normalize_4 = CodeGenerator.normalize(_name_4);
    _builder.append(_normalize_4, "	");
    _builder.append("\', ");
    _builder.append(to, "	");
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
    return _builder;
  }
  
  protected static CharSequence _toTemplate(final Rating it, final int i, final int to) {
    StringConcatenation _builder = new StringConcatenation();
    String _question = it.getQuestion();
    _builder.append(_question, "");
    return _builder;
  }
  
  protected static CharSequence _toTemplate(final Staple it, final int i, final int to) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<form method=\"POST\" action=\"\" id=\"form-survey-question_");
    _builder.append(i, "");
    _builder.append("\" class=\"smdp last required\" autocomplete=\"off\" role=\"form\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t    ");
    _builder.append("<div class=\"question_container\">");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("<h3 class=\"smdp_question\">");
    String _question = it.getQuestion();
    _builder.append(_question, "		      ");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("<div class=\"options_container\">");
    _builder.newLine();
    _builder.append("\t\t    \t");
    _builder.append("<table class=\"table table-striped table-bordered table-condensed\">");
    _builder.newLine();
    _builder.append("\t\t    \t\t");
    _builder.append("<tr>    \t\t");
    _builder.newLine();
    _builder.append("\t\t    \t\t\t");
    _builder.append("<th></th>");
    _builder.newLine();
    {
      int _max = it.getMax();
      int _min = it.getMin();
      IntegerRange _upTo = new IntegerRange(_max, _min);
      for(final Integer p : _upTo) {
        _builder.append("\t\t    \t\t\t");
        _builder.newLine();
        _builder.append("\t\t    \t\t\t");
        _builder.newLine();
        {
          boolean _greaterThan = ((p).intValue() > 0);
          if (_greaterThan) {
            _builder.append("\t\t    \t\t\t");
            _builder.append("<th>(+");
            _builder.append(p, "		    			");
            _builder.append(") ");
            {
              int _max_1 = it.getMax();
              boolean _equals = ((p).intValue() == _max_1);
              if (_equals) {
                String _first = it.getFirst();
                _builder.append(_first, "		    			");
              }
            }
            {
              int _min_1 = it.getMin();
              boolean _equals_1 = ((p).intValue() == _min_1);
              if (_equals_1) {
                String _last = it.getLast();
                _builder.append(_last, "		    			");
              }
            }
            _builder.append("</th>");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          int _max_2 = it.getMax();
          int _min_2 = it.getMin();
          int _plus = (_max_2 + _min_2);
          int _divide = (_plus / 2);
          boolean _equals_2 = ((p).intValue() == _divide);
          if (_equals_2) {
            _builder.append("<th>");
            String _mid = it.getMid();
            _builder.append(_mid, "");
            _builder.append("</th>");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _lessThan = ((p).intValue() < 0);
          if (_lessThan) {
            _builder.append("<th>(");
            _builder.append(p, "");
            _builder.append(") ");
            {
              int _max_3 = it.getMax();
              boolean _equals_3 = ((p).intValue() == _max_3);
              if (_equals_3) {
                String _first_1 = it.getFirst();
                _builder.append(_first_1, "");
              }
            }
            {
              int _min_3 = it.getMin();
              boolean _equals_4 = ((p).intValue() == _min_3);
              if (_equals_4) {
                String _last_1 = it.getLast();
                _builder.append(_last_1, "");
              }
            }
            _builder.append("</th>\t\t\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<!-- Item to rate -->");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<td class=\"item\"></td>");
    _builder.newLine();
    {
      int _max_4 = it.getMax();
      int _min_4 = it.getMin();
      IntegerRange _upTo_1 = new IntegerRange(_max_4, _min_4);
      for(final Integer p_1 : _upTo_1) {
        _builder.append("\t\t\t\t\t\t");
        _builder.append("<td>");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("\t");
        _builder.append("<label class=\"radio-inline\">");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("\t  \t");
        _builder.append("<input type=\"radio\" id=\"option");
        _builder.append(p_1, "							  	");
        _builder.append("\" name=\"option");
        _builder.append(p_1, "							  	");
        _builder.append("\" value=\"");
        _builder.append(p_1, "							  	");
        _builder.append("\" onclick=\"return Survey.ratingUpdate(this);\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("\t");
        _builder.append("</label>");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("</td>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<!-- Item to rate End -->");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</table>");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("<button type=\"button\" class=\"btn btn-primary btn-sm btn-block\" disabled=\"disabled\" name=\"submitQuestion\" onclick=\"return Survey.saveAnswerData(\'#form-survey-question_");
    _builder.append(i, "		      ");
    _builder.append(", ");
    _builder.append(to, "		      ");
    _builder.append("\');\">Next Question <span class=\"glyphicon glyphicon-chevron-right\"></span></button>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</form>");
    return _builder;
  }
  
  public static String normalize(final String string) {
    String _replaceAll = string.replaceAll("(^[^a-zA-Z])*(\\W+)", "");
    return _replaceAll;
  }
  
  public static List<EList<Question>> forkMap(final Question it) {
    if (it instanceof Staple) {
      return _forkMap((Staple)it);
    } else if (it instanceof MultipleChoice) {
      return _forkMap((MultipleChoice)it);
    } else if (it instanceof Open) {
      return _forkMap((Open)it);
    } else if (it instanceof Ranking) {
      return _forkMap((Ranking)it);
    } else if (it instanceof Rating) {
      return _forkMap((Rating)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public static CharSequence toTemplate(final Survey it) {
    {
      return _toTemplate(it);
    }
  }
  
  public static CharSequence toTemplate(final Question it, final int i, final int to) {
    if (it instanceof Staple) {
      return _toTemplate((Staple)it, i, to);
    } else if (it instanceof MultipleChoice) {
      return _toTemplate((MultipleChoice)it, i, to);
    } else if (it instanceof Open) {
      return _toTemplate((Open)it, i, to);
    } else if (it instanceof Ranking) {
      return _toTemplate((Ranking)it, i, to);
    } else if (it instanceof Rating) {
      return _toTemplate((Rating)it, i, to);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, i, to).toString());
    }
  }
}
