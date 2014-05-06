package dk.itu.mddp.eank.survey

import survey.Open
import survey.Rating
import survey.Staple
import survey.MultipleChoice
import survey.ConstantSum
import survey.Ranking
import survey.Survey
import java.util.List
import org.eclipse.emf.common.util.EList
import survey.Question
import survey.Fork

class Transformation {
	
	def static Survey changeChoices(Survey it)
	{
		questions.forEach[change]
		return it
	}	
	def static dispatch void change(Open it)
	{
		
	}
	def static dispatch void change(Rating it)
	{
		
	}
	def static dispatch void change(Staple it)
	{
		
	}
	def static dispatch void change(MultipleChoice it)
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
	def static dispatch void change(ConstantSum it)
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
	def static dispatch void change(Ranking it)
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
}