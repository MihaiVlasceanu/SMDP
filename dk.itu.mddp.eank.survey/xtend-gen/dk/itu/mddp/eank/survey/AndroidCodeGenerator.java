package dk.itu.mddp.eank.survey;

import com.google.common.base.Objects;
import com.google.inject.Injector;
import dk.itu.mddp.eank.survey.Constraints;
import java.util.Arrays;
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
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated;
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
import survey.SurveyPackage;

@SuppressWarnings("all")
public class AndroidCodeGenerator {
  private final static String instanceFileName = "test-files/Tes.survey";
  
  public static void main(final String[] args) {
    try {
      SurveyPackage.eINSTANCE.eClass();
      MyDslStandaloneSetupGenerated _myDslStandaloneSetupGenerated = new MyDslStandaloneSetupGenerated();
      final Injector injector = _myDslStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
      resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.valueOf(true));
      final URI uri = URI.createURI(AndroidCodeGenerator.instanceFileName);
      Resource resource = resourceSet.getResource(uri, true);
      final Resource contents = resource;
      EList<EObject> _contents = contents.getContents();
      EObject _get = _contents.get(0);
      final Survey m = ((Survey) _get);
      final EList<Question> questions = m.getQuestions();
      final Procedure1<Question> _function = new Procedure1<Question>() {
        public void apply(final Question it) {
          AndroidCodeGenerator.changeChoices(it);
        }
      };
      IterableExtensions.<Question>forEach(questions, _function);
      CharSequence _template = AndroidCodeGenerator.toTemplate(m);
      String _string = _template.toString();
      InputOutput.<String>println(_string);
      boolean _Constraint = Constraints.Constraint(m);
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
    EList<ChoiceFork> _forks = it.getForks();
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
    IterableExtensions.<ChoiceFork>forEach(_forks, _function);
    return null;
  }
  
  protected static Object _changeChoices(final ConstantSum it) {
    EList<RankingSumFork> _forks = it.getForks();
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
    IterableExtensions.<RankingSumFork>forEach(_forks, _function);
    return null;
  }
  
  protected static Object _changeChoices(final Ranking it) {
    EList<RankingSumFork> _forks = it.getForks();
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
    IterableExtensions.<RankingSumFork>forEach(_forks, _function);
    return null;
  }
  
  protected static CharSequence _toTemplate(final Survey it) {
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
        Object _template = AndroidCodeGenerator.toTemplate(question);
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
    return _builder;
  }
  
  protected static CharSequence _toTemplate(final Open it) {
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
  
  protected static CharSequence _toTemplate(final String forkname, final String forkarrayname, final EList<Question> questions, final String choicename, final String questionname) {
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
  
  protected static CharSequence _toTemplate(final String forkname, final String forkarrayname, final EList<Question> questions, final String choicename, final String questionname, final int min, final int max) {
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
  
  protected static CharSequence _toTemplate(final String forkname, final String forkarrayname, final EList<Question> questions, final String questionname, final int min, final int max) {
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
  
  protected static CharSequence _toTemplate(final MultipleChoice it) {
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
          CharSequence _template = AndroidCodeGenerator.toTemplate(c, arrName);
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
                  CharSequence _template_1 = AndroidCodeGenerator.toTemplate(forkName, forkArrName, _questions, _name_5, _name_6);
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
  
  protected static CharSequence _toTemplate(final Choice it, final String arrname) {
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
  
  protected static CharSequence _toTemplate(final Ranking it) {
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
          CharSequence _template = AndroidCodeGenerator.toTemplate(c, arrName);
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
                  CharSequence _template_1 = AndroidCodeGenerator.toTemplate(_plus, forkArrName, _questions, _name_5, _name_6, _min, _max);
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
  
  protected static CharSequence _toTemplate(final ConstantSum it) {
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
          CharSequence _template = AndroidCodeGenerator.toTemplate(c, arrName);
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
                  CharSequence _template_1 = AndroidCodeGenerator.toTemplate(_plus, forkArrName, _questions, _name_5, _name_6, _min, _max);
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
  
  protected static CharSequence _toTemplate(final Rating it) {
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
              CharSequence _template = AndroidCodeGenerator.toTemplate(forkName, forkArrName, _questions, _name_4, _min_1, _max_1);
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
  
  protected static CharSequence _toTemplate(final Staple it) {
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
      _builder.append(",");
      int _min = it.getMin();
      _builder.append(_min, "");
      _builder.append(",");
      int _max = it.getMax();
      _builder.append(_max, "");
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
              int _min_1 = q.getMin();
              int _max_1 = q.getMax();
              CharSequence _template = AndroidCodeGenerator.toTemplate(forkName, forkArrName, _questions, _name_4, _min_1, _max_1);
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
  
  public static CharSequence toTemplate(final EObject it) {
    if (it instanceof Staple) {
      return _toTemplate((Staple)it);
    } else if (it instanceof ConstantSum) {
      return _toTemplate((ConstantSum)it);
    } else if (it instanceof MultipleChoice) {
      return _toTemplate((MultipleChoice)it);
    } else if (it instanceof Open) {
      return _toTemplate((Open)it);
    } else if (it instanceof Ranking) {
      return _toTemplate((Ranking)it);
    } else if (it instanceof Rating) {
      return _toTemplate((Rating)it);
    } else if (it instanceof Survey) {
      return _toTemplate((Survey)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public static CharSequence toTemplate(final String forkname, final String forkarrayname, final EList<Question> questions, final String choicename, final String questionname) {
    {
      return _toTemplate(forkname, forkarrayname, questions, choicename, questionname);
    }
  }
  
  public static CharSequence toTemplate(final String forkname, final String forkarrayname, final EList<Question> questions, final String choicename, final String questionname, final int min, final int max) {
    {
      return _toTemplate(forkname, forkarrayname, questions, choicename, questionname, min, max);
    }
  }
  
  public static CharSequence toTemplate(final String forkname, final String forkarrayname, final EList<Question> questions, final String questionname, final int min, final int max) {
    {
      return _toTemplate(forkname, forkarrayname, questions, questionname, min, max);
    }
  }
  
  public static CharSequence toTemplate(final Choice it, final String arrname) {
    {
      return _toTemplate(it, arrname);
    }
  }
}
