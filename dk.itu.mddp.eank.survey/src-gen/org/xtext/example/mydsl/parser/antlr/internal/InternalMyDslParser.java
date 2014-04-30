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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MultipleChoice'", "':'", "'the'", "'user'", "'may'", "'is'", "'required'", "'to'", "'answer'", "'picking'", "'up to'", "'from'", "'one of'", "'some of'", "'these'", "','", "'or'", "'with'", "'something'", "'else'", "'Open'", "'Rating'", "'rate'", "'between'", "'and'", "'where'", "'lowest'", "'means'", "'highest'", "'Ranking'", "'rank'", "'ConstantSum'", "'distribute'", "'a'", "'total'", "'of'", "'among'", "'Staple'", "'mid'", "'if'", "'then'", "'go'", "'-'", "'it'"
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:1: ruleQuestion returns [EObject current=null] : (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_ConstantSum_4= ruleConstantSum | this_Staple_5= ruleStaple ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_MultipleChoice_0 = null;

        EObject this_Open_1 = null;

        EObject this_Rating_Impl_2 = null;

        EObject this_Ranking_3 = null;

        EObject this_ConstantSum_4 = null;

        EObject this_Staple_5 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:28: ( (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_ConstantSum_4= ruleConstantSum | this_Staple_5= ruleStaple ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_ConstantSum_4= ruleConstantSum | this_Staple_5= ruleStaple )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_ConstantSum_4= ruleConstantSum | this_Staple_5= ruleStaple )
            int alt2=6;
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
            case 48:
                {
                alt2=6;
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:166:5: this_ConstantSum_4= ruleConstantSum
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getConstantSumParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstantSum_in_ruleQuestion342);
                    this_ConstantSum_4=ruleConstantSum();

                    state._fsp--;

                     
                            current = this_ConstantSum_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:176:5: this_Staple_5= ruleStaple
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getStapleParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStaple_in_ruleQuestion369);
                    this_Staple_5=ruleStaple();

                    state._fsp--;

                     
                            current = this_Staple_5; 
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:192:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:193:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:194:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey404);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey414); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:201:1: ruleSurvey returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )? ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_questions_2_0 = null;

        EObject lv_questions_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:204:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:205:1: ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:205:1: ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:205:2: () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:205:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:206:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:211:2: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:213:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey469);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:2: ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11||(LA4_0>=31 && LA4_0<=32)||LA4_0==40||LA4_0==42||LA4_0==48) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:3: ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:3: ( (lv_questions_2_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:230:1: (lv_questions_2_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:230:1: (lv_questions_2_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:231:3: lv_questions_2_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey491);
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

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:247:2: ( (lv_questions_3_0= ruleQuestion ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==11||(LA3_0>=31 && LA3_0<=32)||LA3_0==40||LA3_0==42||LA3_0==48) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:248:1: (lv_questions_3_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:248:1: (lv_questions_3_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:249:3: lv_questions_3_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey512);
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:274:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString552);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString563); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:282:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:285:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:286:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:286:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:286:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString603); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:294:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString629); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:1: entryRuleMultipleChoice returns [EObject current=null] : iv_ruleMultipleChoice= ruleMultipleChoice EOF ;
    public final EObject entryRuleMultipleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoice = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:312:2: (iv_ruleMultipleChoice= ruleMultipleChoice EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:313:2: iv_ruleMultipleChoice= ruleMultipleChoice EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice676);
            iv_ruleMultipleChoice=ruleMultipleChoice();

            state._fsp--;

             current =iv_ruleMultipleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoice686); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:320:1: ruleMultipleChoice returns [EObject current=null] : ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleChoiceFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )* )? ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:323:28: ( ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleChoiceFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:1: ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleChoiceFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:1: ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleChoiceFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:2: () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'one of' | otherlv_17= 'some of' )? (otherlv_18= 'these' )? ( (lv_choice_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )* (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )? ( ( (lv_Fork_27_0= ruleChoiceFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:325:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultipleChoiceAccess().getMultipleChoiceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMultipleChoice732); 

                	newLeafNode(otherlv_1, grammarAccess.getMultipleChoiceAccess().getMultipleChoiceKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:335:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:335:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:336:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultipleChoice749); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultipleChoice766); 

                	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:356:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=13 && LA7_0<=14)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:356:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:356:2: (otherlv_4= 'the' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==13) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:356:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleChoice780); 

                                	newLeafNode(otherlv_4, grammarAccess.getMultipleChoiceAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleChoice794); 

                        	newLeafNode(otherlv_5, grammarAccess.getMultipleChoiceAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultipleChoice809); 

                        	newLeafNode(otherlv_6, grammarAccess.getMultipleChoiceAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:370:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:370:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:371:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultipleChoice834); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getMultipleChoiceAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultipleChoice859); 

                        	newLeafNode(otherlv_8, grammarAccess.getMultipleChoiceAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:388:4: (otherlv_9= 'to' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:388:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultipleChoice875); 

                        	newLeafNode(otherlv_9, grammarAccess.getMultipleChoiceAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:392:3: (otherlv_10= 'answer' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:392:5: otherlv_10= 'answer'
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultipleChoice890); 

                        	newLeafNode(otherlv_10, grammarAccess.getMultipleChoiceAccess().getAnswerKeyword_7());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:3: ( (lv_question_11_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:397:1: (lv_question_11_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:397:1: (lv_question_11_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:3: lv_question_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice913);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:414:2: (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:414:4: otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultipleChoice926); 

                        	newLeafNode(otherlv_12, grammarAccess.getMultipleChoiceAccess().getPickingKeyword_9_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:418:1: (otherlv_13= 'up to' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==21) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:418:3: otherlv_13= 'up to'
                            {
                            otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultipleChoice939); 

                                	newLeafNode(otherlv_13, grammarAccess.getMultipleChoiceAccess().getUpToKeyword_9_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:422:3: ( (lv_answerCount_14_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:423:1: (lv_answerCount_14_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:423:1: (lv_answerCount_14_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:3: lv_answerCount_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getAnswerCountEIntParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultipleChoice962);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:440:4: (otherlv_15= 'from' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:440:6: otherlv_15= 'from'
                    {
                    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMultipleChoice977); 

                        	newLeafNode(otherlv_15, grammarAccess.getMultipleChoiceAccess().getFromKeyword_10());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:444:3: (otherlv_16= 'one of' | otherlv_17= 'some of' )?
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:444:5: otherlv_16= 'one of'
                    {
                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMultipleChoice992); 

                        	newLeafNode(otherlv_16, grammarAccess.getMultipleChoiceAccess().getOneOfKeyword_11_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:449:7: otherlv_17= 'some of'
                    {
                    otherlv_17=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultipleChoice1010); 

                        	newLeafNode(otherlv_17, grammarAccess.getMultipleChoiceAccess().getSomeOfKeyword_11_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:453:3: (otherlv_18= 'these' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:453:5: otherlv_18= 'these'
                    {
                    otherlv_18=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultipleChoice1025); 

                        	newLeafNode(otherlv_18, grammarAccess.getMultipleChoiceAccess().getTheseKeyword_12());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:457:3: ( (lv_choice_19_0= ruleChoice ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:458:1: (lv_choice_19_0= ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:458:1: (lv_choice_19_0= ruleChoice )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:3: lv_choice_19_0= ruleChoice
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_13_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice1048);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:475:2: (otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:475:4: otherlv_20= ',' ( (lv_choice_21_0= ruleChoice ) )
            	    {
            	    otherlv_20=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleChoice1061); 

            	        	newLeafNode(otherlv_20, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_14_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:479:1: ( (lv_choice_21_0= ruleChoice ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:1: (lv_choice_21_0= ruleChoice )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:1: (lv_choice_21_0= ruleChoice )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:481:3: lv_choice_21_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_14_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice1082);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:497:4: (otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:497:6: otherlv_22= 'or' (otherlv_23= 'with' )? (otherlv_24= 'something' )? (otherlv_25= 'else' )? ( (lv_other_26_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultipleChoice1097); 

                        	newLeafNode(otherlv_22, grammarAccess.getMultipleChoiceAccess().getOrKeyword_15_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:501:1: (otherlv_23= 'with' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==28) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:501:3: otherlv_23= 'with'
                            {
                            otherlv_23=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMultipleChoice1110); 

                                	newLeafNode(otherlv_23, grammarAccess.getMultipleChoiceAccess().getWithKeyword_15_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:505:3: (otherlv_24= 'something' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==29) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:505:5: otherlv_24= 'something'
                            {
                            otherlv_24=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMultipleChoice1125); 

                                	newLeafNode(otherlv_24, grammarAccess.getMultipleChoiceAccess().getSomethingKeyword_15_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:3: (otherlv_25= 'else' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==30) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:5: otherlv_25= 'else'
                            {
                            otherlv_25=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMultipleChoice1140); 

                                	newLeafNode(otherlv_25, grammarAccess.getMultipleChoiceAccess().getElseKeyword_15_3());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:513:3: ( (lv_other_26_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:514:1: (lv_other_26_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:514:1: (lv_other_26_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:3: lv_other_26_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getOtherEStringParserRuleCall_15_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice1163);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:531:4: ( ( (lv_Fork_27_0= ruleChoiceFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==50) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:531:5: ( (lv_Fork_27_0= ruleChoiceFork ) ) (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:531:5: ( (lv_Fork_27_0= ruleChoiceFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:532:1: (lv_Fork_27_0= ruleChoiceFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:532:1: (lv_Fork_27_0= ruleChoiceFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:533:3: lv_Fork_27_0= ruleChoiceFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getForkChoiceForkParserRuleCall_16_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1187);
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

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:549:2: (otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==26) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:549:4: otherlv_28= ',' ( (lv_Fork_29_0= ruleChoiceFork ) )
                    	    {
                    	    otherlv_28=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleChoice1200); 

                    	        	newLeafNode(otherlv_28, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_16_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:553:1: ( (lv_Fork_29_0= ruleChoiceFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:554:1: (lv_Fork_29_0= ruleChoiceFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:554:1: (lv_Fork_29_0= ruleChoiceFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:555:3: lv_Fork_29_0= ruleChoiceFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getForkChoiceForkParserRuleCall_16_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1221);
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:579:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:580:2: (iv_ruleOpen= ruleOpen EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:581:2: iv_ruleOpen= ruleOpen EOF
            {
             newCompositeNode(grammarAccess.getOpenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpen_in_entryRuleOpen1261);
            iv_ruleOpen=ruleOpen();

            state._fsp--;

             current =iv_ruleOpen; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpen1271); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:588:1: ruleOpen returns [EObject current=null] : ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:591:28: ( ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:1: ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:1: ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:2: () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:593:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOpenAccess().getOpenAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOpen1317); 

                	newLeafNode(otherlv_1, grammarAccess.getOpenAccess().getOpenKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:604:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOpen1334); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOpen1351); 

                	newLeafNode(otherlv_3, grammarAccess.getOpenAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:624:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=13 && LA24_0<=14)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:624:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:624:2: (otherlv_4= 'the' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==13) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:624:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOpen1365); 

                                	newLeafNode(otherlv_4, grammarAccess.getOpenAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOpen1379); 

                        	newLeafNode(otherlv_5, grammarAccess.getOpenAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:632:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:632:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOpen1394); 

                        	newLeafNode(otherlv_6, grammarAccess.getOpenAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:638:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:638:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:639:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOpen1419); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getOpenAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOpenRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOpen1444); 

                        	newLeafNode(otherlv_8, grammarAccess.getOpenAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:4: (otherlv_9= 'to' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOpen1460); 

                        	newLeafNode(otherlv_9, grammarAccess.getOpenAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:3: (otherlv_10= 'answer' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:5: otherlv_10= 'answer'
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOpen1475); 

                        	newLeafNode(otherlv_10, grammarAccess.getOpenAccess().getAnswerKeyword_7());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:664:3: ( (lv_question_11_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:665:1: (lv_question_11_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:665:1: (lv_question_11_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:666:3: lv_question_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOpenAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpen1498);
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:1: entryRuleRating_Impl returns [EObject current=null] : iv_ruleRating_Impl= ruleRating_Impl EOF ;
    public final EObject entryRuleRating_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating_Impl = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:691:2: (iv_ruleRating_Impl= ruleRating_Impl EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:692:2: iv_ruleRating_Impl= ruleRating_Impl EOF
            {
             newCompositeNode(grammarAccess.getRating_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1534);
            iv_ruleRating_Impl=ruleRating_Impl();

            state._fsp--;

             current =iv_ruleRating_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRating_Impl1544); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:699:1: ruleRating_Impl returns [EObject current=null] : ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? otherlv_22= 'highest' (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* )? ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:28: ( ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? otherlv_22= 'highest' (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:1: ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? otherlv_22= 'highest' (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:1: ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? otherlv_22= 'highest' (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:2: () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? otherlv_22= 'highest' (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:704:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRating_ImplAccess().getRatingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRating_Impl1590); 

                	newLeafNode(otherlv_1, grammarAccess.getRating_ImplAccess().getRatingKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:715:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRating_Impl1607); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRating_Impl1624); 

                	newLeafNode(otherlv_3, grammarAccess.getRating_ImplAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=13 && LA29_0<=14)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:2: (otherlv_4= 'the' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==13) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRating_Impl1638); 

                                	newLeafNode(otherlv_4, grammarAccess.getRating_ImplAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRating_Impl1652); 

                        	newLeafNode(otherlv_5, grammarAccess.getRating_ImplAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:743:3: (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )?
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:743:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRating_Impl1667); 

                        	newLeafNode(otherlv_6, grammarAccess.getRating_ImplAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:748:6: (otherlv_7= 'is' otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:748:6: (otherlv_7= 'is' otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:748:8: otherlv_7= 'is' otherlv_8= 'required'
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRating_Impl1686); 

                        	newLeafNode(otherlv_7, grammarAccess.getRating_ImplAccess().getIsKeyword_5_1_0());
                        
                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRating_Impl1698); 

                        	newLeafNode(otherlv_8, grammarAccess.getRating_ImplAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:756:4: (otherlv_9= 'to' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:756:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRating_Impl1714); 

                        	newLeafNode(otherlv_9, grammarAccess.getRating_ImplAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:760:3: (otherlv_10= 'rate' | otherlv_11= 'answer' )?
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:760:5: otherlv_10= 'rate'
                    {
                    otherlv_10=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRating_Impl1729); 

                        	newLeafNode(otherlv_10, grammarAccess.getRating_ImplAccess().getRateKeyword_7_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:765:7: otherlv_11= 'answer'
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRating_Impl1747); 

                        	newLeafNode(otherlv_11, grammarAccess.getRating_ImplAccess().getAnswerKeyword_7_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:769:3: ( (lv_question_12_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:770:1: (lv_question_12_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:770:1: (lv_question_12_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:771:3: lv_question_12_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1770);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:787:2: (otherlv_13= 'between' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:787:4: otherlv_13= 'between'
                    {
                    otherlv_13=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRating_Impl1783); 

                        	newLeafNode(otherlv_13, grammarAccess.getRating_ImplAccess().getBetweenKeyword_9());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:791:3: ( (lv_Min_14_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:792:1: (lv_Min_14_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:792:1: (lv_Min_14_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:793:3: lv_Min_14_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMinEIntParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1806);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:809:2: (otherlv_15= 'and' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:809:4: otherlv_15= 'and'
                    {
                    otherlv_15=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRating_Impl1819); 

                        	newLeafNode(otherlv_15, grammarAccess.getRating_ImplAccess().getAndKeyword_11());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:813:3: ( (lv_Max_16_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:814:1: (lv_Max_16_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:814:1: (lv_Max_16_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:815:3: lv_Max_16_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMaxEIntParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1842);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:831:2: (otherlv_17= 'where' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:831:4: otherlv_17= 'where'
                    {
                    otherlv_17=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRating_Impl1855); 

                        	newLeafNode(otherlv_17, grammarAccess.getRating_ImplAccess().getWhereKeyword_13());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleRating_Impl1869); 

                	newLeafNode(otherlv_18, grammarAccess.getRating_ImplAccess().getLowestKeyword_14());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:839:1: (otherlv_19= 'means' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:839:3: otherlv_19= 'means'
                    {
                    otherlv_19=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRating_Impl1882); 

                        	newLeafNode(otherlv_19, grammarAccess.getRating_ImplAccess().getMeansKeyword_15());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:843:3: ( (lv_first_20_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:844:1: (lv_first_20_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:844:1: (lv_first_20_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:845:3: lv_first_20_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getFirstEStringParserRuleCall_16_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1905);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:861:2: (otherlv_21= 'and' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:861:4: otherlv_21= 'and'
                    {
                    otherlv_21=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRating_Impl1918); 

                        	newLeafNode(otherlv_21, grammarAccess.getRating_ImplAccess().getAndKeyword_17());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleRating_Impl1932); 

                	newLeafNode(otherlv_22, grammarAccess.getRating_ImplAccess().getHighestKeyword_18());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:869:1: (otherlv_23= 'means' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:869:3: otherlv_23= 'means'
                    {
                    otherlv_23=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRating_Impl1945); 

                        	newLeafNode(otherlv_23, grammarAccess.getRating_ImplAccess().getMeansKeyword_19());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:3: ( (lv_last_24_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:874:1: (lv_last_24_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:874:1: (lv_last_24_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:875:3: lv_last_24_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getLastEStringParserRuleCall_20_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1968);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:891:2: ( ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:891:3: ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:891:3: ( (lv_Fork_25_0= ruleRatingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:892:1: (lv_Fork_25_0= ruleRatingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:892:1: (lv_Fork_25_0= ruleRatingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:893:3: lv_Fork_25_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getForkRatingForkParserRuleCall_21_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl1990);
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

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:909:2: (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==26) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:909:4: otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) )
                    	    {
                    	    otherlv_26=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRating_Impl2003); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getRating_ImplAccess().getCommaKeyword_21_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:913:1: ( (lv_Fork_27_0= ruleRatingFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:914:1: (lv_Fork_27_0= ruleRatingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:914:1: (lv_Fork_27_0= ruleRatingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:915:3: lv_Fork_27_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getForkRatingForkParserRuleCall_21_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl2024);
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:939:1: entryRuleRanking returns [EObject current=null] : iv_ruleRanking= ruleRanking EOF ;
    public final EObject entryRuleRanking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRanking = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:940:2: (iv_ruleRanking= ruleRanking EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:941:2: iv_ruleRanking= ruleRanking EOF
            {
             newCompositeNode(grammarAccess.getRankingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRanking_in_entryRuleRanking2064);
            iv_ruleRanking=ruleRanking();

            state._fsp--;

             current =iv_ruleRanking; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRanking2074); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:948:1: ruleRanking returns [EObject current=null] : (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_Fork_19_0= ruleRankingSumFork ) ) (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )* )? ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:951:28: ( (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_Fork_19_0= ruleRankingSumFork ) ) (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:952:1: (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_Fork_19_0= ruleRankingSumFork ) ) (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:952:1: (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_Fork_19_0= ruleRankingSumFork ) ) (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:952:3: otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_Fork_19_0= ruleRankingSumFork ) ) (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )* )?
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRanking2111); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingAccess().getRankingKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:956:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:957:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:957:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:958:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRanking2128); 

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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRanking2145); 

                	newLeafNode(otherlv_2, grammarAccess.getRankingAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:978:1: ( (otherlv_3= 'the' )? otherlv_4= 'user' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=13 && LA42_0<=14)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:978:2: (otherlv_3= 'the' )? otherlv_4= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:978:2: (otherlv_3= 'the' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==13) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:978:4: otherlv_3= 'the'
                            {
                            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRanking2159); 

                                	newLeafNode(otherlv_3, grammarAccess.getRankingAccess().getTheKeyword_3_0());
                                

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRanking2173); 

                        	newLeafNode(otherlv_4, grammarAccess.getRankingAccess().getUserKeyword_3_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:986:3: (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )?
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:986:5: otherlv_5= 'may'
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRanking2188); 

                        	newLeafNode(otherlv_5, grammarAccess.getRankingAccess().getMayKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:991:6: ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:991:6: ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:991:7: ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:991:7: ( (lv_isRequired_6_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:1: (lv_isRequired_6_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:1: (lv_isRequired_6_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:993:3: lv_isRequired_6_0= 'is'
                    {
                    lv_isRequired_6_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRanking2213); 

                            newLeafNode(lv_isRequired_6_0, grammarAccess.getRankingAccess().getIsRequiredIsKeyword_4_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRankingRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRanking2238); 

                        	newLeafNode(otherlv_7, grammarAccess.getRankingAccess().getRequiredKeyword_4_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1010:4: (otherlv_8= 'to' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==18) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1010:6: otherlv_8= 'to'
                    {
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRanking2254); 

                        	newLeafNode(otherlv_8, grammarAccess.getRankingAccess().getToKeyword_5());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1014:3: (otherlv_9= 'rank' | otherlv_10= 'answer' )?
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1014:5: otherlv_9= 'rank'
                    {
                    otherlv_9=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRanking2269); 

                        	newLeafNode(otherlv_9, grammarAccess.getRankingAccess().getRankKeyword_6_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1019:7: otherlv_10= 'answer'
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRanking2287); 

                        	newLeafNode(otherlv_10, grammarAccess.getRankingAccess().getAnswerKeyword_6_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1023:3: ( (lv_question_11_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1024:1: (lv_question_11_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1024:1: (lv_question_11_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1025:3: lv_question_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRankingAccess().getQuestionEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRanking2310);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:2: (otherlv_12= 'from' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==22) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:4: otherlv_12= 'from'
                    {
                    otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRanking2323); 

                        	newLeafNode(otherlv_12, grammarAccess.getRankingAccess().getFromKeyword_8());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1045:3: (otherlv_13= 'one of' | otherlv_14= 'some of' )?
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1045:5: otherlv_13= 'one of'
                    {
                    otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRanking2338); 

                        	newLeafNode(otherlv_13, grammarAccess.getRankingAccess().getOneOfKeyword_9_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1050:7: otherlv_14= 'some of'
                    {
                    otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRanking2356); 

                        	newLeafNode(otherlv_14, grammarAccess.getRankingAccess().getSomeOfKeyword_9_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1054:3: (otherlv_15= 'these' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==25) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1054:5: otherlv_15= 'these'
                    {
                    otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRanking2371); 

                        	newLeafNode(otherlv_15, grammarAccess.getRankingAccess().getTheseKeyword_10());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1058:3: ( (lv_choices_16_0= ruleChoice ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1059:1: (lv_choices_16_0= ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1059:1: (lv_choices_16_0= ruleChoice )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1060:3: lv_choices_16_0= ruleChoice
            {
             
            	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2394);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1076:2: (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==26) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1076:4: otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) )
            	    {
            	    otherlv_17=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRanking2407); 

            	        	newLeafNode(otherlv_17, grammarAccess.getRankingAccess().getCommaKeyword_12_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1080:1: ( (lv_choices_18_0= ruleChoice ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1081:1: (lv_choices_18_0= ruleChoice )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1081:1: (lv_choices_18_0= ruleChoice )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1082:3: lv_choices_18_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_12_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2428);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1098:4: ( ( (lv_Fork_19_0= ruleRankingSumFork ) ) (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1098:5: ( (lv_Fork_19_0= ruleRankingSumFork ) ) (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1098:5: ( (lv_Fork_19_0= ruleRankingSumFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1099:1: (lv_Fork_19_0= ruleRankingSumFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1099:1: (lv_Fork_19_0= ruleRankingSumFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1100:3: lv_Fork_19_0= ruleRankingSumFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getForkRankingSumForkParserRuleCall_13_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleRanking2452);
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

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1116:2: (otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==26) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1116:4: otherlv_20= ',' ( (lv_Fork_21_0= ruleRankingSumFork ) )
                    	    {
                    	    otherlv_20=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRanking2465); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getRankingAccess().getCommaKeyword_13_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:1: ( (lv_Fork_21_0= ruleRankingSumFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:1: (lv_Fork_21_0= ruleRankingSumFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:1: (lv_Fork_21_0= ruleRankingSumFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1122:3: lv_Fork_21_0= ruleRankingSumFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingAccess().getForkRankingSumForkParserRuleCall_13_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleRanking2486);
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


    // $ANTLR start "entryRuleConstantSum"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1146:1: entryRuleConstantSum returns [EObject current=null] : iv_ruleConstantSum= ruleConstantSum EOF ;
    public final EObject entryRuleConstantSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSum = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1147:2: (iv_ruleConstantSum= ruleConstantSum EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:2: iv_ruleConstantSum= ruleConstantSum EOF
            {
             newCompositeNode(grammarAccess.getConstantSumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantSum_in_entryRuleConstantSum2526);
            iv_ruleConstantSum=ruleConstantSum();

            state._fsp--;

             current =iv_ruleConstantSum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantSum2536); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1155:1: ruleConstantSum returns [EObject current=null] : ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_Constant_17_0= ruleEInt ) ) )? otherlv_18= 'among' otherlv_19= 'these' ( (lv_Choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_Choices_22_0= ruleChoice ) ) )* ( ( (lv_Fork_23_0= ruleRankingSumFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )* )? ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1158:28: ( ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_Constant_17_0= ruleEInt ) ) )? otherlv_18= 'among' otherlv_19= 'these' ( (lv_Choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_Choices_22_0= ruleChoice ) ) )* ( ( (lv_Fork_23_0= ruleRankingSumFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1159:1: ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_Constant_17_0= ruleEInt ) ) )? otherlv_18= 'among' otherlv_19= 'these' ( (lv_Choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_Choices_22_0= ruleChoice ) ) )* ( ( (lv_Fork_23_0= ruleRankingSumFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1159:1: ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_Constant_17_0= ruleEInt ) ) )? otherlv_18= 'among' otherlv_19= 'these' ( (lv_Choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_Choices_22_0= ruleChoice ) ) )* ( ( (lv_Fork_23_0= ruleRankingSumFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1159:2: () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_Constant_17_0= ruleEInt ) ) )? otherlv_18= 'among' otherlv_19= 'these' ( (lv_Choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_Choices_22_0= ruleChoice ) ) )* ( ( (lv_Fork_23_0= ruleRankingSumFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1159:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1160:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstantSumAccess().getConstantSumAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleConstantSum2582); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantSumAccess().getConstantSumKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1169:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantSum2599); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConstantSum2616); 

                	newLeafNode(otherlv_3, grammarAccess.getConstantSumAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=13 && LA53_0<=14)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:2: (otherlv_4= 'the' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==13) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstantSum2630); 

                                	newLeafNode(otherlv_4, grammarAccess.getConstantSumAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConstantSum2644); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstantSumAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1199:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1199:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConstantSum2659); 

                        	newLeafNode(otherlv_6, grammarAccess.getConstantSumAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1204:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1204:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1204:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1204:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1205:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1205:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1206:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConstantSum2684); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getConstantSumAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantSumRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConstantSum2709); 

                        	newLeafNode(otherlv_8, grammarAccess.getConstantSumAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1223:4: (otherlv_9= 'to' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==18) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1223:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstantSum2725); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstantSumAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1227:3: (otherlv_10= 'distribute' | otherlv_11= 'answer' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==43) ) {
                alt56=1;
            }
            else if ( (LA56_0==19) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1227:5: otherlv_10= 'distribute'
                    {
                    otherlv_10=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleConstantSum2740); 

                        	newLeafNode(otherlv_10, grammarAccess.getConstantSumAccess().getDistributeKeyword_7_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1232:7: otherlv_11= 'answer'
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConstantSum2758); 

                        	newLeafNode(otherlv_11, grammarAccess.getConstantSumAccess().getAnswerKeyword_7_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1236:2: ( (lv_question_12_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1237:1: (lv_question_12_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1237:1: (lv_question_12_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1238:3: lv_question_12_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConstantSumAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstantSum2780);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1254:2: ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_Constant_17_0= ruleEInt ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==18||(LA60_0>=44 && LA60_0<=45)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1254:3: ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_Constant_17_0= ruleEInt ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1254:3: ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1254:4: (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )?
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1254:4: (otherlv_13= 'to' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==18) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1254:6: otherlv_13= 'to'
                            {
                            otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstantSum2795); 

                                	newLeafNode(otherlv_13, grammarAccess.getConstantSumAccess().getToKeyword_9_0_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1258:3: (otherlv_14= 'a' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==44) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1258:5: otherlv_14= 'a'
                            {
                            otherlv_14=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleConstantSum2810); 

                                	newLeafNode(otherlv_14, grammarAccess.getConstantSumAccess().getAKeyword_9_0_1());
                                

                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleConstantSum2824); 

                        	newLeafNode(otherlv_15, grammarAccess.getConstantSumAccess().getTotalKeyword_9_0_2());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1266:1: (otherlv_16= 'of' )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==46) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1266:3: otherlv_16= 'of'
                            {
                            otherlv_16=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleConstantSum2837); 

                                	newLeafNode(otherlv_16, grammarAccess.getConstantSumAccess().getOfKeyword_9_0_3());
                                

                            }
                            break;

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1270:4: ( (lv_Constant_17_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1271:1: (lv_Constant_17_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1271:1: (lv_Constant_17_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1272:3: lv_Constant_17_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantSumAccess().getConstantEIntParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleConstantSum2861);
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

            otherlv_18=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleConstantSum2875); 

                	newLeafNode(otherlv_18, grammarAccess.getConstantSumAccess().getAmongKeyword_10());
                
            otherlv_19=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleConstantSum2887); 

                	newLeafNode(otherlv_19, grammarAccess.getConstantSumAccess().getTheseKeyword_11());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1296:1: ( (lv_Choices_20_0= ruleChoice ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1297:1: (lv_Choices_20_0= ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1297:1: (lv_Choices_20_0= ruleChoice )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1298:3: lv_Choices_20_0= ruleChoice
            {
             
            	        newCompositeNode(grammarAccess.getConstantSumAccess().getChoicesChoiceParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleConstantSum2908);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:2: (otherlv_21= ',' ( (lv_Choices_22_0= ruleChoice ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==26) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:4: otherlv_21= ',' ( (lv_Choices_22_0= ruleChoice ) )
            	    {
            	    otherlv_21=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleConstantSum2921); 

            	        	newLeafNode(otherlv_21, grammarAccess.getConstantSumAccess().getCommaKeyword_13_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1318:1: ( (lv_Choices_22_0= ruleChoice ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1319:1: (lv_Choices_22_0= ruleChoice )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1319:1: (lv_Choices_22_0= ruleChoice )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1320:3: lv_Choices_22_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstantSumAccess().getChoicesChoiceParserRuleCall_13_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleConstantSum2942);
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
            	    break loop61;
                }
            } while (true);

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1336:4: ( ( (lv_Fork_23_0= ruleRankingSumFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==50) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1336:5: ( (lv_Fork_23_0= ruleRankingSumFork ) ) (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1336:5: ( (lv_Fork_23_0= ruleRankingSumFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1337:1: (lv_Fork_23_0= ruleRankingSumFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1337:1: (lv_Fork_23_0= ruleRankingSumFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1338:3: lv_Fork_23_0= ruleRankingSumFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantSumAccess().getForkRankingSumForkParserRuleCall_14_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleConstantSum2966);
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

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1354:2: (otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==26) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1354:4: otherlv_24= ',' ( (lv_Fork_25_0= ruleRankingSumFork ) )
                    	    {
                    	    otherlv_24=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleConstantSum2979); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getConstantSumAccess().getCommaKeyword_14_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1358:1: ( (lv_Fork_25_0= ruleRankingSumFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:1: (lv_Fork_25_0= ruleRankingSumFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:1: (lv_Fork_25_0= ruleRankingSumFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1360:3: lv_Fork_25_0= ruleRankingSumFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantSumAccess().getForkRankingSumForkParserRuleCall_14_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleConstantSum3000);
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
                    	    break loop62;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1384:1: entryRuleStaple returns [EObject current=null] : iv_ruleStaple= ruleStaple EOF ;
    public final EObject entryRuleStaple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaple = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:2: (iv_ruleStaple= ruleStaple EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1386:2: iv_ruleStaple= ruleStaple EOF
            {
             newCompositeNode(grammarAccess.getStapleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStaple_in_entryRuleStaple3040);
            iv_ruleStaple=ruleStaple();

            state._fsp--;

             current =iv_ruleStaple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStaple3050); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1393:1: ruleStaple returns [EObject current=null] : ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? otherlv_22= 'mid' (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? otherlv_26= 'highest' (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* )? ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1396:28: ( ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? otherlv_22= 'mid' (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? otherlv_26= 'highest' (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1397:1: ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? otherlv_22= 'mid' (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? otherlv_26= 'highest' (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1397:1: ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? otherlv_22= 'mid' (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? otherlv_26= 'highest' (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1397:2: () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_Min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_Max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? otherlv_18= 'lowest' (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? otherlv_22= 'mid' (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? otherlv_26= 'highest' (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1397:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1398:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStapleAccess().getStapleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleStaple3096); 

                	newLeafNode(otherlv_1, grammarAccess.getStapleAccess().getStapleKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1407:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1408:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1408:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1409:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStaple3113); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStaple3130); 

                	newLeafNode(otherlv_3, grammarAccess.getStapleAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1429:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=13 && LA65_0<=14)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1429:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1429:2: (otherlv_4= 'the' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==13) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1429:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStaple3144); 

                                	newLeafNode(otherlv_4, grammarAccess.getStapleAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStaple3158); 

                        	newLeafNode(otherlv_5, grammarAccess.getStapleAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1437:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
            int alt66=3;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==15) ) {
                alt66=1;
            }
            else if ( (LA66_0==16) ) {
                alt66=2;
            }
            switch (alt66) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1437:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStaple3173); 

                        	newLeafNode(otherlv_6, grammarAccess.getStapleAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1443:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1443:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1444:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStaple3198); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getStapleAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStapleRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStaple3223); 

                        	newLeafNode(otherlv_8, grammarAccess.getStapleAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1461:4: (otherlv_9= 'to' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==18) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1461:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStaple3239); 

                        	newLeafNode(otherlv_9, grammarAccess.getStapleAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1465:3: (otherlv_10= 'rate' | otherlv_11= 'answer' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==33) ) {
                alt68=1;
            }
            else if ( (LA68_0==19) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1465:5: otherlv_10= 'rate'
                    {
                    otherlv_10=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStaple3254); 

                        	newLeafNode(otherlv_10, grammarAccess.getStapleAccess().getRateKeyword_7_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1470:7: otherlv_11= 'answer'
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStaple3272); 

                        	newLeafNode(otherlv_11, grammarAccess.getStapleAccess().getAnswerKeyword_7_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1474:2: ( (lv_question_12_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1475:1: (lv_question_12_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1475:1: (lv_question_12_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1476:3: lv_question_12_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3294);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1492:2: (otherlv_13= 'between' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==34) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1492:4: otherlv_13= 'between'
                    {
                    otherlv_13=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStaple3307); 

                        	newLeafNode(otherlv_13, grammarAccess.getStapleAccess().getBetweenKeyword_9());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1496:3: ( (lv_Min_14_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1497:1: (lv_Min_14_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1497:1: (lv_Min_14_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1498:3: lv_Min_14_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getMinEIntParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStaple3330);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1514:2: (otherlv_15= 'and' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==35) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1514:4: otherlv_15= 'and'
                    {
                    otherlv_15=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStaple3343); 

                        	newLeafNode(otherlv_15, grammarAccess.getStapleAccess().getAndKeyword_11());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:3: ( (lv_Max_16_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1519:1: (lv_Max_16_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1519:1: (lv_Max_16_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1520:3: lv_Max_16_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getMaxEIntParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStaple3366);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1536:2: (otherlv_17= 'where' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==36) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1536:4: otherlv_17= 'where'
                    {
                    otherlv_17=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStaple3379); 

                        	newLeafNode(otherlv_17, grammarAccess.getStapleAccess().getWhereKeyword_13());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStaple3393); 

                	newLeafNode(otherlv_18, grammarAccess.getStapleAccess().getLowestKeyword_14());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1544:1: (otherlv_19= 'means' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==38) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1544:3: otherlv_19= 'means'
                    {
                    otherlv_19=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleStaple3406); 

                        	newLeafNode(otherlv_19, grammarAccess.getStapleAccess().getMeansKeyword_15());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1548:3: ( (lv_first_20_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1549:1: (lv_first_20_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1549:1: (lv_first_20_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1550:3: lv_first_20_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getFirstEStringParserRuleCall_16_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3429);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1566:2: (otherlv_21= ',' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==26) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1566:4: otherlv_21= ','
                    {
                    otherlv_21=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleStaple3442); 

                        	newLeafNode(otherlv_21, grammarAccess.getStapleAccess().getCommaKeyword_17());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleStaple3456); 

                	newLeafNode(otherlv_22, grammarAccess.getStapleAccess().getMidKeyword_18());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1574:1: (otherlv_23= 'means' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==38) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1574:3: otherlv_23= 'means'
                    {
                    otherlv_23=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleStaple3469); 

                        	newLeafNode(otherlv_23, grammarAccess.getStapleAccess().getMeansKeyword_19());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1578:3: ( (lv_mid_24_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1579:1: (lv_mid_24_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1579:1: (lv_mid_24_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1580:3: lv_mid_24_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getMidEStringParserRuleCall_20_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3492);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:2: (otherlv_25= 'and' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==35) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:4: otherlv_25= 'and'
                    {
                    otherlv_25=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStaple3505); 

                        	newLeafNode(otherlv_25, grammarAccess.getStapleAccess().getAndKeyword_21());
                        

                    }
                    break;

            }

            otherlv_26=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleStaple3519); 

                	newLeafNode(otherlv_26, grammarAccess.getStapleAccess().getHighestKeyword_22());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1604:1: (otherlv_27= 'means' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==38) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1604:3: otherlv_27= 'means'
                    {
                    otherlv_27=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleStaple3532); 

                        	newLeafNode(otherlv_27, grammarAccess.getStapleAccess().getMeansKeyword_23());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1608:3: ( (lv_last_28_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1609:1: (lv_last_28_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1609:1: (lv_last_28_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1610:3: lv_last_28_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getLastEStringParserRuleCall_24_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3555);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1626:2: ( ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==50) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1626:3: ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1626:3: ( (lv_Fork_29_0= ruleRatingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1627:1: (lv_Fork_29_0= ruleRatingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1627:1: (lv_Fork_29_0= ruleRatingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1628:3: lv_Fork_29_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getForkRatingForkParserRuleCall_25_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3577);
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

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1644:2: (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==26) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1644:4: otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) )
                    	    {
                    	    otherlv_30=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleStaple3590); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getStapleAccess().getCommaKeyword_25_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1648:1: ( (lv_Fork_31_0= ruleRatingFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1649:1: (lv_Fork_31_0= ruleRatingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1649:1: (lv_Fork_31_0= ruleRatingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1650:3: lv_Fork_31_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStapleAccess().getForkRatingForkParserRuleCall_25_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3611);
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
                    	    break loop77;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1674:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1675:2: (iv_ruleChoice= ruleChoice EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1676:2: iv_ruleChoice= ruleChoice EOF
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1683:1: ruleChoice returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_Description_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1686:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1687:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1687:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1687:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1687:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1688:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1688:1: (lv_name_0_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1689:3: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleChoice3720); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getColonKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1709:1: ( (lv_Description_2_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1710:1: (lv_Description_2_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1710:1: (lv_Description_2_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1711:3: lv_Description_2_0= ruleEString
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


    // $ANTLR start "entryRuleChoiceFork"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1735:1: entryRuleChoiceFork returns [EObject current=null] : iv_ruleChoiceFork= ruleChoiceFork EOF ;
    public final EObject entryRuleChoiceFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1736:2: (iv_ruleChoiceFork= ruleChoiceFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1737:2: iv_ruleChoiceFork= ruleChoiceFork EOF
            {
             newCompositeNode(grammarAccess.getChoiceForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_entryRuleChoiceFork3777);
            iv_ruleChoiceFork=ruleChoiceFork();

            state._fsp--;

             current =iv_ruleChoiceFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceFork3787); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1744:1: ruleChoiceFork returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1747:28: ( (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1748:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1748:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1748:3: otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleChoiceFork3824); 

                	newLeafNode(otherlv_0, grammarAccess.getChoiceForkAccess().getIfKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1752:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1753:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1753:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1754:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getChoiceForkAccess().getOnChoiceCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork3847);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1767:2: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==26) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1767:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleChoiceFork3860); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChoiceForkAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1771:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1772:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1772:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1773:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceForkAccess().getOnChoiceCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork3883);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1786:4: (otherlv_4= 'then' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==51) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1786:6: otherlv_4= 'then'
                    {
                    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleChoiceFork3898); 

                        	newLeafNode(otherlv_4, grammarAccess.getChoiceForkAccess().getThenKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleChoiceFork3912); 

                	newLeafNode(otherlv_5, grammarAccess.getChoiceForkAccess().getGoKeyword_4());
                
            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleChoiceFork3924); 

                	newLeafNode(otherlv_6, grammarAccess.getChoiceForkAccess().getToKeyword_5());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1798:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1799:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1799:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1800:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getChoiceForkAccess().getQuestionsQuestionCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork3947);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1813:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==26) ) {
                    int LA81_1 = input.LA(2);

                    if ( ((LA81_1>=RULE_STRING && LA81_1<=RULE_ID)) ) {
                        alt81=1;
                    }


                }


                switch (alt81) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1813:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleChoiceFork3960); 

            	        	newLeafNode(otherlv_8, grammarAccess.getChoiceForkAccess().getCommaKeyword_7_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1817:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1818:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1818:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1819:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceForkAccess().getQuestionsQuestionCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork3983);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1840:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1841:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1842:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4022);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4033); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1849:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1852:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1853:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1853:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1853:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1853:2: (kw= '-' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==53) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1854:2: kw= '-'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleEInt4072); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4089); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1874:1: entryRuleRatingFork returns [EObject current=null] : iv_ruleRatingFork= ruleRatingFork EOF ;
    public final EObject entryRuleRatingFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatingFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1875:2: (iv_ruleRatingFork= ruleRatingFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1876:2: iv_ruleRatingFork= ruleRatingFork EOF
            {
             newCompositeNode(grammarAccess.getRatingForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_entryRuleRatingFork4134);
            iv_ruleRatingFork=ruleRatingFork();

            state._fsp--;

             current =iv_ruleRatingFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRatingFork4144); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:1: ruleRatingFork returns [EObject current=null] : (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_Min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_Max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1886:28: ( (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_Min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_Max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1887:1: (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_Min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_Max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1887:1: (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_Min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_Max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1887:3: otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_Min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_Max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleRatingFork4181); 

                	newLeafNode(otherlv_0, grammarAccess.getRatingForkAccess().getIfKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1891:1: (otherlv_1= 'it' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==54) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1891:3: otherlv_1= 'it'
                    {
                    otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleRatingFork4194); 

                        	newLeafNode(otherlv_1, grammarAccess.getRatingForkAccess().getItKeyword_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1895:3: (otherlv_2= 'is' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==16) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1895:5: otherlv_2= 'is'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRatingFork4209); 

                        	newLeafNode(otherlv_2, grammarAccess.getRatingForkAccess().getIsKeyword_2());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRatingFork4223); 

                	newLeafNode(otherlv_3, grammarAccess.getRatingForkAccess().getBetweenKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1903:1: ( (lv_Min_4_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1904:1: (lv_Min_4_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1904:1: (lv_Min_4_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1905:3: lv_Min_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getMinEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork4244);
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

            otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRatingFork4256); 

                	newLeafNode(otherlv_5, grammarAccess.getRatingForkAccess().getAndKeyword_5());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1925:1: ( (lv_Max_6_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1926:1: (lv_Max_6_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1926:1: (lv_Max_6_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1927:3: lv_Max_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getMaxEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork4277);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1943:2: (otherlv_7= 'then' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==51) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1943:4: otherlv_7= 'then'
                    {
                    otherlv_7=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleRatingFork4290); 

                        	newLeafNode(otherlv_7, grammarAccess.getRatingForkAccess().getThenKeyword_7());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleRatingFork4304); 

                	newLeafNode(otherlv_8, grammarAccess.getRatingForkAccess().getGoKeyword_8());
                
            otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRatingFork4316); 

                	newLeafNode(otherlv_9, grammarAccess.getRatingForkAccess().getToKeyword_9());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1955:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1956:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1956:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1957:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRatingForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getQuestionsQuestionCrossReference_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRatingFork4339);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1970:2: (otherlv_11= ',' ( ( ruleEString ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==26) ) {
                    int LA86_1 = input.LA(2);

                    if ( ((LA86_1>=RULE_STRING && LA86_1<=RULE_ID)) ) {
                        alt86=1;
                    }


                }


                switch (alt86) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1970:4: otherlv_11= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRatingFork4352); 

            	        	newLeafNode(otherlv_11, grammarAccess.getRatingForkAccess().getCommaKeyword_11_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1974:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1975:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1975:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1976:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRatingForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRatingForkAccess().getQuestionsQuestionCrossReference_11_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRatingFork4375);
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1997:1: entryRuleRankingSumFork returns [EObject current=null] : iv_ruleRankingSumFork= ruleRankingSumFork EOF ;
    public final EObject entryRuleRankingSumFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRankingSumFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1998:2: (iv_ruleRankingSumFork= ruleRankingSumFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1999:2: iv_ruleRankingSumFork= ruleRankingSumFork EOF
            {
             newCompositeNode(grammarAccess.getRankingSumForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_entryRuleRankingSumFork4413);
            iv_ruleRankingSumFork=ruleRankingSumFork();

            state._fsp--;

             current =iv_ruleRankingSumFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRankingSumFork4423); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2006:1: ruleRankingSumFork returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2009:28: ( (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2010:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2010:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2010:3: otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_Min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_Max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleRankingSumFork4460); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingSumForkAccess().getIfKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2014:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2015:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2015:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2016:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getOnChoiceCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4483);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2029:2: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==26) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2029:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRankingSumFork4496); 

            	        	newLeafNode(otherlv_2, grammarAccess.getRankingSumForkAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2033:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2034:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2034:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2035:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getOnChoiceCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4519);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRankingSumFork4533); 

                	newLeafNode(otherlv_4, grammarAccess.getRankingSumForkAccess().getIsKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2052:1: (otherlv_5= 'between' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==34) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2052:3: otherlv_5= 'between'
                    {
                    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRankingSumFork4546); 

                        	newLeafNode(otherlv_5, grammarAccess.getRankingSumForkAccess().getBetweenKeyword_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2056:3: ( (lv_Min_6_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2057:1: (lv_Min_6_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2057:1: (lv_Min_6_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2058:3: lv_Min_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getMinEIntParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingSumFork4569);
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

            otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRankingSumFork4581); 

                	newLeafNode(otherlv_7, grammarAccess.getRankingSumForkAccess().getAndKeyword_6());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2078:1: ( (lv_Max_8_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2079:1: (lv_Max_8_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2079:1: (lv_Max_8_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2080:3: lv_Max_8_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getMaxEIntParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingSumFork4602);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2096:2: (otherlv_9= 'then' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==51) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2096:4: otherlv_9= 'then'
                    {
                    otherlv_9=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleRankingSumFork4615); 

                        	newLeafNode(otherlv_9, grammarAccess.getRankingSumForkAccess().getThenKeyword_8());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleRankingSumFork4629); 

                	newLeafNode(otherlv_10, grammarAccess.getRankingSumForkAccess().getGoKeyword_9());
                
            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRankingSumFork4641); 

                	newLeafNode(otherlv_11, grammarAccess.getRankingSumForkAccess().getToKeyword_10());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2108:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2109:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2109:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2110:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getQuestionsQuestionCrossReference_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4664);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2123:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==26) ) {
                    int LA90_1 = input.LA(2);

                    if ( ((LA90_1>=RULE_STRING && LA90_1<=RULE_ID)) ) {
                        alt90=1;
                    }


                }


                switch (alt90) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2123:4: otherlv_13= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRankingSumFork4677); 

            	        	newLeafNode(otherlv_13, grammarAccess.getRankingSumForkAccess().getCommaKeyword_12_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2127:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2128:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2128:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2129:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getQuestionsQuestionCrossReference_12_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4700);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
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
        public static final BitSet FOLLOW_ruleConstantSum_in_ruleQuestion342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStaple_in_ruleQuestion369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey404 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey469 = new BitSet(new long[]{0x0001050180000802L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey491 = new BitSet(new long[]{0x0001050180000802L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey512 = new BitSet(new long[]{0x0001050180000802L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString552 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice676 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMultipleChoice732 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleChoice749 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMultipleChoice766 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_13_in_ruleMultipleChoice780 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleChoice794 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_15_in_ruleMultipleChoice809 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_16_in_ruleMultipleChoice834 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMultipleChoice859 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_18_in_ruleMultipleChoice875 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleMultipleChoice890 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice913 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_20_in_ruleMultipleChoice926 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_21_in_ruleMultipleChoice939 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultipleChoice962 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_22_in_ruleMultipleChoice977 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_23_in_ruleMultipleChoice992 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_24_in_ruleMultipleChoice1010 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_25_in_ruleMultipleChoice1025 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice1048 = new BitSet(new long[]{0x000400000C000002L});
        public static final BitSet FOLLOW_26_in_ruleMultipleChoice1061 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice1082 = new BitSet(new long[]{0x000400000C000002L});
        public static final BitSet FOLLOW_27_in_ruleMultipleChoice1097 = new BitSet(new long[]{0x00000000700DE030L});
        public static final BitSet FOLLOW_28_in_ruleMultipleChoice1110 = new BitSet(new long[]{0x00000000600DE030L});
        public static final BitSet FOLLOW_29_in_ruleMultipleChoice1125 = new BitSet(new long[]{0x00000000400DE030L});
        public static final BitSet FOLLOW_30_in_ruleMultipleChoice1140 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice1163 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1187 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleMultipleChoice1200 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1221 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleOpen_in_entryRuleOpen1261 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpen1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleOpen1317 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOpen1334 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOpen1351 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_13_in_ruleOpen1365 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleOpen1379 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_15_in_ruleOpen1394 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_16_in_ruleOpen1419 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleOpen1444 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_18_in_ruleOpen1460 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleOpen1475 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpen1498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1534 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRating_Impl1544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleRating_Impl1590 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRating_Impl1607 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRating_Impl1624 = new BitSet(new long[]{0x00000002000DE030L});
        public static final BitSet FOLLOW_13_in_ruleRating_Impl1638 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRating_Impl1652 = new BitSet(new long[]{0x00000002000DE030L});
        public static final BitSet FOLLOW_15_in_ruleRating_Impl1667 = new BitSet(new long[]{0x00000002000DE030L});
        public static final BitSet FOLLOW_16_in_ruleRating_Impl1686 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRating_Impl1698 = new BitSet(new long[]{0x00000002000DE030L});
        public static final BitSet FOLLOW_18_in_ruleRating_Impl1714 = new BitSet(new long[]{0x00000002000DE030L});
        public static final BitSet FOLLOW_33_in_ruleRating_Impl1729 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleRating_Impl1747 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1770 = new BitSet(new long[]{0x0020000400200040L});
        public static final BitSet FOLLOW_34_in_ruleRating_Impl1783 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1806 = new BitSet(new long[]{0x0020000800200040L});
        public static final BitSet FOLLOW_35_in_ruleRating_Impl1819 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1842 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_36_in_ruleRating_Impl1855 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleRating_Impl1869 = new BitSet(new long[]{0x00000040000DE030L});
        public static final BitSet FOLLOW_38_in_ruleRating_Impl1882 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1905 = new BitSet(new long[]{0x0000008800000000L});
        public static final BitSet FOLLOW_35_in_ruleRating_Impl1918 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleRating_Impl1932 = new BitSet(new long[]{0x00000040000DE030L});
        public static final BitSet FOLLOW_38_in_ruleRating_Impl1945 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1968 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl1990 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRating_Impl2003 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl2024 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleRanking_in_entryRuleRanking2064 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRanking2074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleRanking2111 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRanking2128 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRanking2145 = new BitSet(new long[]{0x00000200000DE030L});
        public static final BitSet FOLLOW_13_in_ruleRanking2159 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRanking2173 = new BitSet(new long[]{0x00000200000DE030L});
        public static final BitSet FOLLOW_15_in_ruleRanking2188 = new BitSet(new long[]{0x00000200000DE030L});
        public static final BitSet FOLLOW_16_in_ruleRanking2213 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRanking2238 = new BitSet(new long[]{0x00000200000DE030L});
        public static final BitSet FOLLOW_18_in_ruleRanking2254 = new BitSet(new long[]{0x00000200000DE030L});
        public static final BitSet FOLLOW_41_in_ruleRanking2269 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleRanking2287 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRanking2310 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_22_in_ruleRanking2323 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_23_in_ruleRanking2338 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_24_in_ruleRanking2356 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_25_in_ruleRanking2371 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2394 = new BitSet(new long[]{0x0004000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRanking2407 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2428 = new BitSet(new long[]{0x0004000004000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleRanking2452 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRanking2465 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleRanking2486 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleConstantSum_in_entryRuleConstantSum2526 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantSum2536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleConstantSum2582 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantSum2599 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConstantSum2616 = new BitSet(new long[]{0x00000800000DE000L});
        public static final BitSet FOLLOW_13_in_ruleConstantSum2630 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleConstantSum2644 = new BitSet(new long[]{0x00000800000D8000L});
        public static final BitSet FOLLOW_15_in_ruleConstantSum2659 = new BitSet(new long[]{0x00000800000C0000L});
        public static final BitSet FOLLOW_16_in_ruleConstantSum2684 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConstantSum2709 = new BitSet(new long[]{0x00000800000C0000L});
        public static final BitSet FOLLOW_18_in_ruleConstantSum2725 = new BitSet(new long[]{0x0000080000080000L});
        public static final BitSet FOLLOW_43_in_ruleConstantSum2740 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleConstantSum2758 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstantSum2780 = new BitSet(new long[]{0x0000B00000040000L});
        public static final BitSet FOLLOW_18_in_ruleConstantSum2795 = new BitSet(new long[]{0x0000300000000000L});
        public static final BitSet FOLLOW_44_in_ruleConstantSum2810 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleConstantSum2824 = new BitSet(new long[]{0x0020400000200040L});
        public static final BitSet FOLLOW_46_in_ruleConstantSum2837 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleConstantSum2861 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleConstantSum2875 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleConstantSum2887 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleConstantSum2908 = new BitSet(new long[]{0x0004000004000002L});
        public static final BitSet FOLLOW_26_in_ruleConstantSum2921 = new BitSet(new long[]{0x0000000003D00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleConstantSum2942 = new BitSet(new long[]{0x0004000004000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleConstantSum2966 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleConstantSum2979 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleConstantSum3000 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleStaple_in_entryRuleStaple3040 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStaple3050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleStaple3096 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStaple3113 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStaple3130 = new BitSet(new long[]{0x00000002000DE000L});
        public static final BitSet FOLLOW_13_in_ruleStaple3144 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleStaple3158 = new BitSet(new long[]{0x00000002000D8000L});
        public static final BitSet FOLLOW_15_in_ruleStaple3173 = new BitSet(new long[]{0x00000002000C0000L});
        public static final BitSet FOLLOW_16_in_ruleStaple3198 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleStaple3223 = new BitSet(new long[]{0x00000002000C0000L});
        public static final BitSet FOLLOW_18_in_ruleStaple3239 = new BitSet(new long[]{0x0000000200080000L});
        public static final BitSet FOLLOW_33_in_ruleStaple3254 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleStaple3272 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3294 = new BitSet(new long[]{0x0020000400200040L});
        public static final BitSet FOLLOW_34_in_ruleStaple3307 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStaple3330 = new BitSet(new long[]{0x0020000800200040L});
        public static final BitSet FOLLOW_35_in_ruleStaple3343 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStaple3366 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_36_in_ruleStaple3379 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleStaple3393 = new BitSet(new long[]{0x00000040000DE030L});
        public static final BitSet FOLLOW_38_in_ruleStaple3406 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3429 = new BitSet(new long[]{0x0002000004000000L});
        public static final BitSet FOLLOW_26_in_ruleStaple3442 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleStaple3456 = new BitSet(new long[]{0x00000040000DE030L});
        public static final BitSet FOLLOW_38_in_ruleStaple3469 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3492 = new BitSet(new long[]{0x0000008800000000L});
        public static final BitSet FOLLOW_35_in_ruleStaple3505 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleStaple3519 = new BitSet(new long[]{0x00000040000DE030L});
        public static final BitSet FOLLOW_38_in_ruleStaple3532 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3555 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3577 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleStaple3590 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3611 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice3651 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoice3661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleChoice3703 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleChoice3720 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoice3741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_entryRuleChoiceFork3777 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceFork3787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleChoiceFork3824 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork3847 = new BitSet(new long[]{0x0018000004000000L});
        public static final BitSet FOLLOW_26_in_ruleChoiceFork3860 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork3883 = new BitSet(new long[]{0x0018000004000000L});
        public static final BitSet FOLLOW_51_in_ruleChoiceFork3898 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleChoiceFork3912 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleChoiceFork3924 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork3947 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleChoiceFork3960 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork3983 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4022 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleEInt4072 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_entryRuleRatingFork4134 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRatingFork4144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleRatingFork4181 = new BitSet(new long[]{0x0040000400010000L});
        public static final BitSet FOLLOW_54_in_ruleRatingFork4194 = new BitSet(new long[]{0x0000000400010000L});
        public static final BitSet FOLLOW_16_in_ruleRatingFork4209 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleRatingFork4223 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork4244 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleRatingFork4256 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork4277 = new BitSet(new long[]{0x0018000000000000L});
        public static final BitSet FOLLOW_51_in_ruleRatingFork4290 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleRatingFork4304 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRatingFork4316 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRatingFork4339 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRatingFork4352 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRatingFork4375 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_entryRuleRankingSumFork4413 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRankingSumFork4423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleRankingSumFork4460 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4483 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_26_in_ruleRankingSumFork4496 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4519 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_16_in_ruleRankingSumFork4533 = new BitSet(new long[]{0x0020000400200040L});
        public static final BitSet FOLLOW_34_in_ruleRankingSumFork4546 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingSumFork4569 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleRankingSumFork4581 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingSumFork4602 = new BitSet(new long[]{0x0018000000000000L});
        public static final BitSet FOLLOW_51_in_ruleRankingSumFork4615 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleRankingSumFork4629 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRankingSumFork4641 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4664 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleRankingSumFork4677 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4700 = new BitSet(new long[]{0x0000000004000002L});
    }


}