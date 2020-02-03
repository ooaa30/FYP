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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'goal'", "'newCA'", "'movement'", "'retreat'", "'move_to_target'", "'combat'", "'recruit'", "'focus_high_xp'", "'move_to_enemy'", "'capture_villages'", "'rule'", "'{'", "'}'", "'unitID'"
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


    // $ANTLR start "entryRuleUnitID"
    // InternalWesnothDSL.g:103:1: entryRuleUnitID : ruleUnitID EOF ;
    public final void entryRuleUnitID() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:104:1: ( ruleUnitID EOF )
            // InternalWesnothDSL.g:105:1: ruleUnitID EOF
            {
             before(grammarAccess.getUnitIDRule()); 
            pushFollow(FOLLOW_1);
            ruleUnitID();

            state._fsp--;

             after(grammarAccess.getUnitIDRule()); 
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
    // $ANTLR end "entryRuleUnitID"


    // $ANTLR start "ruleUnitID"
    // InternalWesnothDSL.g:112:1: ruleUnitID : ( ( rule__UnitID__Group__0 ) ) ;
    public final void ruleUnitID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:116:2: ( ( ( rule__UnitID__Group__0 ) ) )
            // InternalWesnothDSL.g:117:2: ( ( rule__UnitID__Group__0 ) )
            {
            // InternalWesnothDSL.g:117:2: ( ( rule__UnitID__Group__0 ) )
            // InternalWesnothDSL.g:118:3: ( rule__UnitID__Group__0 )
            {
             before(grammarAccess.getUnitIDAccess().getGroup()); 
            // InternalWesnothDSL.g:119:3: ( rule__UnitID__Group__0 )
            // InternalWesnothDSL.g:119:4: rule__UnitID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnitID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnitIDAccess().getGroup()); 

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
    // $ANTLR end "ruleUnitID"


    // $ANTLR start "entryRuleBehaviour"
    // InternalWesnothDSL.g:128:1: entryRuleBehaviour : ruleBehaviour EOF ;
    public final void entryRuleBehaviour() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:129:1: ( ruleBehaviour EOF )
            // InternalWesnothDSL.g:130:1: ruleBehaviour EOF
            {
             before(grammarAccess.getBehaviourRule()); 
            pushFollow(FOLLOW_1);
            ruleBehaviour();

            state._fsp--;

             after(grammarAccess.getBehaviourRule()); 
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
    // $ANTLR end "entryRuleBehaviour"


    // $ANTLR start "ruleBehaviour"
    // InternalWesnothDSL.g:137:1: ruleBehaviour : ( ( rule__Behaviour__Alternatives ) ) ;
    public final void ruleBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:141:2: ( ( ( rule__Behaviour__Alternatives ) ) )
            // InternalWesnothDSL.g:142:2: ( ( rule__Behaviour__Alternatives ) )
            {
            // InternalWesnothDSL.g:142:2: ( ( rule__Behaviour__Alternatives ) )
            // InternalWesnothDSL.g:143:3: ( rule__Behaviour__Alternatives )
            {
             before(grammarAccess.getBehaviourAccess().getAlternatives()); 
            // InternalWesnothDSL.g:144:3: ( rule__Behaviour__Alternatives )
            // InternalWesnothDSL.g:144:4: rule__Behaviour__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Behaviour__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBehaviour"


    // $ANTLR start "entryRuleGoal"
    // InternalWesnothDSL.g:153:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:154:1: ( ruleGoal EOF )
            // InternalWesnothDSL.g:155:1: ruleGoal EOF
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
    // InternalWesnothDSL.g:162:1: ruleGoal : ( 'goal' ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:166:2: ( ( 'goal' ) )
            // InternalWesnothDSL.g:167:2: ( 'goal' )
            {
            // InternalWesnothDSL.g:167:2: ( 'goal' )
            // InternalWesnothDSL.g:168:3: 'goal'
            {
             before(grammarAccess.getGoalAccess().getGoalKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getGoalKeyword()); 

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


    // $ANTLR start "entryRuleCandidate_Action"
    // InternalWesnothDSL.g:178:1: entryRuleCandidate_Action : ruleCandidate_Action EOF ;
    public final void entryRuleCandidate_Action() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:179:1: ( ruleCandidate_Action EOF )
            // InternalWesnothDSL.g:180:1: ruleCandidate_Action EOF
            {
             before(grammarAccess.getCandidate_ActionRule()); 
            pushFollow(FOLLOW_1);
            ruleCandidate_Action();

            state._fsp--;

             after(grammarAccess.getCandidate_ActionRule()); 
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
    // $ANTLR end "entryRuleCandidate_Action"


    // $ANTLR start "ruleCandidate_Action"
    // InternalWesnothDSL.g:187:1: ruleCandidate_Action : ( ( rule__Candidate_Action__Alternatives ) ) ;
    public final void ruleCandidate_Action() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:191:2: ( ( ( rule__Candidate_Action__Alternatives ) ) )
            // InternalWesnothDSL.g:192:2: ( ( rule__Candidate_Action__Alternatives ) )
            {
            // InternalWesnothDSL.g:192:2: ( ( rule__Candidate_Action__Alternatives ) )
            // InternalWesnothDSL.g:193:3: ( rule__Candidate_Action__Alternatives )
            {
             before(grammarAccess.getCandidate_ActionAccess().getAlternatives()); 
            // InternalWesnothDSL.g:194:3: ( rule__Candidate_Action__Alternatives )
            // InternalWesnothDSL.g:194:4: rule__Candidate_Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Candidate_Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCandidate_ActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCandidate_Action"


    // $ANTLR start "entryRuleNew_CA"
    // InternalWesnothDSL.g:203:1: entryRuleNew_CA : ruleNew_CA EOF ;
    public final void entryRuleNew_CA() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:204:1: ( ruleNew_CA EOF )
            // InternalWesnothDSL.g:205:1: ruleNew_CA EOF
            {
             before(grammarAccess.getNew_CARule()); 
            pushFollow(FOLLOW_1);
            ruleNew_CA();

            state._fsp--;

             after(grammarAccess.getNew_CARule()); 
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
    // $ANTLR end "entryRuleNew_CA"


    // $ANTLR start "ruleNew_CA"
    // InternalWesnothDSL.g:212:1: ruleNew_CA : ( 'newCA' ) ;
    public final void ruleNew_CA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:216:2: ( ( 'newCA' ) )
            // InternalWesnothDSL.g:217:2: ( 'newCA' )
            {
            // InternalWesnothDSL.g:217:2: ( 'newCA' )
            // InternalWesnothDSL.g:218:3: 'newCA'
            {
             before(grammarAccess.getNew_CAAccess().getNewCAKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNew_CAAccess().getNewCAKeyword()); 

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
    // $ANTLR end "ruleNew_CA"


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
    // InternalWesnothDSL.g:237:1: ruleDefualt_CA : ( ( rule__Defualt_CA__Alternatives ) ) ;
    public final void ruleDefualt_CA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:241:2: ( ( ( rule__Defualt_CA__Alternatives ) ) )
            // InternalWesnothDSL.g:242:2: ( ( rule__Defualt_CA__Alternatives ) )
            {
            // InternalWesnothDSL.g:242:2: ( ( rule__Defualt_CA__Alternatives ) )
            // InternalWesnothDSL.g:243:3: ( rule__Defualt_CA__Alternatives )
            {
             before(grammarAccess.getDefualt_CAAccess().getAlternatives()); 
            // InternalWesnothDSL.g:244:3: ( rule__Defualt_CA__Alternatives )
            // InternalWesnothDSL.g:244:4: rule__Defualt_CA__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Defualt_CA__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefualt_CAAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleMovement"
    // InternalWesnothDSL.g:253:1: entryRuleMovement : ruleMovement EOF ;
    public final void entryRuleMovement() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:254:1: ( ruleMovement EOF )
            // InternalWesnothDSL.g:255:1: ruleMovement EOF
            {
             before(grammarAccess.getMovementRule()); 
            pushFollow(FOLLOW_1);
            ruleMovement();

            state._fsp--;

             after(grammarAccess.getMovementRule()); 
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
    // $ANTLR end "entryRuleMovement"


    // $ANTLR start "ruleMovement"
    // InternalWesnothDSL.g:262:1: ruleMovement : ( 'movement' ) ;
    public final void ruleMovement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:266:2: ( ( 'movement' ) )
            // InternalWesnothDSL.g:267:2: ( 'movement' )
            {
            // InternalWesnothDSL.g:267:2: ( 'movement' )
            // InternalWesnothDSL.g:268:3: 'movement'
            {
             before(grammarAccess.getMovementAccess().getMovementKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMovementAccess().getMovementKeyword()); 

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
    // $ANTLR end "ruleMovement"


    // $ANTLR start "entryRuleRetreat"
    // InternalWesnothDSL.g:278:1: entryRuleRetreat : ruleRetreat EOF ;
    public final void entryRuleRetreat() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:279:1: ( ruleRetreat EOF )
            // InternalWesnothDSL.g:280:1: ruleRetreat EOF
            {
             before(grammarAccess.getRetreatRule()); 
            pushFollow(FOLLOW_1);
            ruleRetreat();

            state._fsp--;

             after(grammarAccess.getRetreatRule()); 
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
    // $ANTLR end "entryRuleRetreat"


    // $ANTLR start "ruleRetreat"
    // InternalWesnothDSL.g:287:1: ruleRetreat : ( 'retreat' ) ;
    public final void ruleRetreat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:291:2: ( ( 'retreat' ) )
            // InternalWesnothDSL.g:292:2: ( 'retreat' )
            {
            // InternalWesnothDSL.g:292:2: ( 'retreat' )
            // InternalWesnothDSL.g:293:3: 'retreat'
            {
             before(grammarAccess.getRetreatAccess().getRetreatKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRetreatAccess().getRetreatKeyword()); 

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
    // $ANTLR end "ruleRetreat"


    // $ANTLR start "entryRuleMove_To_Target"
    // InternalWesnothDSL.g:303:1: entryRuleMove_To_Target : ruleMove_To_Target EOF ;
    public final void entryRuleMove_To_Target() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:304:1: ( ruleMove_To_Target EOF )
            // InternalWesnothDSL.g:305:1: ruleMove_To_Target EOF
            {
             before(grammarAccess.getMove_To_TargetRule()); 
            pushFollow(FOLLOW_1);
            ruleMove_To_Target();

            state._fsp--;

             after(grammarAccess.getMove_To_TargetRule()); 
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
    // $ANTLR end "entryRuleMove_To_Target"


    // $ANTLR start "ruleMove_To_Target"
    // InternalWesnothDSL.g:312:1: ruleMove_To_Target : ( 'move_to_target' ) ;
    public final void ruleMove_To_Target() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:316:2: ( ( 'move_to_target' ) )
            // InternalWesnothDSL.g:317:2: ( 'move_to_target' )
            {
            // InternalWesnothDSL.g:317:2: ( 'move_to_target' )
            // InternalWesnothDSL.g:318:3: 'move_to_target'
            {
             before(grammarAccess.getMove_To_TargetAccess().getMove_to_targetKeyword()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMove_To_TargetAccess().getMove_to_targetKeyword()); 

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
    // $ANTLR end "ruleMove_To_Target"


    // $ANTLR start "entryRuleCombat"
    // InternalWesnothDSL.g:328:1: entryRuleCombat : ruleCombat EOF ;
    public final void entryRuleCombat() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:329:1: ( ruleCombat EOF )
            // InternalWesnothDSL.g:330:1: ruleCombat EOF
            {
             before(grammarAccess.getCombatRule()); 
            pushFollow(FOLLOW_1);
            ruleCombat();

            state._fsp--;

             after(grammarAccess.getCombatRule()); 
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
    // $ANTLR end "entryRuleCombat"


    // $ANTLR start "ruleCombat"
    // InternalWesnothDSL.g:337:1: ruleCombat : ( 'combat' ) ;
    public final void ruleCombat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:341:2: ( ( 'combat' ) )
            // InternalWesnothDSL.g:342:2: ( 'combat' )
            {
            // InternalWesnothDSL.g:342:2: ( 'combat' )
            // InternalWesnothDSL.g:343:3: 'combat'
            {
             before(grammarAccess.getCombatAccess().getCombatKeyword()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCombatAccess().getCombatKeyword()); 

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
    // $ANTLR end "ruleCombat"


    // $ANTLR start "entryRuleRecruit"
    // InternalWesnothDSL.g:353:1: entryRuleRecruit : ruleRecruit EOF ;
    public final void entryRuleRecruit() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:354:1: ( ruleRecruit EOF )
            // InternalWesnothDSL.g:355:1: ruleRecruit EOF
            {
             before(grammarAccess.getRecruitRule()); 
            pushFollow(FOLLOW_1);
            ruleRecruit();

            state._fsp--;

             after(grammarAccess.getRecruitRule()); 
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
    // $ANTLR end "entryRuleRecruit"


    // $ANTLR start "ruleRecruit"
    // InternalWesnothDSL.g:362:1: ruleRecruit : ( 'recruit' ) ;
    public final void ruleRecruit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:366:2: ( ( 'recruit' ) )
            // InternalWesnothDSL.g:367:2: ( 'recruit' )
            {
            // InternalWesnothDSL.g:367:2: ( 'recruit' )
            // InternalWesnothDSL.g:368:3: 'recruit'
            {
             before(grammarAccess.getRecruitAccess().getRecruitKeyword()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRecruitAccess().getRecruitKeyword()); 

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
    // $ANTLR end "ruleRecruit"


    // $ANTLR start "entryRuleFocus_High_XP"
    // InternalWesnothDSL.g:378:1: entryRuleFocus_High_XP : ruleFocus_High_XP EOF ;
    public final void entryRuleFocus_High_XP() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:379:1: ( ruleFocus_High_XP EOF )
            // InternalWesnothDSL.g:380:1: ruleFocus_High_XP EOF
            {
             before(grammarAccess.getFocus_High_XPRule()); 
            pushFollow(FOLLOW_1);
            ruleFocus_High_XP();

            state._fsp--;

             after(grammarAccess.getFocus_High_XPRule()); 
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
    // $ANTLR end "entryRuleFocus_High_XP"


    // $ANTLR start "ruleFocus_High_XP"
    // InternalWesnothDSL.g:387:1: ruleFocus_High_XP : ( 'focus_high_xp' ) ;
    public final void ruleFocus_High_XP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:391:2: ( ( 'focus_high_xp' ) )
            // InternalWesnothDSL.g:392:2: ( 'focus_high_xp' )
            {
            // InternalWesnothDSL.g:392:2: ( 'focus_high_xp' )
            // InternalWesnothDSL.g:393:3: 'focus_high_xp'
            {
             before(grammarAccess.getFocus_High_XPAccess().getFocus_high_xpKeyword()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFocus_High_XPAccess().getFocus_high_xpKeyword()); 

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
    // $ANTLR end "ruleFocus_High_XP"


    // $ANTLR start "entryRuleMove_To_Enemy"
    // InternalWesnothDSL.g:403:1: entryRuleMove_To_Enemy : ruleMove_To_Enemy EOF ;
    public final void entryRuleMove_To_Enemy() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:404:1: ( ruleMove_To_Enemy EOF )
            // InternalWesnothDSL.g:405:1: ruleMove_To_Enemy EOF
            {
             before(grammarAccess.getMove_To_EnemyRule()); 
            pushFollow(FOLLOW_1);
            ruleMove_To_Enemy();

            state._fsp--;

             after(grammarAccess.getMove_To_EnemyRule()); 
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
    // $ANTLR end "entryRuleMove_To_Enemy"


    // $ANTLR start "ruleMove_To_Enemy"
    // InternalWesnothDSL.g:412:1: ruleMove_To_Enemy : ( 'move_to_enemy' ) ;
    public final void ruleMove_To_Enemy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:416:2: ( ( 'move_to_enemy' ) )
            // InternalWesnothDSL.g:417:2: ( 'move_to_enemy' )
            {
            // InternalWesnothDSL.g:417:2: ( 'move_to_enemy' )
            // InternalWesnothDSL.g:418:3: 'move_to_enemy'
            {
             before(grammarAccess.getMove_To_EnemyAccess().getMove_to_enemyKeyword()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMove_To_EnemyAccess().getMove_to_enemyKeyword()); 

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
    // $ANTLR end "ruleMove_To_Enemy"


    // $ANTLR start "entryRuleCapture_Villages"
    // InternalWesnothDSL.g:428:1: entryRuleCapture_Villages : ruleCapture_Villages EOF ;
    public final void entryRuleCapture_Villages() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:429:1: ( ruleCapture_Villages EOF )
            // InternalWesnothDSL.g:430:1: ruleCapture_Villages EOF
            {
             before(grammarAccess.getCapture_VillagesRule()); 
            pushFollow(FOLLOW_1);
            ruleCapture_Villages();

            state._fsp--;

             after(grammarAccess.getCapture_VillagesRule()); 
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
    // $ANTLR end "entryRuleCapture_Villages"


    // $ANTLR start "ruleCapture_Villages"
    // InternalWesnothDSL.g:437:1: ruleCapture_Villages : ( 'capture_villages' ) ;
    public final void ruleCapture_Villages() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:441:2: ( ( 'capture_villages' ) )
            // InternalWesnothDSL.g:442:2: ( 'capture_villages' )
            {
            // InternalWesnothDSL.g:442:2: ( 'capture_villages' )
            // InternalWesnothDSL.g:443:3: 'capture_villages'
            {
             before(grammarAccess.getCapture_VillagesAccess().getCapture_villagesKeyword()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCapture_VillagesAccess().getCapture_villagesKeyword()); 

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
    // $ANTLR end "ruleCapture_Villages"


    // $ANTLR start "rule__Behaviour__Alternatives"
    // InternalWesnothDSL.g:452:1: rule__Behaviour__Alternatives : ( ( ruleGoal ) | ( ruleCandidate_Action ) );
    public final void rule__Behaviour__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:456:1: ( ( ruleGoal ) | ( ruleCandidate_Action ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=12 && LA2_0<=20)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWesnothDSL.g:457:2: ( ruleGoal )
                    {
                    // InternalWesnothDSL.g:457:2: ( ruleGoal )
                    // InternalWesnothDSL.g:458:3: ruleGoal
                    {
                     before(grammarAccess.getBehaviourAccess().getGoalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGoal();

                    state._fsp--;

                     after(grammarAccess.getBehaviourAccess().getGoalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:463:2: ( ruleCandidate_Action )
                    {
                    // InternalWesnothDSL.g:463:2: ( ruleCandidate_Action )
                    // InternalWesnothDSL.g:464:3: ruleCandidate_Action
                    {
                     before(grammarAccess.getBehaviourAccess().getCandidate_ActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCandidate_Action();

                    state._fsp--;

                     after(grammarAccess.getBehaviourAccess().getCandidate_ActionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Behaviour__Alternatives"


    // $ANTLR start "rule__Candidate_Action__Alternatives"
    // InternalWesnothDSL.g:473:1: rule__Candidate_Action__Alternatives : ( ( ruleNew_CA ) | ( ruleDefualt_CA ) );
    public final void rule__Candidate_Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:477:1: ( ( ruleNew_CA ) | ( ruleDefualt_CA ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=13 && LA3_0<=20)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalWesnothDSL.g:478:2: ( ruleNew_CA )
                    {
                    // InternalWesnothDSL.g:478:2: ( ruleNew_CA )
                    // InternalWesnothDSL.g:479:3: ruleNew_CA
                    {
                     before(grammarAccess.getCandidate_ActionAccess().getNew_CAParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNew_CA();

                    state._fsp--;

                     after(grammarAccess.getCandidate_ActionAccess().getNew_CAParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:484:2: ( ruleDefualt_CA )
                    {
                    // InternalWesnothDSL.g:484:2: ( ruleDefualt_CA )
                    // InternalWesnothDSL.g:485:3: ruleDefualt_CA
                    {
                     before(grammarAccess.getCandidate_ActionAccess().getDefualt_CAParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefualt_CA();

                    state._fsp--;

                     after(grammarAccess.getCandidate_ActionAccess().getDefualt_CAParserRuleCall_1()); 

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
    // $ANTLR end "rule__Candidate_Action__Alternatives"


    // $ANTLR start "rule__Defualt_CA__Alternatives"
    // InternalWesnothDSL.g:494:1: rule__Defualt_CA__Alternatives : ( ( ruleMovement ) | ( ruleRetreat ) | ( ruleMove_To_Target ) | ( ruleCombat ) | ( ruleRecruit ) | ( ruleFocus_High_XP ) | ( ruleMove_To_Enemy ) | ( ruleCapture_Villages ) );
    public final void rule__Defualt_CA__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:498:1: ( ( ruleMovement ) | ( ruleRetreat ) | ( ruleMove_To_Target ) | ( ruleCombat ) | ( ruleRecruit ) | ( ruleFocus_High_XP ) | ( ruleMove_To_Enemy ) | ( ruleCapture_Villages ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            case 20:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalWesnothDSL.g:499:2: ( ruleMovement )
                    {
                    // InternalWesnothDSL.g:499:2: ( ruleMovement )
                    // InternalWesnothDSL.g:500:3: ruleMovement
                    {
                     before(grammarAccess.getDefualt_CAAccess().getMovementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMovement();

                    state._fsp--;

                     after(grammarAccess.getDefualt_CAAccess().getMovementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:505:2: ( ruleRetreat )
                    {
                    // InternalWesnothDSL.g:505:2: ( ruleRetreat )
                    // InternalWesnothDSL.g:506:3: ruleRetreat
                    {
                     before(grammarAccess.getDefualt_CAAccess().getRetreatParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRetreat();

                    state._fsp--;

                     after(grammarAccess.getDefualt_CAAccess().getRetreatParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWesnothDSL.g:511:2: ( ruleMove_To_Target )
                    {
                    // InternalWesnothDSL.g:511:2: ( ruleMove_To_Target )
                    // InternalWesnothDSL.g:512:3: ruleMove_To_Target
                    {
                     before(grammarAccess.getDefualt_CAAccess().getMove_To_TargetParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMove_To_Target();

                    state._fsp--;

                     after(grammarAccess.getDefualt_CAAccess().getMove_To_TargetParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWesnothDSL.g:517:2: ( ruleCombat )
                    {
                    // InternalWesnothDSL.g:517:2: ( ruleCombat )
                    // InternalWesnothDSL.g:518:3: ruleCombat
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCombatParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCombat();

                    state._fsp--;

                     after(grammarAccess.getDefualt_CAAccess().getCombatParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWesnothDSL.g:523:2: ( ruleRecruit )
                    {
                    // InternalWesnothDSL.g:523:2: ( ruleRecruit )
                    // InternalWesnothDSL.g:524:3: ruleRecruit
                    {
                     before(grammarAccess.getDefualt_CAAccess().getRecruitParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRecruit();

                    state._fsp--;

                     after(grammarAccess.getDefualt_CAAccess().getRecruitParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWesnothDSL.g:529:2: ( ruleFocus_High_XP )
                    {
                    // InternalWesnothDSL.g:529:2: ( ruleFocus_High_XP )
                    // InternalWesnothDSL.g:530:3: ruleFocus_High_XP
                    {
                     before(grammarAccess.getDefualt_CAAccess().getFocus_High_XPParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleFocus_High_XP();

                    state._fsp--;

                     after(grammarAccess.getDefualt_CAAccess().getFocus_High_XPParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalWesnothDSL.g:535:2: ( ruleMove_To_Enemy )
                    {
                    // InternalWesnothDSL.g:535:2: ( ruleMove_To_Enemy )
                    // InternalWesnothDSL.g:536:3: ruleMove_To_Enemy
                    {
                     before(grammarAccess.getDefualt_CAAccess().getMove_To_EnemyParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleMove_To_Enemy();

                    state._fsp--;

                     after(grammarAccess.getDefualt_CAAccess().getMove_To_EnemyParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalWesnothDSL.g:541:2: ( ruleCapture_Villages )
                    {
                    // InternalWesnothDSL.g:541:2: ( ruleCapture_Villages )
                    // InternalWesnothDSL.g:542:3: ruleCapture_Villages
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCapture_VillagesParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleCapture_Villages();

                    state._fsp--;

                     after(grammarAccess.getDefualt_CAAccess().getCapture_VillagesParserRuleCall_7()); 

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
    // $ANTLR end "rule__Defualt_CA__Alternatives"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalWesnothDSL.g:551:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:555:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalWesnothDSL.g:556:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalWesnothDSL.g:563:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:567:1: ( ( 'rule' ) )
            // InternalWesnothDSL.g:568:1: ( 'rule' )
            {
            // InternalWesnothDSL.g:568:1: ( 'rule' )
            // InternalWesnothDSL.g:569:2: 'rule'
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
    // InternalWesnothDSL.g:578:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:582:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalWesnothDSL.g:583:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalWesnothDSL.g:590:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:594:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalWesnothDSL.g:595:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalWesnothDSL.g:595:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalWesnothDSL.g:596:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalWesnothDSL.g:597:2: ( rule__Rule__NameAssignment_1 )
            // InternalWesnothDSL.g:597:3: rule__Rule__NameAssignment_1
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
    // InternalWesnothDSL.g:605:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:609:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalWesnothDSL.g:610:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalWesnothDSL.g:617:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:621:1: ( ( '{' ) )
            // InternalWesnothDSL.g:622:1: ( '{' )
            {
            // InternalWesnothDSL.g:622:1: ( '{' )
            // InternalWesnothDSL.g:623:2: '{'
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
    // InternalWesnothDSL.g:632:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:636:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalWesnothDSL.g:637:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalWesnothDSL.g:644:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__UnitIDAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:648:1: ( ( ( rule__Rule__UnitIDAssignment_3 ) ) )
            // InternalWesnothDSL.g:649:1: ( ( rule__Rule__UnitIDAssignment_3 ) )
            {
            // InternalWesnothDSL.g:649:1: ( ( rule__Rule__UnitIDAssignment_3 ) )
            // InternalWesnothDSL.g:650:2: ( rule__Rule__UnitIDAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getUnitIDAssignment_3()); 
            // InternalWesnothDSL.g:651:2: ( rule__Rule__UnitIDAssignment_3 )
            // InternalWesnothDSL.g:651:3: rule__Rule__UnitIDAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__UnitIDAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getUnitIDAssignment_3()); 

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
    // InternalWesnothDSL.g:659:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:663:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalWesnothDSL.g:664:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
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
    // InternalWesnothDSL.g:671:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__BehavioursAssignment_4 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:675:1: ( ( ( rule__Rule__BehavioursAssignment_4 )* ) )
            // InternalWesnothDSL.g:676:1: ( ( rule__Rule__BehavioursAssignment_4 )* )
            {
            // InternalWesnothDSL.g:676:1: ( ( rule__Rule__BehavioursAssignment_4 )* )
            // InternalWesnothDSL.g:677:2: ( rule__Rule__BehavioursAssignment_4 )*
            {
             before(grammarAccess.getRuleAccess().getBehavioursAssignment_4()); 
            // InternalWesnothDSL.g:678:2: ( rule__Rule__BehavioursAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=11 && LA5_0<=20)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWesnothDSL.g:678:3: rule__Rule__BehavioursAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Rule__BehavioursAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getBehavioursAssignment_4()); 

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
    // InternalWesnothDSL.g:686:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:690:1: ( rule__Rule__Group__5__Impl )
            // InternalWesnothDSL.g:691:2: rule__Rule__Group__5__Impl
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
    // InternalWesnothDSL.g:697:1: rule__Rule__Group__5__Impl : ( '}' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:701:1: ( ( '}' ) )
            // InternalWesnothDSL.g:702:1: ( '}' )
            {
            // InternalWesnothDSL.g:702:1: ( '}' )
            // InternalWesnothDSL.g:703:2: '}'
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


    // $ANTLR start "rule__UnitID__Group__0"
    // InternalWesnothDSL.g:713:1: rule__UnitID__Group__0 : rule__UnitID__Group__0__Impl rule__UnitID__Group__1 ;
    public final void rule__UnitID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:717:1: ( rule__UnitID__Group__0__Impl rule__UnitID__Group__1 )
            // InternalWesnothDSL.g:718:2: rule__UnitID__Group__0__Impl rule__UnitID__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__UnitID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnitID__Group__1();

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
    // $ANTLR end "rule__UnitID__Group__0"


    // $ANTLR start "rule__UnitID__Group__0__Impl"
    // InternalWesnothDSL.g:725:1: rule__UnitID__Group__0__Impl : ( 'unitID' ) ;
    public final void rule__UnitID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:729:1: ( ( 'unitID' ) )
            // InternalWesnothDSL.g:730:1: ( 'unitID' )
            {
            // InternalWesnothDSL.g:730:1: ( 'unitID' )
            // InternalWesnothDSL.g:731:2: 'unitID'
            {
             before(grammarAccess.getUnitIDAccess().getUnitIDKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUnitIDAccess().getUnitIDKeyword_0()); 

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
    // $ANTLR end "rule__UnitID__Group__0__Impl"


    // $ANTLR start "rule__UnitID__Group__1"
    // InternalWesnothDSL.g:740:1: rule__UnitID__Group__1 : rule__UnitID__Group__1__Impl ;
    public final void rule__UnitID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:744:1: ( rule__UnitID__Group__1__Impl )
            // InternalWesnothDSL.g:745:2: rule__UnitID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnitID__Group__1__Impl();

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
    // $ANTLR end "rule__UnitID__Group__1"


    // $ANTLR start "rule__UnitID__Group__1__Impl"
    // InternalWesnothDSL.g:751:1: rule__UnitID__Group__1__Impl : ( ( rule__UnitID__NameAssignment_1 ) ) ;
    public final void rule__UnitID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:755:1: ( ( ( rule__UnitID__NameAssignment_1 ) ) )
            // InternalWesnothDSL.g:756:1: ( ( rule__UnitID__NameAssignment_1 ) )
            {
            // InternalWesnothDSL.g:756:1: ( ( rule__UnitID__NameAssignment_1 ) )
            // InternalWesnothDSL.g:757:2: ( rule__UnitID__NameAssignment_1 )
            {
             before(grammarAccess.getUnitIDAccess().getNameAssignment_1()); 
            // InternalWesnothDSL.g:758:2: ( rule__UnitID__NameAssignment_1 )
            // InternalWesnothDSL.g:758:3: rule__UnitID__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnitID__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnitIDAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__UnitID__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalWesnothDSL.g:767:1: rule__Model__ElementsAssignment : ( ruleRule ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:771:1: ( ( ruleRule ) )
            // InternalWesnothDSL.g:772:2: ( ruleRule )
            {
            // InternalWesnothDSL.g:772:2: ( ruleRule )
            // InternalWesnothDSL.g:773:3: ruleRule
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
    // InternalWesnothDSL.g:782:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:786:1: ( ( RULE_ID ) )
            // InternalWesnothDSL.g:787:2: ( RULE_ID )
            {
            // InternalWesnothDSL.g:787:2: ( RULE_ID )
            // InternalWesnothDSL.g:788:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

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


    // $ANTLR start "rule__Rule__UnitIDAssignment_3"
    // InternalWesnothDSL.g:797:1: rule__Rule__UnitIDAssignment_3 : ( ruleUnitID ) ;
    public final void rule__Rule__UnitIDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:801:1: ( ( ruleUnitID ) )
            // InternalWesnothDSL.g:802:2: ( ruleUnitID )
            {
            // InternalWesnothDSL.g:802:2: ( ruleUnitID )
            // InternalWesnothDSL.g:803:3: ruleUnitID
            {
             before(grammarAccess.getRuleAccess().getUnitIDUnitIDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleUnitID();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getUnitIDUnitIDParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rule__UnitIDAssignment_3"


    // $ANTLR start "rule__Rule__BehavioursAssignment_4"
    // InternalWesnothDSL.g:812:1: rule__Rule__BehavioursAssignment_4 : ( ruleBehaviour ) ;
    public final void rule__Rule__BehavioursAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:816:1: ( ( ruleBehaviour ) )
            // InternalWesnothDSL.g:817:2: ( ruleBehaviour )
            {
            // InternalWesnothDSL.g:817:2: ( ruleBehaviour )
            // InternalWesnothDSL.g:818:3: ruleBehaviour
            {
             before(grammarAccess.getRuleAccess().getBehavioursBehaviourParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviour();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getBehavioursBehaviourParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Rule__BehavioursAssignment_4"


    // $ANTLR start "rule__UnitID__NameAssignment_1"
    // InternalWesnothDSL.g:827:1: rule__UnitID__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UnitID__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:831:1: ( ( RULE_ID ) )
            // InternalWesnothDSL.g:832:2: ( RULE_ID )
            {
            // InternalWesnothDSL.g:832:2: ( RULE_ID )
            // InternalWesnothDSL.g:833:3: RULE_ID
            {
             before(grammarAccess.getUnitIDAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUnitIDAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__UnitID__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000009FF800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001FF802L});

}