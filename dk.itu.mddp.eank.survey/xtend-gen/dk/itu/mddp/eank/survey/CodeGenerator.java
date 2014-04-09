package dk.itu.mddp.eank.survey;

import com.google.inject.Injector;
import dk.itu.mddp.eank.survey.Constraints;
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
import survey.Model;
import survey.Question;
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
      boolean _Constraint = Constraints.Constraint(_get_2);
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
