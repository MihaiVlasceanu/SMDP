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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MultipleChoice'", "':'", "'the'", "'user'", "'may'", "'is'", "'required'", "'to'", "'answer'", "'picking'", "'up to'", "'from'", "'these'", "','", "'or'", "'with'", "'something'", "'else'", "'Open'", "'Rating'", "'rate'", "'between'", "'and'", "'where'", "'lowest'", "'means'", "'highest'", "'Ranking'", "'rank'", "'one of'", "'some of'", "'ConstantSum'", "'distribute'", "'a'", "'total'", "'of'", "'amongst'", "'Staple'", "'mid'", "'if'", "'then'", "'go'", "'-'", "'it'"
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
        	return "Survey";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSurvey"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey75);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey85); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleSurvey returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )? ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_questions_2_0 = null;

        EObject lv_questions_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: () ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:2: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:88:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSurvey136); 

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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:104:2: ( ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11||(LA2_0>=29 && LA2_0<=30)||LA2_0==38||LA2_0==42||LA2_0==48) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:104:3: ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:104:3: ( (lv_questions_2_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:105:1: (lv_questions_2_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:105:1: (lv_questions_2_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:106:3: lv_questions_2_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey163);
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

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:122:2: ( (lv_questions_3_0= ruleQuestion ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11||(LA1_0>=29 && LA1_0<=30)||LA1_0==38||LA1_0==42||LA1_0==48) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:123:1: (lv_questions_3_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:123:1: (lv_questions_3_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:124:3: lv_questions_3_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey184);
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
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleQuestion"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:148:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:149:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:150:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion223);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion233); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:157:1: ruleQuestion returns [EObject current=null] : (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_ConstantSum_4= ruleConstantSum | this_Staple_5= ruleStaple ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:28: ( (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_ConstantSum_4= ruleConstantSum | this_Staple_5= ruleStaple ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:161:1: (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_ConstantSum_4= ruleConstantSum | this_Staple_5= ruleStaple )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:161:1: (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_ConstantSum_4= ruleConstantSum | this_Staple_5= ruleStaple )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            case 38:
                {
                alt3=4;
                }
                break;
            case 42:
                {
                alt3=5;
                }
                break;
            case 48:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:162:5: this_MultipleChoice_0= ruleMultipleChoice
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleChoiceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_ruleQuestion280);
                    this_MultipleChoice_0=ruleMultipleChoice();

                    state._fsp--;

                     
                            current = this_MultipleChoice_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:172:5: this_Open_1= ruleOpen
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getOpenParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOpen_in_ruleQuestion307);
                    this_Open_1=ruleOpen();

                    state._fsp--;

                     
                            current = this_Open_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:182:5: this_Rating_Impl_2= ruleRating_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRating_ImplParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRating_Impl_in_ruleQuestion334);
                    this_Rating_Impl_2=ruleRating_Impl();

                    state._fsp--;

                     
                            current = this_Rating_Impl_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:192:5: this_Ranking_3= ruleRanking
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRankingParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRanking_in_ruleQuestion361);
                    this_Ranking_3=ruleRanking();

                    state._fsp--;

                     
                            current = this_Ranking_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:202:5: this_ConstantSum_4= ruleConstantSum
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getConstantSumParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstantSum_in_ruleQuestion388);
                    this_ConstantSum_4=ruleConstantSum();

                    state._fsp--;

                     
                            current = this_ConstantSum_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:5: this_Staple_5= ruleStaple
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getStapleParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStaple_in_ruleQuestion415);
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


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:228:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:230:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString451);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString462); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:237:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:240:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:241:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:241:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:241:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString502); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:249:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString528); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:266:1: entryRuleMultipleChoice returns [EObject current=null] : iv_ruleMultipleChoice= ruleMultipleChoice EOF ;
    public final EObject entryRuleMultipleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoice = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:267:2: (iv_ruleMultipleChoice= ruleMultipleChoice EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:268:2: iv_ruleMultipleChoice= ruleMultipleChoice EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice575);
            iv_ruleMultipleChoice=ruleMultipleChoice();

            state._fsp--;

             current =iv_ruleMultipleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoice585); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:1: ruleMultipleChoice returns [EObject current=null] : ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'these' )? ( (lv_choice_17_0= ruleChoice ) ) (otherlv_18= ',' ( (lv_choice_19_0= ruleChoice ) ) )* (otherlv_20= 'or' (otherlv_21= 'with' )? (otherlv_22= 'something' )? (otherlv_23= 'else' )? ( (lv_other_24_0= ruleEString ) ) )? ( ( (lv_forks_25_0= ruleChoiceFork ) ) ( (lv_forks_26_0= ruleChoiceFork ) )* )? ) ;
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
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_question_11_0 = null;

        AntlrDatatypeRuleToken lv_answerCount_14_0 = null;

        EObject lv_choice_17_0 = null;

        EObject lv_choice_19_0 = null;

        AntlrDatatypeRuleToken lv_other_24_0 = null;

        EObject lv_forks_25_0 = null;

        EObject lv_forks_26_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:278:28: ( ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'these' )? ( (lv_choice_17_0= ruleChoice ) ) (otherlv_18= ',' ( (lv_choice_19_0= ruleChoice ) ) )* (otherlv_20= 'or' (otherlv_21= 'with' )? (otherlv_22= 'something' )? (otherlv_23= 'else' )? ( (lv_other_24_0= ruleEString ) ) )? ( ( (lv_forks_25_0= ruleChoiceFork ) ) ( (lv_forks_26_0= ruleChoiceFork ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:279:1: ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'these' )? ( (lv_choice_17_0= ruleChoice ) ) (otherlv_18= ',' ( (lv_choice_19_0= ruleChoice ) ) )* (otherlv_20= 'or' (otherlv_21= 'with' )? (otherlv_22= 'something' )? (otherlv_23= 'else' )? ( (lv_other_24_0= ruleEString ) ) )? ( ( (lv_forks_25_0= ruleChoiceFork ) ) ( (lv_forks_26_0= ruleChoiceFork ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:279:1: ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'these' )? ( (lv_choice_17_0= ruleChoice ) ) (otherlv_18= ',' ( (lv_choice_19_0= ruleChoice ) ) )* (otherlv_20= 'or' (otherlv_21= 'with' )? (otherlv_22= 'something' )? (otherlv_23= 'else' )? ( (lv_other_24_0= ruleEString ) ) )? ( ( (lv_forks_25_0= ruleChoiceFork ) ) ( (lv_forks_26_0= ruleChoiceFork ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:279:2: () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )? (otherlv_15= 'from' )? (otherlv_16= 'these' )? ( (lv_choice_17_0= ruleChoice ) ) (otherlv_18= ',' ( (lv_choice_19_0= ruleChoice ) ) )* (otherlv_20= 'or' (otherlv_21= 'with' )? (otherlv_22= 'something' )? (otherlv_23= 'else' )? ( (lv_other_24_0= ruleEString ) ) )? ( ( (lv_forks_25_0= ruleChoiceFork ) ) ( (lv_forks_26_0= ruleChoiceFork ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:279:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:280:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultipleChoiceAccess().getMultipleChoiceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMultipleChoice631); 

                	newLeafNode(otherlv_1, grammarAccess.getMultipleChoiceAccess().getMultipleChoiceKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:289:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:290:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:290:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:291:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultipleChoice648); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultipleChoice665); 

                	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=13 && LA6_0<=14)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:2: (otherlv_4= 'the' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==13) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleChoice679); 

                                	newLeafNode(otherlv_4, grammarAccess.getMultipleChoiceAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleChoice693); 

                        	newLeafNode(otherlv_5, grammarAccess.getMultipleChoiceAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:319:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:319:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultipleChoice708); 

                        	newLeafNode(otherlv_6, grammarAccess.getMultipleChoiceAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:325:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:325:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:326:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultipleChoice733); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getMultipleChoiceAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultipleChoice758); 

                        	newLeafNode(otherlv_8, grammarAccess.getMultipleChoiceAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:343:4: (otherlv_9= 'to' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:343:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultipleChoice774); 

                        	newLeafNode(otherlv_9, grammarAccess.getMultipleChoiceAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:347:3: (otherlv_10= 'answer' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:347:5: otherlv_10= 'answer'
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultipleChoice789); 

                        	newLeafNode(otherlv_10, grammarAccess.getMultipleChoiceAccess().getAnswerKeyword_7());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:3: ( (lv_question_11_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:352:1: (lv_question_11_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:352:1: (lv_question_11_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:353:3: lv_question_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice812);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:2: (otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:4: otherlv_12= 'picking' (otherlv_13= 'up to' )? ( (lv_answerCount_14_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultipleChoice825); 

                        	newLeafNode(otherlv_12, grammarAccess.getMultipleChoiceAccess().getPickingKeyword_9_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:373:1: (otherlv_13= 'up to' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==21) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:373:3: otherlv_13= 'up to'
                            {
                            otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultipleChoice838); 

                                	newLeafNode(otherlv_13, grammarAccess.getMultipleChoiceAccess().getUpToKeyword_9_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:377:3: ( (lv_answerCount_14_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:378:1: (lv_answerCount_14_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:378:1: (lv_answerCount_14_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:379:3: lv_answerCount_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getAnswerCountEIntParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultipleChoice861);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:4: (otherlv_15= 'from' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:6: otherlv_15= 'from'
                    {
                    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMultipleChoice876); 

                        	newLeafNode(otherlv_15, grammarAccess.getMultipleChoiceAccess().getFromKeyword_10());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:399:3: (otherlv_16= 'these' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:399:5: otherlv_16= 'these'
                    {
                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMultipleChoice891); 

                        	newLeafNode(otherlv_16, grammarAccess.getMultipleChoiceAccess().getTheseKeyword_11());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:403:3: ( (lv_choice_17_0= ruleChoice ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:404:1: (lv_choice_17_0= ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:404:1: (lv_choice_17_0= ruleChoice )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:405:3: lv_choice_17_0= ruleChoice
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice914);
            lv_choice_17_0=ruleChoice();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
            	        }
                   		add(
                   			current, 
                   			"choice",
                    		lv_choice_17_0, 
                    		"Choice");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:421:2: (otherlv_18= ',' ( (lv_choice_19_0= ruleChoice ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:421:4: otherlv_18= ',' ( (lv_choice_19_0= ruleChoice ) )
            	    {
            	    otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultipleChoice927); 

            	        	newLeafNode(otherlv_18, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_13_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:425:1: ( (lv_choice_19_0= ruleChoice ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:426:1: (lv_choice_19_0= ruleChoice )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:426:1: (lv_choice_19_0= ruleChoice )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:427:3: lv_choice_19_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_13_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice948);
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


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:443:4: (otherlv_20= 'or' (otherlv_21= 'with' )? (otherlv_22= 'something' )? (otherlv_23= 'else' )? ( (lv_other_24_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:443:6: otherlv_20= 'or' (otherlv_21= 'with' )? (otherlv_22= 'something' )? (otherlv_23= 'else' )? ( (lv_other_24_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultipleChoice963); 

                        	newLeafNode(otherlv_20, grammarAccess.getMultipleChoiceAccess().getOrKeyword_14_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:447:1: (otherlv_21= 'with' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==26) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:447:3: otherlv_21= 'with'
                            {
                            otherlv_21=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleChoice976); 

                                	newLeafNode(otherlv_21, grammarAccess.getMultipleChoiceAccess().getWithKeyword_14_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:451:3: (otherlv_22= 'something' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==27) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:451:5: otherlv_22= 'something'
                            {
                            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultipleChoice991); 

                                	newLeafNode(otherlv_22, grammarAccess.getMultipleChoiceAccess().getSomethingKeyword_14_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:455:3: (otherlv_23= 'else' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==28) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:455:5: otherlv_23= 'else'
                            {
                            otherlv_23=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMultipleChoice1006); 

                                	newLeafNode(otherlv_23, grammarAccess.getMultipleChoiceAccess().getElseKeyword_14_3());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:3: ( (lv_other_24_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:1: (lv_other_24_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:1: (lv_other_24_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:461:3: lv_other_24_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getOtherEStringParserRuleCall_14_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice1029);
                    lv_other_24_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		set(
                           			current, 
                           			"other",
                            		lv_other_24_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:477:4: ( ( (lv_forks_25_0= ruleChoiceFork ) ) ( (lv_forks_26_0= ruleChoiceFork ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==50) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:477:5: ( (lv_forks_25_0= ruleChoiceFork ) ) ( (lv_forks_26_0= ruleChoiceFork ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:477:5: ( (lv_forks_25_0= ruleChoiceFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:478:1: (lv_forks_25_0= ruleChoiceFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:478:1: (lv_forks_25_0= ruleChoiceFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:479:3: lv_forks_25_0= ruleChoiceFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getForksChoiceForkParserRuleCall_15_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1053);
                    lv_forks_25_0=ruleChoiceFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		add(
                           			current, 
                           			"forks",
                            		lv_forks_25_0, 
                            		"ChoiceFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:495:2: ( (lv_forks_26_0= ruleChoiceFork ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==50) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:496:1: (lv_forks_26_0= ruleChoiceFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:496:1: (lv_forks_26_0= ruleChoiceFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:497:3: lv_forks_26_0= ruleChoiceFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getForksChoiceForkParserRuleCall_15_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1074);
                    	    lv_forks_26_0=ruleChoiceFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forks",
                    	            		lv_forks_26_0, 
                    	            		"ChoiceFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:521:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:522:2: (iv_ruleOpen= ruleOpen EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:523:2: iv_ruleOpen= ruleOpen EOF
            {
             newCompositeNode(grammarAccess.getOpenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpen_in_entryRuleOpen1113);
            iv_ruleOpen=ruleOpen();

            state._fsp--;

             current =iv_ruleOpen; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpen1123); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:530:1: ruleOpen returns [EObject current=null] : ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:533:28: ( ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:534:1: ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:534:1: ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:534:2: () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:534:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:535:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOpenAccess().getOpenAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleOpen1169); 

                	newLeafNode(otherlv_1, grammarAccess.getOpenAccess().getOpenKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:544:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:546:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOpen1186); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOpen1203); 

                	newLeafNode(otherlv_3, grammarAccess.getOpenAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=13 && LA22_0<=14)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:2: (otherlv_4= 'the' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==13) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOpen1217); 

                                	newLeafNode(otherlv_4, grammarAccess.getOpenAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOpen1231); 

                        	newLeafNode(otherlv_5, grammarAccess.getOpenAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:574:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                alt23=1;
            }
            else if ( (LA23_0==16) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:574:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOpen1246); 

                        	newLeafNode(otherlv_6, grammarAccess.getOpenAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:579:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:579:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:579:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:579:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:580:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:580:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:581:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOpen1271); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getOpenAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOpenRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOpen1296); 

                        	newLeafNode(otherlv_8, grammarAccess.getOpenAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:598:4: (otherlv_9= 'to' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:598:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOpen1312); 

                        	newLeafNode(otherlv_9, grammarAccess.getOpenAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:3: (otherlv_10= 'answer' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:5: otherlv_10= 'answer'
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOpen1327); 

                        	newLeafNode(otherlv_10, grammarAccess.getOpenAccess().getAnswerKeyword_7());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:606:3: ( (lv_question_11_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:607:1: (lv_question_11_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:607:1: (lv_question_11_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:608:3: lv_question_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOpenAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpen1350);
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:632:1: entryRuleRating_Impl returns [EObject current=null] : iv_ruleRating_Impl= ruleRating_Impl EOF ;
    public final EObject entryRuleRating_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating_Impl = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:633:2: (iv_ruleRating_Impl= ruleRating_Impl EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:634:2: iv_ruleRating_Impl= ruleRating_Impl EOF
            {
             newCompositeNode(grammarAccess.getRating_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1386);
            iv_ruleRating_Impl=ruleRating_Impl();

            state._fsp--;

             current =iv_ruleRating_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRating_Impl1396); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:641:1: ruleRating_Impl returns [EObject current=null] : ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )? ) ;
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
        AntlrDatatypeRuleToken lv_question_12_0 = null;

        AntlrDatatypeRuleToken lv_min_14_0 = null;

        AntlrDatatypeRuleToken lv_max_16_0 = null;

        AntlrDatatypeRuleToken lv_first_20_0 = null;

        AntlrDatatypeRuleToken lv_last_24_0 = null;

        EObject lv_forks_25_0 = null;

        EObject lv_forks_26_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:644:28: ( ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:645:1: ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:645:1: ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:645:2: () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:645:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:646:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRating_ImplAccess().getRatingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRating_Impl1442); 

                	newLeafNode(otherlv_1, grammarAccess.getRating_ImplAccess().getRatingKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:655:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:656:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:657:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRating_Impl1459); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRating_Impl1476); 

                	newLeafNode(otherlv_3, grammarAccess.getRating_ImplAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=13 && LA27_0<=14)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:2: (otherlv_4= 'the' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==13) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRating_Impl1490); 

                                	newLeafNode(otherlv_4, grammarAccess.getRating_ImplAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRating_Impl1504); 

                        	newLeafNode(otherlv_5, grammarAccess.getRating_ImplAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:685:3: (otherlv_6= 'may' | (otherlv_7= 'is' otherlv_8= 'required' ) )?
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==15) ) {
                alt28=1;
            }
            else if ( (LA28_0==16) ) {
                alt28=2;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:685:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRating_Impl1519); 

                        	newLeafNode(otherlv_6, grammarAccess.getRating_ImplAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:6: (otherlv_7= 'is' otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:6: (otherlv_7= 'is' otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:8: otherlv_7= 'is' otherlv_8= 'required'
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRating_Impl1538); 

                        	newLeafNode(otherlv_7, grammarAccess.getRating_ImplAccess().getIsKeyword_5_1_0());
                        
                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRating_Impl1550); 

                        	newLeafNode(otherlv_8, grammarAccess.getRating_ImplAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:698:4: (otherlv_9= 'to' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==18) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:698:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRating_Impl1566); 

                        	newLeafNode(otherlv_9, grammarAccess.getRating_ImplAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:3: (otherlv_10= 'rate' | otherlv_11= 'answer' )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            else if ( (LA30_0==19) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:5: otherlv_10= 'rate'
                    {
                    otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRating_Impl1581); 

                        	newLeafNode(otherlv_10, grammarAccess.getRating_ImplAccess().getRateKeyword_7_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:707:7: otherlv_11= 'answer'
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRating_Impl1599); 

                        	newLeafNode(otherlv_11, grammarAccess.getRating_ImplAccess().getAnswerKeyword_7_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:711:3: ( (lv_question_12_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:712:1: (lv_question_12_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:712:1: (lv_question_12_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:3: lv_question_12_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1622);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:2: (otherlv_13= 'between' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:4: otherlv_13= 'between'
                    {
                    otherlv_13=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRating_Impl1635); 

                        	newLeafNode(otherlv_13, grammarAccess.getRating_ImplAccess().getBetweenKeyword_9());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:733:3: ( (lv_min_14_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:1: (lv_min_14_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:1: (lv_min_14_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:3: lv_min_14_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMinEIntParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1658);
            lv_min_14_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"min",
                    		lv_min_14_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:751:2: (otherlv_15= 'and' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:751:4: otherlv_15= 'and'
                    {
                    otherlv_15=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRating_Impl1671); 

                        	newLeafNode(otherlv_15, grammarAccess.getRating_ImplAccess().getAndKeyword_11());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:3: ( (lv_max_16_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:756:1: (lv_max_16_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:756:1: (lv_max_16_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:757:3: lv_max_16_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMaxEIntParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1694);
            lv_max_16_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"max",
                    		lv_max_16_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:773:2: (otherlv_17= 'where' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:773:4: otherlv_17= 'where'
                    {
                    otherlv_17=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRating_Impl1707); 

                        	newLeafNode(otherlv_17, grammarAccess.getRating_ImplAccess().getWhereKeyword_13());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:777:3: (otherlv_18= 'lowest' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:777:5: otherlv_18= 'lowest'
                    {
                    otherlv_18=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRating_Impl1722); 

                        	newLeafNode(otherlv_18, grammarAccess.getRating_ImplAccess().getLowestKeyword_14());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:781:3: (otherlv_19= 'means' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:781:5: otherlv_19= 'means'
                    {
                    otherlv_19=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRating_Impl1737); 

                        	newLeafNode(otherlv_19, grammarAccess.getRating_ImplAccess().getMeansKeyword_15());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:785:3: ( (lv_first_20_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:786:1: (lv_first_20_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:786:1: (lv_first_20_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:787:3: lv_first_20_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getFirstEStringParserRuleCall_16_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1760);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:803:2: (otherlv_21= 'and' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:803:4: otherlv_21= 'and'
                    {
                    otherlv_21=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRating_Impl1773); 

                        	newLeafNode(otherlv_21, grammarAccess.getRating_ImplAccess().getAndKeyword_17());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:3: (otherlv_22= 'highest' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:5: otherlv_22= 'highest'
                    {
                    otherlv_22=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleRating_Impl1788); 

                        	newLeafNode(otherlv_22, grammarAccess.getRating_ImplAccess().getHighestKeyword_18());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:811:3: (otherlv_23= 'means' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:811:5: otherlv_23= 'means'
                    {
                    otherlv_23=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRating_Impl1803); 

                        	newLeafNode(otherlv_23, grammarAccess.getRating_ImplAccess().getMeansKeyword_19());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:815:3: ( (lv_last_24_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:816:1: (lv_last_24_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:816:1: (lv_last_24_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:817:3: lv_last_24_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getLastEStringParserRuleCall_20_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1826);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:833:2: ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:833:3: ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:833:3: ( (lv_forks_25_0= ruleRatingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:1: (lv_forks_25_0= ruleRatingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:1: (lv_forks_25_0= ruleRatingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:3: lv_forks_25_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getForksRatingForkParserRuleCall_21_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl1848);
                    lv_forks_25_0=ruleRatingFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"forks",
                            		lv_forks_25_0, 
                            		"RatingFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:2: ( (lv_forks_26_0= ruleRatingFork ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==50) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:1: (lv_forks_26_0= ruleRatingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:1: (lv_forks_26_0= ruleRatingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:853:3: lv_forks_26_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getForksRatingForkParserRuleCall_21_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl1869);
                    	    lv_forks_26_0=ruleRatingFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forks",
                    	            		lv_forks_26_0, 
                    	            		"RatingFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:877:1: entryRuleRanking returns [EObject current=null] : iv_ruleRanking= ruleRanking EOF ;
    public final EObject entryRuleRanking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRanking = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:878:2: (iv_ruleRanking= ruleRanking EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:879:2: iv_ruleRanking= ruleRanking EOF
            {
             newCompositeNode(grammarAccess.getRankingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRanking_in_entryRuleRanking1908);
            iv_ruleRanking=ruleRanking();

            state._fsp--;

             current =iv_ruleRanking; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRanking1918); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:886:1: ruleRanking returns [EObject current=null] : (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_forks_19_0= ruleRankingSumFork ) ) ( (lv_forks_20_0= ruleRankingSumFork ) )* )? ) ;
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
        AntlrDatatypeRuleToken lv_question_11_0 = null;

        EObject lv_choices_16_0 = null;

        EObject lv_choices_18_0 = null;

        EObject lv_forks_19_0 = null;

        EObject lv_forks_20_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:28: ( (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_forks_19_0= ruleRankingSumFork ) ) ( (lv_forks_20_0= ruleRankingSumFork ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:890:1: (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_forks_19_0= ruleRankingSumFork ) ) ( (lv_forks_20_0= ruleRankingSumFork ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:890:1: (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_forks_19_0= ruleRankingSumFork ) ) ( (lv_forks_20_0= ruleRankingSumFork ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:890:3: otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'from' )? (otherlv_13= 'one of' | otherlv_14= 'some of' )? (otherlv_15= 'these' )? ( (lv_choices_16_0= ruleChoice ) ) (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )* ( ( (lv_forks_19_0= ruleRankingSumFork ) ) ( (lv_forks_20_0= ruleRankingSumFork ) )* )?
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRanking1955); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingAccess().getRankingKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:894:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:895:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:895:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:896:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRanking1972); 

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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRanking1989); 

                	newLeafNode(otherlv_2, grammarAccess.getRankingAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:1: ( (otherlv_3= 'the' )? otherlv_4= 'user' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=13 && LA42_0<=14)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:2: (otherlv_3= 'the' )? otherlv_4= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:2: (otherlv_3= 'the' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==13) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:4: otherlv_3= 'the'
                            {
                            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRanking2003); 

                                	newLeafNode(otherlv_3, grammarAccess.getRankingAccess().getTheKeyword_3_0());
                                

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRanking2017); 

                        	newLeafNode(otherlv_4, grammarAccess.getRankingAccess().getUserKeyword_3_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:924:3: (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )?
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:924:5: otherlv_5= 'may'
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRanking2032); 

                        	newLeafNode(otherlv_5, grammarAccess.getRankingAccess().getMayKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:929:6: ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:929:6: ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:929:7: ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:929:7: ( (lv_isRequired_6_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:930:1: (lv_isRequired_6_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:930:1: (lv_isRequired_6_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:931:3: lv_isRequired_6_0= 'is'
                    {
                    lv_isRequired_6_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRanking2057); 

                            newLeafNode(lv_isRequired_6_0, grammarAccess.getRankingAccess().getIsRequiredIsKeyword_4_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRankingRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRanking2082); 

                        	newLeafNode(otherlv_7, grammarAccess.getRankingAccess().getRequiredKeyword_4_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:948:4: (otherlv_8= 'to' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==18) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:948:6: otherlv_8= 'to'
                    {
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRanking2098); 

                        	newLeafNode(otherlv_8, grammarAccess.getRankingAccess().getToKeyword_5());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:952:3: (otherlv_9= 'rank' | otherlv_10= 'answer' )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            else if ( (LA45_0==19) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:952:5: otherlv_9= 'rank'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleRanking2113); 

                        	newLeafNode(otherlv_9, grammarAccess.getRankingAccess().getRankKeyword_6_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:957:7: otherlv_10= 'answer'
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRanking2131); 

                        	newLeafNode(otherlv_10, grammarAccess.getRankingAccess().getAnswerKeyword_6_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:961:3: ( (lv_question_11_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:962:1: (lv_question_11_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:962:1: (lv_question_11_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:3: lv_question_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRankingAccess().getQuestionEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRanking2154);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:979:2: (otherlv_12= 'from' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==22) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:979:4: otherlv_12= 'from'
                    {
                    otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRanking2167); 

                        	newLeafNode(otherlv_12, grammarAccess.getRankingAccess().getFromKeyword_8());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:983:3: (otherlv_13= 'one of' | otherlv_14= 'some of' )?
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==40) ) {
                alt47=1;
            }
            else if ( (LA47_0==41) ) {
                alt47=2;
            }
            switch (alt47) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:983:5: otherlv_13= 'one of'
                    {
                    otherlv_13=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRanking2182); 

                        	newLeafNode(otherlv_13, grammarAccess.getRankingAccess().getOneOfKeyword_9_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:7: otherlv_14= 'some of'
                    {
                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRanking2200); 

                        	newLeafNode(otherlv_14, grammarAccess.getRankingAccess().getSomeOfKeyword_9_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:3: (otherlv_15= 'these' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==23) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:992:5: otherlv_15= 'these'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRanking2215); 

                        	newLeafNode(otherlv_15, grammarAccess.getRankingAccess().getTheseKeyword_10());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:996:3: ( (lv_choices_16_0= ruleChoice ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:997:1: (lv_choices_16_0= ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:997:1: (lv_choices_16_0= ruleChoice )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:998:3: lv_choices_16_0= ruleChoice
            {
             
            	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2238);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1014:2: (otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==24) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1014:4: otherlv_17= ',' ( (lv_choices_18_0= ruleChoice ) )
            	    {
            	    otherlv_17=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRanking2251); 

            	        	newLeafNode(otherlv_17, grammarAccess.getRankingAccess().getCommaKeyword_12_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1018:1: ( (lv_choices_18_0= ruleChoice ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1019:1: (lv_choices_18_0= ruleChoice )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1019:1: (lv_choices_18_0= ruleChoice )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1020:3: lv_choices_18_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_12_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2272);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1036:4: ( ( (lv_forks_19_0= ruleRankingSumFork ) ) ( (lv_forks_20_0= ruleRankingSumFork ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1036:5: ( (lv_forks_19_0= ruleRankingSumFork ) ) ( (lv_forks_20_0= ruleRankingSumFork ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1036:5: ( (lv_forks_19_0= ruleRankingSumFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1037:1: (lv_forks_19_0= ruleRankingSumFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1037:1: (lv_forks_19_0= ruleRankingSumFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1038:3: lv_forks_19_0= ruleRankingSumFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getForksRankingSumForkParserRuleCall_13_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleRanking2296);
                    lv_forks_19_0=ruleRankingSumFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		add(
                           			current, 
                           			"forks",
                            		lv_forks_19_0, 
                            		"RankingSumFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1054:2: ( (lv_forks_20_0= ruleRankingSumFork ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==50) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1055:1: (lv_forks_20_0= ruleRankingSumFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1055:1: (lv_forks_20_0= ruleRankingSumFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1056:3: lv_forks_20_0= ruleRankingSumFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingAccess().getForksRankingSumForkParserRuleCall_13_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleRanking2317);
                    	    lv_forks_20_0=ruleRankingSumFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forks",
                    	            		lv_forks_20_0, 
                    	            		"RankingSumFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1080:1: entryRuleConstantSum returns [EObject current=null] : iv_ruleConstantSum= ruleConstantSum EOF ;
    public final EObject entryRuleConstantSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSum = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1081:2: (iv_ruleConstantSum= ruleConstantSum EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1082:2: iv_ruleConstantSum= ruleConstantSum EOF
            {
             newCompositeNode(grammarAccess.getConstantSumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantSum_in_entryRuleConstantSum2356);
            iv_ruleConstantSum=ruleConstantSum();

            state._fsp--;

             current =iv_ruleConstantSum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantSum2366); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1089:1: ruleConstantSum returns [EObject current=null] : ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_constant_17_0= ruleEInt ) ) )? otherlv_18= 'amongst' otherlv_19= 'these' ( (lv_choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_choices_22_0= ruleChoice ) ) )* ( ( (lv_forks_23_0= ruleRankingSumFork ) ) ( (lv_forks_24_0= ruleRankingSumFork ) )* )? ) ;
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
        AntlrDatatypeRuleToken lv_question_12_0 = null;

        AntlrDatatypeRuleToken lv_constant_17_0 = null;

        EObject lv_choices_20_0 = null;

        EObject lv_choices_22_0 = null;

        EObject lv_forks_23_0 = null;

        EObject lv_forks_24_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:28: ( ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_constant_17_0= ruleEInt ) ) )? otherlv_18= 'amongst' otherlv_19= 'these' ( (lv_choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_choices_22_0= ruleChoice ) ) )* ( ( (lv_forks_23_0= ruleRankingSumFork ) ) ( (lv_forks_24_0= ruleRankingSumFork ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:1: ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_constant_17_0= ruleEInt ) ) )? otherlv_18= 'amongst' otherlv_19= 'these' ( (lv_choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_choices_22_0= ruleChoice ) ) )* ( ( (lv_forks_23_0= ruleRankingSumFork ) ) ( (lv_forks_24_0= ruleRankingSumFork ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:1: ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_constant_17_0= ruleEInt ) ) )? otherlv_18= 'amongst' otherlv_19= 'these' ( (lv_choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_choices_22_0= ruleChoice ) ) )* ( ( (lv_forks_23_0= ruleRankingSumFork ) ) ( (lv_forks_24_0= ruleRankingSumFork ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:2: () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_constant_17_0= ruleEInt ) ) )? otherlv_18= 'amongst' otherlv_19= 'these' ( (lv_choices_20_0= ruleChoice ) ) (otherlv_21= ',' ( (lv_choices_22_0= ruleChoice ) ) )* ( ( (lv_forks_23_0= ruleRankingSumFork ) ) ( (lv_forks_24_0= ruleRankingSumFork ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstantSumAccess().getConstantSumAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleConstantSum2412); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantSumAccess().getConstantSumKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1104:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1104:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1105:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantSum2429); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConstantSum2446); 

                	newLeafNode(otherlv_3, grammarAccess.getConstantSumAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=13 && LA53_0<=14)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:2: (otherlv_4= 'the' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==13) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1125:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstantSum2460); 

                                	newLeafNode(otherlv_4, grammarAccess.getConstantSumAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConstantSum2474); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstantSumAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1133:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1133:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConstantSum2489); 

                        	newLeafNode(otherlv_6, grammarAccess.getConstantSumAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1138:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1138:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1138:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1138:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1139:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1139:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1140:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConstantSum2514); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getConstantSumAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantSumRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConstantSum2539); 

                        	newLeafNode(otherlv_8, grammarAccess.getConstantSumAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1157:4: (otherlv_9= 'to' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==18) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1157:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstantSum2555); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstantSumAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1161:3: (otherlv_10= 'distribute' | otherlv_11= 'answer' )
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1161:5: otherlv_10= 'distribute'
                    {
                    otherlv_10=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleConstantSum2570); 

                        	newLeafNode(otherlv_10, grammarAccess.getConstantSumAccess().getDistributeKeyword_7_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1166:7: otherlv_11= 'answer'
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConstantSum2588); 

                        	newLeafNode(otherlv_11, grammarAccess.getConstantSumAccess().getAnswerKeyword_7_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:2: ( (lv_question_12_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:1: (lv_question_12_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:1: (lv_question_12_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1172:3: lv_question_12_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConstantSumAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstantSum2610);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:2: ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_constant_17_0= ruleEInt ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==18||(LA60_0>=44 && LA60_0<=45)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:3: ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_constant_17_0= ruleEInt ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:3: ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:4: (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )?
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:4: (otherlv_13= 'to' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==18) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:6: otherlv_13= 'to'
                            {
                            otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstantSum2625); 

                                	newLeafNode(otherlv_13, grammarAccess.getConstantSumAccess().getToKeyword_9_0_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:3: (otherlv_14= 'a' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==44) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:5: otherlv_14= 'a'
                            {
                            otherlv_14=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleConstantSum2640); 

                                	newLeafNode(otherlv_14, grammarAccess.getConstantSumAccess().getAKeyword_9_0_1());
                                

                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleConstantSum2654); 

                        	newLeafNode(otherlv_15, grammarAccess.getConstantSumAccess().getTotalKeyword_9_0_2());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1200:1: (otherlv_16= 'of' )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==46) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1200:3: otherlv_16= 'of'
                            {
                            otherlv_16=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleConstantSum2667); 

                                	newLeafNode(otherlv_16, grammarAccess.getConstantSumAccess().getOfKeyword_9_0_3());
                                

                            }
                            break;

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1204:4: ( (lv_constant_17_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1205:1: (lv_constant_17_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1205:1: (lv_constant_17_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1206:3: lv_constant_17_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantSumAccess().getConstantEIntParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleConstantSum2691);
                    lv_constant_17_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantSumRule());
                    	        }
                           		set(
                           			current, 
                           			"constant",
                            		lv_constant_17_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleConstantSum2705); 

                	newLeafNode(otherlv_18, grammarAccess.getConstantSumAccess().getAmongstKeyword_10());
                
            otherlv_19=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleConstantSum2717); 

                	newLeafNode(otherlv_19, grammarAccess.getConstantSumAccess().getTheseKeyword_11());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1230:1: ( (lv_choices_20_0= ruleChoice ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1231:1: (lv_choices_20_0= ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1231:1: (lv_choices_20_0= ruleChoice )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1232:3: lv_choices_20_0= ruleChoice
            {
             
            	        newCompositeNode(grammarAccess.getConstantSumAccess().getChoicesChoiceParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleConstantSum2738);
            lv_choices_20_0=ruleChoice();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantSumRule());
            	        }
                   		add(
                   			current, 
                   			"choices",
                    		lv_choices_20_0, 
                    		"Choice");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1248:2: (otherlv_21= ',' ( (lv_choices_22_0= ruleChoice ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==24) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1248:4: otherlv_21= ',' ( (lv_choices_22_0= ruleChoice ) )
            	    {
            	    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleConstantSum2751); 

            	        	newLeafNode(otherlv_21, grammarAccess.getConstantSumAccess().getCommaKeyword_13_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1252:1: ( (lv_choices_22_0= ruleChoice ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1253:1: (lv_choices_22_0= ruleChoice )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1253:1: (lv_choices_22_0= ruleChoice )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1254:3: lv_choices_22_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstantSumAccess().getChoicesChoiceParserRuleCall_13_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleConstantSum2772);
            	    lv_choices_22_0=ruleChoice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstantSumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"choices",
            	            		lv_choices_22_0, 
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1270:4: ( ( (lv_forks_23_0= ruleRankingSumFork ) ) ( (lv_forks_24_0= ruleRankingSumFork ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==50) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1270:5: ( (lv_forks_23_0= ruleRankingSumFork ) ) ( (lv_forks_24_0= ruleRankingSumFork ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1270:5: ( (lv_forks_23_0= ruleRankingSumFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1271:1: (lv_forks_23_0= ruleRankingSumFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1271:1: (lv_forks_23_0= ruleRankingSumFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1272:3: lv_forks_23_0= ruleRankingSumFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantSumAccess().getForksRankingSumForkParserRuleCall_14_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleConstantSum2796);
                    lv_forks_23_0=ruleRankingSumFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantSumRule());
                    	        }
                           		add(
                           			current, 
                           			"forks",
                            		lv_forks_23_0, 
                            		"RankingSumFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1288:2: ( (lv_forks_24_0= ruleRankingSumFork ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==50) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1289:1: (lv_forks_24_0= ruleRankingSumFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1289:1: (lv_forks_24_0= ruleRankingSumFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1290:3: lv_forks_24_0= ruleRankingSumFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantSumAccess().getForksRankingSumForkParserRuleCall_14_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleConstantSum2817);
                    	    lv_forks_24_0=ruleRankingSumFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstantSumRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forks",
                    	            		lv_forks_24_0, 
                    	            		"RankingSumFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:1: entryRuleStaple returns [EObject current=null] : iv_ruleStaple= ruleStaple EOF ;
    public final EObject entryRuleStaple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaple = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1315:2: (iv_ruleStaple= ruleStaple EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1316:2: iv_ruleStaple= ruleStaple EOF
            {
             newCompositeNode(grammarAccess.getStapleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStaple_in_entryRuleStaple2856);
            iv_ruleStaple=ruleStaple();

            state._fsp--;

             current =iv_ruleStaple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStaple2866); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1323:1: ruleStaple returns [EObject current=null] : ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? (otherlv_22= 'mid' )? (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? (otherlv_26= 'highest' )? (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_forks_29_0= ruleRatingFork ) ) ( (lv_forks_30_0= ruleRatingFork ) )* )? ) ;
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
        AntlrDatatypeRuleToken lv_question_12_0 = null;

        AntlrDatatypeRuleToken lv_min_14_0 = null;

        AntlrDatatypeRuleToken lv_max_16_0 = null;

        AntlrDatatypeRuleToken lv_first_20_0 = null;

        AntlrDatatypeRuleToken lv_mid_24_0 = null;

        AntlrDatatypeRuleToken lv_last_28_0 = null;

        EObject lv_forks_29_0 = null;

        EObject lv_forks_30_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1326:28: ( ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? (otherlv_22= 'mid' )? (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? (otherlv_26= 'highest' )? (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_forks_29_0= ruleRatingFork ) ) ( (lv_forks_30_0= ruleRatingFork ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1327:1: ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? (otherlv_22= 'mid' )? (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? (otherlv_26= 'highest' )? (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_forks_29_0= ruleRatingFork ) ) ( (lv_forks_30_0= ruleRatingFork ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1327:1: ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? (otherlv_22= 'mid' )? (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? (otherlv_26= 'highest' )? (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_forks_29_0= ruleRatingFork ) ) ( (lv_forks_30_0= ruleRatingFork ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1327:2: () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' ) ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= ',' )? (otherlv_22= 'mid' )? (otherlv_23= 'means' )? ( (lv_mid_24_0= ruleEString ) ) (otherlv_25= 'and' )? (otherlv_26= 'highest' )? (otherlv_27= 'means' )? ( (lv_last_28_0= ruleEString ) ) ( ( (lv_forks_29_0= ruleRatingFork ) ) ( (lv_forks_30_0= ruleRatingFork ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1327:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStapleAccess().getStapleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleStaple2912); 

                	newLeafNode(otherlv_1, grammarAccess.getStapleAccess().getStapleKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1337:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1338:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1338:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1339:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStaple2929); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStaple2946); 

                	newLeafNode(otherlv_3, grammarAccess.getStapleAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=13 && LA65_0<=14)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:2: (otherlv_4= 'the' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==13) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStaple2960); 

                                	newLeafNode(otherlv_4, grammarAccess.getStapleAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStaple2974); 

                        	newLeafNode(otherlv_5, grammarAccess.getStapleAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1367:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1367:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStaple2989); 

                        	newLeafNode(otherlv_6, grammarAccess.getStapleAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1374:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStaple3014); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getStapleAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStapleRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStaple3039); 

                        	newLeafNode(otherlv_8, grammarAccess.getStapleAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1391:4: (otherlv_9= 'to' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==18) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1391:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStaple3055); 

                        	newLeafNode(otherlv_9, grammarAccess.getStapleAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1395:3: (otherlv_10= 'rate' | otherlv_11= 'answer' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==31) ) {
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
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1395:5: otherlv_10= 'rate'
                    {
                    otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleStaple3070); 

                        	newLeafNode(otherlv_10, grammarAccess.getStapleAccess().getRateKeyword_7_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1400:7: otherlv_11= 'answer'
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStaple3088); 

                        	newLeafNode(otherlv_11, grammarAccess.getStapleAccess().getAnswerKeyword_7_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1404:2: ( (lv_question_12_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1405:1: (lv_question_12_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1405:1: (lv_question_12_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1406:3: lv_question_12_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3110);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1422:2: (otherlv_13= 'between' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==32) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1422:4: otherlv_13= 'between'
                    {
                    otherlv_13=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleStaple3123); 

                        	newLeafNode(otherlv_13, grammarAccess.getStapleAccess().getBetweenKeyword_9());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1426:3: ( (lv_min_14_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1427:1: (lv_min_14_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1427:1: (lv_min_14_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1428:3: lv_min_14_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getMinEIntParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStaple3146);
            lv_min_14_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStapleRule());
            	        }
                   		set(
                   			current, 
                   			"min",
                    		lv_min_14_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1444:2: (otherlv_15= 'and' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==33) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1444:4: otherlv_15= 'and'
                    {
                    otherlv_15=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStaple3159); 

                        	newLeafNode(otherlv_15, grammarAccess.getStapleAccess().getAndKeyword_11());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1448:3: ( (lv_max_16_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1449:1: (lv_max_16_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1449:1: (lv_max_16_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1450:3: lv_max_16_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getMaxEIntParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStaple3182);
            lv_max_16_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStapleRule());
            	        }
                   		set(
                   			current, 
                   			"max",
                    		lv_max_16_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1466:2: (otherlv_17= 'where' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==34) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1466:4: otherlv_17= 'where'
                    {
                    otherlv_17=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStaple3195); 

                        	newLeafNode(otherlv_17, grammarAccess.getStapleAccess().getWhereKeyword_13());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1470:3: (otherlv_18= 'lowest' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==35) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1470:5: otherlv_18= 'lowest'
                    {
                    otherlv_18=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStaple3210); 

                        	newLeafNode(otherlv_18, grammarAccess.getStapleAccess().getLowestKeyword_14());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1474:3: (otherlv_19= 'means' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==36) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1474:5: otherlv_19= 'means'
                    {
                    otherlv_19=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStaple3225); 

                        	newLeafNode(otherlv_19, grammarAccess.getStapleAccess().getMeansKeyword_15());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1478:3: ( (lv_first_20_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1479:1: (lv_first_20_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1479:1: (lv_first_20_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1480:3: lv_first_20_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getFirstEStringParserRuleCall_16_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3248);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1496:2: (otherlv_21= ',' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==24) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1496:4: otherlv_21= ','
                    {
                    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleStaple3261); 

                        	newLeafNode(otherlv_21, grammarAccess.getStapleAccess().getCommaKeyword_17());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1500:3: (otherlv_22= 'mid' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==49) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1500:5: otherlv_22= 'mid'
                    {
                    otherlv_22=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleStaple3276); 

                        	newLeafNode(otherlv_22, grammarAccess.getStapleAccess().getMidKeyword_18());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1504:3: (otherlv_23= 'means' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==36) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1504:5: otherlv_23= 'means'
                    {
                    otherlv_23=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStaple3291); 

                        	newLeafNode(otherlv_23, grammarAccess.getStapleAccess().getMeansKeyword_19());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1508:3: ( (lv_mid_24_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1509:1: (lv_mid_24_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1509:1: (lv_mid_24_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1510:3: lv_mid_24_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getMidEStringParserRuleCall_20_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3314);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1526:2: (otherlv_25= 'and' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==33) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1526:4: otherlv_25= 'and'
                    {
                    otherlv_25=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStaple3327); 

                        	newLeafNode(otherlv_25, grammarAccess.getStapleAccess().getAndKeyword_21());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:3: (otherlv_26= 'highest' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==37) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:5: otherlv_26= 'highest'
                    {
                    otherlv_26=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStaple3342); 

                        	newLeafNode(otherlv_26, grammarAccess.getStapleAccess().getHighestKeyword_22());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:3: (otherlv_27= 'means' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==36) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:5: otherlv_27= 'means'
                    {
                    otherlv_27=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStaple3357); 

                        	newLeafNode(otherlv_27, grammarAccess.getStapleAccess().getMeansKeyword_23());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1538:3: ( (lv_last_28_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1539:1: (lv_last_28_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1539:1: (lv_last_28_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1540:3: lv_last_28_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getLastEStringParserRuleCall_24_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3380);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1556:2: ( ( (lv_forks_29_0= ruleRatingFork ) ) ( (lv_forks_30_0= ruleRatingFork ) )* )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==50) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1556:3: ( (lv_forks_29_0= ruleRatingFork ) ) ( (lv_forks_30_0= ruleRatingFork ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1556:3: ( (lv_forks_29_0= ruleRatingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1557:1: (lv_forks_29_0= ruleRatingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1557:1: (lv_forks_29_0= ruleRatingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1558:3: lv_forks_29_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getForksRatingForkParserRuleCall_25_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3402);
                    lv_forks_29_0=ruleRatingFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		add(
                           			current, 
                           			"forks",
                            		lv_forks_29_0, 
                            		"RatingFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1574:2: ( (lv_forks_30_0= ruleRatingFork ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==50) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1575:1: (lv_forks_30_0= ruleRatingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1575:1: (lv_forks_30_0= ruleRatingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1576:3: lv_forks_30_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStapleAccess().getForksRatingForkParserRuleCall_25_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3423);
                    	    lv_forks_30_0=ruleRatingFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forks",
                    	            		lv_forks_30_0, 
                    	            		"RatingFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1600:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1601:2: (iv_ruleChoice= ruleChoice EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1602:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_entryRuleChoice3462);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoice3472); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1609:1: ruleChoice returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_description_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1612:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1614:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1614:1: (lv_name_0_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1615:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleChoice3514); 

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

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleChoice3531); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getColonKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1635:1: ( (lv_description_2_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1636:1: (lv_description_2_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1636:1: (lv_description_2_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1637:3: lv_description_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChoiceAccess().getDescriptionEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoice3552);
            lv_description_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChoiceRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1661:1: entryRuleChoiceFork returns [EObject current=null] : iv_ruleChoiceFork= ruleChoiceFork EOF ;
    public final EObject entryRuleChoiceFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1662:2: (iv_ruleChoiceFork= ruleChoiceFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1663:2: iv_ruleChoiceFork= ruleChoiceFork EOF
            {
             newCompositeNode(grammarAccess.getChoiceForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_entryRuleChoiceFork3588);
            iv_ruleChoiceFork=ruleChoiceFork();

            state._fsp--;

             current =iv_ruleChoiceFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceFork3598); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1670:1: ruleChoiceFork returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1673:28: ( (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1674:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1674:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1674:3: otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go' otherlv_6= 'to' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleChoiceFork3635); 

                	newLeafNode(otherlv_0, grammarAccess.getChoiceForkAccess().getIfKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1678:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1679:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1679:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1680:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getChoiceForkAccess().getOnChoiceCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork3658);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1693:2: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==24) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1693:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleChoiceFork3671); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChoiceForkAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1697:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1698:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1698:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1699:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceForkAccess().getOnChoiceCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork3694);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1712:4: (otherlv_4= 'then' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==51) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1712:6: otherlv_4= 'then'
                    {
                    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleChoiceFork3709); 

                        	newLeafNode(otherlv_4, grammarAccess.getChoiceForkAccess().getThenKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleChoiceFork3723); 

                	newLeafNode(otherlv_5, grammarAccess.getChoiceForkAccess().getGoKeyword_4());
                
            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleChoiceFork3735); 

                	newLeafNode(otherlv_6, grammarAccess.getChoiceForkAccess().getToKeyword_5());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1724:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1725:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1725:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1726:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getChoiceForkAccess().getQuestionsQuestionCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork3758);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1739:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==24) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1739:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleChoiceFork3771); 

            	        	newLeafNode(otherlv_8, grammarAccess.getChoiceForkAccess().getCommaKeyword_7_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1743:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1744:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1744:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1745:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceForkAccess().getQuestionsQuestionCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork3794);
            	    ruleEString();

            	    state._fsp--;

            	     
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1766:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1767:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1768:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3833);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3844); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1775:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1778:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1779:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1779:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1779:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1779:2: (kw= '-' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==53) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1780:2: kw= '-'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleEInt3883); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3900); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1800:1: entryRuleRatingFork returns [EObject current=null] : iv_ruleRatingFork= ruleRatingFork EOF ;
    public final EObject entryRuleRatingFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatingFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1801:2: (iv_ruleRatingFork= ruleRatingFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1802:2: iv_ruleRatingFork= ruleRatingFork EOF
            {
             newCompositeNode(grammarAccess.getRatingForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_entryRuleRatingFork3945);
            iv_ruleRatingFork=ruleRatingFork();

            state._fsp--;

             current =iv_ruleRatingFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRatingFork3955); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1809:1: ruleRatingFork returns [EObject current=null] : (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* ) ;
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
        AntlrDatatypeRuleToken lv_min_4_0 = null;

        AntlrDatatypeRuleToken lv_max_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1812:28: ( (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1813:1: (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1813:1: (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1813:3: otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? otherlv_8= 'go' otherlv_9= 'to' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleRatingFork3992); 

                	newLeafNode(otherlv_0, grammarAccess.getRatingForkAccess().getIfKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1817:1: (otherlv_1= 'it' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==54) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1817:3: otherlv_1= 'it'
                    {
                    otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleRatingFork4005); 

                        	newLeafNode(otherlv_1, grammarAccess.getRatingForkAccess().getItKeyword_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1821:3: (otherlv_2= 'is' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==16) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1821:5: otherlv_2= 'is'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRatingFork4020); 

                        	newLeafNode(otherlv_2, grammarAccess.getRatingForkAccess().getIsKeyword_2());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRatingFork4034); 

                	newLeafNode(otherlv_3, grammarAccess.getRatingForkAccess().getBetweenKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1829:1: ( (lv_min_4_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1830:1: (lv_min_4_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1830:1: (lv_min_4_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1831:3: lv_min_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getMinEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork4055);
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

            otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRatingFork4067); 

                	newLeafNode(otherlv_5, grammarAccess.getRatingForkAccess().getAndKeyword_5());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1851:1: ( (lv_max_6_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1852:1: (lv_max_6_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1852:1: (lv_max_6_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1853:3: lv_max_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getMaxEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork4088);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1869:2: (otherlv_7= 'then' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==51) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1869:4: otherlv_7= 'then'
                    {
                    otherlv_7=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleRatingFork4101); 

                        	newLeafNode(otherlv_7, grammarAccess.getRatingForkAccess().getThenKeyword_7());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleRatingFork4115); 

                	newLeafNode(otherlv_8, grammarAccess.getRatingForkAccess().getGoKeyword_8());
                
            otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRatingFork4127); 

                	newLeafNode(otherlv_9, grammarAccess.getRatingForkAccess().getToKeyword_9());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1881:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1882:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1882:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRatingForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getQuestionsQuestionCrossReference_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRatingFork4150);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1896:2: (otherlv_11= ',' ( ( ruleEString ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==24) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1896:4: otherlv_11= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRatingFork4163); 

            	        	newLeafNode(otherlv_11, grammarAccess.getRatingForkAccess().getCommaKeyword_11_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1900:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1901:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1901:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1902:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRatingForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRatingForkAccess().getQuestionsQuestionCrossReference_11_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRatingFork4186);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1923:1: entryRuleRankingSumFork returns [EObject current=null] : iv_ruleRankingSumFork= ruleRankingSumFork EOF ;
    public final EObject entryRuleRankingSumFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRankingSumFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1924:2: (iv_ruleRankingSumFork= ruleRankingSumFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1925:2: iv_ruleRankingSumFork= ruleRankingSumFork EOF
            {
             newCompositeNode(grammarAccess.getRankingSumForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_entryRuleRankingSumFork4224);
            iv_ruleRankingSumFork=ruleRankingSumFork();

            state._fsp--;

             current =iv_ruleRankingSumFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRankingSumFork4234); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1932:1: ruleRankingSumFork returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* ) ;
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
        AntlrDatatypeRuleToken lv_min_6_0 = null;

        AntlrDatatypeRuleToken lv_max_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1935:28: ( (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1936:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1936:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1936:3: otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? otherlv_10= 'go' otherlv_11= 'to' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleRankingSumFork4271); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingSumForkAccess().getIfKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1940:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1941:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1941:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1942:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getOnChoiceCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4294);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1955:2: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==24) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1955:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRankingSumFork4307); 

            	        	newLeafNode(otherlv_2, grammarAccess.getRankingSumForkAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1959:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1960:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1960:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1961:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getOnChoiceCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4330);
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

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRankingSumFork4344); 

                	newLeafNode(otherlv_4, grammarAccess.getRankingSumForkAccess().getIsKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1978:1: (otherlv_5= 'between' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==32) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1978:3: otherlv_5= 'between'
                    {
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRankingSumFork4357); 

                        	newLeafNode(otherlv_5, grammarAccess.getRankingSumForkAccess().getBetweenKeyword_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1982:3: ( (lv_min_6_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1983:1: (lv_min_6_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1983:1: (lv_min_6_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1984:3: lv_min_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getMinEIntParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingSumFork4380);
            lv_min_6_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRankingSumForkRule());
            	        }
                   		set(
                   			current, 
                   			"min",
                    		lv_min_6_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRankingSumFork4392); 

                	newLeafNode(otherlv_7, grammarAccess.getRankingSumForkAccess().getAndKeyword_6());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2004:1: ( (lv_max_8_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2005:1: (lv_max_8_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2005:1: (lv_max_8_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2006:3: lv_max_8_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getMaxEIntParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingSumFork4413);
            lv_max_8_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRankingSumForkRule());
            	        }
                   		set(
                   			current, 
                   			"max",
                    		lv_max_8_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2022:2: (otherlv_9= 'then' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==51) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2022:4: otherlv_9= 'then'
                    {
                    otherlv_9=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleRankingSumFork4426); 

                        	newLeafNode(otherlv_9, grammarAccess.getRankingSumForkAccess().getThenKeyword_8());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleRankingSumFork4440); 

                	newLeafNode(otherlv_10, grammarAccess.getRankingSumForkAccess().getGoKeyword_9());
                
            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRankingSumFork4452); 

                	newLeafNode(otherlv_11, grammarAccess.getRankingSumForkAccess().getToKeyword_10());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2034:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2035:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2035:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2036:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getQuestionsQuestionCrossReference_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4475);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2049:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==24) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2049:4: otherlv_13= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRankingSumFork4488); 

            	        	newLeafNode(otherlv_13, grammarAccess.getRankingSumForkAccess().getCommaKeyword_12_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2053:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2054:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2054:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2055:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getQuestionsQuestionCrossReference_12_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4511);
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
    // $ANTLR end "ruleRankingSumFork"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSurvey136 = new BitSet(new long[]{0x0001044060000802L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey163 = new BitSet(new long[]{0x0001044060000802L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey184 = new BitSet(new long[]{0x0001044060000802L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion223 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_ruleQuestion280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpen_in_ruleQuestion307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_Impl_in_ruleQuestion334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_ruleQuestion361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantSum_in_ruleQuestion388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStaple_in_ruleQuestion415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice575 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMultipleChoice631 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleChoice648 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMultipleChoice665 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_13_in_ruleMultipleChoice679 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleChoice693 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_15_in_ruleMultipleChoice708 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_16_in_ruleMultipleChoice733 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMultipleChoice758 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_18_in_ruleMultipleChoice774 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleMultipleChoice789 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice812 = new BitSet(new long[]{0x0000000000D00010L});
        public static final BitSet FOLLOW_20_in_ruleMultipleChoice825 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_21_in_ruleMultipleChoice838 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultipleChoice861 = new BitSet(new long[]{0x0000000000D00010L});
        public static final BitSet FOLLOW_22_in_ruleMultipleChoice876 = new BitSet(new long[]{0x0000000000D00010L});
        public static final BitSet FOLLOW_23_in_ruleMultipleChoice891 = new BitSet(new long[]{0x0000000000D00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice914 = new BitSet(new long[]{0x0004000003000002L});
        public static final BitSet FOLLOW_24_in_ruleMultipleChoice927 = new BitSet(new long[]{0x0000000000D00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice948 = new BitSet(new long[]{0x0004000003000002L});
        public static final BitSet FOLLOW_25_in_ruleMultipleChoice963 = new BitSet(new long[]{0x000000001C0DE030L});
        public static final BitSet FOLLOW_26_in_ruleMultipleChoice976 = new BitSet(new long[]{0x00000000180DE030L});
        public static final BitSet FOLLOW_27_in_ruleMultipleChoice991 = new BitSet(new long[]{0x00000000100DE030L});
        public static final BitSet FOLLOW_28_in_ruleMultipleChoice1006 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice1029 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1053 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1074 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleOpen_in_entryRuleOpen1113 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpen1123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleOpen1169 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOpen1186 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOpen1203 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_13_in_ruleOpen1217 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleOpen1231 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_15_in_ruleOpen1246 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_16_in_ruleOpen1271 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleOpen1296 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_18_in_ruleOpen1312 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleOpen1327 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpen1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1386 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRating_Impl1396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleRating_Impl1442 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRating_Impl1459 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRating_Impl1476 = new BitSet(new long[]{0x00000000800DE030L});
        public static final BitSet FOLLOW_13_in_ruleRating_Impl1490 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRating_Impl1504 = new BitSet(new long[]{0x00000000800DE030L});
        public static final BitSet FOLLOW_15_in_ruleRating_Impl1519 = new BitSet(new long[]{0x00000000800DE030L});
        public static final BitSet FOLLOW_16_in_ruleRating_Impl1538 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRating_Impl1550 = new BitSet(new long[]{0x00000000800DE030L});
        public static final BitSet FOLLOW_18_in_ruleRating_Impl1566 = new BitSet(new long[]{0x00000000800DE030L});
        public static final BitSet FOLLOW_31_in_ruleRating_Impl1581 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleRating_Impl1599 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1622 = new BitSet(new long[]{0x0020000100200040L});
        public static final BitSet FOLLOW_32_in_ruleRating_Impl1635 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1658 = new BitSet(new long[]{0x0020000200200040L});
        public static final BitSet FOLLOW_33_in_ruleRating_Impl1671 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1694 = new BitSet(new long[]{0x0000001C000DE030L});
        public static final BitSet FOLLOW_34_in_ruleRating_Impl1707 = new BitSet(new long[]{0x00000018000DE030L});
        public static final BitSet FOLLOW_35_in_ruleRating_Impl1722 = new BitSet(new long[]{0x00000010000DE030L});
        public static final BitSet FOLLOW_36_in_ruleRating_Impl1737 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1760 = new BitSet(new long[]{0x00000032000DE030L});
        public static final BitSet FOLLOW_33_in_ruleRating_Impl1773 = new BitSet(new long[]{0x00000030000DE030L});
        public static final BitSet FOLLOW_37_in_ruleRating_Impl1788 = new BitSet(new long[]{0x00000010000DE030L});
        public static final BitSet FOLLOW_36_in_ruleRating_Impl1803 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1826 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl1848 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl1869 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_entryRuleRanking1908 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRanking1918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleRanking1955 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRanking1972 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRanking1989 = new BitSet(new long[]{0x00000080000DE030L});
        public static final BitSet FOLLOW_13_in_ruleRanking2003 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRanking2017 = new BitSet(new long[]{0x00000080000DE030L});
        public static final BitSet FOLLOW_15_in_ruleRanking2032 = new BitSet(new long[]{0x00000080000DE030L});
        public static final BitSet FOLLOW_16_in_ruleRanking2057 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRanking2082 = new BitSet(new long[]{0x00000080000DE030L});
        public static final BitSet FOLLOW_18_in_ruleRanking2098 = new BitSet(new long[]{0x00000080000DE030L});
        public static final BitSet FOLLOW_39_in_ruleRanking2113 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleRanking2131 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRanking2154 = new BitSet(new long[]{0x0000030000D00010L});
        public static final BitSet FOLLOW_22_in_ruleRanking2167 = new BitSet(new long[]{0x0000030000D00010L});
        public static final BitSet FOLLOW_40_in_ruleRanking2182 = new BitSet(new long[]{0x0000000000D00010L});
        public static final BitSet FOLLOW_41_in_ruleRanking2200 = new BitSet(new long[]{0x0000000000D00010L});
        public static final BitSet FOLLOW_23_in_ruleRanking2215 = new BitSet(new long[]{0x0000000000D00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2238 = new BitSet(new long[]{0x0004000001000002L});
        public static final BitSet FOLLOW_24_in_ruleRanking2251 = new BitSet(new long[]{0x0000000000D00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2272 = new BitSet(new long[]{0x0004000001000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleRanking2296 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleRanking2317 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleConstantSum_in_entryRuleConstantSum2356 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantSum2366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleConstantSum2412 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantSum2429 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConstantSum2446 = new BitSet(new long[]{0x00000800000DE000L});
        public static final BitSet FOLLOW_13_in_ruleConstantSum2460 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleConstantSum2474 = new BitSet(new long[]{0x00000800000D8000L});
        public static final BitSet FOLLOW_15_in_ruleConstantSum2489 = new BitSet(new long[]{0x00000800000C0000L});
        public static final BitSet FOLLOW_16_in_ruleConstantSum2514 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConstantSum2539 = new BitSet(new long[]{0x00000800000C0000L});
        public static final BitSet FOLLOW_18_in_ruleConstantSum2555 = new BitSet(new long[]{0x0000080000080000L});
        public static final BitSet FOLLOW_43_in_ruleConstantSum2570 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleConstantSum2588 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstantSum2610 = new BitSet(new long[]{0x0000B00000040000L});
        public static final BitSet FOLLOW_18_in_ruleConstantSum2625 = new BitSet(new long[]{0x0000300000000000L});
        public static final BitSet FOLLOW_44_in_ruleConstantSum2640 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleConstantSum2654 = new BitSet(new long[]{0x0020400000200040L});
        public static final BitSet FOLLOW_46_in_ruleConstantSum2667 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleConstantSum2691 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleConstantSum2705 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleConstantSum2717 = new BitSet(new long[]{0x0000000000D00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleConstantSum2738 = new BitSet(new long[]{0x0004000001000002L});
        public static final BitSet FOLLOW_24_in_ruleConstantSum2751 = new BitSet(new long[]{0x0000000000D00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleConstantSum2772 = new BitSet(new long[]{0x0004000001000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleConstantSum2796 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleConstantSum2817 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleStaple_in_entryRuleStaple2856 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStaple2866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleStaple2912 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStaple2929 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStaple2946 = new BitSet(new long[]{0x00000000800DE000L});
        public static final BitSet FOLLOW_13_in_ruleStaple2960 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleStaple2974 = new BitSet(new long[]{0x00000000800D8000L});
        public static final BitSet FOLLOW_15_in_ruleStaple2989 = new BitSet(new long[]{0x00000000800C0000L});
        public static final BitSet FOLLOW_16_in_ruleStaple3014 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleStaple3039 = new BitSet(new long[]{0x00000000800C0000L});
        public static final BitSet FOLLOW_18_in_ruleStaple3055 = new BitSet(new long[]{0x0000000080080000L});
        public static final BitSet FOLLOW_31_in_ruleStaple3070 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleStaple3088 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3110 = new BitSet(new long[]{0x0020000100200040L});
        public static final BitSet FOLLOW_32_in_ruleStaple3123 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStaple3146 = new BitSet(new long[]{0x0020000200200040L});
        public static final BitSet FOLLOW_33_in_ruleStaple3159 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStaple3182 = new BitSet(new long[]{0x0000001C000DE030L});
        public static final BitSet FOLLOW_34_in_ruleStaple3195 = new BitSet(new long[]{0x00000018000DE030L});
        public static final BitSet FOLLOW_35_in_ruleStaple3210 = new BitSet(new long[]{0x00000010000DE030L});
        public static final BitSet FOLLOW_36_in_ruleStaple3225 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3248 = new BitSet(new long[]{0x00020010010DE030L});
        public static final BitSet FOLLOW_24_in_ruleStaple3261 = new BitSet(new long[]{0x00020010000DE030L});
        public static final BitSet FOLLOW_49_in_ruleStaple3276 = new BitSet(new long[]{0x00000010000DE030L});
        public static final BitSet FOLLOW_36_in_ruleStaple3291 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3314 = new BitSet(new long[]{0x00000032000DE030L});
        public static final BitSet FOLLOW_33_in_ruleStaple3327 = new BitSet(new long[]{0x00000030000DE030L});
        public static final BitSet FOLLOW_37_in_ruleStaple3342 = new BitSet(new long[]{0x00000010000DE030L});
        public static final BitSet FOLLOW_36_in_ruleStaple3357 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3380 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3402 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3423 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice3462 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoice3472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleChoice3514 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleChoice3531 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoice3552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_entryRuleChoiceFork3588 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceFork3598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleChoiceFork3635 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork3658 = new BitSet(new long[]{0x0018000001000000L});
        public static final BitSet FOLLOW_24_in_ruleChoiceFork3671 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork3694 = new BitSet(new long[]{0x0018000001000000L});
        public static final BitSet FOLLOW_51_in_ruleChoiceFork3709 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleChoiceFork3723 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleChoiceFork3735 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork3758 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleChoiceFork3771 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork3794 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3833 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleEInt3883 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_entryRuleRatingFork3945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRatingFork3955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleRatingFork3992 = new BitSet(new long[]{0x0040000100010000L});
        public static final BitSet FOLLOW_54_in_ruleRatingFork4005 = new BitSet(new long[]{0x0000000100010000L});
        public static final BitSet FOLLOW_16_in_ruleRatingFork4020 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleRatingFork4034 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork4055 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleRatingFork4067 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork4088 = new BitSet(new long[]{0x0018000000000000L});
        public static final BitSet FOLLOW_51_in_ruleRatingFork4101 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleRatingFork4115 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRatingFork4127 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRatingFork4150 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleRatingFork4163 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRatingFork4186 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_entryRuleRankingSumFork4224 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRankingSumFork4234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleRankingSumFork4271 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4294 = new BitSet(new long[]{0x0000000001010000L});
        public static final BitSet FOLLOW_24_in_ruleRankingSumFork4307 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4330 = new BitSet(new long[]{0x0000000001010000L});
        public static final BitSet FOLLOW_16_in_ruleRankingSumFork4344 = new BitSet(new long[]{0x0020000100200040L});
        public static final BitSet FOLLOW_32_in_ruleRankingSumFork4357 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingSumFork4380 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleRankingSumFork4392 = new BitSet(new long[]{0x0020000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingSumFork4413 = new BitSet(new long[]{0x0018000000000000L});
        public static final BitSet FOLLOW_51_in_ruleRankingSumFork4426 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleRankingSumFork4440 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRankingSumFork4452 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4475 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleRankingSumFork4488 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4511 = new BitSet(new long[]{0x0000000001000002L});
    }


}