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
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated;
import survey.Choice;
import survey.ChoiceFork;
import survey.ConstantSum;
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
public abstract class CodeGenerator {
  protected final static String instanceFileName = "test-files/Tes.survey";
  
  protected static HashMap<Question,Integer> map = new HashMap<Question, Integer>();
  
  protected static HashMap<Question,Integer> goToMap = new HashMap<Question, Integer>();
  
  protected static HashMap<Question,Integer> next = new HashMap<Question, Integer>();
  
  protected static ArrayList<Integer> usedList = new ArrayList<Integer>();
  
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
      final Procedure1<Question> _function = new Procedure1<Question>() {
        public void apply(final Question it) {
          CodeGenerator.changeChoices(it);
        }
      };
      IterableExtensions.<Question>forEach(questions, _function);
      final Procedure2<Question,Integer> _function_1 = new Procedure2<Question,Integer>() {
        public void apply(final Question q, final Integer i) {
          CodeGenerator.map.put(q, i);
        }
      };
      IterableExtensions.<Question>forEach(questions, _function_1);
      final Procedure1<Question> _function_2 = new Procedure1<Question>() {
        public void apply(final Question q) {
          List<EList<Question>> localQuestions = CodeGenerator.forkMap(q);
          boolean _notEquals = (!Objects.equal(localQuestions, null));
          if (_notEquals) {
            final Procedure1<EList<Question>> _function = new Procedure1<EList<Question>>() {
              public void apply(final EList<Question> localQuestion) {
                int _size = localQuestion.size();
                IntegerRange _upTo = new IntegerRange(0, _size);
                for (final Integer p : _upTo) {
                  int _size_1 = localQuestion.size();
                  boolean _notEquals = ((p).intValue() != _size_1);
                  if (_notEquals) {
                    Question _get = localQuestion.get((p).intValue());
                    Integer _get_1 = CodeGenerator.map.get(_get);
                    CodeGenerator.usedList.add(_get_1);
                  }
                }
              }
            };
            IterableExtensions.<EList<Question>>forEach(localQuestions, _function);
          }
        }
      };
      IterableExtensions.<Question>forEach(questions, _function_2);
      final Procedure1<Question> _function_3 = new Procedure1<Question>() {
        public void apply(final Question q) {
          List<EList<Question>> localQuestions = CodeGenerator.forkMap(q);
          boolean _containsKey = CodeGenerator.goToMap.containsKey(q);
          boolean _not = (!_containsKey);
          if (_not) {
            Integer _get = CodeGenerator.map.get(q);
            int to = ((_get).intValue() + 1);
            boolean _contains = CodeGenerator.usedList.contains(Integer.valueOf(to));
            boolean _while = _contains;
            while (_while) {
              to = (to + 1);
              boolean _contains_1 = CodeGenerator.usedList.contains(Integer.valueOf(to));
              _while = _contains_1;
            }
            CodeGenerator.goToMap.put(q, Integer.valueOf(to));
          }
          boolean _notEquals = (!Objects.equal(localQuestions, null));
          if (_notEquals) {
            final Procedure1<EList<Question>> _function = new Procedure1<EList<Question>>() {
              public void apply(final EList<Question> localQuestion) {
                int _size = localQuestion.size();
                IntegerRange _upTo = new IntegerRange(0, _size);
                for (final Integer p : _upTo) {
                  int _size_1 = localQuestion.size();
                  boolean _notEquals = ((p).intValue() != _size_1);
                  if (_notEquals) {
                    int _size_2 = localQuestion.size();
                    int _minus = (_size_2 - 1);
                    boolean _notEquals_1 = ((p).intValue() != _minus);
                    if (_notEquals_1) {
                      Question _get = localQuestion.get((p).intValue());
                      Question _get_1 = localQuestion.get(((p).intValue() + 1));
                      Integer _get_2 = CodeGenerator.map.get(_get_1);
                      CodeGenerator.goToMap.put(_get, _get_2);
                    } else {
                      Question _get_3 = localQuestion.get((p).intValue());
                      Integer _get_4 = CodeGenerator.goToMap.get(q);
                      CodeGenerator.goToMap.put(_get_3, _get_4);
                    }
                  }
                }
              }
            };
            IterableExtensions.<EList<Question>>forEach(localQuestions, _function);
          }
        }
      };
      IterableExtensions.<Question>forEach(questions, _function_3);
      HashMap<Question,Integer> goToMap2 = CodeGenerator.goToMap;
      EList<Survey> _surveys_1 = m.getSurveys();
      Survey _get_2 = _surveys_1.get(0);
      CharSequence _template = CodeGenerator.toTemplate(_get_2);
      String _string = _template.toString();
      InputOutput.<String>println(_string);
      EList<Survey> _surveys_2 = m.getSurveys();
      Survey _get_3 = _surveys_2.get(0);
      boolean _Constraint = Constraints.Constraint(_get_3);
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
  
