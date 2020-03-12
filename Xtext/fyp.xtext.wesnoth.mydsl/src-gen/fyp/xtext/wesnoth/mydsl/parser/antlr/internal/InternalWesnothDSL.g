/*
 * generated by Xtext 2.20.0
 */
grammar InternalWesnothDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fyp.xtext.wesnoth.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getElementsRuleParserRuleCall_0());
			}
			lv_elements_0_0=ruleRule
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"fyp.xtext.wesnoth.mydsl.WesnothDSL.Rule");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='rule'
		{
			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getFragmentsFragmentParserRuleCall_3_0());
				}
				lv_fragments_3_0=ruleFragment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					add(
						$current,
						"fragments",
						lv_fragments_3_0,
						"fyp.xtext.wesnoth.mydsl.WesnothDSL.Fragment");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getGoalsGoalParserRuleCall_4_0());
				}
				lv_goals_4_0=ruleGoal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					add(
						$current,
						"goals",
						lv_goals_4_0,
						"fyp.xtext.wesnoth.mydsl.WesnothDSL.Goal");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleFragment
entryRuleFragment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFragmentRule()); }
	iv_ruleFragment=ruleFragment
	{ $current=$iv_ruleFragment.current; }
	EOF;

// Rule Fragment
ruleFragment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFragmentAccess().getConditionConditionalParserRuleCall_0_0());
				}
				lv_condition_0_0=ruleConditional
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFragmentRule());
					}
					set(
						$current,
						"condition",
						lv_condition_0_0,
						"fyp.xtext.wesnoth.mydsl.WesnothDSL.Conditional");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getFragmentAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFragmentAccess().getDefualt_casDefualt_CAParserRuleCall_2_0());
				}
				lv_defualt_cas_2_0=ruleDefualt_CA
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFragmentRule());
					}
					add(
						$current,
						"defualt_cas",
						lv_defualt_cas_2_0,
						"fyp.xtext.wesnoth.mydsl.WesnothDSL.Defualt_CA");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getFragmentAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleConditional
entryRuleConditional returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionalRule()); }
	iv_ruleConditional=ruleConditional
	{ $current=$iv_ruleConditional.current; }
	EOF;

// Rule Conditional
ruleConditional returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='when:'
		{
			newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getWhenKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionalAccess().getXWhenRulesParserRuleCall_1_0());
				}
				lv_x_1_0=rulewhenRules
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionalRule());
					}
					set(
						$current,
						"x",
						lv_x_1_0,
						"fyp.xtext.wesnoth.mydsl.WesnothDSL.whenRules");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulewhenRules
entryRulewhenRules returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhenRulesRule()); }
	iv_rulewhenRules=rulewhenRules
	{ $current=$iv_rulewhenRules.current; }
	EOF;

// Rule whenRules
rulewhenRules returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getWhenRulesAccess().getUnitEqualsParserRuleCall_0());
		}
		this_UnitEquals_0=ruleUnitEquals
		{
			$current = $this_UnitEquals_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getWhenRulesAccess().getAtLocationParserRuleCall_1());
		}
		this_AtLocation_1=ruleAtLocation
		{
			$current = $this_AtLocation_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getWhenRulesAccess().getDamageParserRuleCall_2());
		}
		this_Damage_2=ruleDamage
		{
			$current = $this_Damage_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getWhenRulesAccess().getBaselineParserRuleCall_3());
		}
		this_Baseline_3=ruleBaseline
		{
			$current = $this_Baseline_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBaseline
entryRuleBaseline returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBaselineRule()); }
	iv_ruleBaseline=ruleBaseline
	{ $current=$iv_ruleBaseline.current; }
	EOF;

// Rule Baseline
ruleBaseline returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_always_0_0='always'
			{
				newLeafNode(lv_always_0_0, grammarAccess.getBaselineAccess().getAlwaysAlwaysKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getBaselineRule());
				}
				setWithLastConsumed($current, "always", lv_always_0_0, "always");
			}
		)
	)
;

