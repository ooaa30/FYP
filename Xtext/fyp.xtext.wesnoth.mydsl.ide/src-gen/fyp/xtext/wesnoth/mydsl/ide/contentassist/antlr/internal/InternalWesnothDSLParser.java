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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'movement'", "'heal'", "'retreat'", "'move_to_targets'", "'basic_movement'", "'combat'", "'recruit'", "'combat_value_targets'", "'capture_villages'", "'leader_to_keep'", "'rule'", "'{'", "'}'", "'when:'", "'health'", "'-'", "'x'", "'y'", "'unit'", "'is'", "'goal'", "'='", "'always'"
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

                if ( (LA1_0==21) ) {
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


    // $ANTLR start "entryRuleBaseline"
    // InternalWesnothDSL.g:153:1: entryRuleBaseline : ruleBaseline EOF ;
    public final void entryRuleBaseline() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:154:1: ( ruleBaseline EOF )
            // InternalWesnothDSL.g:155:1: ruleBaseline EOF
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
    // InternalWesnothDSL.g:162:1: ruleBaseline : ( ( rule__Baseline__AlwaysAssignment ) ) ;
    public final void ruleBaseline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:166:2: ( ( ( rule__Baseline__AlwaysAssignment ) ) )
            // InternalWesnothDSL.g:167:2: ( ( rule__Baseline__AlwaysAssignment ) )
            {
            // InternalWesnothDSL.g:167:2: ( ( rule__Baseline__AlwaysAssignment ) )
            // InternalWesnothDSL.g:168:3: ( rule__Baseline__AlwaysAssignment )
            {
             before(grammarAccess.getBaselineAccess().getAlwaysAssignment()); 
            // InternalWesnothDSL.g:169:3: ( rule__Baseline__AlwaysAssignment )
            // InternalWesnothDSL.g:169:4: rule__Baseline__AlwaysAssignment
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
    // InternalWesnothDSL.g:178:1: entryRuleDamage : ruleDamage EOF ;
    public final void entryRuleDamage() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:179:1: ( ruleDamage EOF )
            // InternalWesnothDSL.g:180:1: ruleDamage EOF
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
    // InternalWesnothDSL.g:187:1: ruleDamage : ( ( rule__Damage__Group__0 ) ) ;
    public final void ruleDamage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:191:2: ( ( ( rule__Damage__Group__0 ) ) )
            // InternalWesnothDSL.g:192:2: ( ( rule__Damage__Group__0 ) )
            {
            // InternalWesnothDSL.g:192:2: ( ( rule__Damage__Group__0 ) )
            // InternalWesnothDSL.g:193:3: ( rule__Damage__Group__0 )
            {
             before(grammarAccess.getDamageAccess().getGroup()); 
            // InternalWesnothDSL.g:194:3: ( rule__Damage__Group__0 )
            // InternalWesnothDSL.g:194:4: rule__Damage__Group__0
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
    // InternalWesnothDSL.g:203:1: entryRuleAtLocation : ruleAtLocation EOF ;
    public final void entryRuleAtLocation() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:204:1: ( ruleAtLocation EOF )
            // InternalWesnothDSL.g:205:1: ruleAtLocation EOF
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
    // InternalWesnothDSL.g:212:1: ruleAtLocation : ( ( rule__AtLocation__Group__0 ) ) ;
    public final void ruleAtLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:216:2: ( ( ( rule__AtLocation__Group__0 ) ) )
            // InternalWesnothDSL.g:217:2: ( ( rule__AtLocation__Group__0 ) )
            {
            // InternalWesnothDSL.g:217:2: ( ( rule__AtLocation__Group__0 ) )
            // InternalWesnothDSL.g:218:3: ( rule__AtLocation__Group__0 )
            {
             before(grammarAccess.getAtLocationAccess().getGroup()); 
            // InternalWesnothDSL.g:219:3: ( rule__AtLocation__Group__0 )
            // InternalWesnothDSL.g:219:4: rule__AtLocation__Group__0
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
    // InternalWesnothDSL.g:228:1: entryRuleUnitEquals : ruleUnitEquals EOF ;
    public final void entryRuleUnitEquals() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:229:1: ( ruleUnitEquals EOF )
            // InternalWesnothDSL.g:230:1: ruleUnitEquals EOF
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
    // InternalWesnothDSL.g:237:1: ruleUnitEquals : ( ( rule__UnitEquals__Group__0 ) ) ;
    public final void ruleUnitEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:241:2: ( ( ( rule__UnitEquals__Group__0 ) ) )
            // InternalWesnothDSL.g:242:2: ( ( rule__UnitEquals__Group__0 ) )
            {
            // InternalWesnothDSL.g:242:2: ( ( rule__UnitEquals__Group__0 ) )
            // InternalWesnothDSL.g:243:3: ( rule__UnitEquals__Group__0 )
            {
             before(grammarAccess.getUnitEqualsAccess().getGroup()); 
            // InternalWesnothDSL.g:244:3: ( rule__UnitEquals__Group__0 )
            // InternalWesnothDSL.g:244:4: rule__UnitEquals__Group__0
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
    // InternalWesnothDSL.g:253:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:254:1: ( ruleGoal EOF )
            // InternalWesnothDSL.g:255:1: ruleGoal EOF
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
    // InternalWesnothDSL.g:262:1: ruleGoal : ( ( rule__Goal__Group__0 ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:266:2: ( ( ( rule__Goal__Group__0 ) ) )
            // InternalWesnothDSL.g:267:2: ( ( rule__Goal__Group__0 ) )
            {
            // InternalWesnothDSL.g:267:2: ( ( rule__Goal__Group__0 ) )
            // InternalWesnothDSL.g:268:3: ( rule__Goal__Group__0 )
            {
             before(grammarAccess.getGoalAccess().getGroup()); 
            // InternalWesnothDSL.g:269:3: ( rule__Goal__Group__0 )
            // InternalWesnothDSL.g:269:4: rule__Goal__Group__0
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


    // $ANTLR start "entryRuleGoalCondition"
    // InternalWesnothDSL.g:278:1: entryRuleGoalCondition : ruleGoalCondition EOF ;
    public final void entryRuleGoalCondition() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:279:1: ( ruleGoalCondition EOF )
            // InternalWesnothDSL.g:280:1: ruleGoalCondition EOF
            {
             before(grammarAccess.getGoalConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleGoalCondition();

            state._fsp--;

             after(grammarAccess.getGoalConditionRule()); 
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
    // $ANTLR end "entryRuleGoalCondition"


    // $ANTLR start "ruleGoalCondition"
    // InternalWesnothDSL.g:287:1: ruleGoalCondition : ( ( rule__GoalCondition__GoalAssignment ) ) ;
    public final void ruleGoalCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:291:2: ( ( ( rule__GoalCondition__GoalAssignment ) ) )
            // InternalWesnothDSL.g:292:2: ( ( rule__GoalCondition__GoalAssignment ) )
            {
            // InternalWesnothDSL.g:292:2: ( ( rule__GoalCondition__GoalAssignment ) )
            // InternalWesnothDSL.g:293:3: ( rule__GoalCondition__GoalAssignment )
            {
             before(grammarAccess.getGoalConditionAccess().getGoalAssignment()); 
            // InternalWesnothDSL.g:294:3: ( rule__GoalCondition__GoalAssignment )
            // InternalWesnothDSL.g:294:4: rule__GoalCondition__GoalAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GoalCondition__GoalAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGoalConditionAccess().getGoalAssignment()); 

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
    // $ANTLR end "ruleGoalCondition"


    // $ANTLR start "entryRuleLocation"
    // InternalWesnothDSL.g:303:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:304:1: ( ruleLocation EOF )
            // InternalWesnothDSL.g:305:1: ruleLocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalWesnothDSL.g:312:1: ruleLocation : ( ( rule__Location__Group__0 ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:316:2: ( ( ( rule__Location__Group__0 ) ) )
            // InternalWesnothDSL.g:317:2: ( ( rule__Location__Group__0 ) )
            {
            // InternalWesnothDSL.g:317:2: ( ( rule__Location__Group__0 ) )
            // InternalWesnothDSL.g:318:3: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // InternalWesnothDSL.g:319:3: ( rule__Location__Group__0 )
            // InternalWesnothDSL.g:319:4: rule__Location__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getGroup()); 

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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleDefualt_CA"
    // InternalWesnothDSL.g:328:1: entryRuleDefualt_CA : ruleDefualt_CA EOF ;
    public final void entryRuleDefualt_CA() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:329:1: ( ruleDefualt_CA EOF )
            // InternalWesnothDSL.g:330:1: ruleDefualt_CA EOF
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
    // InternalWesnothDSL.g:337:1: ruleDefualt_CA : ( ( rule__Defualt_CA__CaTypeAssignment ) ) ;
    public final void ruleDefualt_CA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:341:2: ( ( ( rule__Defualt_CA__CaTypeAssignment ) ) )
            // InternalWesnothDSL.g:342:2: ( ( rule__Defualt_CA__CaTypeAssignment ) )
            {
            // InternalWesnothDSL.g:342:2: ( ( rule__Defualt_CA__CaTypeAssignment ) )
            // InternalWesnothDSL.g:343:3: ( rule__Defualt_CA__CaTypeAssignment )
            {
             before(grammarAccess.getDefualt_CAAccess().getCaTypeAssignment()); 
            // InternalWesnothDSL.g:344:3: ( rule__Defualt_CA__CaTypeAssignment )
            // InternalWesnothDSL.g:344:4: rule__Defualt_CA__CaTypeAssignment
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
    // InternalWesnothDSL.g:352:1: rule__Conditional__Alternatives : ( ( ( rule__Conditional__Group_0__0 ) ) | ( ruleDamage ) | ( ruleUnitEquals ) | ( ruleBaseline ) );
    public final void rule__Conditional__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:356:1: ( ( ( rule__Conditional__Group_0__0 ) ) | ( ruleDamage ) | ( ruleUnitEquals ) | ( ruleBaseline ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 33:
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
                    // InternalWesnothDSL.g:357:2: ( ( rule__Conditional__Group_0__0 ) )
                    {
                    // InternalWesnothDSL.g:357:2: ( ( rule__Conditional__Group_0__0 ) )
                    // InternalWesnothDSL.g:358:3: ( rule__Conditional__Group_0__0 )
                    {
                     before(grammarAccess.getConditionalAccess().getGroup_0()); 
                    // InternalWesnothDSL.g:359:3: ( rule__Conditional__Group_0__0 )
                    // InternalWesnothDSL.g:359:4: rule__Conditional__Group_0__0
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
                    // InternalWesnothDSL.g:363:2: ( ruleDamage )
                    {
                    // InternalWesnothDSL.g:363:2: ( ruleDamage )
                    // InternalWesnothDSL.g:364:3: ruleDamage
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
                    // InternalWesnothDSL.g:369:2: ( ruleUnitEquals )
                    {
                    // InternalWesnothDSL.g:369:2: ( ruleUnitEquals )
                    // InternalWesnothDSL.g:370:3: ruleUnitEquals
                    {
                     before(grammarAccess.getConditionalAccess().getUnitEqualsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUnitEquals();

                    state._fsp--;

                     after(grammarAccess.getConditionalAccess().getUnitEqualsParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWesnothDSL.g:375:2: ( ruleBaseline )
                    {
                    // InternalWesnothDSL.g:375:2: ( ruleBaseline )
                    // InternalWesnothDSL.g:376:3: ruleBaseline
                    {
                     before(grammarAccess.getConditionalAccess().getBaselineParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBaseline();

                    state._fsp--;

                     after(grammarAccess.getConditionalAccess().getBaselineParserRuleCall_3()); 

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
    // InternalWesnothDSL.g:385:1: rule__Defualt_CA__CaTypeAlternatives_0 : ( ( 'movement' ) | ( 'heal' ) | ( 'retreat' ) | ( 'move_to_targets' ) | ( 'basic_movement' ) | ( 'combat' ) | ( 'recruit' ) | ( 'combat_value_targets' ) | ( 'capture_villages' ) | ( 'leader_to_keep' ) );
    public final void rule__Defualt_CA__CaTypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:389:1: ( ( 'movement' ) | ( 'heal' ) | ( 'retreat' ) | ( 'move_to_targets' ) | ( 'basic_movement' ) | ( 'combat' ) | ( 'recruit' ) | ( 'combat_value_targets' ) | ( 'capture_villages' ) | ( 'leader_to_keep' ) )
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
                    // InternalWesnothDSL.g:390:2: ( 'movement' )
                    {
                    // InternalWesnothDSL.g:390:2: ( 'movement' )
                    // InternalWesnothDSL.g:391:3: 'movement'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:396:2: ( 'heal' )
                    {
                    // InternalWesnothDSL.g:396:2: ( 'heal' )
                    // InternalWesnothDSL.g:397:3: 'heal'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeHealKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeHealKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWesnothDSL.g:402:2: ( 'retreat' )
                    {
                    // InternalWesnothDSL.g:402:2: ( 'retreat' )
                    // InternalWesnothDSL.g:403:3: 'retreat'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWesnothDSL.g:408:2: ( 'move_to_targets' )
                    {
                    // InternalWesnothDSL.g:408:2: ( 'move_to_targets' )
                    // InternalWesnothDSL.g:409:3: 'move_to_targets'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetsKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetsKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWesnothDSL.g:414:2: ( 'basic_movement' )
                    {
                    // InternalWesnothDSL.g:414:2: ( 'basic_movement' )
                    // InternalWesnothDSL.g:415:3: 'basic_movement'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeBasic_movementKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeBasic_movementKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWesnothDSL.g:420:2: ( 'combat' )
                    {
                    // InternalWesnothDSL.g:420:2: ( 'combat' )
                    // InternalWesnothDSL.g:421:3: 'combat'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalWesnothDSL.g:426:2: ( 'recruit' )
                    {
                    // InternalWesnothDSL.g:426:2: ( 'recruit' )
                    // InternalWesnothDSL.g:427:3: 'recruit'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalWesnothDSL.g:432:2: ( 'combat_value_targets' )
                    {
                    // InternalWesnothDSL.g:432:2: ( 'combat_value_targets' )
                    // InternalWesnothDSL.g:433:3: 'combat_value_targets'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeCombat_value_targetsKeyword_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeCombat_value_targetsKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalWesnothDSL.g:438:2: ( 'capture_villages' )
                    {
                    // InternalWesnothDSL.g:438:2: ( 'capture_villages' )
                    // InternalWesnothDSL.g:439:3: 'capture_villages'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalWesnothDSL.g:444:2: ( 'leader_to_keep' )
                    {
                    // InternalWesnothDSL.g:444:2: ( 'leader_to_keep' )
                    // InternalWesnothDSL.g:445:3: 'leader_to_keep'
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
    // InternalWesnothDSL.g:454:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:458:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalWesnothDSL.g:459:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalWesnothDSL.g:466:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:470:1: ( ( 'rule' ) )
            // InternalWesnothDSL.g:471:1: ( 'rule' )
            {
            // InternalWesnothDSL.g:471:1: ( 'rule' )
            // InternalWesnothDSL.g:472:2: 'rule'
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
    // InternalWesnothDSL.g:481:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:485:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalWesnothDSL.g:486:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalWesnothDSL.g:493:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:497:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalWesnothDSL.g:498:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalWesnothDSL.g:498:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalWesnothDSL.g:499:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalWesnothDSL.g:500:2: ( rule__Rule__NameAssignment_1 )
            // InternalWesnothDSL.g:500:3: rule__Rule__NameAssignment_1
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
    // InternalWesnothDSL.g:508:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:512:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalWesnothDSL.g:513:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalWesnothDSL.g:520:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:524:1: ( ( '{' ) )
            // InternalWesnothDSL.g:525:1: ( '{' )
            {
            // InternalWesnothDSL.g:525:1: ( '{' )
            // InternalWesnothDSL.g:526:2: '{'
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
    // InternalWesnothDSL.g:535:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:539:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalWesnothDSL.g:540:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalWesnothDSL.g:547:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__FragmentsAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:551:1: ( ( ( rule__Rule__FragmentsAssignment_3 ) ) )
            // InternalWesnothDSL.g:552:1: ( ( rule__Rule__FragmentsAssignment_3 ) )
            {
            // InternalWesnothDSL.g:552:1: ( ( rule__Rule__FragmentsAssignment_3 ) )
            // InternalWesnothDSL.g:553:2: ( rule__Rule__FragmentsAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getFragmentsAssignment_3()); 
            // InternalWesnothDSL.g:554:2: ( rule__Rule__FragmentsAssignment_3 )
            // InternalWesnothDSL.g:554:3: rule__Rule__FragmentsAssignment_3
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
    // InternalWesnothDSL.g:562:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:566:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalWesnothDSL.g:567:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalWesnothDSL.g:574:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__GoalsAssignment_4 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:578:1: ( ( ( rule__Rule__GoalsAssignment_4 )* ) )
            // InternalWesnothDSL.g:579:1: ( ( rule__Rule__GoalsAssignment_4 )* )
            {
            // InternalWesnothDSL.g:579:1: ( ( rule__Rule__GoalsAssignment_4 )* )
            // InternalWesnothDSL.g:580:2: ( rule__Rule__GoalsAssignment_4 )*
            {
             before(grammarAccess.getRuleAccess().getGoalsAssignment_4()); 
            // InternalWesnothDSL.g:581:2: ( rule__Rule__GoalsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==31) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWesnothDSL.g:581:3: rule__Rule__GoalsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Rule__GoalsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalWesnothDSL.g:589:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:593:1: ( rule__Rule__Group__5__Impl )
            // InternalWesnothDSL.g:594:2: rule__Rule__Group__5__Impl
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
    // InternalWesnothDSL.g:600:1: rule__Rule__Group__5__Impl : ( '}' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:604:1: ( ( '}' ) )
            // InternalWesnothDSL.g:605:1: ( '}' )
            {
            // InternalWesnothDSL.g:605:1: ( '}' )
            // InternalWesnothDSL.g:606:2: '}'
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
    // InternalWesnothDSL.g:616:1: rule__Fragment__Group__0 : rule__Fragment__Group__0__Impl rule__Fragment__Group__1 ;
    public final void rule__Fragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:620:1: ( rule__Fragment__Group__0__Impl rule__Fragment__Group__1 )
            // InternalWesnothDSL.g:621:2: rule__Fragment__Group__0__Impl rule__Fragment__Group__1
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
    // InternalWesnothDSL.g:628:1: rule__Fragment__Group__0__Impl : ( ( rule__Fragment__ConditionAssignment_0 ) ) ;
    public final void rule__Fragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:632:1: ( ( ( rule__Fragment__ConditionAssignment_0 ) ) )
            // InternalWesnothDSL.g:633:1: ( ( rule__Fragment__ConditionAssignment_0 ) )
            {
            // InternalWesnothDSL.g:633:1: ( ( rule__Fragment__ConditionAssignment_0 ) )
            // InternalWesnothDSL.g:634:2: ( rule__Fragment__ConditionAssignment_0 )
            {
             before(grammarAccess.getFragmentAccess().getConditionAssignment_0()); 
            // InternalWesnothDSL.g:635:2: ( rule__Fragment__ConditionAssignment_0 )
            // InternalWesnothDSL.g:635:3: rule__Fragment__ConditionAssignment_0
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
    // InternalWesnothDSL.g:643:1: rule__Fragment__Group__1 : rule__Fragment__Group__1__Impl rule__Fragment__Group__2 ;
    public final void rule__Fragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:647:1: ( rule__Fragment__Group__1__Impl rule__Fragment__Group__2 )
            // InternalWesnothDSL.g:648:2: rule__Fragment__Group__1__Impl rule__Fragment__Group__2
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
    // InternalWesnothDSL.g:655:1: rule__Fragment__Group__1__Impl : ( '{' ) ;
    public final void rule__Fragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:659:1: ( ( '{' ) )
            // InternalWesnothDSL.g:660:1: ( '{' )
            {
            // InternalWesnothDSL.g:660:1: ( '{' )
            // InternalWesnothDSL.g:661:2: '{'
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
    // InternalWesnothDSL.g:670:1: rule__Fragment__Group__2 : rule__Fragment__Group__2__Impl rule__Fragment__Group__3 ;
    public final void rule__Fragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:674:1: ( rule__Fragment__Group__2__Impl rule__Fragment__Group__3 )
            // InternalWesnothDSL.g:675:2: rule__Fragment__Group__2__Impl rule__Fragment__Group__3
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
    // InternalWesnothDSL.g:682:1: rule__Fragment__Group__2__Impl : ( ( rule__Fragment__Defualt_casAssignment_2 )* ) ;
    public final void rule__Fragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:686:1: ( ( ( rule__Fragment__Defualt_casAssignment_2 )* ) )
            // InternalWesnothDSL.g:687:1: ( ( rule__Fragment__Defualt_casAssignment_2 )* )
            {
            // InternalWesnothDSL.g:687:1: ( ( rule__Fragment__Defualt_casAssignment_2 )* )
            // InternalWesnothDSL.g:688:2: ( rule__Fragment__Defualt_casAssignment_2 )*
            {
             before(grammarAccess.getFragmentAccess().getDefualt_casAssignment_2()); 
            // InternalWesnothDSL.g:689:2: ( rule__Fragment__Defualt_casAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=11 && LA5_0<=20)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWesnothDSL.g:689:3: rule__Fragment__Defualt_casAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Fragment__Defualt_casAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalWesnothDSL.g:697:1: rule__Fragment__Group__3 : rule__Fragment__Group__3__Impl ;
    public final void rule__Fragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:701:1: ( rule__Fragment__Group__3__Impl )
            // InternalWesnothDSL.g:702:2: rule__Fragment__Group__3__Impl
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
    // InternalWesnothDSL.g:708:1: rule__Fragment__Group__3__Impl : ( '}' ) ;
    public final void rule__Fragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:712:1: ( ( '}' ) )
            // InternalWesnothDSL.g:713:1: ( '}' )
            {
            // InternalWesnothDSL.g:713:1: ( '}' )
            // InternalWesnothDSL.g:714:2: '}'
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


    // $ANTLR start "rule__Conditional__Group_0__0"
    // InternalWesnothDSL.g:724:1: rule__Conditional__Group_0__0 : rule__Conditional__Group_0__0__Impl rule__Conditional__Group_0__1 ;
    public final void rule__Conditional__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:728:1: ( rule__Conditional__Group_0__0__Impl rule__Conditional__Group_0__1 )
            // InternalWesnothDSL.g:729:2: rule__Conditional__Group_0__0__Impl rule__Conditional__Group_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalWesnothDSL.g:736:1: rule__Conditional__Group_0__0__Impl : ( 'when:' ) ;
    public final void rule__Conditional__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:740:1: ( ( 'when:' ) )
            // InternalWesnothDSL.g:741:1: ( 'when:' )
            {
            // InternalWesnothDSL.g:741:1: ( 'when:' )
            // InternalWesnothDSL.g:742:2: 'when:'
            {
             before(grammarAccess.getConditionalAccess().getWhenKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalWesnothDSL.g:751:1: rule__Conditional__Group_0__1 : rule__Conditional__Group_0__1__Impl ;
    public final void rule__Conditional__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:755:1: ( rule__Conditional__Group_0__1__Impl )
            // InternalWesnothDSL.g:756:2: rule__Conditional__Group_0__1__Impl
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
    // InternalWesnothDSL.g:762:1: rule__Conditional__Group_0__1__Impl : ( ( rule__Conditional__ConditionAssignment_0_1 ) ) ;
    public final void rule__Conditional__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:766:1: ( ( ( rule__Conditional__ConditionAssignment_0_1 ) ) )
            // InternalWesnothDSL.g:767:1: ( ( rule__Conditional__ConditionAssignment_0_1 ) )
            {
            // InternalWesnothDSL.g:767:1: ( ( rule__Conditional__ConditionAssignment_0_1 ) )
            // InternalWesnothDSL.g:768:2: ( rule__Conditional__ConditionAssignment_0_1 )
            {
             before(grammarAccess.getConditionalAccess().getConditionAssignment_0_1()); 
            // InternalWesnothDSL.g:769:2: ( rule__Conditional__ConditionAssignment_0_1 )
            // InternalWesnothDSL.g:769:3: rule__Conditional__ConditionAssignment_0_1
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
    // InternalWesnothDSL.g:778:1: rule__Damage__Group__0 : rule__Damage__Group__0__Impl rule__Damage__Group__1 ;
    public final void rule__Damage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:782:1: ( rule__Damage__Group__0__Impl rule__Damage__Group__1 )
            // InternalWesnothDSL.g:783:2: rule__Damage__Group__0__Impl rule__Damage__Group__1
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
    // InternalWesnothDSL.g:790:1: rule__Damage__Group__0__Impl : ( 'health' ) ;
    public final void rule__Damage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:794:1: ( ( 'health' ) )
            // InternalWesnothDSL.g:795:1: ( 'health' )
            {
            // InternalWesnothDSL.g:795:1: ( 'health' )
            // InternalWesnothDSL.g:796:2: 'health'
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
    // InternalWesnothDSL.g:805:1: rule__Damage__Group__1 : rule__Damage__Group__1__Impl rule__Damage__Group__2 ;
    public final void rule__Damage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:809:1: ( rule__Damage__Group__1__Impl rule__Damage__Group__2 )
            // InternalWesnothDSL.g:810:2: rule__Damage__Group__1__Impl rule__Damage__Group__2
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
    // InternalWesnothDSL.g:817:1: rule__Damage__Group__1__Impl : ( '-' ) ;
    public final void rule__Damage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:821:1: ( ( '-' ) )
            // InternalWesnothDSL.g:822:1: ( '-' )
            {
            // InternalWesnothDSL.g:822:1: ( '-' )
            // InternalWesnothDSL.g:823:2: '-'
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
    // InternalWesnothDSL.g:832:1: rule__Damage__Group__2 : rule__Damage__Group__2__Impl ;
    public final void rule__Damage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:836:1: ( rule__Damage__Group__2__Impl )
            // InternalWesnothDSL.g:837:2: rule__Damage__Group__2__Impl
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
    // InternalWesnothDSL.g:843:1: rule__Damage__Group__2__Impl : ( ( rule__Damage__HealthAssignment_2 ) ) ;
    public final void rule__Damage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:847:1: ( ( ( rule__Damage__HealthAssignment_2 ) ) )
            // InternalWesnothDSL.g:848:1: ( ( rule__Damage__HealthAssignment_2 ) )
            {
            // InternalWesnothDSL.g:848:1: ( ( rule__Damage__HealthAssignment_2 ) )
            // InternalWesnothDSL.g:849:2: ( rule__Damage__HealthAssignment_2 )
            {
             before(grammarAccess.getDamageAccess().getHealthAssignment_2()); 
            // InternalWesnothDSL.g:850:2: ( rule__Damage__HealthAssignment_2 )
            // InternalWesnothDSL.g:850:3: rule__Damage__HealthAssignment_2
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
    // InternalWesnothDSL.g:859:1: rule__AtLocation__Group__0 : rule__AtLocation__Group__0__Impl rule__AtLocation__Group__1 ;
    public final void rule__AtLocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:863:1: ( rule__AtLocation__Group__0__Impl rule__AtLocation__Group__1 )
            // InternalWesnothDSL.g:864:2: rule__AtLocation__Group__0__Impl rule__AtLocation__Group__1
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
    // InternalWesnothDSL.g:871:1: rule__AtLocation__Group__0__Impl : ( 'x' ) ;
    public final void rule__AtLocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:875:1: ( ( 'x' ) )
            // InternalWesnothDSL.g:876:1: ( 'x' )
            {
            // InternalWesnothDSL.g:876:1: ( 'x' )
            // InternalWesnothDSL.g:877:2: 'x'
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
    // InternalWesnothDSL.g:886:1: rule__AtLocation__Group__1 : rule__AtLocation__Group__1__Impl rule__AtLocation__Group__2 ;
    public final void rule__AtLocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:890:1: ( rule__AtLocation__Group__1__Impl rule__AtLocation__Group__2 )
            // InternalWesnothDSL.g:891:2: rule__AtLocation__Group__1__Impl rule__AtLocation__Group__2
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
    // InternalWesnothDSL.g:898:1: rule__AtLocation__Group__1__Impl : ( ( rule__AtLocation__XAssignment_1 ) ) ;
    public final void rule__AtLocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:902:1: ( ( ( rule__AtLocation__XAssignment_1 ) ) )
            // InternalWesnothDSL.g:903:1: ( ( rule__AtLocation__XAssignment_1 ) )
            {
            // InternalWesnothDSL.g:903:1: ( ( rule__AtLocation__XAssignment_1 ) )
            // InternalWesnothDSL.g:904:2: ( rule__AtLocation__XAssignment_1 )
            {
             before(grammarAccess.getAtLocationAccess().getXAssignment_1()); 
            // InternalWesnothDSL.g:905:2: ( rule__AtLocation__XAssignment_1 )
            // InternalWesnothDSL.g:905:3: rule__AtLocation__XAssignment_1
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
    // InternalWesnothDSL.g:913:1: rule__AtLocation__Group__2 : rule__AtLocation__Group__2__Impl rule__AtLocation__Group__3 ;
    public final void rule__AtLocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:917:1: ( rule__AtLocation__Group__2__Impl rule__AtLocation__Group__3 )
            // InternalWesnothDSL.g:918:2: rule__AtLocation__Group__2__Impl rule__AtLocation__Group__3
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
    // InternalWesnothDSL.g:925:1: rule__AtLocation__Group__2__Impl : ( 'y' ) ;
    public final void rule__AtLocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:929:1: ( ( 'y' ) )
            // InternalWesnothDSL.g:930:1: ( 'y' )
            {
            // InternalWesnothDSL.g:930:1: ( 'y' )
            // InternalWesnothDSL.g:931:2: 'y'
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
    // InternalWesnothDSL.g:940:1: rule__AtLocation__Group__3 : rule__AtLocation__Group__3__Impl ;
    public final void rule__AtLocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:944:1: ( rule__AtLocation__Group__3__Impl )
            // InternalWesnothDSL.g:945:2: rule__AtLocation__Group__3__Impl
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
    // InternalWesnothDSL.g:951:1: rule__AtLocation__Group__3__Impl : ( ( rule__AtLocation__YAssignment_3 ) ) ;
    public final void rule__AtLocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:955:1: ( ( ( rule__AtLocation__YAssignment_3 ) ) )
            // InternalWesnothDSL.g:956:1: ( ( rule__AtLocation__YAssignment_3 ) )
            {
            // InternalWesnothDSL.g:956:1: ( ( rule__AtLocation__YAssignment_3 ) )
            // InternalWesnothDSL.g:957:2: ( rule__AtLocation__YAssignment_3 )
            {
             before(grammarAccess.getAtLocationAccess().getYAssignment_3()); 
            // InternalWesnothDSL.g:958:2: ( rule__AtLocation__YAssignment_3 )
            // InternalWesnothDSL.g:958:3: rule__AtLocation__YAssignment_3
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
    // InternalWesnothDSL.g:967:1: rule__UnitEquals__Group__0 : rule__UnitEquals__Group__0__Impl rule__UnitEquals__Group__1 ;
    public final void rule__UnitEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:971:1: ( rule__UnitEquals__Group__0__Impl rule__UnitEquals__Group__1 )
            // InternalWesnothDSL.g:972:2: rule__UnitEquals__Group__0__Impl rule__UnitEquals__Group__1
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
    // InternalWesnothDSL.g:979:1: rule__UnitEquals__Group__0__Impl : ( 'unit' ) ;
    public final void rule__UnitEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:983:1: ( ( 'unit' ) )
            // InternalWesnothDSL.g:984:1: ( 'unit' )
            {
            // InternalWesnothDSL.g:984:1: ( 'unit' )
            // InternalWesnothDSL.g:985:2: 'unit'
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
    // InternalWesnothDSL.g:994:1: rule__UnitEquals__Group__1 : rule__UnitEquals__Group__1__Impl rule__UnitEquals__Group__2 ;
    public final void rule__UnitEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:998:1: ( rule__UnitEquals__Group__1__Impl rule__UnitEquals__Group__2 )
            // InternalWesnothDSL.g:999:2: rule__UnitEquals__Group__1__Impl rule__UnitEquals__Group__2
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
    // InternalWesnothDSL.g:1006:1: rule__UnitEquals__Group__1__Impl : ( 'is' ) ;
    public final void rule__UnitEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1010:1: ( ( 'is' ) )
            // InternalWesnothDSL.g:1011:1: ( 'is' )
            {
            // InternalWesnothDSL.g:1011:1: ( 'is' )
            // InternalWesnothDSL.g:1012:2: 'is'
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
    // InternalWesnothDSL.g:1021:1: rule__UnitEquals__Group__2 : rule__UnitEquals__Group__2__Impl ;
    public final void rule__UnitEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1025:1: ( rule__UnitEquals__Group__2__Impl )
            // InternalWesnothDSL.g:1026:2: rule__UnitEquals__Group__2__Impl
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
    // InternalWesnothDSL.g:1032:1: rule__UnitEquals__Group__2__Impl : ( ( rule__UnitEquals__UnitAssignment_2 ) ) ;
    public final void rule__UnitEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1036:1: ( ( ( rule__UnitEquals__UnitAssignment_2 ) ) )
            // InternalWesnothDSL.g:1037:1: ( ( rule__UnitEquals__UnitAssignment_2 ) )
            {
            // InternalWesnothDSL.g:1037:1: ( ( rule__UnitEquals__UnitAssignment_2 ) )
            // InternalWesnothDSL.g:1038:2: ( rule__UnitEquals__UnitAssignment_2 )
            {
             before(grammarAccess.getUnitEqualsAccess().getUnitAssignment_2()); 
            // InternalWesnothDSL.g:1039:2: ( rule__UnitEquals__UnitAssignment_2 )
            // InternalWesnothDSL.g:1039:3: rule__UnitEquals__UnitAssignment_2
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
    // InternalWesnothDSL.g:1048:1: rule__Goal__Group__0 : rule__Goal__Group__0__Impl rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1052:1: ( rule__Goal__Group__0__Impl rule__Goal__Group__1 )
            // InternalWesnothDSL.g:1053:2: rule__Goal__Group__0__Impl rule__Goal__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalWesnothDSL.g:1060:1: rule__Goal__Group__0__Impl : ( 'goal' ) ;
    public final void rule__Goal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1064:1: ( ( 'goal' ) )
            // InternalWesnothDSL.g:1065:1: ( 'goal' )
            {
            // InternalWesnothDSL.g:1065:1: ( 'goal' )
            // InternalWesnothDSL.g:1066:2: 'goal'
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
    // InternalWesnothDSL.g:1075:1: rule__Goal__Group__1 : rule__Goal__Group__1__Impl rule__Goal__Group__2 ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1079:1: ( rule__Goal__Group__1__Impl rule__Goal__Group__2 )
            // InternalWesnothDSL.g:1080:2: rule__Goal__Group__1__Impl rule__Goal__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalWesnothDSL.g:1087:1: rule__Goal__Group__1__Impl : ( '=' ) ;
    public final void rule__Goal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1091:1: ( ( '=' ) )
            // InternalWesnothDSL.g:1092:1: ( '=' )
            {
            // InternalWesnothDSL.g:1092:1: ( '=' )
            // InternalWesnothDSL.g:1093:2: '='
            {
             before(grammarAccess.getGoalAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getEqualsSignKeyword_1()); 

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
    // InternalWesnothDSL.g:1102:1: rule__Goal__Group__2 : rule__Goal__Group__2__Impl ;
    public final void rule__Goal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1106:1: ( rule__Goal__Group__2__Impl )
            // InternalWesnothDSL.g:1107:2: rule__Goal__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goal__Group__2__Impl();

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
    // InternalWesnothDSL.g:1113:1: rule__Goal__Group__2__Impl : ( ( rule__Goal__GoalAssignment_2 ) ) ;
    public final void rule__Goal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1117:1: ( ( ( rule__Goal__GoalAssignment_2 ) ) )
            // InternalWesnothDSL.g:1118:1: ( ( rule__Goal__GoalAssignment_2 ) )
            {
            // InternalWesnothDSL.g:1118:1: ( ( rule__Goal__GoalAssignment_2 ) )
            // InternalWesnothDSL.g:1119:2: ( rule__Goal__GoalAssignment_2 )
            {
             before(grammarAccess.getGoalAccess().getGoalAssignment_2()); 
            // InternalWesnothDSL.g:1120:2: ( rule__Goal__GoalAssignment_2 )
            // InternalWesnothDSL.g:1120:3: rule__Goal__GoalAssignment_2
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


    // $ANTLR start "rule__Location__Group__0"
    // InternalWesnothDSL.g:1129:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1133:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // InternalWesnothDSL.g:1134:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Location__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__1();

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
    // $ANTLR end "rule__Location__Group__0"


    // $ANTLR start "rule__Location__Group__0__Impl"
    // InternalWesnothDSL.g:1141:1: rule__Location__Group__0__Impl : ( 'x' ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1145:1: ( ( 'x' ) )
            // InternalWesnothDSL.g:1146:1: ( 'x' )
            {
            // InternalWesnothDSL.g:1146:1: ( 'x' )
            // InternalWesnothDSL.g:1147:2: 'x'
            {
             before(grammarAccess.getLocationAccess().getXKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getXKeyword_0()); 

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
    // $ANTLR end "rule__Location__Group__0__Impl"


    // $ANTLR start "rule__Location__Group__1"
    // InternalWesnothDSL.g:1156:1: rule__Location__Group__1 : rule__Location__Group__1__Impl rule__Location__Group__2 ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1160:1: ( rule__Location__Group__1__Impl rule__Location__Group__2 )
            // InternalWesnothDSL.g:1161:2: rule__Location__Group__1__Impl rule__Location__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Location__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__2();

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
    // $ANTLR end "rule__Location__Group__1"


    // $ANTLR start "rule__Location__Group__1__Impl"
    // InternalWesnothDSL.g:1168:1: rule__Location__Group__1__Impl : ( ( rule__Location__XAssignment_1 ) ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1172:1: ( ( ( rule__Location__XAssignment_1 ) ) )
            // InternalWesnothDSL.g:1173:1: ( ( rule__Location__XAssignment_1 ) )
            {
            // InternalWesnothDSL.g:1173:1: ( ( rule__Location__XAssignment_1 ) )
            // InternalWesnothDSL.g:1174:2: ( rule__Location__XAssignment_1 )
            {
             before(grammarAccess.getLocationAccess().getXAssignment_1()); 
            // InternalWesnothDSL.g:1175:2: ( rule__Location__XAssignment_1 )
            // InternalWesnothDSL.g:1175:3: rule__Location__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Location__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getXAssignment_1()); 

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
    // $ANTLR end "rule__Location__Group__1__Impl"


    // $ANTLR start "rule__Location__Group__2"
    // InternalWesnothDSL.g:1183:1: rule__Location__Group__2 : rule__Location__Group__2__Impl rule__Location__Group__3 ;
    public final void rule__Location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1187:1: ( rule__Location__Group__2__Impl rule__Location__Group__3 )
            // InternalWesnothDSL.g:1188:2: rule__Location__Group__2__Impl rule__Location__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Location__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__3();

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
    // $ANTLR end "rule__Location__Group__2"


    // $ANTLR start "rule__Location__Group__2__Impl"
    // InternalWesnothDSL.g:1195:1: rule__Location__Group__2__Impl : ( 'y' ) ;
    public final void rule__Location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1199:1: ( ( 'y' ) )
            // InternalWesnothDSL.g:1200:1: ( 'y' )
            {
            // InternalWesnothDSL.g:1200:1: ( 'y' )
            // InternalWesnothDSL.g:1201:2: 'y'
            {
             before(grammarAccess.getLocationAccess().getYKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getYKeyword_2()); 

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
    // $ANTLR end "rule__Location__Group__2__Impl"


    // $ANTLR start "rule__Location__Group__3"
    // InternalWesnothDSL.g:1210:1: rule__Location__Group__3 : rule__Location__Group__3__Impl ;
    public final void rule__Location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1214:1: ( rule__Location__Group__3__Impl )
            // InternalWesnothDSL.g:1215:2: rule__Location__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__3__Impl();

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
    // $ANTLR end "rule__Location__Group__3"


    // $ANTLR start "rule__Location__Group__3__Impl"
    // InternalWesnothDSL.g:1221:1: rule__Location__Group__3__Impl : ( ( rule__Location__YAssignment_3 ) ) ;
    public final void rule__Location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1225:1: ( ( ( rule__Location__YAssignment_3 ) ) )
            // InternalWesnothDSL.g:1226:1: ( ( rule__Location__YAssignment_3 ) )
            {
            // InternalWesnothDSL.g:1226:1: ( ( rule__Location__YAssignment_3 ) )
            // InternalWesnothDSL.g:1227:2: ( rule__Location__YAssignment_3 )
            {
             before(grammarAccess.getLocationAccess().getYAssignment_3()); 
            // InternalWesnothDSL.g:1228:2: ( rule__Location__YAssignment_3 )
            // InternalWesnothDSL.g:1228:3: rule__Location__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Location__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getYAssignment_3()); 

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
    // $ANTLR end "rule__Location__Group__3__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalWesnothDSL.g:1237:1: rule__Model__ElementsAssignment : ( ruleRule ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1241:1: ( ( ruleRule ) )
            // InternalWesnothDSL.g:1242:2: ( ruleRule )
            {
            // InternalWesnothDSL.g:1242:2: ( ruleRule )
            // InternalWesnothDSL.g:1243:3: ruleRule
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
    // InternalWesnothDSL.g:1252:1: rule__Rule__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1256:1: ( ( RULE_STRING ) )
            // InternalWesnothDSL.g:1257:2: ( RULE_STRING )
            {
            // InternalWesnothDSL.g:1257:2: ( RULE_STRING )
            // InternalWesnothDSL.g:1258:3: RULE_STRING
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
    // InternalWesnothDSL.g:1267:1: rule__Rule__FragmentsAssignment_3 : ( ruleFragment ) ;
    public final void rule__Rule__FragmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1271:1: ( ( ruleFragment ) )
            // InternalWesnothDSL.g:1272:2: ( ruleFragment )
            {
            // InternalWesnothDSL.g:1272:2: ( ruleFragment )
            // InternalWesnothDSL.g:1273:3: ruleFragment
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
    // InternalWesnothDSL.g:1282:1: rule__Rule__GoalsAssignment_4 : ( ruleGoal ) ;
    public final void rule__Rule__GoalsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1286:1: ( ( ruleGoal ) )
            // InternalWesnothDSL.g:1287:2: ( ruleGoal )
            {
            // InternalWesnothDSL.g:1287:2: ( ruleGoal )
            // InternalWesnothDSL.g:1288:3: ruleGoal
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
    // InternalWesnothDSL.g:1297:1: rule__Fragment__ConditionAssignment_0 : ( ruleConditional ) ;
    public final void rule__Fragment__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1301:1: ( ( ruleConditional ) )
            // InternalWesnothDSL.g:1302:2: ( ruleConditional )
            {
            // InternalWesnothDSL.g:1302:2: ( ruleConditional )
            // InternalWesnothDSL.g:1303:3: ruleConditional
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
    // InternalWesnothDSL.g:1312:1: rule__Fragment__Defualt_casAssignment_2 : ( ruleDefualt_CA ) ;
    public final void rule__Fragment__Defualt_casAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1316:1: ( ( ruleDefualt_CA ) )
            // InternalWesnothDSL.g:1317:2: ( ruleDefualt_CA )
            {
            // InternalWesnothDSL.g:1317:2: ( ruleDefualt_CA )
            // InternalWesnothDSL.g:1318:3: ruleDefualt_CA
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
    // InternalWesnothDSL.g:1327:1: rule__Conditional__ConditionAssignment_0_1 : ( ruleAtLocation ) ;
    public final void rule__Conditional__ConditionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1331:1: ( ( ruleAtLocation ) )
            // InternalWesnothDSL.g:1332:2: ( ruleAtLocation )
            {
            // InternalWesnothDSL.g:1332:2: ( ruleAtLocation )
            // InternalWesnothDSL.g:1333:3: ruleAtLocation
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


    // $ANTLR start "rule__Baseline__AlwaysAssignment"
    // InternalWesnothDSL.g:1342:1: rule__Baseline__AlwaysAssignment : ( ( 'always' ) ) ;
    public final void rule__Baseline__AlwaysAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1346:1: ( ( ( 'always' ) ) )
            // InternalWesnothDSL.g:1347:2: ( ( 'always' ) )
            {
            // InternalWesnothDSL.g:1347:2: ( ( 'always' ) )
            // InternalWesnothDSL.g:1348:3: ( 'always' )
            {
             before(grammarAccess.getBaselineAccess().getAlwaysAlwaysKeyword_0()); 
            // InternalWesnothDSL.g:1349:3: ( 'always' )
            // InternalWesnothDSL.g:1350:4: 'always'
            {
             before(grammarAccess.getBaselineAccess().getAlwaysAlwaysKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalWesnothDSL.g:1361:1: rule__Damage__HealthAssignment_2 : ( RULE_INT ) ;
    public final void rule__Damage__HealthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1365:1: ( ( RULE_INT ) )
            // InternalWesnothDSL.g:1366:2: ( RULE_INT )
            {
            // InternalWesnothDSL.g:1366:2: ( RULE_INT )
            // InternalWesnothDSL.g:1367:3: RULE_INT
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
    // InternalWesnothDSL.g:1376:1: rule__AtLocation__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__AtLocation__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1380:1: ( ( RULE_INT ) )
            // InternalWesnothDSL.g:1381:2: ( RULE_INT )
            {
            // InternalWesnothDSL.g:1381:2: ( RULE_INT )
            // InternalWesnothDSL.g:1382:3: RULE_INT
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
    // InternalWesnothDSL.g:1391:1: rule__AtLocation__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__AtLocation__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1395:1: ( ( RULE_INT ) )
            // InternalWesnothDSL.g:1396:2: ( RULE_INT )
            {
            // InternalWesnothDSL.g:1396:2: ( RULE_INT )
            // InternalWesnothDSL.g:1397:3: RULE_INT
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
    // InternalWesnothDSL.g:1406:1: rule__UnitEquals__UnitAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UnitEquals__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1410:1: ( ( RULE_STRING ) )
            // InternalWesnothDSL.g:1411:2: ( RULE_STRING )
            {
            // InternalWesnothDSL.g:1411:2: ( RULE_STRING )
            // InternalWesnothDSL.g:1412:3: RULE_STRING
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
    // InternalWesnothDSL.g:1421:1: rule__Goal__GoalAssignment_2 : ( ruleGoalCondition ) ;
    public final void rule__Goal__GoalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1425:1: ( ( ruleGoalCondition ) )
            // InternalWesnothDSL.g:1426:2: ( ruleGoalCondition )
            {
            // InternalWesnothDSL.g:1426:2: ( ruleGoalCondition )
            // InternalWesnothDSL.g:1427:3: ruleGoalCondition
            {
             before(grammarAccess.getGoalAccess().getGoalGoalConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGoalCondition();

            state._fsp--;

             after(grammarAccess.getGoalAccess().getGoalGoalConditionParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__GoalCondition__GoalAssignment"
    // InternalWesnothDSL.g:1436:1: rule__GoalCondition__GoalAssignment : ( ruleLocation ) ;
    public final void rule__GoalCondition__GoalAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1440:1: ( ( ruleLocation ) )
            // InternalWesnothDSL.g:1441:2: ( ruleLocation )
            {
            // InternalWesnothDSL.g:1441:2: ( ruleLocation )
            // InternalWesnothDSL.g:1442:3: ruleLocation
            {
             before(grammarAccess.getGoalConditionAccess().getGoalLocationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getGoalConditionAccess().getGoalLocationParserRuleCall_0()); 

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
    // $ANTLR end "rule__GoalCondition__GoalAssignment"


    // $ANTLR start "rule__Location__XAssignment_1"
    // InternalWesnothDSL.g:1451:1: rule__Location__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Location__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1455:1: ( ( RULE_INT ) )
            // InternalWesnothDSL.g:1456:2: ( RULE_INT )
            {
            // InternalWesnothDSL.g:1456:2: ( RULE_INT )
            // InternalWesnothDSL.g:1457:3: RULE_INT
            {
             before(grammarAccess.getLocationAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getXINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Location__XAssignment_1"


    // $ANTLR start "rule__Location__YAssignment_3"
    // InternalWesnothDSL.g:1466:1: rule__Location__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Location__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1470:1: ( ( RULE_INT ) )
            // InternalWesnothDSL.g:1471:2: ( RULE_INT )
            {
            // InternalWesnothDSL.g:1471:2: ( RULE_INT )
            // InternalWesnothDSL.g:1472:3: RULE_INT
            {
             before(grammarAccess.getLocationAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getYINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Location__YAssignment_3"


    // $ANTLR start "rule__Defualt_CA__CaTypeAssignment"
    // InternalWesnothDSL.g:1481:1: rule__Defualt_CA__CaTypeAssignment : ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) ) ;
    public final void rule__Defualt_CA__CaTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:1485:1: ( ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) ) )
            // InternalWesnothDSL.g:1486:2: ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) )
            {
            // InternalWesnothDSL.g:1486:2: ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) )
            // InternalWesnothDSL.g:1487:3: ( rule__Defualt_CA__CaTypeAlternatives_0 )
            {
             before(grammarAccess.getDefualt_CAAccess().getCaTypeAlternatives_0()); 
            // InternalWesnothDSL.g:1488:3: ( rule__Defualt_CA__CaTypeAlternatives_0 )
            // InternalWesnothDSL.g:1488:4: rule__Defualt_CA__CaTypeAlternatives_0
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000223000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000009FF800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001FF802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});

}