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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'movement'", "'retreat'", "'move_to_target'", "'combat'", "'recruit'", "'focus_high_XP'", "'move_to_enemy'", "'capture_villages'", "'rule'", "'{'", "'}'", "'unitID'"
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


    // $ANTLR start "entryRuleDefualt_CA"
    // InternalWesnothDSL.g:128:1: entryRuleDefualt_CA : ruleDefualt_CA EOF ;
    public final void entryRuleDefualt_CA() throws RecognitionException {
        try {
            // InternalWesnothDSL.g:129:1: ( ruleDefualt_CA EOF )
            // InternalWesnothDSL.g:130:1: ruleDefualt_CA EOF
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
    // InternalWesnothDSL.g:137:1: ruleDefualt_CA : ( ( rule__Defualt_CA__CaTypeAssignment ) ) ;
    public final void ruleDefualt_CA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:141:2: ( ( ( rule__Defualt_CA__CaTypeAssignment ) ) )
            // InternalWesnothDSL.g:142:2: ( ( rule__Defualt_CA__CaTypeAssignment ) )
            {
            // InternalWesnothDSL.g:142:2: ( ( rule__Defualt_CA__CaTypeAssignment ) )
            // InternalWesnothDSL.g:143:3: ( rule__Defualt_CA__CaTypeAssignment )
            {
             before(grammarAccess.getDefualt_CAAccess().getCaTypeAssignment()); 
            // InternalWesnothDSL.g:144:3: ( rule__Defualt_CA__CaTypeAssignment )
            // InternalWesnothDSL.g:144:4: rule__Defualt_CA__CaTypeAssignment
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


    // $ANTLR start "rule__Defualt_CA__CaTypeAlternatives_0"
    // InternalWesnothDSL.g:152:1: rule__Defualt_CA__CaTypeAlternatives_0 : ( ( 'movement' ) | ( 'retreat' ) | ( 'move_to_target' ) | ( 'combat' ) | ( 'recruit' ) | ( 'focus_high_XP' ) | ( 'move_to_enemy' ) | ( 'capture_villages' ) );
    public final void rule__Defualt_CA__CaTypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:156:1: ( ( 'movement' ) | ( 'retreat' ) | ( 'move_to_target' ) | ( 'combat' ) | ( 'recruit' ) | ( 'focus_high_XP' ) | ( 'move_to_enemy' ) | ( 'capture_villages' ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalWesnothDSL.g:157:2: ( 'movement' )
                    {
                    // InternalWesnothDSL.g:157:2: ( 'movement' )
                    // InternalWesnothDSL.g:158:3: 'movement'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWesnothDSL.g:163:2: ( 'retreat' )
                    {
                    // InternalWesnothDSL.g:163:2: ( 'retreat' )
                    // InternalWesnothDSL.g:164:3: 'retreat'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWesnothDSL.g:169:2: ( 'move_to_target' )
                    {
                    // InternalWesnothDSL.g:169:2: ( 'move_to_target' )
                    // InternalWesnothDSL.g:170:3: 'move_to_target'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWesnothDSL.g:175:2: ( 'combat' )
                    {
                    // InternalWesnothDSL.g:175:2: ( 'combat' )
                    // InternalWesnothDSL.g:176:3: 'combat'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWesnothDSL.g:181:2: ( 'recruit' )
                    {
                    // InternalWesnothDSL.g:181:2: ( 'recruit' )
                    // InternalWesnothDSL.g:182:3: 'recruit'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWesnothDSL.g:187:2: ( 'focus_high_XP' )
                    {
                    // InternalWesnothDSL.g:187:2: ( 'focus_high_XP' )
                    // InternalWesnothDSL.g:188:3: 'focus_high_XP'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeFocus_high_XPKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeFocus_high_XPKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalWesnothDSL.g:193:2: ( 'move_to_enemy' )
                    {
                    // InternalWesnothDSL.g:193:2: ( 'move_to_enemy' )
                    // InternalWesnothDSL.g:194:3: 'move_to_enemy'
                    {
                     before(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_enemyKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_enemyKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalWesnothDSL.g:199:2: ( 'capture_villages' )
                    {
                    // InternalWesnothDSL.g:199:2: ( 'capture_villages' )
                    // InternalWesnothDSL.g:200:3: 'capture_villages'
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
    // InternalWesnothDSL.g:209:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:213:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalWesnothDSL.g:214:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalWesnothDSL.g:221:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:225:1: ( ( 'rule' ) )
            // InternalWesnothDSL.g:226:1: ( 'rule' )
            {
            // InternalWesnothDSL.g:226:1: ( 'rule' )
            // InternalWesnothDSL.g:227:2: 'rule'
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
    // InternalWesnothDSL.g:236:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:240:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalWesnothDSL.g:241:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalWesnothDSL.g:248:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:252:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalWesnothDSL.g:253:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalWesnothDSL.g:253:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalWesnothDSL.g:254:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalWesnothDSL.g:255:2: ( rule__Rule__NameAssignment_1 )
            // InternalWesnothDSL.g:255:3: rule__Rule__NameAssignment_1
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
    // InternalWesnothDSL.g:263:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:267:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalWesnothDSL.g:268:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalWesnothDSL.g:275:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:279:1: ( ( '{' ) )
            // InternalWesnothDSL.g:280:1: ( '{' )
            {
            // InternalWesnothDSL.g:280:1: ( '{' )
            // InternalWesnothDSL.g:281:2: '{'
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
    // InternalWesnothDSL.g:290:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:294:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalWesnothDSL.g:295:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalWesnothDSL.g:302:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__UnitIDAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:306:1: ( ( ( rule__Rule__UnitIDAssignment_3 ) ) )
            // InternalWesnothDSL.g:307:1: ( ( rule__Rule__UnitIDAssignment_3 ) )
            {
            // InternalWesnothDSL.g:307:1: ( ( rule__Rule__UnitIDAssignment_3 ) )
            // InternalWesnothDSL.g:308:2: ( rule__Rule__UnitIDAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getUnitIDAssignment_3()); 
            // InternalWesnothDSL.g:309:2: ( rule__Rule__UnitIDAssignment_3 )
            // InternalWesnothDSL.g:309:3: rule__Rule__UnitIDAssignment_3
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
    // InternalWesnothDSL.g:317:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:321:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalWesnothDSL.g:322:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
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
    // InternalWesnothDSL.g:329:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Defualt_casAssignment_4 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:333:1: ( ( ( rule__Rule__Defualt_casAssignment_4 )* ) )
            // InternalWesnothDSL.g:334:1: ( ( rule__Rule__Defualt_casAssignment_4 )* )
            {
            // InternalWesnothDSL.g:334:1: ( ( rule__Rule__Defualt_casAssignment_4 )* )
            // InternalWesnothDSL.g:335:2: ( rule__Rule__Defualt_casAssignment_4 )*
            {
             before(grammarAccess.getRuleAccess().getDefualt_casAssignment_4()); 
            // InternalWesnothDSL.g:336:2: ( rule__Rule__Defualt_casAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWesnothDSL.g:336:3: rule__Rule__Defualt_casAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Rule__Defualt_casAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getDefualt_casAssignment_4()); 

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
    // InternalWesnothDSL.g:344:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:348:1: ( rule__Rule__Group__5__Impl )
            // InternalWesnothDSL.g:349:2: rule__Rule__Group__5__Impl
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
    // InternalWesnothDSL.g:355:1: rule__Rule__Group__5__Impl : ( '}' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:359:1: ( ( '}' ) )
            // InternalWesnothDSL.g:360:1: ( '}' )
            {
            // InternalWesnothDSL.g:360:1: ( '}' )
            // InternalWesnothDSL.g:361:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalWesnothDSL.g:371:1: rule__UnitID__Group__0 : rule__UnitID__Group__0__Impl rule__UnitID__Group__1 ;
    public final void rule__UnitID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:375:1: ( rule__UnitID__Group__0__Impl rule__UnitID__Group__1 )
            // InternalWesnothDSL.g:376:2: rule__UnitID__Group__0__Impl rule__UnitID__Group__1
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
    // InternalWesnothDSL.g:383:1: rule__UnitID__Group__0__Impl : ( 'unitID' ) ;
    public final void rule__UnitID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:387:1: ( ( 'unitID' ) )
            // InternalWesnothDSL.g:388:1: ( 'unitID' )
            {
            // InternalWesnothDSL.g:388:1: ( 'unitID' )
            // InternalWesnothDSL.g:389:2: 'unitID'
            {
             before(grammarAccess.getUnitIDAccess().getUnitIDKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalWesnothDSL.g:398:1: rule__UnitID__Group__1 : rule__UnitID__Group__1__Impl ;
    public final void rule__UnitID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:402:1: ( rule__UnitID__Group__1__Impl )
            // InternalWesnothDSL.g:403:2: rule__UnitID__Group__1__Impl
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
    // InternalWesnothDSL.g:409:1: rule__UnitID__Group__1__Impl : ( ( rule__UnitID__NameAssignment_1 ) ) ;
    public final void rule__UnitID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:413:1: ( ( ( rule__UnitID__NameAssignment_1 ) ) )
            // InternalWesnothDSL.g:414:1: ( ( rule__UnitID__NameAssignment_1 ) )
            {
            // InternalWesnothDSL.g:414:1: ( ( rule__UnitID__NameAssignment_1 ) )
            // InternalWesnothDSL.g:415:2: ( rule__UnitID__NameAssignment_1 )
            {
             before(grammarAccess.getUnitIDAccess().getNameAssignment_1()); 
            // InternalWesnothDSL.g:416:2: ( rule__UnitID__NameAssignment_1 )
            // InternalWesnothDSL.g:416:3: rule__UnitID__NameAssignment_1
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
    // InternalWesnothDSL.g:425:1: rule__Model__ElementsAssignment : ( ruleRule ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:429:1: ( ( ruleRule ) )
            // InternalWesnothDSL.g:430:2: ( ruleRule )
            {
            // InternalWesnothDSL.g:430:2: ( ruleRule )
            // InternalWesnothDSL.g:431:3: ruleRule
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
    // InternalWesnothDSL.g:440:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:444:1: ( ( RULE_ID ) )
            // InternalWesnothDSL.g:445:2: ( RULE_ID )
            {
            // InternalWesnothDSL.g:445:2: ( RULE_ID )
            // InternalWesnothDSL.g:446:3: RULE_ID
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
    // InternalWesnothDSL.g:455:1: rule__Rule__UnitIDAssignment_3 : ( ruleUnitID ) ;
    public final void rule__Rule__UnitIDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:459:1: ( ( ruleUnitID ) )
            // InternalWesnothDSL.g:460:2: ( ruleUnitID )
            {
            // InternalWesnothDSL.g:460:2: ( ruleUnitID )
            // InternalWesnothDSL.g:461:3: ruleUnitID
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


    // $ANTLR start "rule__Rule__Defualt_casAssignment_4"
    // InternalWesnothDSL.g:470:1: rule__Rule__Defualt_casAssignment_4 : ( ruleDefualt_CA ) ;
    public final void rule__Rule__Defualt_casAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:474:1: ( ( ruleDefualt_CA ) )
            // InternalWesnothDSL.g:475:2: ( ruleDefualt_CA )
            {
            // InternalWesnothDSL.g:475:2: ( ruleDefualt_CA )
            // InternalWesnothDSL.g:476:3: ruleDefualt_CA
            {
             before(grammarAccess.getRuleAccess().getDefualt_casDefualt_CAParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDefualt_CA();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDefualt_casDefualt_CAParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Rule__Defualt_casAssignment_4"


    // $ANTLR start "rule__UnitID__NameAssignment_1"
    // InternalWesnothDSL.g:485:1: rule__UnitID__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UnitID__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:489:1: ( ( RULE_ID ) )
            // InternalWesnothDSL.g:490:2: ( RULE_ID )
            {
            // InternalWesnothDSL.g:490:2: ( RULE_ID )
            // InternalWesnothDSL.g:491:3: RULE_ID
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


    // $ANTLR start "rule__Defualt_CA__CaTypeAssignment"
    // InternalWesnothDSL.g:500:1: rule__Defualt_CA__CaTypeAssignment : ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) ) ;
    public final void rule__Defualt_CA__CaTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWesnothDSL.g:504:1: ( ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) ) )
            // InternalWesnothDSL.g:505:2: ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) )
            {
            // InternalWesnothDSL.g:505:2: ( ( rule__Defualt_CA__CaTypeAlternatives_0 ) )
            // InternalWesnothDSL.g:506:3: ( rule__Defualt_CA__CaTypeAlternatives_0 )
            {
             before(grammarAccess.getDefualt_CAAccess().getCaTypeAlternatives_0()); 
            // InternalWesnothDSL.g:507:3: ( rule__Defualt_CA__CaTypeAlternatives_0 )
            // InternalWesnothDSL.g:507:4: rule__Defualt_CA__CaTypeAlternatives_0
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000027F800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000007F802L});

}