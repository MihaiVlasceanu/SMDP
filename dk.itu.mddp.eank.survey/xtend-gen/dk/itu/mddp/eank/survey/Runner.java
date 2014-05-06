package dk.itu.mddp.eank.survey;

import com.google.inject.Injector;
import dk.itu.mddp.eank.survey.CodeGenerator;
import dk.itu.mddp.eank.survey.Constraints;
import dk.itu.mddp.eank.survey.HtmlCodeGenerator;
import dk.itu.mddp.eank.survey.QuestionMapping;
import dk.itu.mddp.eank.survey.Transformation;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated;
import survey.Question;
import survey.Survey;
import survey.SurveyPackage;

@SuppressWarnings("all")
public class Runner {
  public static void main(final String[] args) {
    try {
      SurveyPackage.eINSTANCE.eClass();
      final String instanceFileName = "test-files/Tes.survey";
      MyDslStandaloneSetupGenerated _myDslStandaloneSetupGenerated = new MyDslStandaloneSetupGenerated();
      final Injector injector = _myDslStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
      resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.valueOf(true));
      final URI uri = URI.createURI(instanceFileName);
      Resource resource = resourceSet.getResource(uri, true);
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      final Survey m = ((Survey) _get);
      final Survey survey = Transformation.changeChoices(m);
      final EList<Question> questions = survey.getQuestions();
      QuestionMapping.MapQuestions(m);
      HashMap<Question,Integer> goToMap = QuestionMapping.goToMap;
      HashMap<Question,Integer> questionMap = QuestionMapping.map;
      final CodeGenerator generator = new HtmlCodeGenerator(goToMap, questionMap);
      String _template = generator.toTemplate(survey);
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
}
