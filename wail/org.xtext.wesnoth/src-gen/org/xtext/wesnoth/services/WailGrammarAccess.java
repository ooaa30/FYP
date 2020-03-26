/*
 * generated by Xtext 2.21.0
 */
package org.xtext.wesnoth.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class WailGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.wesnoth.Wail.Model");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsRuleParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Model:
		//	elements+=Rule*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Rule*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Rule
		public RuleCall getElementsRuleParserRuleCall_0() { return cElementsRuleParserRuleCall_0; }
	}
	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.wesnoth.Wail.Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFragmentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFragmentsFragmentParserRuleCall_3_0 = (RuleCall)cFragmentsAssignment_3.eContents().get(0);
		private final Assignment cGoalsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cGoalsGoalParserRuleCall_4_0 = (RuleCall)cGoalsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Rule:
		//	'rule' name=STRING
		//	'{'
		//	fragments+=Fragment*
		//	goals+=Goal*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'rule' name=STRING '{' fragments+=Fragment* goals+=Goal* '}'
		public Group getGroup() { return cGroup; }
		
		//'rule'
		public Keyword getRuleKeyword_0() { return cRuleKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//fragments+=Fragment*
		public Assignment getFragmentsAssignment_3() { return cFragmentsAssignment_3; }
		
		//Fragment
		public RuleCall getFragmentsFragmentParserRuleCall_3_0() { return cFragmentsFragmentParserRuleCall_3_0; }
		
		//goals+=Goal*
		public Assignment getGoalsAssignment_4() { return cGoalsAssignment_4; }
		
		//Goal
		public RuleCall getGoalsGoalParserRuleCall_4_0() { return cGoalsGoalParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class FragmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.wesnoth.Wail.Fragment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConditionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cConditionConditionalParserRuleCall_0_0 = (RuleCall)cConditionAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDefualt_casAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDefualt_casDefualt_CAParserRuleCall_2_0 = (RuleCall)cDefualt_casAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Fragment:
		//	condition=Conditional
		//	'{'
		//	defualt_cas+=Defualt_CA*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//condition=Conditional '{' defualt_cas+=Defualt_CA* '}'
		public Group getGroup() { return cGroup; }
		
		//condition=Conditional
		public Assignment getConditionAssignment_0() { return cConditionAssignment_0; }
		
		//Conditional
		public RuleCall getConditionConditionalParserRuleCall_0_0() { return cConditionConditionalParserRuleCall_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//defualt_cas+=Defualt_CA*
		public Assignment getDefualt_casAssignment_2() { return cDefualt_casAssignment_2; }
		
		//Defualt_CA
		public RuleCall getDefualt_casDefualt_CAParserRuleCall_2_0() { return cDefualt_casDefualt_CAParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class ConditionalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.wesnoth.Wail.Conditional");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWhenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cXAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cXWhenRulesParserRuleCall_1_0 = (RuleCall)cXAssignment_1.eContents().get(0);
		
		//// filters don't seem to work in the [AI} tag, may need to make the code generation subtractive rather than additive
		//// could use [Modify_AI] tag to do this, need investigation
		//// might be worth deleting all existing candidate actions then adding them back in via the use of macros
		//// can use filter own for unit types 100%, may be able to filter other things too
		//// will need to add them in from scratch with wml, no extra code but need to refferenc them again
		//Conditional:
		//	'when:' x=whenRules;
		@Override public ParserRule getRule() { return rule; }
		
		//'when:' x=whenRules
		public Group getGroup() { return cGroup; }
		
		//'when:'
		public Keyword getWhenKeyword_0() { return cWhenKeyword_0; }
		
		//x=whenRules
		public Assignment getXAssignment_1() { return cXAssignment_1; }
		
		//whenRules
		public RuleCall getXWhenRulesParserRuleCall_1_0() { return cXWhenRulesParserRuleCall_1_0; }
	}
	public class WhenRulesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.wesnoth.Wail.whenRules");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cUnitEqualsParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAtLocationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDamageParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cBaselineParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//whenRules:
		//	UnitEquals | AtLocation | Damage | Baseline;
		@Override public ParserRule getRule() { return rule; }
		
		//UnitEquals | AtLocation | Damage | Baseline
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//UnitEquals
		public RuleCall getUnitEqualsParserRuleCall_0() { return cUnitEqualsParserRuleCall_0; }
		
		//AtLocation
		public RuleCall getAtLocationParserRuleCall_1() { return cAtLocationParserRuleCall_1; }
		
		//Damage
		public RuleCall getDamageParserRuleCall_2() { return cDamageParserRuleCall_2; }
		
		//Baseline
		public RuleCall getBaselineParserRuleCall_3() { return cBaselineParserRuleCall_3; }
	}
	public class BaselineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.wesnoth.Wail.Baseline");
		private final Assignment cAlwaysAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cAlwaysAlwaysKeyword_0 = (Keyword)cAlwaysAssignment.eContents().get(0);
		
		//Baseline:
		//	always='always';
		@Override public ParserRule getRule() { return rule; }
		
		//always='always'
		public Assignment getAlwaysAssignment() { return cAlwaysAssignment; }
		
		//'always'
		public Keyword getAlwaysAlwaysKeyword_0() { return cAlwaysAlwaysKeyword_0; }
	}
	public class DamageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.wesnoth.Wail.Damage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHealthKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cHealthAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cHealthINTTerminalRuleCall_2_0 = (RuleCall)cHealthAssignment_2.eContents().get(0);
		
		//Damage:
		//	'health' '-' health=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'health' '-' health=INT
		public Group getGroup() { return cGroup; }
		
		//'health'
		public Keyword getHealthKeyword_0() { return cHealthKeyword_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1() { return cHyphenMinusKeyword_1; }
		
		//health=INT
		public Assignment getHealthAssignment_2() { return cHealthAssignment_2; }
		
		//INT
		public RuleCall getHealthINTTerminalRuleCall_2_0() { return cHealthINTTerminalRuleCall_2_0; }
	}
	public class AtLocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.wesnoth.Wail.AtLocation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cXKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cXAxisAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cXAxisINTTerminalRuleCall_1_0 = (RuleCall)cXAxisAssignment_1.eContents().get(0);
		private final Keyword cYKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cYAxisAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cYAxisINTTerminalRuleCall_3_0 = (RuleCall)cYAxisAssignment_3.eContents().get(0);
		
		//AtLocation:
		//	'x:' XAxis=INT 'y:' YAxis=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'x:' XAxis=INT 'y:' YAxis=INT
		public Group getGroup() { return cGroup; }
		
		//'x:'
		public Keyword getXKeyword_0() { return cXKeyword_0; }
		
		//XAxis=INT
		public Assignment getXAxisAssignment_1() { return cXAxisAssignment_1; }
		
		//INT
		public RuleCall getXAxisINTTerminalRuleCall_1_0() { return cXAxisINTTerminalRuleCall_1_0; }
		
		//'y:'
		public Keyword getYKeyword_2() { return cYKeyword_2; }
		
		//YAxis=INT
		public Assignment getYAxisAssignment_3() { return cYAxisAssignment_3; }
		
		//INT
		public RuleCall getYAxisINTTerminalRuleCall_3_0() { return cYAxisINTTerminalRuleCall_3_0; }
	}
	public class UnitEqualsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.wesnoth.Wail.UnitEquals");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUnitKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUnitSTRINGTerminalRuleCall_2_0 = (RuleCall)cUnitAssignment_2.eContents().get(0);
		
		//UnitEquals:
		//	'unit' 'is' unit=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'unit' 'is' unit=STRING
		public Group getGroup() { return cGroup; }
		
		//'unit'
		public Keyword getUnitKeyword_0() { return cUnitKeyword_0; }
		
		//'is'
		public Keyword getIsKeyword_1() { return cIsKeyword_1; }
		
		//unit=STRING
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//STRING
		public RuleCall getUnitSTRINGTerminalRuleCall_2_0() { return cUnitSTRINGTerminalRuleCall_2_0; }
	}
	public class GoalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.wesnoth.Wail.Goal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGoalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cGoalAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cGoalGoaLocationParserRuleCall_2_0 = (RuleCall)cGoalAssignment_2.eContents().get(0);
		private final Keyword cValueKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cIsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cLocValueAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cLocValueINTTerminalRuleCall_5_0 = (RuleCall)cLocValueAssignment_5.eContents().get(0);
		
		//Goal:
		//	'goal' 'is' goal=GoaLocation 'value' 'is' locValue=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'goal' 'is' goal=GoaLocation 'value' 'is' locValue=INT
		public Group getGroup() { return cGroup; }
		
		//'goal'
		public Keyword getGoalKeyword_0() { return cGoalKeyword_0; }
		
		//'is'
		public Keyword getIsKeyword_1() { return cIsKeyword_1; }
		
		//goal=GoaLocation
		public Assignment getGoalAssignment_2() { return cGoalAssignment_2; }
		
		//GoaLocation
		public RuleCall getGoalGoaLocationParserRuleCall_2_0() { return cGoalGoaLocationParserRuleCall_2_0; }
		
		//'value'
		public Keyword getValueKeyword_3() { return cValueKeyword_3; }
		
		//'is'
		public Keyword getIsKeyword_4() { return cIsKeyword_4; }
		
		//locValue=INT
		public Assignment getLocValueAssignment_5() { return cLocValueAssignment_5; }
		
		//INT
		public RuleCall getLocValueINTTerminalRuleCall_5_0() { return cLocValueINTTerminalRuleCall_5_0; }
	}
	public class GoaLocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.wesnoth.Wail.GoaLocation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cXKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cXAxisAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cXAxisINTTerminalRuleCall_1_0 = (RuleCall)cXAxisAssignment_1.eContents().get(0);
		private final Keyword cYKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cYAxisAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cYAxisINTTerminalRuleCall_3_0 = (RuleCall)cYAxisAssignment_3.eContents().get(0);
		
		//GoaLocation:
		//	'x' XAxis=INT 'y' YAxis=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'x' XAxis=INT 'y' YAxis=INT
		public Group getGroup() { return cGroup; }
		
		//'x'
		public Keyword getXKeyword_0() { return cXKeyword_0; }
		
		//XAxis=INT
		public Assignment getXAxisAssignment_1() { return cXAxisAssignment_1; }
		
		//INT
		public RuleCall getXAxisINTTerminalRuleCall_1_0() { return cXAxisINTTerminalRuleCall_1_0; }
		
		//'y'
		public Keyword getYKeyword_2() { return cYKeyword_2; }
		
		//YAxis=INT
		public Assignment getYAxisAssignment_3() { return cYAxisAssignment_3; }
		
		//INT
		public RuleCall getYAxisINTTerminalRuleCall_3_0() { return cYAxisINTTerminalRuleCall_3_0; }
	}
	public class New_CAElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.wesnoth.Wail.New_CA");
		private final Keyword cNewCAKeyword = (Keyword)rule.eContents().get(1);
		
		//New_CA:
		//	'newCA';
		@Override public ParserRule getRule() { return rule; }
		
		//'newCA'
		public Keyword getNewCAKeyword() { return cNewCAKeyword; }
	}
	public class Defualt_CAElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.wesnoth.Wail.Defualt_CA");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCaTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cCaTypeAlternatives_0_0 = (Alternatives)cCaTypeAssignment_0.eContents().get(0);
		private final Keyword cCaTypeMovementKeyword_0_0_0 = (Keyword)cCaTypeAlternatives_0_0.eContents().get(0);
		private final Keyword cCaTypeHealKeyword_0_0_1 = (Keyword)cCaTypeAlternatives_0_0.eContents().get(1);
		private final Keyword cCaTypeRetreatKeyword_0_0_2 = (Keyword)cCaTypeAlternatives_0_0.eContents().get(2);
		private final Keyword cCaTypeMove_to_targetsKeyword_0_0_3 = (Keyword)cCaTypeAlternatives_0_0.eContents().get(3);
		private final Keyword cCaTypeBasic_movementKeyword_0_0_4 = (Keyword)cCaTypeAlternatives_0_0.eContents().get(4);
		private final Keyword cCaTypeCombatKeyword_0_0_5 = (Keyword)cCaTypeAlternatives_0_0.eContents().get(5);
		private final Keyword cCaTypeRecruitKeyword_0_0_6 = (Keyword)cCaTypeAlternatives_0_0.eContents().get(6);
		private final Keyword cCaTypeCombat_value_targetsKeyword_0_0_7 = (Keyword)cCaTypeAlternatives_0_0.eContents().get(7);
		private final Keyword cCaTypeCapture_villagesKeyword_0_0_8 = (Keyword)cCaTypeAlternatives_0_0.eContents().get(8);
		private final Keyword cCaTypeLeader_to_keepKeyword_0_0_9 = (Keyword)cCaTypeAlternatives_0_0.eContents().get(9);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCostKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cCostAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cCostINTTerminalRuleCall_1_1_0 = (RuleCall)cCostAssignment_1_1.eContents().get(0);
		
		//Defualt_CA:
		//	caType=("movement" | "heal" | "retreat" | "move_to_targets" | "basic_movement" | "combat" | "recruit" |
		//	"combat_value_targets" | "capture_villages" | "leader_to_keep") ('cost' cost=INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//caType=("movement" | "heal" | "retreat" | "move_to_targets" | "basic_movement" | "combat" | "recruit" |
		//"combat_value_targets" | "capture_villages" | "leader_to_keep") ('cost' cost=INT)?
		public Group getGroup() { return cGroup; }
		
		//caType=("movement" | "heal" | "retreat" | "move_to_targets" | "basic_movement" | "combat" | "recruit" |
		//"combat_value_targets" | "capture_villages" | "leader_to_keep")
		public Assignment getCaTypeAssignment_0() { return cCaTypeAssignment_0; }
		
		//("movement" | "heal" | "retreat" | "move_to_targets" | "basic_movement" | "combat" | "recruit" | "combat_value_targets"
		//| "capture_villages" | "leader_to_keep")
		public Alternatives getCaTypeAlternatives_0_0() { return cCaTypeAlternatives_0_0; }
		
		//"movement"
		public Keyword getCaTypeMovementKeyword_0_0_0() { return cCaTypeMovementKeyword_0_0_0; }
		
		//"heal"
		public Keyword getCaTypeHealKeyword_0_0_1() { return cCaTypeHealKeyword_0_0_1; }
		
		//"retreat"
		public Keyword getCaTypeRetreatKeyword_0_0_2() { return cCaTypeRetreatKeyword_0_0_2; }
		
		//"move_to_targets"
		public Keyword getCaTypeMove_to_targetsKeyword_0_0_3() { return cCaTypeMove_to_targetsKeyword_0_0_3; }
		
		//"basic_movement"
		public Keyword getCaTypeBasic_movementKeyword_0_0_4() { return cCaTypeBasic_movementKeyword_0_0_4; }
		
		//"combat"
		public Keyword getCaTypeCombatKeyword_0_0_5() { return cCaTypeCombatKeyword_0_0_5; }
		
		//"recruit"
		public Keyword getCaTypeRecruitKeyword_0_0_6() { return cCaTypeRecruitKeyword_0_0_6; }
		
		//"combat_value_targets"
		public Keyword getCaTypeCombat_value_targetsKeyword_0_0_7() { return cCaTypeCombat_value_targetsKeyword_0_0_7; }
		
		//"capture_villages"
		public Keyword getCaTypeCapture_villagesKeyword_0_0_8() { return cCaTypeCapture_villagesKeyword_0_0_8; }
		
		//"leader_to_keep"
		public Keyword getCaTypeLeader_to_keepKeyword_0_0_9() { return cCaTypeLeader_to_keepKeyword_0_0_9; }
		
		//('cost' cost=INT)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'cost'
		public Keyword getCostKeyword_1_0() { return cCostKeyword_1_0; }
		
		//cost=INT
		public Assignment getCostAssignment_1_1() { return cCostAssignment_1_1; }
		
		//INT
		public RuleCall getCostINTTerminalRuleCall_1_1_0() { return cCostINTTerminalRuleCall_1_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final RuleElements pRule;
	private final FragmentElements pFragment;
	private final ConditionalElements pConditional;
	private final WhenRulesElements pWhenRules;
	private final BaselineElements pBaseline;
	private final DamageElements pDamage;
	private final AtLocationElements pAtLocation;
	private final UnitEqualsElements pUnitEquals;
	private final GoalElements pGoal;
	private final GoaLocationElements pGoaLocation;
	private final New_CAElements pNew_CA;
	private final Defualt_CAElements pDefualt_CA;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public WailGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pRule = new RuleElements();
		this.pFragment = new FragmentElements();
		this.pConditional = new ConditionalElements();
		this.pWhenRules = new WhenRulesElements();
		this.pBaseline = new BaselineElements();
		this.pDamage = new DamageElements();
		this.pAtLocation = new AtLocationElements();
		this.pUnitEquals = new UnitEqualsElements();
		this.pGoal = new GoalElements();
		this.pGoaLocation = new GoaLocationElements();
		this.pNew_CA = new New_CAElements();
		this.pDefualt_CA = new Defualt_CAElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.wesnoth.Wail".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	elements+=Rule*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Rule:
	//	'rule' name=STRING
	//	'{'
	//	fragments+=Fragment*
	//	goals+=Goal*
	//	'}';
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//Fragment:
	//	condition=Conditional
	//	'{'
	//	defualt_cas+=Defualt_CA*
	//	'}';
	public FragmentElements getFragmentAccess() {
		return pFragment;
	}
	
	public ParserRule getFragmentRule() {
		return getFragmentAccess().getRule();
	}
	
	//// filters don't seem to work in the [AI} tag, may need to make the code generation subtractive rather than additive
	//// could use [Modify_AI] tag to do this, need investigation
	//// might be worth deleting all existing candidate actions then adding them back in via the use of macros
	//// can use filter own for unit types 100%, may be able to filter other things too
	//// will need to add them in from scratch with wml, no extra code but need to refferenc them again
	//Conditional:
	//	'when:' x=whenRules;
	public ConditionalElements getConditionalAccess() {
		return pConditional;
	}
	
	public ParserRule getConditionalRule() {
		return getConditionalAccess().getRule();
	}
	
	//whenRules:
	//	UnitEquals | AtLocation | Damage | Baseline;
	public WhenRulesElements getWhenRulesAccess() {
		return pWhenRules;
	}
	
	public ParserRule getWhenRulesRule() {
		return getWhenRulesAccess().getRule();
	}
	
	//Baseline:
	//	always='always';
	public BaselineElements getBaselineAccess() {
		return pBaseline;
	}
	
	public ParserRule getBaselineRule() {
		return getBaselineAccess().getRule();
	}
	
	//Damage:
	//	'health' '-' health=INT;
	public DamageElements getDamageAccess() {
		return pDamage;
	}
	
	public ParserRule getDamageRule() {
		return getDamageAccess().getRule();
	}
	
	//AtLocation:
	//	'x:' XAxis=INT 'y:' YAxis=INT;
	public AtLocationElements getAtLocationAccess() {
		return pAtLocation;
	}
	
	public ParserRule getAtLocationRule() {
		return getAtLocationAccess().getRule();
	}
	
	//UnitEquals:
	//	'unit' 'is' unit=STRING;
	public UnitEqualsElements getUnitEqualsAccess() {
		return pUnitEquals;
	}
	
	public ParserRule getUnitEqualsRule() {
		return getUnitEqualsAccess().getRule();
	}
	
	//Goal:
	//	'goal' 'is' goal=GoaLocation 'value' 'is' locValue=INT;
	public GoalElements getGoalAccess() {
		return pGoal;
	}
	
	public ParserRule getGoalRule() {
		return getGoalAccess().getRule();
	}
	
	//GoaLocation:
	//	'x' XAxis=INT 'y' YAxis=INT;
	public GoaLocationElements getGoaLocationAccess() {
		return pGoaLocation;
	}
	
	public ParserRule getGoaLocationRule() {
		return getGoaLocationAccess().getRule();
	}
	
	//New_CA:
	//	'newCA';
	public New_CAElements getNew_CAAccess() {
		return pNew_CA;
	}
	
	public ParserRule getNew_CARule() {
		return getNew_CAAccess().getRule();
	}
	
	//Defualt_CA:
	//	caType=("movement" | "heal" | "retreat" | "move_to_targets" | "basic_movement" | "combat" | "recruit" |
	//	"combat_value_targets" | "capture_villages" | "leader_to_keep") ('cost' cost=INT)?;
	public Defualt_CAElements getDefualt_CAAccess() {
		return pDefualt_CA;
	}
	
	public ParserRule getDefualt_CARule() {
		return getDefualt_CAAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
