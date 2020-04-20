package org.xtext.wesnoth.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.wesnoth.services.WailGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWailParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rule'", "'{'", "'}'", "'when:'", "'always'", "'health'", "'-'", "'x:'", "'y:'", "'unit'", "'is'", "'goal'", "'value'", "'x'", "'y'", "'movement'", "'heal'", "'retreat'", "'combat'", "'recruit'", "'combat_value_targets'", "'capture_villages'", "'leader_to_keep'", "'cost'"
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


        public InternalWailParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWailParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWailParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWail.g"; }



     	private WailGrammarAccess grammarAccess;

        public InternalWailParser(TokenStream input, WailGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected WailGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalWail.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalWail.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalWail.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalWail.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleRule ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalWail.g:77:2: ( ( (lv_elements_0_0= ruleRule ) )* )
            // InternalWail.g:78:2: ( (lv_elements_0_0= ruleRule ) )*
            {
            // InternalWail.g:78:2: ( (lv_elements_0_0= ruleRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWail.g:79:3: (lv_elements_0_0= ruleRule )
            	    {
            	    // InternalWail.g:79:3: (lv_elements_0_0= ruleRule )
            	    // InternalWail.g:80:4: lv_elements_0_0= ruleRule
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
            	    					"org.xtext.wesnoth.Wail.Rule");
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
    // InternalWail.g:100:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalWail.g:100:45: (iv_ruleRule= ruleRule EOF )
            // InternalWail.g:101:2: iv_ruleRule= ruleRule EOF
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
    // InternalWail.g:107:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )* ( (lv_goals_4_0= ruleGoal ) )* otherlv_5= '}' ) ;
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
            // InternalWail.g:113:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )* ( (lv_goals_4_0= ruleGoal ) )* otherlv_5= '}' ) )
            // InternalWail.g:114:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )* ( (lv_goals_4_0= ruleGoal ) )* otherlv_5= '}' )
            {
            // InternalWail.g:114:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )* ( (lv_goals_4_0= ruleGoal ) )* otherlv_5= '}' )
            // InternalWail.g:115:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )* ( (lv_goals_4_0= ruleGoal ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalWail.g:119:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalWail.g:120:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalWail.g:120:4: (lv_name_1_0= RULE_STRING )
            // InternalWail.g:121:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalWail.g:141:3: ( (lv_fragments_3_0= ruleFragment ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWail.g:142:4: (lv_fragments_3_0= ruleFragment )
            	    {
            	    // InternalWail.g:142:4: (lv_fragments_3_0= ruleFragment )
            	    // InternalWail.g:143:5: lv_fragments_3_0= ruleFragment
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getFragmentsFragmentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_fragments_3_0=ruleFragment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fragments",
            	    						lv_fragments_3_0,
            	    						"org.xtext.wesnoth.Wail.Fragment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalWail.g:160:3: ( (lv_goals_4_0= ruleGoal ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWail.g:161:4: (lv_goals_4_0= ruleGoal )
            	    {
            	    // InternalWail.g:161:4: (lv_goals_4_0= ruleGoal )
            	    // InternalWail.g:162:5: lv_goals_4_0= ruleGoal
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
            	    						"org.xtext.wesnoth.Wail.Goal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalWail.g:187:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // InternalWail.g:187:49: (iv_ruleFragment= ruleFragment EOF )
            // InternalWail.g:188:2: iv_ruleFragment= ruleFragment EOF
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
    // InternalWail.g:194:1: ruleFragment returns [EObject current=null] : ( ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}' ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_0_0 = null;

        EObject lv_defualt_cas_2_0 = null;



        	enterRule();

        try {
            // InternalWail.g:200:2: ( ( ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}' ) )
            // InternalWail.g:201:2: ( ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}' )
            {
            // InternalWail.g:201:2: ( ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}' )
            // InternalWail.g:202:3: ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}'
            {
            // InternalWail.g:202:3: ( (lv_condition_0_0= ruleConditional ) )
            // InternalWail.g:203:4: (lv_condition_0_0= ruleConditional )
            {
            // InternalWail.g:203:4: (lv_condition_0_0= ruleConditional )
            // InternalWail.g:204:5: lv_condition_0_0= ruleConditional
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
            						"org.xtext.wesnoth.Wail.Conditional");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFragmentAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWail.g:225:3: ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=26 && LA4_0<=33)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWail.g:226:4: (lv_defualt_cas_2_0= ruleDefualt_CA )
            	    {
            	    // InternalWail.g:226:4: (lv_defualt_cas_2_0= ruleDefualt_CA )
            	    // InternalWail.g:227:5: lv_defualt_cas_2_0= ruleDefualt_CA
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
            	    						"org.xtext.wesnoth.Wail.Defualt_CA");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalWail.g:252:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalWail.g:252:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalWail.g:253:2: iv_ruleConditional= ruleConditional EOF
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
    // InternalWail.g:259:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) ) ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_x_1_0 = null;



        	enterRule();

        try {
            // InternalWail.g:265:2: ( (otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) ) ) )
            // InternalWail.g:266:2: (otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) ) )
            {
            // InternalWail.g:266:2: (otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) ) )
            // InternalWail.g:267:3: otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getWhenKeyword_0());
            		
            // InternalWail.g:271:3: ( (lv_x_1_0= rulewhenRules ) )
            // InternalWail.g:272:4: (lv_x_1_0= rulewhenRules )
            {
            // InternalWail.g:272:4: (lv_x_1_0= rulewhenRules )
            // InternalWail.g:273:5: lv_x_1_0= rulewhenRules
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
            						"org.xtext.wesnoth.Wail.whenRules");
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
    // InternalWail.g:294:1: entryRulewhenRules returns [EObject current=null] : iv_rulewhenRules= rulewhenRules EOF ;
    public final EObject entryRulewhenRules() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhenRules = null;


        try {
            // InternalWail.g:294:50: (iv_rulewhenRules= rulewhenRules EOF )
            // InternalWail.g:295:2: iv_rulewhenRules= rulewhenRules EOF
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
    // InternalWail.g:301:1: rulewhenRules returns [EObject current=null] : (this_UnitEquals_0= ruleUnitEquals | this_AtLocation_1= ruleAtLocation | this_Damage_2= ruleDamage | this_Baseline_3= ruleBaseline ) ;
    public final EObject rulewhenRules() throws RecognitionException {
        EObject current = null;

        EObject this_UnitEquals_0 = null;

        EObject this_AtLocation_1 = null;

        EObject this_Damage_2 = null;

        EObject this_Baseline_3 = null;



        	enterRule();

        try {
            // InternalWail.g:307:2: ( (this_UnitEquals_0= ruleUnitEquals | this_AtLocation_1= ruleAtLocation | this_Damage_2= ruleDamage | this_Baseline_3= ruleBaseline ) )
            // InternalWail.g:308:2: (this_UnitEquals_0= ruleUnitEquals | this_AtLocation_1= ruleAtLocation | this_Damage_2= ruleDamage | this_Baseline_3= ruleBaseline )
            {
            // InternalWail.g:308:2: (this_UnitEquals_0= ruleUnitEquals | this_AtLocation_1= ruleAtLocation | this_Damage_2= ruleDamage | this_Baseline_3= ruleBaseline )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWail.g:309:3: this_UnitEquals_0= ruleUnitEquals
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
                    // InternalWail.g:318:3: this_AtLocation_1= ruleAtLocation
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
                    // InternalWail.g:327:3: this_Damage_2= ruleDamage
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
                    // InternalWail.g:336:3: this_Baseline_3= ruleBaseline
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
    // InternalWail.g:348:1: entryRuleBaseline returns [EObject current=null] : iv_ruleBaseline= ruleBaseline EOF ;
    public final EObject entryRuleBaseline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseline = null;


        try {
            // InternalWail.g:348:49: (iv_ruleBaseline= ruleBaseline EOF )
            // InternalWail.g:349:2: iv_ruleBaseline= ruleBaseline EOF
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
    // InternalWail.g:355:1: ruleBaseline returns [EObject current=null] : ( (lv_always_0_0= 'always' ) ) ;
    public final EObject ruleBaseline() throws RecognitionException {
        EObject current = null;

        Token lv_always_0_0=null;


        	enterRule();

        try {
            // InternalWail.g:361:2: ( ( (lv_always_0_0= 'always' ) ) )
            // InternalWail.g:362:2: ( (lv_always_0_0= 'always' ) )
            {
            // InternalWail.g:362:2: ( (lv_always_0_0= 'always' ) )
            // InternalWail.g:363:3: (lv_always_0_0= 'always' )
            {
            // InternalWail.g:363:3: (lv_always_0_0= 'always' )
            // InternalWail.g:364:4: lv_always_0_0= 'always'
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
    // InternalWail.g:379:1: entryRuleDamage returns [EObject current=null] : iv_ruleDamage= ruleDamage EOF ;
    public final EObject entryRuleDamage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDamage = null;


        try {
            // InternalWail.g:379:47: (iv_ruleDamage= ruleDamage EOF )
            // InternalWail.g:380:2: iv_ruleDamage= ruleDamage EOF
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
    // InternalWail.g:386:1: ruleDamage returns [EObject current=null] : (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDamage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_health_2_0=null;


        	enterRule();

        try {
            // InternalWail.g:392:2: ( (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) ) )
            // InternalWail.g:393:2: (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) )
            {
            // InternalWail.g:393:2: (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) )
            // InternalWail.g:394:3: otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDamageAccess().getHealthKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDamageAccess().getHyphenMinusKeyword_1());
            		
            // InternalWail.g:402:3: ( (lv_health_2_0= RULE_INT ) )
            // InternalWail.g:403:4: (lv_health_2_0= RULE_INT )
            {
            // InternalWail.g:403:4: (lv_health_2_0= RULE_INT )
            // InternalWail.g:404:5: lv_health_2_0= RULE_INT
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
    // InternalWail.g:424:1: entryRuleAtLocation returns [EObject current=null] : iv_ruleAtLocation= ruleAtLocation EOF ;
    public final EObject entryRuleAtLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtLocation = null;


        try {
            // InternalWail.g:424:51: (iv_ruleAtLocation= ruleAtLocation EOF )
            // InternalWail.g:425:2: iv_ruleAtLocation= ruleAtLocation EOF
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
    // InternalWail.g:431:1: ruleAtLocation returns [EObject current=null] : (otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) ) ) ;
    public final EObject ruleAtLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_XAxis_1_0=null;
        Token otherlv_2=null;
        Token lv_YAxis_3_0=null;


        	enterRule();

        try {
            // InternalWail.g:437:2: ( (otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) ) ) )
            // InternalWail.g:438:2: (otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) ) )
            {
            // InternalWail.g:438:2: (otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) ) )
            // InternalWail.g:439:3: otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAtLocationAccess().getXKeyword_0());
            		
            // InternalWail.g:443:3: ( (lv_XAxis_1_0= RULE_INT ) )
            // InternalWail.g:444:4: (lv_XAxis_1_0= RULE_INT )
            {
            // InternalWail.g:444:4: (lv_XAxis_1_0= RULE_INT )
            // InternalWail.g:445:5: lv_XAxis_1_0= RULE_INT
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
            		
            // InternalWail.g:465:3: ( (lv_YAxis_3_0= RULE_INT ) )
            // InternalWail.g:466:4: (lv_YAxis_3_0= RULE_INT )
            {
            // InternalWail.g:466:4: (lv_YAxis_3_0= RULE_INT )
            // InternalWail.g:467:5: lv_YAxis_3_0= RULE_INT
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
    // InternalWail.g:487:1: entryRuleUnitEquals returns [EObject current=null] : iv_ruleUnitEquals= ruleUnitEquals EOF ;
    public final EObject entryRuleUnitEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitEquals = null;


        try {
            // InternalWail.g:487:51: (iv_ruleUnitEquals= ruleUnitEquals EOF )
            // InternalWail.g:488:2: iv_ruleUnitEquals= ruleUnitEquals EOF
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
    // InternalWail.g:494:1: ruleUnitEquals returns [EObject current=null] : (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleUnitEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalWail.g:500:2: ( (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) ) )
            // InternalWail.g:501:2: (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) )
            {
            // InternalWail.g:501:2: (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) )
            // InternalWail.g:502:3: otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getUnitEqualsAccess().getUnitKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUnitEqualsAccess().getIsKeyword_1());
            		
            // InternalWail.g:510:3: ( (lv_unit_2_0= RULE_STRING ) )
            // InternalWail.g:511:4: (lv_unit_2_0= RULE_STRING )
            {
            // InternalWail.g:511:4: (lv_unit_2_0= RULE_STRING )
            // InternalWail.g:512:5: lv_unit_2_0= RULE_STRING
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
    // InternalWail.g:532:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // InternalWail.g:532:45: (iv_ruleGoal= ruleGoal EOF )
            // InternalWail.g:533:2: iv_ruleGoal= ruleGoal EOF
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
    // InternalWail.g:539:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) otherlv_3= 'value' otherlv_4= 'is' ( (lv_locValue_5_0= RULE_INT ) ) ) ;
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
            // InternalWail.g:545:2: ( (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) otherlv_3= 'value' otherlv_4= 'is' ( (lv_locValue_5_0= RULE_INT ) ) ) )
            // InternalWail.g:546:2: (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) otherlv_3= 'value' otherlv_4= 'is' ( (lv_locValue_5_0= RULE_INT ) ) )
            {
            // InternalWail.g:546:2: (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) otherlv_3= 'value' otherlv_4= 'is' ( (lv_locValue_5_0= RULE_INT ) ) )
            // InternalWail.g:547:3: otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) otherlv_3= 'value' otherlv_4= 'is' ( (lv_locValue_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getGoalAccess().getIsKeyword_1());
            		
            // InternalWail.g:555:3: ( (lv_goal_2_0= ruleGoaLocation ) )
            // InternalWail.g:556:4: (lv_goal_2_0= ruleGoaLocation )
            {
            // InternalWail.g:556:4: (lv_goal_2_0= ruleGoaLocation )
            // InternalWail.g:557:5: lv_goal_2_0= ruleGoaLocation
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
            						"org.xtext.wesnoth.Wail.GoaLocation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getValueKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getGoalAccess().getIsKeyword_4());
            		
            // InternalWail.g:582:3: ( (lv_locValue_5_0= RULE_INT ) )
            // InternalWail.g:583:4: (lv_locValue_5_0= RULE_INT )
            {
            // InternalWail.g:583:4: (lv_locValue_5_0= RULE_INT )
            // InternalWail.g:584:5: lv_locValue_5_0= RULE_INT
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
    // InternalWail.g:604:1: entryRuleGoaLocation returns [EObject current=null] : iv_ruleGoaLocation= ruleGoaLocation EOF ;
    public final EObject entryRuleGoaLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoaLocation = null;


        try {
            // InternalWail.g:604:52: (iv_ruleGoaLocation= ruleGoaLocation EOF )
            // InternalWail.g:605:2: iv_ruleGoaLocation= ruleGoaLocation EOF
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
    // InternalWail.g:611:1: ruleGoaLocation returns [EObject current=null] : (otherlv_0= 'x' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_YAxis_3_0= RULE_INT ) ) ) ;
    public final EObject ruleGoaLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_XAxis_1_0=null;
        Token otherlv_2=null;
        Token lv_YAxis_3_0=null;


        	enterRule();

        try {
            // InternalWail.g:617:2: ( (otherlv_0= 'x' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_YAxis_3_0= RULE_INT ) ) ) )
            // InternalWail.g:618:2: (otherlv_0= 'x' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_YAxis_3_0= RULE_INT ) ) )
            {
            // InternalWail.g:618:2: (otherlv_0= 'x' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_YAxis_3_0= RULE_INT ) ) )
            // InternalWail.g:619:3: otherlv_0= 'x' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_YAxis_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGoaLocationAccess().getXKeyword_0());
            		
            // InternalWail.g:623:3: ( (lv_XAxis_1_0= RULE_INT ) )
            // InternalWail.g:624:4: (lv_XAxis_1_0= RULE_INT )
            {
            // InternalWail.g:624:4: (lv_XAxis_1_0= RULE_INT )
            // InternalWail.g:625:5: lv_XAxis_1_0= RULE_INT
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
            		
            // InternalWail.g:645:3: ( (lv_YAxis_3_0= RULE_INT ) )
            // InternalWail.g:646:4: (lv_YAxis_3_0= RULE_INT )
            {
            // InternalWail.g:646:4: (lv_YAxis_3_0= RULE_INT )
            // InternalWail.g:647:5: lv_YAxis_3_0= RULE_INT
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
    // InternalWail.g:667:1: entryRuleDefualt_CA returns [EObject current=null] : iv_ruleDefualt_CA= ruleDefualt_CA EOF ;
    public final EObject entryRuleDefualt_CA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefualt_CA = null;


        try {
            // InternalWail.g:667:51: (iv_ruleDefualt_CA= ruleDefualt_CA EOF )
            // InternalWail.g:668:2: iv_ruleDefualt_CA= ruleDefualt_CA EOF
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
    // InternalWail.g:674:1: ruleDefualt_CA returns [EObject current=null] : ( ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) ) ) (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? ) ;
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
        Token otherlv_1=null;
        Token lv_cost_2_0=null;


        	enterRule();

        try {
            // InternalWail.g:680:2: ( ( ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) ) ) (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? ) )
            // InternalWail.g:681:2: ( ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) ) ) (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? )
            {
            // InternalWail.g:681:2: ( ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) ) ) (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? )
            // InternalWail.g:682:3: ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) ) ) (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )?
            {
            // InternalWail.g:682:3: ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) ) )
            // InternalWail.g:683:4: ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) )
            {
            // InternalWail.g:683:4: ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) )
            // InternalWail.g:684:5: (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' )
            {
            // InternalWail.g:684:5: (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 28:
                {
                alt6=3;
                }
                break;
            case 29:
                {
                alt6=4;
                }
                break;
            case 30:
                {
                alt6=5;
                }
                break;
            case 31:
                {
                alt6=6;
                }
                break;
            case 32:
                {
                alt6=7;
                }
                break;
            case 33:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalWail.g:685:6: lv_caType_0_1= 'movement'
                    {
                    lv_caType_0_1=(Token)match(input,26,FOLLOW_17); 

                    						newLeafNode(lv_caType_0_1, grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalWail.g:696:6: lv_caType_0_2= 'heal'
                    {
                    lv_caType_0_2=(Token)match(input,27,FOLLOW_17); 

                    						newLeafNode(lv_caType_0_2, grammarAccess.getDefualt_CAAccess().getCaTypeHealKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalWail.g:707:6: lv_caType_0_3= 'retreat'
                    {
                    lv_caType_0_3=(Token)match(input,28,FOLLOW_17); 

                    						newLeafNode(lv_caType_0_3, grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalWail.g:718:6: lv_caType_0_4= 'combat'
                    {
                    lv_caType_0_4=(Token)match(input,29,FOLLOW_17); 

                    						newLeafNode(lv_caType_0_4, grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalWail.g:729:6: lv_caType_0_5= 'recruit'
                    {
                    lv_caType_0_5=(Token)match(input,30,FOLLOW_17); 

                    						newLeafNode(lv_caType_0_5, grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalWail.g:740:6: lv_caType_0_6= 'combat_value_targets'
                    {
                    lv_caType_0_6=(Token)match(input,31,FOLLOW_17); 

                    						newLeafNode(lv_caType_0_6, grammarAccess.getDefualt_CAAccess().getCaTypeCombat_value_targetsKeyword_0_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalWail.g:751:6: lv_caType_0_7= 'capture_villages'
                    {
                    lv_caType_0_7=(Token)match(input,32,FOLLOW_17); 

                    						newLeafNode(lv_caType_0_7, grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalWail.g:762:6: lv_caType_0_8= 'leader_to_keep'
                    {
                    lv_caType_0_8=(Token)match(input,33,FOLLOW_17); 

                    						newLeafNode(lv_caType_0_8, grammarAccess.getDefualt_CAAccess().getCaTypeLeader_to_keepKeyword_0_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_8, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalWail.g:775:3: (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalWail.g:776:4: otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getDefualt_CAAccess().getCostKeyword_1_0());
                    			
                    // InternalWail.g:780:4: ( (lv_cost_2_0= RULE_INT ) )
                    // InternalWail.g:781:5: (lv_cost_2_0= RULE_INT )
                    {
                    // InternalWail.g:781:5: (lv_cost_2_0= RULE_INT )
                    // InternalWail.g:782:6: lv_cost_2_0= RULE_INT
                    {
                    lv_cost_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_cost_2_0, grammarAccess.getDefualt_CAAccess().getCostINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"cost",
                    							lv_cost_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleDefualt_CA"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000406000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000003FC002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000158000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000002L});

}