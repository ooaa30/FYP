/*
 * generated by Xtext 2.20.0
 */
package fyp.xtext.wesnoth.mydsl.serializer;

import com.google.inject.Inject;
import fyp.xtext.wesnoth.mydsl.services.WesnothDSLGrammarAccess;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Defualt_CA;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Model;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Rule;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.UnitID;
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
			case WesnothDSLPackage.DEFUALT_CA:
				sequence_Defualt_CA(context, (Defualt_CA) semanticObject); 
				return; 
			case WesnothDSLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case WesnothDSLPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case WesnothDSLPackage.UNIT_ID:
				sequence_UnitID(context, (UnitID) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Defualt_CA returns Defualt_CA
	 *
	 * Constraint:
	 *     (
	 *         caType='movement' | 
	 *         caType='retreat' | 
	 *         caType='move_to_target' | 
	 *         caType='combat' | 
	 *         caType='recruit' | 
	 *         caType='focus_high_XP' | 
	 *         caType='move_to_enemy' | 
	 *         caType='capture_villages'
	 *     )
	 */
	protected void sequence_Defualt_CA(ISerializationContext context, Defualt_CA semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (name=ID unitID=UnitID defualt_cas+=Defualt_CA*)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnitID returns UnitID
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_UnitID(ISerializationContext context, UnitID semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WesnothDSLPackage.Literals.UNIT_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WesnothDSLPackage.Literals.UNIT_ID__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnitIDAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}