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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rule'", "'{'", "'}'", "'when:'", "'always'", "'health'", "'-'", "'x'", "'y'", "'unit'", "'is'", "'goal'", "'='", "'movement'", "'heal'", "'retreat'", "'move_to_targets'", "'basic_movement'", "'combat'", "'recruit'", "'combat_value_targets'", "'capture_villages'", "'leader_to_keep'"
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

                if ( ((LA3_0>=24 && LA3_0<=33)) ) {
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
    // InternalWesnothDSL.g:259:1: ruleConditional returns [EObject current=null] : ( (otherlv_0= 'when:' ( (lv_condition_1_0= ruleAtLocation ) ) ) | this_Damage_2= ruleDamage | this_UnitEquals_3= ruleUnitEquals | this_Baseline_4= ruleBaseline ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;

        EObject this_Damage_2 = null;

        EObject this_UnitEquals_3 = null;

        EObject this_Baseline_4 = null;



        	enterRule();

        try {
            // InternalWesnothDSL.g:265:2: ( ( (otherlv_0= 'when:' ( (lv_condition_1_0= ruleAtLocation ) ) ) | this_Damage_2= ruleDamage | this_UnitEquals_3= ruleUnitEquals | this_Baseline_4= ruleBaseline ) )
            // InternalWesnothDSL.g:266:2: ( (otherlv_0= 'when:' ( (lv_condition_1_0= ruleAtLocation ) ) ) | this_Damage_2= ruleDamage | this_UnitEquals_3= ruleUnitEquals | this_Baseline_4= ruleBaseline )
            {
            // InternalWesnothDSL.g:266:2: ( (otherlv_0= 'when:' ( (lv_condition_1_0= ruleAtLocation ) ) ) | this_Damage_2= ruleDamage | this_UnitEquals_3= ruleUnitEquals | this_Baseline_4= ruleBaseline )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 20:
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
                    // InternalWesnothDSL.g:267:3: (otherlv_0= 'when:' ( (lv_condition_1_0= ruleAtLocation ) ) )
                    {
                    // InternalWesnothDSL.g:267:3: (otherlv_0= 'when:' ( (lv_condition_1_0= ruleAtLocation ) ) )
                    // InternalWesnothDSL.g:268:4: otherlv_0= 'when:' ( (lv_condition_1_0= ruleAtLocation ) )
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getWhenKeyword_0_0());
                    			
                    // InternalWesnothDSL.g:272:4: ( (lv_condition_1_0= ruleAtLocation ) )
                    // InternalWesnothDSL.g:273:5: (lv_condition_1_0= ruleAtLocation )
                    {
                    // InternalWesnothDSL.g:273:5: (lv_condition_1_0= ruleAtLocation )
                    // InternalWesnothDSL.g:274:6: lv_condition_1_0= ruleAtLocation
                    {

                    						newCompositeNode(grammarAccess.getConditionalAccess().getConditionAtLocationParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_1_0=ruleAtLocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_1_0,
                    							"fyp.xtext.wesnoth.mydsl.WesnothDSL.AtLocation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:293:3: this_Damage_2= ruleDamage
                    {

                    			newCompositeNode(grammarAccess.getConditionalAccess().getDamageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Damage_2=ruleDamage();

                    state._fsp--;


                    			current = this_Damage_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWesnothDSL.g:302:3: this_UnitEquals_3= ruleUnitEquals
                    {

                    			newCompositeNode(grammarAccess.getConditionalAccess().getUnitEqualsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnitEquals_3=ruleUnitEquals();

                    state._fsp--;


                    			current = this_UnitEquals_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalWesnothDSL.g:311:3: this_Baseline_4= ruleBaseline
                    {

                    			newCompositeNode(grammarAccess.getConditionalAccess().getBaselineParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Baseline_4=ruleBaseline();

                    state._fsp--;


                    			current = this_Baseline_4;
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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleBaseline"
    // InternalWesnothDSL.g:323:1: entryRuleBaseline returns [EObject current=null] : iv_ruleBaseline= ruleBaseline EOF ;
    public final EObject entryRuleBaseline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseline = null;


        try {
            // InternalWesnothDSL.g:323:49: (iv_ruleBaseline= ruleBaseline EOF )
            // InternalWesnothDSL.g:324:2: iv_ruleBaseline= ruleBaseline EOF
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
    // InternalWesnothDSL.g:330:1: ruleBaseline returns [EObject current=null] : ( (lv_always_0_0= 'always' ) ) ;
    public final EObject ruleBaseline() throws RecognitionException {
        EObject current = null;

        Token lv_always_0_0=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:336:2: ( ( (lv_always_0_0= 'always' ) ) )
            // InternalWesnothDSL.g:337:2: ( (lv_always_0_0= 'always' ) )
            {
            // InternalWesnothDSL.g:337:2: ( (lv_always_0_0= 'always' ) )
            // InternalWesnothDSL.g:338:3: (lv_always_0_0= 'always' )
            {
            // InternalWesnothDSL.g:338:3: (lv_always_0_0= 'always' )
            // InternalWesnothDSL.g:339:4: lv_always_0_0= 'always'
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
    // InternalWesnothDSL.g:354:1: entryRuleDamage returns [EObject current=null] : iv_ruleDamage= ruleDamage EOF ;
    public final EObject entryRuleDamage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDamage = null;


        try {
            // InternalWesnothDSL.g:354:47: (iv_ruleDamage= ruleDamage EOF )
            // InternalWesnothDSL.g:355:2: iv_ruleDamage= ruleDamage EOF
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
    // InternalWesnothDSL.g:361:1: ruleDamage returns [EObject current=null] : (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDamage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_health_2_0=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:367:2: ( (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) ) )
            // InternalWesnothDSL.g:368:2: (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) )
            {
            // InternalWesnothDSL.g:368:2: (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) )
            // InternalWesnothDSL.g:369:3: otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDamageAccess().getHealthKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDamageAccess().getHyphenMinusKeyword_1());
            		
            // InternalWesnothDSL.g:377:3: ( (lv_health_2_0= RULE_INT ) )
            // InternalWesnothDSL.g:378:4: (lv_health_2_0= RULE_INT )
            {
            // InternalWesnothDSL.g:378:4: (lv_health_2_0= RULE_INT )
            // InternalWesnothDSL.g:379:5: lv_health_2_0= RULE_INT
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
    // InternalWesnothDSL.g:399:1: entryRuleAtLocation returns [EObject current=null] : iv_ruleAtLocation= ruleAtLocation EOF ;
    public final EObject entryRuleAtLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtLocation = null;


        try {
            // InternalWesnothDSL.g:399:51: (iv_ruleAtLocation= ruleAtLocation EOF )
            // InternalWesnothDSL.g:400:2: iv_ruleAtLocation= ruleAtLocation EOF
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
    // InternalWesnothDSL.g:406:1: ruleAtLocation returns [EObject current=null] : (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) ) ;
    public final EObject ruleAtLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:412:2: ( (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) ) )
            // InternalWesnothDSL.g:413:2: (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) )
            {
            // InternalWesnothDSL.g:413:2: (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) )
            // InternalWesnothDSL.g:414:3: otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAtLocationAccess().getXKeyword_0());
            		
            // InternalWesnothDSL.g:418:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalWesnothDSL.g:419:4: (lv_x_1_0= RULE_INT )
            {
            // InternalWesnothDSL.g:419:4: (lv_x_1_0= RULE_INT )
            // InternalWesnothDSL.g:420:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_x_1_0, grammarAccess.getAtLocationAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAtLocationAccess().getYKeyword_2());
            		
            // InternalWesnothDSL.g:440:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalWesnothDSL.g:441:4: (lv_y_3_0= RULE_INT )
            {
            // InternalWesnothDSL.g:441:4: (lv_y_3_0= RULE_INT )
            // InternalWesnothDSL.g:442:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_y_3_0, grammarAccess.getAtLocationAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
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
    // InternalWesnothDSL.g:462:1: entryRuleUnitEquals returns [EObject current=null] : iv_ruleUnitEquals= ruleUnitEquals EOF ;
    public final EObject entryRuleUnitEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitEquals = null;


        try {
            // InternalWesnothDSL.g:462:51: (iv_ruleUnitEquals= ruleUnitEquals EOF )
            // InternalWesnothDSL.g:463:2: iv_ruleUnitEquals= ruleUnitEquals EOF
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
    // InternalWesnothDSL.g:469:1: ruleUnitEquals returns [EObject current=null] : (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleUnitEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:475:2: ( (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) ) )
            // InternalWesnothDSL.g:476:2: (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) )
            {
            // InternalWesnothDSL.g:476:2: (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) )
            // InternalWesnothDSL.g:477:3: otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getUnitEqualsAccess().getUnitKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUnitEqualsAccess().getIsKeyword_1());
            		
            // InternalWesnothDSL.g:485:3: ( (lv_unit_2_0= RULE_STRING ) )
            // InternalWesnothDSL.g:486:4: (lv_unit_2_0= RULE_STRING )
            {
            // InternalWesnothDSL.g:486:4: (lv_unit_2_0= RULE_STRING )
            // InternalWesnothDSL.g:487:5: lv_unit_2_0= RULE_STRING
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
    // InternalWesnothDSL.g:507:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // InternalWesnothDSL.g:507:45: (iv_ruleGoal= ruleGoal EOF )
            // InternalWesnothDSL.g:508:2: iv_ruleGoal= ruleGoal EOF
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
    // InternalWesnothDSL.g:514:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'goal' otherlv_1= '=' ( (lv_goal_2_0= ruleGoalCondition ) ) ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_goal_2_0 = null;



        	enterRule();

        try {
            // InternalWesnothDSL.g:520:2: ( (otherlv_0= 'goal' otherlv_1= '=' ( (lv_goal_2_0= ruleGoalCondition ) ) ) )
            // InternalWesnothDSL.g:521:2: (otherlv_0= 'goal' otherlv_1= '=' ( (lv_goal_2_0= ruleGoalCondition ) ) )
            {
            // InternalWesnothDSL.g:521:2: (otherlv_0= 'goal' otherlv_1= '=' ( (lv_goal_2_0= ruleGoalCondition ) ) )
            // InternalWesnothDSL.g:522:3: otherlv_0= 'goal' otherlv_1= '=' ( (lv_goal_2_0= ruleGoalCondition ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getGoalAccess().getEqualsSignKeyword_1());
            		
            // InternalWesnothDSL.g:530:3: ( (lv_goal_2_0= ruleGoalCondition ) )
            // InternalWesnothDSL.g:531:4: (lv_goal_2_0= ruleGoalCondition )
            {
            // InternalWesnothDSL.g:531:4: (lv_goal_2_0= ruleGoalCondition )
            // InternalWesnothDSL.g:532:5: lv_goal_2_0= ruleGoalCondition
            {

            					newCompositeNode(grammarAccess.getGoalAccess().getGoalGoalConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_goal_2_0=ruleGoalCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoalRule());
            					}
            					set(
            						current,
            						"goal",
            						lv_goal_2_0,
            						"fyp.xtext.wesnoth.mydsl.WesnothDSL.GoalCondition");
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
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleGoalCondition"
    // InternalWesnothDSL.g:553:1: entryRuleGoalCondition returns [EObject current=null] : iv_ruleGoalCondition= ruleGoalCondition EOF ;
    public final EObject entryRuleGoalCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalCondition = null;


        try {
            // InternalWesnothDSL.g:553:54: (iv_ruleGoalCondition= ruleGoalCondition EOF )
            // InternalWesnothDSL.g:554:2: iv_ruleGoalCondition= ruleGoalCondition EOF
            {
             newCompositeNode(grammarAccess.getGoalConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoalCondition=ruleGoalCondition();

            state._fsp--;

             current =iv_ruleGoalCondition; 
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
    // $ANTLR end "entryRuleGoalCondition"


    // $ANTLR start "ruleGoalCondition"
    // InternalWesnothDSL.g:560:1: ruleGoalCondition returns [EObject current=null] : ( (lv_goal_0_0= ruleLocation ) ) ;
    public final EObject ruleGoalCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_goal_0_0 = null;



        	enterRule();

        try {
            // InternalWesnothDSL.g:566:2: ( ( (lv_goal_0_0= ruleLocation ) ) )
            // InternalWesnothDSL.g:567:2: ( (lv_goal_0_0= ruleLocation ) )
            {
            // InternalWesnothDSL.g:567:2: ( (lv_goal_0_0= ruleLocation ) )
            // InternalWesnothDSL.g:568:3: (lv_goal_0_0= ruleLocation )
            {
            // InternalWesnothDSL.g:568:3: (lv_goal_0_0= ruleLocation )
            // InternalWesnothDSL.g:569:4: lv_goal_0_0= ruleLocation
            {

            				newCompositeNode(grammarAccess.getGoalConditionAccess().getGoalLocationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_goal_0_0=ruleLocation();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getGoalConditionRule());
            				}
            				set(
            					current,
            					"goal",
            					lv_goal_0_0,
            					"fyp.xtext.wesnoth.mydsl.WesnothDSL.Location");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleGoalCondition"


    // $ANTLR start "entryRuleLocation"
    // InternalWesnothDSL.g:589:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalWesnothDSL.g:589:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalWesnothDSL.g:590:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalWesnothDSL.g:596:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:602:2: ( (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) ) )
            // InternalWesnothDSL.g:603:2: (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) )
            {
            // InternalWesnothDSL.g:603:2: (otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) ) )
            // InternalWesnothDSL.g:604:3: otherlv_0= 'x' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= 'y' ( (lv_y_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getXKeyword_0());
            		
            // InternalWesnothDSL.g:608:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalWesnothDSL.g:609:4: (lv_x_1_0= RULE_INT )
            {
            // InternalWesnothDSL.g:609:4: (lv_x_1_0= RULE_INT )
            // InternalWesnothDSL.g:610:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_x_1_0, grammarAccess.getLocationAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getYKeyword_2());
            		
            // InternalWesnothDSL.g:630:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalWesnothDSL.g:631:4: (lv_y_3_0= RULE_INT )
            {
            // InternalWesnothDSL.g:631:4: (lv_y_3_0= RULE_INT )
            // InternalWesnothDSL.g:632:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_y_3_0, grammarAccess.getLocationAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleDefualt_CA"
    // InternalWesnothDSL.g:652:1: entryRuleDefualt_CA returns [EObject current=null] : iv_ruleDefualt_CA= ruleDefualt_CA EOF ;
    public final EObject entryRuleDefualt_CA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefualt_CA = null;


        try {
            // InternalWesnothDSL.g:652:51: (iv_ruleDefualt_CA= ruleDefualt_CA EOF )
            // InternalWesnothDSL.g:653:2: iv_ruleDefualt_CA= ruleDefualt_CA EOF
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
    // InternalWesnothDSL.g:659:1: ruleDefualt_CA returns [EObject current=null] : ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' ) ) ) ;
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
            // InternalWesnothDSL.g:665:2: ( ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' ) ) ) )
            // InternalWesnothDSL.g:666:2: ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' ) ) )
            {
            // InternalWesnothDSL.g:666:2: ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' ) ) )
            // InternalWesnothDSL.g:667:3: ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' ) )
            {
            // InternalWesnothDSL.g:667:3: ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' ) )
            // InternalWesnothDSL.g:668:4: (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' )
            {
            // InternalWesnothDSL.g:668:4: (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'move_to_targets' | lv_caType_0_5= 'basic_movement' | lv_caType_0_6= 'combat' | lv_caType_0_7= 'recruit' | lv_caType_0_8= 'combat_value_targets' | lv_caType_0_9= 'capture_villages' | lv_caType_0_10= 'leader_to_keep' )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 28:
                {
                alt5=5;
                }
                break;
            case 29:
                {
                alt5=6;
                }
                break;
            case 30:
                {
                alt5=7;
                }
                break;
            case 31:
                {
                alt5=8;
                }
                break;
            case 32:
                {
                alt5=9;
                }
                break;
            case 33:
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
                    // InternalWesnothDSL.g:669:5: lv_caType_0_1= 'movement'
                    {
                    lv_caType_0_1=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_1, grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:680:5: lv_caType_0_2= 'heal'
                    {
                    lv_caType_0_2=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_2, grammarAccess.getDefualt_CAAccess().getCaTypeHealKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalWesnothDSL.g:691:5: lv_caType_0_3= 'retreat'
                    {
                    lv_caType_0_3=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_3, grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalWesnothDSL.g:702:5: lv_caType_0_4= 'move_to_targets'
                    {
                    lv_caType_0_4=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_4, grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetsKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalWesnothDSL.g:713:5: lv_caType_0_5= 'basic_movement'
                    {
                    lv_caType_0_5=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_5, grammarAccess.getDefualt_CAAccess().getCaTypeBasic_movementKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalWesnothDSL.g:724:5: lv_caType_0_6= 'combat'
                    {
                    lv_caType_0_6=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_6, grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalWesnothDSL.g:735:5: lv_caType_0_7= 'recruit'
                    {
                    lv_caType_0_7=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_7, grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalWesnothDSL.g:746:5: lv_caType_0_8= 'combat_value_targets'
                    {
                    lv_caType_0_8=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_8, grammarAccess.getDefualt_CAAccess().getCaTypeCombat_value_targetsKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalWesnothDSL.g:757:5: lv_caType_0_9= 'capture_villages'
                    {
                    lv_caType_0_9=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_9, grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_8());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_9, null);
                    				

                    }
                    break;
                case 10 :
                    // InternalWesnothDSL.g:768:5: lv_caType_0_10= 'leader_to_keep'
                    {
                    lv_caType_0_10=(Token)match(input,33,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000011C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000003FF002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});

}