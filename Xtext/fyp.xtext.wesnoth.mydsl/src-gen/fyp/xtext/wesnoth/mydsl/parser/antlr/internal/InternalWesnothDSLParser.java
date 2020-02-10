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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rule'", "'{'", "'}'", "'unitID'", "'movement'", "'retreat'", "'move_to_target'", "'combat'", "'recruit'", "'focus_high_XP'", "'move_to_enemy'", "'capture_villages'"
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
    // InternalWesnothDSL.g:107:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_unitID_3_0= ruleUnitID ) ) ( (lv_defualt_cas_4_0= ruleDefualt_CA ) )* otherlv_5= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_unitID_3_0 = null;

        EObject lv_defualt_cas_4_0 = null;



        	enterRule();

        try {
            // InternalWesnothDSL.g:113:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_unitID_3_0= ruleUnitID ) ) ( (lv_defualt_cas_4_0= ruleDefualt_CA ) )* otherlv_5= '}' ) )
            // InternalWesnothDSL.g:114:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_unitID_3_0= ruleUnitID ) ) ( (lv_defualt_cas_4_0= ruleDefualt_CA ) )* otherlv_5= '}' )
            {
            // InternalWesnothDSL.g:114:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_unitID_3_0= ruleUnitID ) ) ( (lv_defualt_cas_4_0= ruleDefualt_CA ) )* otherlv_5= '}' )
            // InternalWesnothDSL.g:115:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_unitID_3_0= ruleUnitID ) ) ( (lv_defualt_cas_4_0= ruleDefualt_CA ) )* otherlv_5= '}'
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

            // InternalWesnothDSL.g:160:3: ( (lv_defualt_cas_4_0= ruleDefualt_CA ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWesnothDSL.g:161:4: (lv_defualt_cas_4_0= ruleDefualt_CA )
            	    {
            	    // InternalWesnothDSL.g:161:4: (lv_defualt_cas_4_0= ruleDefualt_CA )
            	    // InternalWesnothDSL.g:162:5: lv_defualt_cas_4_0= ruleDefualt_CA
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getDefualt_casDefualt_CAParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_defualt_cas_4_0=ruleDefualt_CA();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"defualt_cas",
            	    						lv_defualt_cas_4_0,
            	    						"fyp.xtext.wesnoth.mydsl.WesnothDSL.Defualt_CA");
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


    // $ANTLR start "entryRuleDefualt_CA"
    // InternalWesnothDSL.g:228:1: entryRuleDefualt_CA returns [EObject current=null] : iv_ruleDefualt_CA= ruleDefualt_CA EOF ;
    public final EObject entryRuleDefualt_CA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefualt_CA = null;


        try {
            // InternalWesnothDSL.g:228:51: (iv_ruleDefualt_CA= ruleDefualt_CA EOF )
            // InternalWesnothDSL.g:229:2: iv_ruleDefualt_CA= ruleDefualt_CA EOF
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
    // InternalWesnothDSL.g:235:1: ruleDefualt_CA returns [EObject current=null] : ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'retreat' | lv_caType_0_3= 'move_to_target' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'focus_high_XP' | lv_caType_0_7= 'move_to_enemy' | lv_caType_0_8= 'capture_villages' ) ) ) ;
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


        	enterRule();

        try {
            // InternalWesnothDSL.g:241:2: ( ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'retreat' | lv_caType_0_3= 'move_to_target' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'focus_high_XP' | lv_caType_0_7= 'move_to_enemy' | lv_caType_0_8= 'capture_villages' ) ) ) )
            // InternalWesnothDSL.g:242:2: ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'retreat' | lv_caType_0_3= 'move_to_target' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'focus_high_XP' | lv_caType_0_7= 'move_to_enemy' | lv_caType_0_8= 'capture_villages' ) ) )
            {
            // InternalWesnothDSL.g:242:2: ( ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'retreat' | lv_caType_0_3= 'move_to_target' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'focus_high_XP' | lv_caType_0_7= 'move_to_enemy' | lv_caType_0_8= 'capture_villages' ) ) )
            // InternalWesnothDSL.g:243:3: ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'retreat' | lv_caType_0_3= 'move_to_target' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'focus_high_XP' | lv_caType_0_7= 'move_to_enemy' | lv_caType_0_8= 'capture_villages' ) )
            {
            // InternalWesnothDSL.g:243:3: ( (lv_caType_0_1= 'movement' | lv_caType_0_2= 'retreat' | lv_caType_0_3= 'move_to_target' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'focus_high_XP' | lv_caType_0_7= 'move_to_enemy' | lv_caType_0_8= 'capture_villages' ) )
            // InternalWesnothDSL.g:244:4: (lv_caType_0_1= 'movement' | lv_caType_0_2= 'retreat' | lv_caType_0_3= 'move_to_target' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'focus_high_XP' | lv_caType_0_7= 'move_to_enemy' | lv_caType_0_8= 'capture_villages' )
            {
            // InternalWesnothDSL.g:244:4: (lv_caType_0_1= 'movement' | lv_caType_0_2= 'retreat' | lv_caType_0_3= 'move_to_target' | lv_caType_0_4= 'combat' | lv_caType_0_5= 'recruit' | lv_caType_0_6= 'focus_high_XP' | lv_caType_0_7= 'move_to_enemy' | lv_caType_0_8= 'capture_villages' )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            case 20:
                {
                alt3=6;
                }
                break;
            case 21:
                {
                alt3=7;
                }
                break;
            case 22:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalWesnothDSL.g:245:5: lv_caType_0_1= 'movement'
                    {
                    lv_caType_0_1=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_1, grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:256:5: lv_caType_0_2= 'retreat'
                    {
                    lv_caType_0_2=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_2, grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalWesnothDSL.g:267:5: lv_caType_0_3= 'move_to_target'
                    {
                    lv_caType_0_3=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_3, grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalWesnothDSL.g:278:5: lv_caType_0_4= 'combat'
                    {
                    lv_caType_0_4=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_4, grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalWesnothDSL.g:289:5: lv_caType_0_5= 'recruit'
                    {
                    lv_caType_0_5=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_5, grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalWesnothDSL.g:300:5: lv_caType_0_6= 'focus_high_XP'
                    {
                    lv_caType_0_6=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_6, grammarAccess.getDefualt_CAAccess().getCaTypeFocus_high_XPKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalWesnothDSL.g:311:5: lv_caType_0_7= 'move_to_enemy'
                    {
                    lv_caType_0_7=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_7, grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_enemyKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalWesnothDSL.g:322:5: lv_caType_0_8= 'capture_villages'
                    {
                    lv_caType_0_8=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_caType_0_8, grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDefualt_CARule());
                    					}
                    					setWithLastConsumed(current, "caType", lv_caType_0_8, null);
                    				

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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000007FA000L});

}