  protected static CharSequence _toTemplate(final Survey it) {
    throw new Error("Unresolved compilation problems:"
      + "\nCannot make a static reference to the non-static method toTemplate from the type CodeGenerator"
      + "\nType mismatch: cannot convert from Question to Open");
  }
  
  public abstract void toTemplate(final Open it, final int to);
  
  public abstract void toTemplate(final MultipleChoice it, final int to);
  
  public abstract void toTemplate(final Ranking it, final int to);
  
  public abstract void toTemplate(final Rating it, final int to);
  
  public abstract void toTemplate(final ConstantSum it, final int to);
  
  public abstract void toTemplate(final Staple it, final int to);
  
  protected static Object _changeChoices(final Open it) {
    return null;
  }
  
  protected static Object _changeChoices(final Rating it) {
    return null;
  }
  
  protected static Object _changeChoices(final Staple it) {
    return null;
  }
  
  protected static Object _changeChoices(final MultipleChoice it) {
    EList<ChoiceFork> _fork = it.getFork();
    final Procedure1<ChoiceFork> _function = new Procedure1<ChoiceFork>() {
      public void apply(final ChoiceFork f) {
        EList<Choice> _choice = it.getChoice();
        final Procedure1<Choice> _function = new Procedure1<Choice>() {
          public void apply(final Choice c) {
            EList<Choice> _on = f.getOn();
            final Function1<Choice,Boolean> _function = new Function1<Choice,Boolean>() {
              public Boolean apply(final Choice x) {
                String _name = x.getName();
                String _name_1 = c.getName();
                return Boolean.valueOf(Objects.equal(_name, _name_1));
              }
            };
            boolean _exists = IterableExtensions.<Choice>exists(_on, _function);
            if (_exists) {
              EList<Choice> _on_1 = f.getOn();
              EList<Choice> _on_2 = f.getOn();
              final Function1<Choice,Boolean> _function_1 = new Function1<Choice,Boolean>() {
                public Boolean apply(final Choice x) {
                  String _name = x.getName();
                  String _name_1 = c.getName();
                  return Boolean.valueOf(Objects.equal(_name, _name_1));
                }
              };
              Choice _findFirst = IterableExtensions.<Choice>findFirst(_on_2, _function_1);
              _on_1.remove(_findFirst);
              EList<Choice> _on_3 = f.getOn();
              _on_3.add(c);
            }
          }
        };
        IterableExtensions.<Choice>forEach(_choice, _function);
      }
    };
    IterableExtensions.<ChoiceFork>forEach(_fork, _function);
    return null;
  }
  
  protected static Object _changeChoices(final ConstantSum it) {
    EList<RankingSumFork> _fork = it.getFork();
    final Procedure1<RankingSumFork> _function = new Procedure1<RankingSumFork>() {
      public void apply(final RankingSumFork f) {
        EList<Choice> _choices = it.getChoices();
        final Procedure1<Choice> _function = new Procedure1<Choice>() {
          public void apply(final Choice c) {
            EList<Choice> _on = f.getOn();
            final Function1<Choice,Boolean> _function = new Function1<Choice,Boolean>() {
              public Boolean apply(final Choice x) {
                String _name = x.getName();
                String _name_1 = c.getName();
                return Boolean.valueOf(Objects.equal(_name, _name_1));
              }
            };
            boolean _exists = IterableExtensions.<Choice>exists(_on, _function);
            if (_exists) {
              EList<Choice> _on_1 = f.getOn();
              EList<Choice> _on_2 = f.getOn();
              final Function1<Choice,Boolean> _function_1 = new Function1<Choice,Boolean>() {
                public Boolean apply(final Choice x) {
                  String _name = x.getName();
                  String _name_1 = c.getName();
                  return Boolean.valueOf(Objects.equal(_name, _name_1));
                }
              };
              Choice _findFirst = IterableExtensions.<Choice>findFirst(_on_2, _function_1);
              _on_1.remove(_findFirst);
              EList<Choice> _on_3 = f.getOn();
              _on_3.add(c);
            }
          }
        };
        IterableExtensions.<Choice>forEach(_choices, _function);
      }
    };
    IterableExtensions.<RankingSumFork>forEach(_fork, _function);
    return null;
  }
  
