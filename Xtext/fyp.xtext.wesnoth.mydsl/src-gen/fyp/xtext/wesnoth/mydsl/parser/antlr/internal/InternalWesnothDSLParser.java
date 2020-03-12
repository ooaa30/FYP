package fyp.xtext.wesnoth.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fyp.xtext.wesnoth.mydsl.services.WesnothDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWesnothDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rule'", "'{'", "'}'", "'when:'", "'always'", "'health'", "'-'", "'x:'", "'y:'", "'unit'", "'is'", "'goal'", "'value'", "'x'", "'y'", "'movement'", "'heal'", "'retreat'", "'move_to_targets'", "'basic_movement'", "'combat'", "'recruit'", "'combat_value_targets'", "'capture_villages'", "'leader_to_keep'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWesnothDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWesnothDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWesnothDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWesnothDSL.g"; }



     	private WesnothDSLGrammarAccess grammarAccess;

        public InternalWesnothDSLParser(TokenStream input, WesnothDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected WesnothDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalWesnothDSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalWesnothDSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalWesnothDSL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalWesnothDSL.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleRule ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalWesnothDSL.g:77:2: ( ( (lv_elements_0_0= ruleRule ) )* )
            // InternalWesnothDSL.g:78:2: ( (lv_elements_0_0= ruleRule ) )*
            {
            // InternalWesnothDSL.g:78:2: ( (lv_elements_0_0= ruleRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWesnothDSL.g:79:3: (lv_elements_0_0= ruleRule )
            	    {
            	    // InternalWesnothDSL.g:79:3: (lv_elements_0_0= ruleRule )
            	    // InternalWesnothDSL.g:80:4: lv_elements_0_0= ruleRule
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsRuleParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleRule();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"fyp.xtext.wesnoth.mydsl.WesnothDSL.Rule");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleRule"
    // InternalWesnothDSL.g:100:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalWesnothDSL.g:100:45: (iv_ruleRule= ruleRule EOF )
            // InternalWesnothDSL.g:101:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalWesnothDSL.g:107:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) ) ( (lv_goals_4_0= ruleGoal ) )* otherlv_5= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_fragments_3_0 = null;

        EObject lv_goals_4_0 = null;



        	enterRule();

        try {
            // InternalWesnothDSL.g:113:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) ) ( (lv_goals_4_0= ruleGoal ) )* otherlv_5= '}' ) )
            // InternalWesnothDSL.g:114:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) ) ( (lv_goals_4_0= ruleGoal ) )* otherlv_5= '}' )
            {
            // InternalWesnothDSL.g:114:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) ) ( (lv_goals_4_0= ruleGoal ) )* otherlv_5= '}' )
            // InternalWesnothDSL.g:115:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) ) ( (lv_goals_4_0= ruleGoal ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalWesnothDSL.g:119:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalWesnothDSL.g:120:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalWesnothDSL.g:120:4: (lv_name_1_0= RULE_STRING )
            // InternalWesnothDSL.g:121:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWesnothDSL.g:141:3: ( (lv_fragments_3_0= ruleFragment ) )
            // InternalWesnothDSL.g:142:4: (lv_fragments_3_0= ruleFragment )
            {
            // InternalWesnothDSL.g:142:4: (lv_fragments_3_0= ruleFragment )
            // InternalWesnothDSL.g:143:5: lv_fragments_3_0= ruleFragment
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getFragmentsFragmentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_fragments_3_0=ruleFragment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					add(
            						current,
            						"fragments",
            						lv_fragments_3_0,
            						"fyp.xtext.wesnoth.mydsl.WesnothDSL.Fragment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWesnothDSL.g:160:3: ( (lv_goals_4_0= ruleGoal ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWesnothDSL.g:161:4: (lv_goals_4_0= ruleGoal )
            	    {
            	    // InternalWesnothDSL.g:161:4: (lv_goals_4_0= ruleGoal )
            	    // InternalWesnothDSL.g:162:5: lv_goals_4_0= ruleGoal
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getGoalsGoalParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_goals_4_0=ruleGoal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"goals",
            	    						lv_goals_4_0,
            	    						"fyp.xtext.wesnoth.mydsl.WesnothDSL.Goal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleFragment"
    // InternalWesnothDSL.g:187:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // InternalWesnothDSL.g:187:49: (iv_ruleFragment= ruleFragment EOF )
            // InternalWesnothDSL.g:188:2: iv_ruleFragment= ruleFragment EOF
            {
             newCompositeNode(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragment=ruleFragment();

            state._fsp--;

             current =iv_ruleFragment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // InternalWesnothDSL.g:194:1: ruleFragment returns [EObject current=null] : ( ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}' ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_0_0 = null;

        EObject lv_defualt_cas_2_0 = null;



        	enterRule();

        try {
            // InternalWesnothDSL.g:200:2: ( ( ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}' ) )
            // InternalWesnothDSL.g:201:2: ( ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}' )
            {
            // InternalWesnothDSL.g:201:2: ( ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}' )
            // InternalWesnothDSL.g:202:3: ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}'
            {
            // InternalWesnothDSL.g:202:3: ( (lv_condition_0_0= ruleConditional ) )
            // InternalWesnothDSL.g:203:4: (lv_condition_0_0= ruleConditional )
            {
            // InternalWesnothDSL.g:203:4: (lv_condition_0_0= ruleConditional )
            // InternalWesnothDSL.g:204:5: lv_condition_0_0= ruleConditional
            {

            					newCompositeNode(grammarAccess.getFragmentAccess().getConditionConditionalParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_condition_0_0=ruleConditional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFragmentRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_0_0,
            						"fyp.xtext.wesnoth.mydsl.WesnothDSL.Conditional");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFragmentAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWesnothDSL.g:225:3: ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=26 && LA3_0<=35)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWesnothDSL.g:226:4: (lv_defualt_cas_2_0= ruleDefualt_CA )
            	    {
            	    // InternalWesnothDSL.g:226:4: (lv_defualt_cas_2_0= ruleDefualt_CA )
            	    // InternalWesnothDSL.g:227:5: lv_defualt_cas_2_0= ruleDefualt_CA
            	    {

            	    					newCompositeNode(grammarAccess.getFragmentAccess().getDefualt_casDefualt_CAParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_defualt_cas_2_0=ruleDefualt_CA();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFragmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"defualt_cas",
            	    						lv_defualt_cas_2_0,
            	    						"fyp.xtext.wesnoth.mydsl.WesnothDSL.Defualt_CA");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFragmentAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleConditional"
    // InternalWesnothDSL.g:252:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalWesnothDSL.g:252:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalWesnothDSL.g:253:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalWesnothDSL.g:259:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) ) ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_x_1_0 = null;



        	enterRule();

        try {
            // InternalWesnothDSL.g:265:2: ( (otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) ) ) )
            // InternalWesnothDSL.g:266:2: (otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) ) )
            {
            // InternalWesnothDSL.g:266:2: (otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) ) )
            // InternalWesnothDSL.g:267:3: otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getWhenKeyword_0());
            		
            // InternalWesnothDSL.g:271:3: ( (lv_x_1_0= rulewhenRules ) )
            // InternalWesnothDSL.g:272:4: (lv_x_1_0= rulewhenRules )
            {
            // InternalWesnothDSL.g:272:4: (lv_x_1_0= rulewhenRules )
            // InternalWesnothDSL.g:273:5: lv_x_1_0= rulewhenRules
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getXWhenRulesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_x_1_0=rulewhenRules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_1_0,
            						"fyp.xtext.wesnoth.mydsl.WesnothDSL.whenRules");
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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRulewhenRules"
    // InternalWesnothDSL.g:294:1: entryRulewhenRules returns [EObject current=null] : iv_rulewhenRules= rulewhenRules EOF ;
    public final EObject entryRulewhenRules() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhenRules = null;


        try {
            // InternalWesnothDSL.g:294:50: (iv_rulewhenRules= rulewhenRules EOF )
            // InternalWesnothDSL.g:295:2: iv_rulewhenRules= rulewhenRules EOF
            {
             newCompositeNode(grammarAccess.getWhenRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulewhenRules=rulewhenRules();

            state._fsp--;

             current =iv_rulewhenRules; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulewhenRules"


    // $ANTLR start "rulewhenRules"
    // InternalWesnothDSL.g:301:1: rulewhenRules returns [EObject current=null] : (this_UnitEquals_0= ruleUnitEquals | this_AtLocation_1= ruleAtLocation | this_Damage_2= ruleDamage | this_Baseline_3= ruleBaseline ) ;
    public final EObject rulewhenRules() throws RecognitionException {
        EObject current = null;

        EObject this_UnitEquals_0 = null;

        EObject this_AtLocation_1 = null;

        EObject this_Damage_2 = null;

        EObject this_Baseline_3 = null;



        	enterRule();

        try {
            // InternalWesnothDSL.g:307:2: ( (this_UnitEquals_0= ruleUnitEquals | this_AtLocation_1= ruleAtLocation | this_Damage_2= ruleDamage | this_Baseline_3= ruleBaseline ) )
            // InternalWesnothDSL.g:308:2: (this_UnitEquals_0= ruleUnitEquals | this_AtLocation_1= ruleAtLocation | this_Damage_2= ruleDamage | this_Baseline_3= ruleBaseline )
            {
            // InternalWesnothDSL.g:308:2: (this_UnitEquals_0= ruleUnitEquals | this_AtLocation_1= ruleAtLocation | this_Damage_2= ruleDamage | this_Baseline_3= ruleBaseline )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalWesnothDSL.g:309:3: this_UnitEquals_0= ruleUnitEquals
                    {

                    			newCompositeNode(grammarAccess.getWhenRulesAccess().getUnitEqualsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitEquals_0=ruleUnitEquals();

                    state._fsp--;


                    			current = this_UnitEquals_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:318:3: this_AtLocation_1= ruleAtLocation
                    {

                    			newCompositeNode(grammarAccess.getWhenRulesAccess().getAtLocationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtLocation_1=ruleAtLocation();

                    state._fsp--;


                    			current = this_AtLocation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWesnothDSL.g:327:3: this_Damage_2= ruleDamage
                    {

                    			newCompositeNode(grammarAccess.getWhenRulesAccess().getDamageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Damage_2=ruleDamage();

                    state._fsp--;


                    			current = this_Damage_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalWesnothDSL.g:336:3: this_Baseline_3= ruleBaseline
                    {

                    			newCompositeNode(grammarAccess.getWhenRulesAccess().getBaselineParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Baseline_3=ruleBaseline();

                    state._fsp--;


                    			current = this_Baseline_3;
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
    // $ANTLR end "rulewhenRules"


    // $ANTLR start "entryRuleBaseline"
    // InternalWesnothDSL.g:348:1: entryRuleBaseline returns [EObject current=null] : iv_ruleBaseline= ruleBaseline EOF ;
    public final EObject entryRuleBaseline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseline = null;


        try {
            // InternalWesnothDSL.g:348:49: (iv_ruleBaseline= ruleBaseline EOF )
            // InternalWesnothDSL.g:349:2: iv_ruleBaseline= ruleBaseline EOF
            {
             newCompositeNode(grammarAccess.getBaselineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseline=ruleBaseline();

            state._fsp--;

             current =iv_ruleBaseline; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBaseline"


    // $ANTLR start "ruleBaseline"
    // InternalWesnothDSL.g:355:1: ruleBaseline returns [EObject current=null] : ( (lv_always_0_0= 'always' ) ) ;
    public final EObject ruleBaseline() throws RecognitionException {
        EObject current = null;

        Token lv_always_0_0=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:361:2: ( ( (lv_always_0_0= 'always' ) ) )
            // InternalWesnothDSL.g:362:2: ( (lv_always_0_0= 'always' ) )
            {
            // InternalWesnothDSL.g:362:2: ( (lv_always_0_0= 'always' ) )
            // InternalWesnothDSL.g:363:3: (lv_always_0_0= 'always' )
            {
            // InternalWesnothDSL.g:363:3: (lv_always_0_0= 'always' )
            // InternalWesnothDSL.g:364:4: lv_always_0_0= 'always'
            {
            lv_always_0_0=(Token)match(input,15,FOLLOW_2); 

            				newLeafNode(lv_always_0_0, grammarAccess.getBaselineAccess().getAlwaysAlwaysKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBaselineRule());
            				}
            				setWithLastConsumed(current, "always", lv_always_0_0, "always");
            			

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
    // $ANTLR end "ruleBaseline"


    // $ANTLR start "entryRuleDamage"
    // InternalWesnothDSL.g:379:1: entryRuleDamage returns [EObject current=null] : iv_ruleDamage= ruleDamage EOF ;
    public final EObject entryRuleDamage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDamage = null;


        try {
            // InternalWesnothDSL.g:379:47: (iv_ruleDamage= ruleDamage EOF )
            // InternalWesnothDSL.g:380:2: iv_ruleDamage= ruleDamage EOF
            {
             newCompositeNode(grammarAccess.getDamageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDamage=ruleDamage();

            state._fsp--;

             current =iv_ruleDamage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDamage"


    // $ANTLR start "ruleDamage"
    // InternalWesnothDSL.g:386:1: ruleDamage returns [EObject current=null] : (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDamage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_health_2_0=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:392:2: ( (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) ) )
            // InternalWesnothDSL.g:393:2: (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) )
            {
            // InternalWesnothDSL.g:393:2: (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) )
            // InternalWesnothDSL.g:394:3: otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDamageAccess().getHealthKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDamageAccess().getHyphenMinusKeyword_1());
            		
            // InternalWesnothDSL.g:402:3: ( (lv_health_2_0= RULE_INT ) )
            // InternalWesnothDSL.g:403:4: (lv_health_2_0= RULE_INT )
            {
            // InternalWesnothDSL.g:403:4: (lv_health_2_0= RULE_INT )
            // InternalWesnothDSL.g:404:5: lv_health_2_0= RULE_INT
            {
            lv_health_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_health_2_0, grammarAccess.getDamageAccess().getHealthINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDamageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"health",
            						lv_health_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleDamage"


    // $ANTLR start "entryRuleAtLocation"
    // InternalWesnothDSL.g:424:1: entryRuleAtLocation returns [EObject current=null] : iv_ruleAtLocation= ruleAtLocation EOF ;
    public final EObject entryRuleAtLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtLocation = null;


        try {
            // InternalWesnothDSL.g:424:51: (iv_ruleAtLocation= ruleAtLocation EOF )
            // InternalWesnothDSL.g:425:2: iv_ruleAtLocation= ruleAtLocation EOF
            {
             newCompositeNode(grammarAccess.getAtLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtLocation=ruleAtLocation();

            state._fsp--;

             current =iv_ruleAtLocation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtLocation"


    // $ANTLR start "ruleAtLocation"
    // InternalWesnothDSL.g:431:1: ruleAtLocation returns [EObject current=null] : (otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) ) ) ;
    public final EObject ruleAtLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_XAxis_1_0=null;
        Token otherlv_2=null;
        Token lv_YAxis_3_0=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:437:2: ( (otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) ) ) )
            // InternalWesnothDSL.g:438:2: (otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) ) )
            {
            // InternalWesnothDSL.g:438:2: (otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) ) )
            // InternalWesnothDSL.g:439:3: otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAtLocationAccess().getXKeyword_0());
            		
            // InternalWesnothDSL.g:443:3: ( (lv_XAxis_1_0= RULE_INT ) )
            // InternalWesnothDSL.g:444:4: (lv_XAxis_1_0= RULE_INT )
            {
            // InternalWesnothDSL.g:444:4: (lv_XAxis_1_0= RULE_INT )
            // InternalWesnothDSL.g:445:5: lv_XAxis_1_0= RULE_INT
            {
            lv_XAxis_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_XAxis_1_0, grammarAccess.getAtLocationAccess().getXAxisINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"XAxis",
            						lv_XAxis_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAtLocationAccess().getYKeyword_2());
            		
            // InternalWesnothDSL.g:465:3: ( (lv_YAxis_3_0= RULE_INT ) )
            // InternalWesnothDSL.g:466:4: (lv_YAxis_3_0= RULE_INT )
            {
            // InternalWesnothDSL.g:466:4: (lv_YAxis_3_0= RULE_INT )
            // InternalWesnothDSL.g:467:5: lv_YAxis_3_0= RULE_INT
            {
            lv_YAxis_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_YAxis_3_0, grammarAccess.getAtLocationAccess().getYAxisINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"YAxis",
            						lv_YAxis_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleAtLocation"


    // $ANTLR start "entryRuleUnitEquals"
    // InternalWesnothDSL.g:487:1: entryRuleUnitEquals returns [EObject current=null] : iv_ruleUnitEquals= ruleUnitEquals EOF ;
    public final EObject entryRuleUnitEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitEquals = null;


        try {
            // InternalWesnothDSL.g:487:51: (iv_ruleUnitEquals= ruleUnitEquals EOF )
            // InternalWesnothDSL.g:488:2: iv_ruleUnitEquals= ruleUnitEquals EOF
            {
             newCompositeNode(grammarAccess.getUnitEqualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitEquals=ruleUnitEquals();

            state._fsp--;

             current =iv_ruleUnitEquals; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnitEquals"


    // $ANTLR start "ruleUnitEquals"
    // InternalWesnothDSL.g:494:1: ruleUnitEquals returns [EObject current=null] : (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleUnitEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:500:2: ( (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) ) )
            // InternalWesnothDSL.g:501:2: (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) )
            {
            // InternalWesnothDSL.g:501:2: (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) )
            // InternalWesnothDSL.g:502:3: otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getUnitEqualsAccess().getUnitKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUnitEqualsAccess().getIsKeyword_1());
            		
            // InternalWesnothDSL.g:510:3: ( (lv_unit_2_0= RULE_STRING ) )
            // InternalWesnothDSL.g:511:4: (lv_unit_2_0= RULE_STRING )
            {
            // InternalWesnothDSL.g:511:4: (lv_unit_2_0= RULE_STRING )
            // InternalWesnothDSL.g:512:5: lv_unit_2_0= RULE_STRING
            {
            lv_unit_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getUnitEqualsAccess().getUnitSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnitEqualsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"unit",
            						lv_unit_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleUnitEquals"


    // $ANTLR start "entryRuleGoal"
    // InternalWesnothDSL.g:532:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // InternalWesnothDSL.g:532:45: (iv_ruleGoal= ruleGoal EOF )
            // InternalWesnothDSL.g:533:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // InternalWesnothDSL.g:539:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) otherlv_3= 'value' otherlv_4= 'is' ( (lv_locValue_5_0= RULE_INT ) ) ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_locValue_5_0=null;
        EObject lv_goal_2_0 = null;



        	enterRule();

        try {
            // InternalWesnothDSL.g:545:2: ( (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) otherlv_3= 'value' otherlv_4= 'is' ( (lv_locValue_5_0= RULE_INT ) ) ) )
            // InternalWesnothDSL.g:546:2: (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) otherlv_3= 'value' otherlv_4= 'is' ( (lv_locValue_5_0= RULE_INT ) ) )
            {
            // InternalWesnothDSL.g:546:2: (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) otherlv_3= 'value' otherlv_4= 'is' ( (lv_locValue_5_0= RULE_INT ) ) )
            // InternalWesnothDSL.g:547:3: otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) otherlv_3= 'value' otherlv_4= 'is' ( (lv_locValue_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getGoalAccess().getIsKeyword_1());
            		
            // InternalWesnothDSL.g:555:3: ( (lv_goal_2_0= ruleGoaLocation ) )
            // InternalWesnothDSL.g:556:4: (lv_goal_2_0= ruleGoaLocation )
            {
            // InternalWesnothDSL.g:556:4: (lv_goal_2_0= ruleGoaLocation )
            // InternalWesnothDSL.g:557:5: lv_goal_2_0= ruleGoaLocation
            {

            					newCompositeNode(grammarAccess.getGoalAccess().getGoalGoaLocationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_goal_2_0=ruleGoaLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoalRule());
            					}
            					set(
            						current,
            						"goal",
            						lv_goal_2_0,
            						"fyp.xtext.wesnoth.mydsl.WesnothDSL.GoaLocation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getValueKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getGoalAccess().getIsKeyword_4());
            		
            // InternalWesnothDSL.g:582:3: ( (lv_locValue_5_0= RULE_INT ) )
            // InternalWesnothDSL.g:583:4: (lv_locValue_5_0= RULE_INT )
            {
            // InternalWesnothDSL.g:583:4: (lv_locValue_5_0= RULE_INT )
            // InternalWesnothDSL.g:584:5: lv_locValue_5_0= RULE_INT
            {
            lv_locValue_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_locValue_5_0, grammarAccess.getGoalAccess().getLocValueINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"locValue",
            						lv_locValue_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleGoaLocation"
    // InternalWesnothDSL.g:604:1: entryRuleGoaLocation returns [EObject current=null] : iv_ruleGoaLocation= ruleGoaLocation EOF ;
    public final EObject entryRuleGoaLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoaLocation = null;


        try {
            // InternalWesnothDSL.g:604:52: (iv_ruleGoaLocation= ruleGoaLocation EOF )
            // InternalWesnothDSL.g:605:2: iv_ruleGoaLocation= ruleGoaLocation EOF
            {
             newCompositeNode(grammarAccess.getGoaLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoaLocation=ruleGoaLocation();

            state._fsp--;

             current =iv_ruleGoaLocation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGoaLocation"


    // $ANTLR start "ruleGoaLocation"
    // InternalWesnothDSL.g:611:1: ruleGoaLocation returns [EObject current=null] : (otherlv_0= 'x' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_YAxis_3_0= RULE_INT ) ) ) ;
    public final EObject ruleGoaLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_XAxis_1_0=null;
        Token otherlv_2=null;
        Token lv_YAxis_3_0=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:617:2: ( (otherlv_0= 'x' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_YAxis_3_0= RULE_INT ) ) ) )
            // InternalWesnothDSL.g:618:2: (otherlv_0= 'x' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_YAxis_3_0= RULE_INT ) ) )
            {
            // InternalWesnothDSL.g:618:2: (otherlv_0= 'x' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_YAxis_3_0= RULE_INT ) ) )
            // InternalWesnothDSL.g:619:3: otherlv_0= 'x' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_YAxis_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGoaLocationAccess().getXKeyword_0());
            		
            // InternalWesnothDSL.g:623:3: ( (lv_XAxis_1_0= RULE_INT ) )
            // InternalWesnothDSL.g:624:4: (lv_XAxis_1_0= RULE_INT )
            {
            // InternalWesnothDSL.g:624:4: (lv_XAxis_1_0= RULE_INT )
            // InternalWesnothDSL.g:625:5: lv_XAxis_1_0= RULE_INT
            {
            lv_XAxis_1_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_XAxis_1_0, grammarAccess.getGoaLocationAccess().getXAxisINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoaLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"XAxis",
            						lv_XAxis_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getGoaLocationAccess().getYKeyword_2());
            		
            // InternalWesnothDSL.g:645:3: ( (lv_YAxis_3_0= RULE_INT ) )
            // InternalWesnothDSL.g:646:4: (lv_YAxis_3_0= RULE_INT )
            {
            // InternalWesnothDSL.g:646:4: (lv_YAxis_3_0= RULE_INT )
            // InternalWesnothDSL.g:647:5: lv_YAxis_3_0= RULE_INT
            {
            lv_YAxis_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_YAxis_3_0, grammarAccess.getGoaLocationAccess().getYAxisINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoaLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"YAxis",
            						lv_YAxis_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleGoaLocation"


    // $ANTLR start "entryRuleDefualt_CA"
    // InternalWesnothDSL.g:667:1: entryRuleDefualt_CA returns [EObject current=null] : iv_ruleDefualt_CA= ruleDefualt_CA EOF ;
    public final EObject entryRuleDefualt_CA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefualt_CA = null;


        try {
            // InternalWesnothDSL.g:667:51: (iv_ruleDefualt_CA= ruleDefualt_CA EOF )
            // InternalWesnothDSL.g:668:2: iv_ruleDefualt_CA= ruleDefualt_CA EOF
            {
             newCompositeNode(grammarAccess.getDefualt_CARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefualt_CA=ruleDefualt_CA();

            state._fsp--;

             current =iv_ruleDefualt_CA; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefualt_CA"


    // $ANTLR start "ruleDefualt_CA"
    // InternalWesnothDSL.g:674:1: ruleDefualt_CA returns [EObject current=null] : ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' ) ) ) ;
    public final EObject ruleDefualt_CA() throws RecognitionException {
        EObject current = null;

        Token lv_caType_0_1=null;
        Token lv_caType_0_2=null;
        Token lv_caType_0_3=null;
        Token lv_caType_0_4=null;
        Token lv_caType_0_5=null;
        Token lv_caType_0_6=null;
        Token lv_caType_0_7=null;
        Token lv_caType_0_8=null;
        Token lv_caType_0_9=null;
        Token lv_caType_0_10=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:680:2: ( ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' ) ) ) )
            // InternalWesnothDSL.g:681:2: ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' ) ) )
            {
            // InternalWesnothDSL.g:681:2: ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' ) ) )
            // InternalWesnothDSL.g:682:3: ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' ) )
            {
            // InternalWesnothDSL.g:682:3: ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' ) )
            // InternalWesnothDSL.g:683:4: (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' )
            {
            // InternalWesnothDSL.g:683:4: (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 29:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            case 31:
                {
                alt5=6;
                }
                break;
            case 32:
                {
                alt5=7;
                }
                break;
            case 33:
                {
                alt5=8;
                }
                break;
            case 34:
                {
                alt5=9;
                }
                break;
            case 35:
                {
                alt5=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWesnothDSL.g:684:5: lv_caType_0_1= 'movement'
                    {
                    lv_caType_0_1=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_1, grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:695:5: lv_caType_0_2= 'heal'
                    {
                    lv_caType_0_2=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_2, grammarAccess.getDefualt_CAAccess().getCaTypeHealKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalWesnothDSL.g:706:5: lv_caType_0_3= 'retreat'
                    {
                    lv_caType_0_3=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_3, grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalWesnothDSL.g:717:5: lv_caType_0_4= 'move_to_targets'
                    {
                    lv_caType_0_4=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_4, grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetsKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalWesnothDSL.g:728:5: lv_caType_0_5= 'basic_movement'
                    {
                    lv_caType_0_5=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_5, grammarAccess.getDefualt_CAAccess().getCaTypeBasic_movementKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalWesnothDSL.g:739:5: lv_caType_0_6= 'combat'
                    {
                    lv_caType_0_6=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_6, grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalWesnothDSL.g:750:5: lv_caType_0_7= 'recruit'
                    {
                    lv_caType_0_7=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_7, grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalWesnothDSL.g:761:5: lv_caType_0_8= 'combat_value_targets'
                    {
                    lv_caType_0_8=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_8, grammarAccess.getDefualt_CAAccess().getCaTypeCombat_value_targetsKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalWesnothDSL.g:772:5: lv_caType_0_9= 'capture_villages'
                    {
                    lv_caType_0_9=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_9, grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_8());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_9, null);
                    				

                    }
                    break;
                case 10 :
                    // InternalWesnothDSL.g:783:5: lv_caType_0_10= 'leader_to_keep'
                    {
                    lv_caType_0_10=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_10, grammarAccess.getDefualt_CAAccess().getCaTypeLeader_to_keepKeyword_0_9());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_10, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleDefualt_CA"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000FFC002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000158000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});

}