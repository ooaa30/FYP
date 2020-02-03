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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rule'", "'{'", "'}'", "'unitID'", "'goal'", "'newCA'", "'movement'", "'retreat'", "'move_to_target'", "'combat'", "'recruit'", "'focus_high_xp'", "'move_to_enemy'", "'capture_villages'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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
    // InternalWesnothDSL.g:107:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_unitID_3_0= ruleUnitID ) ) ( (lv_behaviours_4_0= ruleBehaviour ) )* otherlv_5= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_unitID_3_0 = null;

        AntlrDatatypeRuleToken lv_behaviours_4_0 = null;



        	enterRule();

        try {
            // InternalWesnothDSL.g:113:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_unitID_3_0= ruleUnitID ) ) ( (lv_behaviours_4_0= ruleBehaviour ) )* otherlv_5= '}' ) )
            // InternalWesnothDSL.g:114:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_unitID_3_0= ruleUnitID ) ) ( (lv_behaviours_4_0= ruleBehaviour ) )* otherlv_5= '}' )
            {
            // InternalWesnothDSL.g:114:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_unitID_3_0= ruleUnitID ) ) ( (lv_behaviours_4_0= ruleBehaviour ) )* otherlv_5= '}' )
            // InternalWesnothDSL.g:115:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_unitID_3_0= ruleUnitID ) ) ( (lv_behaviours_4_0= ruleBehaviour ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalWesnothDSL.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWesnothDSL.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWesnothDSL.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalWesnothDSL.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWesnothDSL.g:141:3: ( (lv_unitID_3_0= ruleUnitID ) )
            // InternalWesnothDSL.g:142:4: (lv_unitID_3_0= ruleUnitID )
            {
            // InternalWesnothDSL.g:142:4: (lv_unitID_3_0= ruleUnitID )
            // InternalWesnothDSL.g:143:5: lv_unitID_3_0= ruleUnitID
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getUnitIDUnitIDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_unitID_3_0=ruleUnitID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"unitID",
            						lv_unitID_3_0,
            						"fyp.xtext.wesnoth.mydsl.WesnothDSL.UnitID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWesnothDSL.g:160:3: ( (lv_behaviours_4_0= ruleBehaviour ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=24)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWesnothDSL.g:161:4: (lv_behaviours_4_0= ruleBehaviour )
            	    {
            	    // InternalWesnothDSL.g:161:4: (lv_behaviours_4_0= ruleBehaviour )
            	    // InternalWesnothDSL.g:162:5: lv_behaviours_4_0= ruleBehaviour
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getBehavioursBehaviourParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_behaviours_4_0=ruleBehaviour();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"behaviours",
            	    						lv_behaviours_4_0,
            	    						"fyp.xtext.wesnoth.mydsl.WesnothDSL.Behaviour");
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


    // $ANTLR start "entryRuleUnitID"
    // InternalWesnothDSL.g:187:1: entryRuleUnitID returns [EObject current=null] : iv_ruleUnitID= ruleUnitID EOF ;
    public final EObject entryRuleUnitID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitID = null;


        try {
            // InternalWesnothDSL.g:187:47: (iv_ruleUnitID= ruleUnitID EOF )
            // InternalWesnothDSL.g:188:2: iv_ruleUnitID= ruleUnitID EOF
            {
             newCompositeNode(grammarAccess.getUnitIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitID=ruleUnitID();

            state._fsp--;

             current =iv_ruleUnitID; 
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
    // $ANTLR end "entryRuleUnitID"


    // $ANTLR start "ruleUnitID"
    // InternalWesnothDSL.g:194:1: ruleUnitID returns [EObject current=null] : (otherlv_0= 'unitID' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUnitID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:200:2: ( (otherlv_0= 'unitID' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalWesnothDSL.g:201:2: (otherlv_0= 'unitID' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalWesnothDSL.g:201:2: (otherlv_0= 'unitID' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalWesnothDSL.g:202:3: otherlv_0= 'unitID' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUnitIDAccess().getUnitIDKeyword_0());
            		
            // InternalWesnothDSL.g:206:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWesnothDSL.g:207:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWesnothDSL.g:207:4: (lv_name_1_0= RULE_ID )
            // InternalWesnothDSL.g:208:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUnitIDAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnitIDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleUnitID"


    // $ANTLR start "entryRuleBehaviour"
    // InternalWesnothDSL.g:228:1: entryRuleBehaviour returns [String current=null] : iv_ruleBehaviour= ruleBehaviour EOF ;
    public final String entryRuleBehaviour() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBehaviour = null;


        try {
            // InternalWesnothDSL.g:228:49: (iv_ruleBehaviour= ruleBehaviour EOF )
            // InternalWesnothDSL.g:229:2: iv_ruleBehaviour= ruleBehaviour EOF
            {
             newCompositeNode(grammarAccess.getBehaviourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviour=ruleBehaviour();

            state._fsp--;

             current =iv_ruleBehaviour.getText(); 
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
    // $ANTLR end "entryRuleBehaviour"


    // $ANTLR start "ruleBehaviour"
    // InternalWesnothDSL.g:235:1: ruleBehaviour returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Goal_0= ruleGoal | this_Candidate_Action_1= ruleCandidate_Action ) ;
    public final AntlrDatatypeRuleToken ruleBehaviour() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Goal_0 = null;

        AntlrDatatypeRuleToken this_Candidate_Action_1 = null;



        	enterRule();

        try {
            // InternalWesnothDSL.g:241:2: ( (this_Goal_0= ruleGoal | this_Candidate_Action_1= ruleCandidate_Action ) )
            // InternalWesnothDSL.g:242:2: (this_Goal_0= ruleGoal | this_Candidate_Action_1= ruleCandidate_Action )
            {
            // InternalWesnothDSL.g:242:2: (this_Goal_0= ruleGoal | this_Candidate_Action_1= ruleCandidate_Action )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=16 && LA3_0<=24)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalWesnothDSL.g:243:3: this_Goal_0= ruleGoal
                    {

                    			newCompositeNode(grammarAccess.getBehaviourAccess().getGoalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Goal_0=ruleGoal();

                    state._fsp--;


                    			current.merge(this_Goal_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:254:3: this_Candidate_Action_1= ruleCandidate_Action
                    {

                    			newCompositeNode(grammarAccess.getBehaviourAccess().getCandidate_ActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Candidate_Action_1=ruleCandidate_Action();

                    state._fsp--;


                    			current.merge(this_Candidate_Action_1);
                    		

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
    // $ANTLR end "ruleBehaviour"


    // $ANTLR start "entryRuleGoal"
    // InternalWesnothDSL.g:268:1: entryRuleGoal returns [String current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final String entryRuleGoal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGoal = null;


        try {
            // InternalWesnothDSL.g:268:44: (iv_ruleGoal= ruleGoal EOF )
            // InternalWesnothDSL.g:269:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal.getText(); 
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
    // InternalWesnothDSL.g:275:1: ruleGoal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'goal' ;
    public final AntlrDatatypeRuleToken ruleGoal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:281:2: (kw= 'goal' )
            // InternalWesnothDSL.g:282:2: kw= 'goal'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getGoalAccess().getGoalKeyword());
            	

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


    // $ANTLR start "entryRuleCandidate_Action"
    // InternalWesnothDSL.g:290:1: entryRuleCandidate_Action returns [String current=null] : iv_ruleCandidate_Action= ruleCandidate_Action EOF ;
    public final String entryRuleCandidate_Action() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCandidate_Action = null;


        try {
            // InternalWesnothDSL.g:290:56: (iv_ruleCandidate_Action= ruleCandidate_Action EOF )
            // InternalWesnothDSL.g:291:2: iv_ruleCandidate_Action= ruleCandidate_Action EOF
            {
             newCompositeNode(grammarAccess.getCandidate_ActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCandidate_Action=ruleCandidate_Action();

            state._fsp--;

             current =iv_ruleCandidate_Action.getText(); 
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
    // $ANTLR end "entryRuleCandidate_Action"


    // $ANTLR start "ruleCandidate_Action"
    // InternalWesnothDSL.g:297:1: ruleCandidate_Action returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_New_CA_0= ruleNew_CA | this_Defualt_CA_1= ruleDefualt_CA ) ;
    public final AntlrDatatypeRuleToken ruleCandidate_Action() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_New_CA_0 = null;

        AntlrDatatypeRuleToken this_Defualt_CA_1 = null;



        	enterRule();

        try {
            // InternalWesnothDSL.g:303:2: ( (this_New_CA_0= ruleNew_CA | this_Defualt_CA_1= ruleDefualt_CA ) )
            // InternalWesnothDSL.g:304:2: (this_New_CA_0= ruleNew_CA | this_Defualt_CA_1= ruleDefualt_CA )
            {
            // InternalWesnothDSL.g:304:2: (this_New_CA_0= ruleNew_CA | this_Defualt_CA_1= ruleDefualt_CA )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=17 && LA4_0<=24)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalWesnothDSL.g:305:3: this_New_CA_0= ruleNew_CA
                    {

                    			newCompositeNode(grammarAccess.getCandidate_ActionAccess().getNew_CAParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_New_CA_0=ruleNew_CA();

                    state._fsp--;


                    			current.merge(this_New_CA_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:316:3: this_Defualt_CA_1= ruleDefualt_CA
                    {

                    			newCompositeNode(grammarAccess.getCandidate_ActionAccess().getDefualt_CAParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Defualt_CA_1=ruleDefualt_CA();

                    state._fsp--;


                    			current.merge(this_Defualt_CA_1);
                    		

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
    // $ANTLR end "ruleCandidate_Action"


    // $ANTLR start "entryRuleNew_CA"
    // InternalWesnothDSL.g:330:1: entryRuleNew_CA returns [String current=null] : iv_ruleNew_CA= ruleNew_CA EOF ;
    public final String entryRuleNew_CA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNew_CA = null;


        try {
            // InternalWesnothDSL.g:330:46: (iv_ruleNew_CA= ruleNew_CA EOF )
            // InternalWesnothDSL.g:331:2: iv_ruleNew_CA= ruleNew_CA EOF
            {
             newCompositeNode(grammarAccess.getNew_CARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNew_CA=ruleNew_CA();

            state._fsp--;

             current =iv_ruleNew_CA.getText(); 
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
    // $ANTLR end "entryRuleNew_CA"


    // $ANTLR start "ruleNew_CA"
    // InternalWesnothDSL.g:337:1: ruleNew_CA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'newCA' ;
    public final AntlrDatatypeRuleToken ruleNew_CA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:343:2: (kw= 'newCA' )
            // InternalWesnothDSL.g:344:2: kw= 'newCA'
            {
            kw=(Token)match(input,16,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getNew_CAAccess().getNewCAKeyword());
            	

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
    // $ANTLR end "ruleNew_CA"


    // $ANTLR start "entryRuleDefualt_CA"
    // InternalWesnothDSL.g:352:1: entryRuleDefualt_CA returns [String current=null] : iv_ruleDefualt_CA= ruleDefualt_CA EOF ;
    public final String entryRuleDefualt_CA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefualt_CA = null;


        try {
            // InternalWesnothDSL.g:352:50: (iv_ruleDefualt_CA= ruleDefualt_CA EOF )
            // InternalWesnothDSL.g:353:2: iv_ruleDefualt_CA= ruleDefualt_CA EOF
            {
             newCompositeNode(grammarAccess.getDefualt_CARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefualt_CA=ruleDefualt_CA();

            state._fsp--;

             current =iv_ruleDefualt_CA.getText(); 
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
    // InternalWesnothDSL.g:359:1: ruleDefualt_CA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Movement_0= ruleMovement | this_Retreat_1= ruleRetreat | this_Move_To_Target_2= ruleMove_To_Target | this_Combat_3= ruleCombat | this_Recruit_4= ruleRecruit | this_Focus_High_XP_5= ruleFocus_High_XP | this_Move_To_Enemy_6= ruleMove_To_Enemy | this_Capture_Villages_7= ruleCapture_Villages ) ;
    public final AntlrDatatypeRuleToken ruleDefualt_CA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Movement_0 = null;

        AntlrDatatypeRuleToken this_Retreat_1 = null;

        AntlrDatatypeRuleToken this_Move_To_Target_2 = null;

        AntlrDatatypeRuleToken this_Combat_3 = null;

        AntlrDatatypeRuleToken this_Recruit_4 = null;

        AntlrDatatypeRuleToken this_Focus_High_XP_5 = null;

        AntlrDatatypeRuleToken this_Move_To_Enemy_6 = null;

        AntlrDatatypeRuleToken this_Capture_Villages_7 = null;



        	enterRule();

        try {
            // InternalWesnothDSL.g:365:2: ( (this_Movement_0= ruleMovement | this_Retreat_1= ruleRetreat | this_Move_To_Target_2= ruleMove_To_Target | this_Combat_3= ruleCombat | this_Recruit_4= ruleRecruit | this_Focus_High_XP_5= ruleFocus_High_XP | this_Move_To_Enemy_6= ruleMove_To_Enemy | this_Capture_Villages_7= ruleCapture_Villages ) )
            // InternalWesnothDSL.g:366:2: (this_Movement_0= ruleMovement | this_Retreat_1= ruleRetreat | this_Move_To_Target_2= ruleMove_To_Target | this_Combat_3= ruleCombat | this_Recruit_4= ruleRecruit | this_Focus_High_XP_5= ruleFocus_High_XP | this_Move_To_Enemy_6= ruleMove_To_Enemy | this_Capture_Villages_7= ruleCapture_Villages )
            {
            // InternalWesnothDSL.g:366:2: (this_Movement_0= ruleMovement | this_Retreat_1= ruleRetreat | this_Move_To_Target_2= ruleMove_To_Target | this_Combat_3= ruleCombat | this_Recruit_4= ruleRecruit | this_Focus_High_XP_5= ruleFocus_High_XP | this_Move_To_Enemy_6= ruleMove_To_Enemy | this_Capture_Villages_7= ruleCapture_Villages )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            case 22:
                {
                alt5=6;
                }
                break;
            case 23:
                {
                alt5=7;
                }
                break;
            case 24:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWesnothDSL.g:367:3: this_Movement_0= ruleMovement
                    {

                    			newCompositeNode(grammarAccess.getDefualt_CAAccess().getMovementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Movement_0=ruleMovement();

                    state._fsp--;


                    			current.merge(this_Movement_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:378:3: this_Retreat_1= ruleRetreat
                    {

                    			newCompositeNode(grammarAccess.getDefualt_CAAccess().getRetreatParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Retreat_1=ruleRetreat();

                    state._fsp--;


                    			current.merge(this_Retreat_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWesnothDSL.g:389:3: this_Move_To_Target_2= ruleMove_To_Target
                    {

                    			newCompositeNode(grammarAccess.getDefualt_CAAccess().getMove_To_TargetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_To_Target_2=ruleMove_To_Target();

                    state._fsp--;


                    			current.merge(this_Move_To_Target_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalWesnothDSL.g:400:3: this_Combat_3= ruleCombat
                    {

                    			newCompositeNode(grammarAccess.getDefualt_CAAccess().getCombatParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Combat_3=ruleCombat();

                    state._fsp--;


                    			current.merge(this_Combat_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalWesnothDSL.g:411:3: this_Recruit_4= ruleRecruit
                    {

                    			newCompositeNode(grammarAccess.getDefualt_CAAccess().getRecruitParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Recruit_4=ruleRecruit();

                    state._fsp--;


                    			current.merge(this_Recruit_4);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalWesnothDSL.g:422:3: this_Focus_High_XP_5= ruleFocus_High_XP
                    {

                    			newCompositeNode(grammarAccess.getDefualt_CAAccess().getFocus_High_XPParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Focus_High_XP_5=ruleFocus_High_XP();

                    state._fsp--;


                    			current.merge(this_Focus_High_XP_5);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalWesnothDSL.g:433:3: this_Move_To_Enemy_6= ruleMove_To_Enemy
                    {

                    			newCompositeNode(grammarAccess.getDefualt_CAAccess().getMove_To_EnemyParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_To_Enemy_6=ruleMove_To_Enemy();

                    state._fsp--;


                    			current.merge(this_Move_To_Enemy_6);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalWesnothDSL.g:444:3: this_Capture_Villages_7= ruleCapture_Villages
                    {

                    			newCompositeNode(grammarAccess.getDefualt_CAAccess().getCapture_VillagesParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Capture_Villages_7=ruleCapture_Villages();

                    state._fsp--;


                    			current.merge(this_Capture_Villages_7);
                    		

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
    // $ANTLR end "ruleDefualt_CA"


    // $ANTLR start "entryRuleMovement"
    // InternalWesnothDSL.g:458:1: entryRuleMovement returns [String current=null] : iv_ruleMovement= ruleMovement EOF ;
    public final String entryRuleMovement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMovement = null;


        try {
            // InternalWesnothDSL.g:458:48: (iv_ruleMovement= ruleMovement EOF )
            // InternalWesnothDSL.g:459:2: iv_ruleMovement= ruleMovement EOF
            {
             newCompositeNode(grammarAccess.getMovementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovement=ruleMovement();

            state._fsp--;

             current =iv_ruleMovement.getText(); 
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
    // $ANTLR end "entryRuleMovement"


    // $ANTLR start "ruleMovement"
    // InternalWesnothDSL.g:465:1: ruleMovement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'movement' ;
    public final AntlrDatatypeRuleToken ruleMovement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:471:2: (kw= 'movement' )
            // InternalWesnothDSL.g:472:2: kw= 'movement'
            {
            kw=(Token)match(input,17,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMovementAccess().getMovementKeyword());
            	

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
    // $ANTLR end "ruleMovement"


    // $ANTLR start "entryRuleRetreat"
    // InternalWesnothDSL.g:480:1: entryRuleRetreat returns [String current=null] : iv_ruleRetreat= ruleRetreat EOF ;
    public final String entryRuleRetreat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRetreat = null;


        try {
            // InternalWesnothDSL.g:480:47: (iv_ruleRetreat= ruleRetreat EOF )
            // InternalWesnothDSL.g:481:2: iv_ruleRetreat= ruleRetreat EOF
            {
             newCompositeNode(grammarAccess.getRetreatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetreat=ruleRetreat();

            state._fsp--;

             current =iv_ruleRetreat.getText(); 
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
    // $ANTLR end "entryRuleRetreat"


    // $ANTLR start "ruleRetreat"
    // InternalWesnothDSL.g:487:1: ruleRetreat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'retreat' ;
    public final AntlrDatatypeRuleToken ruleRetreat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:493:2: (kw= 'retreat' )
            // InternalWesnothDSL.g:494:2: kw= 'retreat'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getRetreatAccess().getRetreatKeyword());
            	

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
    // $ANTLR end "ruleRetreat"


    // $ANTLR start "entryRuleMove_To_Target"
    // InternalWesnothDSL.g:502:1: entryRuleMove_To_Target returns [String current=null] : iv_ruleMove_To_Target= ruleMove_To_Target EOF ;
    public final String entryRuleMove_To_Target() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMove_To_Target = null;


        try {
            // InternalWesnothDSL.g:502:54: (iv_ruleMove_To_Target= ruleMove_To_Target EOF )
            // InternalWesnothDSL.g:503:2: iv_ruleMove_To_Target= ruleMove_To_Target EOF
            {
             newCompositeNode(grammarAccess.getMove_To_TargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove_To_Target=ruleMove_To_Target();

            state._fsp--;

             current =iv_ruleMove_To_Target.getText(); 
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
    // $ANTLR end "entryRuleMove_To_Target"


    // $ANTLR start "ruleMove_To_Target"
    // InternalWesnothDSL.g:509:1: ruleMove_To_Target returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'move_to_target' ;
    public final AntlrDatatypeRuleToken ruleMove_To_Target() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:515:2: (kw= 'move_to_target' )
            // InternalWesnothDSL.g:516:2: kw= 'move_to_target'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMove_To_TargetAccess().getMove_to_targetKeyword());
            	

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
    // $ANTLR end "ruleMove_To_Target"


    // $ANTLR start "entryRuleCombat"
    // InternalWesnothDSL.g:524:1: entryRuleCombat returns [String current=null] : iv_ruleCombat= ruleCombat EOF ;
    public final String entryRuleCombat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCombat = null;


        try {
            // InternalWesnothDSL.g:524:46: (iv_ruleCombat= ruleCombat EOF )
            // InternalWesnothDSL.g:525:2: iv_ruleCombat= ruleCombat EOF
            {
             newCompositeNode(grammarAccess.getCombatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCombat=ruleCombat();

            state._fsp--;

             current =iv_ruleCombat.getText(); 
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
    // $ANTLR end "entryRuleCombat"


    // $ANTLR start "ruleCombat"
    // InternalWesnothDSL.g:531:1: ruleCombat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'combat' ;
    public final AntlrDatatypeRuleToken ruleCombat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:537:2: (kw= 'combat' )
            // InternalWesnothDSL.g:538:2: kw= 'combat'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCombatAccess().getCombatKeyword());
            	

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
    // $ANTLR end "ruleCombat"


    // $ANTLR start "entryRuleRecruit"
    // InternalWesnothDSL.g:546:1: entryRuleRecruit returns [String current=null] : iv_ruleRecruit= ruleRecruit EOF ;
    public final String entryRuleRecruit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRecruit = null;


        try {
            // InternalWesnothDSL.g:546:47: (iv_ruleRecruit= ruleRecruit EOF )
            // InternalWesnothDSL.g:547:2: iv_ruleRecruit= ruleRecruit EOF
            {
             newCompositeNode(grammarAccess.getRecruitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecruit=ruleRecruit();

            state._fsp--;

             current =iv_ruleRecruit.getText(); 
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
    // $ANTLR end "entryRuleRecruit"


    // $ANTLR start "ruleRecruit"
    // InternalWesnothDSL.g:553:1: ruleRecruit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'recruit' ;
    public final AntlrDatatypeRuleToken ruleRecruit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:559:2: (kw= 'recruit' )
            // InternalWesnothDSL.g:560:2: kw= 'recruit'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getRecruitAccess().getRecruitKeyword());
            	

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
    // $ANTLR end "ruleRecruit"


    // $ANTLR start "entryRuleFocus_High_XP"
    // InternalWesnothDSL.g:568:1: entryRuleFocus_High_XP returns [String current=null] : iv_ruleFocus_High_XP= ruleFocus_High_XP EOF ;
    public final String entryRuleFocus_High_XP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFocus_High_XP = null;


        try {
            // InternalWesnothDSL.g:568:53: (iv_ruleFocus_High_XP= ruleFocus_High_XP EOF )
            // InternalWesnothDSL.g:569:2: iv_ruleFocus_High_XP= ruleFocus_High_XP EOF
            {
             newCompositeNode(grammarAccess.getFocus_High_XPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFocus_High_XP=ruleFocus_High_XP();

            state._fsp--;

             current =iv_ruleFocus_High_XP.getText(); 
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
    // $ANTLR end "entryRuleFocus_High_XP"


    // $ANTLR start "ruleFocus_High_XP"
    // InternalWesnothDSL.g:575:1: ruleFocus_High_XP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'focus_high_xp' ;
    public final AntlrDatatypeRuleToken ruleFocus_High_XP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:581:2: (kw= 'focus_high_xp' )
            // InternalWesnothDSL.g:582:2: kw= 'focus_high_xp'
            {
            kw=(Token)match(input,22,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFocus_High_XPAccess().getFocus_high_xpKeyword());
            	

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
    // $ANTLR end "ruleFocus_High_XP"


    // $ANTLR start "entryRuleMove_To_Enemy"
    // InternalWesnothDSL.g:590:1: entryRuleMove_To_Enemy returns [String current=null] : iv_ruleMove_To_Enemy= ruleMove_To_Enemy EOF ;
    public final String entryRuleMove_To_Enemy() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMove_To_Enemy = null;


        try {
            // InternalWesnothDSL.g:590:53: (iv_ruleMove_To_Enemy= ruleMove_To_Enemy EOF )
            // InternalWesnothDSL.g:591:2: iv_ruleMove_To_Enemy= ruleMove_To_Enemy EOF
            {
             newCompositeNode(grammarAccess.getMove_To_EnemyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove_To_Enemy=ruleMove_To_Enemy();

            state._fsp--;

             current =iv_ruleMove_To_Enemy.getText(); 
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
    // $ANTLR end "entryRuleMove_To_Enemy"


    // $ANTLR start "ruleMove_To_Enemy"
    // InternalWesnothDSL.g:597:1: ruleMove_To_Enemy returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'move_to_enemy' ;
    public final AntlrDatatypeRuleToken ruleMove_To_Enemy() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:603:2: (kw= 'move_to_enemy' )
            // InternalWesnothDSL.g:604:2: kw= 'move_to_enemy'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMove_To_EnemyAccess().getMove_to_enemyKeyword());
            	

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
    // $ANTLR end "ruleMove_To_Enemy"


    // $ANTLR start "entryRuleCapture_Villages"
    // InternalWesnothDSL.g:612:1: entryRuleCapture_Villages returns [String current=null] : iv_ruleCapture_Villages= ruleCapture_Villages EOF ;
    public final String entryRuleCapture_Villages() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCapture_Villages = null;


        try {
            // InternalWesnothDSL.g:612:56: (iv_ruleCapture_Villages= ruleCapture_Villages EOF )
            // InternalWesnothDSL.g:613:2: iv_ruleCapture_Villages= ruleCapture_Villages EOF
            {
             newCompositeNode(grammarAccess.getCapture_VillagesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapture_Villages=ruleCapture_Villages();

            state._fsp--;

             current =iv_ruleCapture_Villages.getText(); 
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
    // $ANTLR end "entryRuleCapture_Villages"


    // $ANTLR start "ruleCapture_Villages"
    // InternalWesnothDSL.g:619:1: ruleCapture_Villages returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'capture_villages' ;
    public final AntlrDatatypeRuleToken ruleCapture_Villages() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWesnothDSL.g:625:2: (kw= 'capture_villages' )
            // InternalWesnothDSL.g:626:2: kw= 'capture_villages'
            {
            kw=(Token)match(input,24,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCapture_VillagesAccess().getCapture_villagesKeyword());
            	

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
    // $ANTLR end "ruleCapture_Villages"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001FFA000L});

}