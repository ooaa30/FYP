/*
 * generated by Xtext 2.20.0
 */
package fyp.xtext.wesnoth.mydsl.serializer;

import com.google.inject.Inject;
import fyp.xtext.wesnoth.mydsl.services.WesnothDSLGrammarAccess;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.AtLocation;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Baseline;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Conditional;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Damage;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Defualt_CA;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Fragment;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.GoaLocation;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Goal;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Model;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Rule;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.UnitEquals;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.WesnothDSLPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class WesnothDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WesnothDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == WesnothDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case WesnothDSLPackage.AT_LOCATION:
				sequence_AtLocation(context, (AtLocation) semanticObject); 
				return; 
			case WesnothDSLPackage.BASELINE:
				sequence_Baseline(context, (Baseline) semanticObject); 
				return; 
			case WesnothDSLPackage.CONDITIONAL:
				sequence_Conditional(context, (Conditional) semanticObject); 
				return; 
			case WesnothDSLPackage.DAMAGE:
				sequence_Damage(context, (Damage) semanticObject); 
				return; 
			case WesnothDSLPackage.DEFUALT_CA:
				sequence_Defualt_CA(context, (Defualt_CA) semanticObject); 
				return; 
			case WesnothDSLPackage.FRAGMENT:
				sequence_Fragment(context, (Fragment) semanticObject); 
				return; 
			case WesnothDSLPackage.GOA_LOCATION:
				sequence_GoaLocation(context, (GoaLocation) semanticObject); 
				return; 
			case WesnothDSLPackage.GOAL:
				sequence_Goal(context, (Goal) semanticObject); 
				return; 
			case WesnothDSLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case WesnothDSLPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case WesnothDSLPackage.UNIT_EQUALS:
				sequence_UnitEquals(context, (UnitEquals) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     whenRules returns AtLocation
	 *     AtLocation returns AtLocation
	 *
	 * Constraint:
	 *     (XAxis=INT YAxis=INT)
	 */
	protected void sequence_AtLocation(ISerializationContext context, AtLocation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WesnothDSLPackage.Literals.AT_LOCATION__XAXIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WesnothDSLPackage.Literals.AT_LOCATION__XAXIS));
			if (transientValues.isValueTransient(semanticObject, WesnothDSLPackage.Literals.AT_LOCATION__YAXIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WesnothDSLPackage.Literals.AT_LOCATION__YAXIS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtLocationAccess().getXAxisINTTerminalRuleCall_1_0(), semanticObject.getXAxis());
		feeder.accept(grammarAccess.getAtLocationAccess().getYAxisINTTerminalRuleCall_3_0(), semanticObject.getYAxis());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     whenRules returns Baseline
	 *     Baseline returns Baseline
	 *
	 * Constraint:
	 *     always='always'
	 */
	protected void sequence_Baseline(ISerializationContext context, Baseline semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WesnothDSLPackage.Literals.BASELINE__ALWAYS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WesnothDSLPackage.Literals.BASELINE__ALWAYS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBaselineAccess().getAlwaysAlwaysKeyword_0(), semanticObject.getAlways());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Conditional returns Conditional
	 *
	 * Constraint:
	 *     x=whenRules
	 */
	protected void sequence_Conditional(ISerializationContext context, Conditional semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WesnothDSLPackage.Literals.CONDITIONAL__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WesnothDSLPackage.Literals.CONDITIONAL__X));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionalAccess().getXWhenRulesParserRuleCall_1_0(), semanticObject.getX());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     whenRules returns Damage
	 *     Damage returns Damage
	 *
	 * Constraint:
	 *     health=INT
	 */
	protected void sequence_Damage(ISerializationContext context, Damage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WesnothDSLPackage.Literals.DAMAGE__HEALTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WesnothDSLPackage.Literals.DAMAGE__HEALTH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDamageAccess().getHealthINTTerminalRuleCall_2_0(), semanticObject.getHealth());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Defualt_CA returns Defualt_CA
	 *
	 * Constraint:
	 *     (
	 *         caType='movement' | 
	 *         caType='heal' | 
	 *         caType='retreat' | 
	 *         caType='move_to_targets' | 
	 *         caType='basic_movement' | 
	 *         caType='combat' | 
	 *         caType='recruit' | 
	 *         caType='combat_value_targets' | 
	 *         caType='capture_villages' | 
	 *         caType='leader_to_keep'
	 *     )
	 */
	protected void sequence_Defualt_CA(ISerializationContext context, Defualt_CA semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Fragment returns Fragment
	 *
	 * Constraint:
	 *     (condition=Conditional defualt_cas+=Defualt_CA*)
	 */
	protected void sequence_Fragment(ISerializationContext context, Fragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GoaLocation returns GoaLocation
	 *
	 * Constraint:
	 *     (XAxis=INT YAxis=INT)
	 */
	protected void sequence_GoaLocation(ISerializationContext context, GoaLocation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WesnothDSLPackage.Literals.GOA_LOCATION__XAXIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WesnothDSLPackage.Literals.GOA_LOCATION__XAXIS));
			if (transientValues.isValueTransient(semanticObject, WesnothDSLPackage.Literals.GOA_LOCATION__YAXIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WesnothDSLPackage.Literals.GOA_LOCATION__YAXIS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGoaLocationAccess().getXAxisINTTerminalRuleCall_1_0(), semanticObject.getXAxis());
		feeder.accept(grammarAccess.getGoaLocationAccess().getYAxisINTTerminalRuleCall_3_0(), semanticObject.getYAxis());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Goal returns Goal
	 *
	 * Constraint:
	 *     (goal=GoaLocation locValue=INT)
	 */
	protected void sequence_Goal(ISerializationContext context, Goal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WesnothDSLPackage.Literals.GOAL__GOAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WesnothDSLPackage.Literals.GOAL__GOAL));
			if (transientValues.isValueTransient(semanticObject, WesnothDSLPackage.Literals.GOAL__LOC_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WesnothDSLPackage.Literals.GOAL__LOC_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGoalAccess().getGoalGoaLocationParserRuleCall_2_0(), semanticObject.getGoal());
		feeder.accept(grammarAccess.getGoalAccess().getLocValueINTTerminalRuleCall_5_0(), semanticObject.getLocValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     elements+=Rule+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (name=STRING fragments+=Fragment goals+=Goal*)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     whenRules returns UnitEquals
	 *     UnitEquals returns UnitEquals
	 *
	 * Constraint:
	 *     unit=STRING
	 */
	protected void sequence_UnitEquals(ISerializationContext context, UnitEquals semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WesnothDSLPackage.Literals.UNIT_EQUALS__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WesnothDSLPackage.Literals.UNIT_EQUALS__UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnitEqualsAccess().getUnitSTRINGTerminalRuleCall_2_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
}
