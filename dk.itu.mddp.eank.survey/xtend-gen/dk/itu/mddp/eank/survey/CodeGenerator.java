package dk.itu.mddp.eank.survey;

import com.google.inject.Injector;
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
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated;
import survey.Dichotomous;
import survey.Model;
import survey.MultipleChoice;
import survey.Open;
import survey.Question;
import survey.Ranking;
import survey.Rating;
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
      EList<Survey> _surveys_1 = m.getSurveys();
      Survey _get_2 = _surveys_1.get(0);
      Object _template = CodeGenerator.toTemplate(_get_2);
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
  
  protected static CharSequence _toTemplate(final Survey it) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Question> _questions = it.getQuestions();
      boolean _hasElements = false;
      for(final Question question : _questions) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        Object _template = CodeGenerator.toTemplate(question);
        _builder.append(_template, "");
      }
    }
    return _builder;
  }
  
  protected static CharSequence _toTemplate(final Open it) {
    StringConcatenation _builder = new StringConcatenation();
    String _question = it.getQuestion();
    _builder.append(_question, "");
    return _builder;
  }
  
  protected static CharSequence _toTemplate(final Dichotomous it) {
    StringConcatenation _builder = new StringConcatenation();
    String _question = it.getQuestion();
    _builder.append(_question, "");
    return _builder;
  }
  
  protected static CharSequence _toTemplate(final MultipleChoice it) {
    return null;
  }
  
  protected static CharSequence _toTemplate(final Ranking it) {
    return null;
  }
  
  protected static CharSequence _toTemplate(final Rating it) {
    return null;
  }
  
  protected static CharSequence _toTemplate(final Staple it) {
    return null;
  }
  
  public static Object toTemplate(final EObject it) {
    if (it instanceof Staple) {
      return _toTemplate((Staple)it);
    } else if (it instanceof Dichotomous) {
      return _toTemplate((Dichotomous)it);
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
}