  protected static Object _changeChoices(final Ranking it) {
    EList<RankingSumFork> _fork = it.getFork();
    final Procedure1<RankingSumFork> _function = new Procedure1<RankingSumFork>() {
      public void apply(final RankingSumFork f) {
        EList<Choice> _choices = it.getChoices();
        final Procedure1<Choice> _function = new Procedure1<Choice>() {
          public void apply(final Choice c) {
            EList<Choice> _on = f.getOn();
            final Function1<Choice,Boolean> _function = new Function1<Choice,Boolean>() {
              public Boolean apply(final Choice x) {
                String _name = x.getName();
                String _name_1 = c.getName();
                return Boolean.valueOf(Objects.equal(_name, _name_1));
              }
            };
            boolean _exists = IterableExtensions.<Choice>exists(_on, _function);
            if (_exists) {
              EList<Choice> _on_1 = f.getOn();
              EList<Choice> _on_2 = f.getOn();
              final Function1<Choice,Boolean> _function_1 = new Function1<Choice,Boolean>() {
                public Boolean apply(final Choice x) {
                  String _name = x.getName();
                  String _name_1 = c.getName();
                  return Boolean.valueOf(Objects.equal(_name, _name_1));
                }
              };
              Choice _findFirst = IterableExtensions.<Choice>findFirst(_on_2, _function_1);
              _on_1.remove(_findFirst);
              EList<Choice> _on_3 = f.getOn();
              _on_3.add(c);
            }
          }
        };
        IterableExtensions.<Choice>forEach(_choices, _function);
      }
    };
    IterableExtensions.<RankingSumFork>forEach(_fork, _function);
    return null;
  }
  
  protected static List<EList<Question>> _forkMap(final Open it) {
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
  
  protected static List<EList<Question>> _forkMap(final ConstantSum it) {
    EList<RankingSumFork> _fork = it.getFork();
    final Function1<RankingSumFork,EList<Question>> _function = new Function1<RankingSumFork,EList<Question>>() {
      public EList<Question> apply(final RankingSumFork it) {
        return it.getQuestions();
      }
    };
    return ListExtensions.<RankingSumFork, EList<Question>>map(_fork, _function);
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
  
  /**
   * Removes all non-alphanumeric characters in a string
   */
  public static String normalize(final String string) {
    return string.replaceAll("(^[^a-zA-Z])*(\\W+)", "");
  }
  
  public static String toInt(final String name) {
    return name.replaceAll("([^0-9])*", "");
  }
  
  public static CharSequence toTemplate(final Survey it) {
    {
      return _toTemplate(it);
    }
  }
  
  public static Object changeChoices(final Question it) {
    if (it instanceof Staple) {
      return _changeChoices((Staple)it);
    } else if (it instanceof ConstantSum) {
      return _changeChoices((ConstantSum)it);
    } else if (it instanceof MultipleChoice) {
      return _changeChoices((MultipleChoice)it);
    } else if (it instanceof Open) {
      return _changeChoices((Open)it);
    } else if (it instanceof Ranking) {
      return _changeChoices((Ranking)it);
    } else if (it instanceof Rating) {
      return _changeChoices((Rating)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public static List<EList<Question>> forkMap(final Question it) {
    if (it instanceof Staple) {
      return _forkMap((Staple)it);
    } else if (it instanceof ConstantSum) {
      return _forkMap((ConstantSum)it);
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
}
