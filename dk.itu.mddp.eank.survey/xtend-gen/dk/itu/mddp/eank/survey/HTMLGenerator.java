package dk.itu.mddp.eank.survey;

import com.google.common.base.Objects;
import com.google.inject.Injector;
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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated;
import survey.ChoiceFork;
import survey.Dichotomous;
import survey.DichotomousFork;
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
public class HTMLGenerator {
  private final static String instanceFileName = "test-files/Tes.survey";
  
  public static void main(final String[] args) {
    try {
      SurveyPackage.eINSTANCE.eClass();
      MyDslStandaloneSetupGenerated _myDslStandaloneSetupGenerated = new MyDslStandaloneSetupGenerated();
      final Injector injector = _myDslStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
      resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.valueOf(true));
      final URI uri = URI.createURI(HTMLGenerator.instanceFileName);
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
        HTMLGenerator.map.put(_get_2, i);
      }
      int _size_1 = questions.size();
      int _minus_1 = (_size_1 - 1);
      IntegerRange _upTo_1 = new IntegerRange(0, _minus_1);
      for (final Integer i_1 : _upTo_1) {
        Question _get_3 = questions.get((i_1).intValue());
        boolean _containsKey = HTMLGenerator.goToMap.containsKey(_get_3);
        boolean _not = (!_containsKey);
        if (_not) {
          Question _get_4 = questions.get((i_1).intValue());
          List<EList<Question>> localQuestions = HTMLGenerator.forkMap(_get_4);
          boolean _and = false;
          boolean _notEquals = (!Objects.equal(localQuestions, null));
          if (!_notEquals) {
            _and = false;
          } else {
            int _size_2 = localQuestions.size();
            boolean _greaterThan = (_size_2 > 0);
            _and = _greaterThan;
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
                EList<Question> _get_6 = localQuestions.get((q).intValue());
                int _size_5 = _get_6.size();
                int _minus_4 = (_size_5 - 1);
                boolean _notEquals_1 = (((p).intValue() + 1) != _minus_4);
                if (_notEquals_1) {
                  EList<Question> _get_7 = localQuestions.get((q).intValue());
                  Question _get_8 = _get_7.get((p).intValue());
                  HTMLGenerator.goToMap.put(_get_8, Integer.valueOf(((p).intValue() + 1)));
                  HTMLGenerator.usedList.add(Integer.valueOf(((p).intValue() + 1)));
                }
              }
            }
          }
        }
      }
      HashMap<Question,Integer> goToMap2 = HTMLGenerator.goToMap;
      Integer _get_9 = goToMap2.get(Integer.valueOf(1));
      InputOutput.<Integer>println(_get_9);
      EList<Survey> _surveys_1 = m.getSurveys();
      Survey _get_10 = _surveys_1.get(0);
      CharSequence _template = HTMLGenerator.toTemplate(_get_10);
      String _string = _template.toString();
      InputOutput.<String>println(_string);
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
  
  private static HashMap<Question,Integer> map = new HashMap<Question, Integer>();
  
  private static HashMap<Question,Integer> goToMap = new HashMap<Question, Integer>();
  
  private static ArrayList<Integer> usedList = new ArrayList<Integer>();
  
  protected static List<EList<Question>> _forkMap(final Open it) {
    return null;
  }
  
  protected static ArrayList<EList<Question>> _forkMap(final Dichotomous it) {
    return null;
  }
  
  protected static List<EList<Question>> _forkMap(final MultipleChoice it) {
    EList<ChoiceFork> _fork = it.getFork();
    final Function1<ChoiceFork,EList<Question>> _function = new Function1<ChoiceFork,EList<Question>>() {
      public EList<Question> apply(final ChoiceFork it) {
        return it.getQuestions();
      }
    };
    return ListExtensions.<ChoiceFork, EList<Question>>map(_fork, _function);
  }
  
  protected static List<EList<Question>> _forkMap(final Ranking it) {
    EList<RankingSumFork> _fork = it.getFork();
    final Function1<RankingSumFork,EList<Question>> _function = new Function1<RankingSumFork,EList<Question>>() {
      public EList<Question> apply(final RankingSumFork it) {
        return it.getQuestions();
      }
    };
    return ListExtensions.<RankingSumFork, EList<Question>>map(_fork, _function);
  }
  
  protected static List<EList<Question>> _forkMap(final Rating it) {
    EList<RatingFork> _fork = it.getFork();
    final Function1<RatingFork,EList<Question>> _function = new Function1<RatingFork,EList<Question>>() {
      public EList<Question> apply(final RatingFork it) {
        return it.getQuestions();
      }
    };
    return ListExtensions.<RatingFork, EList<Question>>map(_fork, _function);
  }
  
  protected static List<EList<Question>> _forkMap(final Staple it) {
    EList<RatingFork> _fork = it.getFork();
    final Function1<RatingFork,EList<Question>> _function = new Function1<RatingFork,EList<Question>>() {
      public EList<Question> apply(final RatingFork it) {
        return it.getQuestions();
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
    CharSequence _xblockexpression = null;
    {
      int to = 0;
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<Question> _questions = it.getQuestions();
        int _size = _questions.size();
        int _minus = (_size - 1);
        IntegerRange _upTo = new IntegerRange(0, _minus);
        for(final Integer i : _upTo) {
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          int _xblockexpression_1 = (int) 0;
          {
            to = ((i).intValue() + 1);
            int _xifexpression = (int) 0;
            boolean _containsKey = HTMLGenerator.goToMap.containsKey(it);
            if (_containsKey) {
              Integer _get = HTMLGenerator.goToMap.get(it);
              _xifexpression = to = (_get).intValue();
            } else {
              boolean _contains = HTMLGenerator.usedList.contains(Integer.valueOf(to));
              boolean _not = (!_contains);
              boolean _while = _not;
              while (_while) {
                to = (to + 1);
                boolean _contains_1 = HTMLGenerator.usedList.contains(Integer.valueOf(to));
                boolean _not_1 = (!_contains_1);
                _while = _not_1;
              }
            }
            _xblockexpression_1 = _xifexpression;
          }
          _builder.append(_xblockexpression_1, "");
          _builder.newLineIfNotEmpty();
          EList<Question> _questions_1 = it.getQuestions();
          Question _get = _questions_1.get((i).intValue());
          CharSequence _template = HTMLGenerator.toTemplate(_get, (i).intValue(), to);
          _builder.append(_template, "");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          _builder.newLine();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _toTemplate(final Open it, final int i, final int to) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<form method=\'POST\' action=\'\' id=\'form-survey-question_");
    _builder.append(i, "");
    _builder.append("\' class=\'smdp\' autocomplete=\'off\' role=\'form\'>");
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
    _builder.append("   ");
    _builder.append("<div class=\"options_container\">");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("<textarea class=\"form-control\" rows=\"3\" cols=\"40\" name=\"comments\" onkeyup=\"return Survey.validateTextarea(this);\"></textarea>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("      \t\t");
    _builder.append("<button type=\"button\" class=\"btn btn-primary btn-sm btn-block\" disabled=\"disabled\" name=\"submitQuestion\" onclick=\"return Survey.saveAnswerData(\'#form-survey-question_");
    _builder.append(i, "      \t\t");
    _builder.append("\', ");
    _builder.append(to, "      \t\t");
    _builder.append(");\">Next Question <span class=\"glyphicon glyphicon-chevron-right\"></span></button>");
    _builder.newLineIfNotEmpty();
    _builder.append("</form>\t");
    _builder.newLine();
    return _builder;
  }
  
  protected static CharSequence _toTemplate(final Dichotomous it, final int i, final int to) {
    CharSequence _xblockexpression = null;
    {
      String nextNoQuestions = "";
      boolean _and = false;
      DichotomousFork _onNo = it.getOnNo();
      boolean _tripleNotEquals = (_onNo != null);
      if (!_tripleNotEquals) {
        _and = false;
      } else {
        DichotomousFork _onNo_1 = it.getOnNo();
        EList<Question> _questions = _onNo_1.getQuestions();
        boolean _notEquals = (!Objects.equal(_questions, null));
        _and = _notEquals;
      }
      if (_and) {
        DichotomousFork _onNo_2 = it.getOnNo();
        EList<Question> _questions_1 = _onNo_2.getQuestions();
        int _size = _questions_1.size();
        int _minus = (_size - 1);
        IntegerRange _upTo = new IntegerRange(0, _minus);
        for (final Integer p : _upTo) {
          {
            DichotomousFork _onNo_3 = it.getOnNo();
            EList<Question> _questions_2 = _onNo_3.getQuestions();
            Question _get = _questions_2.get((p).intValue());
            Integer to2 = HTMLGenerator.map.get(_get);
            nextNoQuestions = ((nextNoQuestions + ",") + to2);
          }
        }
        String _substring = nextNoQuestions.substring(1);
        nextNoQuestions = _substring;
      }
      String nextYesQuestions = "";
      boolean _and_1 = false;
      DichotomousFork _onYes = it.getOnYes();
      boolean _tripleNotEquals_1 = (_onYes != null);
      if (!_tripleNotEquals_1) {
        _and_1 = false;
      } else {
        DichotomousFork _onYes_1 = it.getOnYes();
        EList<Question> _questions_2 = _onYes_1.getQuestions();
        boolean _notEquals_1 = (!Objects.equal(_questions_2, null));
        _and_1 = _notEquals_1;
      }
      if (_and_1) {
        DichotomousFork _onYes_2 = it.getOnYes();
        EList<Question> _questions_3 = _onYes_2.getQuestions();
        int _size_1 = _questions_3.size();
        int _minus_1 = (_size_1 - 1);
        IntegerRange _upTo_1 = new IntegerRange(0, _minus_1);
        for (final Integer p_1 : _upTo_1) {
          DichotomousFork _onYes_3 = it.getOnYes();
          EList<Question> _questions_4 = _onYes_3.getQuestions();
          Question _get = _questions_4.get((p_1).intValue());
          Integer _get_1 = HTMLGenerator.map.get(_get);
          String _plus = ((nextYesQuestions + ",") + _get_1);
          nextYesQuestions = _plus;
        }
        String _substring_1 = nextYesQuestions.substring(1);
        nextYesQuestions = _substring_1;
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<form method=\"POST\" action=\"\" id=\"form-survey-question_");
      _builder.append(i, "");
      _builder.append("\" class=\"smdp\" autocomplete=\"off\" role=\"form\">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("<div class=\"question_container\">");
      _builder.newLine();
      _builder.append("     ");
      _builder.append("<h3 class=\"smdp_question\">");
      String _question = it.getQuestion();
      _builder.append(_question, "     ");
      _builder.append("</h3>");
      _builder.newLineIfNotEmpty();
      _builder.append("   ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("   ");
      _builder.append("<div class=\"options_container\">");
      _builder.newLine();
      _builder.append("     ");
      _builder.append("<div class=\"radio\">");
      _builder.newLine();
      _builder.append("       ");
      _builder.append("<label>");
      _builder.newLine();
      _builder.append("         ");
      _builder.append("<input type=\"radio\" name=\"student\" id=\"student_yes\" value=\"yes\" onClick=\"return Survey.changeSubmitButtonStatus(this); data-next=\"");
      _builder.append(nextYesQuestions, "         ");
      _builder.append("\" />");
      _builder.newLineIfNotEmpty();
      _builder.append("         ");
      _builder.append("Yes");
      _builder.newLine();
      _builder.append("       ");
      _builder.append("</label>");
      _builder.newLine();
      _builder.append("     ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("     ");
      _builder.append("<div class=\"radio\">");
      _builder.newLine();
      _builder.append("       ");
      _builder.append("<label>");
      _builder.newLine();
      _builder.append("         ");
      _builder.append("<input type=\"radio\" name=\"student\" id=\"student_no\" value=\"no\" onClick=\"return Survey.changeSubmitButtonStatus(this);\" data-next=\"");
      _builder.append(nextNoQuestions, "         ");
      _builder.append("\" />");
      _builder.newLineIfNotEmpty();
      _builder.append("         ");
      _builder.append("No");
      _builder.newLine();
      _builder.append("       ");
      _builder.append("</label>");
      _builder.newLine();
      _builder.append("     ");
      _builder.append("</div>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("      \t\t");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("      \t\t");
      _builder.append("<button type=\"button\" class=\"btn btn-primary btn-sm btn-block\" disabled=\"disabled\" name=\"submitQuestion\" onclick=\"return Survey.saveAnswerData(\'#form-survey-question_");
      _builder.append(i, "      \t\t");
      _builder.append("\',");
      Integer _get_2 = HTMLGenerator.goToMap.get(it);
      _builder.append(_get_2, "      \t\t");
      _builder.append(");\">Next Question <span class=\"glyphicon glyphicon-chevron-right\"></span></button>");
      _builder.newLineIfNotEmpty();
      _builder.append("</form>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _toTemplate(final MultipleChoice it, final int i, final int to) {
    StringConcatenation _builder = new StringConcatenation();
    String _question = it.getQuestion();
    _builder.append(_question, "");
    return _builder;
  }
  
  protected static CharSequence _toTemplate(final Ranking it, final int i, final int to) {
    StringConcatenation _builder = new StringConcatenation();
    String _question = it.getQuestion();
    _builder.append(_question, "");
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
    String _question = it.getQuestion();
    _builder.append(_question, "");
    return _builder;
  }
  
  public static List<EList<Question>> forkMap(final Question it) {
    if (it instanceof Staple) {
      return _forkMap((Staple)it);
    } else if (it instanceof Dichotomous) {
      return _forkMap((Dichotomous)it);
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
    } else if (it instanceof Dichotomous) {
      return _toTemplate((Dichotomous)it, i, to);
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
