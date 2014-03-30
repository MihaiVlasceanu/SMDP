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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'??????'", "';'", "'MultipleChoice'", "':'", "'The'", "'user'", "'may'", "'is required'", "'to'", "'answer'", "'with'", "'one of'", "'some of'", "'these:'", "','", "'or'", "'something'", "'else'", "'.'", "'Open'", "'Rating'", "'rate'", "'between'", "'and'", "'where'", "'lowest'", "'means'", "'highest'", "'conditionals'", "'('", "')'", "'Ranking'", "'ask'", "'you'", "'can'", "'choose'", "'from'", "'these'", "'Dichotomous'", "'if yes'", "'if no'", "'SumConstant'", "'divide'", "'according'", "'the'", "'importance'", "'Staple'", "'mean'", "'If'", "'then'", "'go to'", "'-'", "'Min'", "'Max'", "'Questions'", "'On'", "'From'", "'To'", "'DichotomousFork'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : ( () ( ( (lv_surveys_1_0= ruleSurvey ) ) (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )* )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_surveys_1_0 = null;

        EObject lv_surveys_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( () ( ( (lv_surveys_1_0= ruleSurvey ) ) (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )* )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( () ( ( (lv_surveys_1_0= ruleSurvey ) ) (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )* )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( () ( ( (lv_surveys_1_0= ruleSurvey ) ) (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )* )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: () ( ( (lv_surveys_1_0= ruleSurvey ) ) (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )* )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:2: ( ( (lv_surveys_1_0= ruleSurvey ) ) (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:3: ( (lv_surveys_1_0= ruleSurvey ) ) (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )*
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:3: ( (lv_surveys_1_0= ruleSurvey ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:1: (lv_surveys_1_0= ruleSurvey )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:87:1: (lv_surveys_1_0= ruleSurvey )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:88:3: lv_surveys_1_0= ruleSurvey
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

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:104:2: (otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:104:4: otherlv_2= '??????' ( (lv_surveys_3_0= ruleSurvey ) )
                    	    {
                    	    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel154); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getQuestionMarkQuestionMarkQuestionMarkQuestionMarkQuestionMarkQuestionMarkKeyword_1_1_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:108:1: ( (lv_surveys_3_0= ruleSurvey ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:109:1: (lv_surveys_3_0= ruleSurvey )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:109:1: (lv_surveys_3_0= ruleSurvey )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:110:3: lv_surveys_3_0= ruleSurvey
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:134:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:135:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:2: iv_ruleQuestion= ruleQuestion EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:143:1: ruleQuestion returns [EObject current=null] : (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:146:28: ( (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:147:1: (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:147:1: (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case 31:
                {
                alt3=3;
                }
                break;
            case 42:
                {
                alt3=4;
                }
                break;
            case 49:
                {
                alt3=5;
                }
                break;
            case 52:
                {
                alt3=6;
                }
                break;
            case 57:
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:148:5: this_MultipleChoice_0= ruleMultipleChoice
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:158:5: this_Open_1= ruleOpen
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:168:5: this_Rating_Impl_2= ruleRating_Impl
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:178:5: this_Ranking_3= ruleRanking
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:188:5: this_Dichotomous_4= ruleDichotomous
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:5: this_SumConstant_5= ruleSumConstant
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:5: this_Staple_6= ruleStaple
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:224:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:225:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:226:2: iv_ruleSurvey= ruleSurvey EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:233:1: ruleSurvey returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) otherlv_3= ';' ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )* )? ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_questions_2_0 = null;

        EObject lv_questions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:236:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) otherlv_3= ';' ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )* )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:237:1: ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) otherlv_3= ';' ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )* )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:237:1: ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) otherlv_3= ';' ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )* )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:237:2: () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_questions_2_0= ruleQuestion ) ) otherlv_3= ';' ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )* )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:237:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:238:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:243:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:244:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:244:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:245:3: lv_name_1_0= ruleEString
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:2: ( ( (lv_questions_2_0= ruleQuestion ) ) otherlv_3= ';' ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13||(LA5_0>=30 && LA5_0<=31)||LA5_0==42||LA5_0==49||LA5_0==52||LA5_0==57) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:3: ( (lv_questions_2_0= ruleQuestion ) ) otherlv_3= ';' ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )*
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:3: ( (lv_questions_2_0= ruleQuestion ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:1: (lv_questions_2_0= ruleQuestion )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:1: (lv_questions_2_0= ruleQuestion )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:263:3: lv_questions_2_0= ruleQuestion
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
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:283:1: ( ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==13||(LA4_0>=30 && LA4_0<=31)||LA4_0==42||LA4_0==49||LA4_0==52||LA4_0==57) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:283:2: ( (lv_questions_4_0= ruleQuestion ) ) otherlv_5= ';'
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:283:2: ( (lv_questions_4_0= ruleQuestion ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:284:1: (lv_questions_4_0= ruleQuestion )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:284:1: (lv_questions_4_0= ruleQuestion )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:285:3: lv_questions_4_0= ruleQuestion
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:313:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:314:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:315:2: iv_ruleEString= ruleEString EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:322:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:325:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:326:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:326:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:326:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString694); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:334:10: this_ID_1= RULE_ID
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:1: entryRuleMultipleChoice returns [EObject current=null] : iv_ruleMultipleChoice= ruleMultipleChoice EOF ;
    public final EObject entryRuleMultipleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoice = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:352:2: (iv_ruleMultipleChoice= ruleMultipleChoice EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:353:2: iv_ruleMultipleChoice= ruleMultipleChoice EOF
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:360:1: ruleMultipleChoice returns [EObject current=null] : ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'with' )? (otherlv_12= 'one of' | otherlv_13= 'some of' )? (otherlv_14= 'these:' )? ( (lv_choice_15_0= ruleChoice ) ) (otherlv_16= ',' ( (lv_choice_17_0= ruleChoice ) ) )* )? (otherlv_18= 'or' (otherlv_19= 'with' )? (otherlv_20= 'something' )? (otherlv_21= 'else' )? ( (lv_other_22_0= ruleEString ) ) )? (otherlv_23= '.' )? ( ( (lv_Fork_24_0= ruleChoiceFork ) ) (otherlv_25= ',' ( (lv_Fork_26_0= ruleChoiceFork ) ) )* )? ) ;
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
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_question_10_0 = null;

        EObject lv_choice_15_0 = null;

        EObject lv_choice_17_0 = null;

        AntlrDatatypeRuleToken lv_other_22_0 = null;

        EObject lv_Fork_24_0 = null;

        EObject lv_Fork_26_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:28: ( ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'with' )? (otherlv_12= 'one of' | otherlv_13= 'some of' )? (otherlv_14= 'these:' )? ( (lv_choice_15_0= ruleChoice ) ) (otherlv_16= ',' ( (lv_choice_17_0= ruleChoice ) ) )* )? (otherlv_18= 'or' (otherlv_19= 'with' )? (otherlv_20= 'something' )? (otherlv_21= 'else' )? ( (lv_other_22_0= ruleEString ) ) )? (otherlv_23= '.' )? ( ( (lv_Fork_24_0= ruleChoiceFork ) ) (otherlv_25= ',' ( (lv_Fork_26_0= ruleChoiceFork ) ) )* )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:1: ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'with' )? (otherlv_12= 'one of' | otherlv_13= 'some of' )? (otherlv_14= 'these:' )? ( (lv_choice_15_0= ruleChoice ) ) (otherlv_16= ',' ( (lv_choice_17_0= ruleChoice ) ) )* )? (otherlv_18= 'or' (otherlv_19= 'with' )? (otherlv_20= 'something' )? (otherlv_21= 'else' )? ( (lv_other_22_0= ruleEString ) ) )? (otherlv_23= '.' )? ( ( (lv_Fork_24_0= ruleChoiceFork ) ) (otherlv_25= ',' ( (lv_Fork_26_0= ruleChoiceFork ) ) )* )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:1: ( () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'with' )? (otherlv_12= 'one of' | otherlv_13= 'some of' )? (otherlv_14= 'these:' )? ( (lv_choice_15_0= ruleChoice ) ) (otherlv_16= ',' ( (lv_choice_17_0= ruleChoice ) ) )* )? (otherlv_18= 'or' (otherlv_19= 'with' )? (otherlv_20= 'something' )? (otherlv_21= 'else' )? ( (lv_other_22_0= ruleEString ) ) )? (otherlv_23= '.' )? ( ( (lv_Fork_24_0= ruleChoiceFork ) ) (otherlv_25= ',' ( (lv_Fork_26_0= ruleChoiceFork ) ) )* )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:2: () otherlv_1= 'MultipleChoice' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'with' )? (otherlv_12= 'one of' | otherlv_13= 'some of' )? (otherlv_14= 'these:' )? ( (lv_choice_15_0= ruleChoice ) ) (otherlv_16= ',' ( (lv_choice_17_0= ruleChoice ) ) )* )? (otherlv_18= 'or' (otherlv_19= 'with' )? (otherlv_20= 'something' )? (otherlv_21= 'else' )? ( (lv_other_22_0= ruleEString ) ) )? (otherlv_23= '.' )? ( ( (lv_Fork_24_0= ruleChoiceFork ) ) (otherlv_25= ',' ( (lv_Fork_26_0= ruleChoiceFork ) ) )* )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:365:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultipleChoiceAccess().getMultipleChoiceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleChoice823); 

                	newLeafNode(otherlv_1, grammarAccess.getMultipleChoiceAccess().getMultipleChoiceKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:374:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:375:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:375:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:376:3: lv_name_2_0= RULE_ID
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
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:1: ( (otherlv_4= 'The' )? otherlv_5= 'user' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=15 && LA8_0<=16)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:2: (otherlv_4= 'The' )? otherlv_5= 'user'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:2: (otherlv_4= 'The' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==15) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:396:4: otherlv_4= 'The'
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:404:3: (otherlv_6= 'may' | ( (lv_isRequired_7_0= 'is required' ) ) )?
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:404:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultipleChoice900); 

                        	newLeafNode(otherlv_6, grammarAccess.getMultipleChoiceAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:409:6: ( (lv_isRequired_7_0= 'is required' ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:409:6: ( (lv_isRequired_7_0= 'is required' ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:410:1: (lv_isRequired_7_0= 'is required' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:410:1: (lv_isRequired_7_0= 'is required' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:411:3: lv_isRequired_7_0= 'is required'
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:4: ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING||(LA12_0>=19 && LA12_0<=20)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==EOF||LA12_2==RULE_ID||LA12_2==12||(LA12_2>=21 && LA12_2<=24)||LA12_2==26||LA12_2==29||LA12_2==59) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:5: (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:5: (otherlv_8= 'to' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==19) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:7: otherlv_8= 'to'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultipleChoice953); 

                                	newLeafNode(otherlv_8, grammarAccess.getMultipleChoiceAccess().getToKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:428:3: (otherlv_9= 'answer' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==20) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:428:5: otherlv_9= 'answer'
                            {
                            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultipleChoice968); 

                                	newLeafNode(otherlv_9, grammarAccess.getMultipleChoiceAccess().getAnswerKeyword_6_1());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:432:3: ( (lv_question_10_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:1: (lv_question_10_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:1: (lv_question_10_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:434:3: lv_question_10_0= ruleEString
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:450:4: ( (otherlv_11= 'with' )? (otherlv_12= 'one of' | otherlv_13= 'some of' )? (otherlv_14= 'these:' )? ( (lv_choice_15_0= ruleChoice ) ) (otherlv_16= ',' ( (lv_choice_17_0= ruleChoice ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||(LA17_0>=21 && LA17_0<=24)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:450:5: (otherlv_11= 'with' )? (otherlv_12= 'one of' | otherlv_13= 'some of' )? (otherlv_14= 'these:' )? ( (lv_choice_15_0= ruleChoice ) ) (otherlv_16= ',' ( (lv_choice_17_0= ruleChoice ) ) )*
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:450:5: (otherlv_11= 'with' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==21) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:450:7: otherlv_11= 'with'
                            {
                            otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultipleChoice1007); 

                                	newLeafNode(otherlv_11, grammarAccess.getMultipleChoiceAccess().getWithKeyword_7_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:454:3: (otherlv_12= 'one of' | otherlv_13= 'some of' )?
                    int alt14=3;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==22) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==23) ) {
                        alt14=2;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:454:5: otherlv_12= 'one of'
                            {
                            otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMultipleChoice1022); 

                                	newLeafNode(otherlv_12, grammarAccess.getMultipleChoiceAccess().getOneOfKeyword_7_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:7: otherlv_13= 'some of'
                            {
                            otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMultipleChoice1040); 

                                	newLeafNode(otherlv_13, grammarAccess.getMultipleChoiceAccess().getSomeOfKeyword_7_1_1());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:463:3: (otherlv_14= 'these:' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==24) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:463:5: otherlv_14= 'these:'
                            {
                            otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultipleChoice1055); 

                                	newLeafNode(otherlv_14, grammarAccess.getMultipleChoiceAccess().getTheseKeyword_7_2());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:467:3: ( (lv_choice_15_0= ruleChoice ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:468:1: (lv_choice_15_0= ruleChoice )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:468:1: (lv_choice_15_0= ruleChoice )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:469:3: lv_choice_15_0= ruleChoice
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_7_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice1078);
                    lv_choice_15_0=ruleChoice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		add(
                           			current, 
                           			"choice",
                            		lv_choice_15_0, 
                            		"Choice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:485:2: (otherlv_16= ',' ( (lv_choice_17_0= ruleChoice ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==25) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:485:4: otherlv_16= ',' ( (lv_choice_17_0= ruleChoice ) )
                    	    {
                    	    otherlv_16=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultipleChoice1091); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_7_4_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:489:1: ( (lv_choice_17_0= ruleChoice ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:490:1: (lv_choice_17_0= ruleChoice )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:490:1: (lv_choice_17_0= ruleChoice )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:491:3: lv_choice_17_0= ruleChoice
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_7_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice1112);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:507:6: (otherlv_18= 'or' (otherlv_19= 'with' )? (otherlv_20= 'something' )? (otherlv_21= 'else' )? ( (lv_other_22_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:507:8: otherlv_18= 'or' (otherlv_19= 'with' )? (otherlv_20= 'something' )? (otherlv_21= 'else' )? ( (lv_other_22_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleChoice1129); 

                        	newLeafNode(otherlv_18, grammarAccess.getMultipleChoiceAccess().getOrKeyword_8_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:511:1: (otherlv_19= 'with' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==21) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:511:3: otherlv_19= 'with'
                            {
                            otherlv_19=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultipleChoice1142); 

                                	newLeafNode(otherlv_19, grammarAccess.getMultipleChoiceAccess().getWithKeyword_8_1());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:3: (otherlv_20= 'something' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==27) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:5: otherlv_20= 'something'
                            {
                            otherlv_20=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultipleChoice1157); 

                                	newLeafNode(otherlv_20, grammarAccess.getMultipleChoiceAccess().getSomethingKeyword_8_2());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:519:3: (otherlv_21= 'else' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==28) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:519:5: otherlv_21= 'else'
                            {
                            otherlv_21=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMultipleChoice1172); 

                                	newLeafNode(otherlv_21, grammarAccess.getMultipleChoiceAccess().getElseKeyword_8_3());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:523:3: ( (lv_other_22_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:524:1: (lv_other_22_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:524:1: (lv_other_22_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:525:3: lv_other_22_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getOtherEStringParserRuleCall_8_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice1195);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:4: (otherlv_23= '.' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:541:6: otherlv_23= '.'
                    {
                    otherlv_23=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMultipleChoice1210); 

                        	newLeafNode(otherlv_23, grammarAccess.getMultipleChoiceAccess().getFullStopKeyword_9());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:3: ( ( (lv_Fork_24_0= ruleChoiceFork ) ) (otherlv_25= ',' ( (lv_Fork_26_0= ruleChoiceFork ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==59) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:4: ( (lv_Fork_24_0= ruleChoiceFork ) ) (otherlv_25= ',' ( (lv_Fork_26_0= ruleChoiceFork ) ) )*
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:4: ( (lv_Fork_24_0= ruleChoiceFork ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:546:1: (lv_Fork_24_0= ruleChoiceFork )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:546:1: (lv_Fork_24_0= ruleChoiceFork )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:547:3: lv_Fork_24_0= ruleChoiceFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getForkChoiceForkParserRuleCall_10_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1234);
                    lv_Fork_24_0=ruleChoiceFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		add(
                           			current, 
                           			"Fork",
                            		lv_Fork_24_0, 
                            		"ChoiceFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:563:2: (otherlv_25= ',' ( (lv_Fork_26_0= ruleChoiceFork ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==25) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:563:4: otherlv_25= ',' ( (lv_Fork_26_0= ruleChoiceFork ) )
                    	    {
                    	    otherlv_25=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultipleChoice1247); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_10_1_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:567:1: ( (lv_Fork_26_0= ruleChoiceFork ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:568:1: (lv_Fork_26_0= ruleChoiceFork )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:568:1: (lv_Fork_26_0= ruleChoiceFork )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:569:3: lv_Fork_26_0= ruleChoiceFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getForkChoiceForkParserRuleCall_10_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1268);
                    	    lv_Fork_26_0=ruleChoiceFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Fork",
                    	            		lv_Fork_26_0, 
                    	            		"ChoiceFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:593:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:2: (iv_ruleOpen= ruleOpen EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:595:2: iv_ruleOpen= ruleOpen EOF
            {
             newCompositeNode(grammarAccess.getOpenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpen_in_entryRuleOpen1308);
            iv_ruleOpen=ruleOpen();

            state._fsp--;

             current =iv_ruleOpen; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpen1318); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:1: ruleOpen returns [EObject current=null] : ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:28: ( ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:606:1: ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:606:1: ( () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:606:2: () otherlv_1= 'Open' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:606:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:607:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOpenAccess().getOpenAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOpen1364); 

                	newLeafNode(otherlv_1, grammarAccess.getOpenAccess().getOpenKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:616:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:617:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:617:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:618:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOpen1381); 

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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOpen1398); 

                	newLeafNode(otherlv_3, grammarAccess.getOpenAccess().getColonKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:638:1: ( (otherlv_4= 'The' )? otherlv_5= 'user' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=15 && LA26_0<=16)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:638:2: (otherlv_4= 'The' )? otherlv_5= 'user'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:638:2: (otherlv_4= 'The' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==15) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:638:4: otherlv_4= 'The'
                            {
                            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOpen1412); 

                                	newLeafNode(otherlv_4, grammarAccess.getOpenAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOpen1426); 

                        	newLeafNode(otherlv_5, grammarAccess.getOpenAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:646:3: (otherlv_6= 'may' | otherlv_7= 'is required' )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            else if ( (LA27_0==18) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:646:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOpen1441); 

                        	newLeafNode(otherlv_6, grammarAccess.getOpenAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:651:7: otherlv_7= 'is required'
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOpen1459); 

                        	newLeafNode(otherlv_7, grammarAccess.getOpenAccess().getIsRequiredKeyword_5_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:655:3: ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)||(LA30_0>=19 && LA30_0<=20)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:655:4: (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:655:4: (otherlv_8= 'to' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==19) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:655:6: otherlv_8= 'to'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOpen1475); 

                                	newLeafNode(otherlv_8, grammarAccess.getOpenAccess().getToKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:659:3: (otherlv_9= 'answer' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==20) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:659:5: otherlv_9= 'answer'
                            {
                            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOpen1490); 

                                	newLeafNode(otherlv_9, grammarAccess.getOpenAccess().getAnswerKeyword_6_1());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:663:3: ( (lv_question_10_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:664:1: (lv_question_10_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:664:1: (lv_question_10_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:665:3: lv_question_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpenAccess().getQuestionEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpen1513);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:1: entryRuleRating_Impl returns [EObject current=null] : iv_ruleRating_Impl= ruleRating_Impl EOF ;
    public final EObject entryRuleRating_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating_Impl = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:2: (iv_ruleRating_Impl= ruleRating_Impl EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:691:2: iv_ruleRating_Impl= ruleRating_Impl EOF
            {
             newCompositeNode(grammarAccess.getRating_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1551);
            iv_ruleRating_Impl=ruleRating_Impl();

            state._fsp--;

             current =iv_ruleRating_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRating_Impl1561); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:698:1: ruleRating_Impl returns [EObject current=null] : ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? (otherlv_16= 'lowest' )? (otherlv_17= 'means' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'and' )? (otherlv_20= 'highest' )? (otherlv_21= 'means' )? ( (lv_last_22_0= ruleEString ) ) )? ( (otherlv_23= 'conditionals' )? otherlv_24= '(' ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* otherlv_28= ')' )? ) ;
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
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_question_10_0 = null;

        AntlrDatatypeRuleToken lv_Min_12_0 = null;

        AntlrDatatypeRuleToken lv_Max_14_0 = null;

        AntlrDatatypeRuleToken lv_first_18_0 = null;

        AntlrDatatypeRuleToken lv_last_22_0 = null;

        EObject lv_Fork_25_0 = null;

        EObject lv_Fork_27_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:701:28: ( ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? (otherlv_16= 'lowest' )? (otherlv_17= 'means' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'and' )? (otherlv_20= 'highest' )? (otherlv_21= 'means' )? ( (lv_last_22_0= ruleEString ) ) )? ( (otherlv_23= 'conditionals' )? otherlv_24= '(' ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* otherlv_28= ')' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:1: ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? (otherlv_16= 'lowest' )? (otherlv_17= 'means' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'and' )? (otherlv_20= 'highest' )? (otherlv_21= 'means' )? ( (lv_last_22_0= ruleEString ) ) )? ( (otherlv_23= 'conditionals' )? otherlv_24= '(' ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* otherlv_28= ')' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:1: ( () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? (otherlv_16= 'lowest' )? (otherlv_17= 'means' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'and' )? (otherlv_20= 'highest' )? (otherlv_21= 'means' )? ( (lv_last_22_0= ruleEString ) ) )? ( (otherlv_23= 'conditionals' )? otherlv_24= '(' ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* otherlv_28= ')' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:2: () otherlv_1= 'Rating' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? (otherlv_16= 'lowest' )? (otherlv_17= 'means' )? ( (lv_first_18_0= ruleEString ) ) )? ( (otherlv_19= 'and' )? (otherlv_20= 'highest' )? (otherlv_21= 'means' )? ( (lv_last_22_0= ruleEString ) ) )? ( (otherlv_23= 'conditionals' )? otherlv_24= '(' ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* otherlv_28= ')' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRating_ImplAccess().getRatingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRating_Impl1607); 

                	newLeafNode(otherlv_1, grammarAccess.getRating_ImplAccess().getRatingKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:712:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:713:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:714:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRating_Impl1624); 

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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRating_Impl1641); 

                	newLeafNode(otherlv_3, grammarAccess.getRating_ImplAccess().getColonKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:1: ( (otherlv_4= 'The' )? otherlv_5= 'user' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=15 && LA32_0<=16)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:2: (otherlv_4= 'The' )? otherlv_5= 'user'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:2: (otherlv_4= 'The' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==15) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:4: otherlv_4= 'The'
                            {
                            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRating_Impl1655); 

                                	newLeafNode(otherlv_4, grammarAccess.getRating_ImplAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRating_Impl1669); 

                        	newLeafNode(otherlv_5, grammarAccess.getRating_ImplAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:742:3: (otherlv_6= 'may' | otherlv_7= 'is required' )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17) ) {
                alt33=1;
            }
            else if ( (LA33_0==18) ) {
                alt33=2;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:742:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRating_Impl1684); 

                        	newLeafNode(otherlv_6, grammarAccess.getRating_ImplAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:747:7: otherlv_7= 'is required'
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRating_Impl1702); 

                        	newLeafNode(otherlv_7, grammarAccess.getRating_ImplAccess().getIsRequiredKeyword_5_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:751:3: ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )?
            int alt36=2;
            switch ( input.LA(1) ) {
                case 19:
                case 32:
                    {
                    alt36=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt36=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt36=1;
                    }
                    break;
            }

            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:751:4: (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:751:4: (otherlv_8= 'to' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==19) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:751:6: otherlv_8= 'to'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRating_Impl1718); 

                                	newLeafNode(otherlv_8, grammarAccess.getRating_ImplAccess().getToKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:3: (otherlv_9= 'rate' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==32) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:755:5: otherlv_9= 'rate'
                            {
                            otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRating_Impl1733); 

                                	newLeafNode(otherlv_9, grammarAccess.getRating_ImplAccess().getRateKeyword_6_1());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:759:3: ( (lv_question_10_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:760:1: (lv_question_10_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:760:1: (lv_question_10_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:761:3: lv_question_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getQuestionEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1756);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:777:4: ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )?
            int alt38=2;
            switch ( input.LA(1) ) {
                case 33:
                    {
                    alt38=1;
                    }
                    break;
                case 62:
                    {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==RULE_INT) ) {
                        alt38=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt38=1;
                    }
                    break;
            }

            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:777:5: (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:777:5: (otherlv_11= 'between' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==33) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:777:7: otherlv_11= 'between'
                            {
                            otherlv_11=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRating_Impl1772); 

                                	newLeafNode(otherlv_11, grammarAccess.getRating_ImplAccess().getBetweenKeyword_7_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:781:3: ( (lv_Min_12_0= ruleEInt ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:782:1: (lv_Min_12_0= ruleEInt )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:782:1: (lv_Min_12_0= ruleEInt )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:783:3: lv_Min_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMinEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1795);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:4: ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==RULE_INT||LA40_1==62) ) {
                    alt40=1;
                }
            }
            else if ( (LA40_0==RULE_INT||LA40_0==62) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:5: (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:5: (otherlv_13= 'and' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==34) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:799:7: otherlv_13= 'and'
                            {
                            otherlv_13=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRating_Impl1811); 

                                	newLeafNode(otherlv_13, grammarAccess.getRating_ImplAccess().getAndKeyword_8_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:803:3: ( (lv_Max_14_0= ruleEInt ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:804:1: (lv_Max_14_0= ruleEInt )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:804:1: (lv_Max_14_0= ruleEInt )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:805:3: lv_Max_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMaxEIntParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1834);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:821:4: ( (otherlv_15= 'where' )? (otherlv_16= 'lowest' )? (otherlv_17= 'means' )? ( (lv_first_18_0= ruleEString ) ) )?
            int alt44=2;
            switch ( input.LA(1) ) {
                case 35:
                case 36:
                    {
                    alt44=1;
                    }
                    break;
                case 37:
                    {
                    int LA44_2 = input.LA(2);

                    if ( (LA44_2==RULE_STRING) ) {
                        alt44=1;
                    }
                    else if ( (LA44_2==RULE_ID) ) {
                        alt44=1;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    alt44=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt44=1;
                    }
                    break;
            }

            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:821:5: (otherlv_15= 'where' )? (otherlv_16= 'lowest' )? (otherlv_17= 'means' )? ( (lv_first_18_0= ruleEString ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:821:5: (otherlv_15= 'where' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==35) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:821:7: otherlv_15= 'where'
                            {
                            otherlv_15=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRating_Impl1850); 

                                	newLeafNode(otherlv_15, grammarAccess.getRating_ImplAccess().getWhereKeyword_9_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:825:3: (otherlv_16= 'lowest' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==36) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:825:5: otherlv_16= 'lowest'
                            {
                            otherlv_16=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRating_Impl1865); 

                                	newLeafNode(otherlv_16, grammarAccess.getRating_ImplAccess().getLowestKeyword_9_1());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:829:3: (otherlv_17= 'means' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==37) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:829:5: otherlv_17= 'means'
                            {
                            otherlv_17=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleRating_Impl1880); 

                                	newLeafNode(otherlv_17, grammarAccess.getRating_ImplAccess().getMeansKeyword_9_2());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:833:3: ( (lv_first_18_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:1: (lv_first_18_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:1: (lv_first_18_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:3: lv_first_18_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getFirstEStringParserRuleCall_9_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1903);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:4: ( (otherlv_19= 'and' )? (otherlv_20= 'highest' )? (otherlv_21= 'means' )? ( (lv_last_22_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)||LA48_0==34||(LA48_0>=37 && LA48_0<=38)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:5: (otherlv_19= 'and' )? (otherlv_20= 'highest' )? (otherlv_21= 'means' )? ( (lv_last_22_0= ruleEString ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:5: (otherlv_19= 'and' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==34) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:7: otherlv_19= 'and'
                            {
                            otherlv_19=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRating_Impl1919); 

                                	newLeafNode(otherlv_19, grammarAccess.getRating_ImplAccess().getAndKeyword_10_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:855:3: (otherlv_20= 'highest' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==38) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:855:5: otherlv_20= 'highest'
                            {
                            otherlv_20=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRating_Impl1934); 

                                	newLeafNode(otherlv_20, grammarAccess.getRating_ImplAccess().getHighestKeyword_10_1());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:859:3: (otherlv_21= 'means' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==37) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:859:5: otherlv_21= 'means'
                            {
                            otherlv_21=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleRating_Impl1949); 

                                	newLeafNode(otherlv_21, grammarAccess.getRating_ImplAccess().getMeansKeyword_10_2());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:863:3: ( (lv_last_22_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:864:1: (lv_last_22_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:864:1: (lv_last_22_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:865:3: lv_last_22_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getLastEStringParserRuleCall_10_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1972);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:4: ( (otherlv_23= 'conditionals' )? otherlv_24= '(' ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* otherlv_28= ')' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=39 && LA51_0<=40)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:5: (otherlv_23= 'conditionals' )? otherlv_24= '(' ( (lv_Fork_25_0= ruleRatingFork ) ) (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )* otherlv_28= ')'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:5: (otherlv_23= 'conditionals' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==39) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:881:7: otherlv_23= 'conditionals'
                            {
                            otherlv_23=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleRating_Impl1988); 

                                	newLeafNode(otherlv_23, grammarAccess.getRating_ImplAccess().getConditionalsKeyword_11_0());
                                

                            }
                            break;

                    }

                    otherlv_24=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRating_Impl2002); 

                        	newLeafNode(otherlv_24, grammarAccess.getRating_ImplAccess().getLeftParenthesisKeyword_11_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:1: ( (lv_Fork_25_0= ruleRatingFork ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:890:1: (lv_Fork_25_0= ruleRatingFork )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:890:1: (lv_Fork_25_0= ruleRatingFork )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:891:3: lv_Fork_25_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getForkRatingForkParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl2023);
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

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:907:2: (otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==25) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:907:4: otherlv_26= ',' ( (lv_Fork_27_0= ruleRatingFork ) )
                    	    {
                    	    otherlv_26=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRating_Impl2036); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getRating_ImplAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:911:1: ( (lv_Fork_27_0= ruleRatingFork ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:912:1: (lv_Fork_27_0= ruleRatingFork )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:912:1: (lv_Fork_27_0= ruleRatingFork )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:913:3: lv_Fork_27_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getForkRatingForkParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl2057);
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
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRating_Impl2071); 

                        	newLeafNode(otherlv_28, grammarAccess.getRating_ImplAccess().getRightParenthesisKeyword_11_4());
                        

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:941:1: entryRuleRanking returns [EObject current=null] : iv_ruleRanking= ruleRanking EOF ;
    public final EObject entryRuleRanking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRanking = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:942:2: (iv_ruleRanking= ruleRanking EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:943:2: iv_ruleRanking= ruleRanking EOF
            {
             newCompositeNode(grammarAccess.getRankingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRanking_in_entryRuleRanking2109);
            iv_ruleRanking=ruleRanking();

            state._fsp--;

             current =iv_ruleRanking; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRanking2119); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:950:1: ruleRanking returns [EObject current=null] : (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'is required' )? ( (otherlv_4= 'ask' )? ( (lv_question_5_0= ruleEString ) ) )? ( (otherlv_6= 'you' )? (otherlv_7= 'can' )? otherlv_8= 'choose' (otherlv_9= 'from' )? (otherlv_10= 'these' )? ( (lv_choices_11_0= ruleChoice ) ) (otherlv_12= ',' ( (lv_choices_13_0= ruleChoice ) ) )* )? ( (otherlv_14= 'conditionals' )? otherlv_15= '(' ( (lv_Fork_16_0= ruleRankingSumFork ) ) (otherlv_17= ',' ( (lv_Fork_18_0= ruleRankingSumFork ) ) )* otherlv_19= ')' )? ) ;
    public final EObject ruleRanking() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_question_5_0 = null;

        EObject lv_choices_11_0 = null;

        EObject lv_choices_13_0 = null;

        EObject lv_Fork_16_0 = null;

        EObject lv_Fork_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:953:28: ( (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'is required' )? ( (otherlv_4= 'ask' )? ( (lv_question_5_0= ruleEString ) ) )? ( (otherlv_6= 'you' )? (otherlv_7= 'can' )? otherlv_8= 'choose' (otherlv_9= 'from' )? (otherlv_10= 'these' )? ( (lv_choices_11_0= ruleChoice ) ) (otherlv_12= ',' ( (lv_choices_13_0= ruleChoice ) ) )* )? ( (otherlv_14= 'conditionals' )? otherlv_15= '(' ( (lv_Fork_16_0= ruleRankingSumFork ) ) (otherlv_17= ',' ( (lv_Fork_18_0= ruleRankingSumFork ) ) )* otherlv_19= ')' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:954:1: (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'is required' )? ( (otherlv_4= 'ask' )? ( (lv_question_5_0= ruleEString ) ) )? ( (otherlv_6= 'you' )? (otherlv_7= 'can' )? otherlv_8= 'choose' (otherlv_9= 'from' )? (otherlv_10= 'these' )? ( (lv_choices_11_0= ruleChoice ) ) (otherlv_12= ',' ( (lv_choices_13_0= ruleChoice ) ) )* )? ( (otherlv_14= 'conditionals' )? otherlv_15= '(' ( (lv_Fork_16_0= ruleRankingSumFork ) ) (otherlv_17= ',' ( (lv_Fork_18_0= ruleRankingSumFork ) ) )* otherlv_19= ')' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:954:1: (otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'is required' )? ( (otherlv_4= 'ask' )? ( (lv_question_5_0= ruleEString ) ) )? ( (otherlv_6= 'you' )? (otherlv_7= 'can' )? otherlv_8= 'choose' (otherlv_9= 'from' )? (otherlv_10= 'these' )? ( (lv_choices_11_0= ruleChoice ) ) (otherlv_12= ',' ( (lv_choices_13_0= ruleChoice ) ) )* )? ( (otherlv_14= 'conditionals' )? otherlv_15= '(' ( (lv_Fork_16_0= ruleRankingSumFork ) ) (otherlv_17= ',' ( (lv_Fork_18_0= ruleRankingSumFork ) ) )* otherlv_19= ')' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:954:3: otherlv_0= 'Ranking' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'is required' )? ( (otherlv_4= 'ask' )? ( (lv_question_5_0= ruleEString ) ) )? ( (otherlv_6= 'you' )? (otherlv_7= 'can' )? otherlv_8= 'choose' (otherlv_9= 'from' )? (otherlv_10= 'these' )? ( (lv_choices_11_0= ruleChoice ) ) (otherlv_12= ',' ( (lv_choices_13_0= ruleChoice ) ) )* )? ( (otherlv_14= 'conditionals' )? otherlv_15= '(' ( (lv_Fork_16_0= ruleRankingSumFork ) ) (otherlv_17= ',' ( (lv_Fork_18_0= ruleRankingSumFork ) ) )* otherlv_19= ')' )?
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleRanking2156); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingAccess().getRankingKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:958:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:959:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:959:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:960:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRanking2173); 

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

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRanking2190); 

                	newLeafNode(otherlv_2, grammarAccess.getRankingAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:980:1: (otherlv_3= 'is required' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==18) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:980:3: otherlv_3= 'is required'
                    {
                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRanking2203); 

                        	newLeafNode(otherlv_3, grammarAccess.getRankingAccess().getIsRequiredKeyword_3());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:3: ( (otherlv_4= 'ask' )? ( (lv_question_5_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_ID)||LA54_0==43) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:4: (otherlv_4= 'ask' )? ( (lv_question_5_0= ruleEString ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:4: (otherlv_4= 'ask' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==43) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:6: otherlv_4= 'ask'
                            {
                            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleRanking2219); 

                                	newLeafNode(otherlv_4, grammarAccess.getRankingAccess().getAskKeyword_4_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:988:3: ( (lv_question_5_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:989:1: (lv_question_5_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:989:1: (lv_question_5_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:990:3: lv_question_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getQuestionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRanking2242);
                    lv_question_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:4: ( (otherlv_6= 'you' )? (otherlv_7= 'can' )? otherlv_8= 'choose' (otherlv_9= 'from' )? (otherlv_10= 'these' )? ( (lv_choices_11_0= ruleChoice ) ) (otherlv_12= ',' ( (lv_choices_13_0= ruleChoice ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=44 && LA60_0<=46)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:5: (otherlv_6= 'you' )? (otherlv_7= 'can' )? otherlv_8= 'choose' (otherlv_9= 'from' )? (otherlv_10= 'these' )? ( (lv_choices_11_0= ruleChoice ) ) (otherlv_12= ',' ( (lv_choices_13_0= ruleChoice ) ) )*
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:5: (otherlv_6= 'you' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==44) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:7: otherlv_6= 'you'
                            {
                            otherlv_6=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleRanking2258); 

                                	newLeafNode(otherlv_6, grammarAccess.getRankingAccess().getYouKeyword_5_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1010:3: (otherlv_7= 'can' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==45) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1010:5: otherlv_7= 'can'
                            {
                            otherlv_7=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleRanking2273); 

                                	newLeafNode(otherlv_7, grammarAccess.getRankingAccess().getCanKeyword_5_1());
                                

                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRanking2287); 

                        	newLeafNode(otherlv_8, grammarAccess.getRankingAccess().getChooseKeyword_5_2());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1018:1: (otherlv_9= 'from' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==47) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1018:3: otherlv_9= 'from'
                            {
                            otherlv_9=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleRanking2300); 

                                	newLeafNode(otherlv_9, grammarAccess.getRankingAccess().getFromKeyword_5_3());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1022:3: (otherlv_10= 'these' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==48) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1022:5: otherlv_10= 'these'
                            {
                            otherlv_10=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleRanking2315); 

                                	newLeafNode(otherlv_10, grammarAccess.getRankingAccess().getTheseKeyword_5_4());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1026:3: ( (lv_choices_11_0= ruleChoice ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1027:1: (lv_choices_11_0= ruleChoice )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1027:1: (lv_choices_11_0= ruleChoice )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1028:3: lv_choices_11_0= ruleChoice
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_5_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2338);
                    lv_choices_11_0=ruleChoice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		add(
                           			current, 
                           			"choices",
                            		lv_choices_11_0, 
                            		"Choice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1044:2: (otherlv_12= ',' ( (lv_choices_13_0= ruleChoice ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==25) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1044:4: otherlv_12= ',' ( (lv_choices_13_0= ruleChoice ) )
                    	    {
                    	    otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRanking2351); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getRankingAccess().getCommaKeyword_5_6_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1048:1: ( (lv_choices_13_0= ruleChoice ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1049:1: (lv_choices_13_0= ruleChoice )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1049:1: (lv_choices_13_0= ruleChoice )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1050:3: lv_choices_13_0= ruleChoice
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_5_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2372);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1066:6: ( (otherlv_14= 'conditionals' )? otherlv_15= '(' ( (lv_Fork_16_0= ruleRankingSumFork ) ) (otherlv_17= ',' ( (lv_Fork_18_0= ruleRankingSumFork ) ) )* otherlv_19= ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=39 && LA63_0<=40)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1066:7: (otherlv_14= 'conditionals' )? otherlv_15= '(' ( (lv_Fork_16_0= ruleRankingSumFork ) ) (otherlv_17= ',' ( (lv_Fork_18_0= ruleRankingSumFork ) ) )* otherlv_19= ')'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1066:7: (otherlv_14= 'conditionals' )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==39) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1066:9: otherlv_14= 'conditionals'
                            {
                            otherlv_14=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleRanking2390); 

                                	newLeafNode(otherlv_14, grammarAccess.getRankingAccess().getConditionalsKeyword_6_0());
                                

                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRanking2404); 

                        	newLeafNode(otherlv_15, grammarAccess.getRankingAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1074:1: ( (lv_Fork_16_0= ruleRankingSumFork ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:1: (lv_Fork_16_0= ruleRankingSumFork )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:1: (lv_Fork_16_0= ruleRankingSumFork )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1076:3: lv_Fork_16_0= ruleRankingSumFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getForkRankingSumForkParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleRanking2425);
                    lv_Fork_16_0=ruleRankingSumFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		add(
                           			current, 
                           			"Fork",
                            		lv_Fork_16_0, 
                            		"RankingSumFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:2: (otherlv_17= ',' ( (lv_Fork_18_0= ruleRankingSumFork ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==25) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:4: otherlv_17= ',' ( (lv_Fork_18_0= ruleRankingSumFork ) )
                    	    {
                    	    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRanking2438); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getRankingAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1096:1: ( (lv_Fork_18_0= ruleRankingSumFork ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1097:1: (lv_Fork_18_0= ruleRankingSumFork )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1097:1: (lv_Fork_18_0= ruleRankingSumFork )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1098:3: lv_Fork_18_0= ruleRankingSumFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingAccess().getForkRankingSumForkParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleRanking2459);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRanking2473); 

                        	newLeafNode(otherlv_19, grammarAccess.getRankingAccess().getRightParenthesisKeyword_6_4());
                        

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1126:1: entryRuleDichotomous returns [EObject current=null] : iv_ruleDichotomous= ruleDichotomous EOF ;
    public final EObject entryRuleDichotomous() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDichotomous = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1127:2: (iv_ruleDichotomous= ruleDichotomous EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:2: iv_ruleDichotomous= ruleDichotomous EOF
            {
             newCompositeNode(grammarAccess.getDichotomousRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDichotomous_in_entryRuleDichotomous2511);
            iv_ruleDichotomous=ruleDichotomous();

            state._fsp--;

             current =iv_ruleDichotomous; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDichotomous2521); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1135:1: ruleDichotomous returns [EObject current=null] : ( () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'if yes' ( (lv_onYes_12_0= ruleDichotomousFork ) ) )? (otherlv_13= 'if no' ( (lv_onNo_14_0= ruleDichotomousFork ) ) )? ) ;
    public final EObject ruleDichotomous() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_question_10_0 = null;

        EObject lv_onYes_12_0 = null;

        EObject lv_onNo_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1138:28: ( ( () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'if yes' ( (lv_onYes_12_0= ruleDichotomousFork ) ) )? (otherlv_13= 'if no' ( (lv_onNo_14_0= ruleDichotomousFork ) ) )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1139:1: ( () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'if yes' ( (lv_onYes_12_0= ruleDichotomousFork ) ) )? (otherlv_13= 'if no' ( (lv_onNo_14_0= ruleDichotomousFork ) ) )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1139:1: ( () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'if yes' ( (lv_onYes_12_0= ruleDichotomousFork ) ) )? (otherlv_13= 'if no' ( (lv_onNo_14_0= ruleDichotomousFork ) ) )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1139:2: () otherlv_1= 'Dichotomous' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )? (otherlv_11= 'if yes' ( (lv_onYes_12_0= ruleDichotomousFork ) ) )? (otherlv_13= 'if no' ( (lv_onNo_14_0= ruleDichotomousFork ) ) )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1139:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1140:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDichotomousAccess().getDichotomousAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleDichotomous2567); 

                	newLeafNode(otherlv_1, grammarAccess.getDichotomousAccess().getDichotomousKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1150:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1150:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1151:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDichotomous2584); 

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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDichotomous2601); 

                	newLeafNode(otherlv_3, grammarAccess.getDichotomousAccess().getColonKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:1: ( (otherlv_4= 'The' )? otherlv_5= 'user' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=15 && LA65_0<=16)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:2: (otherlv_4= 'The' )? otherlv_5= 'user'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:2: (otherlv_4= 'The' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==15) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:4: otherlv_4= 'The'
                            {
                            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDichotomous2615); 

                                	newLeafNode(otherlv_4, grammarAccess.getDichotomousAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDichotomous2629); 

                        	newLeafNode(otherlv_5, grammarAccess.getDichotomousAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1179:3: (otherlv_6= 'may' | otherlv_7= 'is required' )?
            int alt66=3;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==17) ) {
                alt66=1;
            }
            else if ( (LA66_0==18) ) {
                alt66=2;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1179:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDichotomous2644); 

                        	newLeafNode(otherlv_6, grammarAccess.getDichotomousAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1184:7: otherlv_7= 'is required'
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDichotomous2662); 

                        	newLeafNode(otherlv_7, grammarAccess.getDichotomousAccess().getIsRequiredKeyword_5_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:3: ( (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_ID)||(LA69_0>=19 && LA69_0<=20)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:4: (otherlv_8= 'to' )? (otherlv_9= 'answer' )? ( (lv_question_10_0= ruleEString ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:4: (otherlv_8= 'to' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==19) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:6: otherlv_8= 'to'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDichotomous2678); 

                                	newLeafNode(otherlv_8, grammarAccess.getDichotomousAccess().getToKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:3: (otherlv_9= 'answer' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==20) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:5: otherlv_9= 'answer'
                            {
                            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDichotomous2693); 

                                	newLeafNode(otherlv_9, grammarAccess.getDichotomousAccess().getAnswerKeyword_6_1());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1196:3: ( (lv_question_10_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1197:1: (lv_question_10_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1197:1: (lv_question_10_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1198:3: lv_question_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDichotomousAccess().getQuestionEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDichotomous2716);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:4: (otherlv_11= 'if yes' ( (lv_onYes_12_0= ruleDichotomousFork ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==50) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:6: otherlv_11= 'if yes' ( (lv_onYes_12_0= ruleDichotomousFork ) )
                    {
                    otherlv_11=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleDichotomous2731); 

                        	newLeafNode(otherlv_11, grammarAccess.getDichotomousAccess().getIfYesKeyword_7_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1218:1: ( (lv_onYes_12_0= ruleDichotomousFork ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1219:1: (lv_onYes_12_0= ruleDichotomousFork )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1219:1: (lv_onYes_12_0= ruleDichotomousFork )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1220:3: lv_onYes_12_0= ruleDichotomousFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getDichotomousAccess().getOnYesDichotomousForkParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDichotomousFork_in_ruleDichotomous2752);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1236:4: (otherlv_13= 'if no' ( (lv_onNo_14_0= ruleDichotomousFork ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==51) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1236:6: otherlv_13= 'if no' ( (lv_onNo_14_0= ruleDichotomousFork ) )
                    {
                    otherlv_13=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleDichotomous2767); 

                        	newLeafNode(otherlv_13, grammarAccess.getDichotomousAccess().getIfNoKeyword_8_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1240:1: ( (lv_onNo_14_0= ruleDichotomousFork ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1241:1: (lv_onNo_14_0= ruleDichotomousFork )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1241:1: (lv_onNo_14_0= ruleDichotomousFork )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1242:3: lv_onNo_14_0= ruleDichotomousFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getDichotomousAccess().getOnNoDichotomousForkParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDichotomousFork_in_ruleDichotomous2788);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1266:1: entryRuleSumConstant returns [EObject current=null] : iv_ruleSumConstant= ruleSumConstant EOF ;
    public final EObject entryRuleSumConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumConstant = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1267:2: (iv_ruleSumConstant= ruleSumConstant EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1268:2: iv_ruleSumConstant= ruleSumConstant EOF
            {
             newCompositeNode(grammarAccess.getSumConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSumConstant_in_entryRuleSumConstant2826);
            iv_ruleSumConstant=ruleSumConstant();

            state._fsp--;

             current =iv_ruleSumConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSumConstant2836); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1275:1: ruleSumConstant returns [EObject current=null] : ( () otherlv_1= 'SumConstant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'divide' )? (otherlv_10= 'according' )? (otherlv_11= 'to' )? (otherlv_12= 'the' )? (otherlv_13= 'importance' )? ( (lv_question_14_0= ruleEString ) ) )? ( (otherlv_15= 'conditionals' )? otherlv_16= '(' ( (lv_Fork_17_0= ruleRankingSumFork ) ) (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )* otherlv_20= ')' )? ) ;
    public final EObject ruleSumConstant() throws RecognitionException {
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_question_14_0 = null;

        EObject lv_Fork_17_0 = null;

        EObject lv_Fork_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1278:28: ( ( () otherlv_1= 'SumConstant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'divide' )? (otherlv_10= 'according' )? (otherlv_11= 'to' )? (otherlv_12= 'the' )? (otherlv_13= 'importance' )? ( (lv_question_14_0= ruleEString ) ) )? ( (otherlv_15= 'conditionals' )? otherlv_16= '(' ( (lv_Fork_17_0= ruleRankingSumFork ) ) (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )* otherlv_20= ')' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1279:1: ( () otherlv_1= 'SumConstant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'divide' )? (otherlv_10= 'according' )? (otherlv_11= 'to' )? (otherlv_12= 'the' )? (otherlv_13= 'importance' )? ( (lv_question_14_0= ruleEString ) ) )? ( (otherlv_15= 'conditionals' )? otherlv_16= '(' ( (lv_Fork_17_0= ruleRankingSumFork ) ) (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )* otherlv_20= ')' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1279:1: ( () otherlv_1= 'SumConstant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'divide' )? (otherlv_10= 'according' )? (otherlv_11= 'to' )? (otherlv_12= 'the' )? (otherlv_13= 'importance' )? ( (lv_question_14_0= ruleEString ) ) )? ( (otherlv_15= 'conditionals' )? otherlv_16= '(' ( (lv_Fork_17_0= ruleRankingSumFork ) ) (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )* otherlv_20= ')' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1279:2: () otherlv_1= 'SumConstant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'divide' )? (otherlv_10= 'according' )? (otherlv_11= 'to' )? (otherlv_12= 'the' )? (otherlv_13= 'importance' )? ( (lv_question_14_0= ruleEString ) ) )? ( (otherlv_15= 'conditionals' )? otherlv_16= '(' ( (lv_Fork_17_0= ruleRankingSumFork ) ) (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )* otherlv_20= ')' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1279:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1280:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSumConstantAccess().getSumConstantAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleSumConstant2882); 

                	newLeafNode(otherlv_1, grammarAccess.getSumConstantAccess().getSumConstantKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1289:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1290:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1290:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1291:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSumConstant2899); 

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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSumConstant2916); 

                	newLeafNode(otherlv_3, grammarAccess.getSumConstantAccess().getColonKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1311:1: ( (otherlv_4= 'The' )? otherlv_5= 'user' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=15 && LA73_0<=16)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1311:2: (otherlv_4= 'The' )? otherlv_5= 'user'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1311:2: (otherlv_4= 'The' )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==15) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1311:4: otherlv_4= 'The'
                            {
                            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSumConstant2930); 

                                	newLeafNode(otherlv_4, grammarAccess.getSumConstantAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSumConstant2944); 

                        	newLeafNode(otherlv_5, grammarAccess.getSumConstantAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1319:3: (otherlv_6= 'may' | otherlv_7= 'is required' )?
            int alt74=3;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==17) ) {
                alt74=1;
            }
            else if ( (LA74_0==18) ) {
                alt74=2;
            }
            switch (alt74) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1319:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSumConstant2959); 

                        	newLeafNode(otherlv_6, grammarAccess.getSumConstantAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1324:7: otherlv_7= 'is required'
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSumConstant2977); 

                        	newLeafNode(otherlv_7, grammarAccess.getSumConstantAccess().getIsRequiredKeyword_5_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:3: ( (otherlv_8= 'to' )? (otherlv_9= 'divide' )? (otherlv_10= 'according' )? (otherlv_11= 'to' )? (otherlv_12= 'the' )? (otherlv_13= 'importance' )? ( (lv_question_14_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=RULE_STRING && LA81_0<=RULE_ID)||LA81_0==19||(LA81_0>=53 && LA81_0<=56)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:4: (otherlv_8= 'to' )? (otherlv_9= 'divide' )? (otherlv_10= 'according' )? (otherlv_11= 'to' )? (otherlv_12= 'the' )? (otherlv_13= 'importance' )? ( (lv_question_14_0= ruleEString ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:4: (otherlv_8= 'to' )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==19) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1328:6: otherlv_8= 'to'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSumConstant2993); 

                                	newLeafNode(otherlv_8, grammarAccess.getSumConstantAccess().getToKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1332:3: (otherlv_9= 'divide' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==53) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1332:5: otherlv_9= 'divide'
                            {
                            otherlv_9=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleSumConstant3008); 

                                	newLeafNode(otherlv_9, grammarAccess.getSumConstantAccess().getDivideKeyword_6_1());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1336:3: (otherlv_10= 'according' )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==54) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1336:5: otherlv_10= 'according'
                            {
                            otherlv_10=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleSumConstant3023); 

                                	newLeafNode(otherlv_10, grammarAccess.getSumConstantAccess().getAccordingKeyword_6_2());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1340:3: (otherlv_11= 'to' )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==19) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1340:5: otherlv_11= 'to'
                            {
                            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSumConstant3038); 

                                	newLeafNode(otherlv_11, grammarAccess.getSumConstantAccess().getToKeyword_6_3());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1344:3: (otherlv_12= 'the' )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==55) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1344:5: otherlv_12= 'the'
                            {
                            otherlv_12=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleSumConstant3053); 

                                	newLeafNode(otherlv_12, grammarAccess.getSumConstantAccess().getTheKeyword_6_4());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1348:3: (otherlv_13= 'importance' )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==56) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1348:5: otherlv_13= 'importance'
                            {
                            otherlv_13=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleSumConstant3068); 

                                	newLeafNode(otherlv_13, grammarAccess.getSumConstantAccess().getImportanceKeyword_6_5());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1352:3: ( (lv_question_14_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1353:1: (lv_question_14_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1353:1: (lv_question_14_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1354:3: lv_question_14_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSumConstantAccess().getQuestionEStringParserRuleCall_6_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSumConstant3091);
                    lv_question_14_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSumConstantRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_14_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1370:4: ( (otherlv_15= 'conditionals' )? otherlv_16= '(' ( (lv_Fork_17_0= ruleRankingSumFork ) ) (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )* otherlv_20= ')' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=39 && LA84_0<=40)) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1370:5: (otherlv_15= 'conditionals' )? otherlv_16= '(' ( (lv_Fork_17_0= ruleRankingSumFork ) ) (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )* otherlv_20= ')'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1370:5: (otherlv_15= 'conditionals' )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==39) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1370:7: otherlv_15= 'conditionals'
                            {
                            otherlv_15=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSumConstant3107); 

                                	newLeafNode(otherlv_15, grammarAccess.getSumConstantAccess().getConditionalsKeyword_7_0());
                                

                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSumConstant3121); 

                        	newLeafNode(otherlv_16, grammarAccess.getSumConstantAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1378:1: ( (lv_Fork_17_0= ruleRankingSumFork ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1379:1: (lv_Fork_17_0= ruleRankingSumFork )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1379:1: (lv_Fork_17_0= ruleRankingSumFork )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1380:3: lv_Fork_17_0= ruleRankingSumFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getSumConstantAccess().getForkRankingSumForkParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleSumConstant3142);
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

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1396:2: (otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==25) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1396:4: otherlv_18= ',' ( (lv_Fork_19_0= ruleRankingSumFork ) )
                    	    {
                    	    otherlv_18=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSumConstant3155); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getSumConstantAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1400:1: ( (lv_Fork_19_0= ruleRankingSumFork ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1401:1: (lv_Fork_19_0= ruleRankingSumFork )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1401:1: (lv_Fork_19_0= ruleRankingSumFork )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1402:3: lv_Fork_19_0= ruleRankingSumFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSumConstantAccess().getForkRankingSumForkParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_ruleSumConstant3176);
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
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSumConstant3190); 

                        	newLeafNode(otherlv_20, grammarAccess.getSumConstantAccess().getRightParenthesisKeyword_7_4());
                        

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1430:1: entryRuleStaple returns [EObject current=null] : iv_ruleStaple= ruleStaple EOF ;
    public final EObject entryRuleStaple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaple = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1431:2: (iv_ruleStaple= ruleStaple EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1432:2: iv_ruleStaple= ruleStaple EOF
            {
             newCompositeNode(grammarAccess.getStapleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStaple_in_entryRuleStaple3228);
            iv_ruleStaple=ruleStaple();

            state._fsp--;

             current =iv_ruleStaple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStaple3238); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1439:1: ruleStaple returns [EObject current=null] : ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? (otherlv_16= 'lowest' )? (otherlv_17= 'means' )? (otherlv_18= ',' )? ( (lv_first_19_0= ruleEString ) ) )? ( (otherlv_20= 'mean' )? (otherlv_21= 'means' )? ( (lv_mid_22_0= ruleEString ) ) )? ( (otherlv_23= 'and' )? (otherlv_24= 'highest' )? (otherlv_25= 'means' )? ( (lv_last_26_0= ruleEString ) ) )? ( (otherlv_27= 'conditionals' )? otherlv_28= '(' ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* otherlv_32= ')' )? ) ;
    public final EObject ruleStaple() throws RecognitionException {
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
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_question_10_0 = null;

        AntlrDatatypeRuleToken lv_Min_12_0 = null;

        AntlrDatatypeRuleToken lv_Max_14_0 = null;

        AntlrDatatypeRuleToken lv_first_19_0 = null;

        AntlrDatatypeRuleToken lv_mid_22_0 = null;

        AntlrDatatypeRuleToken lv_last_26_0 = null;

        EObject lv_Fork_29_0 = null;

        EObject lv_Fork_31_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1442:28: ( ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? (otherlv_16= 'lowest' )? (otherlv_17= 'means' )? (otherlv_18= ',' )? ( (lv_first_19_0= ruleEString ) ) )? ( (otherlv_20= 'mean' )? (otherlv_21= 'means' )? ( (lv_mid_22_0= ruleEString ) ) )? ( (otherlv_23= 'and' )? (otherlv_24= 'highest' )? (otherlv_25= 'means' )? ( (lv_last_26_0= ruleEString ) ) )? ( (otherlv_27= 'conditionals' )? otherlv_28= '(' ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* otherlv_32= ')' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1443:1: ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? (otherlv_16= 'lowest' )? (otherlv_17= 'means' )? (otherlv_18= ',' )? ( (lv_first_19_0= ruleEString ) ) )? ( (otherlv_20= 'mean' )? (otherlv_21= 'means' )? ( (lv_mid_22_0= ruleEString ) ) )? ( (otherlv_23= 'and' )? (otherlv_24= 'highest' )? (otherlv_25= 'means' )? ( (lv_last_26_0= ruleEString ) ) )? ( (otherlv_27= 'conditionals' )? otherlv_28= '(' ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* otherlv_32= ')' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1443:1: ( () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? (otherlv_16= 'lowest' )? (otherlv_17= 'means' )? (otherlv_18= ',' )? ( (lv_first_19_0= ruleEString ) ) )? ( (otherlv_20= 'mean' )? (otherlv_21= 'means' )? ( (lv_mid_22_0= ruleEString ) ) )? ( (otherlv_23= 'and' )? (otherlv_24= 'highest' )? (otherlv_25= 'means' )? ( (lv_last_26_0= ruleEString ) ) )? ( (otherlv_27= 'conditionals' )? otherlv_28= '(' ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* otherlv_32= ')' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1443:2: () otherlv_1= 'Staple' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= 'The' )? otherlv_5= 'user' )? (otherlv_6= 'may' | otherlv_7= 'is required' )? ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )? ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )? ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )? ( (otherlv_15= 'where' )? (otherlv_16= 'lowest' )? (otherlv_17= 'means' )? (otherlv_18= ',' )? ( (lv_first_19_0= ruleEString ) ) )? ( (otherlv_20= 'mean' )? (otherlv_21= 'means' )? ( (lv_mid_22_0= ruleEString ) ) )? ( (otherlv_23= 'and' )? (otherlv_24= 'highest' )? (otherlv_25= 'means' )? ( (lv_last_26_0= ruleEString ) ) )? ( (otherlv_27= 'conditionals' )? otherlv_28= '(' ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* otherlv_32= ')' )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1443:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1444:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStapleAccess().getStapleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleStaple3284); 

                	newLeafNode(otherlv_1, grammarAccess.getStapleAccess().getStapleKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1453:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1454:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1454:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1455:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStaple3301); 

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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStaple3318); 

                	newLeafNode(otherlv_3, grammarAccess.getStapleAccess().getColonKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1475:1: ( (otherlv_4= 'The' )? otherlv_5= 'user' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=15 && LA86_0<=16)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1475:2: (otherlv_4= 'The' )? otherlv_5= 'user'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1475:2: (otherlv_4= 'The' )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==15) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1475:4: otherlv_4= 'The'
                            {
                            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStaple3332); 

                                	newLeafNode(otherlv_4, grammarAccess.getStapleAccess().getTheKeyword_4_0());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStaple3346); 

                        	newLeafNode(otherlv_5, grammarAccess.getStapleAccess().getUserKeyword_4_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1483:3: (otherlv_6= 'may' | otherlv_7= 'is required' )?
            int alt87=3;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==17) ) {
                alt87=1;
            }
            else if ( (LA87_0==18) ) {
                alt87=2;
            }
            switch (alt87) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1483:5: otherlv_6= 'may'
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStaple3361); 

                        	newLeafNode(otherlv_6, grammarAccess.getStapleAccess().getMayKeyword_5_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1488:7: otherlv_7= 'is required'
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStaple3379); 

                        	newLeafNode(otherlv_7, grammarAccess.getStapleAccess().getIsRequiredKeyword_5_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1492:3: ( (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) ) )?
            int alt90=2;
            switch ( input.LA(1) ) {
                case 19:
                case 32:
                    {
                    alt90=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt90=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt90=1;
                    }
                    break;
            }

            switch (alt90) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1492:4: (otherlv_8= 'to' )? (otherlv_9= 'rate' )? ( (lv_question_10_0= ruleEString ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1492:4: (otherlv_8= 'to' )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==19) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1492:6: otherlv_8= 'to'
                            {
                            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStaple3395); 

                                	newLeafNode(otherlv_8, grammarAccess.getStapleAccess().getToKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1496:3: (otherlv_9= 'rate' )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==32) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1496:5: otherlv_9= 'rate'
                            {
                            otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleStaple3410); 

                                	newLeafNode(otherlv_9, grammarAccess.getStapleAccess().getRateKeyword_6_1());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1500:3: ( (lv_question_10_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1501:1: (lv_question_10_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1501:1: (lv_question_10_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1502:3: lv_question_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getQuestionEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3433);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:4: ( (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) ) )?
            int alt92=2;
            switch ( input.LA(1) ) {
                case 33:
                    {
                    alt92=1;
                    }
                    break;
                case 62:
                    {
                    int LA92_2 = input.LA(2);

                    if ( (LA92_2==RULE_INT) ) {
                        alt92=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt92=1;
                    }
                    break;
            }

            switch (alt92) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:5: (otherlv_11= 'between' )? ( (lv_Min_12_0= ruleEInt ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:5: (otherlv_11= 'between' )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==33) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1518:7: otherlv_11= 'between'
                            {
                            otherlv_11=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStaple3449); 

                                	newLeafNode(otherlv_11, grammarAccess.getStapleAccess().getBetweenKeyword_7_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1522:3: ( (lv_Min_12_0= ruleEInt ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1523:1: (lv_Min_12_0= ruleEInt )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1523:1: (lv_Min_12_0= ruleEInt )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1524:3: lv_Min_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getMinEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStaple3472);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1540:4: ( (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==34) ) {
                int LA94_1 = input.LA(2);

                if ( (LA94_1==RULE_INT||LA94_1==62) ) {
                    alt94=1;
                }
            }
            else if ( (LA94_0==RULE_INT||LA94_0==62) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1540:5: (otherlv_13= 'and' )? ( (lv_Max_14_0= ruleEInt ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1540:5: (otherlv_13= 'and' )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==34) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1540:7: otherlv_13= 'and'
                            {
                            otherlv_13=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStaple3488); 

                                	newLeafNode(otherlv_13, grammarAccess.getStapleAccess().getAndKeyword_8_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1544:3: ( (lv_Max_14_0= ruleEInt ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1545:1: (lv_Max_14_0= ruleEInt )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1545:1: (lv_Max_14_0= ruleEInt )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1546:3: lv_Max_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getMaxEIntParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStaple3511);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1562:4: ( (otherlv_15= 'where' )? (otherlv_16= 'lowest' )? (otherlv_17= 'means' )? (otherlv_18= ',' )? ( (lv_first_19_0= ruleEString ) ) )?
            int alt99=2;
            switch ( input.LA(1) ) {
                case 25:
                case 35:
                case 36:
                    {
                    alt99=1;
                    }
                    break;
                case 37:
                    {
                    int LA99_2 = input.LA(2);

                    if ( (LA99_2==RULE_STRING) ) {
                        alt99=1;
                    }
                    else if ( (LA99_2==RULE_ID||LA99_2==25) ) {
                        alt99=1;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    alt99=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt99=1;
                    }
                    break;
            }

            switch (alt99) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1562:5: (otherlv_15= 'where' )? (otherlv_16= 'lowest' )? (otherlv_17= 'means' )? (otherlv_18= ',' )? ( (lv_first_19_0= ruleEString ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1562:5: (otherlv_15= 'where' )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==35) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1562:7: otherlv_15= 'where'
                            {
                            otherlv_15=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStaple3527); 

                                	newLeafNode(otherlv_15, grammarAccess.getStapleAccess().getWhereKeyword_9_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1566:3: (otherlv_16= 'lowest' )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==36) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1566:5: otherlv_16= 'lowest'
                            {
                            otherlv_16=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStaple3542); 

                                	newLeafNode(otherlv_16, grammarAccess.getStapleAccess().getLowestKeyword_9_1());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:3: (otherlv_17= 'means' )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==37) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:5: otherlv_17= 'means'
                            {
                            otherlv_17=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStaple3557); 

                                	newLeafNode(otherlv_17, grammarAccess.getStapleAccess().getMeansKeyword_9_2());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1574:3: (otherlv_18= ',' )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==25) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1574:5: otherlv_18= ','
                            {
                            otherlv_18=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleStaple3572); 

                                	newLeafNode(otherlv_18, grammarAccess.getStapleAccess().getCommaKeyword_9_3());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1578:3: ( (lv_first_19_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1579:1: (lv_first_19_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1579:1: (lv_first_19_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1580:3: lv_first_19_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getFirstEStringParserRuleCall_9_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3595);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:4: ( (otherlv_20= 'mean' )? (otherlv_21= 'means' )? ( (lv_mid_22_0= ruleEString ) ) )?
            int alt102=2;
            switch ( input.LA(1) ) {
                case 58:
                    {
                    alt102=1;
                    }
                    break;
                case 37:
                    {
                    int LA102_2 = input.LA(2);

                    if ( (LA102_2==RULE_STRING) ) {
                        alt102=1;
                    }
                    else if ( (LA102_2==RULE_ID) ) {
                        alt102=1;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    alt102=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt102=1;
                    }
                    break;
            }

            switch (alt102) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:5: (otherlv_20= 'mean' )? (otherlv_21= 'means' )? ( (lv_mid_22_0= ruleEString ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:5: (otherlv_20= 'mean' )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==58) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:7: otherlv_20= 'mean'
                            {
                            otherlv_20=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleStaple3611); 

                                	newLeafNode(otherlv_20, grammarAccess.getStapleAccess().getMeanKeyword_10_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1600:3: (otherlv_21= 'means' )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==37) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1600:5: otherlv_21= 'means'
                            {
                            otherlv_21=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStaple3626); 

                                	newLeafNode(otherlv_21, grammarAccess.getStapleAccess().getMeansKeyword_10_1());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1604:3: ( (lv_mid_22_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1605:1: (lv_mid_22_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1605:1: (lv_mid_22_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1606:3: lv_mid_22_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getMidEStringParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3649);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1622:4: ( (otherlv_23= 'and' )? (otherlv_24= 'highest' )? (otherlv_25= 'means' )? ( (lv_last_26_0= ruleEString ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=RULE_STRING && LA106_0<=RULE_ID)||LA106_0==34||(LA106_0>=37 && LA106_0<=38)) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1622:5: (otherlv_23= 'and' )? (otherlv_24= 'highest' )? (otherlv_25= 'means' )? ( (lv_last_26_0= ruleEString ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1622:5: (otherlv_23= 'and' )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==34) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1622:7: otherlv_23= 'and'
                            {
                            otherlv_23=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStaple3665); 

                                	newLeafNode(otherlv_23, grammarAccess.getStapleAccess().getAndKeyword_11_0());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1626:3: (otherlv_24= 'highest' )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==38) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1626:5: otherlv_24= 'highest'
                            {
                            otherlv_24=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleStaple3680); 

                                	newLeafNode(otherlv_24, grammarAccess.getStapleAccess().getHighestKeyword_11_1());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1630:3: (otherlv_25= 'means' )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==37) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1630:5: otherlv_25= 'means'
                            {
                            otherlv_25=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStaple3695); 

                                	newLeafNode(otherlv_25, grammarAccess.getStapleAccess().getMeansKeyword_11_2());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1634:3: ( (lv_last_26_0= ruleEString ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1635:1: (lv_last_26_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1635:1: (lv_last_26_0= ruleEString )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1636:3: lv_last_26_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getLastEStringParserRuleCall_11_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3718);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1652:4: ( (otherlv_27= 'conditionals' )? otherlv_28= '(' ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* otherlv_32= ')' )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( ((LA109_0>=39 && LA109_0<=40)) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1652:5: (otherlv_27= 'conditionals' )? otherlv_28= '(' ( (lv_Fork_29_0= ruleRatingFork ) ) (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )* otherlv_32= ')'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1652:5: (otherlv_27= 'conditionals' )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==39) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1652:7: otherlv_27= 'conditionals'
                            {
                            otherlv_27=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleStaple3734); 

                                	newLeafNode(otherlv_27, grammarAccess.getStapleAccess().getConditionalsKeyword_12_0());
                                

                            }
                            break;

                    }

                    otherlv_28=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleStaple3748); 

                        	newLeafNode(otherlv_28, grammarAccess.getStapleAccess().getLeftParenthesisKeyword_12_1());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1660:1: ( (lv_Fork_29_0= ruleRatingFork ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1661:1: (lv_Fork_29_0= ruleRatingFork )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1661:1: (lv_Fork_29_0= ruleRatingFork )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1662:3: lv_Fork_29_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getForkRatingForkParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3769);
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

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1678:2: (otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==25) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1678:4: otherlv_30= ',' ( (lv_Fork_31_0= ruleRatingFork ) )
                    	    {
                    	    otherlv_30=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleStaple3782); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getStapleAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1682:1: ( (lv_Fork_31_0= ruleRatingFork ) )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1683:1: (lv_Fork_31_0= ruleRatingFork )
                    	    {
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1683:1: (lv_Fork_31_0= ruleRatingFork )
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1684:3: lv_Fork_31_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStapleAccess().getForkRatingForkParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3803);
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
                    	    break loop108;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleStaple3817); 

                        	newLeafNode(otherlv_32, grammarAccess.getStapleAccess().getRightParenthesisKeyword_12_4());
                        

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1712:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1713:2: (iv_ruleChoice= ruleChoice EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1714:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_entryRuleChoice3855);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoice3865); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1721:1: ruleChoice returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_Description_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1724:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1725:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1725:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1725:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Description_2_0= ruleEString ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1725:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1726:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1726:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1727:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleChoice3907); 

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

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleChoice3924); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1747:1: ( (lv_Description_2_0= ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1748:1: (lv_Description_2_0= ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1748:1: (lv_Description_2_0= ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1749:3: lv_Description_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChoiceAccess().getDescriptionEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoice3945);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1773:1: entryRuleChoiceFork returns [EObject current=null] : iv_ruleChoiceFork= ruleChoiceFork EOF ;
    public final EObject entryRuleChoiceFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceFork = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1774:2: (iv_ruleChoiceFork= ruleChoiceFork EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1775:2: iv_ruleChoiceFork= ruleChoiceFork EOF
            {
             newCompositeNode(grammarAccess.getChoiceForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceFork_in_entryRuleChoiceFork3981);
            iv_ruleChoiceFork=ruleChoiceFork();

            state._fsp--;

             current =iv_ruleChoiceFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceFork3991); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1782:1: ruleChoiceFork returns [EObject current=null] : (otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go to' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleChoiceFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1785:28: ( (otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go to' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1786:1: (otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go to' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1786:1: (otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go to' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1786:3: otherlv_0= 'If' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'then' )? otherlv_5= 'go to' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleChoiceFork4028); 

                	newLeafNode(otherlv_0, grammarAccess.getChoiceForkAccess().getIfKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1790:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1791:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1791:1: ( ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1792:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getChoiceForkAccess().getOnChoiceCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork4051);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1805:2: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==25) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1805:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleChoiceFork4064); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChoiceForkAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1809:1: ( ( ruleEString ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1810:1: ( ruleEString )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1810:1: ( ruleEString )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1811:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceForkAccess().getOnChoiceCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork4087);
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1824:4: (otherlv_4= 'then' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==60) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1824:6: otherlv_4= 'then'
                    {
                    otherlv_4=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleChoiceFork4102); 

                        	newLeafNode(otherlv_4, grammarAccess.getChoiceForkAccess().getThenKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleChoiceFork4116); 

                	newLeafNode(otherlv_5, grammarAccess.getChoiceForkAccess().getGoToKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1832:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1833:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1833:1: ( ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1834:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getChoiceForkAccess().getQuestionsQuestionCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork4139);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1847:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==25) ) {
                    int LA112_1 = input.LA(2);

                    if ( ((LA112_1>=RULE_STRING && LA112_1<=RULE_ID)) ) {
                        alt112=1;
                    }


                }


                switch (alt112) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1847:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleChoiceFork4152); 

            	        	newLeafNode(otherlv_7, grammarAccess.getChoiceForkAccess().getCommaKeyword_6_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1851:1: ( ( ruleEString ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1852:1: ( ruleEString )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1852:1: ( ruleEString )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1853:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChoiceForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceForkAccess().getQuestionsQuestionCrossReference_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceFork4175);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop112;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1874:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1875:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1876:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4214);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4225); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1883:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1886:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1887:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1887:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1887:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1887:2: (kw= '-' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==62) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1888:2: kw= '-'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleEInt4264); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4281); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1908:1: entryRuleRatingFork returns [EObject current=null] : iv_ruleRatingFork= ruleRatingFork EOF ;
    public final EObject entryRuleRatingFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatingFork = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1909:2: (iv_ruleRatingFork= ruleRatingFork EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1910:2: iv_ruleRatingFork= ruleRatingFork EOF
            {
             newCompositeNode(grammarAccess.getRatingForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_entryRuleRatingFork4326);
            iv_ruleRatingFork=ruleRatingFork();

            state._fsp--;

             current =iv_ruleRatingFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRatingFork4336); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1917:1: ruleRatingFork returns [EObject current=null] : ( (otherlv_0= 'Min' ( (lv_Min_1_0= ruleEInt ) ) )? (otherlv_2= 'Max' ( (lv_Max_3_0= ruleEInt ) ) )? otherlv_4= 'Questions' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ;
    public final EObject ruleRatingFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_Min_1_0 = null;

        AntlrDatatypeRuleToken lv_Max_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1920:28: ( ( (otherlv_0= 'Min' ( (lv_Min_1_0= ruleEInt ) ) )? (otherlv_2= 'Max' ( (lv_Max_3_0= ruleEInt ) ) )? otherlv_4= 'Questions' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:1: ( (otherlv_0= 'Min' ( (lv_Min_1_0= ruleEInt ) ) )? (otherlv_2= 'Max' ( (lv_Max_3_0= ruleEInt ) ) )? otherlv_4= 'Questions' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:1: ( (otherlv_0= 'Min' ( (lv_Min_1_0= ruleEInt ) ) )? (otherlv_2= 'Max' ( (lv_Max_3_0= ruleEInt ) ) )? otherlv_4= 'Questions' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:2: (otherlv_0= 'Min' ( (lv_Min_1_0= ruleEInt ) ) )? (otherlv_2= 'Max' ( (lv_Max_3_0= ruleEInt ) ) )? otherlv_4= 'Questions' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:2: (otherlv_0= 'Min' ( (lv_Min_1_0= ruleEInt ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==63) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1921:4: otherlv_0= 'Min' ( (lv_Min_1_0= ruleEInt ) )
                    {
                    otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleRatingFork4374); 

                        	newLeafNode(otherlv_0, grammarAccess.getRatingForkAccess().getMinKeyword_0_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1925:1: ( (lv_Min_1_0= ruleEInt ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1926:1: (lv_Min_1_0= ruleEInt )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1926:1: (lv_Min_1_0= ruleEInt )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1927:3: lv_Min_1_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRatingForkAccess().getMinEIntParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork4395);
                    lv_Min_1_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRatingForkRule());
                    	        }
                           		set(
                           			current, 
                           			"Min",
                            		lv_Min_1_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1943:4: (otherlv_2= 'Max' ( (lv_Max_3_0= ruleEInt ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==64) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1943:6: otherlv_2= 'Max' ( (lv_Max_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleRatingFork4410); 

                        	newLeafNode(otherlv_2, grammarAccess.getRatingForkAccess().getMaxKeyword_1_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1947:1: ( (lv_Max_3_0= ruleEInt ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1948:1: (lv_Max_3_0= ruleEInt )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1948:1: (lv_Max_3_0= ruleEInt )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1949:3: lv_Max_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRatingForkAccess().getMaxEIntParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork4431);
                    lv_Max_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRatingForkRule());
                    	        }
                           		set(
                           			current, 
                           			"Max",
                            		lv_Max_3_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleRatingFork4445); 

                	newLeafNode(otherlv_4, grammarAccess.getRatingForkAccess().getQuestionsKeyword_2());
                
            otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRatingFork4457); 

                	newLeafNode(otherlv_5, grammarAccess.getRatingForkAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1973:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1974:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1974:1: ( ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1975:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRatingForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRatingForkAccess().getQuestionsQuestionCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRatingFork4480);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1988:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==25) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1988:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRatingFork4493); 

            	        	newLeafNode(otherlv_7, grammarAccess.getRatingForkAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1992:1: ( ( ruleEString ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1993:1: ( ruleEString )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1993:1: ( ruleEString )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1994:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRatingForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRatingForkAccess().getQuestionsQuestionCrossReference_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRatingFork4516);
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

            otherlv_9=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRatingFork4530); 

                	newLeafNode(otherlv_9, grammarAccess.getRatingForkAccess().getRightParenthesisKeyword_6());
                

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2019:1: entryRuleRankingSumFork returns [EObject current=null] : iv_ruleRankingSumFork= ruleRankingSumFork EOF ;
    public final EObject entryRuleRankingSumFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRankingSumFork = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2020:2: (iv_ruleRankingSumFork= ruleRankingSumFork EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2021:2: iv_ruleRankingSumFork= ruleRankingSumFork EOF
            {
             newCompositeNode(grammarAccess.getRankingSumForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRankingSumFork_in_entryRuleRankingSumFork4566);
            iv_ruleRankingSumFork=ruleRankingSumFork();

            state._fsp--;

             current =iv_ruleRankingSumFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRankingSumFork4576); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2028:1: ruleRankingSumFork returns [EObject current=null] : (otherlv_0= 'On' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'From' ( (lv_Max_5_0= ruleEInt ) ) )? (otherlv_6= 'To' ( (lv_Min_7_0= ruleEInt ) ) )? otherlv_8= 'Questions' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleRankingSumFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_Max_5_0 = null;

        AntlrDatatypeRuleToken lv_Min_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2031:28: ( (otherlv_0= 'On' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'From' ( (lv_Max_5_0= ruleEInt ) ) )? (otherlv_6= 'To' ( (lv_Min_7_0= ruleEInt ) ) )? otherlv_8= 'Questions' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2032:1: (otherlv_0= 'On' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'From' ( (lv_Max_5_0= ruleEInt ) ) )? (otherlv_6= 'To' ( (lv_Min_7_0= ruleEInt ) ) )? otherlv_8= 'Questions' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2032:1: (otherlv_0= 'On' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'From' ( (lv_Max_5_0= ruleEInt ) ) )? (otherlv_6= 'To' ( (lv_Min_7_0= ruleEInt ) ) )? otherlv_8= 'Questions' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2032:3: otherlv_0= 'On' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* (otherlv_4= 'From' ( (lv_Max_5_0= ruleEInt ) ) )? (otherlv_6= 'To' ( (lv_Min_7_0= ruleEInt ) ) )? otherlv_8= 'Questions' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleRankingSumFork4613); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingSumForkAccess().getOnKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2036:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2037:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2037:1: ( ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2038:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getOnChoiceCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4636);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2051:2: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==25) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2051:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRankingSumFork4649); 

            	        	newLeafNode(otherlv_2, grammarAccess.getRankingSumForkAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2055:1: ( ( ruleEString ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2056:1: ( ruleEString )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2056:1: ( ruleEString )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2057:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getOnChoiceCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4672);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2070:4: (otherlv_4= 'From' ( (lv_Max_5_0= ruleEInt ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==67) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2070:6: otherlv_4= 'From' ( (lv_Max_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleRankingSumFork4687); 

                        	newLeafNode(otherlv_4, grammarAccess.getRankingSumForkAccess().getFromKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2074:1: ( (lv_Max_5_0= ruleEInt ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2075:1: (lv_Max_5_0= ruleEInt )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2075:1: (lv_Max_5_0= ruleEInt )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2076:3: lv_Max_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getMaxEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingSumFork4708);
                    lv_Max_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingSumForkRule());
                    	        }
                           		set(
                           			current, 
                           			"Max",
                            		lv_Max_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2092:4: (otherlv_6= 'To' ( (lv_Min_7_0= ruleEInt ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==68) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2092:6: otherlv_6= 'To' ( (lv_Min_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleRankingSumFork4723); 

                        	newLeafNode(otherlv_6, grammarAccess.getRankingSumForkAccess().getToKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2096:1: ( (lv_Min_7_0= ruleEInt ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2097:1: (lv_Min_7_0= ruleEInt )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2097:1: (lv_Min_7_0= ruleEInt )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2098:3: lv_Min_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getMinEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingSumFork4744);
                    lv_Min_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingSumForkRule());
                    	        }
                           		set(
                           			current, 
                           			"Min",
                            		lv_Min_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleRankingSumFork4758); 

                	newLeafNode(otherlv_8, grammarAccess.getRankingSumForkAccess().getQuestionsKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2118:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2119:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2119:1: ( ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2120:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getQuestionsQuestionCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4781);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2133:2: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==25) ) {
                    int LA120_1 = input.LA(2);

                    if ( ((LA120_1>=RULE_STRING && LA120_1<=RULE_ID)) ) {
                        alt120=1;
                    }


                }


                switch (alt120) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2133:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRankingSumFork4794); 

            	        	newLeafNode(otherlv_10, grammarAccess.getRankingSumForkAccess().getCommaKeyword_7_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2137:1: ( ( ruleEString ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2138:1: ( ruleEString )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2138:1: ( ruleEString )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2139:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRankingSumForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRankingSumForkAccess().getQuestionsQuestionCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingSumFork4817);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop120;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2160:1: entryRuleDichotomousFork returns [EObject current=null] : iv_ruleDichotomousFork= ruleDichotomousFork EOF ;
    public final EObject entryRuleDichotomousFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDichotomousFork = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2161:2: (iv_ruleDichotomousFork= ruleDichotomousFork EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2162:2: iv_ruleDichotomousFork= ruleDichotomousFork EOF
            {
             newCompositeNode(grammarAccess.getDichotomousForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDichotomousFork_in_entryRuleDichotomousFork4855);
            iv_ruleDichotomousFork=ruleDichotomousFork();

            state._fsp--;

             current =iv_ruleDichotomousFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDichotomousFork4865); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2169:1: ruleDichotomousFork returns [EObject current=null] : (otherlv_0= 'DichotomousFork' otherlv_1= 'Questions' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleDichotomousFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2172:28: ( (otherlv_0= 'DichotomousFork' otherlv_1= 'Questions' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2173:1: (otherlv_0= 'DichotomousFork' otherlv_1= 'Questions' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2173:1: (otherlv_0= 'DichotomousFork' otherlv_1= 'Questions' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2173:3: otherlv_0= 'DichotomousFork' otherlv_1= 'Questions' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleDichotomousFork4902); 

                	newLeafNode(otherlv_0, grammarAccess.getDichotomousForkAccess().getDichotomousForkKeyword_0());
                
            otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleDichotomousFork4914); 

                	newLeafNode(otherlv_1, grammarAccess.getDichotomousForkAccess().getQuestionsKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2181:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2182:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2182:1: ( ruleEString )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2183:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDichotomousForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDichotomousForkAccess().getQuestionsQuestionCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDichotomousFork4937);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2196:2: (otherlv_3= ',' ( ( ruleEString ) ) )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==25) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2196:4: otherlv_3= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDichotomousFork4950); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDichotomousForkAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2200:1: ( ( ruleEString ) )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2201:1: ( ruleEString )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2201:1: ( ruleEString )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2202:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDichotomousForkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getDichotomousForkAccess().getQuestionsQuestionCrossReference_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDichotomousFork4973);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop121;
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
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey534 = new BitSet(new long[]{0x02120400C0002002L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey556 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey568 = new BitSet(new long[]{0x02120400C0002002L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey590 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey602 = new BitSet(new long[]{0x02120400C0002002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString643 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice767 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleMultipleChoice823 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleChoice840 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMultipleChoice857 = new BitSet(new long[]{0x0800000025FF8032L});
        public static final BitSet FOLLOW_15_in_ruleMultipleChoice871 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMultipleChoice885 = new BitSet(new long[]{0x0800000025FE0032L});
        public static final BitSet FOLLOW_17_in_ruleMultipleChoice900 = new BitSet(new long[]{0x0800000025F80032L});
        public static final BitSet FOLLOW_18_in_ruleMultipleChoice924 = new BitSet(new long[]{0x0800000025F80032L});
        public static final BitSet FOLLOW_19_in_ruleMultipleChoice953 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_20_in_ruleMultipleChoice968 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice991 = new BitSet(new long[]{0x0800000025E00022L});
        public static final BitSet FOLLOW_21_in_ruleMultipleChoice1007 = new BitSet(new long[]{0x0000000001E00020L});
        public static final BitSet FOLLOW_22_in_ruleMultipleChoice1022 = new BitSet(new long[]{0x0000000001E00020L});
        public static final BitSet FOLLOW_23_in_ruleMultipleChoice1040 = new BitSet(new long[]{0x0000000001E00020L});
        public static final BitSet FOLLOW_24_in_ruleMultipleChoice1055 = new BitSet(new long[]{0x0000000001E00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice1078 = new BitSet(new long[]{0x0800000026000002L});
        public static final BitSet FOLLOW_25_in_ruleMultipleChoice1091 = new BitSet(new long[]{0x0000000001E00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice1112 = new BitSet(new long[]{0x0800000026000002L});
        public static final BitSet FOLLOW_26_in_ruleMultipleChoice1129 = new BitSet(new long[]{0x0000000018200030L});
        public static final BitSet FOLLOW_21_in_ruleMultipleChoice1142 = new BitSet(new long[]{0x0000000018000030L});
        public static final BitSet FOLLOW_27_in_ruleMultipleChoice1157 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_28_in_ruleMultipleChoice1172 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice1195 = new BitSet(new long[]{0x0800000020000002L});
        public static final BitSet FOLLOW_29_in_ruleMultipleChoice1210 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1234 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleMultipleChoice1247 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_ruleMultipleChoice1268 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleOpen_in_entryRuleOpen1308 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpen1318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleOpen1364 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOpen1381 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleOpen1398 = new BitSet(new long[]{0x00000000001F8032L});
        public static final BitSet FOLLOW_15_in_ruleOpen1412 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOpen1426 = new BitSet(new long[]{0x00000000001E0032L});
        public static final BitSet FOLLOW_17_in_ruleOpen1441 = new BitSet(new long[]{0x0000000000180032L});
        public static final BitSet FOLLOW_18_in_ruleOpen1459 = new BitSet(new long[]{0x0000000000180032L});
        public static final BitSet FOLLOW_19_in_ruleOpen1475 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_20_in_ruleOpen1490 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpen1513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1551 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRating_Impl1561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleRating_Impl1607 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRating_Impl1624 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRating_Impl1641 = new BitSet(new long[]{0x400001FF000F8072L});
        public static final BitSet FOLLOW_15_in_ruleRating_Impl1655 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRating_Impl1669 = new BitSet(new long[]{0x400001FF000E0072L});
        public static final BitSet FOLLOW_17_in_ruleRating_Impl1684 = new BitSet(new long[]{0x400001FF00080072L});
        public static final BitSet FOLLOW_18_in_ruleRating_Impl1702 = new BitSet(new long[]{0x400001FF00080072L});
        public static final BitSet FOLLOW_19_in_ruleRating_Impl1718 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_32_in_ruleRating_Impl1733 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1756 = new BitSet(new long[]{0x400001FE00000072L});
        public static final BitSet FOLLOW_33_in_ruleRating_Impl1772 = new BitSet(new long[]{0x4000000200000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1795 = new BitSet(new long[]{0x400001FE00000072L});
        public static final BitSet FOLLOW_34_in_ruleRating_Impl1811 = new BitSet(new long[]{0x4000000200000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1834 = new BitSet(new long[]{0x000001FC00000032L});
        public static final BitSet FOLLOW_35_in_ruleRating_Impl1850 = new BitSet(new long[]{0x0000003000000030L});
        public static final BitSet FOLLOW_36_in_ruleRating_Impl1865 = new BitSet(new long[]{0x0000002000000030L});
        public static final BitSet FOLLOW_37_in_ruleRating_Impl1880 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1903 = new BitSet(new long[]{0x000001E400000032L});
        public static final BitSet FOLLOW_34_in_ruleRating_Impl1919 = new BitSet(new long[]{0x0000006000000030L});
        public static final BitSet FOLLOW_38_in_ruleRating_Impl1934 = new BitSet(new long[]{0x0000002000000030L});
        public static final BitSet FOLLOW_37_in_ruleRating_Impl1949 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1972 = new BitSet(new long[]{0x0000018000000002L});
        public static final BitSet FOLLOW_39_in_ruleRating_Impl1988 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleRating_Impl2002 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl2023 = new BitSet(new long[]{0x0000020002000000L});
        public static final BitSet FOLLOW_25_in_ruleRating_Impl2036 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl2057 = new BitSet(new long[]{0x0000020002000000L});
        public static final BitSet FOLLOW_41_in_ruleRating_Impl2071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_entryRuleRanking2109 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRanking2119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleRanking2156 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRanking2173 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRanking2190 = new BitSet(new long[]{0x0000798000040032L});
        public static final BitSet FOLLOW_18_in_ruleRanking2203 = new BitSet(new long[]{0x0000798000000032L});
        public static final BitSet FOLLOW_43_in_ruleRanking2219 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRanking2242 = new BitSet(new long[]{0x0000718000000002L});
        public static final BitSet FOLLOW_44_in_ruleRanking2258 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_45_in_ruleRanking2273 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleRanking2287 = new BitSet(new long[]{0x0001800001E00020L});
        public static final BitSet FOLLOW_47_in_ruleRanking2300 = new BitSet(new long[]{0x0001000001E00020L});
        public static final BitSet FOLLOW_48_in_ruleRanking2315 = new BitSet(new long[]{0x0000000001E00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2338 = new BitSet(new long[]{0x0000018002000002L});
        public static final BitSet FOLLOW_25_in_ruleRanking2351 = new BitSet(new long[]{0x0000000001E00020L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2372 = new BitSet(new long[]{0x0000018002000002L});
        public static final BitSet FOLLOW_39_in_ruleRanking2390 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleRanking2404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleRanking2425 = new BitSet(new long[]{0x0000020002000000L});
        public static final BitSet FOLLOW_25_in_ruleRanking2438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleRanking2459 = new BitSet(new long[]{0x0000020002000000L});
        public static final BitSet FOLLOW_41_in_ruleRanking2473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDichotomous_in_entryRuleDichotomous2511 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDichotomous2521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleDichotomous2567 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDichotomous2584 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDichotomous2601 = new BitSet(new long[]{0x000C0000001F8032L});
        public static final BitSet FOLLOW_15_in_ruleDichotomous2615 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDichotomous2629 = new BitSet(new long[]{0x000C0000001E0032L});
        public static final BitSet FOLLOW_17_in_ruleDichotomous2644 = new BitSet(new long[]{0x000C000000180032L});
        public static final BitSet FOLLOW_18_in_ruleDichotomous2662 = new BitSet(new long[]{0x000C000000180032L});
        public static final BitSet FOLLOW_19_in_ruleDichotomous2678 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_20_in_ruleDichotomous2693 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDichotomous2716 = new BitSet(new long[]{0x000C000000000002L});
        public static final BitSet FOLLOW_50_in_ruleDichotomous2731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_ruleDichotomousFork_in_ruleDichotomous2752 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_51_in_ruleDichotomous2767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_ruleDichotomousFork_in_ruleDichotomous2788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumConstant_in_entryRuleSumConstant2826 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSumConstant2836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleSumConstant2882 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSumConstant2899 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSumConstant2916 = new BitSet(new long[]{0x01E00180000F8032L});
        public static final BitSet FOLLOW_15_in_ruleSumConstant2930 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSumConstant2944 = new BitSet(new long[]{0x01E00180000E0032L});
        public static final BitSet FOLLOW_17_in_ruleSumConstant2959 = new BitSet(new long[]{0x01E0018000080032L});
        public static final BitSet FOLLOW_18_in_ruleSumConstant2977 = new BitSet(new long[]{0x01E0018000080032L});
        public static final BitSet FOLLOW_19_in_ruleSumConstant2993 = new BitSet(new long[]{0x01E0000000080030L});
        public static final BitSet FOLLOW_53_in_ruleSumConstant3008 = new BitSet(new long[]{0x01C0000000080030L});
        public static final BitSet FOLLOW_54_in_ruleSumConstant3023 = new BitSet(new long[]{0x0180000000080030L});
        public static final BitSet FOLLOW_19_in_ruleSumConstant3038 = new BitSet(new long[]{0x0180000000000030L});
        public static final BitSet FOLLOW_55_in_ruleSumConstant3053 = new BitSet(new long[]{0x0100000000000030L});
        public static final BitSet FOLLOW_56_in_ruleSumConstant3068 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSumConstant3091 = new BitSet(new long[]{0x0000018000000002L});
        public static final BitSet FOLLOW_39_in_ruleSumConstant3107 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleSumConstant3121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleSumConstant3142 = new BitSet(new long[]{0x0000020002000000L});
        public static final BitSet FOLLOW_25_in_ruleSumConstant3155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_ruleSumConstant3176 = new BitSet(new long[]{0x0000020002000000L});
        public static final BitSet FOLLOW_41_in_ruleSumConstant3190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStaple_in_entryRuleStaple3228 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStaple3238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleStaple3284 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStaple3301 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleStaple3318 = new BitSet(new long[]{0x440001FF020F8072L});
        public static final BitSet FOLLOW_15_in_ruleStaple3332 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleStaple3346 = new BitSet(new long[]{0x440001FF020E0072L});
        public static final BitSet FOLLOW_17_in_ruleStaple3361 = new BitSet(new long[]{0x440001FF02080072L});
        public static final BitSet FOLLOW_18_in_ruleStaple3379 = new BitSet(new long[]{0x440001FF02080072L});
        public static final BitSet FOLLOW_19_in_ruleStaple3395 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_32_in_ruleStaple3410 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3433 = new BitSet(new long[]{0x440001FE02000072L});
        public static final BitSet FOLLOW_33_in_ruleStaple3449 = new BitSet(new long[]{0x4000000200000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStaple3472 = new BitSet(new long[]{0x440001FE02000072L});
        public static final BitSet FOLLOW_34_in_ruleStaple3488 = new BitSet(new long[]{0x4000000200000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStaple3511 = new BitSet(new long[]{0x040001FC02000032L});
        public static final BitSet FOLLOW_35_in_ruleStaple3527 = new BitSet(new long[]{0x0000003002000030L});
        public static final BitSet FOLLOW_36_in_ruleStaple3542 = new BitSet(new long[]{0x0000002002000030L});
        public static final BitSet FOLLOW_37_in_ruleStaple3557 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleStaple3572 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3595 = new BitSet(new long[]{0x040001E400000032L});
        public static final BitSet FOLLOW_58_in_ruleStaple3611 = new BitSet(new long[]{0x0000002000000030L});
        public static final BitSet FOLLOW_37_in_ruleStaple3626 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3649 = new BitSet(new long[]{0x000001E400000032L});
        public static final BitSet FOLLOW_34_in_ruleStaple3665 = new BitSet(new long[]{0x0000006000000030L});
        public static final BitSet FOLLOW_38_in_ruleStaple3680 = new BitSet(new long[]{0x0000002000000030L});
        public static final BitSet FOLLOW_37_in_ruleStaple3695 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3718 = new BitSet(new long[]{0x0000018000000002L});
        public static final BitSet FOLLOW_39_in_ruleStaple3734 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleStaple3748 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3769 = new BitSet(new long[]{0x0000020002000000L});
        public static final BitSet FOLLOW_25_in_ruleStaple3782 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3803 = new BitSet(new long[]{0x0000020002000000L});
        public static final BitSet FOLLOW_41_in_ruleStaple3817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice3855 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoice3865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleChoice3907 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleChoice3924 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoice3945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceFork_in_entryRuleChoiceFork3981 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceFork3991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleChoiceFork4028 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork4051 = new BitSet(new long[]{0x3000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleChoiceFork4064 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork4087 = new BitSet(new long[]{0x3000000002000000L});
        public static final BitSet FOLLOW_60_in_ruleChoiceFork4102 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_61_in_ruleChoiceFork4116 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork4139 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleChoiceFork4152 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceFork4175 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4214 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleEInt4264 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_entryRuleRatingFork4326 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRatingFork4336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleRatingFork4374 = new BitSet(new long[]{0x4000000200000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork4395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_64_in_ruleRatingFork4410 = new BitSet(new long[]{0x4000000200000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork4431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleRatingFork4445 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleRatingFork4457 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRatingFork4480 = new BitSet(new long[]{0x0000020002000000L});
        public static final BitSet FOLLOW_25_in_ruleRatingFork4493 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRatingFork4516 = new BitSet(new long[]{0x0000020002000000L});
        public static final BitSet FOLLOW_41_in_ruleRatingFork4530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRankingSumFork_in_entryRuleRankingSumFork4566 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRankingSumFork4576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleRankingSumFork4613 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4636 = new BitSet(new long[]{0x0000000002000000L,0x000000000000001AL});
        public static final BitSet FOLLOW_25_in_ruleRankingSumFork4649 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4672 = new BitSet(new long[]{0x0000000002000000L,0x000000000000001AL});
        public static final BitSet FOLLOW_67_in_ruleRankingSumFork4687 = new BitSet(new long[]{0x4000000200000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingSumFork4708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000012L});
        public static final BitSet FOLLOW_68_in_ruleRankingSumFork4723 = new BitSet(new long[]{0x4000000200000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingSumFork4744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleRankingSumFork4758 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4781 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleRankingSumFork4794 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingSumFork4817 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleDichotomousFork_in_entryRuleDichotomousFork4855 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDichotomousFork4865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleDichotomousFork4902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleDichotomousFork4914 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDichotomousFork4937 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleDichotomousFork4950 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDichotomousFork4973 = new BitSet(new long[]{0x0000000002000002L});
    }


}