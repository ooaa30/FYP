/*
 * generated by Xtext 2.21.0
 */
grammar InternalWail;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.wesnoth.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getElementsAssignment()); }
		(rule__Model__ElementsAssignment)*
		{ after(grammarAccess.getModelAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRule
entryRuleRule
:
{ before(grammarAccess.getRuleRule()); }
	 ruleRule
{ after(grammarAccess.getRuleRule()); } 
	 EOF 
;

// Rule Rule
ruleRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRuleAccess().getGroup()); }
		(rule__Rule__Group__0)
		{ after(grammarAccess.getRuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFragment
entryRuleFragment
:
{ before(grammarAccess.getFragmentRule()); }
	 ruleFragment
{ after(grammarAccess.getFragmentRule()); } 
	 EOF 
;

// Rule Fragment
ruleFragment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFragmentAccess().getGroup()); }
		(rule__Fragment__Group__0)
		{ after(grammarAccess.getFragmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConditional
entryRuleConditional
:
{ before(grammarAccess.getConditionalRule()); }
	 ruleConditional
{ after(grammarAccess.getConditionalRule()); } 
	 EOF 
;

// Rule Conditional
ruleConditional 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConditionalAccess().getGroup()); }
		(rule__Conditional__Group__0)
		{ after(grammarAccess.getConditionalAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulewhenRules
entryRulewhenRules
:
{ before(grammarAccess.getWhenRulesRule()); }
	 rulewhenRules
{ after(grammarAccess.getWhenRulesRule()); } 
	 EOF 
;

// Rule whenRules
rulewhenRules 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWhenRulesAccess().getAlternatives()); }
		(rule__WhenRules__Alternatives)
		{ after(grammarAccess.getWhenRulesAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBaseline
entryRuleBaseline
:
{ before(grammarAccess.getBaselineRule()); }
	 ruleBaseline
{ after(grammarAccess.getBaselineRule()); } 
	 EOF 
;

// Rule Baseline
ruleBaseline 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBaselineAccess().getAlwaysAssignment()); }
		(rule__Baseline__AlwaysAssignment)
		{ after(grammarAccess.getBaselineAccess().getAlwaysAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDamage
entryRuleDamage
:
{ before(grammarAccess.getDamageRule()); }
	 ruleDamage
{ after(grammarAccess.getDamageRule()); } 
	 EOF 
;

// Rule Damage
ruleDamage 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDamageAccess().getGroup()); }
		(rule__Damage__Group__0)
		{ after(grammarAccess.getDamageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtLocation
entryRuleAtLocation
:
{ before(grammarAccess.getAtLocationRule()); }
	 ruleAtLocation
{ after(grammarAccess.getAtLocationRule()); } 
	 EOF 
;

// Rule AtLocation
ruleAtLocation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtLocationAccess().getGroup()); }
		(rule__AtLocation__Group__0)
		{ after(grammarAccess.getAtLocationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnitEquals
entryRuleUnitEquals
:
{ before(grammarAccess.getUnitEqualsRule()); }
	 ruleUnitEquals
{ after(grammarAccess.getUnitEqualsRule()); } 
	 EOF 
;

// Rule UnitEquals
ruleUnitEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnitEqualsAccess().getGroup()); }
		(rule__UnitEquals__Group__0)
		{ after(grammarAccess.getUnitEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGoal
entryRuleGoal
:
{ before(grammarAccess.getGoalRule()); }
	 ruleGoal
{ after(grammarAccess.getGoalRule()); } 
	 EOF 
;

// Rule Goal
ruleGoal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGoalAccess().getGroup()); }
		(rule__Goal__Group__0)
		{ after(grammarAccess.getGoalAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGoaLocation
entryRuleGoaLocation
:
{ before(grammarAccess.getGoaLocationRule()); }
	 ruleGoaLocation
{ after(grammarAccess.getGoaLocationRule()); } 
	 EOF 
;

// Rule GoaLocation
ruleGoaLocation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGoaLocationAccess().getGroup()); }
		(rule__GoaLocation__Group__0)
		{ after(grammarAccess.getGoaLocationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefualt_CA
entryRuleDefualt_CA
:
{ before(grammarAccess.getDefualt_CARule()); }
	 ruleDefualt_CA
{ after(grammarAccess.getDefualt_CARule()); } 
	 EOF 
;

// Rule Defualt_CA
ruleDefualt_CA 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefualt_CAAccess().getGroup()); }
		(rule__Defualt_CA__Group__0)
		{ after(grammarAccess.getDefualt_CAAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WhenRules__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWhenRulesAccess().getUnitEqualsParserRuleCall_0()); }
		ruleUnitEquals
		{ after(grammarAccess.getWhenRulesAccess().getUnitEqualsParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getWhenRulesAccess().getAtLocationParserRuleCall_1()); }
		ruleAtLocation
		{ after(grammarAccess.getWhenRulesAccess().getAtLocationParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getWhenRulesAccess().getDamageParserRuleCall_2()); }
		ruleDamage
		{ after(grammarAccess.getWhenRulesAccess().getDamageParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getWhenRulesAccess().getBaselineParserRuleCall_3()); }
		ruleBaseline
		{ after(grammarAccess.getWhenRulesAccess().getBaselineParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Defualt_CA__CaTypeAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0_0()); }
		'movement'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeHealKeyword_0_0_1()); }
		'heal'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeHealKeyword_0_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_0_2()); }
		'retreat'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetsKeyword_0_0_3()); }
		'move_to_targets'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetsKeyword_0_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeBasic_movementKeyword_0_0_4()); }
		'basic_movement'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeBasic_movementKeyword_0_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_0_5()); }
		'combat'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_0_6()); }
		'recruit'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_0_6()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeCombat_value_targetsKeyword_0_0_7()); }
		'combat_value_targets'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeCombat_value_targetsKeyword_0_0_7()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_0_8()); }
		'capture_villages'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_0_8()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeLeader_to_keepKeyword_0_0_9()); }
		'leader_to_keep'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeLeader_to_keepKeyword_0_0_9()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__0__Impl
	rule__Rule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getRuleKeyword_0()); }
	'rule'
	{ after(grammarAccess.getRuleAccess().getRuleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__1__Impl
	rule__Rule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getNameAssignment_1()); }
	(rule__Rule__NameAssignment_1)
	{ after(grammarAccess.getRuleAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__2__Impl
	rule__Rule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__3__Impl
	rule__Rule__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getFragmentsAssignment_3()); }
	(rule__Rule__FragmentsAssignment_3)*
	{ after(grammarAccess.getRuleAccess().getFragmentsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__4__Impl
	rule__Rule__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getGoalsAssignment_4()); }
	(rule__Rule__GoalsAssignment_4)*
	{ after(grammarAccess.getRuleAccess().getGoalsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Fragment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fragment__Group__0__Impl
	rule__Fragment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Fragment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFragmentAccess().getConditionAssignment_0()); }
	(rule__Fragment__ConditionAssignment_0)
	{ after(grammarAccess.getFragmentAccess().getConditionAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fragment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fragment__Group__1__Impl
	rule__Fragment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Fragment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFragmentAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getFragmentAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fragment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fragment__Group__2__Impl
	rule__Fragment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Fragment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFragmentAccess().getDefualt_casAssignment_2()); }
	(rule__Fragment__Defualt_casAssignment_2)*
	{ after(grammarAccess.getFragmentAccess().getDefualt_casAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fragment__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fragment__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Fragment__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFragmentAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getFragmentAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Conditional__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conditional__Group__0__Impl
	rule__Conditional__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalAccess().getWhenKeyword_0()); }
	'when:'
	{ after(grammarAccess.getConditionalAccess().getWhenKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conditional__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalAccess().getXAssignment_1()); }
	(rule__Conditional__XAssignment_1)
	{ after(grammarAccess.getConditionalAccess().getXAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Damage__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Damage__Group__0__Impl
	rule__Damage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Damage__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDamageAccess().getHealthKeyword_0()); }
	'health'
	{ after(grammarAccess.getDamageAccess().getHealthKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Damage__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Damage__Group__1__Impl
	rule__Damage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Damage__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDamageAccess().getHyphenMinusKeyword_1()); }
	'-'
	{ after(grammarAccess.getDamageAccess().getHyphenMinusKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Damage__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Damage__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Damage__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDamageAccess().getHealthAssignment_2()); }
	(rule__Damage__HealthAssignment_2)
	{ after(grammarAccess.getDamageAccess().getHealthAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtLocation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtLocation__Group__0__Impl
	rule__AtLocation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtLocation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtLocationAccess().getXKeyword_0()); }
	'x:'
	{ after(grammarAccess.getAtLocationAccess().getXKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtLocation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtLocation__Group__1__Impl
	rule__AtLocation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtLocation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtLocationAccess().getXAxisAssignment_1()); }
	(rule__AtLocation__XAxisAssignment_1)
	{ after(grammarAccess.getAtLocationAccess().getXAxisAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtLocation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtLocation__Group__2__Impl
	rule__AtLocation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtLocation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtLocationAccess().getYKeyword_2()); }
	'y:'
	{ after(grammarAccess.getAtLocationAccess().getYKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtLocation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtLocation__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtLocation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtLocationAccess().getYAxisAssignment_3()); }
	(rule__AtLocation__YAxisAssignment_3)
	{ after(grammarAccess.getAtLocationAccess().getYAxisAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnitEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitEquals__Group__0__Impl
	rule__UnitEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitEqualsAccess().getUnitKeyword_0()); }
	'unit'
	{ after(grammarAccess.getUnitEqualsAccess().getUnitKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitEquals__Group__1__Impl
	rule__UnitEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitEqualsAccess().getIsKeyword_1()); }
	'is'
	{ after(grammarAccess.getUnitEqualsAccess().getIsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnitEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitEqualsAccess().getUnitAssignment_2()); }
	(rule__UnitEquals__UnitAssignment_2)
	{ after(grammarAccess.getUnitEqualsAccess().getUnitAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Goal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Goal__Group__0__Impl
	rule__Goal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Goal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoalAccess().getGoalKeyword_0()); }
	'goal'
	{ after(grammarAccess.getGoalAccess().getGoalKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Goal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Goal__Group__1__Impl
	rule__Goal__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Goal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoalAccess().getIsKeyword_1()); }
	'is'
	{ after(grammarAccess.getGoalAccess().getIsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Goal__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Goal__Group__2__Impl
	rule__Goal__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Goal__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoalAccess().getGoalAssignment_2()); }
	(rule__Goal__GoalAssignment_2)
	{ after(grammarAccess.getGoalAccess().getGoalAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Goal__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Goal__Group__3__Impl
	rule__Goal__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Goal__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoalAccess().getValueKeyword_3()); }
	'value'
	{ after(grammarAccess.getGoalAccess().getValueKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Goal__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Goal__Group__4__Impl
	rule__Goal__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Goal__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoalAccess().getIsKeyword_4()); }
	'is'
	{ after(grammarAccess.getGoalAccess().getIsKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Goal__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Goal__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Goal__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoalAccess().getLocValueAssignment_5()); }
	(rule__Goal__LocValueAssignment_5)
	{ after(grammarAccess.getGoalAccess().getLocValueAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GoaLocation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoaLocation__Group__0__Impl
	rule__GoaLocation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GoaLocation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoaLocationAccess().getXKeyword_0()); }
	'x'
	{ after(grammarAccess.getGoaLocationAccess().getXKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoaLocation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoaLocation__Group__1__Impl
	rule__GoaLocation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GoaLocation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoaLocationAccess().getXAxisAssignment_1()); }
	(rule__GoaLocation__XAxisAssignment_1)
	{ after(grammarAccess.getGoaLocationAccess().getXAxisAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoaLocation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoaLocation__Group__2__Impl
	rule__GoaLocation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GoaLocation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoaLocationAccess().getYKeyword_2()); }
	'y'
	{ after(grammarAccess.getGoaLocationAccess().getYKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoaLocation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GoaLocation__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GoaLocation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGoaLocationAccess().getYAxisAssignment_3()); }
	(rule__GoaLocation__YAxisAssignment_3)
	{ after(grammarAccess.getGoaLocationAccess().getYAxisAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Defualt_CA__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Defualt_CA__Group__0__Impl
	rule__Defualt_CA__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Defualt_CA__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefualt_CAAccess().getCaTypeAssignment_0()); }
	(rule__Defualt_CA__CaTypeAssignment_0)
	{ after(grammarAccess.getDefualt_CAAccess().getCaTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Defualt_CA__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Defualt_CA__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Defualt_CA__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefualt_CAAccess().getGroup_1()); }
	(rule__Defualt_CA__Group_1__0)?
	{ after(grammarAccess.getDefualt_CAAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Defualt_CA__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Defualt_CA__Group_1__0__Impl
	rule__Defualt_CA__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Defualt_CA__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefualt_CAAccess().getCostKeyword_1_0()); }
	'cost'
	{ after(grammarAccess.getDefualt_CAAccess().getCostKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Defualt_CA__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Defualt_CA__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Defualt_CA__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefualt_CAAccess().getCostAssignment_1_1()); }
	(rule__Defualt_CA__CostAssignment_1_1)
	{ after(grammarAccess.getDefualt_CAAccess().getCostAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElementsRuleParserRuleCall_0()); }
		ruleRule
		{ after(grammarAccess.getModelAccess().getElementsRuleParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getRuleAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__FragmentsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getFragmentsFragmentParserRuleCall_3_0()); }
		ruleFragment
		{ after(grammarAccess.getRuleAccess().getFragmentsFragmentParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__GoalsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getGoalsGoalParserRuleCall_4_0()); }
		ruleGoal
		{ after(grammarAccess.getRuleAccess().getGoalsGoalParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fragment__ConditionAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFragmentAccess().getConditionConditionalParserRuleCall_0_0()); }
		ruleConditional
		{ after(grammarAccess.getFragmentAccess().getConditionConditionalParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fragment__Defualt_casAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFragmentAccess().getDefualt_casDefualt_CAParserRuleCall_2_0()); }
		ruleDefualt_CA
		{ after(grammarAccess.getFragmentAccess().getDefualt_casDefualt_CAParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__XAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionalAccess().getXWhenRulesParserRuleCall_1_0()); }
		rulewhenRules
		{ after(grammarAccess.getConditionalAccess().getXWhenRulesParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Baseline__AlwaysAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBaselineAccess().getAlwaysAlwaysKeyword_0()); }
		(
			{ before(grammarAccess.getBaselineAccess().getAlwaysAlwaysKeyword_0()); }
			'always'
			{ after(grammarAccess.getBaselineAccess().getAlwaysAlwaysKeyword_0()); }
		)
		{ after(grammarAccess.getBaselineAccess().getAlwaysAlwaysKeyword_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Damage__HealthAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDamageAccess().getHealthINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getDamageAccess().getHealthINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtLocation__XAxisAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtLocationAccess().getXAxisINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getAtLocationAccess().getXAxisINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtLocation__YAxisAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtLocationAccess().getYAxisINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getAtLocationAccess().getYAxisINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitEquals__UnitAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitEqualsAccess().getUnitSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getUnitEqualsAccess().getUnitSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Goal__GoalAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGoalAccess().getGoalGoaLocationParserRuleCall_2_0()); }
		ruleGoaLocation
		{ after(grammarAccess.getGoalAccess().getGoalGoaLocationParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Goal__LocValueAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGoalAccess().getLocValueINTTerminalRuleCall_5_0()); }
		RULE_INT
		{ after(grammarAccess.getGoalAccess().getLocValueINTTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoaLocation__XAxisAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGoaLocationAccess().getXAxisINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getGoaLocationAccess().getXAxisINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GoaLocation__YAxisAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGoaLocationAccess().getYAxisINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getGoaLocationAccess().getYAxisINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Defualt_CA__CaTypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeAlternatives_0_0()); }
		(rule__Defualt_CA__CaTypeAlternatives_0_0)
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Defualt_CA__CostAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCostINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getDefualt_CAAccess().getCostINTTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
