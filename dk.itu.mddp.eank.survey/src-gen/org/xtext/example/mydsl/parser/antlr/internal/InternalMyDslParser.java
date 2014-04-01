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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MultipleChoice'", "':'", "'the'", "'user'", "'may'", "'is'", "'required'", "'to'", "'answer'", "'picking'", "'up to'", "'from'", "'one of'", "'some of'", "'these'", "','", "'or'", "'with'", "'something'", "'else'", "'Open'", "'Rating'", "'rate'", "'between'", "'and'", "'where'", "'lowest'", "'means'", "'highest'", "'Ranking'", "'rank'", "'Dichotomous'", "'if'", "'yes'", "'no'", "'ConstantSum'", "'distribute'", "'a'", "'total'", "'of'", "'among'", "'Staple'", "'mid'", "'then'", "'go'", "'-'", "'it'"
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
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : ( () ( (lv_surveys_1_0= ruleSurvey ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_surveys_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( () ( (lv_surveys_1_0= ruleSurvey ) )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( () ( (lv_surveys_1_0= ruleSurvey ) )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( () ( (lv_surveys_1_0= ruleSurvey ) )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: () ( (lv_surveys_1_0= ruleSurvey ) )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:2: ( (lv_surveys_1_0= ruleSurvey ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:1: (lv_surveys_1_0= ruleSurvey )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:1: (lv_surveys_1_0= ruleSurvey )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:88:3: lv_surveys_1_0= ruleSurvey
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getSurveysSurveyParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_ruleModel140);
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:112:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:113:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:114:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion177);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion187); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:1: ruleQuestion returns [EObject current=null] : (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_ConstantSum_5= ruleConstantSum | this_Staple_6= ruleStaple ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_MultipleChoice_0 = null;

        EObject this_Open_1 = null;

        EObject this_Rating_Impl_2 = null;

        EObject this_Ranking_3 = null;

        EObject this_Dichotomous_4 = null;

        EObject this_ConstantSum_5 = null;

        EObject this_Staple_6 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:28: ( (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_ConstantSum_5= ruleConstantSum | this_Staple_6= ruleStaple ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_ConstantSum_5= ruleConstantSum | this_Staple_6= ruleStaple )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_ConstantSum_5= ruleConstantSum | this_Staple_6= ruleStaple )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 40:
                {
                alt2=4;
                }
                break;
            case 42:
                {
                alt2=5;
                }
                break;
            case 46:
                {
                alt2=6;
                }
                break;
            case 52:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:5: this_MultipleChoice_0= ruleMultipleChoice
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleChoiceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_ruleQuestion234);
                    this_MultipleChoice_0=ruleMultipleChoice();

                    state._fsp--;

                     
                            current = this_MultipleChoice_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:5: this_Open_1= ruleOpen
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getOpenParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOpen_in_ruleQuestion261);
                    this_Open_1=ruleOpen();

                    state._fsp--;

                     
                            current = this_Open_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:146:5: this_Rating_Impl_2= ruleRating_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRating_ImplParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRating_Impl_in_ruleQuestion288);
                    this_Rating_Impl_2=ruleRating_Impl();

                    state._fsp--;

                     
                            current = this_Rating_Impl_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:5: this_Ranking_3= ruleRanking
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRankingParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRanking_in_ruleQuestion315);
                    this_Ranking_3=ruleRanking();

                    state._fsp--;

                     
                            current = this_Ranking_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:166:5: this_Dichotomous_4= ruleDichotomous
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getDichotomousParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDichotomous_in_ruleQuestion342);
                    this_Dichotomous_4=ruleDichotomous();

                    state._fsp--;

                     
                            current = this_Dichotomous_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:176:5: this_ConstantSum_5= ruleConstantSum
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getConstantSumParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstantSum_in_ruleQuestion369);
                    this_ConstantSum_5=ruleConstantSum();

                    state._fsp--;

                     
                            current = this_ConstantSum_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:186:5: this_Staple_6= ruleStaple
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getStapleParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStaple_in_ruleQuestion396);
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:202:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:203:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:204:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey431);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey441); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:211:1: ruleSurvey returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )? ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_questions_2_0 = null;

        EObject lv_questions_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:214:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:215:1: ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:215:1: ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:215:2: () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:215:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:216:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:221:2: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:222:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:222:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:223:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey496);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:239:2: ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11||(LA4_0>=31 && LA4_0<=32)||LA4_0==40||LA4_0==42||LA4_0==46||LA4_0==52) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:239:3: ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:239:3: ( (lv_questions_2_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:240:1: (lv_questions_2_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:240:1: (lv_questions_2_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:241:3: lv_questions_2_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey518);
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

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:257:2: ( (lv_questions_3_0= ruleQuestion ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==11||(LA3_0>=31 && LA3_0<=32)||LA3_0==40||LA3_0==42||LA3_0==46||LA3_0==52) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:258:1: (lv_questions_3_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:258:1: (lv_questions_3_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:259:3: lv_questions_3_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey539);
                    	    lv_questions_3_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"questions",
                    	            		lv_questions_3_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:283:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:284:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:285:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString579);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString590); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:292:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:295:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:296:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:296:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:296:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString630); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:304:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString656); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:321:1: entryRuleMultipleChoice returns [EObject current=null] : iv_ruleMultipleChoice= ruleMultipleChoice EOF ;
    public final EObject entryRuleMultipleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoice = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:322:2: (iv_ruleMultipleChoice= ruleMultipleChoice EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:323:2: iv_ruleMultipleChoice= ruleMultipleChoice EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice703);
            iv_ruleMultipleChoice=ruleMultipleChoice();

            state._fsp--;

             current =iv_ruleMultipleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoice713); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:330:1: ruleMultipleChoice returns [EObject current=null] : ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleChoiceFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )* )? ) ;
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
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_question_11_0 = null;

        AntlrDatatypeRuleToken lv_answerCount_14_0 = null;

        EObject lv_choice_19_0 = null;

        EObject lv_choice_21_0 = null;

        AntlrDatatypeRuleToken lv_other_26_0 = null;

        EObject lv_Fork_27_0 = null;

        EObject lv_Fork_29_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:333:28: ( ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleChoiceFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:1: ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleChoiceFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:1: ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleChoiceFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:2: () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleChoiceFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:335:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultipleChoiceAccess().getMultipleChoiceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMultipleChoice759); 

                	newLeafNode(otherlv_1, grammarAccess.getMultipleChoiceAccess().getMultipleChoiceKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:344:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:345:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:345:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:346:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultipleChoice776); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultipleChoice793); 

                	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:366:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=13 && LA7_0<=14)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:366:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:366:2: (otherlv_4= 'the' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==13) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:366:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleChoice807); 

                                	newLeafNode(otherlv_4, grammarAccess.getMultipleChoiceAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleChoice821); 

                        	newLeafNode(otherlv_5, grammarAccess.getMultipleChoiceAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:374:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:374:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultipleChoice836); 

                        	newLeafNode(otherlv_6, grammarAccess.getMultipleChoiceAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:379:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:379:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:379:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:379:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:380:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:380:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:381:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultipleChoice861); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getMultipleChoiceAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultipleChoice886); 

                        	newLeafNode(otherlv_8, grammarAccess.getMultipleChoiceAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:4: (otherlv_9= 'to' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultipleChoice902); 

                        	newLeafNode(otherlv_9, grammarAccess.getMultipleChoiceAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:402:3: (otherlv_10= 'answer' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:402:5: otherlv_10= 'answer'
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultipleChoice917); 

                        	newLeafNode(otherlv_10, grammarAccess.getMultipleChoiceAccess().getAnswerKeyword_7());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:406:3: ( (lv_question_11_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:407:1: (lv_question_11_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:407:1: (lv_question_11_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:408:3: lv_question_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice940);
            lv_question_11_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
            	        }
                   		set(
                   			current, 
                   			"question",
                    		lv_question_11_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:2: (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:4: otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultipleChoice953); 

                        	newLeafNode(otherlv_12, grammarAccess.getMultipleChoiceAccess().getPickingKeyword_9_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:428:1: (otherlv_13= 'up to' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==21) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:428:3: otherlv_13= 'up to'
                            {
                            otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultipleChoice966); 

                                	newLeafNode(otherlv_13, grammarAccess.getMultipleChoiceAccess().getUpToKeyword_9_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:432:3: ( (lv_answerCount_14_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:1: (lv_answerCount_14_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:1: (lv_answerCount_14_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:434:3: lv_answerCount_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getAnswerCountEIntParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultipleChoice989);
                    lv_answerCount_14_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		set(
                           			current, 
                           			"answerCount",
                            		lv_answerCount_14_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:450:4: (otherlv_15= 'from' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:450:6: otherlv_15= 'from'
                    {
                    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMultipleChoice1004); 

                        	newLeafNode(otherlv_15, grammarAccess.getMultipleChoiceAccess().getFromKeyword_10());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:454:3: (otherlv_16= 'one of' | otherlv_17= 'some of' )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            else if ( (LA14_0==24) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:454:5: otherlv_16= 'one of'
                    {
                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMultipleChoice1019); 

                        	newLeafNode(otherlv_16, grammarAccess.getMultipleChoiceAccess().getOneOfKeyword_11_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:7: otherlv_17= 'some of'
                    {
                    otherlv_17=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultipleChoice1037); 

                        	newLeafNode(otherlv_17, grammarAccess.getMultipleChoiceAccess().getSomeOfKeyword_11_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:463:3: (otherlv_18= 'these' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:463:5: otherlv_18= 'these'
                    {
                    otherlv_18=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultipleChoice1052); 

                        	newLeafNode(otherlv_18, grammarAccess.getMultipleChoiceAccess().getTheseKeyword_12());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:467:3: ( (lv_choice_19_0= ruleChoice ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:468:1: (lv_choice_19_0= ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:468:1: (lv_choice_19_0= ruleChoice )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:469:3: lv_choice_19_0= ruleChoice
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_13_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice1075);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:485:2: (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:485:4: otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) )
            	    {
            	    otherlv_20=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleChoice1088); 

            	        	newLeafNode(otherlv_20, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_14_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:489:1: ( (lv_choice_21_0= ruleChoice ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:490:1: (lv_choice_21_0= ruleChoice )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:490:1: (lv_choice_21_0= ruleChoice )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:491:3: lv_choice_21_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_14_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice1109);
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
            	    break loop16;
                }
            } while (true);

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:507:4: (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:507:6: otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultipleChoice1124); 

                        	newLeafNode(otherlv_22, grammarAccess.getMultipleChoiceAccess().getOrKeyword_15_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:511:1: (otherlv_23= 'with' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==28) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:511:3: otherlv_23= 'with'
                            {
                            otherlv_23=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMultipleChoice1137); 

                                	newLeafNode(otherlv_23, grammarAccess.getMultipleChoiceAccess().getWithKeyword_15_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:3: (otherlv_24= 'something' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==29) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:5: otherlv_24= 'something'
                            {
                            otherlv_24=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMultipleChoice1152); 

                                	newLeafNode(otherlv_24, grammarAccess.getMultipleChoiceAccess().getSomethingKeyword_15_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:519:3: (otherlv_25= 'else' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==30) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:519:5: otherlv_25= 'else'
                            {
                            otherlv_25=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMultipleChoice1167); 

                                	newLeafNode(otherlv_25, grammarAccess.getMultipleChoiceAccess().getElseKeyword_15_3());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:523:3: ( (lv_other_26_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:524:1: (lv_other_26_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:524:1: (lv_other_26_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:525:3: lv_other_26_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getOtherEStringParserRuleCall_15_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice1190);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:4: ( ( (lv_Fork_27_0= ruleChoiceFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:5: ( (lv_Fork_27_0= ruleChoiceFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:5: ( (lv_Fork_27_0= ruleChoiceFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:542:1: (lv_Fork_27_0= ruleChoiceFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:542:1: (lv_Fork_27_0= ruleChoiceFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:543:3: lv_Fork_27_0= ruleChoiceFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getForkChoiceForkParserRuleCall_16_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1214);
                    lv_Fork_27_0=ruleChoiceFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		add(
                           			current, 
                           			"Fork",
                            		lv_Fork_27_0, 
                            		"ChoiceFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:559:2: (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==26) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:559:4: otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) )
                    	    {
                    	    otherlv_28=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleChoice1227); 

                    	        	newLeafNode(otherlv_28, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_16_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:563:1: ( (lv_Fork_29_0= ruleChoiceFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:564:1: (lv_Fork_29_0= ruleChoiceFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:564:1: (lv_Fork_29_0= ruleChoiceFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:565:3: lv_Fork_29_0= ruleChoiceFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getForkChoiceForkParserRuleCall_16_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1248);
                    	    lv_Fork_29_0=ruleChoiceFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Fork",
                    	            		lv_Fork_29_0, 
                    	            		"ChoiceFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:589:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:590:2: (iv_ruleOpen= ruleOpen EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:591:2: iv_ruleOpen= ruleOpen EOF
            {
             newCompositeNode(grammarAccess.getOpenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpen_in_entryRuleOpen1288);
            iv_ruleOpen=ruleOpen();

            state._fsp--;

             current =iv_ruleOpen; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpen1298); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:598:1: ruleOpen returns [EObject current=null] : ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) ) ;
    public final EObject ruleOpen() throws RecognitionException {
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
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_question_11_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:601:28: ( ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:1: ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:1: ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:2: () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOpenAccess().getOpenAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOpen1344); 

                	newLeafNode(otherlv_1, grammarAccess.getOpenAccess().getOpenKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:612:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:613:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:613:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:614:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOpen1361); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOpen1378); 

                	newLeafNode(otherlv_3, grammarAccess.getOpenAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:634:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=13 && LA24_0<=14)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:634:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:634:2: (otherlv_4= 'the' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==13) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:634:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOpen1392); 

                                	newLeafNode(otherlv_4, grammarAccess.getOpenAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOpen1406); 

                        	newLeafNode(otherlv_5, grammarAccess.getOpenAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            else if ( (LA25_0==16) ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOpen1421); 

                        	newLeafNode(otherlv_6, grammarAccess.getOpenAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:649:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOpen1446); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getOpenAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOpenRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOpen1471); 

                        	newLeafNode(otherlv_8, grammarAccess.getOpenAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:666:4: (otherlv_9= 'to' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:666:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOpen1487); 

                        	newLeafNode(otherlv_9, grammarAccess.getOpenAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:3: (otherlv_10= 'answer' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:5: otherlv_10= 'answer'
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOpen1502); 

                        	newLeafNode(otherlv_10, grammarAccess.getOpenAccess().getAnswerKeyword_7());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:674:3: ( (lv_question_11_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:675:1: (lv_question_11_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:675:1: (lv_question_11_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:676:3: lv_question_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOpenAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpen1525);
            lv_question_11_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpenRule());
            	        }
                   		set(
                   			current, 
                   			"question",
                    		lv_question_11_0, 
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
    // $ANTLR end "ruleOpen"


    // $ANTLR start "entryRuleRating_Impl"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:700:1: entryRuleRating_Impl returns [EObject current=null] : iv_ruleRating_Impl= ruleRating_Impl EOF ;
    public final EObject entryRuleRating_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating_Impl = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:2: (iv_ruleRating_Impl= ruleRating_Impl EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:2: iv_ruleRating_Impl= ruleRating_Impl EOF
            {
             newCompositeNode(grammarAccess.getRating_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1561);
            iv_ruleRating_Impl=ruleRating_Impl();

            state._fsp--;

             current =iv_ruleRating_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRating_Impl1571); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:709:1: ruleRating_Impl returns [EObject current=null] : ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? otherlv_22= 'highest' (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* )? ) ;
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
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_question_12_0 = null;

        AntlrDatatypeRuleToken lv_Min_14_0 = null;

        AntlrDatatypeRuleToken lv_Max_16_0 = null;

        AntlrDatatypeRuleToken lv_first_20_0 = null;

        AntlrDatatypeRuleToken lv_last_24_0 = null;

        EObject lv_Fork_25_0 = null;

        EObject lv_Fork_27_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:712:28: ( ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? otherlv_22= 'highest' (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:1: ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? otherlv_22= 'highest' (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:1: ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? otherlv_22= 'highest' (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:2: () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? otherlv_22= 'highest' (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRating_ImplAccess().getRatingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRating_Impl1617); 

                	newLeafNode(otherlv_1, grammarAccess.getRating_ImplAccess().getRatingKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:723:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:724:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:724:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:725:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRating_Impl1634); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRating_Impl1651); 

                	newLeafNode(otherlv_3, grammarAccess.getRating_ImplAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:745:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=13 && LA29_0<=14)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:745:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:745:2: (otherlv_4= 'the' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==13) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:745:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRating_Impl1665); 

                                	newLeafNode(otherlv_4, grammarAccess.getRating_ImplAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRating_Impl1679); 

                        	newLeafNode(otherlv_5, grammarAccess.getRating_ImplAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:753:3: (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==15) ) {
                alt30=1;
            }
            else if ( (LA30_0==16) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:753:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRating_Impl1694); 

                        	newLeafNode(otherlv_6, grammarAccess.getRating_ImplAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:758:6: (otherlv_7= 'is' otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:758:6: (otherlv_7= 'is' otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:758:8: otherlv_7= 'is' otherlv_8= 'required'
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRating_Impl1713); 

                        	newLeafNode(otherlv_7, grammarAccess.getRating_ImplAccess().getIsKeyword_5_1_0());
                        
                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRating_Impl1725); 

                        	newLeafNode(otherlv_8, grammarAccess.getRating_ImplAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:4: (otherlv_9= 'to' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRating_Impl1741); 

                        	newLeafNode(otherlv_9, grammarAccess.getRating_ImplAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:770:3: (otherlv_10= 'rate' | otherlv_11= 'answer' )?
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            else if ( (LA32_0==19) ) {
                alt32=2;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:770:5: otherlv_10= 'rate'
                    {
                    otherlv_10=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRating_Impl1756); 

                        	newLeafNode(otherlv_10, grammarAccess.getRating_ImplAccess().getRateKeyword_7_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:775:7: otherlv_11= 'answer'
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRating_Impl1774); 

                        	newLeafNode(otherlv_11, grammarAccess.getRating_ImplAccess().getAnswerKeyword_7_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:779:3: ( (lv_question_12_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:780:1: (lv_question_12_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:780:1: (lv_question_12_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:781:3: lv_question_12_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1797);
            lv_question_12_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"question",
                    		lv_question_12_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:797:2: (otherlv_13= 'between' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:797:4: otherlv_13= 'between'
                    {
                    otherlv_13=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRating_Impl1810); 

                        	newLeafNode(otherlv_13, grammarAccess.getRating_ImplAccess().getBetweenKeyword_9());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:801:3: ( (lv_Min_14_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:802:1: (lv_Min_14_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:802:1: (lv_Min_14_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:803:3: lv_Min_14_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMinEIntParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1833);
            lv_Min_14_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"Min",
                    		lv_Min_14_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:819:2: (otherlv_15= 'and' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:819:4: otherlv_15= 'and'
                    {
                    otherlv_15=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRating_Impl1846); 

                        	newLeafNode(otherlv_15, grammarAccess.getRating_ImplAccess().getAndKeyword_11());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:823:3: ( (lv_Max_16_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:824:1: (lv_Max_16_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:824:1: (lv_Max_16_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:825:3: lv_Max_16_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMaxEIntParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1869);
            lv_Max_16_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"Max",
                    		lv_Max_16_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:841:2: (otherlv_17= 'where' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:841:4: otherlv_17= 'where'
                    {
                    otherlv_17=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRating_Impl1882); 

                        	newLeafNode(otherlv_17, grammarAccess.getRating_ImplAccess().getWhereKeyword_13());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleRating_Impl1896); 

                	newLeafNode(otherlv_18, grammarAccess.getRating_ImplAccess().getLowestKeyword_14());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:849:1: (otherlv_19= 'means' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:849:3: otherlv_19= 'means'
                    {
                    otherlv_19=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRating_Impl1909); 

                        	newLeafNode(otherlv_19, grammarAccess.getRating_ImplAccess().getMeansKeyword_15());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:853:3: ( (lv_first_20_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:854:1: (lv_first_20_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:854:1: (lv_first_20_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:855:3: lv_first_20_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getFirstEStringParserRuleCall_16_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1932);
            lv_first_20_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"first",
                    		lv_first_20_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:2: (otherlv_21= 'and' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:4: otherlv_21= 'and'
                    {
                    otherlv_21=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRating_Impl1945); 

                        	newLeafNode(otherlv_21, grammarAccess.getRating_ImplAccess().getAndKeyword_17());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleRating_Impl1959); 

                	newLeafNode(otherlv_22, grammarAccess.getRating_ImplAccess().getHighestKeyword_18());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:879:1: (otherlv_23= 'means' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:879:3: otherlv_23= 'means'
                    {
                    otherlv_23=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRating_Impl1972); 

                        	newLeafNode(otherlv_23, grammarAccess.getRating_ImplAccess().getMeansKeyword_19());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:883:3: ( (lv_last_24_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:884:1: (lv_last_24_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:884:1: (lv_last_24_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:885:3: lv_last_24_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getLastEStringParserRuleCall_20_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1995);
            lv_last_24_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"last",
                    		lv_last_24_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:901:2: ( ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:901:3: ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:901:3: ( (lv_Fork_25_0= ruleRatingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:902:1: (lv_Fork_25_0= ruleRatingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:902:1: (lv_Fork_25_0= ruleRatingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:903:3: lv_Fork_25_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getForkRatingForkParserRuleCall_21_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl2017);
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

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:919:2: (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==26) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:919:4: otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) )
                    	    {
                    	    otherlv_26=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRating_Impl2030); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getRating_ImplAccess().getCommaKeyword_21_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:923:1: ( (lv_Fork_27_0= ruleRatingFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:924:1: (lv_Fork_27_0= ruleRatingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:924:1: (lv_Fork_27_0= ruleRatingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:925:3: lv_Fork_27_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getForkRatingForkParserRuleCall_21_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl2051);
                    	    lv_Fork_27_0=ruleRatingFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Fork",
                    	            		lv_Fork_27_0, 
                    	            		"RatingFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:949:1: entryRuleRanking returns [EObject current=null] : iv_ruleRanking= ruleRanking EOF ;
    public final EObject entryRuleRanking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRanking = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:950:2: (iv_ruleRanking= ruleRanking EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:951:2: iv_ruleRanking= ruleRanking EOF
            {
             newCompositeNode(grammarAccess.getRankingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRanking_in_entryRuleRanking2091);
            iv_ruleRanking=ruleRanking();

            state._fsp--;

             current =iv_ruleRanking; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRanking2101); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:958:1: ruleRanking returns [EObject current=null] : (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_Fork_19_0= ruleRankingSumFork ) ) (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )* )? ) ;
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
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_question_11_0 = null;

        EObject lv_choices_16_0 = null;

        EObject lv_choices_18_0 = null;

        EObject lv_Fork_19_0 = null;

        EObject lv_Fork_21_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:961:28: ( (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_Fork_19_0= ruleRankingSumFork ) ) (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:962:1: (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_Fork_19_0= ruleRankingSumFork ) ) (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:962:1: (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_Fork_19_0= ruleRankingSumFork ) ) (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:962:3: otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_Fork_19_0= ruleRankingSumFork ) ) (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )* )?
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRanking2138); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingAccess().getRankingKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:967:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:967:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRanking2155); 

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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRanking2172); 

                	newLeafNode(otherlv_2, grammarAccess.getRankingAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:1: ( (otherlv_3= 'the' )? otherlv_4= 'user' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=13 && LA42_0<=14)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:2: (otherlv_3= 'the' )? otherlv_4= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:2: (otherlv_3= 'the' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==13) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:4: otherlv_3= 'the'
                            {
                            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRanking2186); 

                                	newLeafNode(otherlv_3, grammarAccess.getRankingAccess().getTheKeyword_3_0());
                                

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRanking2200); 

                        	newLeafNode(otherlv_4, grammarAccess.getRankingAccess().getUserKeyword_3_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:996:3: (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )?
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==15) ) {
                alt43=1;
            }
            else if ( (LA43_0==16) ) {
                alt43=2;
            }
            switch (alt43) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:996:5: otherlv_5= 'may'
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRanking2215); 

                        	newLeafNode(otherlv_5, grammarAccess.getRankingAccess().getMayKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1001:6: ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1001:6: ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1001:7: ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1001:7: ( (lv_isRequired_6_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1002:1: (lv_isRequired_6_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1002:1: (lv_isRequired_6_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:3: lv_isRequired_6_0= 'is'
                    {
                    lv_isRequired_6_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRanking2240); 

                            newLeafNode(lv_isRequired_6_0, grammarAccess.getRankingAccess().getIsRequiredIsKeyword_4_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRankingRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRanking2265); 

                        	newLeafNode(otherlv_7, grammarAccess.getRankingAccess().getRequiredKeyword_4_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1020:4: (otherlv_8= 'to' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==18) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1020:6: otherlv_8= 'to'
                    {
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRanking2281); 

                        	newLeafNode(otherlv_8, grammarAccess.getRankingAccess().getToKeyword_5());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1024:3: (otherlv_9= 'rank' | otherlv_10= 'answer' )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            else if ( (LA45_0==19) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1024:5: otherlv_9= 'rank'
                    {
                    otherlv_9=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRanking2296); 

                        	newLeafNode(otherlv_9, grammarAccess.getRankingAccess().getRankKeyword_6_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1029:7: otherlv_10= 'answer'
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRanking2314); 

                        	newLeafNode(otherlv_10, grammarAccess.getRankingAccess().getAnswerKeyword_6_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1033:3: ( (lv_question_11_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1034:1: (lv_question_11_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1034:1: (lv_question_11_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1035:3: lv_question_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRankingAccess().getQuestionEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRanking2337);
            lv_question_11_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRankingRule());
            	        }
                   		set(
                   			current, 
                   			"question",
                    		lv_question_11_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1051:2: (otherlv_12= 'from' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==22) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1051:4: otherlv_12= 'from'
                    {
                    otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRanking2350); 

                        	newLeafNode(otherlv_12, grammarAccess.getRankingAccess().getFromKeyword_8());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1055:3: (otherlv_13= 'one of' | otherlv_14= 'some of' )?
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==23) ) {
                alt47=1;
            }
            else if ( (LA47_0==24) ) {
                alt47=2;
            }
            switch (alt47) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1055:5: otherlv_13= 'one of'
                    {
                    otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRanking2365); 

                        	newLeafNode(otherlv_13, grammarAccess.getRankingAccess().getOneOfKeyword_9_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1060:7: otherlv_14= 'some of'
                    {
                    otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRanking2383); 

                        	newLeafNode(otherlv_14, grammarAccess.getRankingAccess().getSomeOfKeyword_9_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1064:3: (otherlv_15= 'these' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==25) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1064:5: otherlv_15= 'these'
                    {
                    otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRanking2398); 

                        	newLeafNode(otherlv_15, grammarAccess.getRankingAccess().getTheseKeyword_10());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1068:3: ( (lv_choices_16_0= ruleChoice ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1069:1: (lv_choices_16_0= ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1069:1: (lv_choices_16_0= ruleChoice )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1070:3: lv_choices_16_0= ruleChoice
            {
             
            	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2421);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1086:2: (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==26) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1086:4: otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) )
            	    {
            	    otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRanking2434); 

            	        	newLeafNode(otherlv_17, grammarAccess.getRankingAccess().getCommaKeyword_12_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1090:1: ( (lv_choices_18_0= ruleChoice ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:1: (lv_choices_18_0= ruleChoice )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:1: (lv_choices_18_0= ruleChoice )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:3: lv_choices_18_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_12_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2455);
            	    lv_choices_18_0=ruleChoice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRankingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"choices",
            	            		lv_choices_18_0, 
            	            		"Choice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1108:4: ( ( (lv_Fork_19_0= ruleRankingSumFork ) ) (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==43) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1108:5: ( (lv_Fork_19_0= ruleRankingSumFork ) ) (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1108:5: ( (lv_Fork_19_0= ruleRankingSumFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:1: (lv_Fork_19_0= ruleRankingSumFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:1: (lv_Fork_19_0= ruleRankingSumFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1110:3: lv_Fork_19_0= ruleRankingSumFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getForkRankingSumForkParserRuleCall_13_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleRanking2479);
                    lv_Fork_19_0=ruleRankingSumFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		add(
                           			current, 
                           			"Fork",
                            		lv_Fork_19_0, 
                            		"RankingSumFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1126:2: (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==26) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1126:4: otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) )
                    	    {
                    	    otherlv_20=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRanking2492); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getRankingAccess().getCommaKeyword_13_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1130:1: ( (lv_Fork_21_0= ruleRankingSumFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1131:1: (lv_Fork_21_0= ruleRankingSumFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1131:1: (lv_Fork_21_0= ruleRankingSumFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1132:3: lv_Fork_21_0= ruleRankingSumFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingAccess().getForkRankingSumForkParserRuleCall_13_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleRanking2513);
                    	    lv_Fork_21_0=ruleRankingSumFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Fork",
                    	            		lv_Fork_21_0, 
                    	            		"RankingSumFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1156:1: entryRuleDichotomous returns [EObject current=null] : iv_ruleDichotomous= ruleDichotomous EOF ;
    public final EObject entryRuleDichotomous() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDichotomous = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1157:2: (iv_ruleDichotomous= ruleDichotomous EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1158:2: iv_ruleDichotomous= ruleDichotomous EOF
            {
             newCompositeNode(grammarAccess.getDichotomousRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDichotomous_in_entryRuleDichotomous2553);
            iv_ruleDichotomous=ruleDichotomous();

            state._fsp--;

             current =iv_ruleDichotomous; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDichotomous2563); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1165:1: ruleDichotomous returns [EObject current=null] : ( () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'if' otherlv_13= 'yes' ( (lv_onYes_14_0= ruleDichotomousFork ) ) )? (otherlv_15= 'if' otherlv_16= 'no' ( (lv_onNo_17_0= ruleDichotomousFork ) ) )? ) ;
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
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_question_11_0 = null;

        EObject lv_onYes_14_0 = null;

        EObject lv_onNo_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1168:28: ( ( () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'if' otherlv_13= 'yes' ( (lv_onYes_14_0= ruleDichotomousFork ) ) )? (otherlv_15= 'if' otherlv_16= 'no' ( (lv_onNo_17_0= ruleDichotomousFork ) ) )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1169:1: ( () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'if' otherlv_13= 'yes' ( (lv_onYes_14_0= ruleDichotomousFork ) ) )? (otherlv_15= 'if' otherlv_16= 'no' ( (lv_onNo_17_0= ruleDichotomousFork ) ) )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1169:1: ( () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'if' otherlv_13= 'yes' ( (lv_onYes_14_0= ruleDichotomousFork ) ) )? (otherlv_15= 'if' otherlv_16= 'no' ( (lv_onNo_17_0= ruleDichotomousFork ) ) )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1169:2: () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'if' otherlv_13= 'yes' ( (lv_onYes_14_0= ruleDichotomousFork ) ) )? (otherlv_15= 'if' otherlv_16= 'no' ( (lv_onNo_17_0= ruleDichotomousFork ) ) )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1169:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDichotomousAccess().getDichotomousAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDichotomous2609); 

                	newLeafNode(otherlv_1, grammarAccess.getDichotomousAccess().getDichotomousKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1179:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1180:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1180:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1181:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDichotomous2626); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDichotomous2643); 

                	newLeafNode(otherlv_3, grammarAccess.getDichotomousAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1201:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=13 && LA53_0<=14)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1201:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1201:2: (otherlv_4= 'the' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==13) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1201:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDichotomous2657); 

                                	newLeafNode(otherlv_4, grammarAccess.getDichotomousAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDichotomous2671); 

                        	newLeafNode(otherlv_5, grammarAccess.getDichotomousAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1209:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==15) ) {
                alt54=1;
            }
            else if ( (LA54_0==16) ) {
                alt54=2;
            }
            switch (alt54) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1209:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDichotomous2686); 

                        	newLeafNode(otherlv_6, grammarAccess.getDichotomousAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1215:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1215:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1216:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDichotomous2711); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getDichotomousAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDichotomousRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDichotomous2736); 

                        	newLeafNode(otherlv_8, grammarAccess.getDichotomousAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1233:4: (otherlv_9= 'to' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==18) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1233:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDichotomous2752); 

                        	newLeafNode(otherlv_9, grammarAccess.getDichotomousAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1237:3: (otherlv_10= 'answer' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==19) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1237:5: otherlv_10= 'answer'
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDichotomous2767); 

                        	newLeafNode(otherlv_10, grammarAccess.getDichotomousAccess().getAnswerKeyword_7());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1241:3: ( (lv_question_11_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1242:1: (lv_question_11_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1242:1: (lv_question_11_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1243:3: lv_question_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDichotomousAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDichotomous2790);
            lv_question_11_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
            	        }
                   		set(
                   			current, 
                   			"question",
                    		lv_question_11_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1259:2: (otherlv_12= 'if' otherlv_13= 'yes' ( (lv_onYes_14_0= ruleDichotomousFork ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==43) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==44) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1259:4: otherlv_12= 'if' otherlv_13= 'yes' ( (lv_onYes_14_0= ruleDichotomousFork ) )
                    {
                    otherlv_12=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDichotomous2803); 

                        	newLeafNode(otherlv_12, grammarAccess.getDichotomousAccess().getIfKeyword_9_0());
                        
                    otherlv_13=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDichotomous2815); 

                        	newLeafNode(otherlv_13, grammarAccess.getDichotomousAccess().getYesKeyword_9_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1267:1: ( (lv_onYes_14_0= ruleDichotomousFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1268:1: (lv_onYes_14_0= ruleDichotomousFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1268:1: (lv_onYes_14_0= ruleDichotomousFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1269:3: lv_onYes_14_0= ruleDichotomousFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getDichotomousAccess().getOnYesDichotomousForkParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDichotomousFork_in_ruleDichotomous2836);
                    lv_onYes_14_0=ruleDichotomousFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
                    	        }
                           		set(
                           			current, 
                           			"onYes",
                            		lv_onYes_14_0, 
                            		"DichotomousFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1285:4: (otherlv_15= 'if' otherlv_16= 'no' ( (lv_onNo_17_0= ruleDichotomousFork ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==43) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1285:6: otherlv_15= 'if' otherlv_16= 'no' ( (lv_onNo_17_0= ruleDichotomousFork ) )
                    {
                    otherlv_15=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDichotomous2851); 

                        	newLeafNode(otherlv_15, grammarAccess.getDichotomousAccess().getIfKeyword_10_0());
                        
                    otherlv_16=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDichotomous2863); 

                        	newLeafNode(otherlv_16, grammarAccess.getDichotomousAccess().getNoKeyword_10_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1293:1: ( (lv_onNo_17_0= ruleDichotomousFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1294:1: (lv_onNo_17_0= ruleDichotomousFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1294:1: (lv_onNo_17_0= ruleDichotomousFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1295:3: lv_onNo_17_0= ruleDichotomousFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getDichotomousAccess().getOnNoDichotomousForkParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDichotomousFork_in_ruleDichotomous2884);
                    lv_onNo_17_0=ruleDichotomousFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
                    	        }
                           		set(
                           			current, 
                           			"onNo",
                            		lv_onNo_17_0, 
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


    // $ANTLR start "entryRuleConstantSum"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1319:1: entryRuleConstantSum returns [EObject current=null] : iv_ruleConstantSum= ruleConstantSum EOF ;
    public final EObject entryRuleConstantSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSum = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1320:2: (iv_ruleConstantSum= ruleConstantSum EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1321:2: iv_ruleConstantSum= ruleConstantSum EOF
            {
             newCompositeNode(grammarAccess.getConstantSumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantSum_in_entryRuleConstantSum2922);
            iv_ruleConstantSum=ruleConstantSum();

            state._fsp--;

             current =iv_ruleConstantSum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantSum2932); 

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
    // $ANTLR end "entryRuleConstantSum"


    // $ANTLR start "ruleConstantSum"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:1: ruleConstantSum returns [EObject current=null] : ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_Constant_17_0= ruleEInt ) ) )? otherlv_18= 'among' otherlv_19= 'these' ( (lv_Choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_Choices_22_0= ruleChoice ) ) )* ( ( (lv_Fork_23_0= ruleRankingSumFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )* )? ) ;
    public final EObject ruleConstantSum() throws RecognitionException {
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
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_question_12_0 = null;

        AntlrDatatypeRuleToken lv_Constant_17_0 = null;

        EObject lv_Choices_20_0 = null;

        EObject lv_Choices_22_0 = null;

        EObject lv_Fork_23_0 = null;

        EObject lv_Fork_25_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1331:28: ( ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_Constant_17_0= ruleEInt ) ) )? otherlv_18= 'among' otherlv_19= 'these' ( (lv_Choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_Choices_22_0= ruleChoice ) ) )* ( ( (lv_Fork_23_0= ruleRankingSumFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1332:1: ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_Constant_17_0= ruleEInt ) ) )? otherlv_18= 'among' otherlv_19= 'these' ( (lv_Choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_Choices_22_0= ruleChoice ) ) )* ( ( (lv_Fork_23_0= ruleRankingSumFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1332:1: ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_Constant_17_0= ruleEInt ) ) )? otherlv_18= 'among' otherlv_19= 'these' ( (lv_Choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_Choices_22_0= ruleChoice ) ) )* ( ( (lv_Fork_23_0= ruleRankingSumFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1332:2: () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_Constant_17_0= ruleEInt ) ) )? otherlv_18= 'among' otherlv_19= 'these' ( (lv_Choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_Choices_22_0= ruleChoice ) ) )* ( ( (lv_Fork_23_0= ruleRankingSumFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1332:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1333:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstantSumAccess().getConstantSumAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleConstantSum2978); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantSumAccess().getConstantSumKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1342:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1343:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1343:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1344:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantSum2995); 

            			newLeafNode(lv_name_2_0, grammarAccess.getConstantSumAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantSumRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConstantSum3012); 

                	newLeafNode(otherlv_3, grammarAccess.getConstantSumAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=13 && LA60_0<=14)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:2: (otherlv_4= 'the' )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==13) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstantSum3026); 

                                	newLeafNode(otherlv_4, grammarAccess.getConstantSumAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConstantSum3040); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstantSumAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==15) ) {
                alt61=1;
            }
            else if ( (LA61_0==16) ) {
                alt61=2;
            }
            switch (alt61) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConstantSum3055); 

                        	newLeafNode(otherlv_6, grammarAccess.getConstantSumAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1378:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1378:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1379:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConstantSum3080); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getConstantSumAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantSumRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConstantSum3105); 

                        	newLeafNode(otherlv_8, grammarAccess.getConstantSumAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1396:4: (otherlv_9= 'to' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==18) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1396:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstantSum3121); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstantSumAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1400:3: (otherlv_10= 'distribute' | otherlv_11= 'answer' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==47) ) {
                alt63=1;
            }
            else if ( (LA63_0==19) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1400:5: otherlv_10= 'distribute'
                    {
                    otherlv_10=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleConstantSum3136); 

                        	newLeafNode(otherlv_10, grammarAccess.getConstantSumAccess().getDistributeKeyword_7_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1405:7: otherlv_11= 'answer'
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConstantSum3154); 

                        	newLeafNode(otherlv_11, grammarAccess.getConstantSumAccess().getAnswerKeyword_7_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1409:2: ( (lv_question_12_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1410:1: (lv_question_12_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1410:1: (lv_question_12_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1411:3: lv_question_12_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConstantSumAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstantSum3176);
            lv_question_12_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantSumRule());
            	        }
                   		set(
                   			current, 
                   			"question",
                    		lv_question_12_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1427:2: ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_Constant_17_0= ruleEInt ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==18||(LA67_0>=48 && LA67_0<=49)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1427:3: ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_Constant_17_0= ruleEInt ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1427:3: ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1427:4: (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )?
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1427:4: (otherlv_13= 'to' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==18) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1427:6: otherlv_13= 'to'
                            {
                            otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstantSum3191); 

                                	newLeafNode(otherlv_13, grammarAccess.getConstantSumAccess().getToKeyword_9_0_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1431:3: (otherlv_14= 'a' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==48) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1431:5: otherlv_14= 'a'
                            {
                            otherlv_14=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleConstantSum3206); 

                                	newLeafNode(otherlv_14, grammarAccess.getConstantSumAccess().getAKeyword_9_0_1());
                                

                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleConstantSum3220); 

                        	newLeafNode(otherlv_15, grammarAccess.getConstantSumAccess().getTotalKeyword_9_0_2());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1439:1: (otherlv_16= 'of' )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==50) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1439:3: otherlv_16= 'of'
                            {
                            otherlv_16=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleConstantSum3233); 

                                	newLeafNode(otherlv_16, grammarAccess.getConstantSumAccess().getOfKeyword_9_0_3());
                                

                            }
                            break;

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1443:4: ( (lv_Constant_17_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1444:1: (lv_Constant_17_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1444:1: (lv_Constant_17_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1445:3: lv_Constant_17_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantSumAccess().getConstantEIntParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleConstantSum3257);
                    lv_Constant_17_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantSumRule());
                    	        }
                           		set(
                           			current, 
                           			"Constant",
                            		lv_Constant_17_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleConstantSum3271); 

                	newLeafNode(otherlv_18, grammarAccess.getConstantSumAccess().getAmongKeyword_10());
                
            otherlv_19=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleConstantSum3283); 

                	newLeafNode(otherlv_19, grammarAccess.getConstantSumAccess().getTheseKeyword_11());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1469:1: ( (lv_Choices_20_0= ruleChoice ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1470:1: (lv_Choices_20_0= ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1470:1: (lv_Choices_20_0= ruleChoice )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1471:3: lv_Choices_20_0= ruleChoice
            {
             
            	        newCompositeNode(grammarAccess.getConstantSumAccess().getChoicesChoiceParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleConstantSum3304);
            lv_Choices_20_0=ruleChoice();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantSumRule());
            	        }
                   		add(
                   			current, 
                   			"Choices",
                    		lv_Choices_20_0, 
                    		"Choice");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1487:2: (otherlv_21= ',' ( (lv_Choices_22_0= ruleChoice ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==26) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1487:4: otherlv_21= ',' ( (lv_Choices_22_0= ruleChoice ) )
            	    {
            	    otherlv_21=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleConstantSum3317); 

            	        	newLeafNode(otherlv_21, grammarAccess.getConstantSumAccess().getCommaKeyword_13_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1491:1: ( (lv_Choices_22_0= ruleChoice ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1492:1: (lv_Choices_22_0= ruleChoice )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1492:1: (lv_Choices_22_0= ruleChoice )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1493:3: lv_Choices_22_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstantSumAccess().getChoicesChoiceParserRuleCall_13_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleConstantSum3338);
            	    lv_Choices_22_0=ruleChoice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstantSumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Choices",
            	            		lv_Choices_22_0, 
            	            		"Choice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1509:4: ( ( (lv_Fork_23_0= ruleRankingSumFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==43) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1509:5: ( (lv_Fork_23_0= ruleRankingSumFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1509:5: ( (lv_Fork_23_0= ruleRankingSumFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1510:1: (lv_Fork_23_0= ruleRankingSumFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1510:1: (lv_Fork_23_0= ruleRankingSumFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1511:3: lv_Fork_23_0= ruleRankingSumFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantSumAccess().getForkRankingSumForkParserRuleCall_14_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleConstantSum3362);
                    lv_Fork_23_0=ruleRankingSumFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantSumRule());
                    	        }
                           		add(
                           			current, 
                           			"Fork",
                            		lv_Fork_23_0, 
                            		"RankingSumFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1527:2: (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==26) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1527:4: otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) )
                    	    {
                    	    otherlv_24=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleConstantSum3375); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getConstantSumAccess().getCommaKeyword_14_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1531:1: ( (lv_Fork_25_0= ruleRankingSumFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1532:1: (lv_Fork_25_0= ruleRankingSumFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1532:1: (lv_Fork_25_0= ruleRankingSumFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1533:3: lv_Fork_25_0= ruleRankingSumFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantSumAccess().getForkRankingSumForkParserRuleCall_14_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleConstantSum3396);
                    	    lv_Fork_25_0=ruleRankingSumFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstantSumRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Fork",
                    	            		lv_Fork_25_0, 
                    	            		"RankingSumFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
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
    // $ANTLR end "ruleConstantSum"


    // $ANTLR start "entryRuleStaple"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1557:1: entryRuleStaple returns [EObject current=null] : iv_ruleStaple= ruleStaple EOF ;
    public final EObject entryRuleStaple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaple = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1558:2: (iv_ruleStaple= ruleStaple EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1559:2: iv_ruleStaple= ruleStaple EOF
            {
             newCompositeNode(grammarAccess.getStapleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStaple_in_entryRuleStaple3436);
            iv_ruleStaple=ruleStaple();

            state._fsp--;

             current =iv_ruleStaple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStaple3446); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1566:1: ruleStaple returns [EObject current=null] : ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? otherlv_22= 'mid' (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? otherlv_26= 'highest' (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* )? ) ;
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
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_question_12_0 = null;

        AntlrDatatypeRuleToken lv_Min_14_0 = null;

        AntlrDatatypeRuleToken lv_Max_16_0 = null;

        AntlrDatatypeRuleToken lv_first_20_0 = null;

        AntlrDatatypeRuleToken lv_mid_24_0 = null;

        AntlrDatatypeRuleToken lv_last_28_0 = null;

        EObject lv_Fork_29_0 = null;

        EObject lv_Fork_31_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1569:28: ( ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? otherlv_22= 'mid' (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? otherlv_26= 'highest' (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:1: ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? otherlv_22= 'mid' (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? otherlv_26= 'highest' (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:1: ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? otherlv_22= 'mid' (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? otherlv_26= 'highest' (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:2: () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? otherlv_22= 'mid' (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? otherlv_26= 'highest' (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1571:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStapleAccess().getStapleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleStaple3492); 

                	newLeafNode(otherlv_1, grammarAccess.getStapleAccess().getStapleKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1580:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1581:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1581:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1582:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStaple3509); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStaple3526); 

                	newLeafNode(otherlv_3, grammarAccess.getStapleAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1602:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=13 && LA72_0<=14)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1602:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1602:2: (otherlv_4= 'the' )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==13) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1602:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStaple3540); 

                                	newLeafNode(otherlv_4, grammarAccess.getStapleAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStaple3554); 

                        	newLeafNode(otherlv_5, grammarAccess.getStapleAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1610:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
            int alt73=3;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==15) ) {
                alt73=1;
            }
            else if ( (LA73_0==16) ) {
                alt73=2;
            }
            switch (alt73) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1610:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStaple3569); 

                        	newLeafNode(otherlv_6, grammarAccess.getStapleAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1615:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1615:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1615:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1615:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1616:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1616:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1617:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStaple3594); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getStapleAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStapleRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStaple3619); 

                        	newLeafNode(otherlv_8, grammarAccess.getStapleAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1634:4: (otherlv_9= 'to' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==18) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1634:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStaple3635); 

                        	newLeafNode(otherlv_9, grammarAccess.getStapleAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1638:3: (otherlv_10= 'rate' | otherlv_11= 'answer' )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==33) ) {
                alt75=1;
            }
            else if ( (LA75_0==19) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1638:5: otherlv_10= 'rate'
                    {
                    otherlv_10=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStaple3650); 

                        	newLeafNode(otherlv_10, grammarAccess.getStapleAccess().getRateKeyword_7_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1643:7: otherlv_11= 'answer'
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStaple3668); 

                        	newLeafNode(otherlv_11, grammarAccess.getStapleAccess().getAnswerKeyword_7_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1647:2: ( (lv_question_12_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1648:1: (lv_question_12_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1648:1: (lv_question_12_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1649:3: lv_question_12_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3690);
            lv_question_12_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStapleRule());
            	        }
                   		set(
                   			current, 
                   			"question",
                    		lv_question_12_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1665:2: (otherlv_13= 'between' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==34) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1665:4: otherlv_13= 'between'
                    {
                    otherlv_13=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStaple3703); 

                        	newLeafNode(otherlv_13, grammarAccess.getStapleAccess().getBetweenKeyword_9());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1669:3: ( (lv_Min_14_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1670:1: (lv_Min_14_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1670:1: (lv_Min_14_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1671:3: lv_Min_14_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getMinEIntParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStaple3726);
            lv_Min_14_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStapleRule());
            	        }
                   		set(
                   			current, 
                   			"Min",
                    		lv_Min_14_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1687:2: (otherlv_15= 'and' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==35) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1687:4: otherlv_15= 'and'
                    {
                    otherlv_15=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStaple3739); 

                        	newLeafNode(otherlv_15, grammarAccess.getStapleAccess().getAndKeyword_11());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1691:3: ( (lv_Max_16_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1692:1: (lv_Max_16_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1692:1: (lv_Max_16_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1693:3: lv_Max_16_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getMaxEIntParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStaple3762);
            lv_Max_16_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStapleRule());
            	        }
                   		set(
                   			current, 
                   			"Max",
                    		lv_Max_16_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1709:2: (otherlv_17= 'where' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==36) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1709:4: otherlv_17= 'where'
                    {
                    otherlv_17=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStaple3775); 

                        	newLeafNode(otherlv_17, grammarAccess.getStapleAccess().getWhereKeyword_13());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStaple3789); 

                	newLeafNode(otherlv_18, grammarAccess.getStapleAccess().getLowestKeyword_14());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1717:1: (otherlv_19= 'means' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==38) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1717:3: otherlv_19= 'means'
                    {
                    otherlv_19=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleStaple3802); 

                        	newLeafNode(otherlv_19, grammarAccess.getStapleAccess().getMeansKeyword_15());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1721:3: ( (lv_first_20_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1722:1: (lv_first_20_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1722:1: (lv_first_20_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1723:3: lv_first_20_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getFirstEStringParserRuleCall_16_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3825);
            lv_first_20_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStapleRule());
            	        }
                   		set(
                   			current, 
                   			"first",
                    		lv_first_20_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1739:2: (otherlv_21= ',' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==26) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1739:4: otherlv_21= ','
                    {
                    otherlv_21=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleStaple3838); 

                        	newLeafNode(otherlv_21, grammarAccess.getStapleAccess().getCommaKeyword_17());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleStaple3852); 

                	newLeafNode(otherlv_22, grammarAccess.getStapleAccess().getMidKeyword_18());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1747:1: (otherlv_23= 'means' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==38) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1747:3: otherlv_23= 'means'
                    {
                    otherlv_23=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleStaple3865); 

                        	newLeafNode(otherlv_23, grammarAccess.getStapleAccess().getMeansKeyword_19());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1751:3: ( (lv_mid_24_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1752:1: (lv_mid_24_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1752:1: (lv_mid_24_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1753:3: lv_mid_24_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getMidEStringParserRuleCall_20_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3888);
            lv_mid_24_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStapleRule());
            	        }
                   		set(
                   			current, 
                   			"mid",
                    		lv_mid_24_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1769:2: (otherlv_25= 'and' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==35) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1769:4: otherlv_25= 'and'
                    {
                    otherlv_25=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStaple3901); 

                        	newLeafNode(otherlv_25, grammarAccess.getStapleAccess().getAndKeyword_21());
                        

                    }
                    break;

            }

            otherlv_26=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleStaple3915); 

                	newLeafNode(otherlv_26, grammarAccess.getStapleAccess().getHighestKeyword_22());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1777:1: (otherlv_27= 'means' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==38) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1777:3: otherlv_27= 'means'
                    {
                    otherlv_27=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleStaple3928); 

                        	newLeafNode(otherlv_27, grammarAccess.getStapleAccess().getMeansKeyword_23());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1781:3: ( (lv_last_28_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1782:1: (lv_last_28_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1782:1: (lv_last_28_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1783:3: lv_last_28_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getLastEStringParserRuleCall_24_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3951);
            lv_last_28_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStapleRule());
            	        }
                   		set(
                   			current, 
                   			"last",
                    		lv_last_28_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1799:2: ( ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==43) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1799:3: ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1799:3: ( (lv_Fork_29_0= ruleRatingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1800:1: (lv_Fork_29_0= ruleRatingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1800:1: (lv_Fork_29_0= ruleRatingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1801:3: lv_Fork_29_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getForkRatingForkParserRuleCall_25_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3973);
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

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1817:2: (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==26) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1817:4: otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) )
                    	    {
                    	    otherlv_30=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleStaple3986); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getStapleAccess().getCommaKeyword_25_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1821:1: ( (lv_Fork_31_0= ruleRatingFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1822:1: (lv_Fork_31_0= ruleRatingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1822:1: (lv_Fork_31_0= ruleRatingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1823:3: lv_Fork_31_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStapleAccess().getForkRatingForkParserRuleCall_25_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple4007);
                    	    lv_Fork_31_0=ruleRatingFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Fork",
                    	            		lv_Fork_31_0, 
                    	            		"RatingFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1847:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1848:2: (iv_ruleChoice= ruleChoice EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1849:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_entryRuleChoice4047);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoice4057); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1856:1: ruleChoice returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_Description_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1859:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1860:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1860:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1860:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1860:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1861:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1861:1: (lv_name_0_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1862:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleChoice4099); 

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

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleChoice4116); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getColonKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1882:1: ( (lv_Description_2_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:1: (lv_Description_2_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:1: (lv_Description_2_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1884:3: lv_Description_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChoiceAccess().getDescriptionEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoice4137);
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1908:1: entryRuleChoiceFork returns [EObject current=null] : iv_ruleChoiceFork= ruleChoiceFork EOF ;
    public final EObject entryRuleChoiceFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1909:2: (iv_ruleChoiceFork= ruleChoiceFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1910:2: iv_ruleChoiceFork= ruleChoiceFork EOF
            {
             newCompositeNode(grammarAccess.getChoiceForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_entryRuleChoiceFork4173);
            iv_ruleChoiceFork=ruleChoiceFork();

            state._fsp--;

             current =iv_ruleChoiceFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceFork4183); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1917:1: ruleChoiceFork returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleChoiceFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1920:28: ( (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:3: otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleChoiceFork4220); 

                	newLeafNode(otherlv_0, grammarAccess.getChoiceForkAccess().getIfKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1925:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1926:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1926:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1927:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getChoiceForkAccess().getOnChoiceCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork4243);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1940:2: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==26) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1940:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleChoiceFork4256); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChoiceForkAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1944:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1945:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1945:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1946:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceForkAccess().getOnChoiceCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork4279);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1959:4: (otherlv_4= 'then' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==54) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1959:6: otherlv_4= 'then'
                    {
                    otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleChoiceFork4294); 

                        	newLeafNode(otherlv_4, grammarAccess.getChoiceForkAccess().getThenKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleChoiceFork4308); 

                	newLeafNode(otherlv_5, grammarAccess.getChoiceForkAccess().getGoKeyword_4());
                
            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleChoiceFork4320); 

                	newLeafNode(otherlv_6, grammarAccess.getChoiceForkAccess().getToKeyword_5());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1971:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1972:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1972:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1973:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getChoiceForkAccess().getQuestionsQuestionCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork4343);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1986:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==26) ) {
                    int LA88_1 = input.LA(2);

                    if ( ((LA88_1>=RULE_STRING && LA88_1<=RULE_ID)) ) {
                        alt88=1;
                    }


                }


                switch (alt88) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1986:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleChoiceFork4356); 

            	        	newLeafNode(otherlv_8, grammarAccess.getChoiceForkAccess().getCommaKeyword_7_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1990:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1991:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1991:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1992:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceForkAccess().getQuestionsQuestionCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork4379);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2013:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2014:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2015:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4418);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4429); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2022:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2025:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2026:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2026:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2026:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2026:2: (kw= '-' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==56) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2027:2: kw= '-'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleEInt4468); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4485); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2047:1: entryRuleRatingFork returns [EObject current=null] : iv_ruleRatingFork= ruleRatingFork EOF ;
    public final EObject entryRuleRatingFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatingFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2048:2: (iv_ruleRatingFork= ruleRatingFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2049:2: iv_ruleRatingFork= ruleRatingFork EOF
            {
             newCompositeNode(grammarAccess.getRatingForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_entryRuleRatingFork4530);
            iv_ruleRatingFork=ruleRatingFork();

            state._fsp--;

             current =iv_ruleRatingFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRatingFork4540); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2056:1: ruleRatingFork returns [EObject current=null] : (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_Min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_Max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleRatingFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_Min_4_0 = null;

        AntlrDatatypeRuleToken lv_Max_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2059:28: ( (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_Min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_Max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2060:1: (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_Min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_Max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2060:1: (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_Min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_Max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2060:3: otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_Min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_Max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleRatingFork4577); 

                	newLeafNode(otherlv_0, grammarAccess.getRatingForkAccess().getIfKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2064:1: (otherlv_1= 'it' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==57) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2064:3: otherlv_1= 'it'
                    {
                    otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleRatingFork4590); 

                        	newLeafNode(otherlv_1, grammarAccess.getRatingForkAccess().getItKeyword_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2068:3: (otherlv_2= 'is' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==16) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2068:5: otherlv_2= 'is'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRatingFork4605); 

                        	newLeafNode(otherlv_2, grammarAccess.getRatingForkAccess().getIsKeyword_2());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRatingFork4619); 

                	newLeafNode(otherlv_3, grammarAccess.getRatingForkAccess().getBetweenKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2076:1: ( (lv_Min_4_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2077:1: (lv_Min_4_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2077:1: (lv_Min_4_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2078:3: lv_Min_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getMinEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork4640);
            lv_Min_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatingForkRule());
            	        }
                   		set(
                   			current, 
                   			"Min",
                    		lv_Min_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRatingFork4652); 

                	newLeafNode(otherlv_5, grammarAccess.getRatingForkAccess().getAndKeyword_5());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2098:1: ( (lv_Max_6_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2099:1: (lv_Max_6_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2099:1: (lv_Max_6_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2100:3: lv_Max_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getMaxEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork4673);
            lv_Max_6_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatingForkRule());
            	        }
                   		set(
                   			current, 
                   			"Max",
                    		lv_Max_6_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2116:2: (otherlv_7= 'then' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==54) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2116:4: otherlv_7= 'then'
                    {
                    otherlv_7=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleRatingFork4686); 

                        	newLeafNode(otherlv_7, grammarAccess.getRatingForkAccess().getThenKeyword_7());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleRatingFork4700); 

                	newLeafNode(otherlv_8, grammarAccess.getRatingForkAccess().getGoKeyword_8());
                
            otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRatingFork4712); 

                	newLeafNode(otherlv_9, grammarAccess.getRatingForkAccess().getToKeyword_9());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2128:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2129:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2129:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2130:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRatingForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getQuestionsQuestionCrossReference_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRatingFork4735);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2143:2: (otherlv_11= ',' ( ( ruleEString ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==26) ) {
                    int LA93_1 = input.LA(2);

                    if ( ((LA93_1>=RULE_STRING && LA93_1<=RULE_ID)) ) {
                        alt93=1;
                    }


                }


                switch (alt93) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2143:4: otherlv_11= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRatingFork4748); 

            	        	newLeafNode(otherlv_11, grammarAccess.getRatingForkAccess().getCommaKeyword_11_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2147:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2148:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2148:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2149:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRatingForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRatingForkAccess().getQuestionsQuestionCrossReference_11_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRatingFork4771);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2170:1: entryRuleRankingSumFork returns [EObject current=null] : iv_ruleRankingSumFork= ruleRankingSumFork EOF ;
    public final EObject entryRuleRankingSumFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRankingSumFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2171:2: (iv_ruleRankingSumFork= ruleRankingSumFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2172:2: iv_ruleRankingSumFork= ruleRankingSumFork EOF
            {
             newCompositeNode(grammarAccess.getRankingSumForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_entryRuleRankingSumFork4809);
            iv_ruleRankingSumFork=ruleRankingSumFork();

            state._fsp--;

             current =iv_ruleRankingSumFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRankingSumFork4819); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2179:1: ruleRankingSumFork returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleRankingSumFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_Min_6_0 = null;

        AntlrDatatypeRuleToken lv_Max_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2182:28: ( (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2183:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2183:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2183:3: otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleRankingSumFork4856); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingSumForkAccess().getIfKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2187:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2188:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2188:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2189:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getOnChoiceCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4879);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2202:2: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==26) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2202:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRankingSumFork4892); 

            	        	newLeafNode(otherlv_2, grammarAccess.getRankingSumForkAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2206:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2207:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2207:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2208:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getOnChoiceCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4915);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRankingSumFork4929); 

                	newLeafNode(otherlv_4, grammarAccess.getRankingSumForkAccess().getIsKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2225:1: (otherlv_5= 'between' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==34) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2225:3: otherlv_5= 'between'
                    {
                    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRankingSumFork4942); 

                        	newLeafNode(otherlv_5, grammarAccess.getRankingSumForkAccess().getBetweenKeyword_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2229:3: ( (lv_Min_6_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2230:1: (lv_Min_6_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2230:1: (lv_Min_6_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2231:3: lv_Min_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getMinEIntParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingSumFork4965);
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

            otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRankingSumFork4977); 

                	newLeafNode(otherlv_7, grammarAccess.getRankingSumForkAccess().getAndKeyword_6());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2251:1: ( (lv_Max_8_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2252:1: (lv_Max_8_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2252:1: (lv_Max_8_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2253:3: lv_Max_8_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getMaxEIntParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingSumFork4998);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2269:2: (otherlv_9= 'then' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==54) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2269:4: otherlv_9= 'then'
                    {
                    otherlv_9=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleRankingSumFork5011); 

                        	newLeafNode(otherlv_9, grammarAccess.getRankingSumForkAccess().getThenKeyword_8());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleRankingSumFork5025); 

                	newLeafNode(otherlv_10, grammarAccess.getRankingSumForkAccess().getGoKeyword_9());
                
            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRankingSumFork5037); 

                	newLeafNode(otherlv_11, grammarAccess.getRankingSumForkAccess().getToKeyword_10());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2281:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2282:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2282:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2283:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getQuestionsQuestionCrossReference_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork5060);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2296:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==26) ) {
                    int LA97_1 = input.LA(2);

                    if ( ((LA97_1>=RULE_STRING && LA97_1<=RULE_ID)) ) {
                        alt97=1;
                    }


                }


                switch (alt97) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2296:4: otherlv_13= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRankingSumFork5073); 

            	        	newLeafNode(otherlv_13, grammarAccess.getRankingSumForkAccess().getCommaKeyword_12_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2300:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2301:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2301:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2302:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getQuestionsQuestionCrossReference_12_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork5096);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2323:1: entryRuleDichotomousFork returns [EObject current=null] : iv_ruleDichotomousFork= ruleDichotomousFork EOF ;
    public final EObject entryRuleDichotomousFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDichotomousFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2324:2: (iv_ruleDichotomousFork= ruleDichotomousFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2325:2: iv_ruleDichotomousFork= ruleDichotomousFork EOF
            {
             newCompositeNode(grammarAccess.getDichotomousForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDichotomousFork_in_entryRuleDichotomousFork5134);
            iv_ruleDichotomousFork=ruleDichotomousFork();

            state._fsp--;

             current =iv_ruleDichotomousFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDichotomousFork5144); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2332:1: ruleDichotomousFork returns [EObject current=null] : ( (otherlv_0= 'then' )? otherlv_1= 'go' otherlv_2= 'to' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleDichotomousFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2335:28: ( ( (otherlv_0= 'then' )? otherlv_1= 'go' otherlv_2= 'to' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:1: ( (otherlv_0= 'then' )? otherlv_1= 'go' otherlv_2= 'to' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:1: ( (otherlv_0= 'then' )? otherlv_1= 'go' otherlv_2= 'to' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:2: (otherlv_0= 'then' )? otherlv_1= 'go' otherlv_2= 'to' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )*
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:2: (otherlv_0= 'then' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==54) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:4: otherlv_0= 'then'
                    {
                    otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleDichotomousFork5182); 

                        	newLeafNode(otherlv_0, grammarAccess.getDichotomousForkAccess().getThenKeyword_0());
                        

                    }
                    break;

            }

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleDichotomousFork5196); 

                	newLeafNode(otherlv_1, grammarAccess.getDichotomousForkAccess().getGoKeyword_1());
                
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDichotomousFork5208); 

                	newLeafNode(otherlv_2, grammarAccess.getDichotomousForkAccess().getToKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2348:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2349:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2349:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2350:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDichotomousForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDichotomousForkAccess().getQuestionsQuestionCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDichotomousFork5231);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2363:2: (otherlv_4= ',' ( ( ruleEString ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==26) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2363:4: otherlv_4= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDichotomousFork5244); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDichotomousForkAccess().getCommaKeyword_4_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2367:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2368:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2368:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2369:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDichotomousForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getDichotomousForkAccess().getQuestionsQuestionCrossReference_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDichotomousFork5267);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
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
        public static final BitSet FOLLOW_ruleSurvey_in_ruleModel140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_ruleQuestion234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpen_in_ruleQuestion261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_Impl_in_ruleQuestion288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_ruleQuestion315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDichotomous_in_ruleQuestion342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantSum_in_ruleQuestion369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStaple_in_ruleQuestion396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey496 = new BitSet(new long[]{0x0010450180000802L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey518 = new BitSet(new long[]{0x0010450180000802L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey539 = new BitSet(new long[]{0x0010450180000802L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString579 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice703 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMultipleChoice759 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleChoice776 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMultipleChoice793 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_13_in_ruleMultipleChoice807 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleChoice821 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_15_in_ruleMultipleChoice836 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_16_in_ruleMultipleChoice861 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMultipleChoice886 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_18_in_ruleMultipleChoice902 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleMultipleChoice917 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice940 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_20_in_ruleMultipleChoice953 = new BitSet(new long[]{0x0100000000200040L});
        public static final BitSet FOLLOW_21_in_ruleMultipleChoice966 = new BitSet(new long[]{0x0100000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultipleChoice989 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_22_in_ruleMultipleChoice1004 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_23_in_ruleMultipleChoice1019 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_24_in_ruleMultipleChoice1037 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_25_in_ruleMultipleChoice1052 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice1075 = new BitSet(new long[]{0x000008000C000002L});
        public static final BitSet FOLLOW_26_in_ruleMultipleChoice1088 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice1109 = new BitSet(new long[]{0x000008000C000002L});
        public static final BitSet FOLLOW_27_in_ruleMultipleChoice1124 = new BitSet(new long[]{0x00000000700DE030L});
        public static final BitSet FOLLOW_28_in_ruleMultipleChoice1137 = new BitSet(new long[]{0x00000000600DE030L});
        public static final BitSet FOLLOW_29_in_ruleMultipleChoice1152 = new BitSet(new long[]{0x00000000400DE030L});
        public static final BitSet FOLLOW_30_in_ruleMultipleChoice1167 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice1190 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1214 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleMultipleChoice1227 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1248 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleOpen_in_entryRuleOpen1288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpen1298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleOpen1344 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOpen1361 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOpen1378 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_13_in_ruleOpen1392 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleOpen1406 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_15_in_ruleOpen1421 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_16_in_ruleOpen1446 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleOpen1471 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_18_in_ruleOpen1487 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleOpen1502 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpen1525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1561 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRating_Impl1571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleRating_Impl1617 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRating_Impl1634 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRating_Impl1651 = new BitSet(new long[]{0x00000002000DE030L});
        public static final BitSet FOLLOW_13_in_ruleRating_Impl1665 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRating_Impl1679 = new BitSet(new long[]{0x00000002000DE030L});
        public static final BitSet FOLLOW_15_in_ruleRating_Impl1694 = new BitSet(new long[]{0x00000002000DE030L});
        public static final BitSet FOLLOW_16_in_ruleRating_Impl1713 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRating_Impl1725 = new BitSet(new long[]{0x00000002000DE030L});
        public static final BitSet FOLLOW_18_in_ruleRating_Impl1741 = new BitSet(new long[]{0x00000002000DE030L});
        public static final BitSet FOLLOW_33_in_ruleRating_Impl1756 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleRating_Impl1774 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1797 = new BitSet(new long[]{0x0100000400200040L});
        public static final BitSet FOLLOW_34_in_ruleRating_Impl1810 = new BitSet(new long[]{0x0100000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1833 = new BitSet(new long[]{0x0100000800200040L});
        public static final BitSet FOLLOW_35_in_ruleRating_Impl1846 = new BitSet(new long[]{0x0100000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1869 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_36_in_ruleRating_Impl1882 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleRating_Impl1896 = new BitSet(new long[]{0x00000040000DE030L});
        public static final BitSet FOLLOW_38_in_ruleRating_Impl1909 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1932 = new BitSet(new long[]{0x0000008800000000L});
        public static final BitSet FOLLOW_35_in_ruleRating_Impl1945 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleRating_Impl1959 = new BitSet(new long[]{0x00000040000DE030L});
        public static final BitSet FOLLOW_38_in_ruleRating_Impl1972 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1995 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl2017 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRating_Impl2030 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl2051 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleRanking_in_entryRuleRanking2091 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRanking2101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleRanking2138 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRanking2155 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRanking2172 = new BitSet(new long[]{0x00000200000DE030L});
        public static final BitSet FOLLOW_13_in_ruleRanking2186 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRanking2200 = new BitSet(new long[]{0x00000200000DE030L});
        public static final BitSet FOLLOW_15_in_ruleRanking2215 = new BitSet(new long[]{0x00000200000DE030L});
        public static final BitSet FOLLOW_16_in_ruleRanking2240 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRanking2265 = new BitSet(new long[]{0x00000200000DE030L});
        public static final BitSet FOLLOW_18_in_ruleRanking2281 = new BitSet(new long[]{0x00000200000DE030L});
        public static final BitSet FOLLOW_41_in_ruleRanking2296 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleRanking2314 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRanking2337 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_22_in_ruleRanking2350 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_23_in_ruleRanking2365 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_24_in_ruleRanking2383 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_25_in_ruleRanking2398 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2421 = new BitSet(new long[]{0x0000080004000002L});
        public static final BitSet FOLLOW_26_in_ruleRanking2434 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2455 = new BitSet(new long[]{0x0000080004000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleRanking2479 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRanking2492 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleRanking2513 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleDichotomous_in_entryRuleDichotomous2553 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDichotomous2563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleDichotomous2609 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDichotomous2626 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDichotomous2643 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_13_in_ruleDichotomous2657 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDichotomous2671 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_15_in_ruleDichotomous2686 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_16_in_ruleDichotomous2711 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDichotomous2736 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_18_in_ruleDichotomous2752 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleDichotomous2767 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDichotomous2790 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_43_in_ruleDichotomous2803 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleDichotomous2815 = new BitSet(new long[]{0x00C0000000000000L});
        public static final BitSet FOLLOW_ruleDichotomousFork_in_ruleDichotomous2836 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_43_in_ruleDichotomous2851 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleDichotomous2863 = new BitSet(new long[]{0x00C0000000000000L});
        public static final BitSet FOLLOW_ruleDichotomousFork_in_ruleDichotomous2884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantSum_in_entryRuleConstantSum2922 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantSum2932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleConstantSum2978 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantSum2995 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConstantSum3012 = new BitSet(new long[]{0x00008000000DE000L});
        public static final BitSet FOLLOW_13_in_ruleConstantSum3026 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleConstantSum3040 = new BitSet(new long[]{0x00008000000D8000L});
        public static final BitSet FOLLOW_15_in_ruleConstantSum3055 = new BitSet(new long[]{0x00008000000C0000L});
        public static final BitSet FOLLOW_16_in_ruleConstantSum3080 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConstantSum3105 = new BitSet(new long[]{0x00008000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleConstantSum3121 = new BitSet(new long[]{0x0000800000080000L});
        public static final BitSet FOLLOW_47_in_ruleConstantSum3136 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleConstantSum3154 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstantSum3176 = new BitSet(new long[]{0x000B000000040000L});
        public static final BitSet FOLLOW_18_in_ruleConstantSum3191 = new BitSet(new long[]{0x0003000000000000L});
        public static final BitSet FOLLOW_48_in_ruleConstantSum3206 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleConstantSum3220 = new BitSet(new long[]{0x0104000000200040L});
        public static final BitSet FOLLOW_50_in_ruleConstantSum3233 = new BitSet(new long[]{0x0100000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleConstantSum3257 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleConstantSum3271 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleConstantSum3283 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleConstantSum3304 = new BitSet(new long[]{0x0000080004000002L});
        public static final BitSet FOLLOW_26_in_ruleConstantSum3317 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleConstantSum3338 = new BitSet(new long[]{0x0000080004000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleConstantSum3362 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleConstantSum3375 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleConstantSum3396 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleStaple_in_entryRuleStaple3436 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStaple3446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleStaple3492 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStaple3509 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStaple3526 = new BitSet(new long[]{0x00000002000DE000L});
        public static final BitSet FOLLOW_13_in_ruleStaple3540 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleStaple3554 = new BitSet(new long[]{0x00000002000D8000L});
        public static final BitSet FOLLOW_15_in_ruleStaple3569 = new BitSet(new long[]{0x00000002000C0000L});
        public static final BitSet FOLLOW_16_in_ruleStaple3594 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleStaple3619 = new BitSet(new long[]{0x00000002000C0000L});
        public static final BitSet FOLLOW_18_in_ruleStaple3635 = new BitSet(new long[]{0x0000000200080000L});
        public static final BitSet FOLLOW_33_in_ruleStaple3650 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleStaple3668 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3690 = new BitSet(new long[]{0x0100000400200040L});
        public static final BitSet FOLLOW_34_in_ruleStaple3703 = new BitSet(new long[]{0x0100000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStaple3726 = new BitSet(new long[]{0x0100000800200040L});
        public static final BitSet FOLLOW_35_in_ruleStaple3739 = new BitSet(new long[]{0x0100000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStaple3762 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_36_in_ruleStaple3775 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleStaple3789 = new BitSet(new long[]{0x00000040000DE030L});
        public static final BitSet FOLLOW_38_in_ruleStaple3802 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3825 = new BitSet(new long[]{0x0020000004000000L});
        public static final BitSet FOLLOW_26_in_ruleStaple3838 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleStaple3852 = new BitSet(new long[]{0x00000040000DE030L});
        public static final BitSet FOLLOW_38_in_ruleStaple3865 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3888 = new BitSet(new long[]{0x0000008800000000L});
        public static final BitSet FOLLOW_35_in_ruleStaple3901 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleStaple3915 = new BitSet(new long[]{0x00000040000DE030L});
        public static final BitSet FOLLOW_38_in_ruleStaple3928 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3951 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3973 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleStaple3986 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple4007 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice4047 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoice4057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleChoice4099 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleChoice4116 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoice4137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_entryRuleChoiceFork4173 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceFork4183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleChoiceFork4220 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork4243 = new BitSet(new long[]{0x00C0000004000000L});
        public static final BitSet FOLLOW_26_in_ruleChoiceFork4256 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork4279 = new BitSet(new long[]{0x00C0000004000000L});
        public static final BitSet FOLLOW_54_in_ruleChoiceFork4294 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleChoiceFork4308 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleChoiceFork4320 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork4343 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleChoiceFork4356 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork4379 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4418 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleEInt4468 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_entryRuleRatingFork4530 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRatingFork4540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleRatingFork4577 = new BitSet(new long[]{0x0200000400010000L});
        public static final BitSet FOLLOW_57_in_ruleRatingFork4590 = new BitSet(new long[]{0x0000000400010000L});
        public static final BitSet FOLLOW_16_in_ruleRatingFork4605 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleRatingFork4619 = new BitSet(new long[]{0x0100000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork4640 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleRatingFork4652 = new BitSet(new long[]{0x0100000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork4673 = new BitSet(new long[]{0x00C0000000000000L});
        public static final BitSet FOLLOW_54_in_ruleRatingFork4686 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleRatingFork4700 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRatingFork4712 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRatingFork4735 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRatingFork4748 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRatingFork4771 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_entryRuleRankingSumFork4809 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRankingSumFork4819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleRankingSumFork4856 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4879 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_26_in_ruleRankingSumFork4892 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4915 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_16_in_ruleRankingSumFork4929 = new BitSet(new long[]{0x0100000400200040L});
        public static final BitSet FOLLOW_34_in_ruleRankingSumFork4942 = new BitSet(new long[]{0x0100000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingSumFork4965 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleRankingSumFork4977 = new BitSet(new long[]{0x0100000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingSumFork4998 = new BitSet(new long[]{0x00C0000000000000L});
        public static final BitSet FOLLOW_54_in_ruleRankingSumFork5011 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleRankingSumFork5025 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRankingSumFork5037 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork5060 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRankingSumFork5073 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork5096 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleDichotomousFork_in_entryRuleDichotomousFork5134 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDichotomousFork5144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleDichotomousFork5182 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleDichotomousFork5196 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDichotomousFork5208 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDichotomousFork5231 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleDichotomousFork5244 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDichotomousFork5267 = new BitSet(new long[]{0x0000000004000002L});
    }


}