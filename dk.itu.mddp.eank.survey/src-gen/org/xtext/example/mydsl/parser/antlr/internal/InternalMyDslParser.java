package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'??????'", "';'", "'MultipleChoice'", "':'", "'The'", "'user'", "'may'", "'is required'", "'to'", "'answer'", "'picking'", "'up to'", "'choice'", "'with'", "'one of'", "'some of'", "'these:'", "','", "'or'", "'something'", "'else'", "'.'", "'Open'", "'Rating'", "'rate'", "'between'", "'and'", "'where'", "'lowest'", "'means'", "'highest'", "'Ranking'", "'Dichotomous'", "'if yes'", "'if no'", "'SumConstant'", "'and can distribute up to'", "'among these'", "'Staple'", "'mid'", "'If'", "'then'", "'go to'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : ( () ( ( (lv_surveys_1_0= ruleSurvey ) ) (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )* )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_surveys_1_0 = null;

        EObject lv_surveys_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( () ( ( (lv_surveys_1_0= ruleSurvey ) ) (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( () ( ( (lv_surveys_1_0= ruleSurvey ) ) (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( () ( ( (lv_surveys_1_0= ruleSurvey ) ) (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: () ( ( (lv_surveys_1_0= ruleSurvey ) ) (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:2: ( ( (lv_surveys_1_0= ruleSurvey ) ) (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:3: ( (lv_surveys_1_0= ruleSurvey ) ) (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:3: ( (lv_surveys_1_0= ruleSurvey ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:1: (lv_surveys_1_0= ruleSurvey )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:1: (lv_surveys_1_0= ruleSurvey )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:88:3: lv_surveys_1_0= ruleSurvey
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getSurveysSurveyParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_ruleModel141);
                    lv_surveys_1_0=ruleSurvey();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"surveys",
                            		lv_surveys_1_0, 
                            		"Survey");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:104:2: (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:104:4: otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) )
                    	    {
                    	    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel154); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getQuestionMarkQuestionMarkQuestionMarkQuestionMarkQuestionMarkQuestionMarkKeyword_1_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:108:1: ( (lv_surveys_3_0= ruleSurvey ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:109:1: (lv_surveys_3_0= ruleSurvey )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:109:1: (lv_surveys_3_0= ruleSurvey )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:110:3: lv_surveys_3_0= ruleSurvey
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getSurveysSurveyParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_ruleModel175);
                    	    lv_surveys_3_0=ruleSurvey();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"surveys",
                    	            		lv_surveys_3_0, 
                    	            		"Survey");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQuestion"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:134:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:135:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion215);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion225); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:143:1: ruleQuestion returns [EObject current=null] : (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_MultipleChoice_0 = null;

        EObject this_Open_1 = null;

        EObject this_Rating_Impl_2 = null;

        EObject this_Ranking_3 = null;

        EObject this_Dichotomous_4 = null;

        EObject this_SumConstant_5 = null;

        EObject this_Staple_6 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:146:28: ( (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:147:1: (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:147:1: (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 34:
                {
                alt3=3;
                }
                break;
            case 42:
                {
                alt3=4;
                }
                break;
            case 43:
                {
                alt3=5;
                }
                break;
            case 46:
                {
                alt3=6;
                }
                break;
            case 49:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:148:5: this_MultipleChoice_0= ruleMultipleChoice
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleChoiceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_ruleQuestion272);
                    this_MultipleChoice_0=ruleMultipleChoice();

                    state._fsp--;

                     
                            current = this_MultipleChoice_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:158:5: this_Open_1= ruleOpen
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getOpenParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOpen_in_ruleQuestion299);
                    this_Open_1=ruleOpen();

                    state._fsp--;

                     
                            current = this_Open_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:168:5: this_Rating_Impl_2= ruleRating_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRating_ImplParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRating_Impl_in_ruleQuestion326);
                    this_Rating_Impl_2=ruleRating_Impl();

                    state._fsp--;

                     
                            current = this_Rating_Impl_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:178:5: this_Ranking_3= ruleRanking
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRankingParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRanking_in_ruleQuestion353);
                    this_Ranking_3=ruleRanking();

                    state._fsp--;

                     
                            current = this_Ranking_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:188:5: this_Dichotomous_4= ruleDichotomous
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getDichotomousParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDichotomous_in_ruleQuestion380);
                    this_Dichotomous_4=ruleDichotomous();

                    state._fsp--;

                     
                            current = this_Dichotomous_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:5: this_SumConstant_5= ruleSumConstant
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSumConstantParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSumConstant_in_ruleQuestion407);
                    this_SumConstant_5=ruleSumConstant();

                    state._fsp--;

                     
                            current = this_SumConstant_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:5: this_Staple_6= ruleStaple
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getStapleParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStaple_in_ruleQuestion434);
                    this_Staple_6=ruleStaple();

                    state._fsp--;

                     
                            current = this_Staple_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleSurvey"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:224:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:225:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:226:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey469);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey479); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:233:1: ruleSurvey returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) otherlv_3= ';' ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )* )? ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_questions_2_0 = null;

        EObject lv_questions_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:236:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) otherlv_3= ';' ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:237:1: ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) otherlv_3= ';' ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:237:1: ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) otherlv_3= ';' ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:237:2: () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) otherlv_3= ';' ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:237:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:238:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:243:2: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:244:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:244:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:245:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey534);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:2: ( ( (lv_questions_2_0= ruleQuestion ) ) otherlv_3= ';' ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13||(LA5_0>=33 && LA5_0<=34)||(LA5_0>=42 && LA5_0<=43)||LA5_0==46||LA5_0==49) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:3: ( (lv_questions_2_0= ruleQuestion ) ) otherlv_3= ';' ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:3: ( (lv_questions_2_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:1: (lv_questions_2_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:1: (lv_questions_2_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:263:3: lv_questions_2_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey556);
                    lv_questions_2_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	        }
                           		add(
                           			current, 
                           			"questions",
                            		lv_questions_2_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey568); 

                        	newLeafNode(otherlv_3, grammarAccess.getSurveyAccess().getSemicolonKeyword_2_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:283:1: ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==13||(LA4_0>=33 && LA4_0<=34)||(LA4_0>=42 && LA4_0<=43)||LA4_0==46||LA4_0==49) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:283:2: ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';'
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:283:2: ( (lv_questions_4_0= ruleQuestion ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:284:1: (lv_questions_4_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:284:1: (lv_questions_4_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:285:3: lv_questions_4_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_2_2_0_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey590);
                    	    lv_questions_4_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"questions",
                    	            		lv_questions_4_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey602); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSurveyAccess().getSemicolonKeyword_2_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:313:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:314:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:315:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString643);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString654); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:322:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:325:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:326:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:326:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:326:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString694); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString720); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMultipleChoice"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:1: entryRuleMultipleChoice returns [EObject current=null] : iv_ruleMultipleChoice= ruleMultipleChoice EOF ;
    public final EObject entryRuleMultipleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoice = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:352:2: (iv_ruleMultipleChoice= ruleMultipleChoice EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:353:2: iv_ruleMultipleChoice= ruleMultipleChoice EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice767);
            iv_ruleMultipleChoice=ruleMultipleChoice();

            state._fsp--;

             current =iv_ruleMultipleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoice777); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleChoice"


    // $ANTLR start "ruleMultipleChoice"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:360:1: ruleMultipleChoice returns [EObject current=null] : ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'picking' (otherlv_12= 'up to' )? ( (lv_answerCount_13_0= ruleEInt ) ) otherlv_14= 'choice' )? ( (otherlv_15= 'with' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these:' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* )? (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? (otherlv_27= '.' )? ( ( (lv_Fork_28_0= ruleChoiceFork ) ) (otherlv_29= ',' ( (lv_Fork_30_0= ruleChoiceFork ) ) )* )? ) ;
    public final EObject ruleMultipleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_isRequired_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_question_10_0 = null;

        AntlrDatatypeRuleToken lv_answerCount_13_0 = null;

        EObject lv_choice_19_0 = null;

        EObject lv_choice_21_0 = null;

        AntlrDatatypeRuleToken lv_other_26_0 = null;

        EObject lv_Fork_28_0 = null;

        EObject lv_Fork_30_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:28: ( ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'picking' (otherlv_12= 'up to' )? ( (lv_answerCount_13_0= ruleEInt ) ) otherlv_14= 'choice' )? ( (otherlv_15= 'with' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these:' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* )? (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? (otherlv_27= '.' )? ( ( (lv_Fork_28_0= ruleChoiceFork ) ) (otherlv_29= ',' ( (lv_Fork_30_0= ruleChoiceFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:1: ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'picking' (otherlv_12= 'up to' )? ( (lv_answerCount_13_0= ruleEInt ) ) otherlv_14= 'choice' )? ( (otherlv_15= 'with' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these:' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* )? (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? (otherlv_27= '.' )? ( ( (lv_Fork_28_0= ruleChoiceFork ) ) (otherlv_29= ',' ( (lv_Fork_30_0= ruleChoiceFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:1: ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'picking' (otherlv_12= 'up to' )? ( (lv_answerCount_13_0= ruleEInt ) ) otherlv_14= 'choice' )? ( (otherlv_15= 'with' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these:' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* )? (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? (otherlv_27= '.' )? ( ( (lv_Fork_28_0= ruleChoiceFork ) ) (otherlv_29= ',' ( (lv_Fork_30_0= ruleChoiceFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:2: () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'picking' (otherlv_12= 'up to' )? ( (lv_answerCount_13_0= ruleEInt ) ) otherlv_14= 'choice' )? ( (otherlv_15= 'with' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these:' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* )? (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? (otherlv_27= '.' )? ( ( (lv_Fork_28_0= ruleChoiceFork ) ) (otherlv_29= ',' ( (lv_Fork_30_0= ruleChoiceFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:365:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultipleChoiceAccess().getMultipleChoiceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleChoice823); 

                	newLeafNode(otherlv_1, grammarAccess.getMultipleChoiceAccess().getMultipleChoiceKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:374:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:375:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:375:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:376:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultipleChoice840); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMultipleChoiceAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultipleChoiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleChoice857); 

                	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:1: ( (otherlv_4= 'The' )? otherlv_5= 'user' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=15 && LA8_0<=16)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:2: (otherlv_4= 'The' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:2: (otherlv_4= 'The' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==15) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:4: otherlv_4= 'The'
                            {
                            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultipleChoice871); 

                                	newLeafNode(otherlv_4, grammarAccess.getMultipleChoiceAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultipleChoice885); 

                        	newLeafNode(otherlv_5, grammarAccess.getMultipleChoiceAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:404:3: (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:404:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultipleChoice900); 

                        	newLeafNode(otherlv_6, grammarAccess.getMultipleChoiceAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:409:6: ( (lv_isRequired_7_0= 'is required' ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:409:6: ( (lv_isRequired_7_0= 'is required' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:410:1: (lv_isRequired_7_0= 'is required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:410:1: (lv_isRequired_7_0= 'is required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:411:3: lv_isRequired_7_0= 'is required'
                    {
                    lv_isRequired_7_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultipleChoice924); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getMultipleChoiceAccess().getIsRequiredIsRequiredKeyword_5_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is required");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:4: ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING||(LA12_0>=19 && LA12_0<=20)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==EOF||LA12_2==RULE_ID||LA12_2==12||LA12_2==21||(LA12_2>=24 && LA12_2<=27)||LA12_2==29||LA12_2==32||LA12_2==51) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:5: (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:5: (otherlv_8= 'to' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==19) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:7: otherlv_8= 'to'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultipleChoice953); 

                                	newLeafNode(otherlv_8, grammarAccess.getMultipleChoiceAccess().getToKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:428:3: (otherlv_9= 'answer' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==20) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:428:5: otherlv_9= 'answer'
                            {
                            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultipleChoice968); 

                                	newLeafNode(otherlv_9, grammarAccess.getMultipleChoiceAccess().getAnswerKeyword_6_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:432:3: ( (lv_question_10_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:1: (lv_question_10_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:1: (lv_question_10_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:434:3: lv_question_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getQuestionEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice991);
                    lv_question_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:450:4: (otherlv_11= 'picking' (otherlv_12= 'up to' )? ( (lv_answerCount_13_0= ruleEInt ) ) otherlv_14= 'choice' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:450:6: otherlv_11= 'picking' (otherlv_12= 'up to' )? ( (lv_answerCount_13_0= ruleEInt ) ) otherlv_14= 'choice'
                    {
                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultipleChoice1006); 

                        	newLeafNode(otherlv_11, grammarAccess.getMultipleChoiceAccess().getPickingKeyword_7_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:454:1: (otherlv_12= 'up to' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==22) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:454:3: otherlv_12= 'up to'
                            {
                            otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMultipleChoice1019); 

                                	newLeafNode(otherlv_12, grammarAccess.getMultipleChoiceAccess().getUpToKeyword_7_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:458:3: ( (lv_answerCount_13_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:1: (lv_answerCount_13_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:1: (lv_answerCount_13_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:3: lv_answerCount_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getAnswerCountEIntParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultipleChoice1042);
                    lv_answerCount_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		set(
                           			current, 
                           			"answerCount",
                            		lv_answerCount_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMultipleChoice1054); 

                        	newLeafNode(otherlv_14, grammarAccess.getMultipleChoiceAccess().getChoiceKeyword_7_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:3: ( (otherlv_15= 'with' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these:' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||(LA19_0>=24 && LA19_0<=27)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:4: (otherlv_15= 'with' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these:' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:4: (otherlv_15= 'with' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==24) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:6: otherlv_15= 'with'
                            {
                            otherlv_15=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultipleChoice1070); 

                                	newLeafNode(otherlv_15, grammarAccess.getMultipleChoiceAccess().getWithKeyword_8_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:484:3: (otherlv_16= 'one of' | otherlv_17= 'some of' )?
                    int alt16=3;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==25) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==26) ) {
                        alt16=2;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:484:5: otherlv_16= 'one of'
                            {
                            otherlv_16=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultipleChoice1085); 

                                	newLeafNode(otherlv_16, grammarAccess.getMultipleChoiceAccess().getOneOfKeyword_8_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:489:7: otherlv_17= 'some of'
                            {
                            otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleChoice1103); 

                                	newLeafNode(otherlv_17, grammarAccess.getMultipleChoiceAccess().getSomeOfKeyword_8_1_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:493:3: (otherlv_18= 'these:' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==27) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:493:5: otherlv_18= 'these:'
                            {
                            otherlv_18=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultipleChoice1118); 

                                	newLeafNode(otherlv_18, grammarAccess.getMultipleChoiceAccess().getTheseKeyword_8_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:497:3: ( (lv_choice_19_0= ruleChoice ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:498:1: (lv_choice_19_0= ruleChoice )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:498:1: (lv_choice_19_0= ruleChoice )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:499:3: lv_choice_19_0= ruleChoice
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_8_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice1141);
                    lv_choice_19_0=ruleChoice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		add(
                           			current, 
                           			"choice",
                            		lv_choice_19_0, 
                            		"Choice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:2: (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==28) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:4: otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) )
                    	    {
                    	    otherlv_20=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMultipleChoice1154); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_8_4_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:519:1: ( (lv_choice_21_0= ruleChoice ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:520:1: (lv_choice_21_0= ruleChoice )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:520:1: (lv_choice_21_0= ruleChoice )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:3: lv_choice_21_0= ruleChoice
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_8_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice1175);
                    	    lv_choice_21_0=ruleChoice();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"choice",
                    	            		lv_choice_21_0, 
                    	            		"Choice");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:537:6: (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:537:8: otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMultipleChoice1192); 

                        	newLeafNode(otherlv_22, grammarAccess.getMultipleChoiceAccess().getOrKeyword_9_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:1: (otherlv_23= 'with' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==24) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:3: otherlv_23= 'with'
                            {
                            otherlv_23=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultipleChoice1205); 

                                	newLeafNode(otherlv_23, grammarAccess.getMultipleChoiceAccess().getWithKeyword_9_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:3: (otherlv_24= 'something' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==30) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:5: otherlv_24= 'something'
                            {
                            otherlv_24=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMultipleChoice1220); 

                                	newLeafNode(otherlv_24, grammarAccess.getMultipleChoiceAccess().getSomethingKeyword_9_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:549:3: (otherlv_25= 'else' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==31) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:549:5: otherlv_25= 'else'
                            {
                            otherlv_25=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMultipleChoice1235); 

                                	newLeafNode(otherlv_25, grammarAccess.getMultipleChoiceAccess().getElseKeyword_9_3());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:553:3: ( (lv_other_26_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:554:1: (lv_other_26_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:554:1: (lv_other_26_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:555:3: lv_other_26_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getOtherEStringParserRuleCall_9_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice1258);
                    lv_other_26_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		set(
                           			current, 
                           			"other",
                            		lv_other_26_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:571:4: (otherlv_27= '.' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:571:6: otherlv_27= '.'
                    {
                    otherlv_27=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMultipleChoice1273); 

                        	newLeafNode(otherlv_27, grammarAccess.getMultipleChoiceAccess().getFullStopKeyword_10());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:575:3: ( ( (lv_Fork_28_0= ruleChoiceFork ) ) (otherlv_29= ',' ( (lv_Fork_30_0= ruleChoiceFork ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==51) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:575:4: ( (lv_Fork_28_0= ruleChoiceFork ) ) (otherlv_29= ',' ( (lv_Fork_30_0= ruleChoiceFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:575:4: ( (lv_Fork_28_0= ruleChoiceFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:576:1: (lv_Fork_28_0= ruleChoiceFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:576:1: (lv_Fork_28_0= ruleChoiceFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:577:3: lv_Fork_28_0= ruleChoiceFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getForkChoiceForkParserRuleCall_11_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1297);
                    lv_Fork_28_0=ruleChoiceFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		add(
                           			current, 
                           			"Fork",
                            		lv_Fork_28_0, 
                            		"ChoiceFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:593:2: (otherlv_29= ',' ( (lv_Fork_30_0= ruleChoiceFork ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==28) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:593:4: otherlv_29= ',' ( (lv_Fork_30_0= ruleChoiceFork ) )
                    	    {
                    	    otherlv_29=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMultipleChoice1310); 

                    	        	newLeafNode(otherlv_29, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_11_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:597:1: ( (lv_Fork_30_0= ruleChoiceFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:598:1: (lv_Fork_30_0= ruleChoiceFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:598:1: (lv_Fork_30_0= ruleChoiceFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:599:3: lv_Fork_30_0= ruleChoiceFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getForkChoiceForkParserRuleCall_11_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1331);
                    	    lv_Fork_30_0=ruleChoiceFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Fork",
                    	            		lv_Fork_30_0, 
                    	            		"ChoiceFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleChoice"


    // $ANTLR start "entryRuleOpen"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:623:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:624:2: (iv_ruleOpen= ruleOpen EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:625:2: iv_ruleOpen= ruleOpen EOF
            {
             newCompositeNode(grammarAccess.getOpenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpen_in_entryRuleOpen1371);
            iv_ruleOpen=ruleOpen();

            state._fsp--;

             current =iv_ruleOpen; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpen1381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpen"


    // $ANTLR start "ruleOpen"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:632:1: ruleOpen returns [EObject current=null] : ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? ) ;
    public final EObject ruleOpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_question_10_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:635:28: ( ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:636:1: ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:636:1: ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:636:2: () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:636:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOpenAccess().getOpenAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOpen1427); 

                	newLeafNode(otherlv_1, grammarAccess.getOpenAccess().getOpenKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:646:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOpen1444); 

            			newLeafNode(lv_name_2_0, grammarAccess.getOpenAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOpenRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOpen1461); 

                	newLeafNode(otherlv_3, grammarAccess.getOpenAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:668:1: ( (otherlv_4= 'The' )? otherlv_5= 'user' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=15 && LA28_0<=16)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:668:2: (otherlv_4= 'The' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:668:2: (otherlv_4= 'The' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==15) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:668:4: otherlv_4= 'The'
                            {
                            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOpen1475); 

                                	newLeafNode(otherlv_4, grammarAccess.getOpenAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOpen1489); 

                        	newLeafNode(otherlv_5, grammarAccess.getOpenAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:676:3: (otherlv_6= 'may' | otherlv_7= 'is required' )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            else if ( (LA29_0==18) ) {
                alt29=2;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:676:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOpen1504); 

                        	newLeafNode(otherlv_6, grammarAccess.getOpenAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:681:7: otherlv_7= 'is required'
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOpen1522); 

                        	newLeafNode(otherlv_7, grammarAccess.getOpenAccess().getIsRequiredKeyword_5_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:685:3: ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)||(LA32_0>=19 && LA32_0<=20)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:685:4: (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:685:4: (otherlv_8= 'to' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==19) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:685:6: otherlv_8= 'to'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOpen1538); 

                                	newLeafNode(otherlv_8, grammarAccess.getOpenAccess().getToKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:3: (otherlv_9= 'answer' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==20) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:5: otherlv_9= 'answer'
                            {
                            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOpen1553); 

                                	newLeafNode(otherlv_9, grammarAccess.getOpenAccess().getAnswerKeyword_6_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:693:3: ( (lv_question_10_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:694:1: (lv_question_10_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:694:1: (lv_question_10_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:695:3: lv_question_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpenAccess().getQuestionEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpen1576);
                    lv_question_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpenRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpen"


    // $ANTLR start "entryRuleRating_Impl"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:719:1: entryRuleRating_Impl returns [EObject current=null] : iv_ruleRating_Impl= ruleRating_Impl EOF ;
    public final EObject entryRuleRating_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating_Impl = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:2: (iv_ruleRating_Impl= ruleRating_Impl EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:721:2: iv_ruleRating_Impl= ruleRating_Impl EOF
            {
             newCompositeNode(grammarAccess.getRating_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1614);
            iv_ruleRating_Impl=ruleRating_Impl();

            state._fsp--;

             current =iv_ruleRating_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRating_Impl1624); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRating_Impl"


    // $ANTLR start "ruleRating_Impl"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:728:1: ruleRating_Impl returns [EObject current=null] : ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? otherlv_16= 'lowest' (otherlv_17= 'means' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'and' )? otherlv_20= 'highest' (otherlv_21= 'means' )? ( (lv_last_22_0= ruleEString ) ) )? ( ( (lv_Fork_23_0= ruleRatingFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRatingFork ) ) )* )? ) ;
    public final EObject ruleRating_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_question_10_0 = null;

        AntlrDatatypeRuleToken lv_Min_12_0 = null;

        AntlrDatatypeRuleToken lv_Max_14_0 = null;

        AntlrDatatypeRuleToken lv_first_18_0 = null;

        AntlrDatatypeRuleToken lv_last_22_0 = null;

        EObject lv_Fork_23_0 = null;

        EObject lv_Fork_25_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:731:28: ( ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? otherlv_16= 'lowest' (otherlv_17= 'means' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'and' )? otherlv_20= 'highest' (otherlv_21= 'means' )? ( (lv_last_22_0= ruleEString ) ) )? ( ( (lv_Fork_23_0= ruleRatingFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRatingFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:732:1: ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? otherlv_16= 'lowest' (otherlv_17= 'means' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'and' )? otherlv_20= 'highest' (otherlv_21= 'means' )? ( (lv_last_22_0= ruleEString ) ) )? ( ( (lv_Fork_23_0= ruleRatingFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRatingFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:732:1: ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? otherlv_16= 'lowest' (otherlv_17= 'means' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'and' )? otherlv_20= 'highest' (otherlv_21= 'means' )? ( (lv_last_22_0= ruleEString ) ) )? ( ( (lv_Fork_23_0= ruleRatingFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRatingFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:732:2: () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? otherlv_16= 'lowest' (otherlv_17= 'means' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'and' )? otherlv_20= 'highest' (otherlv_21= 'means' )? ( (lv_last_22_0= ruleEString ) ) )? ( ( (lv_Fork_23_0= ruleRatingFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRatingFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:732:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRating_ImplAccess().getRatingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRating_Impl1670); 

                	newLeafNode(otherlv_1, grammarAccess.getRating_ImplAccess().getRatingKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:742:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:743:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:743:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:744:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRating_Impl1687); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRating_ImplAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRating_ImplRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRating_Impl1704); 

                	newLeafNode(otherlv_3, grammarAccess.getRating_ImplAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:764:1: ( (otherlv_4= 'The' )? otherlv_5= 'user' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=15 && LA34_0<=16)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:764:2: (otherlv_4= 'The' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:764:2: (otherlv_4= 'The' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==15) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:764:4: otherlv_4= 'The'
                            {
                            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRating_Impl1718); 

                                	newLeafNode(otherlv_4, grammarAccess.getRating_ImplAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRating_Impl1732); 

                        	newLeafNode(otherlv_5, grammarAccess.getRating_ImplAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:772:3: (otherlv_6= 'may' | otherlv_7= 'is required' )?
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==17) ) {
                alt35=1;
            }
            else if ( (LA35_0==18) ) {
                alt35=2;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:772:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRating_Impl1747); 

                        	newLeafNode(otherlv_6, grammarAccess.getRating_ImplAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:777:7: otherlv_7= 'is required'
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRating_Impl1765); 

                        	newLeafNode(otherlv_7, grammarAccess.getRating_ImplAccess().getIsRequiredKeyword_5_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:781:3: ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)||LA38_0==19||LA38_0==35) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:781:4: (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:781:4: (otherlv_8= 'to' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==19) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:781:6: otherlv_8= 'to'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRating_Impl1781); 

                                	newLeafNode(otherlv_8, grammarAccess.getRating_ImplAccess().getToKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:785:3: (otherlv_9= 'rate' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==35) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:785:5: otherlv_9= 'rate'
                            {
                            otherlv_9=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRating_Impl1796); 

                                	newLeafNode(otherlv_9, grammarAccess.getRating_ImplAccess().getRateKeyword_6_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:789:3: ( (lv_question_10_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:790:1: (lv_question_10_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:790:1: (lv_question_10_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:791:3: lv_question_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getQuestionEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1819);
                    lv_question_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:4: ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )?
            int alt40=2;
            switch ( input.LA(1) ) {
                case 36:
                    {
                    alt40=1;
                    }
                    break;
                case 54:
                    {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==RULE_INT) ) {
                        alt40=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt40=1;
                    }
                    break;
            }

            switch (alt40) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:5: (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:5: (otherlv_11= 'between' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==36) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:7: otherlv_11= 'between'
                            {
                            otherlv_11=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRating_Impl1835); 

                                	newLeafNode(otherlv_11, grammarAccess.getRating_ImplAccess().getBetweenKeyword_7_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:811:3: ( (lv_Min_12_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:812:1: (lv_Min_12_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:812:1: (lv_Min_12_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:813:3: lv_Min_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMinEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1858);
                    lv_Min_12_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"Min",
                            		lv_Min_12_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:829:4: ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==RULE_INT||LA42_1==54) ) {
                    alt42=1;
                }
            }
            else if ( (LA42_0==RULE_INT||LA42_0==54) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:829:5: (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:829:5: (otherlv_13= 'and' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==37) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:829:7: otherlv_13= 'and'
                            {
                            otherlv_13=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleRating_Impl1874); 

                                	newLeafNode(otherlv_13, grammarAccess.getRating_ImplAccess().getAndKeyword_8_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:833:3: ( (lv_Max_14_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:1: (lv_Max_14_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:1: (lv_Max_14_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:3: lv_Max_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMaxEIntParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1897);
                    lv_Max_14_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"Max",
                            		lv_Max_14_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:4: ( (otherlv_15= 'where' )? otherlv_16= 'lowest' (otherlv_17= 'means' )? ( (lv_first_18_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=38 && LA45_0<=39)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:5: (otherlv_15= 'where' )? otherlv_16= 'lowest' (otherlv_17= 'means' )? ( (lv_first_18_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:5: (otherlv_15= 'where' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==38) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:7: otherlv_15= 'where'
                            {
                            otherlv_15=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRating_Impl1913); 

                                	newLeafNode(otherlv_15, grammarAccess.getRating_ImplAccess().getWhereKeyword_9_0());
                                

                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleRating_Impl1927); 

                        	newLeafNode(otherlv_16, grammarAccess.getRating_ImplAccess().getLowestKeyword_9_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:859:1: (otherlv_17= 'means' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==40) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:859:3: otherlv_17= 'means'
                            {
                            otherlv_17=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRating_Impl1940); 

                                	newLeafNode(otherlv_17, grammarAccess.getRating_ImplAccess().getMeansKeyword_9_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:863:3: ( (lv_first_18_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:864:1: (lv_first_18_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:864:1: (lv_first_18_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:865:3: lv_first_18_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getFirstEStringParserRuleCall_9_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1963);
                    lv_first_18_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"first",
                            		lv_first_18_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:4: ( (otherlv_19= 'and' )? otherlv_20= 'highest' (otherlv_21= 'means' )? ( (lv_last_22_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==37||LA48_0==41) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:5: (otherlv_19= 'and' )? otherlv_20= 'highest' (otherlv_21= 'means' )? ( (lv_last_22_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:5: (otherlv_19= 'and' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==37) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:7: otherlv_19= 'and'
                            {
                            otherlv_19=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleRating_Impl1979); 

                                	newLeafNode(otherlv_19, grammarAccess.getRating_ImplAccess().getAndKeyword_10_0());
                                

                            }
                            break;

                    }

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRating_Impl1993); 

                        	newLeafNode(otherlv_20, grammarAccess.getRating_ImplAccess().getHighestKeyword_10_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:1: (otherlv_21= 'means' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==40) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:3: otherlv_21= 'means'
                            {
                            otherlv_21=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRating_Impl2006); 

                                	newLeafNode(otherlv_21, grammarAccess.getRating_ImplAccess().getMeansKeyword_10_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:893:3: ( (lv_last_22_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:894:1: (lv_last_22_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:894:1: (lv_last_22_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:895:3: lv_last_22_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getLastEStringParserRuleCall_10_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl2029);
                    lv_last_22_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"last",
                            		lv_last_22_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:4: ( ( (lv_Fork_23_0= ruleRatingFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRatingFork ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:5: ( (lv_Fork_23_0= ruleRatingFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRatingFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:5: ( (lv_Fork_23_0= ruleRatingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:912:1: (lv_Fork_23_0= ruleRatingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:912:1: (lv_Fork_23_0= ruleRatingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:913:3: lv_Fork_23_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getForkRatingForkParserRuleCall_11_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl2053);
                    lv_Fork_23_0=ruleRatingFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"Fork",
                            		lv_Fork_23_0, 
                            		"RatingFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:929:2: (otherlv_24= ',' ( (lv_Fork_25_0= ruleRatingFork ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==28) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:929:4: otherlv_24= ',' ( (lv_Fork_25_0= ruleRatingFork ) )
                    	    {
                    	    otherlv_24=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRating_Impl2066); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getRating_ImplAccess().getCommaKeyword_11_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:933:1: ( (lv_Fork_25_0= ruleRatingFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:934:1: (lv_Fork_25_0= ruleRatingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:934:1: (lv_Fork_25_0= ruleRatingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:935:3: lv_Fork_25_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getForkRatingForkParserRuleCall_11_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl2087);
                    	    lv_Fork_25_0=ruleRatingFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Fork",
                    	            		lv_Fork_25_0, 
                    	            		"RatingFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRating_Impl"


    // $ANTLR start "entryRuleRanking"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:959:1: entryRuleRanking returns [EObject current=null] : iv_ruleRanking= ruleRanking EOF ;
    public final EObject entryRuleRanking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRanking = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:960:2: (iv_ruleRanking= ruleRanking EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:961:2: iv_ruleRanking= ruleRanking EOF
            {
             newCompositeNode(grammarAccess.getRankingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRanking_in_entryRuleRanking2127);
            iv_ruleRanking=ruleRanking();

            state._fsp--;

             current =iv_ruleRanking; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRanking2137); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRanking"


    // $ANTLR start "ruleRanking"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:1: ruleRanking returns [EObject current=null] : (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( (lv_isRequired_6_0= 'is required' ) ) )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'with' )? (otherlv_11= 'one of' | otherlv_12= 'some of' )? (otherlv_13= 'these:' )? ( (lv_choices_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_choices_16_0= ruleChoice ) ) )* )? (otherlv_17= '.' )? ( ( (lv_Fork_18_0= ruleRankingSumFork ) ) (otherlv_19= ',' ( (lv_Fork_20_0= ruleRankingSumFork ) ) )* )? ) ;
    public final EObject ruleRanking() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_isRequired_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_question_9_0 = null;

        EObject lv_choices_14_0 = null;

        EObject lv_choices_16_0 = null;

        EObject lv_Fork_18_0 = null;

        EObject lv_Fork_20_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:971:28: ( (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( (lv_isRequired_6_0= 'is required' ) ) )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'with' )? (otherlv_11= 'one of' | otherlv_12= 'some of' )? (otherlv_13= 'these:' )? ( (lv_choices_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_choices_16_0= ruleChoice ) ) )* )? (otherlv_17= '.' )? ( ( (lv_Fork_18_0= ruleRankingSumFork ) ) (otherlv_19= ',' ( (lv_Fork_20_0= ruleRankingSumFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:972:1: (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( (lv_isRequired_6_0= 'is required' ) ) )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'with' )? (otherlv_11= 'one of' | otherlv_12= 'some of' )? (otherlv_13= 'these:' )? ( (lv_choices_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_choices_16_0= ruleChoice ) ) )* )? (otherlv_17= '.' )? ( ( (lv_Fork_18_0= ruleRankingSumFork ) ) (otherlv_19= ',' ( (lv_Fork_20_0= ruleRankingSumFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:972:1: (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( (lv_isRequired_6_0= 'is required' ) ) )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'with' )? (otherlv_11= 'one of' | otherlv_12= 'some of' )? (otherlv_13= 'these:' )? ( (lv_choices_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_choices_16_0= ruleChoice ) ) )* )? (otherlv_17= '.' )? ( ( (lv_Fork_18_0= ruleRankingSumFork ) ) (otherlv_19= ',' ( (lv_Fork_20_0= ruleRankingSumFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:972:3: otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( (lv_isRequired_6_0= 'is required' ) ) )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'with' )? (otherlv_11= 'one of' | otherlv_12= 'some of' )? (otherlv_13= 'these:' )? ( (lv_choices_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_choices_16_0= ruleChoice ) ) )* )? (otherlv_17= '.' )? ( ( (lv_Fork_18_0= ruleRankingSumFork ) ) (otherlv_19= ',' ( (lv_Fork_20_0= ruleRankingSumFork ) ) )* )?
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleRanking2174); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingAccess().getRankingKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:976:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:977:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:977:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:978:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRanking2191); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRankingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRanking2208); 

                	newLeafNode(otherlv_2, grammarAccess.getRankingAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:998:1: ( (otherlv_3= 'The' )? otherlv_4= 'user' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=15 && LA52_0<=16)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:998:2: (otherlv_3= 'The' )? otherlv_4= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:998:2: (otherlv_3= 'The' )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==15) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:998:4: otherlv_3= 'The'
                            {
                            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRanking2222); 

                                	newLeafNode(otherlv_3, grammarAccess.getRankingAccess().getTheKeyword_3_0());
                                

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRanking2236); 

                        	newLeafNode(otherlv_4, grammarAccess.getRankingAccess().getUserKeyword_3_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:3: (otherlv_5= 'may' | ( (lv_isRequired_6_0= 'is required' ) ) )?
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==17) ) {
                alt53=1;
            }
            else if ( (LA53_0==18) ) {
                alt53=2;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:5: otherlv_5= 'may'
                    {
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRanking2251); 

                        	newLeafNode(otherlv_5, grammarAccess.getRankingAccess().getMayKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1011:6: ( (lv_isRequired_6_0= 'is required' ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1011:6: ( (lv_isRequired_6_0= 'is required' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:1: (lv_isRequired_6_0= 'is required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:1: (lv_isRequired_6_0= 'is required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1013:3: lv_isRequired_6_0= 'is required'
                    {
                    lv_isRequired_6_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRanking2275); 

                            newLeafNode(lv_isRequired_6_0, grammarAccess.getRankingAccess().getIsRequiredIsRequiredKeyword_4_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRankingRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is required");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1026:4: ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_STRING||(LA56_0>=19 && LA56_0<=20)) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_ID) ) {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==EOF||LA56_2==RULE_ID||LA56_2==12||(LA56_2>=24 && LA56_2<=27)||LA56_2==32||LA56_2==51) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1026:5: (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1026:5: (otherlv_7= 'to' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==19) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1026:7: otherlv_7= 'to'
                            {
                            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRanking2304); 

                                	newLeafNode(otherlv_7, grammarAccess.getRankingAccess().getToKeyword_5_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:3: (otherlv_8= 'answer' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==20) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:5: otherlv_8= 'answer'
                            {
                            otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRanking2319); 

                                	newLeafNode(otherlv_8, grammarAccess.getRankingAccess().getAnswerKeyword_5_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1034:3: ( (lv_question_9_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1035:1: (lv_question_9_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1035:1: (lv_question_9_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1036:3: lv_question_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getQuestionEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRanking2342);
                    lv_question_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1052:4: ( (otherlv_10= 'with' )? (otherlv_11= 'one of' | otherlv_12= 'some of' )? (otherlv_13= 'these:' )? ( (lv_choices_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_choices_16_0= ruleChoice ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID||(LA61_0>=24 && LA61_0<=27)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1052:5: (otherlv_10= 'with' )? (otherlv_11= 'one of' | otherlv_12= 'some of' )? (otherlv_13= 'these:' )? ( (lv_choices_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_choices_16_0= ruleChoice ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1052:5: (otherlv_10= 'with' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==24) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1052:7: otherlv_10= 'with'
                            {
                            otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRanking2358); 

                                	newLeafNode(otherlv_10, grammarAccess.getRankingAccess().getWithKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1056:3: (otherlv_11= 'one of' | otherlv_12= 'some of' )?
                    int alt58=3;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==25) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==26) ) {
                        alt58=2;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1056:5: otherlv_11= 'one of'
                            {
                            otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRanking2373); 

                                	newLeafNode(otherlv_11, grammarAccess.getRankingAccess().getOneOfKeyword_6_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1061:7: otherlv_12= 'some of'
                            {
                            otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRanking2391); 

                                	newLeafNode(otherlv_12, grammarAccess.getRankingAccess().getSomeOfKeyword_6_1_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:3: (otherlv_13= 'these:' )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==27) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:5: otherlv_13= 'these:'
                            {
                            otherlv_13=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRanking2406); 

                                	newLeafNode(otherlv_13, grammarAccess.getRankingAccess().getTheseKeyword_6_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1069:3: ( (lv_choices_14_0= ruleChoice ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1070:1: (lv_choices_14_0= ruleChoice )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1070:1: (lv_choices_14_0= ruleChoice )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:3: lv_choices_14_0= ruleChoice
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2429);
                    lv_choices_14_0=ruleChoice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		add(
                           			current, 
                           			"choices",
                            		lv_choices_14_0, 
                            		"Choice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1087:2: (otherlv_15= ',' ( (lv_choices_16_0= ruleChoice ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==28) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1087:4: otherlv_15= ',' ( (lv_choices_16_0= ruleChoice ) )
                    	    {
                    	    otherlv_15=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRanking2442); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getRankingAccess().getCommaKeyword_6_4_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:1: ( (lv_choices_16_0= ruleChoice ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:1: (lv_choices_16_0= ruleChoice )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:1: (lv_choices_16_0= ruleChoice )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:3: lv_choices_16_0= ruleChoice
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_6_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2463);
                    	    lv_choices_16_0=ruleChoice();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"choices",
                    	            		lv_choices_16_0, 
                    	            		"Choice");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:6: (otherlv_17= '.' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==32) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:8: otherlv_17= '.'
                    {
                    otherlv_17=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRanking2480); 

                        	newLeafNode(otherlv_17, grammarAccess.getRankingAccess().getFullStopKeyword_7());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:3: ( ( (lv_Fork_18_0= ruleRankingSumFork ) ) (otherlv_19= ',' ( (lv_Fork_20_0= ruleRankingSumFork ) ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==51) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:4: ( (lv_Fork_18_0= ruleRankingSumFork ) ) (otherlv_19= ',' ( (lv_Fork_20_0= ruleRankingSumFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1113:4: ( (lv_Fork_18_0= ruleRankingSumFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1114:1: (lv_Fork_18_0= ruleRankingSumFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1114:1: (lv_Fork_18_0= ruleRankingSumFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:3: lv_Fork_18_0= ruleRankingSumFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getForkRankingSumForkParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleRanking2504);
                    lv_Fork_18_0=ruleRankingSumFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		add(
                           			current, 
                           			"Fork",
                            		lv_Fork_18_0, 
                            		"RankingSumFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1131:2: (otherlv_19= ',' ( (lv_Fork_20_0= ruleRankingSumFork ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==28) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1131:4: otherlv_19= ',' ( (lv_Fork_20_0= ruleRankingSumFork ) )
                    	    {
                    	    otherlv_19=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRanking2517); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getRankingAccess().getCommaKeyword_8_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1135:1: ( (lv_Fork_20_0= ruleRankingSumFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1136:1: (lv_Fork_20_0= ruleRankingSumFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1136:1: (lv_Fork_20_0= ruleRankingSumFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1137:3: lv_Fork_20_0= ruleRankingSumFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingAccess().getForkRankingSumForkParserRuleCall_8_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleRanking2538);
                    	    lv_Fork_20_0=ruleRankingSumFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Fork",
                    	            		lv_Fork_20_0, 
                    	            		"RankingSumFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRanking"


    // $ANTLR start "entryRuleDichotomous"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1161:1: entryRuleDichotomous returns [EObject current=null] : iv_ruleDichotomous= ruleDichotomous EOF ;
    public final EObject entryRuleDichotomous() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDichotomous = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1162:2: (iv_ruleDichotomous= ruleDichotomous EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1163:2: iv_ruleDichotomous= ruleDichotomous EOF
            {
             newCompositeNode(grammarAccess.getDichotomousRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDichotomous_in_entryRuleDichotomous2578);
            iv_ruleDichotomous=ruleDichotomous();

            state._fsp--;

             current =iv_ruleDichotomous; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDichotomous2588); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDichotomous"


    // $ANTLR start "ruleDichotomous"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:1: ruleDichotomous returns [EObject current=null] : ( () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'if yes' ( (lv_onYes_12_0= ruleDichotomousFork ) ) )? (otherlv_13= 'if no' ( (lv_onNo_14_0= ruleDichotomousFork ) ) )? ) ;
    public final EObject ruleDichotomous() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_isRequired_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_question_10_0 = null;

        EObject lv_onYes_12_0 = null;

        EObject lv_onNo_14_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1173:28: ( ( () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'if yes' ( (lv_onYes_12_0= ruleDichotomousFork ) ) )? (otherlv_13= 'if no' ( (lv_onNo_14_0= ruleDichotomousFork ) ) )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1174:1: ( () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'if yes' ( (lv_onYes_12_0= ruleDichotomousFork ) ) )? (otherlv_13= 'if no' ( (lv_onNo_14_0= ruleDichotomousFork ) ) )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1174:1: ( () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'if yes' ( (lv_onYes_12_0= ruleDichotomousFork ) ) )? (otherlv_13= 'if no' ( (lv_onNo_14_0= ruleDichotomousFork ) ) )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1174:2: () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'if yes' ( (lv_onYes_12_0= ruleDichotomousFork ) ) )? (otherlv_13= 'if no' ( (lv_onNo_14_0= ruleDichotomousFork ) ) )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1174:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1175:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDichotomousAccess().getDichotomousAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDichotomous2634); 

                	newLeafNode(otherlv_1, grammarAccess.getDichotomousAccess().getDichotomousKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1184:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1185:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1185:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1186:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDichotomous2651); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDichotomousAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDichotomousRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDichotomous2668); 

                	newLeafNode(otherlv_3, grammarAccess.getDichotomousAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1206:1: ( (otherlv_4= 'The' )? otherlv_5= 'user' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=15 && LA66_0<=16)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1206:2: (otherlv_4= 'The' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1206:2: (otherlv_4= 'The' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==15) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1206:4: otherlv_4= 'The'
                            {
                            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDichotomous2682); 

                                	newLeafNode(otherlv_4, grammarAccess.getDichotomousAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDichotomous2696); 

                        	newLeafNode(otherlv_5, grammarAccess.getDichotomousAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:3: (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )?
            int alt67=3;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==17) ) {
                alt67=1;
            }
            else if ( (LA67_0==18) ) {
                alt67=2;
            }
            switch (alt67) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDichotomous2711); 

                        	newLeafNode(otherlv_6, grammarAccess.getDichotomousAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1219:6: ( (lv_isRequired_7_0= 'is required' ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1219:6: ( (lv_isRequired_7_0= 'is required' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1220:1: (lv_isRequired_7_0= 'is required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1220:1: (lv_isRequired_7_0= 'is required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1221:3: lv_isRequired_7_0= 'is required'
                    {
                    lv_isRequired_7_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDichotomous2735); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getDichotomousAccess().getIsRequiredIsRequiredKeyword_5_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDichotomousRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is required");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:4: ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_STRING && LA70_0<=RULE_ID)||(LA70_0>=19 && LA70_0<=20)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:5: (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:5: (otherlv_8= 'to' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==19) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:7: otherlv_8= 'to'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDichotomous2764); 

                                	newLeafNode(otherlv_8, grammarAccess.getDichotomousAccess().getToKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1238:3: (otherlv_9= 'answer' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==20) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1238:5: otherlv_9= 'answer'
                            {
                            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDichotomous2779); 

                                	newLeafNode(otherlv_9, grammarAccess.getDichotomousAccess().getAnswerKeyword_6_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1242:3: ( (lv_question_10_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1243:1: (lv_question_10_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1243:1: (lv_question_10_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1244:3: lv_question_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDichotomousAccess().getQuestionEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDichotomous2802);
                    lv_question_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1260:4: (otherlv_11= 'if yes' ( (lv_onYes_12_0= ruleDichotomousFork ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==44) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1260:6: otherlv_11= 'if yes' ( (lv_onYes_12_0= ruleDichotomousFork ) )
                    {
                    otherlv_11=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDichotomous2817); 

                        	newLeafNode(otherlv_11, grammarAccess.getDichotomousAccess().getIfYesKeyword_7_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:1: ( (lv_onYes_12_0= ruleDichotomousFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1265:1: (lv_onYes_12_0= ruleDichotomousFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1265:1: (lv_onYes_12_0= ruleDichotomousFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1266:3: lv_onYes_12_0= ruleDichotomousFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getDichotomousAccess().getOnYesDichotomousForkParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDichotomousFork_in_ruleDichotomous2838);
                    lv_onYes_12_0=ruleDichotomousFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
                    	        }
                           		set(
                           			current, 
                           			"onYes",
                            		lv_onYes_12_0, 
                            		"DichotomousFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1282:4: (otherlv_13= 'if no' ( (lv_onNo_14_0= ruleDichotomousFork ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==45) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1282:6: otherlv_13= 'if no' ( (lv_onNo_14_0= ruleDichotomousFork ) )
                    {
                    otherlv_13=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDichotomous2853); 

                        	newLeafNode(otherlv_13, grammarAccess.getDichotomousAccess().getIfNoKeyword_8_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1286:1: ( (lv_onNo_14_0= ruleDichotomousFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1287:1: (lv_onNo_14_0= ruleDichotomousFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1287:1: (lv_onNo_14_0= ruleDichotomousFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1288:3: lv_onNo_14_0= ruleDichotomousFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getDichotomousAccess().getOnNoDichotomousForkParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDichotomousFork_in_ruleDichotomous2874);
                    lv_onNo_14_0=ruleDichotomousFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
                    	        }
                           		set(
                           			current, 
                           			"onNo",
                            		lv_onNo_14_0, 
                            		"DichotomousFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDichotomous"


    // $ANTLR start "entryRuleSumConstant"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1312:1: entryRuleSumConstant returns [EObject current=null] : iv_ruleSumConstant= ruleSumConstant EOF ;
    public final EObject entryRuleSumConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumConstant = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1313:2: (iv_ruleSumConstant= ruleSumConstant EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:2: iv_ruleSumConstant= ruleSumConstant EOF
            {
             newCompositeNode(grammarAccess.getSumConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSumConstant_in_entryRuleSumConstant2912);
            iv_ruleSumConstant=ruleSumConstant();

            state._fsp--;

             current =iv_ruleSumConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSumConstant2922); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumConstant"


    // $ANTLR start "ruleSumConstant"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1321:1: ruleSumConstant returns [EObject current=null] : ( () otherlv_1= 'SumConstant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'and can distribute up to' )? ( (lv_Constant_12_0= ruleEInt ) ) (otherlv_13= 'among these' ( (lv_Choices_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_Choices_16_0= ruleChoice ) ) )* )? ( ( (lv_Fork_17_0= ruleRankingSumFork ) ) (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )* )? ) ;
    public final EObject ruleSumConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_isRequired_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_question_10_0 = null;

        AntlrDatatypeRuleToken lv_Constant_12_0 = null;

        EObject lv_Choices_14_0 = null;

        EObject lv_Choices_16_0 = null;

        EObject lv_Fork_17_0 = null;

        EObject lv_Fork_19_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1324:28: ( ( () otherlv_1= 'SumConstant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'and can distribute up to' )? ( (lv_Constant_12_0= ruleEInt ) ) (otherlv_13= 'among these' ( (lv_Choices_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_Choices_16_0= ruleChoice ) ) )* )? ( ( (lv_Fork_17_0= ruleRankingSumFork ) ) (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1325:1: ( () otherlv_1= 'SumConstant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'and can distribute up to' )? ( (lv_Constant_12_0= ruleEInt ) ) (otherlv_13= 'among these' ( (lv_Choices_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_Choices_16_0= ruleChoice ) ) )* )? ( ( (lv_Fork_17_0= ruleRankingSumFork ) ) (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1325:1: ( () otherlv_1= 'SumConstant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'and can distribute up to' )? ( (lv_Constant_12_0= ruleEInt ) ) (otherlv_13= 'among these' ( (lv_Choices_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_Choices_16_0= ruleChoice ) ) )* )? ( ( (lv_Fork_17_0= ruleRankingSumFork ) ) (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1325:2: () otherlv_1= 'SumConstant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'and can distribute up to' )? ( (lv_Constant_12_0= ruleEInt ) ) (otherlv_13= 'among these' ( (lv_Choices_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_Choices_16_0= ruleChoice ) ) )* )? ( ( (lv_Fork_17_0= ruleRankingSumFork ) ) (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1325:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1326:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSumConstantAccess().getSumConstantAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleSumConstant2968); 

                	newLeafNode(otherlv_1, grammarAccess.getSumConstantAccess().getSumConstantKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1335:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1336:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1336:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1337:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSumConstant2985); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSumConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSumConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSumConstant3002); 

                	newLeafNode(otherlv_3, grammarAccess.getSumConstantAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1357:1: ( (otherlv_4= 'The' )? otherlv_5= 'user' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=15 && LA74_0<=16)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1357:2: (otherlv_4= 'The' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1357:2: (otherlv_4= 'The' )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==15) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1357:4: otherlv_4= 'The'
                            {
                            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSumConstant3016); 

                                	newLeafNode(otherlv_4, grammarAccess.getSumConstantAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSumConstant3030); 

                        	newLeafNode(otherlv_5, grammarAccess.getSumConstantAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:3: (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )?
            int alt75=3;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==17) ) {
                alt75=1;
            }
            else if ( (LA75_0==18) ) {
                alt75=2;
            }
            switch (alt75) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSumConstant3045); 

                        	newLeafNode(otherlv_6, grammarAccess.getSumConstantAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1370:6: ( (lv_isRequired_7_0= 'is required' ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1370:6: ( (lv_isRequired_7_0= 'is required' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1371:1: (lv_isRequired_7_0= 'is required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1371:1: (lv_isRequired_7_0= 'is required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:3: lv_isRequired_7_0= 'is required'
                    {
                    lv_isRequired_7_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSumConstant3069); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getSumConstantAccess().getIsRequiredIsRequiredKeyword_5_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSumConstantRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is required");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:4: ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=RULE_STRING && LA78_0<=RULE_ID)||(LA78_0>=19 && LA78_0<=20)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:5: (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:5: (otherlv_8= 'to' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==19) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:7: otherlv_8= 'to'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSumConstant3098); 

                                	newLeafNode(otherlv_8, grammarAccess.getSumConstantAccess().getToKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1389:3: (otherlv_9= 'answer' )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==20) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1389:5: otherlv_9= 'answer'
                            {
                            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSumConstant3113); 

                                	newLeafNode(otherlv_9, grammarAccess.getSumConstantAccess().getAnswerKeyword_6_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1393:3: ( (lv_question_10_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1394:1: (lv_question_10_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1394:1: (lv_question_10_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1395:3: lv_question_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSumConstantAccess().getQuestionEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSumConstant3136);
                    lv_question_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSumConstantRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1411:4: (otherlv_11= 'and can distribute up to' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==47) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1411:6: otherlv_11= 'and can distribute up to'
                    {
                    otherlv_11=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleSumConstant3151); 

                        	newLeafNode(otherlv_11, grammarAccess.getSumConstantAccess().getAndCanDistributeUpToKeyword_7());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1415:3: ( (lv_Constant_12_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1416:1: (lv_Constant_12_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1416:1: (lv_Constant_12_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1417:3: lv_Constant_12_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSumConstantAccess().getConstantEIntParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSumConstant3174);
            lv_Constant_12_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSumConstantRule());
            	        }
                   		set(
                   			current, 
                   			"Constant",
                    		lv_Constant_12_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1433:2: (otherlv_13= 'among these' ( (lv_Choices_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_Choices_16_0= ruleChoice ) ) )* )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==48) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1433:4: otherlv_13= 'among these' ( (lv_Choices_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_Choices_16_0= ruleChoice ) ) )*
                    {
                    otherlv_13=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleSumConstant3187); 

                        	newLeafNode(otherlv_13, grammarAccess.getSumConstantAccess().getAmongTheseKeyword_9_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1437:1: ( (lv_Choices_14_0= ruleChoice ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1438:1: (lv_Choices_14_0= ruleChoice )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1438:1: (lv_Choices_14_0= ruleChoice )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1439:3: lv_Choices_14_0= ruleChoice
                    {
                     
                    	        newCompositeNode(grammarAccess.getSumConstantAccess().getChoicesChoiceParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleSumConstant3208);
                    lv_Choices_14_0=ruleChoice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSumConstantRule());
                    	        }
                           		add(
                           			current, 
                           			"Choices",
                            		lv_Choices_14_0, 
                            		"Choice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1455:2: (otherlv_15= ',' ( (lv_Choices_16_0= ruleChoice ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==28) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1455:4: otherlv_15= ',' ( (lv_Choices_16_0= ruleChoice ) )
                    	    {
                    	    otherlv_15=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSumConstant3221); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getSumConstantAccess().getCommaKeyword_9_2_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1459:1: ( (lv_Choices_16_0= ruleChoice ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1460:1: (lv_Choices_16_0= ruleChoice )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1460:1: (lv_Choices_16_0= ruleChoice )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1461:3: lv_Choices_16_0= ruleChoice
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSumConstantAccess().getChoicesChoiceParserRuleCall_9_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleSumConstant3242);
                    	    lv_Choices_16_0=ruleChoice();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSumConstantRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Choices",
                    	            		lv_Choices_16_0, 
                    	            		"Choice");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1477:6: ( ( (lv_Fork_17_0= ruleRankingSumFork ) ) (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )* )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==51) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1477:7: ( (lv_Fork_17_0= ruleRankingSumFork ) ) (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1477:7: ( (lv_Fork_17_0= ruleRankingSumFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1478:1: (lv_Fork_17_0= ruleRankingSumFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1478:1: (lv_Fork_17_0= ruleRankingSumFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1479:3: lv_Fork_17_0= ruleRankingSumFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getSumConstantAccess().getForkRankingSumForkParserRuleCall_10_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleSumConstant3268);
                    lv_Fork_17_0=ruleRankingSumFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSumConstantRule());
                    	        }
                           		add(
                           			current, 
                           			"Fork",
                            		lv_Fork_17_0, 
                            		"RankingSumFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1495:2: (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==28) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1495:4: otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) )
                    	    {
                    	    otherlv_18=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSumConstant3281); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getSumConstantAccess().getCommaKeyword_10_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1499:1: ( (lv_Fork_19_0= ruleRankingSumFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1500:1: (lv_Fork_19_0= ruleRankingSumFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1500:1: (lv_Fork_19_0= ruleRankingSumFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1501:3: lv_Fork_19_0= ruleRankingSumFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSumConstantAccess().getForkRankingSumForkParserRuleCall_10_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleSumConstant3302);
                    	    lv_Fork_19_0=ruleRankingSumFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSumConstantRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Fork",
                    	            		lv_Fork_19_0, 
                    	            		"RankingSumFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumConstant"


    // $ANTLR start "entryRuleStaple"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1525:1: entryRuleStaple returns [EObject current=null] : iv_ruleStaple= ruleStaple EOF ;
    public final EObject entryRuleStaple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaple = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1526:2: (iv_ruleStaple= ruleStaple EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1527:2: iv_ruleStaple= ruleStaple EOF
            {
             newCompositeNode(grammarAccess.getStapleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStaple_in_entryRuleStaple3342);
            iv_ruleStaple=ruleStaple();

            state._fsp--;

             current =iv_ruleStaple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStaple3352); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaple"


    // $ANTLR start "ruleStaple"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:1: ruleStaple returns [EObject current=null] : ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? otherlv_16= 'lowest' (otherlv_17= 'means' )? (otherlv_18= ',' )? ( (lv_first_19_0= ruleEString ) ) )? (otherlv_20= 'mid' (otherlv_21= 'means' )? ( (lv_mid_22_0= ruleEString ) ) )? ( (otherlv_23= 'and' )? otherlv_24= 'highest' (otherlv_25= 'means' )? ( (lv_last_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleRatingFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleRatingFork ) ) )* )? ) ;
    public final EObject ruleStaple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_isRequired_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_question_10_0 = null;

        AntlrDatatypeRuleToken lv_Min_12_0 = null;

        AntlrDatatypeRuleToken lv_Max_14_0 = null;

        AntlrDatatypeRuleToken lv_first_19_0 = null;

        AntlrDatatypeRuleToken lv_mid_22_0 = null;

        AntlrDatatypeRuleToken lv_last_26_0 = null;

        EObject lv_Fork_27_0 = null;

        EObject lv_Fork_29_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1537:28: ( ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? otherlv_16= 'lowest' (otherlv_17= 'means' )? (otherlv_18= ',' )? ( (lv_first_19_0= ruleEString ) ) )? (otherlv_20= 'mid' (otherlv_21= 'means' )? ( (lv_mid_22_0= ruleEString ) ) )? ( (otherlv_23= 'and' )? otherlv_24= 'highest' (otherlv_25= 'means' )? ( (lv_last_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleRatingFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleRatingFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1538:1: ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? otherlv_16= 'lowest' (otherlv_17= 'means' )? (otherlv_18= ',' )? ( (lv_first_19_0= ruleEString ) ) )? (otherlv_20= 'mid' (otherlv_21= 'means' )? ( (lv_mid_22_0= ruleEString ) ) )? ( (otherlv_23= 'and' )? otherlv_24= 'highest' (otherlv_25= 'means' )? ( (lv_last_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleRatingFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleRatingFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1538:1: ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? otherlv_16= 'lowest' (otherlv_17= 'means' )? (otherlv_18= ',' )? ( (lv_first_19_0= ruleEString ) ) )? (otherlv_20= 'mid' (otherlv_21= 'means' )? ( (lv_mid_22_0= ruleEString ) ) )? ( (otherlv_23= 'and' )? otherlv_24= 'highest' (otherlv_25= 'means' )? ( (lv_last_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleRatingFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleRatingFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1538:2: () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? otherlv_16= 'lowest' (otherlv_17= 'means' )? (otherlv_18= ',' )? ( (lv_first_19_0= ruleEString ) ) )? (otherlv_20= 'mid' (otherlv_21= 'means' )? ( (lv_mid_22_0= ruleEString ) ) )? ( (otherlv_23= 'and' )? otherlv_24= 'highest' (otherlv_25= 'means' )? ( (lv_last_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleRatingFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleRatingFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1538:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1539:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStapleAccess().getStapleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleStaple3398); 

                	newLeafNode(otherlv_1, grammarAccess.getStapleAccess().getStapleKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1548:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1549:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1549:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1550:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStaple3415); 

            			newLeafNode(lv_name_2_0, grammarAccess.getStapleAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStapleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStaple3432); 

                	newLeafNode(otherlv_3, grammarAccess.getStapleAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:1: ( (otherlv_4= 'The' )? otherlv_5= 'user' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=15 && LA85_0<=16)) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:2: (otherlv_4= 'The' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:2: (otherlv_4= 'The' )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==15) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:4: otherlv_4= 'The'
                            {
                            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStaple3446); 

                                	newLeafNode(otherlv_4, grammarAccess.getStapleAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStaple3460); 

                        	newLeafNode(otherlv_5, grammarAccess.getStapleAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1578:3: (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )?
            int alt86=3;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==17) ) {
                alt86=1;
            }
            else if ( (LA86_0==18) ) {
                alt86=2;
            }
            switch (alt86) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1578:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStaple3475); 

                        	newLeafNode(otherlv_6, grammarAccess.getStapleAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1583:6: ( (lv_isRequired_7_0= 'is required' ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1583:6: ( (lv_isRequired_7_0= 'is required' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1584:1: (lv_isRequired_7_0= 'is required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1584:1: (lv_isRequired_7_0= 'is required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1585:3: lv_isRequired_7_0= 'is required'
                    {
                    lv_isRequired_7_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStaple3499); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getStapleAccess().getIsRequiredIsRequiredKeyword_5_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStapleRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is required");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1598:4: ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=RULE_STRING && LA89_0<=RULE_ID)||(LA89_0>=19 && LA89_0<=20)) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1598:5: (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1598:5: (otherlv_8= 'to' )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==19) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1598:7: otherlv_8= 'to'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStaple3528); 

                                	newLeafNode(otherlv_8, grammarAccess.getStapleAccess().getToKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1602:3: (otherlv_9= 'answer' )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==20) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1602:5: otherlv_9= 'answer'
                            {
                            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStaple3543); 

                                	newLeafNode(otherlv_9, grammarAccess.getStapleAccess().getAnswerKeyword_6_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1606:3: ( (lv_question_10_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1607:1: (lv_question_10_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1607:1: (lv_question_10_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1608:3: lv_question_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getQuestionEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3566);
                    lv_question_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1624:4: ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )?
            int alt91=2;
            switch ( input.LA(1) ) {
                case 36:
                    {
                    alt91=1;
                    }
                    break;
                case 54:
                    {
                    int LA91_2 = input.LA(2);

                    if ( (LA91_2==RULE_INT) ) {
                        alt91=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt91=1;
                    }
                    break;
            }

            switch (alt91) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1624:5: (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1624:5: (otherlv_11= 'between' )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==36) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1624:7: otherlv_11= 'between'
                            {
                            otherlv_11=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStaple3582); 

                                	newLeafNode(otherlv_11, grammarAccess.getStapleAccess().getBetweenKeyword_7_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1628:3: ( (lv_Min_12_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1629:1: (lv_Min_12_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1629:1: (lv_Min_12_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1630:3: lv_Min_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getMinEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStaple3605);
                    lv_Min_12_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"Min",
                            		lv_Min_12_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1646:4: ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==37) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==RULE_INT||LA93_1==54) ) {
                    alt93=1;
                }
            }
            else if ( (LA93_0==RULE_INT||LA93_0==54) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1646:5: (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1646:5: (otherlv_13= 'and' )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==37) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1646:7: otherlv_13= 'and'
                            {
                            otherlv_13=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStaple3621); 

                                	newLeafNode(otherlv_13, grammarAccess.getStapleAccess().getAndKeyword_8_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1650:3: ( (lv_Max_14_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1651:1: (lv_Max_14_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1651:1: (lv_Max_14_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1652:3: lv_Max_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getMaxEIntParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStaple3644);
                    lv_Max_14_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"Max",
                            		lv_Max_14_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1668:4: ( (otherlv_15= 'where' )? otherlv_16= 'lowest' (otherlv_17= 'means' )? (otherlv_18= ',' )? ( (lv_first_19_0= ruleEString ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( ((LA97_0>=38 && LA97_0<=39)) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1668:5: (otherlv_15= 'where' )? otherlv_16= 'lowest' (otherlv_17= 'means' )? (otherlv_18= ',' )? ( (lv_first_19_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1668:5: (otherlv_15= 'where' )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==38) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1668:7: otherlv_15= 'where'
                            {
                            otherlv_15=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleStaple3660); 

                                	newLeafNode(otherlv_15, grammarAccess.getStapleAccess().getWhereKeyword_9_0());
                                

                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleStaple3674); 

                        	newLeafNode(otherlv_16, grammarAccess.getStapleAccess().getLowestKeyword_9_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1676:1: (otherlv_17= 'means' )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==40) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1676:3: otherlv_17= 'means'
                            {
                            otherlv_17=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleStaple3687); 

                                	newLeafNode(otherlv_17, grammarAccess.getStapleAccess().getMeansKeyword_9_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1680:3: (otherlv_18= ',' )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==28) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1680:5: otherlv_18= ','
                            {
                            otherlv_18=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleStaple3702); 

                                	newLeafNode(otherlv_18, grammarAccess.getStapleAccess().getCommaKeyword_9_3());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1684:3: ( (lv_first_19_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1685:1: (lv_first_19_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1685:1: (lv_first_19_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1686:3: lv_first_19_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getFirstEStringParserRuleCall_9_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3725);
                    lv_first_19_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"first",
                            		lv_first_19_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1702:4: (otherlv_20= 'mid' (otherlv_21= 'means' )? ( (lv_mid_22_0= ruleEString ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==50) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1702:6: otherlv_20= 'mid' (otherlv_21= 'means' )? ( (lv_mid_22_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleStaple3740); 

                        	newLeafNode(otherlv_20, grammarAccess.getStapleAccess().getMidKeyword_10_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1706:1: (otherlv_21= 'means' )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==40) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1706:3: otherlv_21= 'means'
                            {
                            otherlv_21=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleStaple3753); 

                                	newLeafNode(otherlv_21, grammarAccess.getStapleAccess().getMeansKeyword_10_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1710:3: ( (lv_mid_22_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1711:1: (lv_mid_22_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1711:1: (lv_mid_22_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1712:3: lv_mid_22_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getMidEStringParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3776);
                    lv_mid_22_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"mid",
                            		lv_mid_22_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1728:4: ( (otherlv_23= 'and' )? otherlv_24= 'highest' (otherlv_25= 'means' )? ( (lv_last_26_0= ruleEString ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==37||LA102_0==41) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1728:5: (otherlv_23= 'and' )? otherlv_24= 'highest' (otherlv_25= 'means' )? ( (lv_last_26_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1728:5: (otherlv_23= 'and' )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==37) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1728:7: otherlv_23= 'and'
                            {
                            otherlv_23=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStaple3792); 

                                	newLeafNode(otherlv_23, grammarAccess.getStapleAccess().getAndKeyword_11_0());
                                

                            }
                            break;

                    }

                    otherlv_24=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleStaple3806); 

                        	newLeafNode(otherlv_24, grammarAccess.getStapleAccess().getHighestKeyword_11_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1736:1: (otherlv_25= 'means' )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==40) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1736:3: otherlv_25= 'means'
                            {
                            otherlv_25=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleStaple3819); 

                                	newLeafNode(otherlv_25, grammarAccess.getStapleAccess().getMeansKeyword_11_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1740:3: ( (lv_last_26_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1741:1: (lv_last_26_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1741:1: (lv_last_26_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1742:3: lv_last_26_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getLastEStringParserRuleCall_11_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3842);
                    lv_last_26_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"last",
                            		lv_last_26_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1758:4: ( ( (lv_Fork_27_0= ruleRatingFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleRatingFork ) ) )* )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==51) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1758:5: ( (lv_Fork_27_0= ruleRatingFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleRatingFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1758:5: ( (lv_Fork_27_0= ruleRatingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1759:1: (lv_Fork_27_0= ruleRatingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1759:1: (lv_Fork_27_0= ruleRatingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1760:3: lv_Fork_27_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getForkRatingForkParserRuleCall_12_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3866);
                    lv_Fork_27_0=ruleRatingFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		add(
                           			current, 
                           			"Fork",
                            		lv_Fork_27_0, 
                            		"RatingFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1776:2: (otherlv_28= ',' ( (lv_Fork_29_0= ruleRatingFork ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==28) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1776:4: otherlv_28= ',' ( (lv_Fork_29_0= ruleRatingFork ) )
                    	    {
                    	    otherlv_28=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleStaple3879); 

                    	        	newLeafNode(otherlv_28, grammarAccess.getStapleAccess().getCommaKeyword_12_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1780:1: ( (lv_Fork_29_0= ruleRatingFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1781:1: (lv_Fork_29_0= ruleRatingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1781:1: (lv_Fork_29_0= ruleRatingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1782:3: lv_Fork_29_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStapleAccess().getForkRatingForkParserRuleCall_12_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3900);
                    	    lv_Fork_29_0=ruleRatingFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Fork",
                    	            		lv_Fork_29_0, 
                    	            		"RatingFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaple"


    // $ANTLR start "entryRuleChoice"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1806:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1807:2: (iv_ruleChoice= ruleChoice EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1808:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_entryRuleChoice3940);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoice3950); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1815:1: ruleChoice returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_Description_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1818:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1819:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1819:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1819:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1819:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1820:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1820:1: (lv_name_0_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1821:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleChoice3992); 

            			newLeafNode(lv_name_0_0, grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleChoice4009); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getColonKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1841:1: ( (lv_Description_2_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1842:1: (lv_Description_2_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1842:1: (lv_Description_2_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1843:3: lv_Description_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChoiceAccess().getDescriptionEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoice4030);
            lv_Description_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChoiceRule());
            	        }
                   		set(
                   			current, 
                   			"Description",
                    		lv_Description_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleChoiceFork"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1867:1: entryRuleChoiceFork returns [EObject current=null] : iv_ruleChoiceFork= ruleChoiceFork EOF ;
    public final EObject entryRuleChoiceFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1868:2: (iv_ruleChoiceFork= ruleChoiceFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1869:2: iv_ruleChoiceFork= ruleChoiceFork EOF
            {
             newCompositeNode(grammarAccess.getChoiceForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_entryRuleChoiceFork4066);
            iv_ruleChoiceFork=ruleChoiceFork();

            state._fsp--;

             current =iv_ruleChoiceFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceFork4076); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoiceFork"


    // $ANTLR start "ruleChoiceFork"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1876:1: ruleChoiceFork returns [EObject current=null] : (otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go to' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleChoiceFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1879:28: ( (otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go to' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1880:1: (otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go to' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1880:1: (otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go to' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1880:3: otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go to' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleChoiceFork4113); 

                	newLeafNode(otherlv_0, grammarAccess.getChoiceForkAccess().getIfKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1884:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1885:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1885:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1886:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getChoiceForkAccess().getOnChoiceCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork4136);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1899:2: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==28) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1899:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleChoiceFork4149); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChoiceForkAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1903:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1904:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1904:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1905:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceForkAccess().getOnChoiceCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork4172);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1918:4: (otherlv_4= 'then' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==52) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1918:6: otherlv_4= 'then'
                    {
                    otherlv_4=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleChoiceFork4187); 

                        	newLeafNode(otherlv_4, grammarAccess.getChoiceForkAccess().getThenKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleChoiceFork4201); 

                	newLeafNode(otherlv_5, grammarAccess.getChoiceForkAccess().getGoToKeyword_4());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1926:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1927:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1927:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1928:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getChoiceForkAccess().getQuestionsQuestionCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork4224);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1941:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==28) ) {
                    int LA107_1 = input.LA(2);

                    if ( ((LA107_1>=RULE_STRING && LA107_1<=RULE_ID)) ) {
                        alt107=1;
                    }


                }


                switch (alt107) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1941:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleChoiceFork4237); 

            	        	newLeafNode(otherlv_7, grammarAccess.getChoiceForkAccess().getCommaKeyword_6_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1945:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1946:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1946:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1947:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceForkAccess().getQuestionsQuestionCrossReference_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork4260);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoiceFork"


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1968:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1969:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1970:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4299);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4310); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1977:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1980:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:2: (kw= '-' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==54) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1982:2: kw= '-'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleEInt4349); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4366); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleRatingFork"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2002:1: entryRuleRatingFork returns [EObject current=null] : iv_ruleRatingFork= ruleRatingFork EOF ;
    public final EObject entryRuleRatingFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatingFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2003:2: (iv_ruleRatingFork= ruleRatingFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2004:2: iv_ruleRatingFork= ruleRatingFork EOF
            {
             newCompositeNode(grammarAccess.getRatingForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_entryRuleRatingFork4411);
            iv_ruleRatingFork=ruleRatingFork();

            state._fsp--;

             current =iv_ruleRatingFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRatingFork4421); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRatingFork"


    // $ANTLR start "ruleRatingFork"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2011:1: ruleRatingFork returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= 'between' ( (lv_Min_2_0= ruleEInt ) ) otherlv_3= 'and' ( (lv_Max_4_0= ruleEInt ) ) (otherlv_5= 'then' )? otherlv_6= 'go to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleRatingFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_Min_2_0 = null;

        AntlrDatatypeRuleToken lv_Max_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2014:28: ( (otherlv_0= 'If' otherlv_1= 'between' ( (lv_Min_2_0= ruleEInt ) ) otherlv_3= 'and' ( (lv_Max_4_0= ruleEInt ) ) (otherlv_5= 'then' )? otherlv_6= 'go to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2015:1: (otherlv_0= 'If' otherlv_1= 'between' ( (lv_Min_2_0= ruleEInt ) ) otherlv_3= 'and' ( (lv_Max_4_0= ruleEInt ) ) (otherlv_5= 'then' )? otherlv_6= 'go to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2015:1: (otherlv_0= 'If' otherlv_1= 'between' ( (lv_Min_2_0= ruleEInt ) ) otherlv_3= 'and' ( (lv_Max_4_0= ruleEInt ) ) (otherlv_5= 'then' )? otherlv_6= 'go to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2015:3: otherlv_0= 'If' otherlv_1= 'between' ( (lv_Min_2_0= ruleEInt ) ) otherlv_3= 'and' ( (lv_Max_4_0= ruleEInt ) ) (otherlv_5= 'then' )? otherlv_6= 'go to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleRatingFork4458); 

                	newLeafNode(otherlv_0, grammarAccess.getRatingForkAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRatingFork4470); 

                	newLeafNode(otherlv_1, grammarAccess.getRatingForkAccess().getBetweenKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2023:1: ( (lv_Min_2_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2024:1: (lv_Min_2_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2024:1: (lv_Min_2_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2025:3: lv_Min_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getMinEIntParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork4491);
            lv_Min_2_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatingForkRule());
            	        }
                   		set(
                   			current, 
                   			"Min",
                    		lv_Min_2_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleRatingFork4503); 

                	newLeafNode(otherlv_3, grammarAccess.getRatingForkAccess().getAndKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2045:1: ( (lv_Max_4_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2046:1: (lv_Max_4_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2046:1: (lv_Max_4_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2047:3: lv_Max_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getMaxEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork4524);
            lv_Max_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatingForkRule());
            	        }
                   		set(
                   			current, 
                   			"Max",
                    		lv_Max_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2063:2: (otherlv_5= 'then' )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==52) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2063:4: otherlv_5= 'then'
                    {
                    otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleRatingFork4537); 

                        	newLeafNode(otherlv_5, grammarAccess.getRatingForkAccess().getThenKeyword_5());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleRatingFork4551); 

                	newLeafNode(otherlv_6, grammarAccess.getRatingForkAccess().getGoToKeyword_6());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2071:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2072:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2072:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2073:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRatingForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getQuestionsQuestionCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRatingFork4574);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2086:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==28) ) {
                    int LA110_1 = input.LA(2);

                    if ( ((LA110_1>=RULE_STRING && LA110_1<=RULE_ID)) ) {
                        alt110=1;
                    }


                }


                switch (alt110) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2086:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRatingFork4587); 

            	        	newLeafNode(otherlv_8, grammarAccess.getRatingForkAccess().getCommaKeyword_8_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2090:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2091:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2091:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2092:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRatingForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRatingForkAccess().getQuestionsQuestionCrossReference_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRatingFork4610);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRatingFork"


    // $ANTLR start "entryRuleRankingSumFork"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2113:1: entryRuleRankingSumFork returns [EObject current=null] : iv_ruleRankingSumFork= ruleRankingSumFork EOF ;
    public final EObject entryRuleRankingSumFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRankingSumFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2114:2: (iv_ruleRankingSumFork= ruleRankingSumFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2115:2: iv_ruleRankingSumFork= ruleRankingSumFork EOF
            {
             newCompositeNode(grammarAccess.getRankingSumForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_entryRuleRankingSumFork4648);
            iv_ruleRankingSumFork=ruleRankingSumFork();

            state._fsp--;

             current =iv_ruleRankingSumFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRankingSumFork4658); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRankingSumFork"


    // $ANTLR start "ruleRankingSumFork"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2122:1: ruleRankingSumFork returns [EObject current=null] : (otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= ':' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'to' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go to' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleRankingSumFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_Min_6_0 = null;

        AntlrDatatypeRuleToken lv_Max_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2125:28: ( (otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= ':' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'to' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go to' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2126:1: (otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= ':' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'to' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go to' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2126:1: (otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= ':' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'to' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go to' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2126:3: otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= ':' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'to' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go to' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleRankingSumFork4695); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingSumForkAccess().getIfKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2130:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2131:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2131:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2132:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getOnChoiceCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4718);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2145:2: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==28) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2145:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRankingSumFork4731); 

            	        	newLeafNode(otherlv_2, grammarAccess.getRankingSumForkAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2149:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2150:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2150:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2151:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getOnChoiceCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4754);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRankingSumFork4768); 

                	newLeafNode(otherlv_4, grammarAccess.getRankingSumForkAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2168:1: (otherlv_5= 'between' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==36) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2168:3: otherlv_5= 'between'
                    {
                    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRankingSumFork4781); 

                        	newLeafNode(otherlv_5, grammarAccess.getRankingSumForkAccess().getBetweenKeyword_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2172:3: ( (lv_Min_6_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2173:1: (lv_Min_6_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2173:1: (lv_Min_6_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2174:3: lv_Min_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getMinEIntParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingSumFork4804);
            lv_Min_6_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRankingSumForkRule());
            	        }
                   		set(
                   			current, 
                   			"Min",
                    		lv_Min_6_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRankingSumFork4816); 

                	newLeafNode(otherlv_7, grammarAccess.getRankingSumForkAccess().getToKeyword_6());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2194:1: ( (lv_Max_8_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2195:1: (lv_Max_8_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2195:1: (lv_Max_8_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2196:3: lv_Max_8_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getMaxEIntParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingSumFork4837);
            lv_Max_8_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRankingSumForkRule());
            	        }
                   		set(
                   			current, 
                   			"Max",
                    		lv_Max_8_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2212:2: (otherlv_9= 'then' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==52) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2212:4: otherlv_9= 'then'
                    {
                    otherlv_9=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleRankingSumFork4850); 

                        	newLeafNode(otherlv_9, grammarAccess.getRankingSumForkAccess().getThenKeyword_8());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleRankingSumFork4864); 

                	newLeafNode(otherlv_10, grammarAccess.getRankingSumForkAccess().getGoToKeyword_9());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2220:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2221:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2221:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2222:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getQuestionsQuestionCrossReference_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4887);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2235:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==28) ) {
                    int LA114_1 = input.LA(2);

                    if ( ((LA114_1>=RULE_STRING && LA114_1<=RULE_ID)) ) {
                        alt114=1;
                    }


                }


                switch (alt114) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2235:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRankingSumFork4900); 

            	        	newLeafNode(otherlv_12, grammarAccess.getRankingSumForkAccess().getCommaKeyword_11_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2239:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2240:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2240:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2241:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getQuestionsQuestionCrossReference_11_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4923);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRankingSumFork"


    // $ANTLR start "entryRuleDichotomousFork"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2262:1: entryRuleDichotomousFork returns [EObject current=null] : iv_ruleDichotomousFork= ruleDichotomousFork EOF ;
    public final EObject entryRuleDichotomousFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDichotomousFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2263:2: (iv_ruleDichotomousFork= ruleDichotomousFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2264:2: iv_ruleDichotomousFork= ruleDichotomousFork EOF
            {
             newCompositeNode(grammarAccess.getDichotomousForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDichotomousFork_in_entryRuleDichotomousFork4961);
            iv_ruleDichotomousFork=ruleDichotomousFork();

            state._fsp--;

             current =iv_ruleDichotomousFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDichotomousFork4971); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDichotomousFork"


    // $ANTLR start "ruleDichotomousFork"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2271:1: ruleDichotomousFork returns [EObject current=null] : ( (otherlv_0= 'then' )? otherlv_1= 'go to' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleDichotomousFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2274:28: ( ( (otherlv_0= 'then' )? otherlv_1= 'go to' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2275:1: ( (otherlv_0= 'then' )? otherlv_1= 'go to' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2275:1: ( (otherlv_0= 'then' )? otherlv_1= 'go to' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2275:2: (otherlv_0= 'then' )? otherlv_1= 'go to' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )*
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2275:2: (otherlv_0= 'then' )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==52) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2275:4: otherlv_0= 'then'
                    {
                    otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleDichotomousFork5009); 

                        	newLeafNode(otherlv_0, grammarAccess.getDichotomousForkAccess().getThenKeyword_0());
                        

                    }
                    break;

            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleDichotomousFork5023); 

                	newLeafNode(otherlv_1, grammarAccess.getDichotomousForkAccess().getGoToKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2283:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2284:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2284:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2285:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDichotomousForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDichotomousForkAccess().getQuestionsQuestionCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDichotomousFork5046);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2298:2: (otherlv_3= ',' ( ( ruleEString ) ) )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==28) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2298:4: otherlv_3= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDichotomousFork5059); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDichotomousForkAccess().getCommaKeyword_3_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2302:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2303:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2303:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2304:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDichotomousForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getDichotomousForkAccess().getQuestionsQuestionCrossReference_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDichotomousFork5082);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDichotomousFork"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSurvey_in_ruleModel141 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleModel154 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleSurvey_in_ruleModel175 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_ruleQuestion272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpen_in_ruleQuestion299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_Impl_in_ruleQuestion326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_ruleQuestion353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDichotomous_in_ruleQuestion380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumConstant_in_ruleQuestion407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStaple_in_ruleQuestion434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey469 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey534 = new BitSet(new long[]{0x00024C0600002002L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey556 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey568 = new BitSet(new long[]{0x00024C0600002002L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey590 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey602 = new BitSet(new long[]{0x00024C0600002002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString643 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice767 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleMultipleChoice823 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleChoice840 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleChoice857 = new BitSet(new long[]{0x000800012F3F8032L});
        public static final BitSet FOLLOW_15_in_ruleMultipleChoice871 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMultipleChoice885 = new BitSet(new long[]{0x000800012F3E0032L});
        public static final BitSet FOLLOW_17_in_ruleMultipleChoice900 = new BitSet(new long[]{0x000800012F380032L});
        public static final BitSet FOLLOW_18_in_ruleMultipleChoice924 = new BitSet(new long[]{0x000800012F380032L});
        public static final BitSet FOLLOW_19_in_ruleMultipleChoice953 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_20_in_ruleMultipleChoice968 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice991 = new BitSet(new long[]{0x000800012F200022L});
        public static final BitSet FOLLOW_21_in_ruleMultipleChoice1006 = new BitSet(new long[]{0x0040000000400040L});
        public static final BitSet FOLLOW_22_in_ruleMultipleChoice1019 = new BitSet(new long[]{0x0040000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultipleChoice1042 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMultipleChoice1054 = new BitSet(new long[]{0x000800012F000022L});
        public static final BitSet FOLLOW_24_in_ruleMultipleChoice1070 = new BitSet(new long[]{0x000000000F000020L});
        public static final BitSet FOLLOW_25_in_ruleMultipleChoice1085 = new BitSet(new long[]{0x000000000F000020L});
        public static final BitSet FOLLOW_26_in_ruleMultipleChoice1103 = new BitSet(new long[]{0x000000000F000020L});
        public static final BitSet FOLLOW_27_in_ruleMultipleChoice1118 = new BitSet(new long[]{0x000000000F000020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice1141 = new BitSet(new long[]{0x0008000130000002L});
        public static final BitSet FOLLOW_28_in_ruleMultipleChoice1154 = new BitSet(new long[]{0x000000000F000020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice1175 = new BitSet(new long[]{0x0008000130000002L});
        public static final BitSet FOLLOW_29_in_ruleMultipleChoice1192 = new BitSet(new long[]{0x00000000C1000030L});
        public static final BitSet FOLLOW_24_in_ruleMultipleChoice1205 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_30_in_ruleMultipleChoice1220 = new BitSet(new long[]{0x0000000080000030L});
        public static final BitSet FOLLOW_31_in_ruleMultipleChoice1235 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice1258 = new BitSet(new long[]{0x0008000100000002L});
        public static final BitSet FOLLOW_32_in_ruleMultipleChoice1273 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1297 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleMultipleChoice1310 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1331 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleOpen_in_entryRuleOpen1371 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpen1381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleOpen1427 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOpen1444 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleOpen1461 = new BitSet(new long[]{0x00000000001F8032L});
        public static final BitSet FOLLOW_15_in_ruleOpen1475 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOpen1489 = new BitSet(new long[]{0x00000000001E0032L});
        public static final BitSet FOLLOW_17_in_ruleOpen1504 = new BitSet(new long[]{0x0000000000180032L});
        public static final BitSet FOLLOW_18_in_ruleOpen1522 = new BitSet(new long[]{0x0000000000180032L});
        public static final BitSet FOLLOW_19_in_ruleOpen1538 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_20_in_ruleOpen1553 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpen1576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1614 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRating_Impl1624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleRating_Impl1670 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRating_Impl1687 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRating_Impl1704 = new BitSet(new long[]{0x004802F8004F8072L});
        public static final BitSet FOLLOW_15_in_ruleRating_Impl1718 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRating_Impl1732 = new BitSet(new long[]{0x004802F8004E0072L});
        public static final BitSet FOLLOW_17_in_ruleRating_Impl1747 = new BitSet(new long[]{0x004802F800480072L});
        public static final BitSet FOLLOW_18_in_ruleRating_Impl1765 = new BitSet(new long[]{0x004802F800480072L});
        public static final BitSet FOLLOW_19_in_ruleRating_Impl1781 = new BitSet(new long[]{0x0000000800000030L});
        public static final BitSet FOLLOW_35_in_ruleRating_Impl1796 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1819 = new BitSet(new long[]{0x004802F000400042L});
        public static final BitSet FOLLOW_36_in_ruleRating_Impl1835 = new BitSet(new long[]{0x0040000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1858 = new BitSet(new long[]{0x004802E000400042L});
        public static final BitSet FOLLOW_37_in_ruleRating_Impl1874 = new BitSet(new long[]{0x0040000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1897 = new BitSet(new long[]{0x000802E000000002L});
        public static final BitSet FOLLOW_38_in_ruleRating_Impl1913 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleRating_Impl1927 = new BitSet(new long[]{0x0000010000000030L});
        public static final BitSet FOLLOW_40_in_ruleRating_Impl1940 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1963 = new BitSet(new long[]{0x0008022000000002L});
        public static final BitSet FOLLOW_37_in_ruleRating_Impl1979 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleRating_Impl1993 = new BitSet(new long[]{0x0000010000000030L});
        public static final BitSet FOLLOW_40_in_ruleRating_Impl2006 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl2029 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl2053 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleRating_Impl2066 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl2087 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleRanking_in_entryRuleRanking2127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRanking2137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleRanking2174 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRanking2191 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRanking2208 = new BitSet(new long[]{0x000800010F1F8032L});
        public static final BitSet FOLLOW_15_in_ruleRanking2222 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRanking2236 = new BitSet(new long[]{0x000800010F1E0032L});
        public static final BitSet FOLLOW_17_in_ruleRanking2251 = new BitSet(new long[]{0x000800010F180032L});
        public static final BitSet FOLLOW_18_in_ruleRanking2275 = new BitSet(new long[]{0x000800010F180032L});
        public static final BitSet FOLLOW_19_in_ruleRanking2304 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_20_in_ruleRanking2319 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRanking2342 = new BitSet(new long[]{0x000800010F000022L});
        public static final BitSet FOLLOW_24_in_ruleRanking2358 = new BitSet(new long[]{0x000000000F000020L});
        public static final BitSet FOLLOW_25_in_ruleRanking2373 = new BitSet(new long[]{0x000000000F000020L});
        public static final BitSet FOLLOW_26_in_ruleRanking2391 = new BitSet(new long[]{0x000000000F000020L});
        public static final BitSet FOLLOW_27_in_ruleRanking2406 = new BitSet(new long[]{0x000000000F000020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2429 = new BitSet(new long[]{0x0008000110000002L});
        public static final BitSet FOLLOW_28_in_ruleRanking2442 = new BitSet(new long[]{0x000000000F000020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2463 = new BitSet(new long[]{0x0008000110000002L});
        public static final BitSet FOLLOW_32_in_ruleRanking2480 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleRanking2504 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleRanking2517 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleRanking2538 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleDichotomous_in_entryRuleDichotomous2578 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDichotomous2588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleDichotomous2634 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDichotomous2651 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDichotomous2668 = new BitSet(new long[]{0x00003000001F8032L});
        public static final BitSet FOLLOW_15_in_ruleDichotomous2682 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDichotomous2696 = new BitSet(new long[]{0x00003000001E0032L});
        public static final BitSet FOLLOW_17_in_ruleDichotomous2711 = new BitSet(new long[]{0x0000300000180032L});
        public static final BitSet FOLLOW_18_in_ruleDichotomous2735 = new BitSet(new long[]{0x0000300000180032L});
        public static final BitSet FOLLOW_19_in_ruleDichotomous2764 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_20_in_ruleDichotomous2779 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDichotomous2802 = new BitSet(new long[]{0x0000300000000002L});
        public static final BitSet FOLLOW_44_in_ruleDichotomous2817 = new BitSet(new long[]{0x0030000000000000L});
        public static final BitSet FOLLOW_ruleDichotomousFork_in_ruleDichotomous2838 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleDichotomous2853 = new BitSet(new long[]{0x0030000000000000L});
        public static final BitSet FOLLOW_ruleDichotomousFork_in_ruleDichotomous2874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumConstant_in_entryRuleSumConstant2912 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSumConstant2922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleSumConstant2968 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSumConstant2985 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSumConstant3002 = new BitSet(new long[]{0x00408000005F8070L});
        public static final BitSet FOLLOW_15_in_ruleSumConstant3016 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSumConstant3030 = new BitSet(new long[]{0x00408000005E0070L});
        public static final BitSet FOLLOW_17_in_ruleSumConstant3045 = new BitSet(new long[]{0x0040800000580070L});
        public static final BitSet FOLLOW_18_in_ruleSumConstant3069 = new BitSet(new long[]{0x0040800000580070L});
        public static final BitSet FOLLOW_19_in_ruleSumConstant3098 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_20_in_ruleSumConstant3113 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSumConstant3136 = new BitSet(new long[]{0x0040800000400040L});
        public static final BitSet FOLLOW_47_in_ruleSumConstant3151 = new BitSet(new long[]{0x0040000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSumConstant3174 = new BitSet(new long[]{0x0009000000000002L});
        public static final BitSet FOLLOW_48_in_ruleSumConstant3187 = new BitSet(new long[]{0x000000000F000020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleSumConstant3208 = new BitSet(new long[]{0x0008000010000002L});
        public static final BitSet FOLLOW_28_in_ruleSumConstant3221 = new BitSet(new long[]{0x000000000F000020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleSumConstant3242 = new BitSet(new long[]{0x0008000010000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleSumConstant3268 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleSumConstant3281 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleSumConstant3302 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleStaple_in_entryRuleStaple3342 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStaple3352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleStaple3398 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStaple3415 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleStaple3432 = new BitSet(new long[]{0x004C02F0005F8072L});
        public static final BitSet FOLLOW_15_in_ruleStaple3446 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleStaple3460 = new BitSet(new long[]{0x004C02F0005E0072L});
        public static final BitSet FOLLOW_17_in_ruleStaple3475 = new BitSet(new long[]{0x004C02F000580072L});
        public static final BitSet FOLLOW_18_in_ruleStaple3499 = new BitSet(new long[]{0x004C02F000580072L});
        public static final BitSet FOLLOW_19_in_ruleStaple3528 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_20_in_ruleStaple3543 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3566 = new BitSet(new long[]{0x004C02F000400042L});
        public static final BitSet FOLLOW_36_in_ruleStaple3582 = new BitSet(new long[]{0x0040000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStaple3605 = new BitSet(new long[]{0x004C02E000400042L});
        public static final BitSet FOLLOW_37_in_ruleStaple3621 = new BitSet(new long[]{0x0040000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStaple3644 = new BitSet(new long[]{0x000C02E000000002L});
        public static final BitSet FOLLOW_38_in_ruleStaple3660 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleStaple3674 = new BitSet(new long[]{0x0000010010000030L});
        public static final BitSet FOLLOW_40_in_ruleStaple3687 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_28_in_ruleStaple3702 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3725 = new BitSet(new long[]{0x000C022000000002L});
        public static final BitSet FOLLOW_50_in_ruleStaple3740 = new BitSet(new long[]{0x0000010000000030L});
        public static final BitSet FOLLOW_40_in_ruleStaple3753 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3776 = new BitSet(new long[]{0x0008022000000002L});
        public static final BitSet FOLLOW_37_in_ruleStaple3792 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleStaple3806 = new BitSet(new long[]{0x0000010000000030L});
        public static final BitSet FOLLOW_40_in_ruleStaple3819 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3842 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3866 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleStaple3879 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3900 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice3940 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoice3950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleChoice3992 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleChoice4009 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoice4030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_entryRuleChoiceFork4066 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceFork4076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleChoiceFork4113 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork4136 = new BitSet(new long[]{0x0030000010000000L});
        public static final BitSet FOLLOW_28_in_ruleChoiceFork4149 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork4172 = new BitSet(new long[]{0x0030000010000000L});
        public static final BitSet FOLLOW_52_in_ruleChoiceFork4187 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleChoiceFork4201 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork4224 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleChoiceFork4237 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork4260 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleEInt4349 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_entryRuleRatingFork4411 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRatingFork4421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleRatingFork4458 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleRatingFork4470 = new BitSet(new long[]{0x0040000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork4491 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleRatingFork4503 = new BitSet(new long[]{0x0040000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork4524 = new BitSet(new long[]{0x0030000000000000L});
        public static final BitSet FOLLOW_52_in_ruleRatingFork4537 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleRatingFork4551 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRatingFork4574 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleRatingFork4587 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRatingFork4610 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_entryRuleRankingSumFork4648 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRankingSumFork4658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleRankingSumFork4695 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4718 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_28_in_ruleRankingSumFork4731 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4754 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_14_in_ruleRankingSumFork4768 = new BitSet(new long[]{0x0040001000400040L});
        public static final BitSet FOLLOW_36_in_ruleRankingSumFork4781 = new BitSet(new long[]{0x0040000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingSumFork4804 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleRankingSumFork4816 = new BitSet(new long[]{0x0040000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingSumFork4837 = new BitSet(new long[]{0x0030000000000000L});
        public static final BitSet FOLLOW_52_in_ruleRankingSumFork4850 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleRankingSumFork4864 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4887 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleRankingSumFork4900 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4923 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleDichotomousFork_in_entryRuleDichotomousFork4961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDichotomousFork4971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleDichotomousFork5009 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleDichotomousFork5023 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDichotomousFork5046 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleDichotomousFork5059 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDichotomousFork5082 = new BitSet(new long[]{0x0000000010000002L});
    }


}