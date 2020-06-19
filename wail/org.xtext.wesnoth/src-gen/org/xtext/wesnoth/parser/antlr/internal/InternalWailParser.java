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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rule'", "'{'", "'avoids'", "'}'", "'Grouping'", "'is'", "'offensive'", "'defensive'", "'none'", "'when:'", "'ID'", "'always'", "'health'", "'-'", "'x:'", "'y:'", "'unit'", "'goal'", "'protect'", "'leader'", "'value'", "'radius'", "'side'", "'Type'", "'x'", "'y'", "'attack'", "'aggression'", "'Caution'", "'movement'", "'heal'", "'retreat'", "'combat'", "'recruit'", "'combat_value_targets'", "'capture_villages'", "'leader_to_keep'", "'cost'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalWail.g:107:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_aggressionval_5_0= ruleAggression ) ) ( (lv_cautionval_6_0= ruleCaution ) ) ( (lv_GroupingVal_7_0= ruleGrouping ) ) (otherlv_8= 'avoids' ( (lv_avoids_9_0= ruleAtLocation ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_fragments_3_0 = null;

        EObject lv_goals_4_0 = null;

        EObject lv_aggressionval_5_0 = null;

        EObject lv_cautionval_6_0 = null;

        EObject lv_GroupingVal_7_0 = null;

        EObject lv_avoids_9_0 = null;



        	enterRule();

        try {
            // InternalWail.g:113:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_aggressionval_5_0= ruleAggression ) ) ( (lv_cautionval_6_0= ruleCaution ) ) ( (lv_GroupingVal_7_0= ruleGrouping ) ) (otherlv_8= 'avoids' ( (lv_avoids_9_0= ruleAtLocation ) )* )? otherlv_10= '}' ) )
            // InternalWail.g:114:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_aggressionval_5_0= ruleAggression ) ) ( (lv_cautionval_6_0= ruleCaution ) ) ( (lv_GroupingVal_7_0= ruleGrouping ) ) (otherlv_8= 'avoids' ( (lv_avoids_9_0= ruleAtLocation ) )* )? otherlv_10= '}' )
            {
            // InternalWail.g:114:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_aggressionval_5_0= ruleAggression ) ) ( (lv_cautionval_6_0= ruleCaution ) ) ( (lv_GroupingVal_7_0= ruleGrouping ) ) (otherlv_8= 'avoids' ( (lv_avoids_9_0= ruleAtLocation ) )* )? otherlv_10= '}' )
            // InternalWail.g:115:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_fragments_3_0= ruleFragment ) )* ( (lv_goals_4_0= ruleGoal ) )* ( (lv_aggressionval_5_0= ruleAggression ) ) ( (lv_cautionval_6_0= ruleCaution ) ) ( (lv_GroupingVal_7_0= ruleGrouping ) ) (otherlv_8= 'avoids' ( (lv_avoids_9_0= ruleAtLocation ) )* )? otherlv_10= '}'
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

                if ( (LA2_0==20) ) {
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

                if ( ((LA3_0>=28 && LA3_0<=29)) ) {
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
            	    				
            	    pushFollow(FOLLOW_6);
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

            // InternalWail.g:179:3: ( (lv_aggressionval_5_0= ruleAggression ) )
            // InternalWail.g:180:4: (lv_aggressionval_5_0= ruleAggression )
            {
            // InternalWail.g:180:4: (lv_aggressionval_5_0= ruleAggression )
            // InternalWail.g:181:5: lv_aggressionval_5_0= ruleAggression
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAggressionvalAggressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_aggressionval_5_0=ruleAggression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"aggressionval",
            						lv_aggressionval_5_0,
            						"org.xtext.wesnoth.Wail.Aggression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWail.g:198:3: ( (lv_cautionval_6_0= ruleCaution ) )
            // InternalWail.g:199:4: (lv_cautionval_6_0= ruleCaution )
            {
            // InternalWail.g:199:4: (lv_cautionval_6_0= ruleCaution )
            // InternalWail.g:200:5: lv_cautionval_6_0= ruleCaution
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getCautionvalCautionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_cautionval_6_0=ruleCaution();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"cautionval",
            						lv_cautionval_6_0,
            						"org.xtext.wesnoth.Wail.Caution");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWail.g:217:3: ( (lv_GroupingVal_7_0= ruleGrouping ) )
            // InternalWail.g:218:4: (lv_GroupingVal_7_0= ruleGrouping )
            {
            // InternalWail.g:218:4: (lv_GroupingVal_7_0= ruleGrouping )
            // InternalWail.g:219:5: lv_GroupingVal_7_0= ruleGrouping
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getGroupingValGroupingParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_GroupingVal_7_0=ruleGrouping();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"GroupingVal",
            						lv_GroupingVal_7_0,
            						"org.xtext.wesnoth.Wail.Grouping");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWail.g:236:3: (otherlv_8= 'avoids' ( (lv_avoids_9_0= ruleAtLocation ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWail.g:237:4: otherlv_8= 'avoids' ( (lv_avoids_9_0= ruleAtLocation ) )*
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getAvoidsKeyword_8_0());
                    			
                    // InternalWail.g:241:4: ( (lv_avoids_9_0= ruleAtLocation ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==25) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalWail.g:242:5: (lv_avoids_9_0= ruleAtLocation )
                    	    {
                    	    // InternalWail.g:242:5: (lv_avoids_9_0= ruleAtLocation )
                    	    // InternalWail.g:243:6: lv_avoids_9_0= ruleAtLocation
                    	    {

                    	    						newCompositeNode(grammarAccess.getRuleAccess().getAvoidsAtLocationParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_avoids_9_0=ruleAtLocation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"avoids",
                    	    							lv_avoids_9_0,
                    	    							"org.xtext.wesnoth.Wail.AtLocation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleGrouping"
    // InternalWail.g:269:1: entryRuleGrouping returns [EObject current=null] : iv_ruleGrouping= ruleGrouping EOF ;
    public final EObject entryRuleGrouping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrouping = null;


        try {
            // InternalWail.g:269:49: (iv_ruleGrouping= ruleGrouping EOF )
            // InternalWail.g:270:2: iv_ruleGrouping= ruleGrouping EOF
            {
             newCompositeNode(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrouping=ruleGrouping();

            state._fsp--;

             current =iv_ruleGrouping; 
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
    // $ANTLR end "entryRuleGrouping"


    // $ANTLR start "ruleGrouping"
    // InternalWail.g:276:1: ruleGrouping returns [EObject current=null] : (otherlv_0= 'Grouping' otherlv_1= 'is' ( ( (lv_groupingVal_2_1= 'offensive' | lv_groupingVal_2_2= 'defensive' | lv_groupingVal_2_3= 'none' ) ) ) ) ;
    public final EObject ruleGrouping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_groupingVal_2_1=null;
        Token lv_groupingVal_2_2=null;
        Token lv_groupingVal_2_3=null;


        	enterRule();

        try {
            // InternalWail.g:282:2: ( (otherlv_0= 'Grouping' otherlv_1= 'is' ( ( (lv_groupingVal_2_1= 'offensive' | lv_groupingVal_2_2= 'defensive' | lv_groupingVal_2_3= 'none' ) ) ) ) )
            // InternalWail.g:283:2: (otherlv_0= 'Grouping' otherlv_1= 'is' ( ( (lv_groupingVal_2_1= 'offensive' | lv_groupingVal_2_2= 'defensive' | lv_groupingVal_2_3= 'none' ) ) ) )
            {
            // InternalWail.g:283:2: (otherlv_0= 'Grouping' otherlv_1= 'is' ( ( (lv_groupingVal_2_1= 'offensive' | lv_groupingVal_2_2= 'defensive' | lv_groupingVal_2_3= 'none' ) ) ) )
            // InternalWail.g:284:3: otherlv_0= 'Grouping' otherlv_1= 'is' ( ( (lv_groupingVal_2_1= 'offensive' | lv_groupingVal_2_2= 'defensive' | lv_groupingVal_2_3= 'none' ) ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupingAccess().getGroupingKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupingAccess().getIsKeyword_1());
            		
            // InternalWail.g:292:3: ( ( (lv_groupingVal_2_1= 'offensive' | lv_groupingVal_2_2= 'defensive' | lv_groupingVal_2_3= 'none' ) ) )
            // InternalWail.g:293:4: ( (lv_groupingVal_2_1= 'offensive' | lv_groupingVal_2_2= 'defensive' | lv_groupingVal_2_3= 'none' ) )
            {
            // InternalWail.g:293:4: ( (lv_groupingVal_2_1= 'offensive' | lv_groupingVal_2_2= 'defensive' | lv_groupingVal_2_3= 'none' ) )
            // InternalWail.g:294:5: (lv_groupingVal_2_1= 'offensive' | lv_groupingVal_2_2= 'defensive' | lv_groupingVal_2_3= 'none' )
            {
            // InternalWail.g:294:5: (lv_groupingVal_2_1= 'offensive' | lv_groupingVal_2_2= 'defensive' | lv_groupingVal_2_3= 'none' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalWail.g:295:6: lv_groupingVal_2_1= 'offensive'
                    {
                    lv_groupingVal_2_1=(Token)match(input,17,FOLLOW_2); 

                    						newLeafNode(lv_groupingVal_2_1, grammarAccess.getGroupingAccess().getGroupingValOffensiveKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupingRule());
                    						}
                    						setWithLastConsumed(current, "groupingVal", lv_groupingVal_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalWail.g:306:6: lv_groupingVal_2_2= 'defensive'
                    {
                    lv_groupingVal_2_2=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_groupingVal_2_2, grammarAccess.getGroupingAccess().getGroupingValDefensiveKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupingRule());
                    						}
                    						setWithLastConsumed(current, "groupingVal", lv_groupingVal_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalWail.g:317:6: lv_groupingVal_2_3= 'none'
                    {
                    lv_groupingVal_2_3=(Token)match(input,19,FOLLOW_2); 

                    						newLeafNode(lv_groupingVal_2_3, grammarAccess.getGroupingAccess().getGroupingValNoneKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroupingRule());
                    						}
                    						setWithLastConsumed(current, "groupingVal", lv_groupingVal_2_3, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleGrouping"


    // $ANTLR start "entryRuleFragment"
    // InternalWail.g:334:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // InternalWail.g:334:49: (iv_ruleFragment= ruleFragment EOF )
            // InternalWail.g:335:2: iv_ruleFragment= ruleFragment EOF
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
    // InternalWail.g:341:1: ruleFragment returns [EObject current=null] : ( ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}' ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_0_0 = null;

        EObject lv_defualt_cas_2_0 = null;



        	enterRule();

        try {
            // InternalWail.g:347:2: ( ( ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}' ) )
            // InternalWail.g:348:2: ( ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}' )
            {
            // InternalWail.g:348:2: ( ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}' )
            // InternalWail.g:349:3: ( (lv_condition_0_0= ruleConditional ) ) otherlv_1= '{' ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )* otherlv_3= '}'
            {
            // InternalWail.g:349:3: ( (lv_condition_0_0= ruleConditional ) )
            // InternalWail.g:350:4: (lv_condition_0_0= ruleConditional )
            {
            // InternalWail.g:350:4: (lv_condition_0_0= ruleConditional )
            // InternalWail.g:351:5: lv_condition_0_0= ruleConditional
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

            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFragmentAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWail.g:372:3: ( (lv_defualt_cas_2_0= ruleDefualt_CA ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=40 && LA7_0<=47)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWail.g:373:4: (lv_defualt_cas_2_0= ruleDefualt_CA )
            	    {
            	    // InternalWail.g:373:4: (lv_defualt_cas_2_0= ruleDefualt_CA )
            	    // InternalWail.g:374:5: lv_defualt_cas_2_0= ruleDefualt_CA
            	    {

            	    					newCompositeNode(grammarAccess.getFragmentAccess().getDefualt_casDefualt_CAParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalWail.g:399:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalWail.g:399:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalWail.g:400:2: iv_ruleConditional= ruleConditional EOF
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
    // InternalWail.g:406:1: ruleConditional returns [EObject current=null] : (otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) ) ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_x_1_0 = null;



        	enterRule();

        try {
            // InternalWail.g:412:2: ( (otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) ) ) )
            // InternalWail.g:413:2: (otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) ) )
            {
            // InternalWail.g:413:2: (otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) ) )
            // InternalWail.g:414:3: otherlv_0= 'when:' ( (lv_x_1_0= rulewhenRules ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getWhenKeyword_0());
            		
            // InternalWail.g:418:3: ( (lv_x_1_0= rulewhenRules ) )
            // InternalWail.g:419:4: (lv_x_1_0= rulewhenRules )
            {
            // InternalWail.g:419:4: (lv_x_1_0= rulewhenRules )
            // InternalWail.g:420:5: lv_x_1_0= rulewhenRules
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getXWhenRulesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_x_1_0=rulewhenRules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					add(
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
    // InternalWail.g:441:1: entryRulewhenRules returns [EObject current=null] : iv_rulewhenRules= rulewhenRules EOF ;
    public final EObject entryRulewhenRules() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhenRules = null;


        try {
            // InternalWail.g:441:50: (iv_rulewhenRules= rulewhenRules EOF )
            // InternalWail.g:442:2: iv_rulewhenRules= rulewhenRules EOF
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
    // InternalWail.g:448:1: rulewhenRules returns [EObject current=null] : (this_UnitEquals_0= ruleUnitEquals | this_AtLocation_1= ruleAtLocation | this_Damage_2= ruleDamage | this_Baseline_3= ruleBaseline | this_IDEquals_4= ruleIDEquals ) ;
    public final EObject rulewhenRules() throws RecognitionException {
        EObject current = null;

        EObject this_UnitEquals_0 = null;

        EObject this_AtLocation_1 = null;

        EObject this_Damage_2 = null;

        EObject this_Baseline_3 = null;

        EObject this_IDEquals_4 = null;



        	enterRule();

        try {
            // InternalWail.g:454:2: ( (this_UnitEquals_0= ruleUnitEquals | this_AtLocation_1= ruleAtLocation | this_Damage_2= ruleDamage | this_Baseline_3= ruleBaseline | this_IDEquals_4= ruleIDEquals ) )
            // InternalWail.g:455:2: (this_UnitEquals_0= ruleUnitEquals | this_AtLocation_1= ruleAtLocation | this_Damage_2= ruleDamage | this_Baseline_3= ruleBaseline | this_IDEquals_4= ruleIDEquals )
            {
            // InternalWail.g:455:2: (this_UnitEquals_0= ruleUnitEquals | this_AtLocation_1= ruleAtLocation | this_Damage_2= ruleDamage | this_Baseline_3= ruleBaseline | this_IDEquals_4= ruleIDEquals )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            case 21:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalWail.g:456:3: this_UnitEquals_0= ruleUnitEquals
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
                    // InternalWail.g:465:3: this_AtLocation_1= ruleAtLocation
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
                    // InternalWail.g:474:3: this_Damage_2= ruleDamage
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
                    // InternalWail.g:483:3: this_Baseline_3= ruleBaseline
                    {

                    			newCompositeNode(grammarAccess.getWhenRulesAccess().getBaselineParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Baseline_3=ruleBaseline();

                    state._fsp--;


                    			current = this_Baseline_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalWail.g:492:3: this_IDEquals_4= ruleIDEquals
                    {

                    			newCompositeNode(grammarAccess.getWhenRulesAccess().getIDEqualsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_IDEquals_4=ruleIDEquals();

                    state._fsp--;


                    			current = this_IDEquals_4;
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


    // $ANTLR start "entryRuleIDEquals"
    // InternalWail.g:504:1: entryRuleIDEquals returns [EObject current=null] : iv_ruleIDEquals= ruleIDEquals EOF ;
    public final EObject entryRuleIDEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDEquals = null;


        try {
            // InternalWail.g:504:49: (iv_ruleIDEquals= ruleIDEquals EOF )
            // InternalWail.g:505:2: iv_ruleIDEquals= ruleIDEquals EOF
            {
             newCompositeNode(grammarAccess.getIDEqualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIDEquals=ruleIDEquals();

            state._fsp--;

             current =iv_ruleIDEquals; 
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
    // $ANTLR end "entryRuleIDEquals"


    // $ANTLR start "ruleIDEquals"
    // InternalWail.g:511:1: ruleIDEquals returns [EObject current=null] : (otherlv_0= 'ID' otherlv_1= 'is' ( (lv_unitID_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleIDEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_unitID_2_0=null;


        	enterRule();

        try {
            // InternalWail.g:517:2: ( (otherlv_0= 'ID' otherlv_1= 'is' ( (lv_unitID_2_0= RULE_STRING ) ) ) )
            // InternalWail.g:518:2: (otherlv_0= 'ID' otherlv_1= 'is' ( (lv_unitID_2_0= RULE_STRING ) ) )
            {
            // InternalWail.g:518:2: (otherlv_0= 'ID' otherlv_1= 'is' ( (lv_unitID_2_0= RULE_STRING ) ) )
            // InternalWail.g:519:3: otherlv_0= 'ID' otherlv_1= 'is' ( (lv_unitID_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getIDEqualsAccess().getIDKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIDEqualsAccess().getIsKeyword_1());
            		
            // InternalWail.g:527:3: ( (lv_unitID_2_0= RULE_STRING ) )
            // InternalWail.g:528:4: (lv_unitID_2_0= RULE_STRING )
            {
            // InternalWail.g:528:4: (lv_unitID_2_0= RULE_STRING )
            // InternalWail.g:529:5: lv_unitID_2_0= RULE_STRING
            {
            lv_unitID_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_unitID_2_0, grammarAccess.getIDEqualsAccess().getUnitIDSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIDEqualsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"unitID",
            						lv_unitID_2_0,
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
    // $ANTLR end "ruleIDEquals"


    // $ANTLR start "entryRuleBaseline"
    // InternalWail.g:549:1: entryRuleBaseline returns [EObject current=null] : iv_ruleBaseline= ruleBaseline EOF ;
    public final EObject entryRuleBaseline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseline = null;


        try {
            // InternalWail.g:549:49: (iv_ruleBaseline= ruleBaseline EOF )
            // InternalWail.g:550:2: iv_ruleBaseline= ruleBaseline EOF
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
    // InternalWail.g:556:1: ruleBaseline returns [EObject current=null] : ( (lv_always_0_0= 'always' ) ) ;
    public final EObject ruleBaseline() throws RecognitionException {
        EObject current = null;

        Token lv_always_0_0=null;


        	enterRule();

        try {
            // InternalWail.g:562:2: ( ( (lv_always_0_0= 'always' ) ) )
            // InternalWail.g:563:2: ( (lv_always_0_0= 'always' ) )
            {
            // InternalWail.g:563:2: ( (lv_always_0_0= 'always' ) )
            // InternalWail.g:564:3: (lv_always_0_0= 'always' )
            {
            // InternalWail.g:564:3: (lv_always_0_0= 'always' )
            // InternalWail.g:565:4: lv_always_0_0= 'always'
            {
            lv_always_0_0=(Token)match(input,22,FOLLOW_2); 

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
    // InternalWail.g:580:1: entryRuleDamage returns [EObject current=null] : iv_ruleDamage= ruleDamage EOF ;
    public final EObject entryRuleDamage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDamage = null;


        try {
            // InternalWail.g:580:47: (iv_ruleDamage= ruleDamage EOF )
            // InternalWail.g:581:2: iv_ruleDamage= ruleDamage EOF
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
    // InternalWail.g:587:1: ruleDamage returns [EObject current=null] : (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDamage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_health_2_0=null;


        	enterRule();

        try {
            // InternalWail.g:593:2: ( (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) ) )
            // InternalWail.g:594:2: (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) )
            {
            // InternalWail.g:594:2: (otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) ) )
            // InternalWail.g:595:3: otherlv_0= 'health' otherlv_1= '-' ( (lv_health_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDamageAccess().getHealthKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDamageAccess().getHyphenMinusKeyword_1());
            		
            // InternalWail.g:603:3: ( (lv_health_2_0= RULE_INT ) )
            // InternalWail.g:604:4: (lv_health_2_0= RULE_INT )
            {
            // InternalWail.g:604:4: (lv_health_2_0= RULE_INT )
            // InternalWail.g:605:5: lv_health_2_0= RULE_INT
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
    // InternalWail.g:625:1: entryRuleAtLocation returns [EObject current=null] : iv_ruleAtLocation= ruleAtLocation EOF ;
    public final EObject entryRuleAtLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtLocation = null;


        try {
            // InternalWail.g:625:51: (iv_ruleAtLocation= ruleAtLocation EOF )
            // InternalWail.g:626:2: iv_ruleAtLocation= ruleAtLocation EOF
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
    // InternalWail.g:632:1: ruleAtLocation returns [EObject current=null] : (otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) ) ) ;
    public final EObject ruleAtLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_XAxis_1_0=null;
        Token otherlv_2=null;
        Token lv_YAxis_3_0=null;


        	enterRule();

        try {
            // InternalWail.g:638:2: ( (otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) ) ) )
            // InternalWail.g:639:2: (otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) ) )
            {
            // InternalWail.g:639:2: (otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) ) )
            // InternalWail.g:640:3: otherlv_0= 'x:' ( (lv_XAxis_1_0= RULE_INT ) ) otherlv_2= 'y:' ( (lv_YAxis_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getAtLocationAccess().getXKeyword_0());
            		
            // InternalWail.g:644:3: ( (lv_XAxis_1_0= RULE_INT ) )
            // InternalWail.g:645:4: (lv_XAxis_1_0= RULE_INT )
            {
            // InternalWail.g:645:4: (lv_XAxis_1_0= RULE_INT )
            // InternalWail.g:646:5: lv_XAxis_1_0= RULE_INT
            {
            lv_XAxis_1_0=(Token)match(input,RULE_INT,FOLLOW_17); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getAtLocationAccess().getYKeyword_2());
            		
            // InternalWail.g:666:3: ( (lv_YAxis_3_0= RULE_INT ) )
            // InternalWail.g:667:4: (lv_YAxis_3_0= RULE_INT )
            {
            // InternalWail.g:667:4: (lv_YAxis_3_0= RULE_INT )
            // InternalWail.g:668:5: lv_YAxis_3_0= RULE_INT
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
    // InternalWail.g:688:1: entryRuleUnitEquals returns [EObject current=null] : iv_ruleUnitEquals= ruleUnitEquals EOF ;
    public final EObject entryRuleUnitEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitEquals = null;


        try {
            // InternalWail.g:688:51: (iv_ruleUnitEquals= ruleUnitEquals EOF )
            // InternalWail.g:689:2: iv_ruleUnitEquals= ruleUnitEquals EOF
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
    // InternalWail.g:695:1: ruleUnitEquals returns [EObject current=null] : (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleUnitEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalWail.g:701:2: ( (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) ) )
            // InternalWail.g:702:2: (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) )
            {
            // InternalWail.g:702:2: (otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) ) )
            // InternalWail.g:703:3: otherlv_0= 'unit' otherlv_1= 'is' ( (lv_unit_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getUnitEqualsAccess().getUnitKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUnitEqualsAccess().getIsKeyword_1());
            		
            // InternalWail.g:711:3: ( (lv_unit_2_0= RULE_STRING ) )
            // InternalWail.g:712:4: (lv_unit_2_0= RULE_STRING )
            {
            // InternalWail.g:712:4: (lv_unit_2_0= RULE_STRING )
            // InternalWail.g:713:5: lv_unit_2_0= RULE_STRING
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
    // InternalWail.g:733:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // InternalWail.g:733:45: (iv_ruleGoal= ruleGoal EOF )
            // InternalWail.g:734:2: iv_ruleGoal= ruleGoal EOF
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
    // InternalWail.g:740:1: ruleGoal returns [EObject current=null] : ( (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) ) | this_ProtectLocation_3= ruleProtectLocation | this_ProtectLeader_4= ruleProtectLeader | this_ProtectUnitID_5= ruleProtectUnitID | this_ProtectUnitType_6= ruleProtectUnitType ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_goal_2_0 = null;

        EObject this_ProtectLocation_3 = null;

        EObject this_ProtectLeader_4 = null;

        EObject this_ProtectUnitID_5 = null;

        EObject this_ProtectUnitType_6 = null;



        	enterRule();

        try {
            // InternalWail.g:746:2: ( ( (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) ) | this_ProtectLocation_3= ruleProtectLocation | this_ProtectLeader_4= ruleProtectLeader | this_ProtectUnitID_5= ruleProtectUnitID | this_ProtectUnitType_6= ruleProtectUnitType ) )
            // InternalWail.g:747:2: ( (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) ) | this_ProtectLocation_3= ruleProtectLocation | this_ProtectLeader_4= ruleProtectLeader | this_ProtectUnitID_5= ruleProtectUnitID | this_ProtectUnitType_6= ruleProtectUnitType )
            {
            // InternalWail.g:747:2: ( (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) ) | this_ProtectLocation_3= ruleProtectLocation | this_ProtectLeader_4= ruleProtectLeader | this_ProtectUnitID_5= ruleProtectUnitID | this_ProtectUnitType_6= ruleProtectUnitType )
            int alt9=5;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalWail.g:748:3: (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) )
                    {
                    // InternalWail.g:748:3: (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) )
                    // InternalWail.g:749:4: otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) )
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,16,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getGoalAccess().getIsKeyword_0_1());
                    			
                    // InternalWail.g:757:4: ( (lv_goal_2_0= ruleGoaLocation ) )
                    // InternalWail.g:758:5: (lv_goal_2_0= ruleGoaLocation )
                    {
                    // InternalWail.g:758:5: (lv_goal_2_0= ruleGoaLocation )
                    // InternalWail.g:759:6: lv_goal_2_0= ruleGoaLocation
                    {

                    						newCompositeNode(grammarAccess.getGoalAccess().getGoalGoaLocationParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
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


                    }


                    }
                    break;
                case 2 :
                    // InternalWail.g:778:3: this_ProtectLocation_3= ruleProtectLocation
                    {

                    			newCompositeNode(grammarAccess.getGoalAccess().getProtectLocationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtectLocation_3=ruleProtectLocation();

                    state._fsp--;


                    			current = this_ProtectLocation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWail.g:787:3: this_ProtectLeader_4= ruleProtectLeader
                    {

                    			newCompositeNode(grammarAccess.getGoalAccess().getProtectLeaderParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtectLeader_4=ruleProtectLeader();

                    state._fsp--;


                    			current = this_ProtectLeader_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalWail.g:796:3: this_ProtectUnitID_5= ruleProtectUnitID
                    {

                    			newCompositeNode(grammarAccess.getGoalAccess().getProtectUnitIDParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtectUnitID_5=ruleProtectUnitID();

                    state._fsp--;


                    			current = this_ProtectUnitID_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalWail.g:805:3: this_ProtectUnitType_6= ruleProtectUnitType
                    {

                    			newCompositeNode(grammarAccess.getGoalAccess().getProtectUnitTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtectUnitType_6=ruleProtectUnitType();

                    state._fsp--;


                    			current = this_ProtectUnitType_6;
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
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleProtectLeader"
    // InternalWail.g:817:1: entryRuleProtectLeader returns [EObject current=null] : iv_ruleProtectLeader= ruleProtectLeader EOF ;
    public final EObject entryRuleProtectLeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtectLeader = null;


        try {
            // InternalWail.g:817:54: (iv_ruleProtectLeader= ruleProtectLeader EOF )
            // InternalWail.g:818:2: iv_ruleProtectLeader= ruleProtectLeader EOF
            {
             newCompositeNode(grammarAccess.getProtectLeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtectLeader=ruleProtectLeader();

            state._fsp--;

             current =iv_ruleProtectLeader; 
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
    // $ANTLR end "entryRuleProtectLeader"


    // $ANTLR start "ruleProtectLeader"
    // InternalWail.g:824:1: ruleProtectLeader returns [EObject current=null] : (otherlv_0= 'protect' otherlv_1= 'leader' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) ) ) ;
    public final EObject ruleProtectLeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_locationValue_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_protectionRadius_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_procSide_10_0=null;


        	enterRule();

        try {
            // InternalWail.g:830:2: ( (otherlv_0= 'protect' otherlv_1= 'leader' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) ) ) )
            // InternalWail.g:831:2: (otherlv_0= 'protect' otherlv_1= 'leader' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) ) )
            {
            // InternalWail.g:831:2: (otherlv_0= 'protect' otherlv_1= 'leader' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) ) )
            // InternalWail.g:832:3: otherlv_0= 'protect' otherlv_1= 'leader' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getProtectLeaderAccess().getProtectKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getProtectLeaderAccess().getLeaderKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getProtectLeaderAccess().getValueKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getProtectLeaderAccess().getIsKeyword_3());
            		
            // InternalWail.g:848:3: ( (lv_locationValue_4_0= RULE_INT ) )
            // InternalWail.g:849:4: (lv_locationValue_4_0= RULE_INT )
            {
            // InternalWail.g:849:4: (lv_locationValue_4_0= RULE_INT )
            // InternalWail.g:850:5: lv_locationValue_4_0= RULE_INT
            {
            lv_locationValue_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_locationValue_4_0, grammarAccess.getProtectLeaderAccess().getLocationValueINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectLeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"locationValue",
            						lv_locationValue_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getProtectLeaderAccess().getRadiusKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getProtectLeaderAccess().getIsKeyword_6());
            		
            // InternalWail.g:874:3: ( (lv_protectionRadius_7_0= RULE_INT ) )
            // InternalWail.g:875:4: (lv_protectionRadius_7_0= RULE_INT )
            {
            // InternalWail.g:875:4: (lv_protectionRadius_7_0= RULE_INT )
            // InternalWail.g:876:5: lv_protectionRadius_7_0= RULE_INT
            {
            lv_protectionRadius_7_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_protectionRadius_7_0, grammarAccess.getProtectLeaderAccess().getProtectionRadiusINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectLeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"protectionRadius",
            						lv_protectionRadius_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getProtectLeaderAccess().getSideKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getProtectLeaderAccess().getIsKeyword_9());
            		
            // InternalWail.g:900:3: ( (lv_procSide_10_0= RULE_INT ) )
            // InternalWail.g:901:4: (lv_procSide_10_0= RULE_INT )
            {
            // InternalWail.g:901:4: (lv_procSide_10_0= RULE_INT )
            // InternalWail.g:902:5: lv_procSide_10_0= RULE_INT
            {
            lv_procSide_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_procSide_10_0, grammarAccess.getProtectLeaderAccess().getProcSideINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectLeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"procSide",
            						lv_procSide_10_0,
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
    // $ANTLR end "ruleProtectLeader"


    // $ANTLR start "entryRuleProtectUnitID"
    // InternalWail.g:922:1: entryRuleProtectUnitID returns [EObject current=null] : iv_ruleProtectUnitID= ruleProtectUnitID EOF ;
    public final EObject entryRuleProtectUnitID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtectUnitID = null;


        try {
            // InternalWail.g:922:54: (iv_ruleProtectUnitID= ruleProtectUnitID EOF )
            // InternalWail.g:923:2: iv_ruleProtectUnitID= ruleProtectUnitID EOF
            {
             newCompositeNode(grammarAccess.getProtectUnitIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtectUnitID=ruleProtectUnitID();

            state._fsp--;

             current =iv_ruleProtectUnitID; 
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
    // $ANTLR end "entryRuleProtectUnitID"


    // $ANTLR start "ruleProtectUnitID"
    // InternalWail.g:929:1: ruleProtectUnitID returns [EObject current=null] : (otherlv_0= 'protect' otherlv_1= 'unit' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) ) otherlv_11= 'ID' otherlv_12= 'is' ( (lv_procID_13_0= RULE_STRING ) ) ) ;
    public final EObject ruleProtectUnitID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_locationValue_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_protectionRadius_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_procSide_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_procID_13_0=null;


        	enterRule();

        try {
            // InternalWail.g:935:2: ( (otherlv_0= 'protect' otherlv_1= 'unit' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) ) otherlv_11= 'ID' otherlv_12= 'is' ( (lv_procID_13_0= RULE_STRING ) ) ) )
            // InternalWail.g:936:2: (otherlv_0= 'protect' otherlv_1= 'unit' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) ) otherlv_11= 'ID' otherlv_12= 'is' ( (lv_procID_13_0= RULE_STRING ) ) )
            {
            // InternalWail.g:936:2: (otherlv_0= 'protect' otherlv_1= 'unit' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) ) otherlv_11= 'ID' otherlv_12= 'is' ( (lv_procID_13_0= RULE_STRING ) ) )
            // InternalWail.g:937:3: otherlv_0= 'protect' otherlv_1= 'unit' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) ) otherlv_11= 'ID' otherlv_12= 'is' ( (lv_procID_13_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getProtectUnitIDAccess().getProtectKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getProtectUnitIDAccess().getUnitKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getProtectUnitIDAccess().getValueKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getProtectUnitIDAccess().getIsKeyword_3());
            		
            // InternalWail.g:953:3: ( (lv_locationValue_4_0= RULE_INT ) )
            // InternalWail.g:954:4: (lv_locationValue_4_0= RULE_INT )
            {
            // InternalWail.g:954:4: (lv_locationValue_4_0= RULE_INT )
            // InternalWail.g:955:5: lv_locationValue_4_0= RULE_INT
            {
            lv_locationValue_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_locationValue_4_0, grammarAccess.getProtectUnitIDAccess().getLocationValueINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectUnitIDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"locationValue",
            						lv_locationValue_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getProtectUnitIDAccess().getRadiusKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getProtectUnitIDAccess().getIsKeyword_6());
            		
            // InternalWail.g:979:3: ( (lv_protectionRadius_7_0= RULE_INT ) )
            // InternalWail.g:980:4: (lv_protectionRadius_7_0= RULE_INT )
            {
            // InternalWail.g:980:4: (lv_protectionRadius_7_0= RULE_INT )
            // InternalWail.g:981:5: lv_protectionRadius_7_0= RULE_INT
            {
            lv_protectionRadius_7_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_protectionRadius_7_0, grammarAccess.getProtectUnitIDAccess().getProtectionRadiusINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectUnitIDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"protectionRadius",
            						lv_protectionRadius_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getProtectUnitIDAccess().getSideKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getProtectUnitIDAccess().getIsKeyword_9());
            		
            // InternalWail.g:1005:3: ( (lv_procSide_10_0= RULE_INT ) )
            // InternalWail.g:1006:4: (lv_procSide_10_0= RULE_INT )
            {
            // InternalWail.g:1006:4: (lv_procSide_10_0= RULE_INT )
            // InternalWail.g:1007:5: lv_procSide_10_0= RULE_INT
            {
            lv_procSide_10_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_procSide_10_0, grammarAccess.getProtectUnitIDAccess().getProcSideINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectUnitIDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"procSide",
            						lv_procSide_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getProtectUnitIDAccess().getIDKeyword_11());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getProtectUnitIDAccess().getIsKeyword_12());
            		
            // InternalWail.g:1031:3: ( (lv_procID_13_0= RULE_STRING ) )
            // InternalWail.g:1032:4: (lv_procID_13_0= RULE_STRING )
            {
            // InternalWail.g:1032:4: (lv_procID_13_0= RULE_STRING )
            // InternalWail.g:1033:5: lv_procID_13_0= RULE_STRING
            {
            lv_procID_13_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_procID_13_0, grammarAccess.getProtectUnitIDAccess().getProcIDSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectUnitIDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"procID",
            						lv_procID_13_0,
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
    // $ANTLR end "ruleProtectUnitID"


    // $ANTLR start "entryRuleProtectUnitType"
    // InternalWail.g:1053:1: entryRuleProtectUnitType returns [EObject current=null] : iv_ruleProtectUnitType= ruleProtectUnitType EOF ;
    public final EObject entryRuleProtectUnitType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtectUnitType = null;


        try {
            // InternalWail.g:1053:56: (iv_ruleProtectUnitType= ruleProtectUnitType EOF )
            // InternalWail.g:1054:2: iv_ruleProtectUnitType= ruleProtectUnitType EOF
            {
             newCompositeNode(grammarAccess.getProtectUnitTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtectUnitType=ruleProtectUnitType();

            state._fsp--;

             current =iv_ruleProtectUnitType; 
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
    // $ANTLR end "entryRuleProtectUnitType"


    // $ANTLR start "ruleProtectUnitType"
    // InternalWail.g:1060:1: ruleProtectUnitType returns [EObject current=null] : (otherlv_0= 'protect' otherlv_1= 'unit' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) ) otherlv_11= 'Type' otherlv_12= 'is' ( (lv_procType_13_0= RULE_STRING ) ) ) ;
    public final EObject ruleProtectUnitType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_locationValue_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_protectionRadius_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_procSide_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_procType_13_0=null;


        	enterRule();

        try {
            // InternalWail.g:1066:2: ( (otherlv_0= 'protect' otherlv_1= 'unit' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) ) otherlv_11= 'Type' otherlv_12= 'is' ( (lv_procType_13_0= RULE_STRING ) ) ) )
            // InternalWail.g:1067:2: (otherlv_0= 'protect' otherlv_1= 'unit' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) ) otherlv_11= 'Type' otherlv_12= 'is' ( (lv_procType_13_0= RULE_STRING ) ) )
            {
            // InternalWail.g:1067:2: (otherlv_0= 'protect' otherlv_1= 'unit' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) ) otherlv_11= 'Type' otherlv_12= 'is' ( (lv_procType_13_0= RULE_STRING ) ) )
            // InternalWail.g:1068:3: otherlv_0= 'protect' otherlv_1= 'unit' otherlv_2= 'value' otherlv_3= 'is' ( (lv_locationValue_4_0= RULE_INT ) ) otherlv_5= 'radius' otherlv_6= 'is' ( (lv_protectionRadius_7_0= RULE_INT ) ) otherlv_8= 'side' otherlv_9= 'is' ( (lv_procSide_10_0= RULE_INT ) ) otherlv_11= 'Type' otherlv_12= 'is' ( (lv_procType_13_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getProtectUnitTypeAccess().getProtectKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getProtectUnitTypeAccess().getUnitKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getProtectUnitTypeAccess().getValueKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getProtectUnitTypeAccess().getIsKeyword_3());
            		
            // InternalWail.g:1084:3: ( (lv_locationValue_4_0= RULE_INT ) )
            // InternalWail.g:1085:4: (lv_locationValue_4_0= RULE_INT )
            {
            // InternalWail.g:1085:4: (lv_locationValue_4_0= RULE_INT )
            // InternalWail.g:1086:5: lv_locationValue_4_0= RULE_INT
            {
            lv_locationValue_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_locationValue_4_0, grammarAccess.getProtectUnitTypeAccess().getLocationValueINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectUnitTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"locationValue",
            						lv_locationValue_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getProtectUnitTypeAccess().getRadiusKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getProtectUnitTypeAccess().getIsKeyword_6());
            		
            // InternalWail.g:1110:3: ( (lv_protectionRadius_7_0= RULE_INT ) )
            // InternalWail.g:1111:4: (lv_protectionRadius_7_0= RULE_INT )
            {
            // InternalWail.g:1111:4: (lv_protectionRadius_7_0= RULE_INT )
            // InternalWail.g:1112:5: lv_protectionRadius_7_0= RULE_INT
            {
            lv_protectionRadius_7_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_protectionRadius_7_0, grammarAccess.getProtectUnitTypeAccess().getProtectionRadiusINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectUnitTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"protectionRadius",
            						lv_protectionRadius_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getProtectUnitTypeAccess().getSideKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getProtectUnitTypeAccess().getIsKeyword_9());
            		
            // InternalWail.g:1136:3: ( (lv_procSide_10_0= RULE_INT ) )
            // InternalWail.g:1137:4: (lv_procSide_10_0= RULE_INT )
            {
            // InternalWail.g:1137:4: (lv_procSide_10_0= RULE_INT )
            // InternalWail.g:1138:5: lv_procSide_10_0= RULE_INT
            {
            lv_procSide_10_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_procSide_10_0, grammarAccess.getProtectUnitTypeAccess().getProcSideINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectUnitTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"procSide",
            						lv_procSide_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,34,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getProtectUnitTypeAccess().getTypeKeyword_11());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getProtectUnitTypeAccess().getIsKeyword_12());
            		
            // InternalWail.g:1162:3: ( (lv_procType_13_0= RULE_STRING ) )
            // InternalWail.g:1163:4: (lv_procType_13_0= RULE_STRING )
            {
            // InternalWail.g:1163:4: (lv_procType_13_0= RULE_STRING )
            // InternalWail.g:1164:5: lv_procType_13_0= RULE_STRING
            {
            lv_procType_13_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_procType_13_0, grammarAccess.getProtectUnitTypeAccess().getProcTypeSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectUnitTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"procType",
            						lv_procType_13_0,
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
    // $ANTLR end "ruleProtectUnitType"


    // $ANTLR start "entryRuleProtectLocation"
    // InternalWail.g:1184:1: entryRuleProtectLocation returns [EObject current=null] : iv_ruleProtectLocation= ruleProtectLocation EOF ;
    public final EObject entryRuleProtectLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtectLocation = null;


        try {
            // InternalWail.g:1184:56: (iv_ruleProtectLocation= ruleProtectLocation EOF )
            // InternalWail.g:1185:2: iv_ruleProtectLocation= ruleProtectLocation EOF
            {
             newCompositeNode(grammarAccess.getProtectLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtectLocation=ruleProtectLocation();

            state._fsp--;

             current =iv_ruleProtectLocation; 
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
    // $ANTLR end "entryRuleProtectLocation"


    // $ANTLR start "ruleProtectLocation"
    // InternalWail.g:1191:1: ruleProtectLocation returns [EObject current=null] : (otherlv_0= 'protect' otherlv_1= 'x' ( (lv_XAxis_2_0= RULE_INT ) ) otherlv_3= 'y' ( (lv_YAxis_4_0= RULE_INT ) ) otherlv_5= 'value' otherlv_6= 'is' ( (lv_locValue_7_0= RULE_INT ) ) otherlv_8= 'radius' otherlv_9= 'is' ( (lv_procRad_10_0= RULE_INT ) ) ) ;
    public final EObject ruleProtectLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_XAxis_2_0=null;
        Token otherlv_3=null;
        Token lv_YAxis_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_locValue_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_procRad_10_0=null;


        	enterRule();

        try {
            // InternalWail.g:1197:2: ( (otherlv_0= 'protect' otherlv_1= 'x' ( (lv_XAxis_2_0= RULE_INT ) ) otherlv_3= 'y' ( (lv_YAxis_4_0= RULE_INT ) ) otherlv_5= 'value' otherlv_6= 'is' ( (lv_locValue_7_0= RULE_INT ) ) otherlv_8= 'radius' otherlv_9= 'is' ( (lv_procRad_10_0= RULE_INT ) ) ) )
            // InternalWail.g:1198:2: (otherlv_0= 'protect' otherlv_1= 'x' ( (lv_XAxis_2_0= RULE_INT ) ) otherlv_3= 'y' ( (lv_YAxis_4_0= RULE_INT ) ) otherlv_5= 'value' otherlv_6= 'is' ( (lv_locValue_7_0= RULE_INT ) ) otherlv_8= 'radius' otherlv_9= 'is' ( (lv_procRad_10_0= RULE_INT ) ) )
            {
            // InternalWail.g:1198:2: (otherlv_0= 'protect' otherlv_1= 'x' ( (lv_XAxis_2_0= RULE_INT ) ) otherlv_3= 'y' ( (lv_YAxis_4_0= RULE_INT ) ) otherlv_5= 'value' otherlv_6= 'is' ( (lv_locValue_7_0= RULE_INT ) ) otherlv_8= 'radius' otherlv_9= 'is' ( (lv_procRad_10_0= RULE_INT ) ) )
            // InternalWail.g:1199:3: otherlv_0= 'protect' otherlv_1= 'x' ( (lv_XAxis_2_0= RULE_INT ) ) otherlv_3= 'y' ( (lv_YAxis_4_0= RULE_INT ) ) otherlv_5= 'value' otherlv_6= 'is' ( (lv_locValue_7_0= RULE_INT ) ) otherlv_8= 'radius' otherlv_9= 'is' ( (lv_procRad_10_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getProtectLocationAccess().getProtectKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getProtectLocationAccess().getXKeyword_1());
            		
            // InternalWail.g:1207:3: ( (lv_XAxis_2_0= RULE_INT ) )
            // InternalWail.g:1208:4: (lv_XAxis_2_0= RULE_INT )
            {
            // InternalWail.g:1208:4: (lv_XAxis_2_0= RULE_INT )
            // InternalWail.g:1209:5: lv_XAxis_2_0= RULE_INT
            {
            lv_XAxis_2_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_XAxis_2_0, grammarAccess.getProtectLocationAccess().getXAxisINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"XAxis",
            						lv_XAxis_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getProtectLocationAccess().getYKeyword_3());
            		
            // InternalWail.g:1229:3: ( (lv_YAxis_4_0= RULE_INT ) )
            // InternalWail.g:1230:4: (lv_YAxis_4_0= RULE_INT )
            {
            // InternalWail.g:1230:4: (lv_YAxis_4_0= RULE_INT )
            // InternalWail.g:1231:5: lv_YAxis_4_0= RULE_INT
            {
            lv_YAxis_4_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_YAxis_4_0, grammarAccess.getProtectLocationAccess().getYAxisINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"YAxis",
            						lv_YAxis_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getProtectLocationAccess().getValueKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getProtectLocationAccess().getIsKeyword_6());
            		
            // InternalWail.g:1255:3: ( (lv_locValue_7_0= RULE_INT ) )
            // InternalWail.g:1256:4: (lv_locValue_7_0= RULE_INT )
            {
            // InternalWail.g:1256:4: (lv_locValue_7_0= RULE_INT )
            // InternalWail.g:1257:5: lv_locValue_7_0= RULE_INT
            {
            lv_locValue_7_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_locValue_7_0, grammarAccess.getProtectLocationAccess().getLocValueINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"locValue",
            						lv_locValue_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getProtectLocationAccess().getRadiusKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getProtectLocationAccess().getIsKeyword_9());
            		
            // InternalWail.g:1281:3: ( (lv_procRad_10_0= RULE_INT ) )
            // InternalWail.g:1282:4: (lv_procRad_10_0= RULE_INT )
            {
            // InternalWail.g:1282:4: (lv_procRad_10_0= RULE_INT )
            // InternalWail.g:1283:5: lv_procRad_10_0= RULE_INT
            {
            lv_procRad_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_procRad_10_0, grammarAccess.getProtectLocationAccess().getProcRadINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtectLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"procRad",
            						lv_procRad_10_0,
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
    // $ANTLR end "ruleProtectLocation"


    // $ANTLR start "entryRuleGoaLocation"
    // InternalWail.g:1303:1: entryRuleGoaLocation returns [EObject current=null] : iv_ruleGoaLocation= ruleGoaLocation EOF ;
    public final EObject entryRuleGoaLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoaLocation = null;


        try {
            // InternalWail.g:1303:52: (iv_ruleGoaLocation= ruleGoaLocation EOF )
            // InternalWail.g:1304:2: iv_ruleGoaLocation= ruleGoaLocation EOF
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
    // InternalWail.g:1310:1: ruleGoaLocation returns [EObject current=null] : (otherlv_0= 'attack' otherlv_1= 'x' ( (lv_XAxis_2_0= RULE_INT ) ) otherlv_3= 'y' ( (lv_YAxis_4_0= RULE_INT ) ) otherlv_5= 'value' otherlv_6= 'is' ( (lv_locValue_7_0= RULE_INT ) ) ) ;
    public final EObject ruleGoaLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_XAxis_2_0=null;
        Token otherlv_3=null;
        Token lv_YAxis_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_locValue_7_0=null;


        	enterRule();

        try {
            // InternalWail.g:1316:2: ( (otherlv_0= 'attack' otherlv_1= 'x' ( (lv_XAxis_2_0= RULE_INT ) ) otherlv_3= 'y' ( (lv_YAxis_4_0= RULE_INT ) ) otherlv_5= 'value' otherlv_6= 'is' ( (lv_locValue_7_0= RULE_INT ) ) ) )
            // InternalWail.g:1317:2: (otherlv_0= 'attack' otherlv_1= 'x' ( (lv_XAxis_2_0= RULE_INT ) ) otherlv_3= 'y' ( (lv_YAxis_4_0= RULE_INT ) ) otherlv_5= 'value' otherlv_6= 'is' ( (lv_locValue_7_0= RULE_INT ) ) )
            {
            // InternalWail.g:1317:2: (otherlv_0= 'attack' otherlv_1= 'x' ( (lv_XAxis_2_0= RULE_INT ) ) otherlv_3= 'y' ( (lv_YAxis_4_0= RULE_INT ) ) otherlv_5= 'value' otherlv_6= 'is' ( (lv_locValue_7_0= RULE_INT ) ) )
            // InternalWail.g:1318:3: otherlv_0= 'attack' otherlv_1= 'x' ( (lv_XAxis_2_0= RULE_INT ) ) otherlv_3= 'y' ( (lv_YAxis_4_0= RULE_INT ) ) otherlv_5= 'value' otherlv_6= 'is' ( (lv_locValue_7_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getGoaLocationAccess().getAttackKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getGoaLocationAccess().getXKeyword_1());
            		
            // InternalWail.g:1326:3: ( (lv_XAxis_2_0= RULE_INT ) )
            // InternalWail.g:1327:4: (lv_XAxis_2_0= RULE_INT )
            {
            // InternalWail.g:1327:4: (lv_XAxis_2_0= RULE_INT )
            // InternalWail.g:1328:5: lv_XAxis_2_0= RULE_INT
            {
            lv_XAxis_2_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_XAxis_2_0, grammarAccess.getGoaLocationAccess().getXAxisINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoaLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"XAxis",
            						lv_XAxis_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getGoaLocationAccess().getYKeyword_3());
            		
            // InternalWail.g:1348:3: ( (lv_YAxis_4_0= RULE_INT ) )
            // InternalWail.g:1349:4: (lv_YAxis_4_0= RULE_INT )
            {
            // InternalWail.g:1349:4: (lv_YAxis_4_0= RULE_INT )
            // InternalWail.g:1350:5: lv_YAxis_4_0= RULE_INT
            {
            lv_YAxis_4_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_YAxis_4_0, grammarAccess.getGoaLocationAccess().getYAxisINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoaLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"YAxis",
            						lv_YAxis_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getGoaLocationAccess().getValueKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getGoaLocationAccess().getIsKeyword_6());
            		
            // InternalWail.g:1374:3: ( (lv_locValue_7_0= RULE_INT ) )
            // InternalWail.g:1375:4: (lv_locValue_7_0= RULE_INT )
            {
            // InternalWail.g:1375:4: (lv_locValue_7_0= RULE_INT )
            // InternalWail.g:1376:5: lv_locValue_7_0= RULE_INT
            {
            lv_locValue_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_locValue_7_0, grammarAccess.getGoaLocationAccess().getLocValueINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoaLocationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"locValue",
            						lv_locValue_7_0,
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


    // $ANTLR start "entryRuleAggression"
    // InternalWail.g:1396:1: entryRuleAggression returns [EObject current=null] : iv_ruleAggression= ruleAggression EOF ;
    public final EObject entryRuleAggression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggression = null;


        try {
            // InternalWail.g:1396:51: (iv_ruleAggression= ruleAggression EOF )
            // InternalWail.g:1397:2: iv_ruleAggression= ruleAggression EOF
            {
             newCompositeNode(grammarAccess.getAggressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAggression=ruleAggression();

            state._fsp--;

             current =iv_ruleAggression; 
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
    // $ANTLR end "entryRuleAggression"


    // $ANTLR start "ruleAggression"
    // InternalWail.g:1403:1: ruleAggression returns [EObject current=null] : (otherlv_0= 'aggression' otherlv_1= 'is' ( (lv_aggressionVal_2_0= RULE_INT ) ) ) ;
    public final EObject ruleAggression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_aggressionVal_2_0=null;


        	enterRule();

        try {
            // InternalWail.g:1409:2: ( (otherlv_0= 'aggression' otherlv_1= 'is' ( (lv_aggressionVal_2_0= RULE_INT ) ) ) )
            // InternalWail.g:1410:2: (otherlv_0= 'aggression' otherlv_1= 'is' ( (lv_aggressionVal_2_0= RULE_INT ) ) )
            {
            // InternalWail.g:1410:2: (otherlv_0= 'aggression' otherlv_1= 'is' ( (lv_aggressionVal_2_0= RULE_INT ) ) )
            // InternalWail.g:1411:3: otherlv_0= 'aggression' otherlv_1= 'is' ( (lv_aggressionVal_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAggressionAccess().getAggressionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAggressionAccess().getIsKeyword_1());
            		
            // InternalWail.g:1419:3: ( (lv_aggressionVal_2_0= RULE_INT ) )
            // InternalWail.g:1420:4: (lv_aggressionVal_2_0= RULE_INT )
            {
            // InternalWail.g:1420:4: (lv_aggressionVal_2_0= RULE_INT )
            // InternalWail.g:1421:5: lv_aggressionVal_2_0= RULE_INT
            {
            lv_aggressionVal_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_aggressionVal_2_0, grammarAccess.getAggressionAccess().getAggressionValINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"aggressionVal",
            						lv_aggressionVal_2_0,
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
    // $ANTLR end "ruleAggression"


    // $ANTLR start "entryRuleCaution"
    // InternalWail.g:1441:1: entryRuleCaution returns [EObject current=null] : iv_ruleCaution= ruleCaution EOF ;
    public final EObject entryRuleCaution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaution = null;


        try {
            // InternalWail.g:1441:48: (iv_ruleCaution= ruleCaution EOF )
            // InternalWail.g:1442:2: iv_ruleCaution= ruleCaution EOF
            {
             newCompositeNode(grammarAccess.getCautionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaution=ruleCaution();

            state._fsp--;

             current =iv_ruleCaution; 
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
    // $ANTLR end "entryRuleCaution"


    // $ANTLR start "ruleCaution"
    // InternalWail.g:1448:1: ruleCaution returns [EObject current=null] : (otherlv_0= 'Caution' otherlv_1= 'is' ( (lv_cautionval_2_0= RULE_INT ) ) ) ;
    public final EObject ruleCaution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cautionval_2_0=null;


        	enterRule();

        try {
            // InternalWail.g:1454:2: ( (otherlv_0= 'Caution' otherlv_1= 'is' ( (lv_cautionval_2_0= RULE_INT ) ) ) )
            // InternalWail.g:1455:2: (otherlv_0= 'Caution' otherlv_1= 'is' ( (lv_cautionval_2_0= RULE_INT ) ) )
            {
            // InternalWail.g:1455:2: (otherlv_0= 'Caution' otherlv_1= 'is' ( (lv_cautionval_2_0= RULE_INT ) ) )
            // InternalWail.g:1456:3: otherlv_0= 'Caution' otherlv_1= 'is' ( (lv_cautionval_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCautionAccess().getCautionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getCautionAccess().getIsKeyword_1());
            		
            // InternalWail.g:1464:3: ( (lv_cautionval_2_0= RULE_INT ) )
            // InternalWail.g:1465:4: (lv_cautionval_2_0= RULE_INT )
            {
            // InternalWail.g:1465:4: (lv_cautionval_2_0= RULE_INT )
            // InternalWail.g:1466:5: lv_cautionval_2_0= RULE_INT
            {
            lv_cautionval_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_cautionval_2_0, grammarAccess.getCautionAccess().getCautionvalINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCautionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cautionval",
            						lv_cautionval_2_0,
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
    // $ANTLR end "ruleCaution"


    // $ANTLR start "entryRuleDefualt_CA"
    // InternalWail.g:1486:1: entryRuleDefualt_CA returns [EObject current=null] : iv_ruleDefualt_CA= ruleDefualt_CA EOF ;
    public final EObject entryRuleDefualt_CA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefualt_CA = null;


        try {
            // InternalWail.g:1486:51: (iv_ruleDefualt_CA= ruleDefualt_CA EOF )
            // InternalWail.g:1487:2: iv_ruleDefualt_CA= ruleDefualt_CA EOF
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
    // InternalWail.g:1493:1: ruleDefualt_CA returns [EObject current=null] : ( ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) ) ) (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? ) ;
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
            // InternalWail.g:1499:2: ( ( ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) ) ) (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? ) )
            // InternalWail.g:1500:2: ( ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) ) ) (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? )
            {
            // InternalWail.g:1500:2: ( ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) ) ) (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )? )
            // InternalWail.g:1501:3: ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) ) ) (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )?
            {
            // InternalWail.g:1501:3: ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) ) )
            // InternalWail.g:1502:4: ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) )
            {
            // InternalWail.g:1502:4: ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' ) )
            // InternalWail.g:1503:5: (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' )
            {
            // InternalWail.g:1503:5: (lv_caType_0_1= 'movement' | lv_caType_0_2= 'heal' | lv_caType_0_3= 'retreat' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'combat_value_targets' | lv_caType_0_7= 'capture_villages' | lv_caType_0_8= 'leader_to_keep' )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt10=1;
                }
                break;
            case 41:
                {
                alt10=2;
                }
                break;
            case 42:
                {
                alt10=3;
                }
                break;
            case 43:
                {
                alt10=4;
                }
                break;
            case 44:
                {
                alt10=5;
                }
                break;
            case 45:
                {
                alt10=6;
                }
                break;
            case 46:
                {
                alt10=7;
                }
                break;
            case 47:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalWail.g:1504:6: lv_caType_0_1= 'movement'
                    {
                    lv_caType_0_1=(Token)match(input,40,FOLLOW_28); 

                    						newLeafNode(lv_caType_0_1, grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalWail.g:1515:6: lv_caType_0_2= 'heal'
                    {
                    lv_caType_0_2=(Token)match(input,41,FOLLOW_28); 

                    						newLeafNode(lv_caType_0_2, grammarAccess.getDefualt_CAAccess().getCaTypeHealKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalWail.g:1526:6: lv_caType_0_3= 'retreat'
                    {
                    lv_caType_0_3=(Token)match(input,42,FOLLOW_28); 

                    						newLeafNode(lv_caType_0_3, grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalWail.g:1537:6: lv_caType_0_4= 'combat'
                    {
                    lv_caType_0_4=(Token)match(input,43,FOLLOW_28); 

                    						newLeafNode(lv_caType_0_4, grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalWail.g:1548:6: lv_caType_0_5= 'recruit'
                    {
                    lv_caType_0_5=(Token)match(input,44,FOLLOW_28); 

                    						newLeafNode(lv_caType_0_5, grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalWail.g:1559:6: lv_caType_0_6= 'combat_value_targets'
                    {
                    lv_caType_0_6=(Token)match(input,45,FOLLOW_28); 

                    						newLeafNode(lv_caType_0_6, grammarAccess.getDefualt_CAAccess().getCaTypeCombat_value_targetsKeyword_0_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalWail.g:1570:6: lv_caType_0_7= 'capture_villages'
                    {
                    lv_caType_0_7=(Token)match(input,46,FOLLOW_28); 

                    						newLeafNode(lv_caType_0_7, grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefualt_CARule());
                    						}
                    						setWithLastConsumed(current, "caType", lv_caType_0_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalWail.g:1581:6: lv_caType_0_8= 'leader_to_keep'
                    {
                    lv_caType_0_8=(Token)match(input,47,FOLLOW_28); 

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

            // InternalWail.g:1594:3: (otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==48) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalWail.g:1595:4: otherlv_1= 'cost' ( (lv_cost_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getDefualt_CAAccess().getCostKeyword_1_0());
                    			
                    // InternalWail.g:1599:4: ( (lv_cost_2_0= RULE_INT ) )
                    // InternalWail.g:1600:5: (lv_cost_2_0= RULE_INT )
                    {
                    // InternalWail.g:1600:5: (lv_cost_2_0= RULE_INT )
                    // InternalWail.g:1601:6: lv_cost_2_0= RULE_INT
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


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\34\1\uffff\1\33\2\uffff\1\37\1\20\1\5\1\40\1\20\1\5\1\41\1\20\1\5\1\25\2\uffff";
    static final String dfa_3s = "\1\35\1\uffff\1\43\2\uffff\1\37\1\20\1\5\1\40\1\20\1\5\1\41\1\20\1\5\1\42\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\1\2\12\uffff\1\5\1\4";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2",
            "",
            "\1\5\2\uffff\1\3\4\uffff\1\4",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\20\14\uffff\1\17",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "747:2: ( (otherlv_0= 'goal' otherlv_1= 'is' ( (lv_goal_2_0= ruleGoaLocation ) ) ) | this_ProtectLocation_3= ruleProtectLocation | this_ProtectLeader_4= ruleProtectLeader | this_ProtectUnitID_5= ruleProtectUnitID | this_ProtectUnitType_6= ruleProtectUnitType )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004030100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000FF0000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000AE00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000002L});

}