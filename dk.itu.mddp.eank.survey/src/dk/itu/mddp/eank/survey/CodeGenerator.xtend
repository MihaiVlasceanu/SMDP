package dk.itu.mddp.eank.survey

import survey.SurveyPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.XtextResource
import org.xtext.example.mydsl.generator.MyDslGenerator
import org.eclipse.emf.mwe.internal.core.ast.util.Injector
import org.xtext.example.mydsl.MyDslStandaloneSetupGenerated
import java.util.HashMap
import org.eclipse.emf.common.util.EList
import java.util.List
import java.util.ArrayList
import survey.Question
import survey.Survey
import survey.Open
import survey.Rating
import survey.Staple
import survey.MultipleChoice
import survey.ConstantSum
import survey.Ranking
import survey.Fork

abstract class CodeGenerator {
	protected static val instanceFileName = "test-files/Tes.survey"
	protected static var map = new HashMap<Question, Integer>();
	protected static var goToMap = new HashMap<Question, Integer>();
	protected static var next = new HashMap<Question, Integer>();
	protected static var usedList = new ArrayList<Integer>();
	
	// this method reads textual syntax and saves XMI syntax
	def static void main (String[] args) {
		
		// register our meta-model package for abstract syntax
		SurveyPackage.eINSTANCE.eClass
				
		val injector = new MyDslStandaloneSetupGenerated().createInjectorAndDoEMFRegistration
		val resourceSet = injector.getInstance(typeof(XtextResourceSet))
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, true);

		val uri = URI::createURI(instanceFileName)
		var resource = resourceSet.getResource(uri, true)			/* true means follow proxies */

		val Survey m = resource.getContents() as Survey
		val questions = m.questions
		
		//Changes all choices so they reference the correct ID within the question
		//Previously it would reference the first occurence of the choice with that name
		questions.forEach[changeChoices]

//		for(i: 0..questions.size-1)
//		{
//				map.put(questions.get(i), i)								
//		}
		questions.forEach[q, i | map.put(q,i)]
		questions.forEach[q | //parent question q
			var localQuestions = forkMap(q)
			
			if(localQuestions != null)
			{
				localQuestions.forEach[localQuestion |
					for(p:0..localQuestion.size)
					{										
						if(p!=localQuestion.size)
						{
							usedList.add(map.get(localQuestion.get(p)))							
						}
					}
				]
			}			
			
		]
		questions.forEach[q | //parent question q
			var localQuestions = forkMap(q)
			if(!goToMap.containsKey(q)){
				var to = map.get(q)+1;
				while(usedList.contains(to))
				{
					to=to+1
				}
				goToMap.put(q, to)
			}
			
			if(localQuestions != null)
			{
				localQuestions.forEach[localQuestion |
					for(p:0..localQuestion.size)
					{										
						if(p!=localQuestion.size)
						{
		
							if(p!=localQuestion.size-1)
							{
								goToMap.put(localQuestion.get(p), map.get(localQuestion.get(p+1)))
							}					
							else{
								goToMap.put(localQuestion.get(p),goToMap.get(q));//go to its parents next question 
							}
							//localQuestion.forEach[forkQuestion |
								//usedList.add(map.get(forkQuestion))						
								
								
							//]
						}
					}
				]
			}
		]
		
		var  goToMap2 =goToMap;

		println(toTemplate(m).toString())


		if(Constraints.Constraint(m))
			println("All constraints passed!")
		else
			println("Constraints Failed")

		val outputURI = URI.createFileURI("test-files/test-output.xmi")
		resource.URI = resource.resourceSet.getURIConverter.normalize(outputURI)
		resource.save (null)
		 
	}

	def static dispatch toTemplate(Survey it)
	{				
		'''
		«FOR i:0..questions.size-1»
		«{ var to=goToMap.get(questions.get(i))
		toTemplate(questions.get(i), to);

		}»
		«ENDFOR»
		'''
	}
	
	def abstract void toTemplate(Open it, int to)
	
	def abstract void toTemplate(MultipleChoice it, int to)
	
	def abstract void toTemplate(Ranking it, int to) 
	
	def abstract void toTemplate(Rating it, int to) 
	
	def abstract void toTemplate(ConstantSum it, int to) 
	
	def abstract void toTemplate(Staple it, int to)
	
	
	def static dispatch changeChoices(Open it)
	{
		
	}
	def static dispatch changeChoices(Rating it)
	{
		
	}
	def static dispatch changeChoices(Staple it)
	{
		
	}
	def static dispatch changeChoices(MultipleChoice it)
	{
		//Iterates all the forks and checks for their choices
		forks.forEach[f | 
			choice.forEach[c | 
				//When the forks's "on" contains the current choice with the same name 
				if(f.on.exists[x | x.name == c.name])
				{
					//it removes this choice 
					f.on.remove(f.on.findFirst[x | x.name == c.name])
					//and adds the choice that is within the question's choices
					f.on.add(c)
				}
			]
		]

	}
	def static dispatch changeChoices(ConstantSum it)
	{
		forks.forEach[f | 
			choices.forEach[c | 
				if(f.on.exists[x | x.name == c.name])
				{
					f.on.remove(f.on.findFirst[x | x.name == c.name])
					f.on.add(c)
				}
			]
		]
	}
	def static dispatch changeChoices(Ranking it)
	{
		forks.forEach[f | 
			choices.forEach[c | 
				if(f.on.exists[x | x.name == c.name])
				{
					f.on.remove(f.on.findFirst[x | x.name == c.name])
					f.on.add(c)
				}
			]
		]
	}
	
		
	def static dispatch List<EList<Question>> forkMap(Open it)
	{		
			return null;
	}
	
	def static dispatch List<EList<Question>> forkMap(MultipleChoice it)
	{
			return it.forks.map[getQuestions]
	}
	def static dispatch List<EList<Question>> forkMap(Ranking it)
	{
			return it.forks.map[getQuestions]
	}
	def static dispatch List<EList<Question>> forkMap(Rating it)
	{		
			return it.forks.map[getQuestions]
	}
	def static dispatch List<EList<Question>> forkMap(ConstantSum it)
	{		
			return it.forks.map[getQuestions]
	}
	
	def static dispatch List<EList<Question>> forkMap(Staple it)
	{		
			return it.forks.map[getQuestions]
	}
	
	def static List<EList<Question>> getQuestions(Fork it)
	{
			return questions.map[] 			
	}
	
	/**
	 * Removes all non-alphanumeric characters in a string
	 */
	def static normalize(String string) {
		string.replaceAll("(^[^a-zA-Z])*(\\W+)", "")
	}
	
	def static toInt(String name)
	{
		name.replaceAll("([^0-9])*", "")
	}

}