package com.smdp.surveytoandroid;

import java.util.ArrayList;

import com.smdp.surveytoandroid.questionstructure.Choice;
import com.smdp.surveytoandroid.questionstructure.Fork;
import com.smdp.surveytoandroid.questionstructure.MultipleChoiceQuestion;
import com.smdp.surveytoandroid.questionstructure.OpenQuestion;
import com.smdp.surveytoandroid.questionstructure.Questionable;
import com.smdp.surveytoandroid.questionstructure.RankingQuestion;
import com.smdp.surveytoandroid.questionstructure.RatingQuestion;
import com.smdp.surveytoandroid.questionstructure.ConstantSumQuestion;
import com.smdp.surveytoandroid.questionstructure.StapleQuestion;
import com.smdp.surveytoandroid.questionstructure.Survey;

public class CodeGenData {
	
	private static ArrayList<Questionable> questions = new ArrayList<Questionable>();
	
	public static String getSurveyName() {
		
		Survey Survey1 = new Survey ("Survey1");
		String surveyName = Survey1.getName();
		return surveyName;
}

	public static ArrayList<Questionable> addQuestionsToArrList() {

ArrayList<Choice> arrMultiQ1 = new ArrayList<Choice>();
arrMultiQ1.add(new Choice ("A","Yes")); 
arrMultiQ1.add(new Choice ("B","No")); 
MultipleChoiceQuestion Q1 = new MultipleChoiceQuestion ("Q1","Did you find the Ask language useful?",true, "", arrMultiQ1 );		

questions.add(Q1);	

RatingQuestion Q2 = new RatingQuestion ("Q2","Ask ease of use ",false, 1, 10, "Awful"," Amazing");

questions.add(Q2);				

ArrayList<Choice> arrRankQ3 = new ArrayList<Choice>();
 arrRankQ3.add(new Choice ("A","Code Generation")); 
 arrRankQ3.add(new Choice ("B","Editor")); 
 arrRankQ3.add(new Choice ("C","Fork-ing")); 
RankingQuestion Q3 = new RankingQuestion ("Q3","Favorite Features",true, arrRankQ3);

questions.add(Q3);

 Fork q1ForkId0 = new Fork();
ArrayList<Questionable> q1ForkArrId0 = new ArrayList<Questionable>();
q1ForkArrId0.add(Q2); q1ForkArrId0.add(Q3); 
q1ForkId0.bindingChoiceQuest.put("Yes",q1ForkArrId0);
Q1.forks.add(q1ForkId0);
		
		return questions;
	}
}	

