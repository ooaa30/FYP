/*
 * generated by Xtext 2.20.0
 */
grammar InternalWesnothDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package fyp.xtext.wesnoth.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
		{ before(grammarAccess.getConditionalAccess().getAlternatives()); }
		(rule__Conditional__Alternatives)
		{ after(grammarAccess.getConditionalAccess().getAlternatives()); }
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
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeAssignment()); }
		(rule__Defualt_CA__CaTypeAssignment)
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionalAccess().getGroup_0()); }
		(rule__Conditional__Group_0__0)
		{ after(grammarAccess.getConditionalAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getConditionalAccess().getDamageParserRuleCall_1()); }
		ruleDamage
		{ after(grammarAccess.getConditionalAccess().getDamageParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getConditionalAccess().getUnitEqualsParserRuleCall_2()); }
		ruleUnitEquals
		{ after(grammarAccess.getConditionalAccess().getUnitEqualsParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Defualt_CA__CaTypeAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0()); }
		'movement'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeMovementKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_1()); }
		'retreat'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeRetreatKeyword_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetKeyword_0_2()); }
		'move_to_target'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_targetKeyword_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_3()); }
		'combat'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeCombatKeyword_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_4()); }
		'recruit'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeRecruitKeyword_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeFocus_high_XPKeyword_0_5()); }
		'focus_high_XP'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeFocus_high_XPKeyword_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_enemyKeyword_0_6()); }
		'move_to_enemy'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeMove_to_enemyKeyword_0_6()); }
	)
	|
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_7()); }
		'capture_villages'
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeCapture_villagesKeyword_0_7()); }
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
	(rule__Rule__FragmentsAssignment_3)
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
	{ before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); }
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


rule__Conditional__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conditional__Group_0__0__Impl
	rule__Conditional__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalAccess().getWhenKeyword_0_0()); }
	'when:'
	{ after(grammarAccess.getConditionalAccess().getWhenKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conditional__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditional__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalAccess().getConditionAssignment_0_1()); }
	(rule__Conditional__ConditionAssignment_0_1)
	{ after(grammarAccess.getConditionalAccess().getConditionAssignment_0_1()); }
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
	'x'
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
	{ before(grammarAccess.getAtLocationAccess().getXAssignment_1()); }
	(rule__AtLocation__XAssignment_1)
	{ after(grammarAccess.getAtLocationAccess().getXAssignment_1()); }
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
	'y'
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
	{ before(grammarAccess.getAtLocationAccess().getYAssignment_3()); }
	(rule__AtLocation__YAssignment_3)
	{ after(grammarAccess.getAtLocationAccess().getYAssignment_3()); }
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

rule__Conditional__ConditionAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionalAccess().getConditionAtLocationParserRuleCall_0_1_0()); }
		ruleAtLocation
		{ after(grammarAccess.getConditionalAccess().getConditionAtLocationParserRuleCall_0_1_0()); }
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

rule__AtLocation__XAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtLocationAccess().getXINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getAtLocationAccess().getXINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtLocation__YAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtLocationAccess().getYINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getAtLocationAccess().getYINTTerminalRuleCall_3_0()); }
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

rule__Defualt_CA__CaTypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefualt_CAAccess().getCaTypeAlternatives_0()); }
		(rule__Defualt_CA__CaTypeAlternatives_0)
		{ after(grammarAccess.getDefualt_CAAccess().getCaTypeAlternatives_0()); }
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
