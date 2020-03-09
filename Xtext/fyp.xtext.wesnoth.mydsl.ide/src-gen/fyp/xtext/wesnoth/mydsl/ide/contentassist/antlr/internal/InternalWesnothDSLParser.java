package fyp.xtext.wesnoth.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fyp.xtext.wesnoth.mydsl.services.WesnothDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWesnothDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'movement'", "'retreat'", "'move_to_target'", "'combat'", "'recruit'", "'focus_high_XP'", "'move_to_enemy'", "'capture_villages'", "'rule'", "'{'", "'}'", "'when:'", "'health'", "'-'", "'x'", "'y'", "'unit'", "'is'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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

    	public void setGrammarAccess(WesnothDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalWesnothDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:54:1: ( ruleModel EOF )
            // InternalWesnothDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalWesnothDSL.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalWesnothDSL.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalWesnothDSL.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalWesnothDSL.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalWesnothDSL.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWesnothDSL.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRule"
    // InternalWesnothDSL.g:78:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:79:1: ( ruleRule EOF )
            // InternalWesnothDSL.g:80:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalWesnothDSL.g:87:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:91:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalWesnothDSL.g:92:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalWesnothDSL.g:92:2: ( ( rule__Rule__Group__0 ) )
            // InternalWesnothDSL.g:93:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalWesnothDSL.g:94:3: ( rule__Rule__Group__0 )
            // InternalWesnothDSL.g:94:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleFragment"
    // InternalWesnothDSL.g:103:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:104:1: ( ruleFragment EOF )
            // InternalWesnothDSL.g:105:1: ruleFragment EOF
            {
             before(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getFragmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // InternalWesnothDSL.g:112:1: ruleFragment : ( ( rule__Fragment__Group__0 ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:116:2: ( ( ( rule__Fragment__Group__0 ) ) )
            // InternalWesnothDSL.g:117:2: ( ( rule__Fragment__Group__0 ) )
            {
            // InternalWesnothDSL.g:117:2: ( ( rule__Fragment__Group__0 ) )
            // InternalWesnothDSL.g:118:3: ( rule__Fragment__Group__0 )
            {
             before(grammarAccess.getFragmentAccess().getGroup()); 
            // InternalWesnothDSL.g:119:3: ( rule__Fragment__Group__0 )
            // InternalWesnothDSL.g:119:4: rule__Fragment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleConditional"
    // InternalWesnothDSL.g:128:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:129:1: ( ruleConditional EOF )
            // InternalWesnothDSL.g:130:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalWesnothDSL.g:137:1: ruleConditional : ( ( rule__Conditional__Alternatives ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:141:2: ( ( ( rule__Conditional__Alternatives ) ) )
            // InternalWesnothDSL.g:142:2: ( ( rule__Conditional__Alternatives ) )
            {
            // InternalWesnothDSL.g:142:2: ( ( rule__Conditional__Alternatives ) )
            // InternalWesnothDSL.g:143:3: ( rule__Conditional__Alternatives )
            {
             before(grammarAccess.getConditionalAccess().getAlternatives()); 
            // InternalWesnothDSL.g:144:3: ( rule__Conditional__Alternatives )
            // InternalWesnothDSL.g:144:4: rule__Conditional__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleDamage"
    // InternalWesnothDSL.g:153:1: entryRuleDamage : ruleDamage EOF ;
    public final void entryRuleDamage() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:154:1: ( ruleDamage EOF )
            // InternalWesnothDSL.g:155:1: ruleDamage EOF
            {
             before(grammarAccess.getDamageRule()); 
            pushFollow(FOLLOW_1);
            ruleDamage();

            state._fsp--;

             after(grammarAccess.getDamageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDamage"


    // $ANTLR start "ruleDamage"
    // InternalWesnothDSL.g:162:1: ruleDamage : ( ( rule__Damage__Group__0 ) ) ;
    public final void ruleDamage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:166:2: ( ( ( rule__Damage__Group__0 ) ) )
            // InternalWesnothDSL.g:167:2: ( ( rule__Damage__Group__0 ) )
            {
            // InternalWesnothDSL.g:167:2: ( ( rule__Damage__Group__0 ) )
            // InternalWesnothDSL.g:168:3: ( rule__Damage__Group__0 )
            {
             before(grammarAccess.getDamageAccess().getGroup()); 
            // InternalWesnothDSL.g:169:3: ( rule__Damage__Group__0 )
            // InternalWesnothDSL.g:169:4: rule__Damage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Damage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDamageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDamage"


    // $ANTLR start "entryRuleAtLocation"
    // InternalWesnothDSL.g:178:1: entryRuleAtLocation : ruleAtLocation EOF ;
    public final void entryRuleAtLocation() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:179:1: ( ruleAtLocation EOF )
            // InternalWesnothDSL.g:180:1: ruleAtLocation EOF
            {
             before(grammarAccess.getAtLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleAtLocation();

            state._fsp--;

             after(grammarAccess.getAtLocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtLocation"


    // $ANTLR start "ruleAtLocation"
    // InternalWesnothDSL.g:187:1: ruleAtLocation : ( ( rule__AtLocation__Group__0 ) ) ;
    public final void ruleAtLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:191:2: ( ( ( rule__AtLocation__Group__0 ) ) )
            // InternalWesnothDSL.g:192:2: ( ( rule__AtLocation__Group__0 ) )
            {
            // InternalWesnothDSL.g:192:2: ( ( rule__AtLocation__Group__0 ) )
            // InternalWesnothDSL.g:193:3: ( rule__AtLocation__Group__0 )
            {
             before(grammarAccess.getAtLocationAccess().getGroup()); 
            // InternalWesnothDSL.g:194:3: ( rule__AtLocation__Group__0 )
            // InternalWesnothDSL.g:194:4: rule__AtLocation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtLocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtLocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtLocation"


    // $ANTLR start "entryRuleUnitEquals"
    // InternalWesnothDSL.g:203:1: entryRuleUnitEquals : ruleUnitEquals EOF ;
    public final void entryRuleUnitEquals() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:204:1: ( ruleUnitEquals EOF )
            // InternalWesnothDSL.g:205:1: ruleUnitEquals EOF
            {
             before(grammarAccess.getUnitEqualsRule()); 
            pushFollow(FOLLOW_1);
            ruleUnitEquals();

            state._fsp--;

             after(grammarAccess.getUnitEqualsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnitEquals"


    // $ANTLR start "ruleUnitEquals"
    // InternalWesnothDSL.g:212:1: ruleUnitEquals : ( ( rule__UnitEquals__Group__0 ) ) ;
    public final void ruleUnitEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:216:2: ( ( ( rule__UnitEquals__Group__0 ) ) )
            // InternalWesnothDSL.g:217:2: ( ( rule__UnitEquals__Group__0 ) )
            {
            // InternalWesnothDSL.g:217:2: ( ( rule__UnitEquals__Group__0 ) )
            // InternalWesnothDSL.g:218:3: ( rule__UnitEquals__Group__0 )
            {
             before(grammarAccess.getUnitEqualsAccess().getGroup()); 
            // InternalWesnothDSL.g:219:3: ( rule__UnitEquals__Group__0 )
            // InternalWesnothDSL.g:219:4: rule__UnitEquals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnitEquals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnitEqualsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnitEquals"


    // $ANTLR start "entryRuleDefualt_CA"
    // InternalWesnothDSL.g:228:1: entryRuleDefualt_CA : ruleDefualt_CA EOF ;
    public final void entryRuleDefualt_CA() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:229:1: ( ruleDefualt_CA EOF )
            // InternalWesnothDSL.g:230:1: ruleDefualt_CA EOF
            {
             before(grammarAccess.getDefualt_CARule()); 
            pushFollow(FOLLOW_1);
            ruleDefualt_CA();

            state._fsp--;

             after(grammarAccess.getDefualt_CARule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefualt_CA"


    // $ANTLR start "ruleDefualt_CA"
    // InternalWesnothDSL.g:237:1: ruleDefualt_CA : ( ( rule__Defualt_CA__CaTypeAssignment ) ) ;
    public final void ruleDefualt_CA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:241:2: ( ( ( rule__Defualt_CA__CaTypeAssignment ) ) )
            // InternalWesnothDSL.g:242:2: ( ( rule__Defualt_CA__CaTypeAssignment ) )
            {
            // InternalWesnothDSL.g:242:2: ( ( rule__Defualt_CA__CaTypeAssignment ) )
            // InternalWesnothDSL.g:243:3: ( rule__Defualt_CA__CaTypeAssignment )
            {
             before(grammarAccess.getDefualt_CAAccess().getCaTypeAssignment()); 
            // InternalWesnothDSL.g:244:3: ( rule__Defualt_CA__CaTypeAssignment )
            // InternalWesnothDSL.g:244:4: rule__Defualt_CA__CaTypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Defualt_CA__CaTypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDefualt_CAAccess().getCaTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefualt_CA"


    // $ANTLR start "rule__Conditional__Alternatives"
    // InternalWesnothDSL.g:252:1: rule__Conditional__Alternatives : ( ( ( rule__Conditional__Group_0__0 ) ) | ( ruleDamage ) | ( ruleUnitEquals ) );
    public final void rule__Conditional__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:256:1: ( ( ( rule__Conditional__Group_0__0 ) ) | ( ruleDamage ) | ( ruleUnitEquals ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalWesnothDSL.g:257:2: ( ( rule__Conditional__Group_0__0 ) )
                    {
                    // InternalWesnothDSL.g:257:2: ( ( rule__Conditional__Group_0__0 ) )
                    // InternalWesnothDSL.g:258:3: ( rule__Conditional__Group_0__0 )
                    {
                     before(grammarAccess.getConditionalAccess().getGroup_0()); 
                    // InternalWesnothDSL.g:259:3: ( rule__Conditional__Group_0__0 )
                    // InternalWesnothDSL.g:259:4: rule__Conditional__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionalAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:263:2: ( ruleDamage )
                    {
                    // InternalWesnothDSL.g:263:2: ( ruleDamage )
                    // InternalWesnothDSL.g:264:3: ruleDamage
                    {
                     before(grammarAccess.getConditionalAccess().getDamageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDamage();

                    state._fsp--;

                     after(grammarAccess.getConditionalAccess().getDamageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWesnothDSL.g:269:2: ( ruleUnitEquals )
                    {
                    // InternalWesnothDSL.g:269:2: ( ruleUnitEquals )
                    // InternalWesnothDSL.g:270:3: ruleUnitEquals
                    {
                     before(grammarAccess.getConditionalAccess().getUnitEqualsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUnitEquals();

                    state._fsp--;

                     after(grammarAccess.getConditionalAccess().getUnitEqualsParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Alternatives"


    // $ANTLR start "rule__Defualt_CA__CaTypeAlternatives_0"
    // InternalWesnothDSL.g:279:1: rule__Defualt_CA__CaTypeAlternatives_0 : ( ( 'movement' ) | ( 'retreat' ) | ( 'move_to_target' ) | ( 'combat' ) | ( 'recruit' ) | ( 'focus_high_XP' ) | ( 'move_to_enemy' ) | ( 'capture_villages' ) );
    public final void rule__Defualt_CA__CaTypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:283:1: ( ( 'movement' ) | ( 'retreat' ) | ( 'move_to_target' ) | ( 'combat' ) | ( 'recruit' ) | ( 'focus_high_XP' ) | ( 'move_to_enemy' ) | ( 'capture_villages' ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
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
                    // InternalWesnothDSL.g:284:2: ( 'movement' )
                    {
                    // InternalWesnothDSL.g:284:2: ( 'movement' )
                    // InternalWesnothDSL.g:285:3: 'movement'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:290:2: ( 'retreat' )
                    {
                    // InternalWesnothDSL.g:290:2: ( 'retreat' )
                    // InternalWesnothDSL.g:291:3: 'retreat'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWesnothDSL.g:296:2: ( 'move_to_target' )
                    {
                    // InternalWesnothDSL.g:296:2: ( 'move_to_target' )
                    // InternalWesnothDSL.g:297:3: 'move_to_target'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWesnothDSL.g:302:2: ( 'combat' )
                    {
                    // InternalWesnothDSL.g:302:2: ( 'combat' )
                    // InternalWesnothDSL.g:303:3: 'combat'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWesnothDSL.g:308:2: ( 'recruit' )
                    {
                    // InternalWesnothDSL.g:308:2: ( 'recruit' )
                    // InternalWesnothDSL.g:309:3: 'recruit'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWesnothDSL.g:314:2: ( 'focus_high_XP' )
                    {
                    // InternalWesnothDSL.g:314:2: ( 'focus_high_XP' )
                    // InternalWesnothDSL.g:315:3: 'focus_high_XP'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeFocus_high_XPKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeFocus_high_XPKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalWesnothDSL.g:320:2: ( 'move_to_enemy' )
                    {
                    // InternalWesnothDSL.g:320:2: ( 'move_to_enemy' )
                    // InternalWesnothDSL.g:321:3: 'move_to_enemy'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_enemyKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_enemyKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalWesnothDSL.g:326:2: ( 'capture_villages' )
                    {
                    // InternalWesnothDSL.g:326:2: ( 'capture_villages' )
                    // InternalWesnothDSL.g:327:3: 'capture_villages'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defualt_CA__CaTypeAlternatives_0"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalWesnothDSL.g:336:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:340:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalWesnothDSL.g:341:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalWesnothDSL.g:348:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:352:1: ( ( 'rule' ) )
            // InternalWesnothDSL.g:353:1: ( 'rule' )
            {
            // InternalWesnothDSL.g:353:1: ( 'rule' )
            // InternalWesnothDSL.g:354:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalWesnothDSL.g:363:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:367:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalWesnothDSL.g:368:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalWesnothDSL.g:375:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:379:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalWesnothDSL.g:380:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalWesnothDSL.g:380:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalWesnothDSL.g:381:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalWesnothDSL.g:382:2: ( rule__Rule__NameAssignment_1 )
            // InternalWesnothDSL.g:382:3: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalWesnothDSL.g:390:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:394:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalWesnothDSL.g:395:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalWesnothDSL.g:402:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:406:1: ( ( '{' ) )
            // InternalWesnothDSL.g:407:1: ( '{' )
            {
            // InternalWesnothDSL.g:407:1: ( '{' )
            // InternalWesnothDSL.g:408:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalWesnothDSL.g:417:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:421:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalWesnothDSL.g:422:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalWesnothDSL.g:429:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__FragmentsAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:433:1: ( ( ( rule__Rule__FragmentsAssignment_3 ) ) )
            // InternalWesnothDSL.g:434:1: ( ( rule__Rule__FragmentsAssignment_3 ) )
            {
            // InternalWesnothDSL.g:434:1: ( ( rule__Rule__FragmentsAssignment_3 ) )
            // InternalWesnothDSL.g:435:2: ( rule__Rule__FragmentsAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getFragmentsAssignment_3()); 
            // InternalWesnothDSL.g:436:2: ( rule__Rule__FragmentsAssignment_3 )
            // InternalWesnothDSL.g:436:3: rule__Rule__FragmentsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__FragmentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getFragmentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalWesnothDSL.g:444:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:448:1: ( rule__Rule__Group__4__Impl )
            // InternalWesnothDSL.g:449:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalWesnothDSL.g:455:1: rule__Rule__Group__4__Impl : ( '}' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:459:1: ( ( '}' ) )
            // InternalWesnothDSL.g:460:1: ( '}' )
            {
            // InternalWesnothDSL.g:460:1: ( '}' )
            // InternalWesnothDSL.g:461:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Fragment__Group__0"
    // InternalWesnothDSL.g:471:1: rule__Fragment__Group__0 : rule__Fragment__Group__0__Impl rule__Fragment__Group__1 ;
    public final void rule__Fragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:475:1: ( rule__Fragment__Group__0__Impl rule__Fragment__Group__1 )
            // InternalWesnothDSL.g:476:2: rule__Fragment__Group__0__Impl rule__Fragment__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Fragment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__0"


    // $ANTLR start "rule__Fragment__Group__0__Impl"
    // InternalWesnothDSL.g:483:1: rule__Fragment__Group__0__Impl : ( ( rule__Fragment__ConditionAssignment_0 ) ) ;
    public final void rule__Fragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:487:1: ( ( ( rule__Fragment__ConditionAssignment_0 ) ) )
            // InternalWesnothDSL.g:488:1: ( ( rule__Fragment__ConditionAssignment_0 ) )
            {
            // InternalWesnothDSL.g:488:1: ( ( rule__Fragment__ConditionAssignment_0 ) )
            // InternalWesnothDSL.g:489:2: ( rule__Fragment__ConditionAssignment_0 )
            {
             before(grammarAccess.getFragmentAccess().getConditionAssignment_0()); 
            // InternalWesnothDSL.g:490:2: ( rule__Fragment__ConditionAssignment_0 )
            // InternalWesnothDSL.g:490:3: rule__Fragment__ConditionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__ConditionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getConditionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__0__Impl"


    // $ANTLR start "rule__Fragment__Group__1"
    // InternalWesnothDSL.g:498:1: rule__Fragment__Group__1 : rule__Fragment__Group__1__Impl rule__Fragment__Group__2 ;
    public final void rule__Fragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:502:1: ( rule__Fragment__Group__1__Impl rule__Fragment__Group__2 )
            // InternalWesnothDSL.g:503:2: rule__Fragment__Group__1__Impl rule__Fragment__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Fragment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__1"


    // $ANTLR start "rule__Fragment__Group__1__Impl"
    // InternalWesnothDSL.g:510:1: rule__Fragment__Group__1__Impl : ( '{' ) ;
    public final void rule__Fragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:514:1: ( ( '{' ) )
            // InternalWesnothDSL.g:515:1: ( '{' )
            {
            // InternalWesnothDSL.g:515:1: ( '{' )
            // InternalWesnothDSL.g:516:2: '{'
            {
             before(grammarAccess.getFragmentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__1__Impl"


    // $ANTLR start "rule__Fragment__Group__2"
    // InternalWesnothDSL.g:525:1: rule__Fragment__Group__2 : rule__Fragment__Group__2__Impl rule__Fragment__Group__3 ;
    public final void rule__Fragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:529:1: ( rule__Fragment__Group__2__Impl rule__Fragment__Group__3 )
            // InternalWesnothDSL.g:530:2: rule__Fragment__Group__2__Impl rule__Fragment__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Fragment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__2"


    // $ANTLR start "rule__Fragment__Group__2__Impl"
    // InternalWesnothDSL.g:537:1: rule__Fragment__Group__2__Impl : ( ( rule__Fragment__Defualt_casAssignment_2 )* ) ;
    public final void rule__Fragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:541:1: ( ( ( rule__Fragment__Defualt_casAssignment_2 )* ) )
            // InternalWesnothDSL.g:542:1: ( ( rule__Fragment__Defualt_casAssignment_2 )* )
            {
            // InternalWesnothDSL.g:542:1: ( ( rule__Fragment__Defualt_casAssignment_2 )* )
            // InternalWesnothDSL.g:543:2: ( rule__Fragment__Defualt_casAssignment_2 )*
            {
             before(grammarAccess.getFragmentAccess().getDefualt_casAssignment_2()); 
            // InternalWesnothDSL.g:544:2: ( rule__Fragment__Defualt_casAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=18)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWesnothDSL.g:544:3: rule__Fragment__Defualt_casAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Fragment__Defualt_casAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFragmentAccess().getDefualt_casAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__2__Impl"


    // $ANTLR start "rule__Fragment__Group__3"
    // InternalWesnothDSL.g:552:1: rule__Fragment__Group__3 : rule__Fragment__Group__3__Impl ;
    public final void rule__Fragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:556:1: ( rule__Fragment__Group__3__Impl )
            // InternalWesnothDSL.g:557:2: rule__Fragment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__3"


    // $ANTLR start "rule__Fragment__Group__3__Impl"
    // InternalWesnothDSL.g:563:1: rule__Fragment__Group__3__Impl : ( '}' ) ;
    public final void rule__Fragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:567:1: ( ( '}' ) )
            // InternalWesnothDSL.g:568:1: ( '}' )
            {
            // InternalWesnothDSL.g:568:1: ( '}' )
            // InternalWesnothDSL.g:569:2: '}'
            {
             before(grammarAccess.getFragmentAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__3__Impl"


    // $ANTLR start "rule__Conditional__Group_0__0"
    // InternalWesnothDSL.g:579:1: rule__Conditional__Group_0__0 : rule__Conditional__Group_0__0__Impl rule__Conditional__Group_0__1 ;
    public final void rule__Conditional__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:583:1: ( rule__Conditional__Group_0__0__Impl rule__Conditional__Group_0__1 )
            // InternalWesnothDSL.g:584:2: rule__Conditional__Group_0__0__Impl rule__Conditional__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Conditional__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_0__0"


    // $ANTLR start "rule__Conditional__Group_0__0__Impl"
    // InternalWesnothDSL.g:591:1: rule__Conditional__Group_0__0__Impl : ( 'when:' ) ;
    public final void rule__Conditional__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:595:1: ( ( 'when:' ) )
            // InternalWesnothDSL.g:596:1: ( 'when:' )
            {
            // InternalWesnothDSL.g:596:1: ( 'when:' )
            // InternalWesnothDSL.g:597:2: 'when:'
            {
             before(grammarAccess.getConditionalAccess().getWhenKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getWhenKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_0__0__Impl"


    // $ANTLR start "rule__Conditional__Group_0__1"
    // InternalWesnothDSL.g:606:1: rule__Conditional__Group_0__1 : rule__Conditional__Group_0__1__Impl ;
    public final void rule__Conditional__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:610:1: ( rule__Conditional__Group_0__1__Impl )
            // InternalWesnothDSL.g:611:2: rule__Conditional__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_0__1"


    // $ANTLR start "rule__Conditional__Group_0__1__Impl"
    // InternalWesnothDSL.g:617:1: rule__Conditional__Group_0__1__Impl : ( ( rule__Conditional__ConditionAssignment_0_1 ) ) ;
    public final void rule__Conditional__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:621:1: ( ( ( rule__Conditional__ConditionAssignment_0_1 ) ) )
            // InternalWesnothDSL.g:622:1: ( ( rule__Conditional__ConditionAssignment_0_1 ) )
            {
            // InternalWesnothDSL.g:622:1: ( ( rule__Conditional__ConditionAssignment_0_1 ) )
            // InternalWesnothDSL.g:623:2: ( rule__Conditional__ConditionAssignment_0_1 )
            {
             before(grammarAccess.getConditionalAccess().getConditionAssignment_0_1()); 
            // InternalWesnothDSL.g:624:2: ( rule__Conditional__ConditionAssignment_0_1 )
            // InternalWesnothDSL.g:624:3: rule__Conditional__ConditionAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__ConditionAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getConditionAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_0__1__Impl"


    // $ANTLR start "rule__Damage__Group__0"
    // InternalWesnothDSL.g:633:1: rule__Damage__Group__0 : rule__Damage__Group__0__Impl rule__Damage__Group__1 ;
    public final void rule__Damage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:637:1: ( rule__Damage__Group__0__Impl rule__Damage__Group__1 )
            // InternalWesnothDSL.g:638:2: rule__Damage__Group__0__Impl rule__Damage__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Damage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Damage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Damage__Group__0"


    // $ANTLR start "rule__Damage__Group__0__Impl"
    // InternalWesnothDSL.g:645:1: rule__Damage__Group__0__Impl : ( 'health' ) ;
    public final void rule__Damage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:649:1: ( ( 'health' ) )
            // InternalWesnothDSL.g:650:1: ( 'health' )
            {
            // InternalWesnothDSL.g:650:1: ( 'health' )
            // InternalWesnothDSL.g:651:2: 'health'
            {
             before(grammarAccess.getDamageAccess().getHealthKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDamageAccess().getHealthKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Damage__Group__0__Impl"


    // $ANTLR start "rule__Damage__Group__1"
    // InternalWesnothDSL.g:660:1: rule__Damage__Group__1 : rule__Damage__Group__1__Impl rule__Damage__Group__2 ;
    public final void rule__Damage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:664:1: ( rule__Damage__Group__1__Impl rule__Damage__Group__2 )
            // InternalWesnothDSL.g:665:2: rule__Damage__Group__1__Impl rule__Damage__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Damage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Damage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Damage__Group__1"


    // $ANTLR start "rule__Damage__Group__1__Impl"
    // InternalWesnothDSL.g:672:1: rule__Damage__Group__1__Impl : ( '-' ) ;
    public final void rule__Damage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:676:1: ( ( '-' ) )
            // InternalWesnothDSL.g:677:1: ( '-' )
            {
            // InternalWesnothDSL.g:677:1: ( '-' )
            // InternalWesnothDSL.g:678:2: '-'
            {
             before(grammarAccess.getDamageAccess().getHyphenMinusKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDamageAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Damage__Group__1__Impl"


    // $ANTLR start "rule__Damage__Group__2"
    // InternalWesnothDSL.g:687:1: rule__Damage__Group__2 : rule__Damage__Group__2__Impl ;
    public final void rule__Damage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:691:1: ( rule__Damage__Group__2__Impl )
            // InternalWesnothDSL.g:692:2: rule__Damage__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Damage__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Damage__Group__2"


    // $ANTLR start "rule__Damage__Group__2__Impl"
    // InternalWesnothDSL.g:698:1: rule__Damage__Group__2__Impl : ( ( rule__Damage__HealthAssignment_2 ) ) ;
    public final void rule__Damage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:702:1: ( ( ( rule__Damage__HealthAssignment_2 ) ) )
            // InternalWesnothDSL.g:703:1: ( ( rule__Damage__HealthAssignment_2 ) )
            {
            // InternalWesnothDSL.g:703:1: ( ( rule__Damage__HealthAssignment_2 ) )
            // InternalWesnothDSL.g:704:2: ( rule__Damage__HealthAssignment_2 )
            {
             before(grammarAccess.getDamageAccess().getHealthAssignment_2()); 
            // InternalWesnothDSL.g:705:2: ( rule__Damage__HealthAssignment_2 )
            // InternalWesnothDSL.g:705:3: rule__Damage__HealthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Damage__HealthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDamageAccess().getHealthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Damage__Group__2__Impl"


    // $ANTLR start "rule__AtLocation__Group__0"
    // InternalWesnothDSL.g:714:1: rule__AtLocation__Group__0 : rule__AtLocation__Group__0__Impl rule__AtLocation__Group__1 ;
    public final void rule__AtLocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:718:1: ( rule__AtLocation__Group__0__Impl rule__AtLocation__Group__1 )
            // InternalWesnothDSL.g:719:2: rule__AtLocation__Group__0__Impl rule__AtLocation__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AtLocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtLocation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtLocation__Group__0"


    // $ANTLR start "rule__AtLocation__Group__0__Impl"
    // InternalWesnothDSL.g:726:1: rule__AtLocation__Group__0__Impl : ( 'x' ) ;
    public final void rule__AtLocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:730:1: ( ( 'x' ) )
            // InternalWesnothDSL.g:731:1: ( 'x' )
            {
            // InternalWesnothDSL.g:731:1: ( 'x' )
            // InternalWesnothDSL.g:732:2: 'x'
            {
             before(grammarAccess.getAtLocationAccess().getXKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAtLocationAccess().getXKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtLocation__Group__0__Impl"


    // $ANTLR start "rule__AtLocation__Group__1"
    // InternalWesnothDSL.g:741:1: rule__AtLocation__Group__1 : rule__AtLocation__Group__1__Impl rule__AtLocation__Group__2 ;
    public final void rule__AtLocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:745:1: ( rule__AtLocation__Group__1__Impl rule__AtLocation__Group__2 )
            // InternalWesnothDSL.g:746:2: rule__AtLocation__Group__1__Impl rule__AtLocation__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AtLocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtLocation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtLocation__Group__1"


    // $ANTLR start "rule__AtLocation__Group__1__Impl"
    // InternalWesnothDSL.g:753:1: rule__AtLocation__Group__1__Impl : ( ( rule__AtLocation__XAssignment_1 ) ) ;
    public final void rule__AtLocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:757:1: ( ( ( rule__AtLocation__XAssignment_1 ) ) )
            // InternalWesnothDSL.g:758:1: ( ( rule__AtLocation__XAssignment_1 ) )
            {
            // InternalWesnothDSL.g:758:1: ( ( rule__AtLocation__XAssignment_1 ) )
            // InternalWesnothDSL.g:759:2: ( rule__AtLocation__XAssignment_1 )
            {
             before(grammarAccess.getAtLocationAccess().getXAssignment_1()); 
            // InternalWesnothDSL.g:760:2: ( rule__AtLocation__XAssignment_1 )
            // InternalWesnothDSL.g:760:3: rule__AtLocation__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtLocation__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtLocationAccess().getXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtLocation__Group__1__Impl"


    // $ANTLR start "rule__AtLocation__Group__2"
    // InternalWesnothDSL.g:768:1: rule__AtLocation__Group__2 : rule__AtLocation__Group__2__Impl rule__AtLocation__Group__3 ;
    public final void rule__AtLocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:772:1: ( rule__AtLocation__Group__2__Impl rule__AtLocation__Group__3 )
            // InternalWesnothDSL.g:773:2: rule__AtLocation__Group__2__Impl rule__AtLocation__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__AtLocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtLocation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtLocation__Group__2"


    // $ANTLR start "rule__AtLocation__Group__2__Impl"
    // InternalWesnothDSL.g:780:1: rule__AtLocation__Group__2__Impl : ( 'y' ) ;
    public final void rule__AtLocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:784:1: ( ( 'y' ) )
            // InternalWesnothDSL.g:785:1: ( 'y' )
            {
            // InternalWesnothDSL.g:785:1: ( 'y' )
            // InternalWesnothDSL.g:786:2: 'y'
            {
             before(grammarAccess.getAtLocationAccess().getYKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAtLocationAccess().getYKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtLocation__Group__2__Impl"


    // $ANTLR start "rule__AtLocation__Group__3"
    // InternalWesnothDSL.g:795:1: rule__AtLocation__Group__3 : rule__AtLocation__Group__3__Impl ;
    public final void rule__AtLocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:799:1: ( rule__AtLocation__Group__3__Impl )
            // InternalWesnothDSL.g:800:2: rule__AtLocation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtLocation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtLocation__Group__3"


    // $ANTLR start "rule__AtLocation__Group__3__Impl"
    // InternalWesnothDSL.g:806:1: rule__AtLocation__Group__3__Impl : ( ( rule__AtLocation__YAssignment_3 ) ) ;
    public final void rule__AtLocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:810:1: ( ( ( rule__AtLocation__YAssignment_3 ) ) )
            // InternalWesnothDSL.g:811:1: ( ( rule__AtLocation__YAssignment_3 ) )
            {
            // InternalWesnothDSL.g:811:1: ( ( rule__AtLocation__YAssignment_3 ) )
            // InternalWesnothDSL.g:812:2: ( rule__AtLocation__YAssignment_3 )
            {
             before(grammarAccess.getAtLocationAccess().getYAssignment_3()); 
            // InternalWesnothDSL.g:813:2: ( rule__AtLocation__YAssignment_3 )
            // InternalWesnothDSL.g:813:3: rule__AtLocation__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AtLocation__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtLocationAccess().getYAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtLocation__Group__3__Impl"


    // $ANTLR start "rule__UnitEquals__Group__0"
    // InternalWesnothDSL.g:822:1: rule__UnitEquals__Group__0 : rule__UnitEquals__Group__0__Impl rule__UnitEquals__Group__1 ;
    public final void rule__UnitEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:826:1: ( rule__UnitEquals__Group__0__Impl rule__UnitEquals__Group__1 )
            // InternalWesnothDSL.g:827:2: rule__UnitEquals__Group__0__Impl rule__UnitEquals__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__UnitEquals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitEquals__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitEquals__Group__0"


    // $ANTLR start "rule__UnitEquals__Group__0__Impl"
    // InternalWesnothDSL.g:834:1: rule__UnitEquals__Group__0__Impl : ( 'unit' ) ;
    public final void rule__UnitEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:838:1: ( ( 'unit' ) )
            // InternalWesnothDSL.g:839:1: ( 'unit' )
            {
            // InternalWesnothDSL.g:839:1: ( 'unit' )
            // InternalWesnothDSL.g:840:2: 'unit'
            {
             before(grammarAccess.getUnitEqualsAccess().getUnitKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUnitEqualsAccess().getUnitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitEquals__Group__0__Impl"


    // $ANTLR start "rule__UnitEquals__Group__1"
    // InternalWesnothDSL.g:849:1: rule__UnitEquals__Group__1 : rule__UnitEquals__Group__1__Impl rule__UnitEquals__Group__2 ;
    public final void rule__UnitEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:853:1: ( rule__UnitEquals__Group__1__Impl rule__UnitEquals__Group__2 )
            // InternalWesnothDSL.g:854:2: rule__UnitEquals__Group__1__Impl rule__UnitEquals__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UnitEquals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitEquals__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitEquals__Group__1"


    // $ANTLR start "rule__UnitEquals__Group__1__Impl"
    // InternalWesnothDSL.g:861:1: rule__UnitEquals__Group__1__Impl : ( 'is' ) ;
    public final void rule__UnitEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:865:1: ( ( 'is' ) )
            // InternalWesnothDSL.g:866:1: ( 'is' )
            {
            // InternalWesnothDSL.g:866:1: ( 'is' )
            // InternalWesnothDSL.g:867:2: 'is'
            {
             before(grammarAccess.getUnitEqualsAccess().getIsKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUnitEqualsAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitEquals__Group__1__Impl"


    // $ANTLR start "rule__UnitEquals__Group__2"
    // InternalWesnothDSL.g:876:1: rule__UnitEquals__Group__2 : rule__UnitEquals__Group__2__Impl ;
    public final void rule__UnitEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:880:1: ( rule__UnitEquals__Group__2__Impl )
            // InternalWesnothDSL.g:881:2: rule__UnitEquals__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnitEquals__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitEquals__Group__2"


    // $ANTLR start "rule__UnitEquals__Group__2__Impl"
    // InternalWesnothDSL.g:887:1: rule__UnitEquals__Group__2__Impl : ( ( rule__UnitEquals__UnitAssignment_2 ) ) ;
    public final void rule__UnitEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:891:1: ( ( ( rule__UnitEquals__UnitAssignment_2 ) ) )
            // InternalWesnothDSL.g:892:1: ( ( rule__UnitEquals__UnitAssignment_2 ) )
            {
            // InternalWesnothDSL.g:892:1: ( ( rule__UnitEquals__UnitAssignment_2 ) )
            // InternalWesnothDSL.g:893:2: ( rule__UnitEquals__UnitAssignment_2 )
            {
             before(grammarAccess.getUnitEqualsAccess().getUnitAssignment_2()); 
            // InternalWesnothDSL.g:894:2: ( rule__UnitEquals__UnitAssignment_2 )
            // InternalWesnothDSL.g:894:3: rule__UnitEquals__UnitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UnitEquals__UnitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnitEqualsAccess().getUnitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitEquals__Group__2__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalWesnothDSL.g:903:1: rule__Model__ElementsAssignment : ( ruleRule ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:907:1: ( ( ruleRule ) )
            // InternalWesnothDSL.g:908:2: ( ruleRule )
            {
            // InternalWesnothDSL.g:908:2: ( ruleRule )
            // InternalWesnothDSL.g:909:3: ruleRule
            {
             before(grammarAccess.getModelAccess().getElementsRuleParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsRuleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalWesnothDSL.g:918:1: rule__Rule__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:922:1: ( ( RULE_STRING ) )
            // InternalWesnothDSL.g:923:2: ( RULE_STRING )
            {
            // InternalWesnothDSL.g:923:2: ( RULE_STRING )
            // InternalWesnothDSL.g:924:3: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__FragmentsAssignment_3"
    // InternalWesnothDSL.g:933:1: rule__Rule__FragmentsAssignment_3 : ( ruleFragment ) ;
    public final void rule__Rule__FragmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:937:1: ( ( ruleFragment ) )
            // InternalWesnothDSL.g:938:2: ( ruleFragment )
            {
            // InternalWesnothDSL.g:938:2: ( ruleFragment )
            // InternalWesnothDSL.g:939:3: ruleFragment
            {
             before(grammarAccess.getRuleAccess().getFragmentsFragmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getFragmentsFragmentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__FragmentsAssignment_3"


    // $ANTLR start "rule__Fragment__ConditionAssignment_0"
    // InternalWesnothDSL.g:948:1: rule__Fragment__ConditionAssignment_0 : ( ruleConditional ) ;
    public final void rule__Fragment__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:952:1: ( ( ruleConditional ) )
            // InternalWesnothDSL.g:953:2: ( ruleConditional )
            {
            // InternalWesnothDSL.g:953:2: ( ruleConditional )
            // InternalWesnothDSL.g:954:3: ruleConditional
            {
             before(grammarAccess.getFragmentAccess().getConditionConditionalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getFragmentAccess().getConditionConditionalParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__ConditionAssignment_0"


    // $ANTLR start "rule__Fragment__Defualt_casAssignment_2"
    // InternalWesnothDSL.g:963:1: rule__Fragment__Defualt_casAssignment_2 : ( ruleDefualt_CA ) ;
    public final void rule__Fragment__Defualt_casAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:967:1: ( ( ruleDefualt_CA ) )
            // InternalWesnothDSL.g:968:2: ( ruleDefualt_CA )
            {
            // InternalWesnothDSL.g:968:2: ( ruleDefualt_CA )
            // InternalWesnothDSL.g:969:3: ruleDefualt_CA
            {
             before(grammarAccess.getFragmentAccess().getDefualt_casDefualt_CAParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDefualt_CA();

            state._fsp--;

             after(grammarAccess.getFragmentAccess().getDefualt_casDefualt_CAParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Defualt_casAssignment_2"


    // $ANTLR start "rule__Conditional__ConditionAssignment_0_1"
    // InternalWesnothDSL.g:978:1: rule__Conditional__ConditionAssignment_0_1 : ( ruleAtLocation ) ;
    public final void rule__Conditional__ConditionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:982:1: ( ( ruleAtLocation ) )
            // InternalWesnothDSL.g:983:2: ( ruleAtLocation )
            {
            // InternalWesnothDSL.g:983:2: ( ruleAtLocation )
            // InternalWesnothDSL.g:984:3: ruleAtLocation
            {
             before(grammarAccess.getConditionalAccess().getConditionAtLocationParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtLocation();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getConditionAtLocationParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__ConditionAssignment_0_1"


    // $ANTLR start "rule__Damage__HealthAssignment_2"
    // InternalWesnothDSL.g:993:1: rule__Damage__HealthAssignment_2 : ( RULE_INT ) ;
    public final void rule__Damage__HealthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:997:1: ( ( RULE_INT ) )
            // InternalWesnothDSL.g:998:2: ( RULE_INT )
            {
            // InternalWesnothDSL.g:998:2: ( RULE_INT )
            // InternalWesnothDSL.g:999:3: RULE_INT
            {
             before(grammarAccess.getDamageAccess().getHealthINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDamageAccess().getHealthINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Damage__HealthAssignment_2"


    // $ANTLR start "rule__AtLocation__XAssignment_1"
    // InternalWesnothDSL.g:1008:1: rule__AtLocation__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__AtLocation__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1012:1: ( ( RULE_INT ) )
            // InternalWesnothDSL.g:1013:2: ( RULE_INT )
            {
            // InternalWesnothDSL.g:1013:2: ( RULE_INT )
            // InternalWesnothDSL.g:1014:3: RULE_INT
            {
             before(grammarAccess.getAtLocationAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtLocationAccess().getXINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtLocation__XAssignment_1"


    // $ANTLR start "rule__AtLocation__YAssignment_3"
    // InternalWesnothDSL.g:1023:1: rule__AtLocation__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__AtLocation__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1027:1: ( ( RULE_INT ) )
            // InternalWesnothDSL.g:1028:2: ( RULE_INT )
            {
            // InternalWesnothDSL.g:1028:2: ( RULE_INT )
            // InternalWesnothDSL.g:1029:3: RULE_INT
            {
             before(grammarAccess.getAtLocationAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtLocationAccess().getYINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtLocation__YAssignment_3"


    // $ANTLR start "rule__UnitEquals__UnitAssignment_2"
    // InternalWesnothDSL.g:1038:1: rule__UnitEquals__UnitAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UnitEquals__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1042:1: ( ( RULE_STRING ) )
            // InternalWesnothDSL.g:1043:2: ( RULE_STRING )
            {
            // InternalWesnothDSL.g:1043:2: ( RULE_STRING )
            // InternalWesnothDSL.g:1044:3: RULE_STRING
            {
             before(grammarAccess.getUnitEqualsAccess().getUnitSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUnitEqualsAccess().getUnitSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitEquals__UnitAssignment_2"


    // $ANTLR start "rule__Defualt_CA__CaTypeAssignment"
    // InternalWesnothDSL.g:1053:1: rule__Defualt_CA__CaTypeAssignment : ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) ) ;
    public final void rule__Defualt_CA__CaTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1057:1: ( ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) ) )
            // InternalWesnothDSL.g:1058:2: ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) )
            {
            // InternalWesnothDSL.g:1058:2: ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) )
            // InternalWesnothDSL.g:1059:3: ( rule__Defualt_CA__CaTypeAlternatives_0 )
            {
             before(grammarAccess.getDefualt_CAAccess().getCaTypeAlternatives_0()); 
            // InternalWesnothDSL.g:1060:3: ( rule__Defualt_CA__CaTypeAlternatives_0 )
            // InternalWesnothDSL.g:1060:4: rule__Defualt_CA__CaTypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Defualt_CA__CaTypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDefualt_CAAccess().getCaTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defualt_CA__CaTypeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008C00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000027F800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000007F802L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});

}