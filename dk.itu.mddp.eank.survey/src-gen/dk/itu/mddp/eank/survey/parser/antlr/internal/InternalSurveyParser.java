package dk.itu.mddp.eank.survey.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.mddp.eank.survey.services.SurveyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "';'", "'MultipleChoice'", "'The'", "'user'", "'may'", "'is required'", "'to'", "'answer'", "'with'", "'one'", "'some of'", "'these:'", "','", "'or'", "'something'", "'else'", "'conditionals'", "'Open'", "'Rating'", "'rate'", "'between'", "'and'", "'where'", "'lowest'", "'means'", "'highest'", "'('", "')'", "'Ranking'", "'ask'", "'you'", "'can'", "'choose'", "'from'", "'these'", "'Dichotomous'", "'if yes'", "'if no'", "'SumConstant'", "'divide'", "'according'", "'the'", "'importance'", "'Staple'", "'mean'", "'match'", "'questions'", "'-'", "'RatingFork'", "'RankingFork'"
    };
    public static final int RULE_ID=4;
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
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
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
    public static final int T__59=59;
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
    public static final int RULE_STRING=5;
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


        public InternalSurveyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSurveyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSurveyParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g"; }



     	private SurveyGrammarAccess grammarAccess;
     	
        public InternalSurveyParser(TokenStream input, SurveyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SurveyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:76:1: ruleModel returns [EObject current=null] : ( () ( (lv_surveys_1_0= ruleSurvey ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_surveys_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:79:28: ( ( () ( (lv_surveys_1_0= ruleSurvey ) )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:80:1: ( () ( (lv_surveys_1_0= ruleSurvey ) )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:80:1: ( () ( (lv_surveys_1_0= ruleSurvey ) )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:80:2: () ( (lv_surveys_1_0= ruleSurvey ) )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:80:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:86:2: ( (lv_surveys_1_0= ruleSurvey ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:87:1: (lv_surveys_1_0= ruleSurvey )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:87:1: (lv_surveys_1_0= ruleSurvey )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:88:3: lv_surveys_1_0= ruleSurvey
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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:112:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:113:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:114:2: iv_ruleQuestion= ruleQuestion EOF
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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:121:1: ruleQuestion returns [EObject current=null] : (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:124:28: ( (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:125:1: (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:125:1: (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 30:
                {
                alt2=3;
                }
                break;
            case 40:
                {
                alt2=4;
                }
                break;
            case 47:
                {
                alt2=5;
                }
                break;
            case 50:
                {
                alt2=6;
                }
                break;
            case 55:
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
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:126:5: this_MultipleChoice_0= ruleMultipleChoice
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
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:136:5: this_Open_1= ruleOpen
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
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:146:5: this_Rating_Impl_2= ruleRating_Impl
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
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:156:5: this_Ranking_3= ruleRanking
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
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:166:5: this_Dichotomous_4= ruleDichotomous
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
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:176:5: this_SumConstant_5= ruleSumConstant
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSumConstantParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSumConstant_in_ruleQuestion369);
                    this_SumConstant_5=ruleSumConstant();

                    state._fsp--;

                     
                            current = this_SumConstant_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:186:5: this_Staple_6= ruleStaple
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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:202:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:203:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:204:2: iv_ruleSurvey= ruleSurvey EOF
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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:211:1: ruleSurvey returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ';' ( (lv_questions_5_0= ruleQuestion ) ) )* )? ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_questions_3_0 = null;

        EObject lv_questions_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:214:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ';' ( (lv_questions_5_0= ruleQuestion ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:215:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ';' ( (lv_questions_5_0= ruleQuestion ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:215:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ';' ( (lv_questions_5_0= ruleQuestion ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:215:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ';' ( (lv_questions_5_0= ruleQuestion ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:215:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:216:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:221:2: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:222:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:222:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:223:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSurvey492); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSurveyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSurvey509); 

                	newLeafNode(otherlv_2, grammarAccess.getSurveyAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:243:1: ( ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ';' ( (lv_questions_5_0= ruleQuestion ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13||(LA4_0>=29 && LA4_0<=30)||LA4_0==40||LA4_0==47||LA4_0==50||LA4_0==55) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:243:2: ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ';' ( (lv_questions_5_0= ruleQuestion ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:243:2: ( (lv_questions_3_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:244:1: (lv_questions_3_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:244:1: (lv_questions_3_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:245:3: lv_questions_3_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey531);
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

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:261:2: (otherlv_4= ';' ( (lv_questions_5_0= ruleQuestion ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==12) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:261:4: otherlv_4= ';' ( (lv_questions_5_0= ruleQuestion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey544); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSurveyAccess().getSemicolonKeyword_3_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:265:1: ( (lv_questions_5_0= ruleQuestion ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:266:1: (lv_questions_5_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:266:1: (lv_questions_5_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:267:3: lv_questions_5_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey565);
                    	    lv_questions_5_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"questions",
                    	            		lv_questions_5_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:291:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:292:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:293:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString606);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString617); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:300:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:303:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:304:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:304:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:304:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString657); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:312:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString683); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:329:1: entryRuleMultipleChoice returns [EObject current=null] : iv_ruleMultipleChoice= ruleMultipleChoice EOF ;
    public final EObject entryRuleMultipleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoice = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:330:2: (iv_ruleMultipleChoice= ruleMultipleChoice EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:331:2: iv_ruleMultipleChoice= ruleMultipleChoice EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice730);
            iv_ruleMultipleChoice=ruleMultipleChoice();

            state._fsp--;

             current =iv_ruleMultipleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoice740); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:338:1: ruleMultipleChoice returns [EObject current=null] : ( () otherlv_1= 'MultipleChoice' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'with' )? (otherlv_11= 'one' | otherlv_12= 'some of' )? (otherlv_13= 'these:' )? ( (lv_choice_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_choice_16_0= ruleChoice ) ) )* )? (otherlv_17= 'or' (otherlv_18= 'with' )? (otherlv_19= 'something' )? (otherlv_20= 'else' )? ( (lv_other_21_0= ruleEString ) ) )? ( (otherlv_22= 'conditionals' )? otherlv_23= ':' ( (lv_MultipleChoiceForks_24_0= ruleMultipleChoiceFork ) ) (otherlv_25= ',' ( (lv_MultipleChoiceForks_26_0= ruleMultipleChoiceFork ) ) )* )? ) ;
    public final EObject ruleMultipleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_question_9_0 = null;

        EObject lv_choice_14_0 = null;

        EObject lv_choice_16_0 = null;

        AntlrDatatypeRuleToken lv_other_21_0 = null;

        EObject lv_MultipleChoiceForks_24_0 = null;

        EObject lv_MultipleChoiceForks_26_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:341:28: ( ( () otherlv_1= 'MultipleChoice' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'with' )? (otherlv_11= 'one' | otherlv_12= 'some of' )? (otherlv_13= 'these:' )? ( (lv_choice_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_choice_16_0= ruleChoice ) ) )* )? (otherlv_17= 'or' (otherlv_18= 'with' )? (otherlv_19= 'something' )? (otherlv_20= 'else' )? ( (lv_other_21_0= ruleEString ) ) )? ( (otherlv_22= 'conditionals' )? otherlv_23= ':' ( (lv_MultipleChoiceForks_24_0= ruleMultipleChoiceFork ) ) (otherlv_25= ',' ( (lv_MultipleChoiceForks_26_0= ruleMultipleChoiceFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:342:1: ( () otherlv_1= 'MultipleChoice' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'with' )? (otherlv_11= 'one' | otherlv_12= 'some of' )? (otherlv_13= 'these:' )? ( (lv_choice_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_choice_16_0= ruleChoice ) ) )* )? (otherlv_17= 'or' (otherlv_18= 'with' )? (otherlv_19= 'something' )? (otherlv_20= 'else' )? ( (lv_other_21_0= ruleEString ) ) )? ( (otherlv_22= 'conditionals' )? otherlv_23= ':' ( (lv_MultipleChoiceForks_24_0= ruleMultipleChoiceFork ) ) (otherlv_25= ',' ( (lv_MultipleChoiceForks_26_0= ruleMultipleChoiceFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:342:1: ( () otherlv_1= 'MultipleChoice' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'with' )? (otherlv_11= 'one' | otherlv_12= 'some of' )? (otherlv_13= 'these:' )? ( (lv_choice_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_choice_16_0= ruleChoice ) ) )* )? (otherlv_17= 'or' (otherlv_18= 'with' )? (otherlv_19= 'something' )? (otherlv_20= 'else' )? ( (lv_other_21_0= ruleEString ) ) )? ( (otherlv_22= 'conditionals' )? otherlv_23= ':' ( (lv_MultipleChoiceForks_24_0= ruleMultipleChoiceFork ) ) (otherlv_25= ',' ( (lv_MultipleChoiceForks_26_0= ruleMultipleChoiceFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:342:2: () otherlv_1= 'MultipleChoice' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'with' )? (otherlv_11= 'one' | otherlv_12= 'some of' )? (otherlv_13= 'these:' )? ( (lv_choice_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_choice_16_0= ruleChoice ) ) )* )? (otherlv_17= 'or' (otherlv_18= 'with' )? (otherlv_19= 'something' )? (otherlv_20= 'else' )? ( (lv_other_21_0= ruleEString ) ) )? ( (otherlv_22= 'conditionals' )? otherlv_23= ':' ( (lv_MultipleChoiceForks_24_0= ruleMultipleChoiceFork ) ) (otherlv_25= ',' ( (lv_MultipleChoiceForks_26_0= ruleMultipleChoiceFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:342:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:343:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultipleChoiceAccess().getMultipleChoiceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleChoice786); 

                	newLeafNode(otherlv_1, grammarAccess.getMultipleChoiceAccess().getMultipleChoiceKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMultipleChoice798); 

                	newLeafNode(otherlv_2, grammarAccess.getMultipleChoiceAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:356:1: ( (otherlv_3= 'The' )? otherlv_4= 'user' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=14 && LA7_0<=15)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:356:2: (otherlv_3= 'The' )? otherlv_4= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:356:2: (otherlv_3= 'The' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==14) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:356:4: otherlv_3= 'The'
                            {
                            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleChoice812); 

                                	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceAccess().getTheKeyword_3_0());
                                

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultipleChoice826); 

                        	newLeafNode(otherlv_4, grammarAccess.getMultipleChoiceAccess().getUserKeyword_3_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:364:3: (otherlv_5= 'may' | otherlv_6= 'is required' )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:364:5: otherlv_5= 'may'
                    {
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultipleChoice841); 

                        	newLeafNode(otherlv_5, grammarAccess.getMultipleChoiceAccess().getMayKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:369:7: otherlv_6= 'is required'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultipleChoice859); 

                        	newLeafNode(otherlv_6, grammarAccess.getMultipleChoiceAccess().getIsRequiredKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:373:3: ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING||(LA11_0>=18 && LA11_0<=19)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==EOF||LA11_2==RULE_ID||LA11_2==12||(LA11_2>=20 && LA11_2<=25)||LA11_2==28||LA11_2==39) ) {
                    alt11=1;
                }
                else if ( (LA11_2==11) ) {
                    int LA11_4 = input.LA(3);

                    if ( (LA11_4==57) ) {
                        alt11=1;
                    }
                }
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:373:4: (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:373:4: (otherlv_7= 'to' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==18) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:373:6: otherlv_7= 'to'
                            {
                            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultipleChoice875); 

                                	newLeafNode(otherlv_7, grammarAccess.getMultipleChoiceAccess().getToKeyword_5_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:377:3: (otherlv_8= 'answer' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==19) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:377:5: otherlv_8= 'answer'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultipleChoice890); 

                                	newLeafNode(otherlv_8, grammarAccess.getMultipleChoiceAccess().getAnswerKeyword_5_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:381:3: ( (lv_question_9_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:382:1: (lv_question_9_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:382:1: (lv_question_9_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:383:3: lv_question_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getQuestionEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice913);
                    lv_question_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
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

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:399:4: ( (otherlv_10= 'with' )? (otherlv_11= 'one' | otherlv_12= 'some of' )? (otherlv_13= 'these:' )? ( (lv_choice_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_choice_16_0= ruleChoice ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||(LA16_0>=20 && LA16_0<=23)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:399:5: (otherlv_10= 'with' )? (otherlv_11= 'one' | otherlv_12= 'some of' )? (otherlv_13= 'these:' )? ( (lv_choice_14_0= ruleChoice ) ) (otherlv_15= ',' ( (lv_choice_16_0= ruleChoice ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:399:5: (otherlv_10= 'with' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==20) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:399:7: otherlv_10= 'with'
                            {
                            otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultipleChoice929); 

                                	newLeafNode(otherlv_10, grammarAccess.getMultipleChoiceAccess().getWithKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:403:3: (otherlv_11= 'one' | otherlv_12= 'some of' )?
                    int alt13=3;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==21) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==22) ) {
                        alt13=2;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:403:5: otherlv_11= 'one'
                            {
                            otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultipleChoice944); 

                                	newLeafNode(otherlv_11, grammarAccess.getMultipleChoiceAccess().getOneKeyword_6_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:408:7: otherlv_12= 'some of'
                            {
                            otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMultipleChoice962); 

                                	newLeafNode(otherlv_12, grammarAccess.getMultipleChoiceAccess().getSomeOfKeyword_6_1_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:412:3: (otherlv_13= 'these:' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==23) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:412:5: otherlv_13= 'these:'
                            {
                            otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMultipleChoice977); 

                                	newLeafNode(otherlv_13, grammarAccess.getMultipleChoiceAccess().getTheseKeyword_6_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:416:3: ( (lv_choice_14_0= ruleChoice ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:417:1: (lv_choice_14_0= ruleChoice )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:417:1: (lv_choice_14_0= ruleChoice )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:418:3: lv_choice_14_0= ruleChoice
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice1000);
                    lv_choice_14_0=ruleChoice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		add(
                           			current, 
                           			"choice",
                            		lv_choice_14_0, 
                            		"Choice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:434:2: (otherlv_15= ',' ( (lv_choice_16_0= ruleChoice ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==24) ) {
                            int LA15_2 = input.LA(2);

                            if ( (LA15_2==RULE_ID) ) {
                                alt15=1;
                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:434:4: otherlv_15= ',' ( (lv_choice_16_0= ruleChoice ) )
                    	    {
                    	    otherlv_15=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultipleChoice1013); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_6_4_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:438:1: ( (lv_choice_16_0= ruleChoice ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:439:1: (lv_choice_16_0= ruleChoice )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:439:1: (lv_choice_16_0= ruleChoice )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:440:3: lv_choice_16_0= ruleChoice
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_6_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice1034);
                    	    lv_choice_16_0=ruleChoice();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"choice",
                    	            		lv_choice_16_0, 
                    	            		"Choice");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:456:6: (otherlv_17= 'or' (otherlv_18= 'with' )? (otherlv_19= 'something' )? (otherlv_20= 'else' )? ( (lv_other_21_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:456:8: otherlv_17= 'or' (otherlv_18= 'with' )? (otherlv_19= 'something' )? (otherlv_20= 'else' )? ( (lv_other_21_0= ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultipleChoice1051); 

                        	newLeafNode(otherlv_17, grammarAccess.getMultipleChoiceAccess().getOrKeyword_7_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:460:1: (otherlv_18= 'with' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==20) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:460:3: otherlv_18= 'with'
                            {
                            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultipleChoice1064); 

                                	newLeafNode(otherlv_18, grammarAccess.getMultipleChoiceAccess().getWithKeyword_7_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:464:3: (otherlv_19= 'something' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==26) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:464:5: otherlv_19= 'something'
                            {
                            otherlv_19=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleChoice1079); 

                                	newLeafNode(otherlv_19, grammarAccess.getMultipleChoiceAccess().getSomethingKeyword_7_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:468:3: (otherlv_20= 'else' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==27) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:468:5: otherlv_20= 'else'
                            {
                            otherlv_20=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultipleChoice1094); 

                                	newLeafNode(otherlv_20, grammarAccess.getMultipleChoiceAccess().getElseKeyword_7_3());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:472:3: ( (lv_other_21_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:473:1: (lv_other_21_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:473:1: (lv_other_21_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:474:3: lv_other_21_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getOtherEStringParserRuleCall_7_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice1117);
                    lv_other_21_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		set(
                           			current, 
                           			"other",
                            		lv_other_21_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:490:4: ( (otherlv_22= 'conditionals' )? otherlv_23= ':' ( (lv_MultipleChoiceForks_24_0= ruleMultipleChoiceFork ) ) (otherlv_25= ',' ( (lv_MultipleChoiceForks_26_0= ruleMultipleChoiceFork ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==11||LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:490:5: (otherlv_22= 'conditionals' )? otherlv_23= ':' ( (lv_MultipleChoiceForks_24_0= ruleMultipleChoiceFork ) ) (otherlv_25= ',' ( (lv_MultipleChoiceForks_26_0= ruleMultipleChoiceFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:490:5: (otherlv_22= 'conditionals' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==28) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:490:7: otherlv_22= 'conditionals'
                            {
                            otherlv_22=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMultipleChoice1133); 

                                	newLeafNode(otherlv_22, grammarAccess.getMultipleChoiceAccess().getConditionalsKeyword_8_0());
                                

                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMultipleChoice1147); 

                        	newLeafNode(otherlv_23, grammarAccess.getMultipleChoiceAccess().getColonKeyword_8_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:498:1: ( (lv_MultipleChoiceForks_24_0= ruleMultipleChoiceFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:499:1: (lv_MultipleChoiceForks_24_0= ruleMultipleChoiceFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:499:1: (lv_MultipleChoiceForks_24_0= ruleMultipleChoiceFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:500:3: lv_MultipleChoiceForks_24_0= ruleMultipleChoiceFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceForksMultipleChoiceForkParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoiceFork_in_ruleMultipleChoice1168);
                    lv_MultipleChoiceForks_24_0=ruleMultipleChoiceFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		add(
                           			current, 
                           			"MultipleChoiceForks",
                            		lv_MultipleChoiceForks_24_0, 
                            		"MultipleChoiceFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:516:2: (otherlv_25= ',' ( (lv_MultipleChoiceForks_26_0= ruleMultipleChoiceFork ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==24) ) {
                            int LA22_2 = input.LA(2);

                            if ( (LA22_2==57) ) {
                                alt22=1;
                            }


                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:516:4: otherlv_25= ',' ( (lv_MultipleChoiceForks_26_0= ruleMultipleChoiceFork ) )
                    	    {
                    	    otherlv_25=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultipleChoice1181); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:520:1: ( (lv_MultipleChoiceForks_26_0= ruleMultipleChoiceFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:521:1: (lv_MultipleChoiceForks_26_0= ruleMultipleChoiceFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:521:1: (lv_MultipleChoiceForks_26_0= ruleMultipleChoiceFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:522:3: lv_MultipleChoiceForks_26_0= ruleMultipleChoiceFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceForksMultipleChoiceForkParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoiceFork_in_ruleMultipleChoice1202);
                    	    lv_MultipleChoiceForks_26_0=ruleMultipleChoiceFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"MultipleChoiceForks",
                    	            		lv_MultipleChoiceForks_26_0, 
                    	            		"MultipleChoiceFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:546:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:547:2: (iv_ruleOpen= ruleOpen EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:548:2: iv_ruleOpen= ruleOpen EOF
            {
             newCompositeNode(grammarAccess.getOpenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpen_in_entryRuleOpen1242);
            iv_ruleOpen=ruleOpen();

            state._fsp--;

             current =iv_ruleOpen; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpen1252); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:555:1: ruleOpen returns [EObject current=null] : ( () otherlv_1= 'Open' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? ) ;
    public final EObject ruleOpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_question_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:558:28: ( ( () otherlv_1= 'Open' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:559:1: ( () otherlv_1= 'Open' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:559:1: ( () otherlv_1= 'Open' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:559:2: () otherlv_1= 'Open' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:559:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:560:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOpenAccess().getOpenAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleOpen1298); 

                	newLeafNode(otherlv_1, grammarAccess.getOpenAccess().getOpenKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleOpen1310); 

                	newLeafNode(otherlv_2, grammarAccess.getOpenAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:573:1: ( (otherlv_3= 'The' )? otherlv_4= 'user' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=14 && LA25_0<=15)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:573:2: (otherlv_3= 'The' )? otherlv_4= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:573:2: (otherlv_3= 'The' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==14) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:573:4: otherlv_3= 'The'
                            {
                            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOpen1324); 

                                	newLeafNode(otherlv_3, grammarAccess.getOpenAccess().getTheKeyword_3_0());
                                

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOpen1338); 

                        	newLeafNode(otherlv_4, grammarAccess.getOpenAccess().getUserKeyword_3_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:581:3: (otherlv_5= 'may' | otherlv_6= 'is required' )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            else if ( (LA26_0==17) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:581:5: otherlv_5= 'may'
                    {
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOpen1353); 

                        	newLeafNode(otherlv_5, grammarAccess.getOpenAccess().getMayKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:586:7: otherlv_6= 'is required'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOpen1371); 

                        	newLeafNode(otherlv_6, grammarAccess.getOpenAccess().getIsRequiredKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:590:3: ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_STRING)||(LA29_0>=18 && LA29_0<=19)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:590:4: (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:590:4: (otherlv_7= 'to' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==18) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:590:6: otherlv_7= 'to'
                            {
                            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOpen1387); 

                                	newLeafNode(otherlv_7, grammarAccess.getOpenAccess().getToKeyword_5_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:594:3: (otherlv_8= 'answer' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==19) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:594:5: otherlv_8= 'answer'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOpen1402); 

                                	newLeafNode(otherlv_8, grammarAccess.getOpenAccess().getAnswerKeyword_5_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:598:3: ( (lv_question_9_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:599:1: (lv_question_9_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:599:1: (lv_question_9_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:600:3: lv_question_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpenAccess().getQuestionEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpen1425);
                    lv_question_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpenRule());
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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:624:1: entryRuleRating_Impl returns [EObject current=null] : iv_ruleRating_Impl= ruleRating_Impl EOF ;
    public final EObject entryRuleRating_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating_Impl = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:625:2: (iv_ruleRating_Impl= ruleRating_Impl EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:626:2: iv_ruleRating_Impl= ruleRating_Impl EOF
            {
             newCompositeNode(grammarAccess.getRating_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1463);
            iv_ruleRating_Impl=ruleRating_Impl();

            state._fsp--;

             current =iv_ruleRating_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRating_Impl1473); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:633:1: ruleRating_Impl returns [EObject current=null] : ( () otherlv_1= 'Rating' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'rate' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'between' )? ( (lv_Min_11_0= ruleEInt ) ) )? ( (otherlv_12= 'and' )? ( (lv_Max_13_0= ruleEInt ) ) )? ( (otherlv_14= 'where' )? (otherlv_15= 'lowest' )? (otherlv_16= 'means' )? ( (lv_first_17_0= ruleEString ) ) )? ( (otherlv_18= 'and' )? (otherlv_19= 'highest' )? (otherlv_20= 'means' )? ( (lv_last_21_0= ruleEString ) ) )? ( (otherlv_22= 'conditionals' )? otherlv_23= '(' ( (lv_RatingForks_24_0= ruleRatingFork ) ) (otherlv_25= ',' ( (lv_RatingForks_26_0= ruleRatingFork ) ) )* otherlv_27= ')' )? ) ;
    public final EObject ruleRating_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_question_9_0 = null;

        AntlrDatatypeRuleToken lv_Min_11_0 = null;

        AntlrDatatypeRuleToken lv_Max_13_0 = null;

        AntlrDatatypeRuleToken lv_first_17_0 = null;

        AntlrDatatypeRuleToken lv_last_21_0 = null;

        EObject lv_RatingForks_24_0 = null;

        EObject lv_RatingForks_26_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:636:28: ( ( () otherlv_1= 'Rating' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'rate' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'between' )? ( (lv_Min_11_0= ruleEInt ) ) )? ( (otherlv_12= 'and' )? ( (lv_Max_13_0= ruleEInt ) ) )? ( (otherlv_14= 'where' )? (otherlv_15= 'lowest' )? (otherlv_16= 'means' )? ( (lv_first_17_0= ruleEString ) ) )? ( (otherlv_18= 'and' )? (otherlv_19= 'highest' )? (otherlv_20= 'means' )? ( (lv_last_21_0= ruleEString ) ) )? ( (otherlv_22= 'conditionals' )? otherlv_23= '(' ( (lv_RatingForks_24_0= ruleRatingFork ) ) (otherlv_25= ',' ( (lv_RatingForks_26_0= ruleRatingFork ) ) )* otherlv_27= ')' )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:637:1: ( () otherlv_1= 'Rating' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'rate' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'between' )? ( (lv_Min_11_0= ruleEInt ) ) )? ( (otherlv_12= 'and' )? ( (lv_Max_13_0= ruleEInt ) ) )? ( (otherlv_14= 'where' )? (otherlv_15= 'lowest' )? (otherlv_16= 'means' )? ( (lv_first_17_0= ruleEString ) ) )? ( (otherlv_18= 'and' )? (otherlv_19= 'highest' )? (otherlv_20= 'means' )? ( (lv_last_21_0= ruleEString ) ) )? ( (otherlv_22= 'conditionals' )? otherlv_23= '(' ( (lv_RatingForks_24_0= ruleRatingFork ) ) (otherlv_25= ',' ( (lv_RatingForks_26_0= ruleRatingFork ) ) )* otherlv_27= ')' )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:637:1: ( () otherlv_1= 'Rating' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'rate' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'between' )? ( (lv_Min_11_0= ruleEInt ) ) )? ( (otherlv_12= 'and' )? ( (lv_Max_13_0= ruleEInt ) ) )? ( (otherlv_14= 'where' )? (otherlv_15= 'lowest' )? (otherlv_16= 'means' )? ( (lv_first_17_0= ruleEString ) ) )? ( (otherlv_18= 'and' )? (otherlv_19= 'highest' )? (otherlv_20= 'means' )? ( (lv_last_21_0= ruleEString ) ) )? ( (otherlv_22= 'conditionals' )? otherlv_23= '(' ( (lv_RatingForks_24_0= ruleRatingFork ) ) (otherlv_25= ',' ( (lv_RatingForks_26_0= ruleRatingFork ) ) )* otherlv_27= ')' )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:637:2: () otherlv_1= 'Rating' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'rate' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'between' )? ( (lv_Min_11_0= ruleEInt ) ) )? ( (otherlv_12= 'and' )? ( (lv_Max_13_0= ruleEInt ) ) )? ( (otherlv_14= 'where' )? (otherlv_15= 'lowest' )? (otherlv_16= 'means' )? ( (lv_first_17_0= ruleEString ) ) )? ( (otherlv_18= 'and' )? (otherlv_19= 'highest' )? (otherlv_20= 'means' )? ( (lv_last_21_0= ruleEString ) ) )? ( (otherlv_22= 'conditionals' )? otherlv_23= '(' ( (lv_RatingForks_24_0= ruleRatingFork ) ) (otherlv_25= ',' ( (lv_RatingForks_26_0= ruleRatingFork ) ) )* otherlv_27= ')' )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:637:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:638:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRating_ImplAccess().getRatingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRating_Impl1519); 

                	newLeafNode(otherlv_1, grammarAccess.getRating_ImplAccess().getRatingKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRating_Impl1531); 

                	newLeafNode(otherlv_2, grammarAccess.getRating_ImplAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:651:1: ( (otherlv_3= 'The' )? otherlv_4= 'user' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=14 && LA31_0<=15)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:651:2: (otherlv_3= 'The' )? otherlv_4= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:651:2: (otherlv_3= 'The' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==14) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:651:4: otherlv_3= 'The'
                            {
                            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRating_Impl1545); 

                                	newLeafNode(otherlv_3, grammarAccess.getRating_ImplAccess().getTheKeyword_3_0());
                                

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRating_Impl1559); 

                        	newLeafNode(otherlv_4, grammarAccess.getRating_ImplAccess().getUserKeyword_3_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:659:3: (otherlv_5= 'may' | otherlv_6= 'is required' )?
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            else if ( (LA32_0==17) ) {
                alt32=2;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:659:5: otherlv_5= 'may'
                    {
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRating_Impl1574); 

                        	newLeafNode(otherlv_5, grammarAccess.getRating_ImplAccess().getMayKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:664:7: otherlv_6= 'is required'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRating_Impl1592); 

                        	newLeafNode(otherlv_6, grammarAccess.getRating_ImplAccess().getIsRequiredKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:668:3: ( (otherlv_7= 'to' )? (otherlv_8= 'rate' )? ( (lv_question_9_0= ruleEString ) ) )?
            int alt35=2;
            switch ( input.LA(1) ) {
                case 18:
                case 31:
                    {
                    alt35=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt35=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt35=1;
                    }
                    break;
            }

            switch (alt35) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:668:4: (otherlv_7= 'to' )? (otherlv_8= 'rate' )? ( (lv_question_9_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:668:4: (otherlv_7= 'to' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==18) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:668:6: otherlv_7= 'to'
                            {
                            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRating_Impl1608); 

                                	newLeafNode(otherlv_7, grammarAccess.getRating_ImplAccess().getToKeyword_5_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:672:3: (otherlv_8= 'rate' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==31) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:672:5: otherlv_8= 'rate'
                            {
                            otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRating_Impl1623); 

                                	newLeafNode(otherlv_8, grammarAccess.getRating_ImplAccess().getRateKeyword_5_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:676:3: ( (lv_question_9_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:677:1: (lv_question_9_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:677:1: (lv_question_9_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:678:3: lv_question_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getQuestionEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1646);
                    lv_question_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
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

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:694:4: ( (otherlv_10= 'between' )? ( (lv_Min_11_0= ruleEInt ) ) )?
            int alt37=2;
            switch ( input.LA(1) ) {
                case 32:
                    {
                    alt37=1;
                    }
                    break;
                case 59:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (LA37_2==RULE_INT) ) {
                        alt37=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt37=1;
                    }
                    break;
            }

            switch (alt37) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:694:5: (otherlv_10= 'between' )? ( (lv_Min_11_0= ruleEInt ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:694:5: (otherlv_10= 'between' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==32) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:694:7: otherlv_10= 'between'
                            {
                            otherlv_10=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRating_Impl1662); 

                                	newLeafNode(otherlv_10, grammarAccess.getRating_ImplAccess().getBetweenKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:698:3: ( (lv_Min_11_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:699:1: (lv_Min_11_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:699:1: (lv_Min_11_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:700:3: lv_Min_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMinEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1685);
                    lv_Min_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"Min",
                            		lv_Min_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:716:4: ( (otherlv_12= 'and' )? ( (lv_Max_13_0= ruleEInt ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==33) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==RULE_INT||LA39_1==59) ) {
                    alt39=1;
                }
            }
            else if ( (LA39_0==RULE_INT||LA39_0==59) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:716:5: (otherlv_12= 'and' )? ( (lv_Max_13_0= ruleEInt ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:716:5: (otherlv_12= 'and' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==33) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:716:7: otherlv_12= 'and'
                            {
                            otherlv_12=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRating_Impl1701); 

                                	newLeafNode(otherlv_12, grammarAccess.getRating_ImplAccess().getAndKeyword_7_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:720:3: ( (lv_Max_13_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:721:1: (lv_Max_13_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:721:1: (lv_Max_13_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:722:3: lv_Max_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMaxEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1724);
                    lv_Max_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"Max",
                            		lv_Max_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:738:4: ( (otherlv_14= 'where' )? (otherlv_15= 'lowest' )? (otherlv_16= 'means' )? ( (lv_first_17_0= ruleEString ) ) )?
            int alt43=2;
            switch ( input.LA(1) ) {
                case 34:
                case 35:
                    {
                    alt43=1;
                    }
                    break;
                case 36:
                    {
                    int LA43_2 = input.LA(2);

                    if ( (LA43_2==RULE_STRING) ) {
                        alt43=1;
                    }
                    else if ( (LA43_2==RULE_ID) ) {
                        alt43=1;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    alt43=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt43=1;
                    }
                    break;
            }

            switch (alt43) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:738:5: (otherlv_14= 'where' )? (otherlv_15= 'lowest' )? (otherlv_16= 'means' )? ( (lv_first_17_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:738:5: (otherlv_14= 'where' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==34) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:738:7: otherlv_14= 'where'
                            {
                            otherlv_14=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRating_Impl1740); 

                                	newLeafNode(otherlv_14, grammarAccess.getRating_ImplAccess().getWhereKeyword_8_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:742:3: (otherlv_15= 'lowest' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==35) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:742:5: otherlv_15= 'lowest'
                            {
                            otherlv_15=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRating_Impl1755); 

                                	newLeafNode(otherlv_15, grammarAccess.getRating_ImplAccess().getLowestKeyword_8_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:746:3: (otherlv_16= 'means' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==36) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:746:5: otherlv_16= 'means'
                            {
                            otherlv_16=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRating_Impl1770); 

                                	newLeafNode(otherlv_16, grammarAccess.getRating_ImplAccess().getMeansKeyword_8_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:750:3: ( (lv_first_17_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:751:1: (lv_first_17_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:751:1: (lv_first_17_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:752:3: lv_first_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getFirstEStringParserRuleCall_8_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1793);
                    lv_first_17_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"first",
                            		lv_first_17_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:768:4: ( (otherlv_18= 'and' )? (otherlv_19= 'highest' )? (otherlv_20= 'means' )? ( (lv_last_21_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_STRING)||LA47_0==33||(LA47_0>=36 && LA47_0<=37)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:768:5: (otherlv_18= 'and' )? (otherlv_19= 'highest' )? (otherlv_20= 'means' )? ( (lv_last_21_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:768:5: (otherlv_18= 'and' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==33) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:768:7: otherlv_18= 'and'
                            {
                            otherlv_18=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRating_Impl1809); 

                                	newLeafNode(otherlv_18, grammarAccess.getRating_ImplAccess().getAndKeyword_9_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:772:3: (otherlv_19= 'highest' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==37) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:772:5: otherlv_19= 'highest'
                            {
                            otherlv_19=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleRating_Impl1824); 

                                	newLeafNode(otherlv_19, grammarAccess.getRating_ImplAccess().getHighestKeyword_9_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:776:3: (otherlv_20= 'means' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==36) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:776:5: otherlv_20= 'means'
                            {
                            otherlv_20=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRating_Impl1839); 

                                	newLeafNode(otherlv_20, grammarAccess.getRating_ImplAccess().getMeansKeyword_9_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:780:3: ( (lv_last_21_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:781:1: (lv_last_21_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:781:1: (lv_last_21_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:782:3: lv_last_21_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getLastEStringParserRuleCall_9_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1862);
                    lv_last_21_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"last",
                            		lv_last_21_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:798:4: ( (otherlv_22= 'conditionals' )? otherlv_23= '(' ( (lv_RatingForks_24_0= ruleRatingFork ) ) (otherlv_25= ',' ( (lv_RatingForks_26_0= ruleRatingFork ) ) )* otherlv_27= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==28||LA50_0==38) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:798:5: (otherlv_22= 'conditionals' )? otherlv_23= '(' ( (lv_RatingForks_24_0= ruleRatingFork ) ) (otherlv_25= ',' ( (lv_RatingForks_26_0= ruleRatingFork ) ) )* otherlv_27= ')'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:798:5: (otherlv_22= 'conditionals' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==28) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:798:7: otherlv_22= 'conditionals'
                            {
                            otherlv_22=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRating_Impl1878); 

                                	newLeafNode(otherlv_22, grammarAccess.getRating_ImplAccess().getConditionalsKeyword_10_0());
                                

                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRating_Impl1892); 

                        	newLeafNode(otherlv_23, grammarAccess.getRating_ImplAccess().getLeftParenthesisKeyword_10_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:806:1: ( (lv_RatingForks_24_0= ruleRatingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:807:1: (lv_RatingForks_24_0= ruleRatingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:807:1: (lv_RatingForks_24_0= ruleRatingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:808:3: lv_RatingForks_24_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getRatingForksRatingForkParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl1913);
                    lv_RatingForks_24_0=ruleRatingFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"RatingForks",
                            		lv_RatingForks_24_0, 
                            		"RatingFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:824:2: (otherlv_25= ',' ( (lv_RatingForks_26_0= ruleRatingFork ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==24) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:824:4: otherlv_25= ',' ( (lv_RatingForks_26_0= ruleRatingFork ) )
                    	    {
                    	    otherlv_25=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRating_Impl1926); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getRating_ImplAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:828:1: ( (lv_RatingForks_26_0= ruleRatingFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:829:1: (lv_RatingForks_26_0= ruleRatingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:829:1: (lv_RatingForks_26_0= ruleRatingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:830:3: lv_RatingForks_26_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getRatingForksRatingForkParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl1947);
                    	    lv_RatingForks_26_0=ruleRatingFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"RatingForks",
                    	            		lv_RatingForks_26_0, 
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

                    otherlv_27=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleRating_Impl1961); 

                        	newLeafNode(otherlv_27, grammarAccess.getRating_ImplAccess().getRightParenthesisKeyword_10_4());
                        

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:858:1: entryRuleRanking returns [EObject current=null] : iv_ruleRanking= ruleRanking EOF ;
    public final EObject entryRuleRanking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRanking = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:859:2: (iv_ruleRanking= ruleRanking EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:860:2: iv_ruleRanking= ruleRanking EOF
            {
             newCompositeNode(grammarAccess.getRankingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRanking_in_entryRuleRanking1999);
            iv_ruleRanking=ruleRanking();

            state._fsp--;

             current =iv_ruleRanking; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRanking2009); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:867:1: ruleRanking returns [EObject current=null] : (otherlv_0= 'Ranking' otherlv_1= ':' (otherlv_2= 'is required' )? ( (otherlv_3= 'ask' )? ( (lv_question_4_0= ruleEString ) ) )? ( (otherlv_5= 'you' )? (otherlv_6= 'can' )? otherlv_7= 'choose' (otherlv_8= 'from' )? (otherlv_9= 'these' )? ( (lv_choices_10_0= ruleChoice ) ) (otherlv_11= ',' ( (lv_choices_12_0= ruleChoice ) ) )* )? ( (otherlv_13= 'conditionals' )? otherlv_14= '(' ( (lv_forks_15_0= ruleRankingFork ) ) (otherlv_16= ',' ( (lv_forks_17_0= ruleRankingFork ) ) )* otherlv_18= ')' )? ) ;
    public final EObject ruleRanking() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_question_4_0 = null;

        EObject lv_choices_10_0 = null;

        EObject lv_choices_12_0 = null;

        EObject lv_forks_15_0 = null;

        EObject lv_forks_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:870:28: ( (otherlv_0= 'Ranking' otherlv_1= ':' (otherlv_2= 'is required' )? ( (otherlv_3= 'ask' )? ( (lv_question_4_0= ruleEString ) ) )? ( (otherlv_5= 'you' )? (otherlv_6= 'can' )? otherlv_7= 'choose' (otherlv_8= 'from' )? (otherlv_9= 'these' )? ( (lv_choices_10_0= ruleChoice ) ) (otherlv_11= ',' ( (lv_choices_12_0= ruleChoice ) ) )* )? ( (otherlv_13= 'conditionals' )? otherlv_14= '(' ( (lv_forks_15_0= ruleRankingFork ) ) (otherlv_16= ',' ( (lv_forks_17_0= ruleRankingFork ) ) )* otherlv_18= ')' )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:871:1: (otherlv_0= 'Ranking' otherlv_1= ':' (otherlv_2= 'is required' )? ( (otherlv_3= 'ask' )? ( (lv_question_4_0= ruleEString ) ) )? ( (otherlv_5= 'you' )? (otherlv_6= 'can' )? otherlv_7= 'choose' (otherlv_8= 'from' )? (otherlv_9= 'these' )? ( (lv_choices_10_0= ruleChoice ) ) (otherlv_11= ',' ( (lv_choices_12_0= ruleChoice ) ) )* )? ( (otherlv_13= 'conditionals' )? otherlv_14= '(' ( (lv_forks_15_0= ruleRankingFork ) ) (otherlv_16= ',' ( (lv_forks_17_0= ruleRankingFork ) ) )* otherlv_18= ')' )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:871:1: (otherlv_0= 'Ranking' otherlv_1= ':' (otherlv_2= 'is required' )? ( (otherlv_3= 'ask' )? ( (lv_question_4_0= ruleEString ) ) )? ( (otherlv_5= 'you' )? (otherlv_6= 'can' )? otherlv_7= 'choose' (otherlv_8= 'from' )? (otherlv_9= 'these' )? ( (lv_choices_10_0= ruleChoice ) ) (otherlv_11= ',' ( (lv_choices_12_0= ruleChoice ) ) )* )? ( (otherlv_13= 'conditionals' )? otherlv_14= '(' ( (lv_forks_15_0= ruleRankingFork ) ) (otherlv_16= ',' ( (lv_forks_17_0= ruleRankingFork ) ) )* otherlv_18= ')' )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:871:3: otherlv_0= 'Ranking' otherlv_1= ':' (otherlv_2= 'is required' )? ( (otherlv_3= 'ask' )? ( (lv_question_4_0= ruleEString ) ) )? ( (otherlv_5= 'you' )? (otherlv_6= 'can' )? otherlv_7= 'choose' (otherlv_8= 'from' )? (otherlv_9= 'these' )? ( (lv_choices_10_0= ruleChoice ) ) (otherlv_11= ',' ( (lv_choices_12_0= ruleChoice ) ) )* )? ( (otherlv_13= 'conditionals' )? otherlv_14= '(' ( (lv_forks_15_0= ruleRankingFork ) ) (otherlv_16= ',' ( (lv_forks_17_0= ruleRankingFork ) ) )* otherlv_18= ')' )?
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRanking2046); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingAccess().getRankingKeyword_0());
                
            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRanking2058); 

                	newLeafNode(otherlv_1, grammarAccess.getRankingAccess().getColonKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:879:1: (otherlv_2= 'is required' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==17) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:879:3: otherlv_2= 'is required'
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRanking2071); 

                        	newLeafNode(otherlv_2, grammarAccess.getRankingAccess().getIsRequiredKeyword_2());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:883:3: ( (otherlv_3= 'ask' )? ( (lv_question_4_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_STRING)||LA53_0==41) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:883:4: (otherlv_3= 'ask' )? ( (lv_question_4_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:883:4: (otherlv_3= 'ask' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==41) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:883:6: otherlv_3= 'ask'
                            {
                            otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRanking2087); 

                                	newLeafNode(otherlv_3, grammarAccess.getRankingAccess().getAskKeyword_3_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:887:3: ( (lv_question_4_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:888:1: (lv_question_4_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:888:1: (lv_question_4_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:889:3: lv_question_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getQuestionEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRanking2110);
                    lv_question_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:905:4: ( (otherlv_5= 'you' )? (otherlv_6= 'can' )? otherlv_7= 'choose' (otherlv_8= 'from' )? (otherlv_9= 'these' )? ( (lv_choices_10_0= ruleChoice ) ) (otherlv_11= ',' ( (lv_choices_12_0= ruleChoice ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=42 && LA59_0<=44)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:905:5: (otherlv_5= 'you' )? (otherlv_6= 'can' )? otherlv_7= 'choose' (otherlv_8= 'from' )? (otherlv_9= 'these' )? ( (lv_choices_10_0= ruleChoice ) ) (otherlv_11= ',' ( (lv_choices_12_0= ruleChoice ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:905:5: (otherlv_5= 'you' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==42) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:905:7: otherlv_5= 'you'
                            {
                            otherlv_5=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleRanking2126); 

                                	newLeafNode(otherlv_5, grammarAccess.getRankingAccess().getYouKeyword_4_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:909:3: (otherlv_6= 'can' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==43) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:909:5: otherlv_6= 'can'
                            {
                            otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleRanking2141); 

                                	newLeafNode(otherlv_6, grammarAccess.getRankingAccess().getCanKeyword_4_1());
                                

                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleRanking2155); 

                        	newLeafNode(otherlv_7, grammarAccess.getRankingAccess().getChooseKeyword_4_2());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:917:1: (otherlv_8= 'from' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==45) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:917:3: otherlv_8= 'from'
                            {
                            otherlv_8=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleRanking2168); 

                                	newLeafNode(otherlv_8, grammarAccess.getRankingAccess().getFromKeyword_4_3());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:921:3: (otherlv_9= 'these' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==46) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:921:5: otherlv_9= 'these'
                            {
                            otherlv_9=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRanking2183); 

                                	newLeafNode(otherlv_9, grammarAccess.getRankingAccess().getTheseKeyword_4_4());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:925:3: ( (lv_choices_10_0= ruleChoice ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:926:1: (lv_choices_10_0= ruleChoice )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:926:1: (lv_choices_10_0= ruleChoice )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:927:3: lv_choices_10_0= ruleChoice
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_4_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2206);
                    lv_choices_10_0=ruleChoice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		add(
                           			current, 
                           			"choices",
                            		lv_choices_10_0, 
                            		"Choice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:943:2: (otherlv_11= ',' ( (lv_choices_12_0= ruleChoice ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==24) ) {
                            int LA58_2 = input.LA(2);

                            if ( (LA58_2==RULE_ID) ) {
                                alt58=1;
                            }


                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:943:4: otherlv_11= ',' ( (lv_choices_12_0= ruleChoice ) )
                    	    {
                    	    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRanking2219); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getRankingAccess().getCommaKeyword_4_6_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:947:1: ( (lv_choices_12_0= ruleChoice ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:948:1: (lv_choices_12_0= ruleChoice )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:948:1: (lv_choices_12_0= ruleChoice )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:949:3: lv_choices_12_0= ruleChoice
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_4_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2240);
                    	    lv_choices_12_0=ruleChoice();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"choices",
                    	            		lv_choices_12_0, 
                    	            		"Choice");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:965:6: ( (otherlv_13= 'conditionals' )? otherlv_14= '(' ( (lv_forks_15_0= ruleRankingFork ) ) (otherlv_16= ',' ( (lv_forks_17_0= ruleRankingFork ) ) )* otherlv_18= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==28||LA62_0==38) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:965:7: (otherlv_13= 'conditionals' )? otherlv_14= '(' ( (lv_forks_15_0= ruleRankingFork ) ) (otherlv_16= ',' ( (lv_forks_17_0= ruleRankingFork ) ) )* otherlv_18= ')'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:965:7: (otherlv_13= 'conditionals' )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==28) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:965:9: otherlv_13= 'conditionals'
                            {
                            otherlv_13=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRanking2258); 

                                	newLeafNode(otherlv_13, grammarAccess.getRankingAccess().getConditionalsKeyword_5_0());
                                

                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRanking2272); 

                        	newLeafNode(otherlv_14, grammarAccess.getRankingAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:973:1: ( (lv_forks_15_0= ruleRankingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:974:1: (lv_forks_15_0= ruleRankingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:974:1: (lv_forks_15_0= ruleRankingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:975:3: lv_forks_15_0= ruleRankingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getForksRankingForkParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRankingFork_in_ruleRanking2293);
                    lv_forks_15_0=ruleRankingFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		add(
                           			current, 
                           			"forks",
                            		lv_forks_15_0, 
                            		"RankingFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:991:2: (otherlv_16= ',' ( (lv_forks_17_0= ruleRankingFork ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==24) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:991:4: otherlv_16= ',' ( (lv_forks_17_0= ruleRankingFork ) )
                    	    {
                    	    otherlv_16=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRanking2306); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getRankingAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:995:1: ( (lv_forks_17_0= ruleRankingFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:996:1: (lv_forks_17_0= ruleRankingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:996:1: (lv_forks_17_0= ruleRankingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:997:3: lv_forks_17_0= ruleRankingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingAccess().getForksRankingForkParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRankingFork_in_ruleRanking2327);
                    	    lv_forks_17_0=ruleRankingFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forks",
                    	            		lv_forks_17_0, 
                    	            		"RankingFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleRanking2341); 

                        	newLeafNode(otherlv_18, grammarAccess.getRankingAccess().getRightParenthesisKeyword_5_4());
                        

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1025:1: entryRuleDichotomous returns [EObject current=null] : iv_ruleDichotomous= ruleDichotomous EOF ;
    public final EObject entryRuleDichotomous() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDichotomous = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1026:2: (iv_ruleDichotomous= ruleDichotomous EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1027:2: iv_ruleDichotomous= ruleDichotomous EOF
            {
             newCompositeNode(grammarAccess.getDichotomousRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDichotomous_in_entryRuleDichotomous2379);
            iv_ruleDichotomous=ruleDichotomous();

            state._fsp--;

             current =iv_ruleDichotomous; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDichotomous2389); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1034:1: ruleDichotomous returns [EObject current=null] : ( () otherlv_1= 'Dichotomous' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? (otherlv_10= 'if yes' otherlv_11= '(' ( (lv_yes_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_yes_14_0= ruleQuestion ) ) )* otherlv_15= ')' )? (otherlv_16= 'if no' otherlv_17= '(' ( (lv_no_18_0= ruleQuestion ) ) (otherlv_19= ',' ( (lv_no_20_0= ruleQuestion ) ) )* otherlv_21= ')' )? ) ;
    public final EObject ruleDichotomous() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_question_9_0 = null;

        EObject lv_yes_12_0 = null;

        EObject lv_yes_14_0 = null;

        EObject lv_no_18_0 = null;

        EObject lv_no_20_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1037:28: ( ( () otherlv_1= 'Dichotomous' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? (otherlv_10= 'if yes' otherlv_11= '(' ( (lv_yes_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_yes_14_0= ruleQuestion ) ) )* otherlv_15= ')' )? (otherlv_16= 'if no' otherlv_17= '(' ( (lv_no_18_0= ruleQuestion ) ) (otherlv_19= ',' ( (lv_no_20_0= ruleQuestion ) ) )* otherlv_21= ')' )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1038:1: ( () otherlv_1= 'Dichotomous' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? (otherlv_10= 'if yes' otherlv_11= '(' ( (lv_yes_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_yes_14_0= ruleQuestion ) ) )* otherlv_15= ')' )? (otherlv_16= 'if no' otherlv_17= '(' ( (lv_no_18_0= ruleQuestion ) ) (otherlv_19= ',' ( (lv_no_20_0= ruleQuestion ) ) )* otherlv_21= ')' )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1038:1: ( () otherlv_1= 'Dichotomous' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? (otherlv_10= 'if yes' otherlv_11= '(' ( (lv_yes_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_yes_14_0= ruleQuestion ) ) )* otherlv_15= ')' )? (otherlv_16= 'if no' otherlv_17= '(' ( (lv_no_18_0= ruleQuestion ) ) (otherlv_19= ',' ( (lv_no_20_0= ruleQuestion ) ) )* otherlv_21= ')' )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1038:2: () otherlv_1= 'Dichotomous' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )? (otherlv_10= 'if yes' otherlv_11= '(' ( (lv_yes_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_yes_14_0= ruleQuestion ) ) )* otherlv_15= ')' )? (otherlv_16= 'if no' otherlv_17= '(' ( (lv_no_18_0= ruleQuestion ) ) (otherlv_19= ',' ( (lv_no_20_0= ruleQuestion ) ) )* otherlv_21= ')' )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1038:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1039:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDichotomousAccess().getDichotomousAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleDichotomous2435); 

                	newLeafNode(otherlv_1, grammarAccess.getDichotomousAccess().getDichotomousKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDichotomous2447); 

                	newLeafNode(otherlv_2, grammarAccess.getDichotomousAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1052:1: ( (otherlv_3= 'The' )? otherlv_4= 'user' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=14 && LA64_0<=15)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1052:2: (otherlv_3= 'The' )? otherlv_4= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1052:2: (otherlv_3= 'The' )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==14) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1052:4: otherlv_3= 'The'
                            {
                            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDichotomous2461); 

                                	newLeafNode(otherlv_3, grammarAccess.getDichotomousAccess().getTheKeyword_3_0());
                                

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDichotomous2475); 

                        	newLeafNode(otherlv_4, grammarAccess.getDichotomousAccess().getUserKeyword_3_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1060:3: (otherlv_5= 'may' | otherlv_6= 'is required' )?
            int alt65=3;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==16) ) {
                alt65=1;
            }
            else if ( (LA65_0==17) ) {
                alt65=2;
            }
            switch (alt65) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1060:5: otherlv_5= 'may'
                    {
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDichotomous2490); 

                        	newLeafNode(otherlv_5, grammarAccess.getDichotomousAccess().getMayKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1065:7: otherlv_6= 'is required'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDichotomous2508); 

                        	newLeafNode(otherlv_6, grammarAccess.getDichotomousAccess().getIsRequiredKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1069:3: ( (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_ID && LA68_0<=RULE_STRING)||(LA68_0>=18 && LA68_0<=19)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1069:4: (otherlv_7= 'to' )? (otherlv_8= 'answer' )? ( (lv_question_9_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1069:4: (otherlv_7= 'to' )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==18) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1069:6: otherlv_7= 'to'
                            {
                            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDichotomous2524); 

                                	newLeafNode(otherlv_7, grammarAccess.getDichotomousAccess().getToKeyword_5_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1073:3: (otherlv_8= 'answer' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==19) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1073:5: otherlv_8= 'answer'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDichotomous2539); 

                                	newLeafNode(otherlv_8, grammarAccess.getDichotomousAccess().getAnswerKeyword_5_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1077:3: ( (lv_question_9_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1078:1: (lv_question_9_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1078:1: (lv_question_9_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1079:3: lv_question_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDichotomousAccess().getQuestionEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDichotomous2562);
                    lv_question_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
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

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1095:4: (otherlv_10= 'if yes' otherlv_11= '(' ( (lv_yes_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_yes_14_0= ruleQuestion ) ) )* otherlv_15= ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==48) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1095:6: otherlv_10= 'if yes' otherlv_11= '(' ( (lv_yes_12_0= ruleQuestion ) ) (otherlv_13= ',' ( (lv_yes_14_0= ruleQuestion ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleDichotomous2577); 

                        	newLeafNode(otherlv_10, grammarAccess.getDichotomousAccess().getIfYesKeyword_6_0());
                        
                    otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDichotomous2589); 

                        	newLeafNode(otherlv_11, grammarAccess.getDichotomousAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1103:1: ( (lv_yes_12_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1104:1: (lv_yes_12_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1104:1: (lv_yes_12_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1105:3: lv_yes_12_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getDichotomousAccess().getYesQuestionParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleDichotomous2610);
                    lv_yes_12_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
                    	        }
                           		add(
                           			current, 
                           			"yes",
                            		lv_yes_12_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1121:2: (otherlv_13= ',' ( (lv_yes_14_0= ruleQuestion ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==24) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1121:4: otherlv_13= ',' ( (lv_yes_14_0= ruleQuestion ) )
                    	    {
                    	    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDichotomous2623); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getDichotomousAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1125:1: ( (lv_yes_14_0= ruleQuestion ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1126:1: (lv_yes_14_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1126:1: (lv_yes_14_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1127:3: lv_yes_14_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDichotomousAccess().getYesQuestionParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleDichotomous2644);
                    	    lv_yes_14_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"yes",
                    	            		lv_yes_14_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDichotomous2658); 

                        	newLeafNode(otherlv_15, grammarAccess.getDichotomousAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1147:3: (otherlv_16= 'if no' otherlv_17= '(' ( (lv_no_18_0= ruleQuestion ) ) (otherlv_19= ',' ( (lv_no_20_0= ruleQuestion ) ) )* otherlv_21= ')' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==49) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1147:5: otherlv_16= 'if no' otherlv_17= '(' ( (lv_no_18_0= ruleQuestion ) ) (otherlv_19= ',' ( (lv_no_20_0= ruleQuestion ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleDichotomous2673); 

                        	newLeafNode(otherlv_16, grammarAccess.getDichotomousAccess().getIfNoKeyword_7_0());
                        
                    otherlv_17=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDichotomous2685); 

                        	newLeafNode(otherlv_17, grammarAccess.getDichotomousAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1155:1: ( (lv_no_18_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1156:1: (lv_no_18_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1156:1: (lv_no_18_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1157:3: lv_no_18_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getDichotomousAccess().getNoQuestionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleDichotomous2706);
                    lv_no_18_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
                    	        }
                           		add(
                           			current, 
                           			"no",
                            		lv_no_18_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1173:2: (otherlv_19= ',' ( (lv_no_20_0= ruleQuestion ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==24) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1173:4: otherlv_19= ',' ( (lv_no_20_0= ruleQuestion ) )
                    	    {
                    	    otherlv_19=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDichotomous2719); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getDichotomousAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1177:1: ( (lv_no_20_0= ruleQuestion ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1178:1: (lv_no_20_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1178:1: (lv_no_20_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1179:3: lv_no_20_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDichotomousAccess().getNoQuestionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleDichotomous2740);
                    	    lv_no_20_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"no",
                    	            		lv_no_20_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDichotomous2754); 

                        	newLeafNode(otherlv_21, grammarAccess.getDichotomousAccess().getRightParenthesisKeyword_7_4());
                        

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1207:1: entryRuleSumConstant returns [EObject current=null] : iv_ruleSumConstant= ruleSumConstant EOF ;
    public final EObject entryRuleSumConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumConstant = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1208:2: (iv_ruleSumConstant= ruleSumConstant EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1209:2: iv_ruleSumConstant= ruleSumConstant EOF
            {
             newCompositeNode(grammarAccess.getSumConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSumConstant_in_entryRuleSumConstant2792);
            iv_ruleSumConstant=ruleSumConstant();

            state._fsp--;

             current =iv_ruleSumConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSumConstant2802); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1216:1: ruleSumConstant returns [EObject current=null] : ( () otherlv_1= 'SumConstant' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'divide' )? (otherlv_9= 'according' )? (otherlv_10= 'to' )? (otherlv_11= 'the' )? (otherlv_12= 'importance' )? ( (lv_question_13_0= ruleEString ) ) )? ) ;
    public final EObject ruleSumConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_question_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1219:28: ( ( () otherlv_1= 'SumConstant' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'divide' )? (otherlv_9= 'according' )? (otherlv_10= 'to' )? (otherlv_11= 'the' )? (otherlv_12= 'importance' )? ( (lv_question_13_0= ruleEString ) ) )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1220:1: ( () otherlv_1= 'SumConstant' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'divide' )? (otherlv_9= 'according' )? (otherlv_10= 'to' )? (otherlv_11= 'the' )? (otherlv_12= 'importance' )? ( (lv_question_13_0= ruleEString ) ) )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1220:1: ( () otherlv_1= 'SumConstant' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'divide' )? (otherlv_9= 'according' )? (otherlv_10= 'to' )? (otherlv_11= 'the' )? (otherlv_12= 'importance' )? ( (lv_question_13_0= ruleEString ) ) )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1220:2: () otherlv_1= 'SumConstant' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'divide' )? (otherlv_9= 'according' )? (otherlv_10= 'to' )? (otherlv_11= 'the' )? (otherlv_12= 'importance' )? ( (lv_question_13_0= ruleEString ) ) )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1220:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1221:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSumConstantAccess().getSumConstantAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSumConstant2848); 

                	newLeafNode(otherlv_1, grammarAccess.getSumConstantAccess().getSumConstantKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSumConstant2860); 

                	newLeafNode(otherlv_2, grammarAccess.getSumConstantAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1234:1: ( (otherlv_3= 'The' )? otherlv_4= 'user' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=14 && LA74_0<=15)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1234:2: (otherlv_3= 'The' )? otherlv_4= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1234:2: (otherlv_3= 'The' )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==14) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1234:4: otherlv_3= 'The'
                            {
                            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSumConstant2874); 

                                	newLeafNode(otherlv_3, grammarAccess.getSumConstantAccess().getTheKeyword_3_0());
                                

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSumConstant2888); 

                        	newLeafNode(otherlv_4, grammarAccess.getSumConstantAccess().getUserKeyword_3_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1242:3: (otherlv_5= 'may' | otherlv_6= 'is required' )?
            int alt75=3;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==16) ) {
                alt75=1;
            }
            else if ( (LA75_0==17) ) {
                alt75=2;
            }
            switch (alt75) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1242:5: otherlv_5= 'may'
                    {
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSumConstant2903); 

                        	newLeafNode(otherlv_5, grammarAccess.getSumConstantAccess().getMayKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1247:7: otherlv_6= 'is required'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSumConstant2921); 

                        	newLeafNode(otherlv_6, grammarAccess.getSumConstantAccess().getIsRequiredKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1251:3: ( (otherlv_7= 'to' )? (otherlv_8= 'divide' )? (otherlv_9= 'according' )? (otherlv_10= 'to' )? (otherlv_11= 'the' )? (otherlv_12= 'importance' )? ( (lv_question_13_0= ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_ID && LA82_0<=RULE_STRING)||LA82_0==18||(LA82_0>=51 && LA82_0<=54)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1251:4: (otherlv_7= 'to' )? (otherlv_8= 'divide' )? (otherlv_9= 'according' )? (otherlv_10= 'to' )? (otherlv_11= 'the' )? (otherlv_12= 'importance' )? ( (lv_question_13_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1251:4: (otherlv_7= 'to' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==18) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1251:6: otherlv_7= 'to'
                            {
                            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSumConstant2937); 

                                	newLeafNode(otherlv_7, grammarAccess.getSumConstantAccess().getToKeyword_5_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1255:3: (otherlv_8= 'divide' )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==51) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1255:5: otherlv_8= 'divide'
                            {
                            otherlv_8=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleSumConstant2952); 

                                	newLeafNode(otherlv_8, grammarAccess.getSumConstantAccess().getDivideKeyword_5_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1259:3: (otherlv_9= 'according' )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==52) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1259:5: otherlv_9= 'according'
                            {
                            otherlv_9=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleSumConstant2967); 

                                	newLeafNode(otherlv_9, grammarAccess.getSumConstantAccess().getAccordingKeyword_5_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1263:3: (otherlv_10= 'to' )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==18) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1263:5: otherlv_10= 'to'
                            {
                            otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSumConstant2982); 

                                	newLeafNode(otherlv_10, grammarAccess.getSumConstantAccess().getToKeyword_5_3());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1267:3: (otherlv_11= 'the' )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==53) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1267:5: otherlv_11= 'the'
                            {
                            otherlv_11=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleSumConstant2997); 

                                	newLeafNode(otherlv_11, grammarAccess.getSumConstantAccess().getTheKeyword_5_4());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1271:3: (otherlv_12= 'importance' )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==54) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1271:5: otherlv_12= 'importance'
                            {
                            otherlv_12=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleSumConstant3012); 

                                	newLeafNode(otherlv_12, grammarAccess.getSumConstantAccess().getImportanceKeyword_5_5());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1275:3: ( (lv_question_13_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1276:1: (lv_question_13_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1276:1: (lv_question_13_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1277:3: lv_question_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSumConstantAccess().getQuestionEStringParserRuleCall_5_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSumConstant3035);
                    lv_question_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSumConstantRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_13_0, 
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
    // $ANTLR end "ruleSumConstant"


    // $ANTLR start "entryRuleStaple"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1301:1: entryRuleStaple returns [EObject current=null] : iv_ruleStaple= ruleStaple EOF ;
    public final EObject entryRuleStaple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaple = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1302:2: (iv_ruleStaple= ruleStaple EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1303:2: iv_ruleStaple= ruleStaple EOF
            {
             newCompositeNode(grammarAccess.getStapleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStaple_in_entryRuleStaple3073);
            iv_ruleStaple=ruleStaple();

            state._fsp--;

             current =iv_ruleStaple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStaple3083); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1310:1: ruleStaple returns [EObject current=null] : ( () otherlv_1= 'Staple' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'rate' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'between' )? ( (lv_Min_11_0= ruleEInt ) ) )? ( (otherlv_12= 'and' )? ( (lv_Max_13_0= ruleEInt ) ) )? ( (otherlv_14= 'where' )? (otherlv_15= 'lowest' )? (otherlv_16= 'means' )? (otherlv_17= ',' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'mean' )? (otherlv_20= 'means' )? ( (lv_mid_21_0= ruleEString ) ) )? ( (otherlv_22= 'and' )? (otherlv_23= 'highest' )? (otherlv_24= 'means' )? ( (lv_last_25_0= ruleEString ) ) )? (otherlv_26= 'conditionals' ( (lv_RatingForks_27_0= ruleRatingFork ) ) (otherlv_28= ',' ( (lv_RatingForks_29_0= ruleRatingFork ) ) )* )? ) ;
    public final EObject ruleStaple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_question_9_0 = null;

        AntlrDatatypeRuleToken lv_Min_11_0 = null;

        AntlrDatatypeRuleToken lv_Max_13_0 = null;

        AntlrDatatypeRuleToken lv_first_18_0 = null;

        AntlrDatatypeRuleToken lv_mid_21_0 = null;

        AntlrDatatypeRuleToken lv_last_25_0 = null;

        EObject lv_RatingForks_27_0 = null;

        EObject lv_RatingForks_29_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1313:28: ( ( () otherlv_1= 'Staple' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'rate' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'between' )? ( (lv_Min_11_0= ruleEInt ) ) )? ( (otherlv_12= 'and' )? ( (lv_Max_13_0= ruleEInt ) ) )? ( (otherlv_14= 'where' )? (otherlv_15= 'lowest' )? (otherlv_16= 'means' )? (otherlv_17= ',' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'mean' )? (otherlv_20= 'means' )? ( (lv_mid_21_0= ruleEString ) ) )? ( (otherlv_22= 'and' )? (otherlv_23= 'highest' )? (otherlv_24= 'means' )? ( (lv_last_25_0= ruleEString ) ) )? (otherlv_26= 'conditionals' ( (lv_RatingForks_27_0= ruleRatingFork ) ) (otherlv_28= ',' ( (lv_RatingForks_29_0= ruleRatingFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1314:1: ( () otherlv_1= 'Staple' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'rate' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'between' )? ( (lv_Min_11_0= ruleEInt ) ) )? ( (otherlv_12= 'and' )? ( (lv_Max_13_0= ruleEInt ) ) )? ( (otherlv_14= 'where' )? (otherlv_15= 'lowest' )? (otherlv_16= 'means' )? (otherlv_17= ',' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'mean' )? (otherlv_20= 'means' )? ( (lv_mid_21_0= ruleEString ) ) )? ( (otherlv_22= 'and' )? (otherlv_23= 'highest' )? (otherlv_24= 'means' )? ( (lv_last_25_0= ruleEString ) ) )? (otherlv_26= 'conditionals' ( (lv_RatingForks_27_0= ruleRatingFork ) ) (otherlv_28= ',' ( (lv_RatingForks_29_0= ruleRatingFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1314:1: ( () otherlv_1= 'Staple' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'rate' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'between' )? ( (lv_Min_11_0= ruleEInt ) ) )? ( (otherlv_12= 'and' )? ( (lv_Max_13_0= ruleEInt ) ) )? ( (otherlv_14= 'where' )? (otherlv_15= 'lowest' )? (otherlv_16= 'means' )? (otherlv_17= ',' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'mean' )? (otherlv_20= 'means' )? ( (lv_mid_21_0= ruleEString ) ) )? ( (otherlv_22= 'and' )? (otherlv_23= 'highest' )? (otherlv_24= 'means' )? ( (lv_last_25_0= ruleEString ) ) )? (otherlv_26= 'conditionals' ( (lv_RatingForks_27_0= ruleRatingFork ) ) (otherlv_28= ',' ( (lv_RatingForks_29_0= ruleRatingFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1314:2: () otherlv_1= 'Staple' otherlv_2= ':' ( (otherlv_3= 'The' )? otherlv_4= 'user' )? (otherlv_5= 'may' | otherlv_6= 'is required' )? ( (otherlv_7= 'to' )? (otherlv_8= 'rate' )? ( (lv_question_9_0= ruleEString ) ) )? ( (otherlv_10= 'between' )? ( (lv_Min_11_0= ruleEInt ) ) )? ( (otherlv_12= 'and' )? ( (lv_Max_13_0= ruleEInt ) ) )? ( (otherlv_14= 'where' )? (otherlv_15= 'lowest' )? (otherlv_16= 'means' )? (otherlv_17= ',' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'mean' )? (otherlv_20= 'means' )? ( (lv_mid_21_0= ruleEString ) ) )? ( (otherlv_22= 'and' )? (otherlv_23= 'highest' )? (otherlv_24= 'means' )? ( (lv_last_25_0= ruleEString ) ) )? (otherlv_26= 'conditionals' ( (lv_RatingForks_27_0= ruleRatingFork ) ) (otherlv_28= ',' ( (lv_RatingForks_29_0= ruleRatingFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1314:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1315:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStapleAccess().getStapleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleStaple3129); 

                	newLeafNode(otherlv_1, grammarAccess.getStapleAccess().getStapleKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStaple3141); 

                	newLeafNode(otherlv_2, grammarAccess.getStapleAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1328:1: ( (otherlv_3= 'The' )? otherlv_4= 'user' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=14 && LA84_0<=15)) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1328:2: (otherlv_3= 'The' )? otherlv_4= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1328:2: (otherlv_3= 'The' )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==14) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1328:4: otherlv_3= 'The'
                            {
                            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStaple3155); 

                                	newLeafNode(otherlv_3, grammarAccess.getStapleAccess().getTheKeyword_3_0());
                                

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStaple3169); 

                        	newLeafNode(otherlv_4, grammarAccess.getStapleAccess().getUserKeyword_3_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1336:3: (otherlv_5= 'may' | otherlv_6= 'is required' )?
            int alt85=3;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==16) ) {
                alt85=1;
            }
            else if ( (LA85_0==17) ) {
                alt85=2;
            }
            switch (alt85) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1336:5: otherlv_5= 'may'
                    {
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStaple3184); 

                        	newLeafNode(otherlv_5, grammarAccess.getStapleAccess().getMayKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1341:7: otherlv_6= 'is required'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStaple3202); 

                        	newLeafNode(otherlv_6, grammarAccess.getStapleAccess().getIsRequiredKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1345:3: ( (otherlv_7= 'to' )? (otherlv_8= 'rate' )? ( (lv_question_9_0= ruleEString ) ) )?
            int alt88=2;
            switch ( input.LA(1) ) {
                case 18:
                case 31:
                    {
                    alt88=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt88=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt88=1;
                    }
                    break;
            }

            switch (alt88) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1345:4: (otherlv_7= 'to' )? (otherlv_8= 'rate' )? ( (lv_question_9_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1345:4: (otherlv_7= 'to' )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==18) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1345:6: otherlv_7= 'to'
                            {
                            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStaple3218); 

                                	newLeafNode(otherlv_7, grammarAccess.getStapleAccess().getToKeyword_5_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1349:3: (otherlv_8= 'rate' )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==31) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1349:5: otherlv_8= 'rate'
                            {
                            otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleStaple3233); 

                                	newLeafNode(otherlv_8, grammarAccess.getStapleAccess().getRateKeyword_5_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1353:3: ( (lv_question_9_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1354:1: (lv_question_9_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1354:1: (lv_question_9_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1355:3: lv_question_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getQuestionEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3256);
                    lv_question_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
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

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1371:4: ( (otherlv_10= 'between' )? ( (lv_Min_11_0= ruleEInt ) ) )?
            int alt90=2;
            switch ( input.LA(1) ) {
                case 32:
                    {
                    alt90=1;
                    }
                    break;
                case 59:
                    {
                    int LA90_2 = input.LA(2);

                    if ( (LA90_2==RULE_INT) ) {
                        alt90=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt90=1;
                    }
                    break;
            }

            switch (alt90) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1371:5: (otherlv_10= 'between' )? ( (lv_Min_11_0= ruleEInt ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1371:5: (otherlv_10= 'between' )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==32) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1371:7: otherlv_10= 'between'
                            {
                            otherlv_10=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleStaple3272); 

                                	newLeafNode(otherlv_10, grammarAccess.getStapleAccess().getBetweenKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1375:3: ( (lv_Min_11_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1376:1: (lv_Min_11_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1376:1: (lv_Min_11_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1377:3: lv_Min_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getMinEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStaple3295);
                    lv_Min_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"Min",
                            		lv_Min_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1393:4: ( (otherlv_12= 'and' )? ( (lv_Max_13_0= ruleEInt ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==33) ) {
                int LA92_1 = input.LA(2);

                if ( (LA92_1==RULE_INT||LA92_1==59) ) {
                    alt92=1;
                }
            }
            else if ( (LA92_0==RULE_INT||LA92_0==59) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1393:5: (otherlv_12= 'and' )? ( (lv_Max_13_0= ruleEInt ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1393:5: (otherlv_12= 'and' )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==33) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1393:7: otherlv_12= 'and'
                            {
                            otherlv_12=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStaple3311); 

                                	newLeafNode(otherlv_12, grammarAccess.getStapleAccess().getAndKeyword_7_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1397:3: ( (lv_Max_13_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1398:1: (lv_Max_13_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1398:1: (lv_Max_13_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1399:3: lv_Max_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getMaxEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStaple3334);
                    lv_Max_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"Max",
                            		lv_Max_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1415:4: ( (otherlv_14= 'where' )? (otherlv_15= 'lowest' )? (otherlv_16= 'means' )? (otherlv_17= ',' )? ( (lv_first_18_0= ruleEString ) ) )?
            int alt97=2;
            switch ( input.LA(1) ) {
                case 34:
                case 35:
                    {
                    alt97=1;
                    }
                    break;
                case 36:
                    {
                    int LA97_2 = input.LA(2);

                    if ( (LA97_2==RULE_ID||LA97_2==24) ) {
                        alt97=1;
                    }
                    else if ( (LA97_2==RULE_STRING) ) {
                        alt97=1;
                    }
                    }
                    break;
                case 24:
                    {
                    int LA97_3 = input.LA(2);

                    if ( ((LA97_3>=RULE_ID && LA97_3<=RULE_STRING)) ) {
                        alt97=1;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    alt97=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt97=1;
                    }
                    break;
            }

            switch (alt97) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1415:5: (otherlv_14= 'where' )? (otherlv_15= 'lowest' )? (otherlv_16= 'means' )? (otherlv_17= ',' )? ( (lv_first_18_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1415:5: (otherlv_14= 'where' )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==34) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1415:7: otherlv_14= 'where'
                            {
                            otherlv_14=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStaple3350); 

                                	newLeafNode(otherlv_14, grammarAccess.getStapleAccess().getWhereKeyword_8_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1419:3: (otherlv_15= 'lowest' )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==35) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1419:5: otherlv_15= 'lowest'
                            {
                            otherlv_15=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStaple3365); 

                                	newLeafNode(otherlv_15, grammarAccess.getStapleAccess().getLowestKeyword_8_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1423:3: (otherlv_16= 'means' )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==36) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1423:5: otherlv_16= 'means'
                            {
                            otherlv_16=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStaple3380); 

                                	newLeafNode(otherlv_16, grammarAccess.getStapleAccess().getMeansKeyword_8_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1427:3: (otherlv_17= ',' )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==24) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1427:5: otherlv_17= ','
                            {
                            otherlv_17=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleStaple3395); 

                                	newLeafNode(otherlv_17, grammarAccess.getStapleAccess().getCommaKeyword_8_3());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1431:3: ( (lv_first_18_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1432:1: (lv_first_18_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1432:1: (lv_first_18_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1433:3: lv_first_18_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getFirstEStringParserRuleCall_8_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3418);
                    lv_first_18_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
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

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1449:4: ( (otherlv_19= 'mean' )? (otherlv_20= 'means' )? ( (lv_mid_21_0= ruleEString ) ) )?
            int alt100=2;
            switch ( input.LA(1) ) {
                case 56:
                    {
                    alt100=1;
                    }
                    break;
                case 36:
                    {
                    int LA100_2 = input.LA(2);

                    if ( (LA100_2==RULE_STRING) ) {
                        alt100=1;
                    }
                    else if ( (LA100_2==RULE_ID) ) {
                        alt100=1;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    alt100=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt100=1;
                    }
                    break;
            }

            switch (alt100) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1449:5: (otherlv_19= 'mean' )? (otherlv_20= 'means' )? ( (lv_mid_21_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1449:5: (otherlv_19= 'mean' )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==56) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1449:7: otherlv_19= 'mean'
                            {
                            otherlv_19=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleStaple3434); 

                                	newLeafNode(otherlv_19, grammarAccess.getStapleAccess().getMeanKeyword_9_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1453:3: (otherlv_20= 'means' )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==36) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1453:5: otherlv_20= 'means'
                            {
                            otherlv_20=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStaple3449); 

                                	newLeafNode(otherlv_20, grammarAccess.getStapleAccess().getMeansKeyword_9_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1457:3: ( (lv_mid_21_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1458:1: (lv_mid_21_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1458:1: (lv_mid_21_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1459:3: lv_mid_21_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getMidEStringParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3472);
                    lv_mid_21_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"mid",
                            		lv_mid_21_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1475:4: ( (otherlv_22= 'and' )? (otherlv_23= 'highest' )? (otherlv_24= 'means' )? ( (lv_last_25_0= ruleEString ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=RULE_ID && LA104_0<=RULE_STRING)||LA104_0==33||(LA104_0>=36 && LA104_0<=37)) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1475:5: (otherlv_22= 'and' )? (otherlv_23= 'highest' )? (otherlv_24= 'means' )? ( (lv_last_25_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1475:5: (otherlv_22= 'and' )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==33) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1475:7: otherlv_22= 'and'
                            {
                            otherlv_22=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStaple3488); 

                                	newLeafNode(otherlv_22, grammarAccess.getStapleAccess().getAndKeyword_10_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1479:3: (otherlv_23= 'highest' )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==37) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1479:5: otherlv_23= 'highest'
                            {
                            otherlv_23=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStaple3503); 

                                	newLeafNode(otherlv_23, grammarAccess.getStapleAccess().getHighestKeyword_10_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1483:3: (otherlv_24= 'means' )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==36) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1483:5: otherlv_24= 'means'
                            {
                            otherlv_24=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStaple3518); 

                                	newLeafNode(otherlv_24, grammarAccess.getStapleAccess().getMeansKeyword_10_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1487:3: ( (lv_last_25_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1488:1: (lv_last_25_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1488:1: (lv_last_25_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1489:3: lv_last_25_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getLastEStringParserRuleCall_10_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3541);
                    lv_last_25_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"last",
                            		lv_last_25_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1505:4: (otherlv_26= 'conditionals' ( (lv_RatingForks_27_0= ruleRatingFork ) ) (otherlv_28= ',' ( (lv_RatingForks_29_0= ruleRatingFork ) ) )* )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==28) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1505:6: otherlv_26= 'conditionals' ( (lv_RatingForks_27_0= ruleRatingFork ) ) (otherlv_28= ',' ( (lv_RatingForks_29_0= ruleRatingFork ) ) )*
                    {
                    otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleStaple3556); 

                        	newLeafNode(otherlv_26, grammarAccess.getStapleAccess().getConditionalsKeyword_11_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1509:1: ( (lv_RatingForks_27_0= ruleRatingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1510:1: (lv_RatingForks_27_0= ruleRatingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1510:1: (lv_RatingForks_27_0= ruleRatingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1511:3: lv_RatingForks_27_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getRatingForksRatingForkParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3577);
                    lv_RatingForks_27_0=ruleRatingFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		add(
                           			current, 
                           			"RatingForks",
                            		lv_RatingForks_27_0, 
                            		"RatingFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1527:2: (otherlv_28= ',' ( (lv_RatingForks_29_0= ruleRatingFork ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==24) ) {
                            int LA105_2 = input.LA(2);

                            if ( (LA105_2==60) ) {
                                alt105=1;
                            }


                        }


                        switch (alt105) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1527:4: otherlv_28= ',' ( (lv_RatingForks_29_0= ruleRatingFork ) )
                    	    {
                    	    otherlv_28=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleStaple3590); 

                    	        	newLeafNode(otherlv_28, grammarAccess.getStapleAccess().getCommaKeyword_11_2_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1531:1: ( (lv_RatingForks_29_0= ruleRatingFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1532:1: (lv_RatingForks_29_0= ruleRatingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1532:1: (lv_RatingForks_29_0= ruleRatingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1533:3: lv_RatingForks_29_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStapleAccess().getRatingForksRatingForkParserRuleCall_11_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3611);
                    	    lv_RatingForks_29_0=ruleRatingFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"RatingForks",
                    	            		lv_RatingForks_29_0, 
                    	            		"RatingFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1557:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1558:2: (iv_ruleChoice= ruleChoice EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1559:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_entryRuleChoice3651);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoice3661); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1566:1: ruleChoice returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_Description_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1569:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1570:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1570:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1570:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1570:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1571:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1571:1: (lv_name_0_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1572:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleChoice3703); 

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

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleChoice3720); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getColonKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1592:1: ( (lv_Description_2_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1593:1: (lv_Description_2_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1593:1: (lv_Description_2_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1594:3: lv_Description_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChoiceAccess().getDescriptionEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoice3741);
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


    // $ANTLR start "entryRuleMultipleChoiceFork"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1618:1: entryRuleMultipleChoiceFork returns [EObject current=null] : iv_ruleMultipleChoiceFork= ruleMultipleChoiceFork EOF ;
    public final EObject entryRuleMultipleChoiceFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoiceFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1619:2: (iv_ruleMultipleChoiceFork= ruleMultipleChoiceFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1620:2: iv_ruleMultipleChoiceFork= ruleMultipleChoiceFork EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoiceForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoiceFork_in_entryRuleMultipleChoiceFork3777);
            iv_ruleMultipleChoiceFork=ruleMultipleChoiceFork();

            state._fsp--;

             current =iv_ruleMultipleChoiceFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoiceFork3787); 

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
    // $ANTLR end "entryRuleMultipleChoiceFork"


    // $ANTLR start "ruleMultipleChoiceFork"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1627:1: ruleMultipleChoiceFork returns [EObject current=null] : (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'questions' otherlv_3= '(' ( (lv_forkedquestions_4_0= ruleQuestion ) ) (otherlv_5= ',' ( (lv_forkedquestions_6_0= ruleQuestion ) ) )* otherlv_7= ')' )? ) ;
    public final EObject ruleMultipleChoiceFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_forkedquestions_4_0 = null;

        EObject lv_forkedquestions_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1630:28: ( (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'questions' otherlv_3= '(' ( (lv_forkedquestions_4_0= ruleQuestion ) ) (otherlv_5= ',' ( (lv_forkedquestions_6_0= ruleQuestion ) ) )* otherlv_7= ')' )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1631:1: (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'questions' otherlv_3= '(' ( (lv_forkedquestions_4_0= ruleQuestion ) ) (otherlv_5= ',' ( (lv_forkedquestions_6_0= ruleQuestion ) ) )* otherlv_7= ')' )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1631:1: (otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'questions' otherlv_3= '(' ( (lv_forkedquestions_4_0= ruleQuestion ) ) (otherlv_5= ',' ( (lv_forkedquestions_6_0= ruleQuestion ) ) )* otherlv_7= ')' )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1631:3: otherlv_0= 'match' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'questions' otherlv_3= '(' ( (lv_forkedquestions_4_0= ruleQuestion ) ) (otherlv_5= ',' ( (lv_forkedquestions_6_0= ruleQuestion ) ) )* otherlv_7= ')' )?
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleMultipleChoiceFork3824); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleChoiceForkAccess().getMatchKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1635:1: ( (otherlv_1= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1636:1: (otherlv_1= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1636:1: (otherlv_1= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1637:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMultipleChoiceForkRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultipleChoiceFork3844); 

            		newLeafNode(otherlv_1, grammarAccess.getMultipleChoiceForkAccess().getMatcherChoiceCrossReference_1_0()); 
            	

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1648:2: (otherlv_2= 'questions' otherlv_3= '(' ( (lv_forkedquestions_4_0= ruleQuestion ) ) (otherlv_5= ',' ( (lv_forkedquestions_6_0= ruleQuestion ) ) )* otherlv_7= ')' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==58) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1648:4: otherlv_2= 'questions' otherlv_3= '(' ( (lv_forkedquestions_4_0= ruleQuestion ) ) (otherlv_5= ',' ( (lv_forkedquestions_6_0= ruleQuestion ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleMultipleChoiceFork3857); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultipleChoiceForkAccess().getQuestionsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMultipleChoiceFork3869); 

                        	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceForkAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1656:1: ( (lv_forkedquestions_4_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1657:1: (lv_forkedquestions_4_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1657:1: (lv_forkedquestions_4_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1658:3: lv_forkedquestions_4_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceForkAccess().getForkedquestionsQuestionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleMultipleChoiceFork3890);
                    lv_forkedquestions_4_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceForkRule());
                    	        }
                           		add(
                           			current, 
                           			"forkedquestions",
                            		lv_forkedquestions_4_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1674:2: (otherlv_5= ',' ( (lv_forkedquestions_6_0= ruleQuestion ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==24) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1674:4: otherlv_5= ',' ( (lv_forkedquestions_6_0= ruleQuestion ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultipleChoiceFork3903); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getMultipleChoiceForkAccess().getCommaKeyword_2_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1678:1: ( (lv_forkedquestions_6_0= ruleQuestion ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1679:1: (lv_forkedquestions_6_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1679:1: (lv_forkedquestions_6_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1680:3: lv_forkedquestions_6_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceForkAccess().getForkedquestionsQuestionParserRuleCall_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleMultipleChoiceFork3924);
                    	    lv_forkedquestions_6_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceForkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forkedquestions",
                    	            		lv_forkedquestions_6_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMultipleChoiceFork3938); 

                        	newLeafNode(otherlv_7, grammarAccess.getMultipleChoiceForkAccess().getRightParenthesisKeyword_2_4());
                        

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
    // $ANTLR end "ruleMultipleChoiceFork"


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1708:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1709:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1710:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3977);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3988); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1717:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1720:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1721:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1721:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1721:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1721:2: (kw= '-' )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==59) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1722:2: kw= '-'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleEInt4027); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4044); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1742:1: entryRuleRatingFork returns [EObject current=null] : iv_ruleRatingFork= ruleRatingFork EOF ;
    public final EObject entryRuleRatingFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatingFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1743:2: (iv_ruleRatingFork= ruleRatingFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1744:2: iv_ruleRatingFork= ruleRatingFork EOF
            {
             newCompositeNode(grammarAccess.getRatingForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_entryRuleRatingFork4089);
            iv_ruleRatingFork=ruleRatingFork();

            state._fsp--;

             current =iv_ruleRatingFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRatingFork4099); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1751:1: ruleRatingFork returns [EObject current=null] : ( () otherlv_1= 'RatingFork' otherlv_2= ':' (otherlv_3= 'from' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'to' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'questions' otherlv_8= '(' ( (lv_forkedquestion_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )* otherlv_12= ')' )? ) ;
    public final EObject ruleRatingFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_min_4_0 = null;

        AntlrDatatypeRuleToken lv_max_6_0 = null;

        EObject lv_forkedquestion_9_0 = null;

        EObject lv_forkedquestion_11_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1754:28: ( ( () otherlv_1= 'RatingFork' otherlv_2= ':' (otherlv_3= 'from' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'to' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'questions' otherlv_8= '(' ( (lv_forkedquestion_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )* otherlv_12= ')' )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1755:1: ( () otherlv_1= 'RatingFork' otherlv_2= ':' (otherlv_3= 'from' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'to' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'questions' otherlv_8= '(' ( (lv_forkedquestion_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )* otherlv_12= ')' )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1755:1: ( () otherlv_1= 'RatingFork' otherlv_2= ':' (otherlv_3= 'from' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'to' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'questions' otherlv_8= '(' ( (lv_forkedquestion_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )* otherlv_12= ')' )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1755:2: () otherlv_1= 'RatingFork' otherlv_2= ':' (otherlv_3= 'from' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'to' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'questions' otherlv_8= '(' ( (lv_forkedquestion_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )* otherlv_12= ')' )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1755:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1756:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRatingForkAccess().getRatingForkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleRatingFork4145); 

                	newLeafNode(otherlv_1, grammarAccess.getRatingForkAccess().getRatingForkKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRatingFork4157); 

                	newLeafNode(otherlv_2, grammarAccess.getRatingForkAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1769:1: (otherlv_3= 'from' ( (lv_min_4_0= ruleEInt ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==45) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1769:3: otherlv_3= 'from' ( (lv_min_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleRatingFork4170); 

                        	newLeafNode(otherlv_3, grammarAccess.getRatingForkAccess().getFromKeyword_3_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1773:1: ( (lv_min_4_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1774:1: (lv_min_4_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1774:1: (lv_min_4_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1775:3: lv_min_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRatingForkAccess().getMinEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork4191);
                    lv_min_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRatingForkRule());
                    	        }
                           		set(
                           			current, 
                           			"min",
                            		lv_min_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1791:4: (otherlv_5= 'to' ( (lv_max_6_0= ruleEInt ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==18) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1791:6: otherlv_5= 'to' ( (lv_max_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRatingFork4206); 

                        	newLeafNode(otherlv_5, grammarAccess.getRatingForkAccess().getToKeyword_4_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1795:1: ( (lv_max_6_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1796:1: (lv_max_6_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1796:1: (lv_max_6_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1797:3: lv_max_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRatingForkAccess().getMaxEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork4227);
                    lv_max_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRatingForkRule());
                    	        }
                           		set(
                           			current, 
                           			"max",
                            		lv_max_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1813:4: (otherlv_7= 'questions' otherlv_8= '(' ( (lv_forkedquestion_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )* otherlv_12= ')' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==58) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1813:6: otherlv_7= 'questions' otherlv_8= '(' ( (lv_forkedquestion_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleRatingFork4242); 

                        	newLeafNode(otherlv_7, grammarAccess.getRatingForkAccess().getQuestionsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRatingFork4254); 

                        	newLeafNode(otherlv_8, grammarAccess.getRatingForkAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1821:1: ( (lv_forkedquestion_9_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1822:1: (lv_forkedquestion_9_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1822:1: (lv_forkedquestion_9_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1823:3: lv_forkedquestion_9_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getRatingForkAccess().getForkedquestionQuestionParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleRatingFork4275);
                    lv_forkedquestion_9_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRatingForkRule());
                    	        }
                           		add(
                           			current, 
                           			"forkedquestion",
                            		lv_forkedquestion_9_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1839:2: (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==24) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1839:4: otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) )
                    	    {
                    	    otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRatingFork4288); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRatingForkAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1843:1: ( (lv_forkedquestion_11_0= ruleQuestion ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1844:1: (lv_forkedquestion_11_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1844:1: (lv_forkedquestion_11_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1845:3: lv_forkedquestion_11_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRatingForkAccess().getForkedquestionQuestionParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleRatingFork4309);
                    	    lv_forkedquestion_11_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRatingForkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forkedquestion",
                    	            		lv_forkedquestion_11_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleRatingFork4323); 

                        	newLeafNode(otherlv_12, grammarAccess.getRatingForkAccess().getRightParenthesisKeyword_5_4());
                        

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
    // $ANTLR end "ruleRatingFork"


    // $ANTLR start "entryRuleRankingFork"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1873:1: entryRuleRankingFork returns [EObject current=null] : iv_ruleRankingFork= ruleRankingFork EOF ;
    public final EObject entryRuleRankingFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRankingFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1874:2: (iv_ruleRankingFork= ruleRankingFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1875:2: iv_ruleRankingFork= ruleRankingFork EOF
            {
             newCompositeNode(grammarAccess.getRankingForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRankingFork_in_entryRuleRankingFork4361);
            iv_ruleRankingFork=ruleRankingFork();

            state._fsp--;

             current =iv_ruleRankingFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRankingFork4371); 

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
    // $ANTLR end "entryRuleRankingFork"


    // $ANTLR start "ruleRankingFork"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1882:1: ruleRankingFork returns [EObject current=null] : (otherlv_0= 'RankingFork' otherlv_1= ':' (otherlv_2= 'from' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'to' ( (lv_max_5_0= ruleEInt ) ) )? (otherlv_6= 'match' )? (otherlv_7= 'with' )? ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'questions' otherlv_10= '(' ( (lv_forkedquestions_11_0= ruleQuestion ) ) (otherlv_12= ',' ( (lv_forkedquestions_13_0= ruleQuestion ) ) )* otherlv_14= ')' )? ) ;
    public final EObject ruleRankingFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_min_3_0 = null;

        AntlrDatatypeRuleToken lv_max_5_0 = null;

        EObject lv_forkedquestions_11_0 = null;

        EObject lv_forkedquestions_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1885:28: ( (otherlv_0= 'RankingFork' otherlv_1= ':' (otherlv_2= 'from' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'to' ( (lv_max_5_0= ruleEInt ) ) )? (otherlv_6= 'match' )? (otherlv_7= 'with' )? ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'questions' otherlv_10= '(' ( (lv_forkedquestions_11_0= ruleQuestion ) ) (otherlv_12= ',' ( (lv_forkedquestions_13_0= ruleQuestion ) ) )* otherlv_14= ')' )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1886:1: (otherlv_0= 'RankingFork' otherlv_1= ':' (otherlv_2= 'from' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'to' ( (lv_max_5_0= ruleEInt ) ) )? (otherlv_6= 'match' )? (otherlv_7= 'with' )? ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'questions' otherlv_10= '(' ( (lv_forkedquestions_11_0= ruleQuestion ) ) (otherlv_12= ',' ( (lv_forkedquestions_13_0= ruleQuestion ) ) )* otherlv_14= ')' )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1886:1: (otherlv_0= 'RankingFork' otherlv_1= ':' (otherlv_2= 'from' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'to' ( (lv_max_5_0= ruleEInt ) ) )? (otherlv_6= 'match' )? (otherlv_7= 'with' )? ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'questions' otherlv_10= '(' ( (lv_forkedquestions_11_0= ruleQuestion ) ) (otherlv_12= ',' ( (lv_forkedquestions_13_0= ruleQuestion ) ) )* otherlv_14= ')' )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1886:3: otherlv_0= 'RankingFork' otherlv_1= ':' (otherlv_2= 'from' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'to' ( (lv_max_5_0= ruleEInt ) ) )? (otherlv_6= 'match' )? (otherlv_7= 'with' )? ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'questions' otherlv_10= '(' ( (lv_forkedquestions_11_0= ruleQuestion ) ) (otherlv_12= ',' ( (lv_forkedquestions_13_0= ruleQuestion ) ) )* otherlv_14= ')' )?
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleRankingFork4408); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingForkAccess().getRankingForkKeyword_0());
                
            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRankingFork4420); 

                	newLeafNode(otherlv_1, grammarAccess.getRankingForkAccess().getColonKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1894:1: (otherlv_2= 'from' ( (lv_min_3_0= ruleEInt ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==45) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1894:3: otherlv_2= 'from' ( (lv_min_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleRankingFork4433); 

                        	newLeafNode(otherlv_2, grammarAccess.getRankingForkAccess().getFromKeyword_2_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1898:1: ( (lv_min_3_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1899:1: (lv_min_3_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1899:1: (lv_min_3_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1900:3: lv_min_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingForkAccess().getMinEIntParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingFork4454);
                    lv_min_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingForkRule());
                    	        }
                           		set(
                           			current, 
                           			"min",
                            		lv_min_3_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1916:4: (otherlv_4= 'to' ( (lv_max_5_0= ruleEInt ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==18) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1916:6: otherlv_4= 'to' ( (lv_max_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRankingFork4469); 

                        	newLeafNode(otherlv_4, grammarAccess.getRankingForkAccess().getToKeyword_3_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1920:1: ( (lv_max_5_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1921:1: (lv_max_5_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1921:1: (lv_max_5_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1922:3: lv_max_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingForkAccess().getMaxEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingFork4490);
                    lv_max_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingForkRule());
                    	        }
                           		set(
                           			current, 
                           			"max",
                            		lv_max_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1938:4: (otherlv_6= 'match' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==57) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1938:6: otherlv_6= 'match'
                    {
                    otherlv_6=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleRankingFork4505); 

                        	newLeafNode(otherlv_6, grammarAccess.getRankingForkAccess().getMatchKeyword_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1942:3: (otherlv_7= 'with' )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==20) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1942:5: otherlv_7= 'with'
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRankingFork4520); 

                        	newLeafNode(otherlv_7, grammarAccess.getRankingForkAccess().getWithKeyword_5());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1946:3: ( (otherlv_8= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1947:1: (otherlv_8= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1947:1: (otherlv_8= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1948:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingForkRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRankingFork4542); 

            		newLeafNode(otherlv_8, grammarAccess.getRankingForkAccess().getMatcherChoiceCrossReference_6_0()); 
            	

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1959:2: (otherlv_9= 'questions' otherlv_10= '(' ( (lv_forkedquestions_11_0= ruleQuestion ) ) (otherlv_12= ',' ( (lv_forkedquestions_13_0= ruleQuestion ) ) )* otherlv_14= ')' )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==58) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1959:4: otherlv_9= 'questions' otherlv_10= '(' ( (lv_forkedquestions_11_0= ruleQuestion ) ) (otherlv_12= ',' ( (lv_forkedquestions_13_0= ruleQuestion ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleRankingFork4555); 

                        	newLeafNode(otherlv_9, grammarAccess.getRankingForkAccess().getQuestionsKeyword_7_0());
                        
                    otherlv_10=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRankingFork4567); 

                        	newLeafNode(otherlv_10, grammarAccess.getRankingForkAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1967:1: ( (lv_forkedquestions_11_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1968:1: (lv_forkedquestions_11_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1968:1: (lv_forkedquestions_11_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1969:3: lv_forkedquestions_11_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingForkAccess().getForkedquestionsQuestionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleRankingFork4588);
                    lv_forkedquestions_11_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingForkRule());
                    	        }
                           		add(
                           			current, 
                           			"forkedquestions",
                            		lv_forkedquestions_11_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1985:2: (otherlv_12= ',' ( (lv_forkedquestions_13_0= ruleQuestion ) ) )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==24) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1985:4: otherlv_12= ',' ( (lv_forkedquestions_13_0= ruleQuestion ) )
                    	    {
                    	    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRankingFork4601); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getRankingForkAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1989:1: ( (lv_forkedquestions_13_0= ruleQuestion ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1990:1: (lv_forkedquestions_13_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1990:1: (lv_forkedquestions_13_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1991:3: lv_forkedquestions_13_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingForkAccess().getForkedquestionsQuestionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleRankingFork4622);
                    	    lv_forkedquestions_13_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRankingForkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forkedquestions",
                    	            		lv_forkedquestions_13_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleRankingFork4636); 

                        	newLeafNode(otherlv_14, grammarAccess.getRankingForkAccess().getRightParenthesisKeyword_7_4());
                        

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
    // $ANTLR end "ruleRankingFork"

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
        public static final BitSet FOLLOW_ruleSumConstant_in_ruleQuestion369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStaple_in_ruleQuestion396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSurvey492 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleSurvey509 = new BitSet(new long[]{0x0084810060002002L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey531 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleSurvey544 = new BitSet(new long[]{0x0084810060002000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey565 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString606 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice730 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleMultipleChoice786 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleMultipleChoice798 = new BitSet(new long[]{0x0000000012FFC832L});
        public static final BitSet FOLLOW_14_in_ruleMultipleChoice812 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMultipleChoice826 = new BitSet(new long[]{0x0000000012FF0832L});
        public static final BitSet FOLLOW_16_in_ruleMultipleChoice841 = new BitSet(new long[]{0x0000000012FC0832L});
        public static final BitSet FOLLOW_17_in_ruleMultipleChoice859 = new BitSet(new long[]{0x0000000012FC0832L});
        public static final BitSet FOLLOW_18_in_ruleMultipleChoice875 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_19_in_ruleMultipleChoice890 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice913 = new BitSet(new long[]{0x0000000012F00812L});
        public static final BitSet FOLLOW_20_in_ruleMultipleChoice929 = new BitSet(new long[]{0x0000000000F00010L});
        public static final BitSet FOLLOW_21_in_ruleMultipleChoice944 = new BitSet(new long[]{0x0000000000F00010L});
        public static final BitSet FOLLOW_22_in_ruleMultipleChoice962 = new BitSet(new long[]{0x0000000000F00010L});
        public static final BitSet FOLLOW_23_in_ruleMultipleChoice977 = new BitSet(new long[]{0x0000000000F00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice1000 = new BitSet(new long[]{0x0000000013000802L});
        public static final BitSet FOLLOW_24_in_ruleMultipleChoice1013 = new BitSet(new long[]{0x0000000000F00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice1034 = new BitSet(new long[]{0x0000000013000802L});
        public static final BitSet FOLLOW_25_in_ruleMultipleChoice1051 = new BitSet(new long[]{0x000000000C1C0030L});
        public static final BitSet FOLLOW_20_in_ruleMultipleChoice1064 = new BitSet(new long[]{0x000000000C0C0030L});
        public static final BitSet FOLLOW_26_in_ruleMultipleChoice1079 = new BitSet(new long[]{0x00000000080C0030L});
        public static final BitSet FOLLOW_27_in_ruleMultipleChoice1094 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice1117 = new BitSet(new long[]{0x0000000010000802L});
        public static final BitSet FOLLOW_28_in_ruleMultipleChoice1133 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleMultipleChoice1147 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_ruleMultipleChoiceFork_in_ruleMultipleChoice1168 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleMultipleChoice1181 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_ruleMultipleChoiceFork_in_ruleMultipleChoice1202 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleOpen_in_entryRuleOpen1242 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpen1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleOpen1298 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleOpen1310 = new BitSet(new long[]{0x00000000000FC032L});
        public static final BitSet FOLLOW_14_in_ruleOpen1324 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOpen1338 = new BitSet(new long[]{0x00000000000F0032L});
        public static final BitSet FOLLOW_16_in_ruleOpen1353 = new BitSet(new long[]{0x00000000000C0032L});
        public static final BitSet FOLLOW_17_in_ruleOpen1371 = new BitSet(new long[]{0x00000000000C0032L});
        public static final BitSet FOLLOW_18_in_ruleOpen1387 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_19_in_ruleOpen1402 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpen1425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1463 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRating_Impl1473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleRating_Impl1519 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleRating_Impl1531 = new BitSet(new long[]{0x0800007F900FC072L});
        public static final BitSet FOLLOW_14_in_ruleRating_Impl1545 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRating_Impl1559 = new BitSet(new long[]{0x0800007F900F0072L});
        public static final BitSet FOLLOW_16_in_ruleRating_Impl1574 = new BitSet(new long[]{0x0800007F900C0072L});
        public static final BitSet FOLLOW_17_in_ruleRating_Impl1592 = new BitSet(new long[]{0x0800007F900C0072L});
        public static final BitSet FOLLOW_18_in_ruleRating_Impl1608 = new BitSet(new long[]{0x00000000800C0030L});
        public static final BitSet FOLLOW_31_in_ruleRating_Impl1623 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1646 = new BitSet(new long[]{0x0800007F100C0072L});
        public static final BitSet FOLLOW_32_in_ruleRating_Impl1662 = new BitSet(new long[]{0x0800000100000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1685 = new BitSet(new long[]{0x0800007F100C0072L});
        public static final BitSet FOLLOW_33_in_ruleRating_Impl1701 = new BitSet(new long[]{0x0800000100000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1724 = new BitSet(new long[]{0x0000007E100C0032L});
        public static final BitSet FOLLOW_34_in_ruleRating_Impl1740 = new BitSet(new long[]{0x00000018000C0030L});
        public static final BitSet FOLLOW_35_in_ruleRating_Impl1755 = new BitSet(new long[]{0x00000010000C0030L});
        public static final BitSet FOLLOW_36_in_ruleRating_Impl1770 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1793 = new BitSet(new long[]{0x00000072100C0032L});
        public static final BitSet FOLLOW_33_in_ruleRating_Impl1809 = new BitSet(new long[]{0x00000030000C0030L});
        public static final BitSet FOLLOW_37_in_ruleRating_Impl1824 = new BitSet(new long[]{0x00000010000C0030L});
        public static final BitSet FOLLOW_36_in_ruleRating_Impl1839 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1862 = new BitSet(new long[]{0x0000004010000002L});
        public static final BitSet FOLLOW_28_in_ruleRating_Impl1878 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleRating_Impl1892 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl1913 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_24_in_ruleRating_Impl1926 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl1947 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_39_in_ruleRating_Impl1961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_entryRuleRanking1999 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRanking2009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleRanking2046 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleRanking2058 = new BitSet(new long[]{0x00001E40100E0032L});
        public static final BitSet FOLLOW_17_in_ruleRanking2071 = new BitSet(new long[]{0x00001E40100C0032L});
        public static final BitSet FOLLOW_41_in_ruleRanking2087 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRanking2110 = new BitSet(new long[]{0x00001C4010000002L});
        public static final BitSet FOLLOW_42_in_ruleRanking2126 = new BitSet(new long[]{0x0000180000000000L});
        public static final BitSet FOLLOW_43_in_ruleRanking2141 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleRanking2155 = new BitSet(new long[]{0x0000600000F00010L});
        public static final BitSet FOLLOW_45_in_ruleRanking2168 = new BitSet(new long[]{0x0000400000F00010L});
        public static final BitSet FOLLOW_46_in_ruleRanking2183 = new BitSet(new long[]{0x0000000000F00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2206 = new BitSet(new long[]{0x0000004011000002L});
        public static final BitSet FOLLOW_24_in_ruleRanking2219 = new BitSet(new long[]{0x0000000000F00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2240 = new BitSet(new long[]{0x0000004011000002L});
        public static final BitSet FOLLOW_28_in_ruleRanking2258 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleRanking2272 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_ruleRankingFork_in_ruleRanking2293 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_24_in_ruleRanking2306 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_ruleRankingFork_in_ruleRanking2327 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_39_in_ruleRanking2341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDichotomous_in_entryRuleDichotomous2379 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDichotomous2389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleDichotomous2435 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleDichotomous2447 = new BitSet(new long[]{0x00030000000FC032L});
        public static final BitSet FOLLOW_14_in_ruleDichotomous2461 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDichotomous2475 = new BitSet(new long[]{0x00030000000F0032L});
        public static final BitSet FOLLOW_16_in_ruleDichotomous2490 = new BitSet(new long[]{0x00030000000C0032L});
        public static final BitSet FOLLOW_17_in_ruleDichotomous2508 = new BitSet(new long[]{0x00030000000C0032L});
        public static final BitSet FOLLOW_18_in_ruleDichotomous2524 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_19_in_ruleDichotomous2539 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDichotomous2562 = new BitSet(new long[]{0x0003000000000002L});
        public static final BitSet FOLLOW_48_in_ruleDichotomous2577 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleDichotomous2589 = new BitSet(new long[]{0x0084810060002000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleDichotomous2610 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_24_in_ruleDichotomous2623 = new BitSet(new long[]{0x0084810060002000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleDichotomous2644 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_39_in_ruleDichotomous2658 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_49_in_ruleDichotomous2673 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleDichotomous2685 = new BitSet(new long[]{0x0084810060002000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleDichotomous2706 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_24_in_ruleDichotomous2719 = new BitSet(new long[]{0x0084810060002000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleDichotomous2740 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_39_in_ruleDichotomous2754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumConstant_in_entryRuleSumConstant2792 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSumConstant2802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleSumConstant2848 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleSumConstant2860 = new BitSet(new long[]{0x00780000000FC032L});
        public static final BitSet FOLLOW_14_in_ruleSumConstant2874 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSumConstant2888 = new BitSet(new long[]{0x00780000000F0032L});
        public static final BitSet FOLLOW_16_in_ruleSumConstant2903 = new BitSet(new long[]{0x00780000000C0032L});
        public static final BitSet FOLLOW_17_in_ruleSumConstant2921 = new BitSet(new long[]{0x00780000000C0032L});
        public static final BitSet FOLLOW_18_in_ruleSumConstant2937 = new BitSet(new long[]{0x00780000000C0030L});
        public static final BitSet FOLLOW_51_in_ruleSumConstant2952 = new BitSet(new long[]{0x00700000000C0030L});
        public static final BitSet FOLLOW_52_in_ruleSumConstant2967 = new BitSet(new long[]{0x00600000000C0030L});
        public static final BitSet FOLLOW_18_in_ruleSumConstant2982 = new BitSet(new long[]{0x00600000000C0030L});
        public static final BitSet FOLLOW_53_in_ruleSumConstant2997 = new BitSet(new long[]{0x00400000000C0030L});
        public static final BitSet FOLLOW_54_in_ruleSumConstant3012 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSumConstant3035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStaple_in_entryRuleStaple3073 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStaple3083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleStaple3129 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleStaple3141 = new BitSet(new long[]{0x0900003F910FC072L});
        public static final BitSet FOLLOW_14_in_ruleStaple3155 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleStaple3169 = new BitSet(new long[]{0x0900003F910F0072L});
        public static final BitSet FOLLOW_16_in_ruleStaple3184 = new BitSet(new long[]{0x0900003F910C0072L});
        public static final BitSet FOLLOW_17_in_ruleStaple3202 = new BitSet(new long[]{0x0900003F910C0072L});
        public static final BitSet FOLLOW_18_in_ruleStaple3218 = new BitSet(new long[]{0x00000000800C0030L});
        public static final BitSet FOLLOW_31_in_ruleStaple3233 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3256 = new BitSet(new long[]{0x0900003F110C0072L});
        public static final BitSet FOLLOW_32_in_ruleStaple3272 = new BitSet(new long[]{0x0800000100000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStaple3295 = new BitSet(new long[]{0x0900003F110C0072L});
        public static final BitSet FOLLOW_33_in_ruleStaple3311 = new BitSet(new long[]{0x0800000100000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStaple3334 = new BitSet(new long[]{0x0100003E110C0032L});
        public static final BitSet FOLLOW_34_in_ruleStaple3350 = new BitSet(new long[]{0x00000018010C0030L});
        public static final BitSet FOLLOW_35_in_ruleStaple3365 = new BitSet(new long[]{0x00000010010C0030L});
        public static final BitSet FOLLOW_36_in_ruleStaple3380 = new BitSet(new long[]{0x00000000010C0030L});
        public static final BitSet FOLLOW_24_in_ruleStaple3395 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3418 = new BitSet(new long[]{0x01000032100C0032L});
        public static final BitSet FOLLOW_56_in_ruleStaple3434 = new BitSet(new long[]{0x00000010000C0030L});
        public static final BitSet FOLLOW_36_in_ruleStaple3449 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3472 = new BitSet(new long[]{0x00000032100C0032L});
        public static final BitSet FOLLOW_33_in_ruleStaple3488 = new BitSet(new long[]{0x00000030000C0030L});
        public static final BitSet FOLLOW_37_in_ruleStaple3503 = new BitSet(new long[]{0x00000010000C0030L});
        public static final BitSet FOLLOW_36_in_ruleStaple3518 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3541 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleStaple3556 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3577 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleStaple3590 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3611 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice3651 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoice3661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleChoice3703 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleChoice3720 = new BitSet(new long[]{0x00000000000C0030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoice3741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoiceFork_in_entryRuleMultipleChoiceFork3777 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoiceFork3787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleMultipleChoiceFork3824 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleChoiceFork3844 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_58_in_ruleMultipleChoiceFork3857 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleMultipleChoiceFork3869 = new BitSet(new long[]{0x0084810060002000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleMultipleChoiceFork3890 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_24_in_ruleMultipleChoiceFork3903 = new BitSet(new long[]{0x0084810060002000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleMultipleChoiceFork3924 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_39_in_ruleMultipleChoiceFork3938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3977 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleEInt4027 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_entryRuleRatingFork4089 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRatingFork4099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleRatingFork4145 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleRatingFork4157 = new BitSet(new long[]{0x0400200000040002L});
        public static final BitSet FOLLOW_45_in_ruleRatingFork4170 = new BitSet(new long[]{0x0800000100000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork4191 = new BitSet(new long[]{0x0400000000040002L});
        public static final BitSet FOLLOW_18_in_ruleRatingFork4206 = new BitSet(new long[]{0x0800000100000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork4227 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_58_in_ruleRatingFork4242 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleRatingFork4254 = new BitSet(new long[]{0x0084810060002000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleRatingFork4275 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_24_in_ruleRatingFork4288 = new BitSet(new long[]{0x0084810060002000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleRatingFork4309 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_39_in_ruleRatingFork4323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRankingFork_in_entryRuleRankingFork4361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRankingFork4371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleRankingFork4408 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleRankingFork4420 = new BitSet(new long[]{0x0200200000140010L});
        public static final BitSet FOLLOW_45_in_ruleRankingFork4433 = new BitSet(new long[]{0x0800000100000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingFork4454 = new BitSet(new long[]{0x0200000000140010L});
        public static final BitSet FOLLOW_18_in_ruleRankingFork4469 = new BitSet(new long[]{0x0800000100000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingFork4490 = new BitSet(new long[]{0x0200000000100010L});
        public static final BitSet FOLLOW_57_in_ruleRankingFork4505 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_20_in_ruleRankingFork4520 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRankingFork4542 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_58_in_ruleRankingFork4555 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleRankingFork4567 = new BitSet(new long[]{0x0084810060002000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleRankingFork4588 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_24_in_ruleRankingFork4601 = new BitSet(new long[]{0x0084810060002000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleRankingFork4622 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_39_in_ruleRankingFork4636 = new BitSet(new long[]{0x0000000000000002L});
    }


}