// Entry rule entryRuleDamage
entryRuleDamage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDamageRule()); }
	iv_ruleDamage=ruleDamage
	{ $current=$iv_ruleDamage.current; }
	EOF;

// Rule Damage
ruleDamage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='health'
		{
			newLeafNode(otherlv_0, grammarAccess.getDamageAccess().getHealthKeyword_0());
		}
		otherlv_1='-'
		{
			newLeafNode(otherlv_1, grammarAccess.getDamageAccess().getHyphenMinusKeyword_1());
		}
		(
			(
				lv_health_2_0=RULE_INT
				{
					newLeafNode(lv_health_2_0, grammarAccess.getDamageAccess().getHealthINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDamageRule());
					}
					setWithLastConsumed(
						$current,
						"health",
						lv_health_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleAtLocation
entryRuleAtLocation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtLocationRule()); }
	iv_ruleAtLocation=ruleAtLocation
	{ $current=$iv_ruleAtLocation.current; }
	EOF;

// Rule AtLocation
ruleAtLocation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='x:'
		{
			newLeafNode(otherlv_0, grammarAccess.getAtLocationAccess().getXKeyword_0());
		}
		(
			(
				lv_XAxis_1_0=RULE_INT
				{
					newLeafNode(lv_XAxis_1_0, grammarAccess.getAtLocationAccess().getXAxisINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtLocationRule());
					}
					setWithLastConsumed(
						$current,
						"XAxis",
						lv_XAxis_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2='y:'
		{
			newLeafNode(otherlv_2, grammarAccess.getAtLocationAccess().getYKeyword_2());
		}
		(
			(
				lv_YAxis_3_0=RULE_INT
				{
					newLeafNode(lv_YAxis_3_0, grammarAccess.getAtLocationAccess().getYAxisINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtLocationRule());
					}
					setWithLastConsumed(
						$current,
						"YAxis",
						lv_YAxis_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleUnitEquals
entryRuleUnitEquals returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnitEqualsRule()); }
	iv_ruleUnitEquals=ruleUnitEquals
	{ $current=$iv_ruleUnitEquals.current; }
	EOF;

// Rule UnitEquals
ruleUnitEquals returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='unit'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnitEqualsAccess().getUnitKeyword_0());
		}
		otherlv_1='is'
		{
			newLeafNode(otherlv_1, grammarAccess.getUnitEqualsAccess().getIsKeyword_1());
		}
		(
			(
				lv_unit_2_0=RULE_STRING
				{
					newLeafNode(lv_unit_2_0, grammarAccess.getUnitEqualsAccess().getUnitSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnitEqualsRule());
					}
					setWithLastConsumed(
						$current,
						"unit",
						lv_unit_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleGoal
entryRuleGoal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGoalRule()); }
	iv_ruleGoal=ruleGoal
	{ $current=$iv_ruleGoal.current; }
	EOF;

// Rule Goal
ruleGoal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='goal'
		{
			newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
		}
		otherlv_1='is'
		{
			newLeafNode(otherlv_1, grammarAccess.getGoalAccess().getIsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGoalAccess().getGoalGoaLocationParserRuleCall_2_0());
				}
				lv_goal_2_0=ruleGoaLocation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGoalRule());
					}
					set(
						$current,
						"goal",
						lv_goal_2_0,
						"fyp.xtext.wesnoth.mydsl.WesnothDSL.GoaLocation");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='value'
		{
			newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getValueKeyword_3());
		}
		otherlv_4='is'
		{
			newLeafNode(otherlv_4, grammarAccess.getGoalAccess().getIsKeyword_4());
		}
		(
			(
				lv_locValue_5_0=RULE_INT
				{
					newLeafNode(lv_locValue_5_0, grammarAccess.getGoalAccess().getLocValueINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGoalRule());
					}
					setWithLastConsumed(
						$current,
						"locValue",
						lv_locValue_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleGoaLocation
entryRuleGoaLocation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGoaLocationRule()); }
	iv_ruleGoaLocation=ruleGoaLocation
	{ $current=$iv_ruleGoaLocation.current; }
	EOF;

// Rule GoaLocation
ruleGoaLocation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='x'
		{
			newLeafNode(otherlv_0, grammarAccess.getGoaLocationAccess().getXKeyword_0());
		}
		(
			(
				lv_XAxis_1_0=RULE_INT
				{
					newLeafNode(lv_XAxis_1_0, grammarAccess.getGoaLocationAccess().getXAxisINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGoaLocationRule());
					}
					setWithLastConsumed(
						$current,
						"XAxis",
						lv_XAxis_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2='y'
		{
			newLeafNode(otherlv_2, grammarAccess.getGoaLocationAccess().getYKeyword_2());
		}
		(
			(
				lv_YAxis_3_0=RULE_INT
				{
					newLeafNode(lv_YAxis_3_0, grammarAccess.getGoaLocationAccess().getYAxisINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGoaLocationRule());
					}
					setWithLastConsumed(
						$current,
						"YAxis",
						lv_YAxis_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleDefualt_CA
entryRuleDefualt_CA returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefualt_CARule()); }
	iv_ruleDefualt_CA=ruleDefualt_CA
	{ $current=$iv_ruleDefualt_CA.current; }
	EOF;

// Rule Defualt_CA
ruleDefualt_CA returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_caType_0_1='movement'
				{
					newLeafNode(lv_caType_0_1, grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefualt_CARule());
					}
					setWithLastConsumed($current, "caType", lv_caType_0_1, null);
				}
				    |
				lv_caType_0_2='heal'
				{
					newLeafNode(lv_caType_0_2, grammarAccess.getDefualt_CAAccess().getCaTypeHealKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefualt_CARule());
					}
					setWithLastConsumed($current, "caType", lv_caType_0_2, null);
				}
				    |
				lv_caType_0_3='retreat'
				{
					newLeafNode(lv_caType_0_3, grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_2());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefualt_CARule());
					}
					setWithLastConsumed($current, "caType", lv_caType_0_3, null);
				}
				    |
				lv_caType_0_4='move_to_targets'
				{
					newLeafNode(lv_caType_0_4, grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetsKeyword_0_3());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefualt_CARule());
					}
					setWithLastConsumed($current, "caType", lv_caType_0_4, null);
				}
				    |
				lv_caType_0_5='basic_movement'
				{
					newLeafNode(lv_caType_0_5, grammarAccess.getDefualt_CAAccess().getCaTypeBasic_movementKeyword_0_4());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefualt_CARule());
					}
					setWithLastConsumed($current, "caType", lv_caType_0_5, null);
				}
				    |
				lv_caType_0_6='combat'
				{
					newLeafNode(lv_caType_0_6, grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_5());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefualt_CARule());
					}
					setWithLastConsumed($current, "caType", lv_caType_0_6, null);
				}
				    |
				lv_caType_0_7='recruit'
				{
					newLeafNode(lv_caType_0_7, grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_6());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefualt_CARule());
					}
					setWithLastConsumed($current, "caType", lv_caType_0_7, null);
				}
				    |
				lv_caType_0_8='combat_value_targets'
				{
					newLeafNode(lv_caType_0_8, grammarAccess.getDefualt_CAAccess().getCaTypeCombat_value_targetsKeyword_0_7());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefualt_CARule());
					}
					setWithLastConsumed($current, "caType", lv_caType_0_8, null);
				}
				    |
				lv_caType_0_9='capture_villages'
				{
					newLeafNode(lv_caType_0_9, grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_8());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefualt_CARule());
					}
					setWithLastConsumed($current, "caType", lv_caType_0_9, null);
				}
				    |
				lv_caType_0_10='leader_to_keep'
				{
					newLeafNode(lv_caType_0_10, grammarAccess.getDefualt_CAAccess().getCaTypeLeader_to_keepKeyword_0_9());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefualt_CARule());
					}
					setWithLastConsumed($current, "caType", lv_caType_0_10, null);
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
