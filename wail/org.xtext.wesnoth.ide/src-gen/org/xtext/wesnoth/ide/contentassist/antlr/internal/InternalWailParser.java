package org.xtext.wesnoth.ide.contentassist.antlr.internal;

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
import org.xtext.wesnoth.services.WailGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWailParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'movement'", "'heal'", "'retreat'", "'move_to_targets'", "'basic_movement'", "'combat'", "'recruit'", "'combat_value_targets'", "'capture_villages'", "'leader_to_keep'", "'rule'", "'{'", "'}'", "'when:'", "'health'", "'-'", "'x:'", "'y:'", "'unit'", "'is'", "'goal'", "'value'", "'x'", "'y'", "'always'"
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


        public InternalWailParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWailParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWailParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWail.g"; }


    	private WailGrammarAccess grammarAccess;

    	public void setGrammarAccess(WailGrammarAccess grammarAccess) {
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
    // InternalWail.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalWail.g:54:1: ( ruleModel EOF )
            // InternalWail.g:55:1: ruleModel EOF
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
    // InternalWail.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalWail.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalWail.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalWail.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalWail.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWail.g:69:4: rule__Model__ElementsAssignment
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
    // InternalWail.g:78:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalWail.g:79:1: ( ruleRule EOF )
            // InternalWail.g:80:1: ruleRule EOF
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
    // InternalWail.g:87:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:91:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalWail.g:92:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalWail.g:92:2: ( ( rule__Rule__Group__0 ) )
            // InternalWail.g:93:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalWail.g:94:3: ( rule__Rule__Group__0 )
            // InternalWail.g:94:4: rule__Rule__Group__0
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
    // InternalWail.g:103:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // InternalWail.g:104:1: ( ruleFragment EOF )
            // InternalWail.g:105:1: ruleFragment EOF
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
    // InternalWail.g:112:1: ruleFragment : ( ( rule__Fragment__Group__0 ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:116:2: ( ( ( rule__Fragment__Group__0 ) ) )
            // InternalWail.g:117:2: ( ( rule__Fragment__Group__0 ) )
            {
            // InternalWail.g:117:2: ( ( rule__Fragment__Group__0 ) )
            // InternalWail.g:118:3: ( rule__Fragment__Group__0 )
            {
             before(grammarAccess.getFragmentAccess().getGroup()); 
            // InternalWail.g:119:3: ( rule__Fragment__Group__0 )
            // InternalWail.g:119:4: rule__Fragment__Group__0
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
    // InternalWail.g:128:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalWail.g:129:1: ( ruleConditional EOF )
            // InternalWail.g:130:1: ruleConditional EOF
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
    // InternalWail.g:137:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:141:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // InternalWail.g:142:2: ( ( rule__Conditional__Group__0 ) )
            {
            // InternalWail.g:142:2: ( ( rule__Conditional__Group__0 ) )
            // InternalWail.g:143:3: ( rule__Conditional__Group__0 )
            {
             before(grammarAccess.getConditionalAccess().getGroup()); 
            // InternalWail.g:144:3: ( rule__Conditional__Group__0 )
            // InternalWail.g:144:4: rule__Conditional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getGroup()); 

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


    // $ANTLR start "entryRulewhenRules"
    // InternalWail.g:153:1: entryRulewhenRules : rulewhenRules EOF ;
    public final void entryRulewhenRules() throws RecognitionException {
        try {
            // InternalWail.g:154:1: ( rulewhenRules EOF )
            // InternalWail.g:155:1: rulewhenRules EOF
            {
             before(grammarAccess.getWhenRulesRule()); 
            pushFollow(FOLLOW_1);
            rulewhenRules();

            state._fsp--;

             after(grammarAccess.getWhenRulesRule()); 
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
    // $ANTLR end "entryRulewhenRules"


    // $ANTLR start "rulewhenRules"
    // InternalWail.g:162:1: rulewhenRules : ( ( rule__WhenRules__Alternatives ) ) ;
    public final void rulewhenRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:166:2: ( ( ( rule__WhenRules__Alternatives ) ) )
            // InternalWail.g:167:2: ( ( rule__WhenRules__Alternatives ) )
            {
            // InternalWail.g:167:2: ( ( rule__WhenRules__Alternatives ) )
            // InternalWail.g:168:3: ( rule__WhenRules__Alternatives )
            {
             before(grammarAccess.getWhenRulesAccess().getAlternatives()); 
            // InternalWail.g:169:3: ( rule__WhenRules__Alternatives )
            // InternalWail.g:169:4: rule__WhenRules__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WhenRules__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWhenRulesAccess().getAlternatives()); 

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
    // $ANTLR end "rulewhenRules"


    // $ANTLR start "entryRuleBaseline"
    // InternalWail.g:178:1: entryRuleBaseline : ruleBaseline EOF ;
    public final void entryRuleBaseline() throws RecognitionException {
        try {
            // InternalWail.g:179:1: ( ruleBaseline EOF )
            // InternalWail.g:180:1: ruleBaseline EOF
            {
             before(grammarAccess.getBaselineRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseline();

            state._fsp--;

             after(grammarAccess.getBaselineRule()); 
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
    // $ANTLR end "entryRuleBaseline"


    // $ANTLR start "ruleBaseline"
    // InternalWail.g:187:1: ruleBaseline : ( ( rule__Baseline__AlwaysAssignment ) ) ;
    public final void ruleBaseline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:191:2: ( ( ( rule__Baseline__AlwaysAssignment ) ) )
            // InternalWail.g:192:2: ( ( rule__Baseline__AlwaysAssignment ) )
            {
            // InternalWail.g:192:2: ( ( rule__Baseline__AlwaysAssignment ) )
            // InternalWail.g:193:3: ( rule__Baseline__AlwaysAssignment )
            {
             before(grammarAccess.getBaselineAccess().getAlwaysAssignment()); 
            // InternalWail.g:194:3: ( rule__Baseline__AlwaysAssignment )
            // InternalWail.g:194:4: rule__Baseline__AlwaysAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Baseline__AlwaysAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBaselineAccess().getAlwaysAssignment()); 

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
    // $ANTLR end "ruleBaseline"


    // $ANTLR start "entryRuleDamage"
    // InternalWail.g:203:1: entryRuleDamage : ruleDamage EOF ;
    public final void entryRuleDamage() throws RecognitionException {
        try {
            // InternalWail.g:204:1: ( ruleDamage EOF )
            // InternalWail.g:205:1: ruleDamage EOF
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
    // InternalWail.g:212:1: ruleDamage : ( ( rule__Damage__Group__0 ) ) ;
    public final void ruleDamage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:216:2: ( ( ( rule__Damage__Group__0 ) ) )
            // InternalWail.g:217:2: ( ( rule__Damage__Group__0 ) )
            {
            // InternalWail.g:217:2: ( ( rule__Damage__Group__0 ) )
            // InternalWail.g:218:3: ( rule__Damage__Group__0 )
            {
             before(grammarAccess.getDamageAccess().getGroup()); 
            // InternalWail.g:219:3: ( rule__Damage__Group__0 )
            // InternalWail.g:219:4: rule__Damage__Group__0
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
    // InternalWail.g:228:1: entryRuleAtLocation : ruleAtLocation EOF ;
    public final void entryRuleAtLocation() throws RecognitionException {
        try {
            // InternalWail.g:229:1: ( ruleAtLocation EOF )
            // InternalWail.g:230:1: ruleAtLocation EOF
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
    // InternalWail.g:237:1: ruleAtLocation : ( ( rule__AtLocation__Group__0 ) ) ;
    public final void ruleAtLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:241:2: ( ( ( rule__AtLocation__Group__0 ) ) )
            // InternalWail.g:242:2: ( ( rule__AtLocation__Group__0 ) )
            {
            // InternalWail.g:242:2: ( ( rule__AtLocation__Group__0 ) )
            // InternalWail.g:243:3: ( rule__AtLocation__Group__0 )
            {
             before(grammarAccess.getAtLocationAccess().getGroup()); 
            // InternalWail.g:244:3: ( rule__AtLocation__Group__0 )
            // InternalWail.g:244:4: rule__AtLocation__Group__0
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
    // InternalWail.g:253:1: entryRuleUnitEquals : ruleUnitEquals EOF ;
    public final void entryRuleUnitEquals() throws RecognitionException {
        try {
            // InternalWail.g:254:1: ( ruleUnitEquals EOF )
            // InternalWail.g:255:1: ruleUnitEquals EOF
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
    // InternalWail.g:262:1: ruleUnitEquals : ( ( rule__UnitEquals__Group__0 ) ) ;
    public final void ruleUnitEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:266:2: ( ( ( rule__UnitEquals__Group__0 ) ) )
            // InternalWail.g:267:2: ( ( rule__UnitEquals__Group__0 ) )
            {
            // InternalWail.g:267:2: ( ( rule__UnitEquals__Group__0 ) )
            // InternalWail.g:268:3: ( rule__UnitEquals__Group__0 )
            {
             before(grammarAccess.getUnitEqualsAccess().getGroup()); 
            // InternalWail.g:269:3: ( rule__UnitEquals__Group__0 )
            // InternalWail.g:269:4: rule__UnitEquals__Group__0
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


    // $ANTLR start "entryRuleGoal"
    // InternalWail.g:278:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // InternalWail.g:279:1: ( ruleGoal EOF )
            // InternalWail.g:280:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_1);
            ruleGoal();

            state._fsp--;

             after(grammarAccess.getGoalRule()); 
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
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // InternalWail.g:287:1: ruleGoal : ( ( rule__Goal__Group__0 ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:291:2: ( ( ( rule__Goal__Group__0 ) ) )
            // InternalWail.g:292:2: ( ( rule__Goal__Group__0 ) )
            {
            // InternalWail.g:292:2: ( ( rule__Goal__Group__0 ) )
            // InternalWail.g:293:3: ( rule__Goal__Group__0 )
            {
             before(grammarAccess.getGoalAccess().getGroup()); 
            // InternalWail.g:294:3: ( rule__Goal__Group__0 )
            // InternalWail.g:294:4: rule__Goal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Goal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getGroup()); 

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
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleGoaLocation"
    // InternalWail.g:303:1: entryRuleGoaLocation : ruleGoaLocation EOF ;
    public final void entryRuleGoaLocation() throws RecognitionException {
        try {
            // InternalWail.g:304:1: ( ruleGoaLocation EOF )
            // InternalWail.g:305:1: ruleGoaLocation EOF
            {
             before(grammarAccess.getGoaLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleGoaLocation();

            state._fsp--;

             after(grammarAccess.getGoaLocationRule()); 
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
    // $ANTLR end "entryRuleGoaLocation"


    // $ANTLR start "ruleGoaLocation"
    // InternalWail.g:312:1: ruleGoaLocation : ( ( rule__GoaLocation__Group__0 ) ) ;
    public final void ruleGoaLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:316:2: ( ( ( rule__GoaLocation__Group__0 ) ) )
            // InternalWail.g:317:2: ( ( rule__GoaLocation__Group__0 ) )
            {
            // InternalWail.g:317:2: ( ( rule__GoaLocation__Group__0 ) )
            // InternalWail.g:318:3: ( rule__GoaLocation__Group__0 )
            {
             before(grammarAccess.getGoaLocationAccess().getGroup()); 
            // InternalWail.g:319:3: ( rule__GoaLocation__Group__0 )
            // InternalWail.g:319:4: rule__GoaLocation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoaLocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoaLocationAccess().getGroup()); 

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
    // $ANTLR end "ruleGoaLocation"


    // $ANTLR start "entryRuleDefualt_CA"
    // InternalWail.g:328:1: entryRuleDefualt_CA : ruleDefualt_CA EOF ;
    public final void entryRuleDefualt_CA() throws RecognitionException {
        try {
            // InternalWail.g:329:1: ( ruleDefualt_CA EOF )
            // InternalWail.g:330:1: ruleDefualt_CA EOF
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
    // InternalWail.g:337:1: ruleDefualt_CA : ( ( rule__Defualt_CA__CaTypeAssignment ) ) ;
    public final void ruleDefualt_CA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:341:2: ( ( ( rule__Defualt_CA__CaTypeAssignment ) ) )
            // InternalWail.g:342:2: ( ( rule__Defualt_CA__CaTypeAssignment ) )
            {
            // InternalWail.g:342:2: ( ( rule__Defualt_CA__CaTypeAssignment ) )
            // InternalWail.g:343:3: ( rule__Defualt_CA__CaTypeAssignment )
            {
             before(grammarAccess.getDefualt_CAAccess().getCaTypeAssignment()); 
            // InternalWail.g:344:3: ( rule__Defualt_CA__CaTypeAssignment )
            // InternalWail.g:344:4: rule__Defualt_CA__CaTypeAssignment
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


    // $ANTLR start "rule__WhenRules__Alternatives"
    // InternalWail.g:352:1: rule__WhenRules__Alternatives : ( ( ruleUnitEquals ) | ( ruleAtLocation ) | ( ruleDamage ) | ( ruleBaseline ) );
    public final void rule__WhenRules__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:356:1: ( ( ruleUnitEquals ) | ( ruleAtLocation ) | ( ruleDamage ) | ( ruleBaseline ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalWail.g:357:2: ( ruleUnitEquals )
                    {
                    // InternalWail.g:357:2: ( ruleUnitEquals )
                    // InternalWail.g:358:3: ruleUnitEquals
                    {
                     before(grammarAccess.getWhenRulesAccess().getUnitEqualsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUnitEquals();

                    state._fsp--;

                     after(grammarAccess.getWhenRulesAccess().getUnitEqualsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWail.g:363:2: ( ruleAtLocation )
                    {
                    // InternalWail.g:363:2: ( ruleAtLocation )
                    // InternalWail.g:364:3: ruleAtLocation
                    {
                     before(grammarAccess.getWhenRulesAccess().getAtLocationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAtLocation();

                    state._fsp--;

                     after(grammarAccess.getWhenRulesAccess().getAtLocationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWail.g:369:2: ( ruleDamage )
                    {
                    // InternalWail.g:369:2: ( ruleDamage )
                    // InternalWail.g:370:3: ruleDamage
                    {
                     before(grammarAccess.getWhenRulesAccess().getDamageParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDamage();

                    state._fsp--;

                     after(grammarAccess.getWhenRulesAccess().getDamageParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWail.g:375:2: ( ruleBaseline )
                    {
                    // InternalWail.g:375:2: ( ruleBaseline )
                    // InternalWail.g:376:3: ruleBaseline
                    {
                     before(grammarAccess.getWhenRulesAccess().getBaselineParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBaseline();

                    state._fsp--;

                     after(grammarAccess.getWhenRulesAccess().getBaselineParserRuleCall_3()); 

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
    // $ANTLR end "rule__WhenRules__Alternatives"


    // $ANTLR start "rule__Defualt_CA__CaTypeAlternatives_0"
    // InternalWail.g:385:1: rule__Defualt_CA__CaTypeAlternatives_0 : ( ( 'movement' ) | ( 'heal' ) | ( 'retreat' ) | ( 'move_to_targets' ) | ( 'basic_movement' ) | ( 'combat' ) | ( 'recruit' ) | ( 'combat_value_targets' ) | ( 'capture_villages' ) | ( 'leader_to_keep' ) );
    public final void rule__Defualt_CA__CaTypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:389:1: ( ( 'movement' ) | ( 'heal' ) | ( 'retreat' ) | ( 'move_to_targets' ) | ( 'basic_movement' ) | ( 'combat' ) | ( 'recruit' ) | ( 'combat_value_targets' ) | ( 'capture_villages' ) | ( 'leader_to_keep' ) )
            int alt3=10;
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
            case 19:
                {
                alt3=9;
                }
                break;
            case 20:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalWail.g:390:2: ( 'movement' )
                    {
                    // InternalWail.g:390:2: ( 'movement' )
                    // InternalWail.g:391:3: 'movement'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWail.g:396:2: ( 'heal' )
                    {
                    // InternalWail.g:396:2: ( 'heal' )
                    // InternalWail.g:397:3: 'heal'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeHealKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeHealKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWail.g:402:2: ( 'retreat' )
                    {
                    // InternalWail.g:402:2: ( 'retreat' )
                    // InternalWail.g:403:3: 'retreat'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWail.g:408:2: ( 'move_to_targets' )
                    {
                    // InternalWail.g:408:2: ( 'move_to_targets' )
                    // InternalWail.g:409:3: 'move_to_targets'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetsKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetsKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWail.g:414:2: ( 'basic_movement' )
                    {
                    // InternalWail.g:414:2: ( 'basic_movement' )
                    // InternalWail.g:415:3: 'basic_movement'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeBasic_movementKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeBasic_movementKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWail.g:420:2: ( 'combat' )
                    {
                    // InternalWail.g:420:2: ( 'combat' )
                    // InternalWail.g:421:3: 'combat'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalWail.g:426:2: ( 'recruit' )
                    {
                    // InternalWail.g:426:2: ( 'recruit' )
                    // InternalWail.g:427:3: 'recruit'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalWail.g:432:2: ( 'combat_value_targets' )
                    {
                    // InternalWail.g:432:2: ( 'combat_value_targets' )
                    // InternalWail.g:433:3: 'combat_value_targets'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeCombat_value_targetsKeyword_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeCombat_value_targetsKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalWail.g:438:2: ( 'capture_villages' )
                    {
                    // InternalWail.g:438:2: ( 'capture_villages' )
                    // InternalWail.g:439:3: 'capture_villages'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalWail.g:444:2: ( 'leader_to_keep' )
                    {
                    // InternalWail.g:444:2: ( 'leader_to_keep' )
                    // InternalWail.g:445:3: 'leader_to_keep'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeLeader_to_keepKeyword_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeLeader_to_keepKeyword_0_9()); 

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
    // InternalWail.g:454:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:458:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalWail.g:459:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalWail.g:466:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:470:1: ( ( 'rule' ) )
            // InternalWail.g:471:1: ( 'rule' )
            {
            // InternalWail.g:471:1: ( 'rule' )
            // InternalWail.g:472:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalWail.g:481:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:485:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalWail.g:486:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalWail.g:493:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:497:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalWail.g:498:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalWail.g:498:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalWail.g:499:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalWail.g:500:2: ( rule__Rule__NameAssignment_1 )
            // InternalWail.g:500:3: rule__Rule__NameAssignment_1
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
    // InternalWail.g:508:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:512:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalWail.g:513:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalWail.g:520:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:524:1: ( ( '{' ) )
            // InternalWail.g:525:1: ( '{' )
            {
            // InternalWail.g:525:1: ( '{' )
            // InternalWail.g:526:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalWail.g:535:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:539:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalWail.g:540:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalWail.g:547:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__FragmentsAssignment_3 )* ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:551:1: ( ( ( rule__Rule__FragmentsAssignment_3 )* ) )
            // InternalWail.g:552:1: ( ( rule__Rule__FragmentsAssignment_3 )* )
            {
            // InternalWail.g:552:1: ( ( rule__Rule__FragmentsAssignment_3 )* )
            // InternalWail.g:553:2: ( rule__Rule__FragmentsAssignment_3 )*
            {
             before(grammarAccess.getRuleAccess().getFragmentsAssignment_3()); 
            // InternalWail.g:554:2: ( rule__Rule__FragmentsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWail.g:554:3: rule__Rule__FragmentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Rule__FragmentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

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
    // InternalWail.g:562:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:566:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalWail.g:567:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

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
    // InternalWail.g:574:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__GoalsAssignment_4 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:578:1: ( ( ( rule__Rule__GoalsAssignment_4 )* ) )
            // InternalWail.g:579:1: ( ( rule__Rule__GoalsAssignment_4 )* )
            {
            // InternalWail.g:579:1: ( ( rule__Rule__GoalsAssignment_4 )* )
            // InternalWail.g:580:2: ( rule__Rule__GoalsAssignment_4 )*
            {
             before(grammarAccess.getRuleAccess().getGoalsAssignment_4()); 
            // InternalWail.g:581:2: ( rule__Rule__GoalsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWail.g:581:3: rule__Rule__GoalsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Rule__GoalsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGoalsAssignment_4()); 

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


    // $ANTLR start "rule__Rule__Group__5"
    // InternalWail.g:589:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:593:1: ( rule__Rule__Group__5__Impl )
            // InternalWail.g:594:2: rule__Rule__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__5__Impl();

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
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalWail.g:600:1: rule__Rule__Group__5__Impl : ( '}' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:604:1: ( ( '}' ) )
            // InternalWail.g:605:1: ( '}' )
            {
            // InternalWail.g:605:1: ( '}' )
            // InternalWail.g:606:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Fragment__Group__0"
    // InternalWail.g:616:1: rule__Fragment__Group__0 : rule__Fragment__Group__0__Impl rule__Fragment__Group__1 ;
    public final void rule__Fragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:620:1: ( rule__Fragment__Group__0__Impl rule__Fragment__Group__1 )
            // InternalWail.g:621:2: rule__Fragment__Group__0__Impl rule__Fragment__Group__1
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
    // InternalWail.g:628:1: rule__Fragment__Group__0__Impl : ( ( rule__Fragment__ConditionAssignment_0 ) ) ;
    public final void rule__Fragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:632:1: ( ( ( rule__Fragment__ConditionAssignment_0 ) ) )
            // InternalWail.g:633:1: ( ( rule__Fragment__ConditionAssignment_0 ) )
            {
            // InternalWail.g:633:1: ( ( rule__Fragment__ConditionAssignment_0 ) )
            // InternalWail.g:634:2: ( rule__Fragment__ConditionAssignment_0 )
            {
             before(grammarAccess.getFragmentAccess().getConditionAssignment_0()); 
            // InternalWail.g:635:2: ( rule__Fragment__ConditionAssignment_0 )
            // InternalWail.g:635:3: rule__Fragment__ConditionAssignment_0
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
    // InternalWail.g:643:1: rule__Fragment__Group__1 : rule__Fragment__Group__1__Impl rule__Fragment__Group__2 ;
    public final void rule__Fragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:647:1: ( rule__Fragment__Group__1__Impl rule__Fragment__Group__2 )
            // InternalWail.g:648:2: rule__Fragment__Group__1__Impl rule__Fragment__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalWail.g:655:1: rule__Fragment__Group__1__Impl : ( '{' ) ;
    public final void rule__Fragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:659:1: ( ( '{' ) )
            // InternalWail.g:660:1: ( '{' )
            {
            // InternalWail.g:660:1: ( '{' )
            // InternalWail.g:661:2: '{'
            {
             before(grammarAccess.getFragmentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalWail.g:670:1: rule__Fragment__Group__2 : rule__Fragment__Group__2__Impl rule__Fragment__Group__3 ;
    public final void rule__Fragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:674:1: ( rule__Fragment__Group__2__Impl rule__Fragment__Group__3 )
            // InternalWail.g:675:2: rule__Fragment__Group__2__Impl rule__Fragment__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalWail.g:682:1: rule__Fragment__Group__2__Impl : ( ( rule__Fragment__Defualt_casAssignment_2 )* ) ;
    public final void rule__Fragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:686:1: ( ( ( rule__Fragment__Defualt_casAssignment_2 )* ) )
            // InternalWail.g:687:1: ( ( rule__Fragment__Defualt_casAssignment_2 )* )
            {
            // InternalWail.g:687:1: ( ( rule__Fragment__Defualt_casAssignment_2 )* )
            // InternalWail.g:688:2: ( rule__Fragment__Defualt_casAssignment_2 )*
            {
             before(grammarAccess.getFragmentAccess().getDefualt_casAssignment_2()); 
            // InternalWail.g:689:2: ( rule__Fragment__Defualt_casAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=20)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWail.g:689:3: rule__Fragment__Defualt_casAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Fragment__Defualt_casAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalWail.g:697:1: rule__Fragment__Group__3 : rule__Fragment__Group__3__Impl ;
    public final void rule__Fragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:701:1: ( rule__Fragment__Group__3__Impl )
            // InternalWail.g:702:2: rule__Fragment__Group__3__Impl
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
    // InternalWail.g:708:1: rule__Fragment__Group__3__Impl : ( '}' ) ;
    public final void rule__Fragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:712:1: ( ( '}' ) )
            // InternalWail.g:713:1: ( '}' )
            {
            // InternalWail.g:713:1: ( '}' )
            // InternalWail.g:714:2: '}'
            {
             before(grammarAccess.getFragmentAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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


    // $ANTLR start "rule__Conditional__Group__0"
    // InternalWail.g:724:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:728:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // InternalWail.g:729:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Conditional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__1();

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
    // $ANTLR end "rule__Conditional__Group__0"


    // $ANTLR start "rule__Conditional__Group__0__Impl"
    // InternalWail.g:736:1: rule__Conditional__Group__0__Impl : ( 'when:' ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:740:1: ( ( 'when:' ) )
            // InternalWail.g:741:1: ( 'when:' )
            {
            // InternalWail.g:741:1: ( 'when:' )
            // InternalWail.g:742:2: 'when:'
            {
             before(grammarAccess.getConditionalAccess().getWhenKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getWhenKeyword_0()); 

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
    // $ANTLR end "rule__Conditional__Group__0__Impl"


    // $ANTLR start "rule__Conditional__Group__1"
    // InternalWail.g:751:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:755:1: ( rule__Conditional__Group__1__Impl )
            // InternalWail.g:756:2: rule__Conditional__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__1__Impl();

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
    // $ANTLR end "rule__Conditional__Group__1"


    // $ANTLR start "rule__Conditional__Group__1__Impl"
    // InternalWail.g:762:1: rule__Conditional__Group__1__Impl : ( ( rule__Conditional__XAssignment_1 ) ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:766:1: ( ( ( rule__Conditional__XAssignment_1 ) ) )
            // InternalWail.g:767:1: ( ( rule__Conditional__XAssignment_1 ) )
            {
            // InternalWail.g:767:1: ( ( rule__Conditional__XAssignment_1 ) )
            // InternalWail.g:768:2: ( rule__Conditional__XAssignment_1 )
            {
             before(grammarAccess.getConditionalAccess().getXAssignment_1()); 
            // InternalWail.g:769:2: ( rule__Conditional__XAssignment_1 )
            // InternalWail.g:769:3: rule__Conditional__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getXAssignment_1()); 

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
    // $ANTLR end "rule__Conditional__Group__1__Impl"


    // $ANTLR start "rule__Damage__Group__0"
    // InternalWail.g:778:1: rule__Damage__Group__0 : rule__Damage__Group__0__Impl rule__Damage__Group__1 ;
    public final void rule__Damage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:782:1: ( rule__Damage__Group__0__Impl rule__Damage__Group__1 )
            // InternalWail.g:783:2: rule__Damage__Group__0__Impl rule__Damage__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalWail.g:790:1: rule__Damage__Group__0__Impl : ( 'health' ) ;
    public final void rule__Damage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:794:1: ( ( 'health' ) )
            // InternalWail.g:795:1: ( 'health' )
            {
            // InternalWail.g:795:1: ( 'health' )
            // InternalWail.g:796:2: 'health'
            {
             before(grammarAccess.getDamageAccess().getHealthKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalWail.g:805:1: rule__Damage__Group__1 : rule__Damage__Group__1__Impl rule__Damage__Group__2 ;
    public final void rule__Damage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:809:1: ( rule__Damage__Group__1__Impl rule__Damage__Group__2 )
            // InternalWail.g:810:2: rule__Damage__Group__1__Impl rule__Damage__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalWail.g:817:1: rule__Damage__Group__1__Impl : ( '-' ) ;
    public final void rule__Damage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:821:1: ( ( '-' ) )
            // InternalWail.g:822:1: ( '-' )
            {
            // InternalWail.g:822:1: ( '-' )
            // InternalWail.g:823:2: '-'
            {
             before(grammarAccess.getDamageAccess().getHyphenMinusKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalWail.g:832:1: rule__Damage__Group__2 : rule__Damage__Group__2__Impl ;
    public final void rule__Damage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:836:1: ( rule__Damage__Group__2__Impl )
            // InternalWail.g:837:2: rule__Damage__Group__2__Impl
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
    // InternalWail.g:843:1: rule__Damage__Group__2__Impl : ( ( rule__Damage__HealthAssignment_2 ) ) ;
    public final void rule__Damage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:847:1: ( ( ( rule__Damage__HealthAssignment_2 ) ) )
            // InternalWail.g:848:1: ( ( rule__Damage__HealthAssignment_2 ) )
            {
            // InternalWail.g:848:1: ( ( rule__Damage__HealthAssignment_2 ) )
            // InternalWail.g:849:2: ( rule__Damage__HealthAssignment_2 )
            {
             before(grammarAccess.getDamageAccess().getHealthAssignment_2()); 
            // InternalWail.g:850:2: ( rule__Damage__HealthAssignment_2 )
            // InternalWail.g:850:3: rule__Damage__HealthAssignment_2
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
    // InternalWail.g:859:1: rule__AtLocation__Group__0 : rule__AtLocation__Group__0__Impl rule__AtLocation__Group__1 ;
    public final void rule__AtLocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:863:1: ( rule__AtLocation__Group__0__Impl rule__AtLocation__Group__1 )
            // InternalWail.g:864:2: rule__AtLocation__Group__0__Impl rule__AtLocation__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalWail.g:871:1: rule__AtLocation__Group__0__Impl : ( 'x:' ) ;
    public final void rule__AtLocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:875:1: ( ( 'x:' ) )
            // InternalWail.g:876:1: ( 'x:' )
            {
            // InternalWail.g:876:1: ( 'x:' )
            // InternalWail.g:877:2: 'x:'
            {
             before(grammarAccess.getAtLocationAccess().getXKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalWail.g:886:1: rule__AtLocation__Group__1 : rule__AtLocation__Group__1__Impl rule__AtLocation__Group__2 ;
    public final void rule__AtLocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:890:1: ( rule__AtLocation__Group__1__Impl rule__AtLocation__Group__2 )
            // InternalWail.g:891:2: rule__AtLocation__Group__1__Impl rule__AtLocation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalWail.g:898:1: rule__AtLocation__Group__1__Impl : ( ( rule__AtLocation__XAxisAssignment_1 ) ) ;
    public final void rule__AtLocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:902:1: ( ( ( rule__AtLocation__XAxisAssignment_1 ) ) )
            // InternalWail.g:903:1: ( ( rule__AtLocation__XAxisAssignment_1 ) )
            {
            // InternalWail.g:903:1: ( ( rule__AtLocation__XAxisAssignment_1 ) )
            // InternalWail.g:904:2: ( rule__AtLocation__XAxisAssignment_1 )
            {
             before(grammarAccess.getAtLocationAccess().getXAxisAssignment_1()); 
            // InternalWail.g:905:2: ( rule__AtLocation__XAxisAssignment_1 )
            // InternalWail.g:905:3: rule__AtLocation__XAxisAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtLocation__XAxisAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtLocationAccess().getXAxisAssignment_1()); 

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
    // InternalWail.g:913:1: rule__AtLocation__Group__2 : rule__AtLocation__Group__2__Impl rule__AtLocation__Group__3 ;
    public final void rule__AtLocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:917:1: ( rule__AtLocation__Group__2__Impl rule__AtLocation__Group__3 )
            // InternalWail.g:918:2: rule__AtLocation__Group__2__Impl rule__AtLocation__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalWail.g:925:1: rule__AtLocation__Group__2__Impl : ( 'y:' ) ;
    public final void rule__AtLocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:929:1: ( ( 'y:' ) )
            // InternalWail.g:930:1: ( 'y:' )
            {
            // InternalWail.g:930:1: ( 'y:' )
            // InternalWail.g:931:2: 'y:'
            {
             before(grammarAccess.getAtLocationAccess().getYKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalWail.g:940:1: rule__AtLocation__Group__3 : rule__AtLocation__Group__3__Impl ;
    public final void rule__AtLocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:944:1: ( rule__AtLocation__Group__3__Impl )
            // InternalWail.g:945:2: rule__AtLocation__Group__3__Impl
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
    // InternalWail.g:951:1: rule__AtLocation__Group__3__Impl : ( ( rule__AtLocation__YAxisAssignment_3 ) ) ;
    public final void rule__AtLocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:955:1: ( ( ( rule__AtLocation__YAxisAssignment_3 ) ) )
            // InternalWail.g:956:1: ( ( rule__AtLocation__YAxisAssignment_3 ) )
            {
            // InternalWail.g:956:1: ( ( rule__AtLocation__YAxisAssignment_3 ) )
            // InternalWail.g:957:2: ( rule__AtLocation__YAxisAssignment_3 )
            {
             before(grammarAccess.getAtLocationAccess().getYAxisAssignment_3()); 
            // InternalWail.g:958:2: ( rule__AtLocation__YAxisAssignment_3 )
            // InternalWail.g:958:3: rule__AtLocation__YAxisAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AtLocation__YAxisAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtLocationAccess().getYAxisAssignment_3()); 

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
    // InternalWail.g:967:1: rule__UnitEquals__Group__0 : rule__UnitEquals__Group__0__Impl rule__UnitEquals__Group__1 ;
    public final void rule__UnitEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:971:1: ( rule__UnitEquals__Group__0__Impl rule__UnitEquals__Group__1 )
            // InternalWail.g:972:2: rule__UnitEquals__Group__0__Impl rule__UnitEquals__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalWail.g:979:1: rule__UnitEquals__Group__0__Impl : ( 'unit' ) ;
    public final void rule__UnitEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:983:1: ( ( 'unit' ) )
            // InternalWail.g:984:1: ( 'unit' )
            {
            // InternalWail.g:984:1: ( 'unit' )
            // InternalWail.g:985:2: 'unit'
            {
             before(grammarAccess.getUnitEqualsAccess().getUnitKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalWail.g:994:1: rule__UnitEquals__Group__1 : rule__UnitEquals__Group__1__Impl rule__UnitEquals__Group__2 ;
    public final void rule__UnitEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:998:1: ( rule__UnitEquals__Group__1__Impl rule__UnitEquals__Group__2 )
            // InternalWail.g:999:2: rule__UnitEquals__Group__1__Impl rule__UnitEquals__Group__2
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
    // InternalWail.g:1006:1: rule__UnitEquals__Group__1__Impl : ( 'is' ) ;
    public final void rule__UnitEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1010:1: ( ( 'is' ) )
            // InternalWail.g:1011:1: ( 'is' )
            {
            // InternalWail.g:1011:1: ( 'is' )
            // InternalWail.g:1012:2: 'is'
            {
             before(grammarAccess.getUnitEqualsAccess().getIsKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalWail.g:1021:1: rule__UnitEquals__Group__2 : rule__UnitEquals__Group__2__Impl ;
    public final void rule__UnitEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1025:1: ( rule__UnitEquals__Group__2__Impl )
            // InternalWail.g:1026:2: rule__UnitEquals__Group__2__Impl
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
    // InternalWail.g:1032:1: rule__UnitEquals__Group__2__Impl : ( ( rule__UnitEquals__UnitAssignment_2 ) ) ;
    public final void rule__UnitEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1036:1: ( ( ( rule__UnitEquals__UnitAssignment_2 ) ) )
            // InternalWail.g:1037:1: ( ( rule__UnitEquals__UnitAssignment_2 ) )
            {
            // InternalWail.g:1037:1: ( ( rule__UnitEquals__UnitAssignment_2 ) )
            // InternalWail.g:1038:2: ( rule__UnitEquals__UnitAssignment_2 )
            {
             before(grammarAccess.getUnitEqualsAccess().getUnitAssignment_2()); 
            // InternalWail.g:1039:2: ( rule__UnitEquals__UnitAssignment_2 )
            // InternalWail.g:1039:3: rule__UnitEquals__UnitAssignment_2
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


    // $ANTLR start "rule__Goal__Group__0"
    // InternalWail.g:1048:1: rule__Goal__Group__0 : rule__Goal__Group__0__Impl rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1052:1: ( rule__Goal__Group__0__Impl rule__Goal__Group__1 )
            // InternalWail.g:1053:2: rule__Goal__Group__0__Impl rule__Goal__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Goal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group__1();

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
    // $ANTLR end "rule__Goal__Group__0"


    // $ANTLR start "rule__Goal__Group__0__Impl"
    // InternalWail.g:1060:1: rule__Goal__Group__0__Impl : ( 'goal' ) ;
    public final void rule__Goal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1064:1: ( ( 'goal' ) )
            // InternalWail.g:1065:1: ( 'goal' )
            {
            // InternalWail.g:1065:1: ( 'goal' )
            // InternalWail.g:1066:2: 'goal'
            {
             before(grammarAccess.getGoalAccess().getGoalKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getGoalKeyword_0()); 

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
    // $ANTLR end "rule__Goal__Group__0__Impl"


    // $ANTLR start "rule__Goal__Group__1"
    // InternalWail.g:1075:1: rule__Goal__Group__1 : rule__Goal__Group__1__Impl rule__Goal__Group__2 ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1079:1: ( rule__Goal__Group__1__Impl rule__Goal__Group__2 )
            // InternalWail.g:1080:2: rule__Goal__Group__1__Impl rule__Goal__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Goal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group__2();

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
    // $ANTLR end "rule__Goal__Group__1"


    // $ANTLR start "rule__Goal__Group__1__Impl"
    // InternalWail.g:1087:1: rule__Goal__Group__1__Impl : ( 'is' ) ;
    public final void rule__Goal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1091:1: ( ( 'is' ) )
            // InternalWail.g:1092:1: ( 'is' )
            {
            // InternalWail.g:1092:1: ( 'is' )
            // InternalWail.g:1093:2: 'is'
            {
             before(grammarAccess.getGoalAccess().getIsKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__Goal__Group__1__Impl"


    // $ANTLR start "rule__Goal__Group__2"
    // InternalWail.g:1102:1: rule__Goal__Group__2 : rule__Goal__Group__2__Impl rule__Goal__Group__3 ;
    public final void rule__Goal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1106:1: ( rule__Goal__Group__2__Impl rule__Goal__Group__3 )
            // InternalWail.g:1107:2: rule__Goal__Group__2__Impl rule__Goal__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Goal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group__3();

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
    // $ANTLR end "rule__Goal__Group__2"


    // $ANTLR start "rule__Goal__Group__2__Impl"
    // InternalWail.g:1114:1: rule__Goal__Group__2__Impl : ( ( rule__Goal__GoalAssignment_2 ) ) ;
    public final void rule__Goal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1118:1: ( ( ( rule__Goal__GoalAssignment_2 ) ) )
            // InternalWail.g:1119:1: ( ( rule__Goal__GoalAssignment_2 ) )
            {
            // InternalWail.g:1119:1: ( ( rule__Goal__GoalAssignment_2 ) )
            // InternalWail.g:1120:2: ( rule__Goal__GoalAssignment_2 )
            {
             before(grammarAccess.getGoalAccess().getGoalAssignment_2()); 
            // InternalWail.g:1121:2: ( rule__Goal__GoalAssignment_2 )
            // InternalWail.g:1121:3: rule__Goal__GoalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Goal__GoalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getGoalAssignment_2()); 

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
    // $ANTLR end "rule__Goal__Group__2__Impl"


    // $ANTLR start "rule__Goal__Group__3"
    // InternalWail.g:1129:1: rule__Goal__Group__3 : rule__Goal__Group__3__Impl rule__Goal__Group__4 ;
    public final void rule__Goal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1133:1: ( rule__Goal__Group__3__Impl rule__Goal__Group__4 )
            // InternalWail.g:1134:2: rule__Goal__Group__3__Impl rule__Goal__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Goal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group__4();

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
    // $ANTLR end "rule__Goal__Group__3"


    // $ANTLR start "rule__Goal__Group__3__Impl"
    // InternalWail.g:1141:1: rule__Goal__Group__3__Impl : ( 'value' ) ;
    public final void rule__Goal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1145:1: ( ( 'value' ) )
            // InternalWail.g:1146:1: ( 'value' )
            {
            // InternalWail.g:1146:1: ( 'value' )
            // InternalWail.g:1147:2: 'value'
            {
             before(grammarAccess.getGoalAccess().getValueKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getValueKeyword_3()); 

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
    // $ANTLR end "rule__Goal__Group__3__Impl"


    // $ANTLR start "rule__Goal__Group__4"
    // InternalWail.g:1156:1: rule__Goal__Group__4 : rule__Goal__Group__4__Impl rule__Goal__Group__5 ;
    public final void rule__Goal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1160:1: ( rule__Goal__Group__4__Impl rule__Goal__Group__5 )
            // InternalWail.g:1161:2: rule__Goal__Group__4__Impl rule__Goal__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Goal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group__5();

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
    // $ANTLR end "rule__Goal__Group__4"


    // $ANTLR start "rule__Goal__Group__4__Impl"
    // InternalWail.g:1168:1: rule__Goal__Group__4__Impl : ( 'is' ) ;
    public final void rule__Goal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1172:1: ( ( 'is' ) )
            // InternalWail.g:1173:1: ( 'is' )
            {
            // InternalWail.g:1173:1: ( 'is' )
            // InternalWail.g:1174:2: 'is'
            {
             before(grammarAccess.getGoalAccess().getIsKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getIsKeyword_4()); 

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
    // $ANTLR end "rule__Goal__Group__4__Impl"


    // $ANTLR start "rule__Goal__Group__5"
    // InternalWail.g:1183:1: rule__Goal__Group__5 : rule__Goal__Group__5__Impl ;
    public final void rule__Goal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1187:1: ( rule__Goal__Group__5__Impl )
            // InternalWail.g:1188:2: rule__Goal__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goal__Group__5__Impl();

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
    // $ANTLR end "rule__Goal__Group__5"


    // $ANTLR start "rule__Goal__Group__5__Impl"
    // InternalWail.g:1194:1: rule__Goal__Group__5__Impl : ( ( rule__Goal__LocValueAssignment_5 ) ) ;
    public final void rule__Goal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1198:1: ( ( ( rule__Goal__LocValueAssignment_5 ) ) )
            // InternalWail.g:1199:1: ( ( rule__Goal__LocValueAssignment_5 ) )
            {
            // InternalWail.g:1199:1: ( ( rule__Goal__LocValueAssignment_5 ) )
            // InternalWail.g:1200:2: ( rule__Goal__LocValueAssignment_5 )
            {
             before(grammarAccess.getGoalAccess().getLocValueAssignment_5()); 
            // InternalWail.g:1201:2: ( rule__Goal__LocValueAssignment_5 )
            // InternalWail.g:1201:3: rule__Goal__LocValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Goal__LocValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getLocValueAssignment_5()); 

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
    // $ANTLR end "rule__Goal__Group__5__Impl"


    // $ANTLR start "rule__GoaLocation__Group__0"
    // InternalWail.g:1210:1: rule__GoaLocation__Group__0 : rule__GoaLocation__Group__0__Impl rule__GoaLocation__Group__1 ;
    public final void rule__GoaLocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1214:1: ( rule__GoaLocation__Group__0__Impl rule__GoaLocation__Group__1 )
            // InternalWail.g:1215:2: rule__GoaLocation__Group__0__Impl rule__GoaLocation__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__GoaLocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoaLocation__Group__1();

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
    // $ANTLR end "rule__GoaLocation__Group__0"


    // $ANTLR start "rule__GoaLocation__Group__0__Impl"
    // InternalWail.g:1222:1: rule__GoaLocation__Group__0__Impl : ( 'x' ) ;
    public final void rule__GoaLocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1226:1: ( ( 'x' ) )
            // InternalWail.g:1227:1: ( 'x' )
            {
            // InternalWail.g:1227:1: ( 'x' )
            // InternalWail.g:1228:2: 'x'
            {
             before(grammarAccess.getGoaLocationAccess().getXKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGoaLocationAccess().getXKeyword_0()); 

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
    // $ANTLR end "rule__GoaLocation__Group__0__Impl"


    // $ANTLR start "rule__GoaLocation__Group__1"
    // InternalWail.g:1237:1: rule__GoaLocation__Group__1 : rule__GoaLocation__Group__1__Impl rule__GoaLocation__Group__2 ;
    public final void rule__GoaLocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1241:1: ( rule__GoaLocation__Group__1__Impl rule__GoaLocation__Group__2 )
            // InternalWail.g:1242:2: rule__GoaLocation__Group__1__Impl rule__GoaLocation__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__GoaLocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoaLocation__Group__2();

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
    // $ANTLR end "rule__GoaLocation__Group__1"


    // $ANTLR start "rule__GoaLocation__Group__1__Impl"
    // InternalWail.g:1249:1: rule__GoaLocation__Group__1__Impl : ( ( rule__GoaLocation__XAxisAssignment_1 ) ) ;
    public final void rule__GoaLocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1253:1: ( ( ( rule__GoaLocation__XAxisAssignment_1 ) ) )
            // InternalWail.g:1254:1: ( ( rule__GoaLocation__XAxisAssignment_1 ) )
            {
            // InternalWail.g:1254:1: ( ( rule__GoaLocation__XAxisAssignment_1 ) )
            // InternalWail.g:1255:2: ( rule__GoaLocation__XAxisAssignment_1 )
            {
             before(grammarAccess.getGoaLocationAccess().getXAxisAssignment_1()); 
            // InternalWail.g:1256:2: ( rule__GoaLocation__XAxisAssignment_1 )
            // InternalWail.g:1256:3: rule__GoaLocation__XAxisAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GoaLocation__XAxisAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoaLocationAccess().getXAxisAssignment_1()); 

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
    // $ANTLR end "rule__GoaLocation__Group__1__Impl"


    // $ANTLR start "rule__GoaLocation__Group__2"
    // InternalWail.g:1264:1: rule__GoaLocation__Group__2 : rule__GoaLocation__Group__2__Impl rule__GoaLocation__Group__3 ;
    public final void rule__GoaLocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1268:1: ( rule__GoaLocation__Group__2__Impl rule__GoaLocation__Group__3 )
            // InternalWail.g:1269:2: rule__GoaLocation__Group__2__Impl rule__GoaLocation__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__GoaLocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoaLocation__Group__3();

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
    // $ANTLR end "rule__GoaLocation__Group__2"


    // $ANTLR start "rule__GoaLocation__Group__2__Impl"
    // InternalWail.g:1276:1: rule__GoaLocation__Group__2__Impl : ( 'y' ) ;
    public final void rule__GoaLocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1280:1: ( ( 'y' ) )
            // InternalWail.g:1281:1: ( 'y' )
            {
            // InternalWail.g:1281:1: ( 'y' )
            // InternalWail.g:1282:2: 'y'
            {
             before(grammarAccess.getGoaLocationAccess().getYKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGoaLocationAccess().getYKeyword_2()); 

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
    // $ANTLR end "rule__GoaLocation__Group__2__Impl"


    // $ANTLR start "rule__GoaLocation__Group__3"
    // InternalWail.g:1291:1: rule__GoaLocation__Group__3 : rule__GoaLocation__Group__3__Impl ;
    public final void rule__GoaLocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1295:1: ( rule__GoaLocation__Group__3__Impl )
            // InternalWail.g:1296:2: rule__GoaLocation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoaLocation__Group__3__Impl();

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
    // $ANTLR end "rule__GoaLocation__Group__3"


    // $ANTLR start "rule__GoaLocation__Group__3__Impl"
    // InternalWail.g:1302:1: rule__GoaLocation__Group__3__Impl : ( ( rule__GoaLocation__YAxisAssignment_3 ) ) ;
    public final void rule__GoaLocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1306:1: ( ( ( rule__GoaLocation__YAxisAssignment_3 ) ) )
            // InternalWail.g:1307:1: ( ( rule__GoaLocation__YAxisAssignment_3 ) )
            {
            // InternalWail.g:1307:1: ( ( rule__GoaLocation__YAxisAssignment_3 ) )
            // InternalWail.g:1308:2: ( rule__GoaLocation__YAxisAssignment_3 )
            {
             before(grammarAccess.getGoaLocationAccess().getYAxisAssignment_3()); 
            // InternalWail.g:1309:2: ( rule__GoaLocation__YAxisAssignment_3 )
            // InternalWail.g:1309:3: rule__GoaLocation__YAxisAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GoaLocation__YAxisAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGoaLocationAccess().getYAxisAssignment_3()); 

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
    // $ANTLR end "rule__GoaLocation__Group__3__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalWail.g:1318:1: rule__Model__ElementsAssignment : ( ruleRule ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1322:1: ( ( ruleRule ) )
            // InternalWail.g:1323:2: ( ruleRule )
            {
            // InternalWail.g:1323:2: ( ruleRule )
            // InternalWail.g:1324:3: ruleRule
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
    // InternalWail.g:1333:1: rule__Rule__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1337:1: ( ( RULE_STRING ) )
            // InternalWail.g:1338:2: ( RULE_STRING )
            {
            // InternalWail.g:1338:2: ( RULE_STRING )
            // InternalWail.g:1339:3: RULE_STRING
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
    // InternalWail.g:1348:1: rule__Rule__FragmentsAssignment_3 : ( ruleFragment ) ;
    public final void rule__Rule__FragmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1352:1: ( ( ruleFragment ) )
            // InternalWail.g:1353:2: ( ruleFragment )
            {
            // InternalWail.g:1353:2: ( ruleFragment )
            // InternalWail.g:1354:3: ruleFragment
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


    // $ANTLR start "rule__Rule__GoalsAssignment_4"
    // InternalWail.g:1363:1: rule__Rule__GoalsAssignment_4 : ( ruleGoal ) ;
    public final void rule__Rule__GoalsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1367:1: ( ( ruleGoal ) )
            // InternalWail.g:1368:2: ( ruleGoal )
            {
            // InternalWail.g:1368:2: ( ruleGoal )
            // InternalWail.g:1369:3: ruleGoal
            {
             before(grammarAccess.getRuleAccess().getGoalsGoalParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGoal();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getGoalsGoalParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Rule__GoalsAssignment_4"


    // $ANTLR start "rule__Fragment__ConditionAssignment_0"
    // InternalWail.g:1378:1: rule__Fragment__ConditionAssignment_0 : ( ruleConditional ) ;
    public final void rule__Fragment__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1382:1: ( ( ruleConditional ) )
            // InternalWail.g:1383:2: ( ruleConditional )
            {
            // InternalWail.g:1383:2: ( ruleConditional )
            // InternalWail.g:1384:3: ruleConditional
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
    // InternalWail.g:1393:1: rule__Fragment__Defualt_casAssignment_2 : ( ruleDefualt_CA ) ;
    public final void rule__Fragment__Defualt_casAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1397:1: ( ( ruleDefualt_CA ) )
            // InternalWail.g:1398:2: ( ruleDefualt_CA )
            {
            // InternalWail.g:1398:2: ( ruleDefualt_CA )
            // InternalWail.g:1399:3: ruleDefualt_CA
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


    // $ANTLR start "rule__Conditional__XAssignment_1"
    // InternalWail.g:1408:1: rule__Conditional__XAssignment_1 : ( rulewhenRules ) ;
    public final void rule__Conditional__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1412:1: ( ( rulewhenRules ) )
            // InternalWail.g:1413:2: ( rulewhenRules )
            {
            // InternalWail.g:1413:2: ( rulewhenRules )
            // InternalWail.g:1414:3: rulewhenRules
            {
             before(grammarAccess.getConditionalAccess().getXWhenRulesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulewhenRules();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getXWhenRulesParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Conditional__XAssignment_1"


    // $ANTLR start "rule__Baseline__AlwaysAssignment"
    // InternalWail.g:1423:1: rule__Baseline__AlwaysAssignment : ( ( 'always' ) ) ;
    public final void rule__Baseline__AlwaysAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1427:1: ( ( ( 'always' ) ) )
            // InternalWail.g:1428:2: ( ( 'always' ) )
            {
            // InternalWail.g:1428:2: ( ( 'always' ) )
            // InternalWail.g:1429:3: ( 'always' )
            {
             before(grammarAccess.getBaselineAccess().getAlwaysAlwaysKeyword_0()); 
            // InternalWail.g:1430:3: ( 'always' )
            // InternalWail.g:1431:4: 'always'
            {
             before(grammarAccess.getBaselineAccess().getAlwaysAlwaysKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBaselineAccess().getAlwaysAlwaysKeyword_0()); 

            }

             after(grammarAccess.getBaselineAccess().getAlwaysAlwaysKeyword_0()); 

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
    // $ANTLR end "rule__Baseline__AlwaysAssignment"


    // $ANTLR start "rule__Damage__HealthAssignment_2"
    // InternalWail.g:1442:1: rule__Damage__HealthAssignment_2 : ( RULE_INT ) ;
    public final void rule__Damage__HealthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1446:1: ( ( RULE_INT ) )
            // InternalWail.g:1447:2: ( RULE_INT )
            {
            // InternalWail.g:1447:2: ( RULE_INT )
            // InternalWail.g:1448:3: RULE_INT
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


    // $ANTLR start "rule__AtLocation__XAxisAssignment_1"
    // InternalWail.g:1457:1: rule__AtLocation__XAxisAssignment_1 : ( RULE_INT ) ;
    public final void rule__AtLocation__XAxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1461:1: ( ( RULE_INT ) )
            // InternalWail.g:1462:2: ( RULE_INT )
            {
            // InternalWail.g:1462:2: ( RULE_INT )
            // InternalWail.g:1463:3: RULE_INT
            {
             before(grammarAccess.getAtLocationAccess().getXAxisINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtLocationAccess().getXAxisINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AtLocation__XAxisAssignment_1"


    // $ANTLR start "rule__AtLocation__YAxisAssignment_3"
    // InternalWail.g:1472:1: rule__AtLocation__YAxisAssignment_3 : ( RULE_INT ) ;
    public final void rule__AtLocation__YAxisAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1476:1: ( ( RULE_INT ) )
            // InternalWail.g:1477:2: ( RULE_INT )
            {
            // InternalWail.g:1477:2: ( RULE_INT )
            // InternalWail.g:1478:3: RULE_INT
            {
             before(grammarAccess.getAtLocationAccess().getYAxisINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtLocationAccess().getYAxisINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__AtLocation__YAxisAssignment_3"


    // $ANTLR start "rule__UnitEquals__UnitAssignment_2"
    // InternalWail.g:1487:1: rule__UnitEquals__UnitAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UnitEquals__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1491:1: ( ( RULE_STRING ) )
            // InternalWail.g:1492:2: ( RULE_STRING )
            {
            // InternalWail.g:1492:2: ( RULE_STRING )
            // InternalWail.g:1493:3: RULE_STRING
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


    // $ANTLR start "rule__Goal__GoalAssignment_2"
    // InternalWail.g:1502:1: rule__Goal__GoalAssignment_2 : ( ruleGoaLocation ) ;
    public final void rule__Goal__GoalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1506:1: ( ( ruleGoaLocation ) )
            // InternalWail.g:1507:2: ( ruleGoaLocation )
            {
            // InternalWail.g:1507:2: ( ruleGoaLocation )
            // InternalWail.g:1508:3: ruleGoaLocation
            {
             before(grammarAccess.getGoalAccess().getGoalGoaLocationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGoaLocation();

            state._fsp--;

             after(grammarAccess.getGoalAccess().getGoalGoaLocationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Goal__GoalAssignment_2"


    // $ANTLR start "rule__Goal__LocValueAssignment_5"
    // InternalWail.g:1517:1: rule__Goal__LocValueAssignment_5 : ( RULE_INT ) ;
    public final void rule__Goal__LocValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1521:1: ( ( RULE_INT ) )
            // InternalWail.g:1522:2: ( RULE_INT )
            {
            // InternalWail.g:1522:2: ( RULE_INT )
            // InternalWail.g:1523:3: RULE_INT
            {
             before(grammarAccess.getGoalAccess().getLocValueINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getLocValueINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Goal__LocValueAssignment_5"


    // $ANTLR start "rule__GoaLocation__XAxisAssignment_1"
    // InternalWail.g:1532:1: rule__GoaLocation__XAxisAssignment_1 : ( RULE_INT ) ;
    public final void rule__GoaLocation__XAxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1536:1: ( ( RULE_INT ) )
            // InternalWail.g:1537:2: ( RULE_INT )
            {
            // InternalWail.g:1537:2: ( RULE_INT )
            // InternalWail.g:1538:3: RULE_INT
            {
             before(grammarAccess.getGoaLocationAccess().getXAxisINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGoaLocationAccess().getXAxisINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__GoaLocation__XAxisAssignment_1"


    // $ANTLR start "rule__GoaLocation__YAxisAssignment_3"
    // InternalWail.g:1547:1: rule__GoaLocation__YAxisAssignment_3 : ( RULE_INT ) ;
    public final void rule__GoaLocation__YAxisAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1551:1: ( ( RULE_INT ) )
            // InternalWail.g:1552:2: ( RULE_INT )
            {
            // InternalWail.g:1552:2: ( RULE_INT )
            // InternalWail.g:1553:3: RULE_INT
            {
             before(grammarAccess.getGoaLocationAccess().getYAxisINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGoaLocationAccess().getYAxisINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__GoaLocation__YAxisAssignment_3"


    // $ANTLR start "rule__Defualt_CA__CaTypeAssignment"
    // InternalWail.g:1562:1: rule__Defualt_CA__CaTypeAssignment : ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) ) ;
    public final void rule__Defualt_CA__CaTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWail.g:1566:1: ( ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) ) )
            // InternalWail.g:1567:2: ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) )
            {
            // InternalWail.g:1567:2: ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) )
            // InternalWail.g:1568:3: ( rule__Defualt_CA__CaTypeAlternatives_0 )
            {
             before(grammarAccess.getDefualt_CAAccess().getCaTypeAlternatives_0()); 
            // InternalWail.g:1569:3: ( rule__Defualt_CA__CaTypeAlternatives_0 )
            // InternalWail.g:1569:4: rule__Defualt_CA__CaTypeAlternatives_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000081800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000009FF800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001FF802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000082A000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});

}