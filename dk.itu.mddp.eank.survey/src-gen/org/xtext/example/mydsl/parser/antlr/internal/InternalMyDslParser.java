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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MultipleChoice'", "':'", "'the'", "'user'", "'may'", "'is'", "'required'", "'to'", "'answer'", "'by'", "'picking'", "'up to'", "'of'", "'these'", "','", "'or'", "'Open'", "'Rating'", "'rate'", "'between'", "'and'", "'where'", "'lowest'", "'means'", "'highest'", "'Ranking'", "'rank'", "'ConstantSum'", "'distribute'", "'a'", "'total'", "'Staple'", "'middle'", "'if'", "'then'", "'continue'", "'with'", "'-'", "'it'"
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
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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

            if ( (LA2_0==11||(LA2_0>=27 && LA2_0<=28)||LA2_0==36||LA2_0==38||LA2_0==42) ) {
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

                        if ( (LA1_0==11||(LA1_0>=27 && LA1_0<=28)||LA1_0==36||LA1_0==38||LA1_0==42) ) {
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
            case 27:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 36:
                {
                alt3=4;
                }
                break;
            case 38:
                {
                alt3=5;
                }
                break;
            case 42:
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:1: ruleMultipleChoice returns [EObject current=null] : ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) ( (otherlv_12= 'by' )? otherlv_13= 'picking' (otherlv_14= 'up to' )? ( (lv_answerCount_15_0= ruleEInt ) ) )? (otherlv_16= 'of' )? (otherlv_17= 'these' )? ( (lv_choice_18_0= ruleChoice ) ) (otherlv_19= ',' ( (lv_choice_20_0= ruleChoice ) ) )* (otherlv_21= 'or' ( (lv_other_22_0= ruleEString ) ) )? ( ( (lv_forks_23_0= ruleChoiceFork ) ) ( (lv_forks_24_0= ruleChoiceFork ) )* )? ) ;
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
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_question_11_0 = null;

        AntlrDatatypeRuleToken lv_answerCount_15_0 = null;

        EObject lv_choice_18_0 = null;

        EObject lv_choice_20_0 = null;

        AntlrDatatypeRuleToken lv_other_22_0 = null;

        EObject lv_forks_23_0 = null;

        EObject lv_forks_24_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:278:28: ( ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) ( (otherlv_12= 'by' )? otherlv_13= 'picking' (otherlv_14= 'up to' )? ( (lv_answerCount_15_0= ruleEInt ) ) )? (otherlv_16= 'of' )? (otherlv_17= 'these' )? ( (lv_choice_18_0= ruleChoice ) ) (otherlv_19= ',' ( (lv_choice_20_0= ruleChoice ) ) )* (otherlv_21= 'or' ( (lv_other_22_0= ruleEString ) ) )? ( ( (lv_forks_23_0= ruleChoiceFork ) ) ( (lv_forks_24_0= ruleChoiceFork ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:279:1: ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) ( (otherlv_12= 'by' )? otherlv_13= 'picking' (otherlv_14= 'up to' )? ( (lv_answerCount_15_0= ruleEInt ) ) )? (otherlv_16= 'of' )? (otherlv_17= 'these' )? ( (lv_choice_18_0= ruleChoice ) ) (otherlv_19= ',' ( (lv_choice_20_0= ruleChoice ) ) )* (otherlv_21= 'or' ( (lv_other_22_0= ruleEString ) ) )? ( ( (lv_forks_23_0= ruleChoiceFork ) ) ( (lv_forks_24_0= ruleChoiceFork ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:279:1: ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) ( (otherlv_12= 'by' )? otherlv_13= 'picking' (otherlv_14= 'up to' )? ( (lv_answerCount_15_0= ruleEInt ) ) )? (otherlv_16= 'of' )? (otherlv_17= 'these' )? ( (lv_choice_18_0= ruleChoice ) ) (otherlv_19= ',' ( (lv_choice_20_0= ruleChoice ) ) )* (otherlv_21= 'or' ( (lv_other_22_0= ruleEString ) ) )? ( ( (lv_forks_23_0= ruleChoiceFork ) ) ( (lv_forks_24_0= ruleChoiceFork ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:279:2: () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) ( (otherlv_12= 'by' )? otherlv_13= 'picking' (otherlv_14= 'up to' )? ( (lv_answerCount_15_0= ruleEInt ) ) )? (otherlv_16= 'of' )? (otherlv_17= 'these' )? ( (lv_choice_18_0= ruleChoice ) ) (otherlv_19= ',' ( (lv_choice_20_0= ruleChoice ) ) )* (otherlv_21= 'or' ( (lv_other_22_0= ruleEString ) ) )? ( ( (lv_forks_23_0= ruleChoiceFork ) ) ( (lv_forks_24_0= ruleChoiceFork ) )* )?
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:2: ( (otherlv_12= 'by' )? otherlv_13= 'picking' (otherlv_14= 'up to' )? ( (lv_answerCount_15_0= ruleEInt ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=20 && LA12_0<=21)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:3: (otherlv_12= 'by' )? otherlv_13= 'picking' (otherlv_14= 'up to' )? ( (lv_answerCount_15_0= ruleEInt ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:3: (otherlv_12= 'by' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==20) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:5: otherlv_12= 'by'
                            {
                            otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultipleChoice826); 

                                	newLeafNode(otherlv_12, grammarAccess.getMultipleChoiceAccess().getByKeyword_9_0());
                                

                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultipleChoice840); 

                        	newLeafNode(otherlv_13, grammarAccess.getMultipleChoiceAccess().getPickingKeyword_9_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:377:1: (otherlv_14= 'up to' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==22) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:377:3: otherlv_14= 'up to'
                            {
                            otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMultipleChoice853); 

                                	newLeafNode(otherlv_14, grammarAccess.getMultipleChoiceAccess().getUpToKeyword_9_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:381:3: ( (lv_answerCount_15_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:382:1: (lv_answerCount_15_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:382:1: (lv_answerCount_15_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:383:3: lv_answerCount_15_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getAnswerCountEIntParserRuleCall_9_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultipleChoice876);
                    lv_answerCount_15_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		set(
                           			current, 
                           			"answerCount",
                            		lv_answerCount_15_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:399:4: (otherlv_16= 'of' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:399:6: otherlv_16= 'of'
                    {
                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMultipleChoice891); 

                        	newLeafNode(otherlv_16, grammarAccess.getMultipleChoiceAccess().getOfKeyword_10());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:403:3: (otherlv_17= 'these' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:403:5: otherlv_17= 'these'
                    {
                    otherlv_17=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultipleChoice906); 

                        	newLeafNode(otherlv_17, grammarAccess.getMultipleChoiceAccess().getTheseKeyword_11());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:407:3: ( (lv_choice_18_0= ruleChoice ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:408:1: (lv_choice_18_0= ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:408:1: (lv_choice_18_0= ruleChoice )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:409:3: lv_choice_18_0= ruleChoice
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice929);
            lv_choice_18_0=ruleChoice();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
            	        }
                   		add(
                   			current, 
                   			"choice",
                    		lv_choice_18_0, 
                    		"Choice");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:425:2: (otherlv_19= ',' ( (lv_choice_20_0= ruleChoice ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:425:4: otherlv_19= ',' ( (lv_choice_20_0= ruleChoice ) )
            	    {
            	    otherlv_19=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultipleChoice942); 

            	        	newLeafNode(otherlv_19, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_13_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:429:1: ( (lv_choice_20_0= ruleChoice ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:430:1: (lv_choice_20_0= ruleChoice )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:430:1: (lv_choice_20_0= ruleChoice )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:431:3: lv_choice_20_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_13_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice963);
            	    lv_choice_20_0=ruleChoice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"choice",
            	            		lv_choice_20_0, 
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:447:4: (otherlv_21= 'or' ( (lv_other_22_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:447:6: otherlv_21= 'or' ( (lv_other_22_0= ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleChoice978); 

                        	newLeafNode(otherlv_21, grammarAccess.getMultipleChoiceAccess().getOrKeyword_14_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:451:1: ( (lv_other_22_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:452:1: (lv_other_22_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:452:1: (lv_other_22_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:453:3: lv_other_22_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getOtherEStringParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice999);
                    lv_other_22_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		set(
                           			current, 
                           			"other",
                            		lv_other_22_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:469:4: ( ( (lv_forks_23_0= ruleChoiceFork ) ) ( (lv_forks_24_0= ruleChoiceFork ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:469:5: ( (lv_forks_23_0= ruleChoiceFork ) ) ( (lv_forks_24_0= ruleChoiceFork ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:469:5: ( (lv_forks_23_0= ruleChoiceFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:470:1: (lv_forks_23_0= ruleChoiceFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:470:1: (lv_forks_23_0= ruleChoiceFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:471:3: lv_forks_23_0= ruleChoiceFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getForksChoiceForkParserRuleCall_15_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1023);
                    lv_forks_23_0=ruleChoiceFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		add(
                           			current, 
                           			"forks",
                            		lv_forks_23_0, 
                            		"ChoiceFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:487:2: ( (lv_forks_24_0= ruleChoiceFork ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==44) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:488:1: (lv_forks_24_0= ruleChoiceFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:488:1: (lv_forks_24_0= ruleChoiceFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:489:3: lv_forks_24_0= ruleChoiceFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getForksChoiceForkParserRuleCall_15_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1044);
                    	    lv_forks_24_0=ruleChoiceFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forks",
                    	            		lv_forks_24_0, 
                    	            		"ChoiceFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:513:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:514:2: (iv_ruleOpen= ruleOpen EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:2: iv_ruleOpen= ruleOpen EOF
            {
             newCompositeNode(grammarAccess.getOpenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpen_in_entryRuleOpen1083);
            iv_ruleOpen=ruleOpen();

            state._fsp--;

             current =iv_ruleOpen; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpen1093); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:522:1: ruleOpen returns [EObject current=null] : ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:525:28: ( ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:526:1: ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:526:1: ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:526:2: () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:526:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:527:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOpenAccess().getOpenAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleOpen1139); 

                	newLeafNode(otherlv_1, grammarAccess.getOpenAccess().getOpenKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:536:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:537:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:537:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:538:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOpen1156); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOpen1173); 

                	newLeafNode(otherlv_3, grammarAccess.getOpenAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=13 && LA20_0<=14)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:2: (otherlv_4= 'the' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==13) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:558:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOpen1187); 

                                	newLeafNode(otherlv_4, grammarAccess.getOpenAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOpen1201); 

                        	newLeafNode(otherlv_5, grammarAccess.getOpenAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            else if ( (LA21_0==16) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:566:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOpen1216); 

                        	newLeafNode(otherlv_6, grammarAccess.getOpenAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:571:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:571:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:571:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:571:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:572:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:572:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:573:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOpen1241); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getOpenAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOpenRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOpen1266); 

                        	newLeafNode(otherlv_8, grammarAccess.getOpenAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:590:4: (otherlv_9= 'to' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:590:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOpen1282); 

                        	newLeafNode(otherlv_9, grammarAccess.getOpenAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:3: (otherlv_10= 'answer' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:5: otherlv_10= 'answer'
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOpen1297); 

                        	newLeafNode(otherlv_10, grammarAccess.getOpenAccess().getAnswerKeyword_7());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:598:3: ( (lv_question_11_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:599:1: (lv_question_11_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:599:1: (lv_question_11_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:600:3: lv_question_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOpenAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpen1320);
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:624:1: entryRuleRating_Impl returns [EObject current=null] : iv_ruleRating_Impl= ruleRating_Impl EOF ;
    public final EObject entryRuleRating_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating_Impl = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:625:2: (iv_ruleRating_Impl= ruleRating_Impl EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:626:2: iv_ruleRating_Impl= ruleRating_Impl EOF
            {
             newCompositeNode(grammarAccess.getRating_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1356);
            iv_ruleRating_Impl=ruleRating_Impl();

            state._fsp--;

             current =iv_ruleRating_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRating_Impl1366); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:633:1: ruleRating_Impl returns [EObject current=null] : ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )? ) ;
    public final EObject ruleRating_Impl() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_question_12_0 = null;

        AntlrDatatypeRuleToken lv_min_14_0 = null;

        AntlrDatatypeRuleToken lv_max_16_0 = null;

        AntlrDatatypeRuleToken lv_first_20_0 = null;

        AntlrDatatypeRuleToken lv_last_24_0 = null;

        EObject lv_forks_25_0 = null;

        EObject lv_forks_26_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:636:28: ( ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:1: ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:1: ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:2: () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'between' )? ( (lv_min_14_0= ruleEInt ) ) (otherlv_15= 'and' )? ( (lv_max_16_0= ruleEInt ) ) (otherlv_17= 'where' )? (otherlv_18= 'lowest' )? (otherlv_19= 'means' )? ( (lv_first_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:637:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:638:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRating_ImplAccess().getRatingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRating_Impl1412); 

                	newLeafNode(otherlv_1, grammarAccess.getRating_ImplAccess().getRatingKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:647:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:649:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRating_Impl1429); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRating_Impl1446); 

                	newLeafNode(otherlv_3, grammarAccess.getRating_ImplAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:669:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=13 && LA25_0<=14)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:669:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:669:2: (otherlv_4= 'the' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==13) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:669:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRating_Impl1460); 

                                	newLeafNode(otherlv_4, grammarAccess.getRating_ImplAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRating_Impl1474); 

                        	newLeafNode(otherlv_5, grammarAccess.getRating_ImplAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==15) ) {
                alt26=1;
            }
            else if ( (LA26_0==16) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:677:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRating_Impl1489); 

                        	newLeafNode(otherlv_6, grammarAccess.getRating_ImplAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:682:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:682:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:682:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:682:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:684:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRating_Impl1514); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getRating_ImplAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRating_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRating_Impl1539); 

                        	newLeafNode(otherlv_8, grammarAccess.getRating_ImplAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:4: (otherlv_9= 'to' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRating_Impl1555); 

                        	newLeafNode(otherlv_9, grammarAccess.getRating_ImplAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:705:3: (otherlv_10= 'rate' | otherlv_11= 'answer' )?
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            else if ( (LA28_0==19) ) {
                alt28=2;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:705:5: otherlv_10= 'rate'
                    {
                    otherlv_10=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRating_Impl1570); 

                        	newLeafNode(otherlv_10, grammarAccess.getRating_ImplAccess().getRateKeyword_7_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:710:7: otherlv_11= 'answer'
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRating_Impl1588); 

                        	newLeafNode(otherlv_11, grammarAccess.getRating_ImplAccess().getAnswerKeyword_7_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:3: ( (lv_question_12_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:715:1: (lv_question_12_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:715:1: (lv_question_12_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:716:3: lv_question_12_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1611);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:732:2: (otherlv_13= 'between' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:732:4: otherlv_13= 'between'
                    {
                    otherlv_13=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRating_Impl1624); 

                        	newLeafNode(otherlv_13, grammarAccess.getRating_ImplAccess().getBetweenKeyword_9());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:3: ( (lv_min_14_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:1: (lv_min_14_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:1: (lv_min_14_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:738:3: lv_min_14_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMinEIntParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1647);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:754:2: (otherlv_15= 'and' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:754:4: otherlv_15= 'and'
                    {
                    otherlv_15=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRating_Impl1660); 

                        	newLeafNode(otherlv_15, grammarAccess.getRating_ImplAccess().getAndKeyword_11());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:758:3: ( (lv_max_16_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:759:1: (lv_max_16_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:759:1: (lv_max_16_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:760:3: lv_max_16_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMaxEIntParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1683);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:776:2: (otherlv_17= 'where' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:776:4: otherlv_17= 'where'
                    {
                    otherlv_17=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRating_Impl1696); 

                        	newLeafNode(otherlv_17, grammarAccess.getRating_ImplAccess().getWhereKeyword_13());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:780:3: (otherlv_18= 'lowest' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:780:5: otherlv_18= 'lowest'
                    {
                    otherlv_18=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRating_Impl1711); 

                        	newLeafNode(otherlv_18, grammarAccess.getRating_ImplAccess().getLowestKeyword_14());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:784:3: (otherlv_19= 'means' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:784:5: otherlv_19= 'means'
                    {
                    otherlv_19=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRating_Impl1726); 

                        	newLeafNode(otherlv_19, grammarAccess.getRating_ImplAccess().getMeansKeyword_15());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:788:3: ( (lv_first_20_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:789:1: (lv_first_20_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:789:1: (lv_first_20_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:790:3: lv_first_20_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getFirstEStringParserRuleCall_16_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1749);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:806:2: (otherlv_21= 'and' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:806:4: otherlv_21= 'and'
                    {
                    otherlv_21=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRating_Impl1762); 

                        	newLeafNode(otherlv_21, grammarAccess.getRating_ImplAccess().getAndKeyword_17());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:810:3: (otherlv_22= 'highest' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:810:5: otherlv_22= 'highest'
                    {
                    otherlv_22=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRating_Impl1777); 

                        	newLeafNode(otherlv_22, grammarAccess.getRating_ImplAccess().getHighestKeyword_18());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:814:3: (otherlv_23= 'means' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:814:5: otherlv_23= 'means'
                    {
                    otherlv_23=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRating_Impl1792); 

                        	newLeafNode(otherlv_23, grammarAccess.getRating_ImplAccess().getMeansKeyword_19());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:818:3: ( (lv_last_24_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:819:1: (lv_last_24_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:819:1: (lv_last_24_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:820:3: lv_last_24_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRating_ImplAccess().getLastEStringParserRuleCall_20_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1815);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:836:2: ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:836:3: ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:836:3: ( (lv_forks_25_0= ruleRatingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:837:1: (lv_forks_25_0= ruleRatingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:837:1: (lv_forks_25_0= ruleRatingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:838:3: lv_forks_25_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getForksRatingForkParserRuleCall_21_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl1837);
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

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:854:2: ( (lv_forks_26_0= ruleRatingFork ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==44) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:855:1: (lv_forks_26_0= ruleRatingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:855:1: (lv_forks_26_0= ruleRatingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:3: lv_forks_26_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getForksRatingForkParserRuleCall_21_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl1858);
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
                    	    break loop37;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:880:1: entryRuleRanking returns [EObject current=null] : iv_ruleRanking= ruleRanking EOF ;
    public final EObject entryRuleRanking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRanking = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:2: (iv_ruleRanking= ruleRanking EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:882:2: iv_ruleRanking= ruleRanking EOF
            {
             newCompositeNode(grammarAccess.getRankingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRanking_in_entryRuleRanking1897);
            iv_ruleRanking=ruleRanking();

            state._fsp--;

             current =iv_ruleRanking; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRanking1907); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:1: ruleRanking returns [EObject current=null] : (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'these' )? ( (lv_choices_13_0= ruleChoice ) ) (otherlv_14= ',' ( (lv_choices_15_0= ruleChoice ) ) )* ( ( (lv_forks_16_0= ruleRankingSumFork ) ) ( (lv_forks_17_0= ruleRankingSumFork ) )* )? ) ;
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
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_question_11_0 = null;

        EObject lv_choices_13_0 = null;

        EObject lv_choices_15_0 = null;

        EObject lv_forks_16_0 = null;

        EObject lv_forks_17_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:892:28: ( (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'these' )? ( (lv_choices_13_0= ruleChoice ) ) (otherlv_14= ',' ( (lv_choices_15_0= ruleChoice ) ) )* ( ( (lv_forks_16_0= ruleRankingSumFork ) ) ( (lv_forks_17_0= ruleRankingSumFork ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:893:1: (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'these' )? ( (lv_choices_13_0= ruleChoice ) ) (otherlv_14= ',' ( (lv_choices_15_0= ruleChoice ) ) )* ( ( (lv_forks_16_0= ruleRankingSumFork ) ) ( (lv_forks_17_0= ruleRankingSumFork ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:893:1: (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'these' )? ( (lv_choices_13_0= ruleChoice ) ) (otherlv_14= ',' ( (lv_choices_15_0= ruleChoice ) ) )* ( ( (lv_forks_16_0= ruleRankingSumFork ) ) ( (lv_forks_17_0= ruleRankingSumFork ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:893:3: otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= 'the' )? otherlv_4= 'user' )? (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )? (otherlv_8= 'to' )? (otherlv_9= 'rank' | otherlv_10= 'answer' )? ( (lv_question_11_0= ruleEString ) ) (otherlv_12= 'these' )? ( (lv_choices_13_0= ruleChoice ) ) (otherlv_14= ',' ( (lv_choices_15_0= ruleChoice ) ) )* ( ( (lv_forks_16_0= ruleRankingSumFork ) ) ( (lv_forks_17_0= ruleRankingSumFork ) )* )?
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRanking1944); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingAccess().getRankingKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:897:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:898:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:898:1: (lv_name_1_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:899:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRanking1961); 

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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRanking1978); 

                	newLeafNode(otherlv_2, grammarAccess.getRankingAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:919:1: ( (otherlv_3= 'the' )? otherlv_4= 'user' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=13 && LA40_0<=14)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:919:2: (otherlv_3= 'the' )? otherlv_4= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:919:2: (otherlv_3= 'the' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==13) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:919:4: otherlv_3= 'the'
                            {
                            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRanking1992); 

                                	newLeafNode(otherlv_3, grammarAccess.getRankingAccess().getTheKeyword_3_0());
                                

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRanking2006); 

                        	newLeafNode(otherlv_4, grammarAccess.getRankingAccess().getUserKeyword_3_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:927:3: (otherlv_5= 'may' | ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' ) )?
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==15) ) {
                alt41=1;
            }
            else if ( (LA41_0==16) ) {
                alt41=2;
            }
            switch (alt41) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:927:5: otherlv_5= 'may'
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRanking2021); 

                        	newLeafNode(otherlv_5, grammarAccess.getRankingAccess().getMayKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:932:6: ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:932:6: ( ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:932:7: ( (lv_isRequired_6_0= 'is' ) ) otherlv_7= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:932:7: ( (lv_isRequired_6_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:933:1: (lv_isRequired_6_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:933:1: (lv_isRequired_6_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:934:3: lv_isRequired_6_0= 'is'
                    {
                    lv_isRequired_6_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRanking2046); 

                            newLeafNode(lv_isRequired_6_0, grammarAccess.getRankingAccess().getIsRequiredIsKeyword_4_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRankingRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRanking2071); 

                        	newLeafNode(otherlv_7, grammarAccess.getRankingAccess().getRequiredKeyword_4_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:951:4: (otherlv_8= 'to' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==18) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:951:6: otherlv_8= 'to'
                    {
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRanking2087); 

                        	newLeafNode(otherlv_8, grammarAccess.getRankingAccess().getToKeyword_5());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:955:3: (otherlv_9= 'rank' | otherlv_10= 'answer' )?
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            else if ( (LA43_0==19) ) {
                alt43=2;
            }
            switch (alt43) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:955:5: otherlv_9= 'rank'
                    {
                    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleRanking2102); 

                        	newLeafNode(otherlv_9, grammarAccess.getRankingAccess().getRankKeyword_6_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:960:7: otherlv_10= 'answer'
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRanking2120); 

                        	newLeafNode(otherlv_10, grammarAccess.getRankingAccess().getAnswerKeyword_6_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:3: ( (lv_question_11_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:965:1: (lv_question_11_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:965:1: (lv_question_11_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:3: lv_question_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRankingAccess().getQuestionEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRanking2143);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:982:2: (otherlv_12= 'these' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==24) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:982:4: otherlv_12= 'these'
                    {
                    otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRanking2156); 

                        	newLeafNode(otherlv_12, grammarAccess.getRankingAccess().getTheseKeyword_8());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:986:3: ( (lv_choices_13_0= ruleChoice ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:987:1: (lv_choices_13_0= ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:987:1: (lv_choices_13_0= ruleChoice )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:3: lv_choices_13_0= ruleChoice
            {
             
            	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2179);
            lv_choices_13_0=ruleChoice();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRankingRule());
            	        }
                   		add(
                   			current, 
                   			"choices",
                    		lv_choices_13_0, 
                    		"Choice");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:2: (otherlv_14= ',' ( (lv_choices_15_0= ruleChoice ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==25) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:4: otherlv_14= ',' ( (lv_choices_15_0= ruleChoice ) )
            	    {
            	    otherlv_14=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRanking2192); 

            	        	newLeafNode(otherlv_14, grammarAccess.getRankingAccess().getCommaKeyword_10_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1008:1: ( (lv_choices_15_0= ruleChoice ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1009:1: (lv_choices_15_0= ruleChoice )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1009:1: (lv_choices_15_0= ruleChoice )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1010:3: lv_choices_15_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2213);
            	    lv_choices_15_0=ruleChoice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRankingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"choices",
            	            		lv_choices_15_0, 
            	            		"Choice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1026:4: ( ( (lv_forks_16_0= ruleRankingSumFork ) ) ( (lv_forks_17_0= ruleRankingSumFork ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==44) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1026:5: ( (lv_forks_16_0= ruleRankingSumFork ) ) ( (lv_forks_17_0= ruleRankingSumFork ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1026:5: ( (lv_forks_16_0= ruleRankingSumFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1027:1: (lv_forks_16_0= ruleRankingSumFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1027:1: (lv_forks_16_0= ruleRankingSumFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1028:3: lv_forks_16_0= ruleRankingSumFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getForksRankingSumForkParserRuleCall_11_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleRanking2237);
                    lv_forks_16_0=ruleRankingSumFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		add(
                           			current, 
                           			"forks",
                            		lv_forks_16_0, 
                            		"RankingSumFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1044:2: ( (lv_forks_17_0= ruleRankingSumFork ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==44) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1045:1: (lv_forks_17_0= ruleRankingSumFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1045:1: (lv_forks_17_0= ruleRankingSumFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1046:3: lv_forks_17_0= ruleRankingSumFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingAccess().getForksRankingSumForkParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleRanking2258);
                    	    lv_forks_17_0=ruleRankingSumFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forks",
                    	            		lv_forks_17_0, 
                    	            		"RankingSumFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1070:1: entryRuleConstantSum returns [EObject current=null] : iv_ruleConstantSum= ruleConstantSum EOF ;
    public final EObject entryRuleConstantSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSum = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:2: (iv_ruleConstantSum= ruleConstantSum EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:2: iv_ruleConstantSum= ruleConstantSum EOF
            {
             newCompositeNode(grammarAccess.getConstantSumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantSum_in_entryRuleConstantSum2297);
            iv_ruleConstantSum=ruleConstantSum();

            state._fsp--;

             current =iv_ruleConstantSum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantSum2307); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:1: ruleConstantSum returns [EObject current=null] : ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_constant_17_0= ruleEInt ) ) )? (otherlv_18= 'these' )? ( (lv_choices_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choices_21_0= ruleChoice ) ) )* ( ( (lv_forks_22_0= ruleRankingSumFork ) ) ( (lv_forks_23_0= ruleRankingSumFork ) )* )? ) ;
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
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_question_12_0 = null;

        AntlrDatatypeRuleToken lv_constant_17_0 = null;

        EObject lv_choices_19_0 = null;

        EObject lv_choices_21_0 = null;

        EObject lv_forks_22_0 = null;

        EObject lv_forks_23_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1082:28: ( ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_constant_17_0= ruleEInt ) ) )? (otherlv_18= 'these' )? ( (lv_choices_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choices_21_0= ruleChoice ) ) )* ( ( (lv_forks_22_0= ruleRankingSumFork ) ) ( (lv_forks_23_0= ruleRankingSumFork ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:1: ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_constant_17_0= ruleEInt ) ) )? (otherlv_18= 'these' )? ( (lv_choices_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choices_21_0= ruleChoice ) ) )* ( ( (lv_forks_22_0= ruleRankingSumFork ) ) ( (lv_forks_23_0= ruleRankingSumFork ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:1: ( () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_constant_17_0= ruleEInt ) ) )? (otherlv_18= 'these' )? ( (lv_choices_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choices_21_0= ruleChoice ) ) )* ( ( (lv_forks_22_0= ruleRankingSumFork ) ) ( (lv_forks_23_0= ruleRankingSumFork ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:2: () otherlv_1= 'ConstantSum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'distribute' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_constant_17_0= ruleEInt ) ) )? (otherlv_18= 'these' )? ( (lv_choices_19_0= ruleChoice ) ) (otherlv_20= ',' ( (lv_choices_21_0= ruleChoice ) ) )* ( ( (lv_forks_22_0= ruleRankingSumFork ) ) ( (lv_forks_23_0= ruleRankingSumFork ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1084:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstantSumAccess().getConstantSumAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleConstantSum2353); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantSumAccess().getConstantSumKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1095:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantSum2370); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConstantSum2387); 

                	newLeafNode(otherlv_3, grammarAccess.getConstantSumAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=13 && LA49_0<=14)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:2: (otherlv_4= 'the' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==13) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstantSum2401); 

                                	newLeafNode(otherlv_4, grammarAccess.getConstantSumAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConstantSum2415); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstantSumAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1123:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==15) ) {
                alt50=1;
            }
            else if ( (LA50_0==16) ) {
                alt50=2;
            }
            switch (alt50) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1123:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConstantSum2430); 

                        	newLeafNode(otherlv_6, grammarAccess.getConstantSumAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1129:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1129:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1130:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConstantSum2455); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getConstantSumAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantSumRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConstantSum2480); 

                        	newLeafNode(otherlv_8, grammarAccess.getConstantSumAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1147:4: (otherlv_9= 'to' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==18) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1147:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstantSum2496); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstantSumAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1151:3: (otherlv_10= 'distribute' | otherlv_11= 'answer' )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==39) ) {
                alt52=1;
            }
            else if ( (LA52_0==19) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1151:5: otherlv_10= 'distribute'
                    {
                    otherlv_10=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleConstantSum2511); 

                        	newLeafNode(otherlv_10, grammarAccess.getConstantSumAccess().getDistributeKeyword_7_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1156:7: otherlv_11= 'answer'
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConstantSum2529); 

                        	newLeafNode(otherlv_11, grammarAccess.getConstantSumAccess().getAnswerKeyword_7_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1160:3: ( (lv_question_12_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1161:1: (lv_question_12_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1161:1: (lv_question_12_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1162:3: lv_question_12_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConstantSumAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstantSum2552);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:2: ( ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_constant_17_0= ruleEInt ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==18||(LA56_0>=40 && LA56_0<=41)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:3: ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? ) ( (lv_constant_17_0= ruleEInt ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:3: ( (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )? )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:4: (otherlv_13= 'to' )? (otherlv_14= 'a' )? otherlv_15= 'total' (otherlv_16= 'of' )?
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:4: (otherlv_13= 'to' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==18) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:6: otherlv_13= 'to'
                            {
                            otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstantSum2567); 

                                	newLeafNode(otherlv_13, grammarAccess.getConstantSumAccess().getToKeyword_9_0_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1182:3: (otherlv_14= 'a' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==40) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1182:5: otherlv_14= 'a'
                            {
                            otherlv_14=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleConstantSum2582); 

                                	newLeafNode(otherlv_14, grammarAccess.getConstantSumAccess().getAKeyword_9_0_1());
                                

                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleConstantSum2596); 

                        	newLeafNode(otherlv_15, grammarAccess.getConstantSumAccess().getTotalKeyword_9_0_2());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1190:1: (otherlv_16= 'of' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==23) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1190:3: otherlv_16= 'of'
                            {
                            otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleConstantSum2609); 

                                	newLeafNode(otherlv_16, grammarAccess.getConstantSumAccess().getOfKeyword_9_0_3());
                                

                            }
                            break;

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1194:4: ( (lv_constant_17_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1195:1: (lv_constant_17_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1195:1: (lv_constant_17_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1196:3: lv_constant_17_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantSumAccess().getConstantEIntParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleConstantSum2633);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1212:4: (otherlv_18= 'these' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==24) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1212:6: otherlv_18= 'these'
                    {
                    otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleConstantSum2648); 

                        	newLeafNode(otherlv_18, grammarAccess.getConstantSumAccess().getTheseKeyword_10());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1216:3: ( (lv_choices_19_0= ruleChoice ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1217:1: (lv_choices_19_0= ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1217:1: (lv_choices_19_0= ruleChoice )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1218:3: lv_choices_19_0= ruleChoice
            {
             
            	        newCompositeNode(grammarAccess.getConstantSumAccess().getChoicesChoiceParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleConstantSum2671);
            lv_choices_19_0=ruleChoice();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantSumRule());
            	        }
                   		add(
                   			current, 
                   			"choices",
                    		lv_choices_19_0, 
                    		"Choice");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:2: (otherlv_20= ',' ( (lv_choices_21_0= ruleChoice ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==25) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1234:4: otherlv_20= ',' ( (lv_choices_21_0= ruleChoice ) )
            	    {
            	    otherlv_20=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleConstantSum2684); 

            	        	newLeafNode(otherlv_20, grammarAccess.getConstantSumAccess().getCommaKeyword_12_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1238:1: ( (lv_choices_21_0= ruleChoice ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1239:1: (lv_choices_21_0= ruleChoice )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1239:1: (lv_choices_21_0= ruleChoice )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1240:3: lv_choices_21_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstantSumAccess().getChoicesChoiceParserRuleCall_12_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleConstantSum2705);
            	    lv_choices_21_0=ruleChoice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstantSumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"choices",
            	            		lv_choices_21_0, 
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1256:4: ( ( (lv_forks_22_0= ruleRankingSumFork ) ) ( (lv_forks_23_0= ruleRankingSumFork ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==44) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1256:5: ( (lv_forks_22_0= ruleRankingSumFork ) ) ( (lv_forks_23_0= ruleRankingSumFork ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1256:5: ( (lv_forks_22_0= ruleRankingSumFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1257:1: (lv_forks_22_0= ruleRankingSumFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1257:1: (lv_forks_22_0= ruleRankingSumFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1258:3: lv_forks_22_0= ruleRankingSumFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstantSumAccess().getForksRankingSumForkParserRuleCall_13_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleConstantSum2729);
                    lv_forks_22_0=ruleRankingSumFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstantSumRule());
                    	        }
                           		add(
                           			current, 
                           			"forks",
                            		lv_forks_22_0, 
                            		"RankingSumFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1274:2: ( (lv_forks_23_0= ruleRankingSumFork ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==44) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1275:1: (lv_forks_23_0= ruleRankingSumFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1275:1: (lv_forks_23_0= ruleRankingSumFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1276:3: lv_forks_23_0= ruleRankingSumFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstantSumAccess().getForksRankingSumForkParserRuleCall_13_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleConstantSum2750);
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
                    	    break;

                    	default :
                    	    break loop59;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1300:1: entryRuleStaple returns [EObject current=null] : iv_ruleStaple= ruleStaple EOF ;
    public final EObject entryRuleStaple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaple = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1301:2: (iv_ruleStaple= ruleStaple EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1302:2: iv_ruleStaple= ruleStaple EOF
            {
             newCompositeNode(grammarAccess.getStapleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStaple_in_entryRuleStaple2789);
            iv_ruleStaple=ruleStaple();

            state._fsp--;

             current =iv_ruleStaple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStaple2799); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1309:1: ruleStaple returns [EObject current=null] : ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'where' )? (otherlv_14= 'lowest' )? (otherlv_15= 'means' )? ( (lv_first_16_0= ruleEString ) ) (otherlv_17= ',' )? (otherlv_18= 'middle' )? (otherlv_19= 'means' )? ( (lv_mid_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )? ) ;
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_question_12_0 = null;

        AntlrDatatypeRuleToken lv_first_16_0 = null;

        AntlrDatatypeRuleToken lv_mid_20_0 = null;

        AntlrDatatypeRuleToken lv_last_24_0 = null;

        EObject lv_forks_25_0 = null;

        EObject lv_forks_26_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1312:28: ( ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'where' )? (otherlv_14= 'lowest' )? (otherlv_15= 'means' )? ( (lv_first_16_0= ruleEString ) ) (otherlv_17= ',' )? (otherlv_18= 'middle' )? (otherlv_19= 'means' )? ( (lv_mid_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1313:1: ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'where' )? (otherlv_14= 'lowest' )? (otherlv_15= 'means' )? ( (lv_first_16_0= ruleEString ) ) (otherlv_17= ',' )? (otherlv_18= 'middle' )? (otherlv_19= 'means' )? ( (lv_mid_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1313:1: ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'where' )? (otherlv_14= 'lowest' )? (otherlv_15= 'means' )? ( (lv_first_16_0= ruleEString ) ) (otherlv_17= ',' )? (otherlv_18= 'middle' )? (otherlv_19= 'means' )? ( (lv_mid_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1313:2: () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'the' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )? (otherlv_9= 'to' )? (otherlv_10= 'rate' | otherlv_11= 'answer' )? ( (lv_question_12_0= ruleEString ) ) (otherlv_13= 'where' )? (otherlv_14= 'lowest' )? (otherlv_15= 'means' )? ( (lv_first_16_0= ruleEString ) ) (otherlv_17= ',' )? (otherlv_18= 'middle' )? (otherlv_19= 'means' )? ( (lv_mid_20_0= ruleEString ) ) (otherlv_21= 'and' )? (otherlv_22= 'highest' )? (otherlv_23= 'means' )? ( (lv_last_24_0= ruleEString ) ) ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1313:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1314:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStapleAccess().getStapleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleStaple2845); 

                	newLeafNode(otherlv_1, grammarAccess.getStapleAccess().getStapleKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1323:1: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1324:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1324:1: (lv_name_2_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1325:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStaple2862); 

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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStaple2879); 

                	newLeafNode(otherlv_3, grammarAccess.getStapleAccess().getColonKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1345:1: ( (otherlv_4= 'the' )? otherlv_5= 'user' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=13 && LA62_0<=14)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1345:2: (otherlv_4= 'the' )? otherlv_5= 'user'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1345:2: (otherlv_4= 'the' )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==13) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1345:4: otherlv_4= 'the'
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStaple2893); 

                                	newLeafNode(otherlv_4, grammarAccess.getStapleAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStaple2907); 

                        	newLeafNode(otherlv_5, grammarAccess.getStapleAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1353:3: (otherlv_6= 'may' | ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' ) )?
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==15) ) {
                alt63=1;
            }
            else if ( (LA63_0==16) ) {
                alt63=2;
            }
            switch (alt63) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1353:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStaple2922); 

                        	newLeafNode(otherlv_6, grammarAccess.getStapleAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1358:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1358:6: ( ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1358:7: ( (lv_isRequired_7_0= 'is' ) ) otherlv_8= 'required'
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1358:7: ( (lv_isRequired_7_0= 'is' ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:1: (lv_isRequired_7_0= 'is' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:1: (lv_isRequired_7_0= 'is' )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1360:3: lv_isRequired_7_0= 'is'
                    {
                    lv_isRequired_7_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStaple2947); 

                            newLeafNode(lv_isRequired_7_0, grammarAccess.getStapleAccess().getIsRequiredIsKeyword_5_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStapleRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "is");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStaple2972); 

                        	newLeafNode(otherlv_8, grammarAccess.getStapleAccess().getRequiredKeyword_5_1_1());
                        

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:4: (otherlv_9= 'to' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==18) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:6: otherlv_9= 'to'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStaple2988); 

                        	newLeafNode(otherlv_9, grammarAccess.getStapleAccess().getToKeyword_6());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1381:3: (otherlv_10= 'rate' | otherlv_11= 'answer' )?
            int alt65=3;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==29) ) {
                alt65=1;
            }
            else if ( (LA65_0==19) ) {
                alt65=2;
            }
            switch (alt65) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1381:5: otherlv_10= 'rate'
                    {
                    otherlv_10=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleStaple3003); 

                        	newLeafNode(otherlv_10, grammarAccess.getStapleAccess().getRateKeyword_7_0());
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1386:7: otherlv_11= 'answer'
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStaple3021); 

                        	newLeafNode(otherlv_11, grammarAccess.getStapleAccess().getAnswerKeyword_7_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1390:3: ( (lv_question_12_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1391:1: (lv_question_12_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1391:1: (lv_question_12_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1392:3: lv_question_12_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getQuestionEStringParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3044);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1408:2: (otherlv_13= 'where' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==32) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1408:4: otherlv_13= 'where'
                    {
                    otherlv_13=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleStaple3057); 

                        	newLeafNode(otherlv_13, grammarAccess.getStapleAccess().getWhereKeyword_9());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1412:3: (otherlv_14= 'lowest' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==33) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1412:5: otherlv_14= 'lowest'
                    {
                    otherlv_14=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStaple3072); 

                        	newLeafNode(otherlv_14, grammarAccess.getStapleAccess().getLowestKeyword_10());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1416:3: (otherlv_15= 'means' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==34) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1416:5: otherlv_15= 'means'
                    {
                    otherlv_15=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStaple3087); 

                        	newLeafNode(otherlv_15, grammarAccess.getStapleAccess().getMeansKeyword_11());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1420:3: ( (lv_first_16_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1421:1: (lv_first_16_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1421:1: (lv_first_16_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1422:3: lv_first_16_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getFirstEStringParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3110);
            lv_first_16_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStapleRule());
            	        }
                   		set(
                   			current, 
                   			"first",
                    		lv_first_16_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1438:2: (otherlv_17= ',' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==25) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1438:4: otherlv_17= ','
                    {
                    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleStaple3123); 

                        	newLeafNode(otherlv_17, grammarAccess.getStapleAccess().getCommaKeyword_13());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:3: (otherlv_18= 'middle' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==43) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:5: otherlv_18= 'middle'
                    {
                    otherlv_18=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleStaple3138); 

                        	newLeafNode(otherlv_18, grammarAccess.getStapleAccess().getMiddleKeyword_14());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1446:3: (otherlv_19= 'means' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==34) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1446:5: otherlv_19= 'means'
                    {
                    otherlv_19=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStaple3153); 

                        	newLeafNode(otherlv_19, grammarAccess.getStapleAccess().getMeansKeyword_15());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1450:3: ( (lv_mid_20_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1451:1: (lv_mid_20_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1451:1: (lv_mid_20_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1452:3: lv_mid_20_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getMidEStringParserRuleCall_16_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3176);
            lv_mid_20_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStapleRule());
            	        }
                   		set(
                   			current, 
                   			"mid",
                    		lv_mid_20_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1468:2: (otherlv_21= 'and' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==31) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1468:4: otherlv_21= 'and'
                    {
                    otherlv_21=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleStaple3189); 

                        	newLeafNode(otherlv_21, grammarAccess.getStapleAccess().getAndKeyword_17());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1472:3: (otherlv_22= 'highest' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==35) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1472:5: otherlv_22= 'highest'
                    {
                    otherlv_22=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStaple3204); 

                        	newLeafNode(otherlv_22, grammarAccess.getStapleAccess().getHighestKeyword_18());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1476:3: (otherlv_23= 'means' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==34) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1476:5: otherlv_23= 'means'
                    {
                    otherlv_23=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStaple3219); 

                        	newLeafNode(otherlv_23, grammarAccess.getStapleAccess().getMeansKeyword_19());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1480:3: ( (lv_last_24_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1481:1: (lv_last_24_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1481:1: (lv_last_24_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1482:3: lv_last_24_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStapleAccess().getLastEStringParserRuleCall_20_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3242);
            lv_last_24_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStapleRule());
            	        }
                   		set(
                   			current, 
                   			"last",
                    		lv_last_24_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1498:2: ( ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )* )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==44) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1498:3: ( (lv_forks_25_0= ruleRatingFork ) ) ( (lv_forks_26_0= ruleRatingFork ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1498:3: ( (lv_forks_25_0= ruleRatingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1499:1: (lv_forks_25_0= ruleRatingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1499:1: (lv_forks_25_0= ruleRatingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1500:3: lv_forks_25_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getForksRatingForkParserRuleCall_21_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3264);
                    lv_forks_25_0=ruleRatingFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		add(
                           			current, 
                           			"forks",
                            		lv_forks_25_0, 
                            		"RatingFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1516:2: ( (lv_forks_26_0= ruleRatingFork ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==44) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1517:1: (lv_forks_26_0= ruleRatingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1517:1: (lv_forks_26_0= ruleRatingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:3: lv_forks_26_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStapleAccess().getForksRatingForkParserRuleCall_21_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3285);
                    	    lv_forks_26_0=ruleRatingFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStapleRule());
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
                    	    break loop75;
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1542:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1543:2: (iv_ruleChoice= ruleChoice EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1544:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_entryRuleChoice3324);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoice3334); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1551:1: ruleChoice returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_description_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1554:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1555:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1555:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1555:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_description_2_0= ruleEString ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1555:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1556:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1556:1: (lv_name_0_0= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1557:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleChoice3376); 

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

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleChoice3393); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getColonKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1577:1: ( (lv_description_2_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1578:1: (lv_description_2_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1578:1: (lv_description_2_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1579:3: lv_description_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChoiceAccess().getDescriptionEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoice3414);
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1603:1: entryRuleChoiceFork returns [EObject current=null] : iv_ruleChoiceFork= ruleChoiceFork EOF ;
    public final EObject entryRuleChoiceFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1604:2: (iv_ruleChoiceFork= ruleChoiceFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1605:2: iv_ruleChoiceFork= ruleChoiceFork EOF
            {
             newCompositeNode(grammarAccess.getChoiceForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_entryRuleChoiceFork3450);
            iv_ruleChoiceFork=ruleChoiceFork();

            state._fsp--;

             current =iv_ruleChoiceFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceFork3460); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1612:1: ruleChoiceFork returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? (otherlv_5= 'continue' )? (otherlv_6= 'with' )? ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1615:28: ( (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? (otherlv_5= 'continue' )? (otherlv_6= 'with' )? ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1616:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? (otherlv_5= 'continue' )? (otherlv_6= 'with' )? ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1616:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? (otherlv_5= 'continue' )? (otherlv_6= 'with' )? ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1616:3: otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? (otherlv_5= 'continue' )? (otherlv_6= 'with' )? ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleChoiceFork3497); 

                	newLeafNode(otherlv_0, grammarAccess.getChoiceForkAccess().getIfKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1620:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1621:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1621:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1622:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getChoiceForkAccess().getOnChoiceCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork3520);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1635:2: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==25) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1635:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleChoiceFork3533); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChoiceForkAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1639:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1640:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1640:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1641:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceForkAccess().getOnChoiceCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork3556);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1654:4: (otherlv_4= 'then' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==45) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1654:6: otherlv_4= 'then'
                    {
                    otherlv_4=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleChoiceFork3571); 

                        	newLeafNode(otherlv_4, grammarAccess.getChoiceForkAccess().getThenKeyword_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1658:3: (otherlv_5= 'continue' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==46) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1658:5: otherlv_5= 'continue'
                    {
                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleChoiceFork3586); 

                        	newLeafNode(otherlv_5, grammarAccess.getChoiceForkAccess().getContinueKeyword_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1662:3: (otherlv_6= 'with' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==47) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1662:5: otherlv_6= 'with'
                    {
                    otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleChoiceFork3601); 

                        	newLeafNode(otherlv_6, grammarAccess.getChoiceForkAccess().getWithKeyword_5());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1666:3: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1667:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1667:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1668:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getChoiceForkAccess().getQuestionsQuestionCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork3626);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1681:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==25) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1681:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleChoiceFork3639); 

            	        	newLeafNode(otherlv_8, grammarAccess.getChoiceForkAccess().getCommaKeyword_7_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1685:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1686:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1686:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1687:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceForkAccess().getQuestionsQuestionCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork3662);
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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1709:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1710:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3701);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3712); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1717:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1720:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1721:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1721:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1721:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1721:2: (kw= '-' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==48) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1722:2: kw= '-'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEInt3751); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3768); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1742:1: entryRuleRatingFork returns [EObject current=null] : iv_ruleRatingFork= ruleRatingFork EOF ;
    public final EObject entryRuleRatingFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatingFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1743:2: (iv_ruleRatingFork= ruleRatingFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1744:2: iv_ruleRatingFork= ruleRatingFork EOF
            {
             newCompositeNode(grammarAccess.getRatingForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_entryRuleRatingFork3813);
            iv_ruleRatingFork=ruleRatingFork();

            state._fsp--;

             current =iv_ruleRatingFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRatingFork3823); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1751:1: ruleRatingFork returns [EObject current=null] : (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? (otherlv_8= 'continue' )? (otherlv_9= 'with' )? ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1754:28: ( (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? (otherlv_8= 'continue' )? (otherlv_9= 'with' )? ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1755:1: (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? (otherlv_8= 'continue' )? (otherlv_9= 'with' )? ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1755:1: (otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? (otherlv_8= 'continue' )? (otherlv_9= 'with' )? ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1755:3: otherlv_0= 'if' (otherlv_1= 'it' )? (otherlv_2= 'is' )? otherlv_3= 'between' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= 'and' ( (lv_max_6_0= ruleEInt ) ) (otherlv_7= 'then' )? (otherlv_8= 'continue' )? (otherlv_9= 'with' )? ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleRatingFork3860); 

                	newLeafNode(otherlv_0, grammarAccess.getRatingForkAccess().getIfKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1759:1: (otherlv_1= 'it' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==49) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1759:3: otherlv_1= 'it'
                    {
                    otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleRatingFork3873); 

                        	newLeafNode(otherlv_1, grammarAccess.getRatingForkAccess().getItKeyword_1());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1763:3: (otherlv_2= 'is' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==16) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1763:5: otherlv_2= 'is'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRatingFork3888); 

                        	newLeafNode(otherlv_2, grammarAccess.getRatingForkAccess().getIsKeyword_2());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRatingFork3902); 

                	newLeafNode(otherlv_3, grammarAccess.getRatingForkAccess().getBetweenKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1771:1: ( (lv_min_4_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1772:1: (lv_min_4_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1772:1: (lv_min_4_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1773:3: lv_min_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getMinEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork3923);
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

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRatingFork3935); 

                	newLeafNode(otherlv_5, grammarAccess.getRatingForkAccess().getAndKeyword_5());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1793:1: ( (lv_max_6_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1794:1: (lv_max_6_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1794:1: (lv_max_6_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1795:3: lv_max_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getMaxEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork3956);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1811:2: (otherlv_7= 'then' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==45) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1811:4: otherlv_7= 'then'
                    {
                    otherlv_7=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleRatingFork3969); 

                        	newLeafNode(otherlv_7, grammarAccess.getRatingForkAccess().getThenKeyword_7());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1815:3: (otherlv_8= 'continue' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==46) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1815:5: otherlv_8= 'continue'
                    {
                    otherlv_8=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRatingFork3984); 

                        	newLeafNode(otherlv_8, grammarAccess.getRatingForkAccess().getContinueKeyword_8());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1819:3: (otherlv_9= 'with' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==47) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1819:5: otherlv_9= 'with'
                    {
                    otherlv_9=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleRatingFork3999); 

                        	newLeafNode(otherlv_9, grammarAccess.getRatingForkAccess().getWithKeyword_9());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1823:3: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1824:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1824:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1825:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRatingForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getQuestionsQuestionCrossReference_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRatingFork4024);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1838:2: (otherlv_11= ',' ( ( ruleEString ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==25) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1838:4: otherlv_11= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRatingFork4037); 

            	        	newLeafNode(otherlv_11, grammarAccess.getRatingForkAccess().getCommaKeyword_11_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1842:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1843:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1843:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1844:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRatingForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRatingForkAccess().getQuestionsQuestionCrossReference_11_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRatingFork4060);
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
    // $ANTLR end "ruleRatingFork"


    // $ANTLR start "entryRuleRankingSumFork"
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1865:1: entryRuleRankingSumFork returns [EObject current=null] : iv_ruleRankingSumFork= ruleRankingSumFork EOF ;
    public final EObject entryRuleRankingSumFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRankingSumFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1866:2: (iv_ruleRankingSumFork= ruleRankingSumFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1867:2: iv_ruleRankingSumFork= ruleRankingSumFork EOF
            {
             newCompositeNode(grammarAccess.getRankingSumForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_entryRuleRankingSumFork4098);
            iv_ruleRankingSumFork=ruleRankingSumFork();

            state._fsp--;

             current =iv_ruleRankingSumFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRankingSumFork4108); 

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
    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1874:1: ruleRankingSumFork returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? (otherlv_10= 'continue' )? (otherlv_11= 'with' )? ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* ) ;
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
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1877:28: ( (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? (otherlv_10= 'continue' )? (otherlv_11= 'with' )? ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1878:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? (otherlv_10= 'continue' )? (otherlv_11= 'with' )? ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1878:1: (otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? (otherlv_10= 'continue' )? (otherlv_11= 'with' )? ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1878:3: otherlv_0= 'if' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= 'is' (otherlv_5= 'between' )? ( (lv_min_6_0= ruleEInt ) ) otherlv_7= 'and' ( (lv_max_8_0= ruleEInt ) ) (otherlv_9= 'then' )? (otherlv_10= 'continue' )? (otherlv_11= 'with' )? ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleRankingSumFork4145); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingSumForkAccess().getIfKeyword_0());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1882:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1884:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getOnChoiceCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4168);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1897:2: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==25) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1897:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRankingSumFork4181); 

            	        	newLeafNode(otherlv_2, grammarAccess.getRankingSumForkAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1901:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1902:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1902:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1903:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getOnChoiceCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4204);
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

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRankingSumFork4218); 

                	newLeafNode(otherlv_4, grammarAccess.getRankingSumForkAccess().getIsKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1920:1: (otherlv_5= 'between' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==30) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1920:3: otherlv_5= 'between'
                    {
                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRankingSumFork4231); 

                        	newLeafNode(otherlv_5, grammarAccess.getRankingSumForkAccess().getBetweenKeyword_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1924:3: ( (lv_min_6_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1925:1: (lv_min_6_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1925:1: (lv_min_6_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1926:3: lv_min_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getMinEIntParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingSumFork4254);
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

            otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRankingSumFork4266); 

                	newLeafNode(otherlv_7, grammarAccess.getRankingSumForkAccess().getAndKeyword_6());
                
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1946:1: ( (lv_max_8_0= ruleEInt ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1947:1: (lv_max_8_0= ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1947:1: (lv_max_8_0= ruleEInt )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1948:3: lv_max_8_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getMaxEIntParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingSumFork4287);
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

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1964:2: (otherlv_9= 'then' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==45) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1964:4: otherlv_9= 'then'
                    {
                    otherlv_9=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleRankingSumFork4300); 

                        	newLeafNode(otherlv_9, grammarAccess.getRankingSumForkAccess().getThenKeyword_8());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1968:3: (otherlv_10= 'continue' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==46) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1968:5: otherlv_10= 'continue'
                    {
                    otherlv_10=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRankingSumFork4315); 

                        	newLeafNode(otherlv_10, grammarAccess.getRankingSumForkAccess().getContinueKeyword_9());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1972:3: (otherlv_11= 'with' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==47) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1972:5: otherlv_11= 'with'
                    {
                    otherlv_11=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleRankingSumFork4330); 

                        	newLeafNode(otherlv_11, grammarAccess.getRankingSumForkAccess().getWithKeyword_10());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1976:3: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1977:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1977:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1978:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getQuestionsQuestionCrossReference_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4355);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1991:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==25) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1991:4: otherlv_13= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRankingSumFork4368); 

            	        	newLeafNode(otherlv_13, grammarAccess.getRankingSumForkAccess().getCommaKeyword_12_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1995:1: ( ( ruleEString ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1996:1: ( ruleEString )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1996:1: ( ruleEString )
            	    // ../dk.itu.mddp.eank.survey/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1997:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getQuestionsQuestionCrossReference_12_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4391);
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
        public static final BitSet FOLLOW_RULE_ID_in_ruleSurvey136 = new BitSet(new long[]{0x0000045018000802L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey163 = new BitSet(new long[]{0x0000045018000802L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey184 = new BitSet(new long[]{0x0000045018000802L});
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
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice812 = new BitSet(new long[]{0x0000000001B00010L});
        public static final BitSet FOLLOW_20_in_ruleMultipleChoice826 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMultipleChoice840 = new BitSet(new long[]{0x0001000000400040L});
        public static final BitSet FOLLOW_22_in_ruleMultipleChoice853 = new BitSet(new long[]{0x0001000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultipleChoice876 = new BitSet(new long[]{0x0000000001B00010L});
        public static final BitSet FOLLOW_23_in_ruleMultipleChoice891 = new BitSet(new long[]{0x0000000001B00010L});
        public static final BitSet FOLLOW_24_in_ruleMultipleChoice906 = new BitSet(new long[]{0x0000000001B00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice929 = new BitSet(new long[]{0x0000100006000002L});
        public static final BitSet FOLLOW_25_in_ruleMultipleChoice942 = new BitSet(new long[]{0x0000000001B00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice963 = new BitSet(new long[]{0x0000100006000002L});
        public static final BitSet FOLLOW_26_in_ruleMultipleChoice978 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice999 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1023 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1044 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleOpen_in_entryRuleOpen1083 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpen1093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleOpen1139 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOpen1156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOpen1173 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_13_in_ruleOpen1187 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleOpen1201 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_15_in_ruleOpen1216 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_16_in_ruleOpen1241 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleOpen1266 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_18_in_ruleOpen1282 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleOpen1297 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpen1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1356 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRating_Impl1366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleRating_Impl1412 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRating_Impl1429 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRating_Impl1446 = new BitSet(new long[]{0x00000000200DE030L});
        public static final BitSet FOLLOW_13_in_ruleRating_Impl1460 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRating_Impl1474 = new BitSet(new long[]{0x00000000200DE030L});
        public static final BitSet FOLLOW_15_in_ruleRating_Impl1489 = new BitSet(new long[]{0x00000000200DE030L});
        public static final BitSet FOLLOW_16_in_ruleRating_Impl1514 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRating_Impl1539 = new BitSet(new long[]{0x00000000200DE030L});
        public static final BitSet FOLLOW_18_in_ruleRating_Impl1555 = new BitSet(new long[]{0x00000000200DE030L});
        public static final BitSet FOLLOW_29_in_ruleRating_Impl1570 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleRating_Impl1588 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1611 = new BitSet(new long[]{0x0001000040400040L});
        public static final BitSet FOLLOW_30_in_ruleRating_Impl1624 = new BitSet(new long[]{0x0001000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1647 = new BitSet(new long[]{0x0001000080400040L});
        public static final BitSet FOLLOW_31_in_ruleRating_Impl1660 = new BitSet(new long[]{0x0001000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1683 = new BitSet(new long[]{0x00000007000DE030L});
        public static final BitSet FOLLOW_32_in_ruleRating_Impl1696 = new BitSet(new long[]{0x00000006000DE030L});
        public static final BitSet FOLLOW_33_in_ruleRating_Impl1711 = new BitSet(new long[]{0x00000004000DE030L});
        public static final BitSet FOLLOW_34_in_ruleRating_Impl1726 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1749 = new BitSet(new long[]{0x0000000C800DE030L});
        public static final BitSet FOLLOW_31_in_ruleRating_Impl1762 = new BitSet(new long[]{0x0000000C000DE030L});
        public static final BitSet FOLLOW_35_in_ruleRating_Impl1777 = new BitSet(new long[]{0x00000004000DE030L});
        public static final BitSet FOLLOW_34_in_ruleRating_Impl1792 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1815 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl1837 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl1858 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_entryRuleRanking1897 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRanking1907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleRanking1944 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRanking1961 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRanking1978 = new BitSet(new long[]{0x00000020000DE030L});
        public static final BitSet FOLLOW_13_in_ruleRanking1992 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRanking2006 = new BitSet(new long[]{0x00000020000DE030L});
        public static final BitSet FOLLOW_15_in_ruleRanking2021 = new BitSet(new long[]{0x00000020000DE030L});
        public static final BitSet FOLLOW_16_in_ruleRanking2046 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRanking2071 = new BitSet(new long[]{0x00000020000DE030L});
        public static final BitSet FOLLOW_18_in_ruleRanking2087 = new BitSet(new long[]{0x00000020000DE030L});
        public static final BitSet FOLLOW_37_in_ruleRanking2102 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleRanking2120 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRanking2143 = new BitSet(new long[]{0x0000000001B00010L});
        public static final BitSet FOLLOW_24_in_ruleRanking2156 = new BitSet(new long[]{0x0000000001B00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2179 = new BitSet(new long[]{0x0000100002000002L});
        public static final BitSet FOLLOW_25_in_ruleRanking2192 = new BitSet(new long[]{0x0000000001B00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2213 = new BitSet(new long[]{0x0000100002000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleRanking2237 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleRanking2258 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleConstantSum_in_entryRuleConstantSum2297 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantSum2307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleConstantSum2353 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantSum2370 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConstantSum2387 = new BitSet(new long[]{0x00000080000DE030L});
        public static final BitSet FOLLOW_13_in_ruleConstantSum2401 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleConstantSum2415 = new BitSet(new long[]{0x00000080000DE030L});
        public static final BitSet FOLLOW_15_in_ruleConstantSum2430 = new BitSet(new long[]{0x00000080000DE030L});
        public static final BitSet FOLLOW_16_in_ruleConstantSum2455 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConstantSum2480 = new BitSet(new long[]{0x00000080000DE030L});
        public static final BitSet FOLLOW_18_in_ruleConstantSum2496 = new BitSet(new long[]{0x00000080000DE030L});
        public static final BitSet FOLLOW_39_in_ruleConstantSum2511 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleConstantSum2529 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstantSum2552 = new BitSet(new long[]{0x0000030001B40010L});
        public static final BitSet FOLLOW_18_in_ruleConstantSum2567 = new BitSet(new long[]{0x0000030000000000L});
        public static final BitSet FOLLOW_40_in_ruleConstantSum2582 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleConstantSum2596 = new BitSet(new long[]{0x0001000000C00040L});
        public static final BitSet FOLLOW_23_in_ruleConstantSum2609 = new BitSet(new long[]{0x0001000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleConstantSum2633 = new BitSet(new long[]{0x0000000001B00010L});
        public static final BitSet FOLLOW_24_in_ruleConstantSum2648 = new BitSet(new long[]{0x0000000001B00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleConstantSum2671 = new BitSet(new long[]{0x0000100002000002L});
        public static final BitSet FOLLOW_25_in_ruleConstantSum2684 = new BitSet(new long[]{0x0000000001B00010L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleConstantSum2705 = new BitSet(new long[]{0x0000100002000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleConstantSum2729 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleConstantSum2750 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleStaple_in_entryRuleStaple2789 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStaple2799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleStaple2845 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStaple2862 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStaple2879 = new BitSet(new long[]{0x00000000200DE030L});
        public static final BitSet FOLLOW_13_in_ruleStaple2893 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleStaple2907 = new BitSet(new long[]{0x00000000200DE030L});
        public static final BitSet FOLLOW_15_in_ruleStaple2922 = new BitSet(new long[]{0x00000000200DE030L});
        public static final BitSet FOLLOW_16_in_ruleStaple2947 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleStaple2972 = new BitSet(new long[]{0x00000000200DE030L});
        public static final BitSet FOLLOW_18_in_ruleStaple2988 = new BitSet(new long[]{0x00000000200DE030L});
        public static final BitSet FOLLOW_29_in_ruleStaple3003 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_19_in_ruleStaple3021 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3044 = new BitSet(new long[]{0x00000007000DE030L});
        public static final BitSet FOLLOW_32_in_ruleStaple3057 = new BitSet(new long[]{0x00000006000DE030L});
        public static final BitSet FOLLOW_33_in_ruleStaple3072 = new BitSet(new long[]{0x00000004000DE030L});
        public static final BitSet FOLLOW_34_in_ruleStaple3087 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3110 = new BitSet(new long[]{0x00000804020DE030L});
        public static final BitSet FOLLOW_25_in_ruleStaple3123 = new BitSet(new long[]{0x00000804000DE030L});
        public static final BitSet FOLLOW_43_in_ruleStaple3138 = new BitSet(new long[]{0x00000004000DE030L});
        public static final BitSet FOLLOW_34_in_ruleStaple3153 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3176 = new BitSet(new long[]{0x0000000C800DE030L});
        public static final BitSet FOLLOW_31_in_ruleStaple3189 = new BitSet(new long[]{0x0000000C000DE030L});
        public static final BitSet FOLLOW_35_in_ruleStaple3204 = new BitSet(new long[]{0x00000004000DE030L});
        public static final BitSet FOLLOW_34_in_ruleStaple3219 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3242 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3264 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3285 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice3324 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoice3334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleChoice3376 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleChoice3393 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoice3414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_entryRuleChoiceFork3450 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceFork3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleChoiceFork3497 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork3520 = new BitSet(new long[]{0x0000E000020DE030L});
        public static final BitSet FOLLOW_25_in_ruleChoiceFork3533 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork3556 = new BitSet(new long[]{0x0000E000020DE030L});
        public static final BitSet FOLLOW_45_in_ruleChoiceFork3571 = new BitSet(new long[]{0x0000C000000DE030L});
        public static final BitSet FOLLOW_46_in_ruleChoiceFork3586 = new BitSet(new long[]{0x00008000000DE030L});
        public static final BitSet FOLLOW_47_in_ruleChoiceFork3601 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork3626 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleChoiceFork3639 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork3662 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3701 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleEInt3751 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_entryRuleRatingFork3813 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRatingFork3823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleRatingFork3860 = new BitSet(new long[]{0x0002000040010000L});
        public static final BitSet FOLLOW_49_in_ruleRatingFork3873 = new BitSet(new long[]{0x0000000040010000L});
        public static final BitSet FOLLOW_16_in_ruleRatingFork3888 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleRatingFork3902 = new BitSet(new long[]{0x0001000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork3923 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRatingFork3935 = new BitSet(new long[]{0x0001000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork3956 = new BitSet(new long[]{0x0000E000000DE030L});
        public static final BitSet FOLLOW_45_in_ruleRatingFork3969 = new BitSet(new long[]{0x0000C000000DE030L});
        public static final BitSet FOLLOW_46_in_ruleRatingFork3984 = new BitSet(new long[]{0x00008000000DE030L});
        public static final BitSet FOLLOW_47_in_ruleRatingFork3999 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRatingFork4024 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleRatingFork4037 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRatingFork4060 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_entryRuleRankingSumFork4098 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRankingSumFork4108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleRankingSumFork4145 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4168 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_25_in_ruleRankingSumFork4181 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4204 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_16_in_ruleRankingSumFork4218 = new BitSet(new long[]{0x0001000040400040L});
        public static final BitSet FOLLOW_30_in_ruleRankingSumFork4231 = new BitSet(new long[]{0x0001000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingSumFork4254 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRankingSumFork4266 = new BitSet(new long[]{0x0001000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingSumFork4287 = new BitSet(new long[]{0x0000E000000DE030L});
        public static final BitSet FOLLOW_45_in_ruleRankingSumFork4300 = new BitSet(new long[]{0x0000C000000DE030L});
        public static final BitSet FOLLOW_46_in_ruleRankingSumFork4315 = new BitSet(new long[]{0x00008000000DE030L});
        public static final BitSet FOLLOW_47_in_ruleRankingSumFork4330 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4355 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleRankingSumFork4368 = new BitSet(new long[]{0x00000000000DE030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4391 = new BitSet(new long[]{0x0000000002000002L});
    }


}