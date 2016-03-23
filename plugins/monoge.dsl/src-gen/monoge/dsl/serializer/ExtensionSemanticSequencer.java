package monoge.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import monoge.dsl.extension.AddConstraint;
import monoge.dsl.extension.AddProperty;
import monoge.dsl.extension.Create;
import monoge.dsl.extension.ExtensionPackage;
import monoge.dsl.extension.FilterClass;
import monoge.dsl.extension.FilterConstraint;
import monoge.dsl.extension.FilterProperty;
import monoge.dsl.extension.Generalize;
import monoge.dsl.extension.Metamodel;
import monoge.dsl.extension.Model;
import monoge.dsl.extension.ModifyClass;
import monoge.dsl.extension.ModifyProperty;
import monoge.dsl.extension.Prefix;
import monoge.dsl.extension.Refine;
import monoge.dsl.extension.Type;
import monoge.dsl.extension.ValueAssignment;
import monoge.dsl.services.ExtensionGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ExtensionSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExtensionGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExtensionPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExtensionPackage.ADD_CONSTRAINT:
				if(context == grammarAccess.getAddConstraintRule() ||
				   context == grammarAccess.getModifyOperatorRule()) {
					sequence_AddConstraint(context, (AddConstraint) semanticObject); 
					return; 
				}
				else break;
			case ExtensionPackage.ADD_PROPERTY:
				if(context == grammarAccess.getAddPropertyRule() ||
				   context == grammarAccess.getModifyOperatorRule()) {
					sequence_AddProperty(context, (AddProperty) semanticObject); 
					return; 
				}
				else break;
			case ExtensionPackage.CREATE:
				if(context == grammarAccess.getCreateRule() ||
				   context == grammarAccess.getExtensionRule()) {
					sequence_Create(context, (Create) semanticObject); 
					return; 
				}
				else break;
			case ExtensionPackage.FILTER_CLASS:
				if(context == grammarAccess.getExtensionRule() ||
				   context == grammarAccess.getFilterClassRule()) {
					sequence_FilterClass(context, (FilterClass) semanticObject); 
					return; 
				}
				else break;
			case ExtensionPackage.FILTER_CONSTRAINT:
				if(context == grammarAccess.getFilterConstraintRule() ||
				   context == grammarAccess.getModifyOperatorRule()) {
					sequence_FilterConstraint(context, (FilterConstraint) semanticObject); 
					return; 
				}
				else break;
			case ExtensionPackage.FILTER_PROPERTY:
				if(context == grammarAccess.getFilterPropertyRule() ||
				   context == grammarAccess.getModifyOperatorRule()) {
					sequence_FilterProperty(context, (FilterProperty) semanticObject); 
					return; 
				}
				else break;
			case ExtensionPackage.GENERALIZE:
				if(context == grammarAccess.getExtensionRule() ||
				   context == grammarAccess.getGeneralizeRule()) {
					sequence_Generalize(context, (Generalize) semanticObject); 
					return; 
				}
				else break;
			case ExtensionPackage.METAMODEL:
				if(context == grammarAccess.getMetamodelRule()) {
					sequence_Metamodel(context, (Metamodel) semanticObject); 
					return; 
				}
				else break;
			case ExtensionPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ExtensionPackage.MODIFY_CLASS:
				if(context == grammarAccess.getExtensionRule() ||
				   context == grammarAccess.getModifyClassRule()) {
					sequence_ModifyClass(context, (ModifyClass) semanticObject); 
					return; 
				}
				else break;
			case ExtensionPackage.MODIFY_PROPERTY:
				if(context == grammarAccess.getModifyOperatorRule() ||
				   context == grammarAccess.getModifyPropertyRule()) {
					sequence_ModifyProperty(context, (ModifyProperty) semanticObject); 
					return; 
				}
				else break;
			case ExtensionPackage.PREFIX:
				if(context == grammarAccess.getPrefixRule()) {
					sequence_Prefix(context, (Prefix) semanticObject); 
					return; 
				}
				else break;
			case ExtensionPackage.REFINE:
				if(context == grammarAccess.getExtensionRule() ||
				   context == grammarAccess.getRefineRule()) {
					sequence_Refine(context, (Refine) semanticObject); 
					return; 
				}
				else break;
			case ExtensionPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case ExtensionPackage.VALUE_ASSIGNMENT:
				if(context == grammarAccess.getValueAssignmentRule()) {
					sequence_ValueAssignment(context, (ValueAssignment) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (constraint=ID value=EString)
	 */
	protected void sequence_AddConstraint(EObject context, AddConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtensionPackage.Literals.ADD_CONSTRAINT__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionPackage.Literals.ADD_CONSTRAINT__CONSTRAINT));
			if(transientValues.isValueTransient(semanticObject, ExtensionPackage.Literals.ADD_CONSTRAINT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionPackage.Literals.ADD_CONSTRAINT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAddConstraintAccess().getConstraintIDTerminalRuleCall_1_0(), semanticObject.getConstraint());
		feeder.accept(grammarAccess.getAddConstraintAccess().getValueEStringParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (property=ID type+=Type cardinality+=Cardinality? relationType+=RelationType?)
	 */
	protected void sequence_AddProperty(EObject context, AddProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     class=ID
	 */
	protected void sequence_Create(EObject context, Create semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtensionPackage.Literals.CREATE__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionPackage.Literals.CREATE__CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCreateAccess().getClassIDTerminalRuleCall_1_0(), semanticObject.getClass_());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (prefix=[Prefix|ID] class=ID)
	 */
	protected void sequence_FilterClass(EObject context, FilterClass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtensionPackage.Literals.FILTER_CLASS__PREFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionPackage.Literals.FILTER_CLASS__PREFIX));
			if(transientValues.isValueTransient(semanticObject, ExtensionPackage.Literals.FILTER_CLASS__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionPackage.Literals.FILTER_CLASS__CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFilterClassAccess().getPrefixPrefixIDTerminalRuleCall_1_0_1(), semanticObject.getPrefix());
		feeder.accept(grammarAccess.getFilterClassAccess().getClassIDTerminalRuleCall_3_0(), semanticObject.getClass_());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     constraint=EString
	 */
	protected void sequence_FilterConstraint(EObject context, FilterConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtensionPackage.Literals.FILTER_CONSTRAINT__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionPackage.Literals.FILTER_CONSTRAINT__CONSTRAINT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFilterConstraintAccess().getConstraintEStringParserRuleCall_1_0(), semanticObject.getConstraint());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     property=ID
	 */
	protected void sequence_FilterProperty(EObject context, FilterProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtensionPackage.Literals.FILTER_PROPERTY__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionPackage.Literals.FILTER_PROPERTY__PROPERTY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFilterPropertyAccess().getPropertyIDTerminalRuleCall_1_0(), semanticObject.getProperty());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (classNew=ID prefix+=[Prefix|ID] class+=ID (prefix+=[Prefix|ID] class+=ID)*)
	 */
	protected void sequence_Generalize(EObject context, Generalize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Metamodel(EObject context, Metamodel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtensionPackage.Literals.METAMODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionPackage.Literals.METAMODEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (extensionName=ID metamodel+=Metamodel prefix+=Prefix (metamodel+=Metamodel prefix+=Prefix)* extensions+=Extension*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prefix=[Prefix|ID] class=ID modifyOperators+=ModifyOperator*)
	 */
	protected void sequence_ModifyClass(EObject context, ModifyClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property=ID value+=ValueAssignment value+=ValueAssignment*)
	 */
	protected void sequence_ModifyProperty(EObject context, ModifyProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Prefix(EObject context, Prefix semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtensionPackage.Literals.PREFIX__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionPackage.Literals.PREFIX__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (classNew=ID prefix=[Prefix|ID] classOriginal=ID)
	 */
	protected void sequence_Refine(EObject context, Refine semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtensionPackage.Literals.REFINE__CLASS_NEW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionPackage.Literals.REFINE__CLASS_NEW));
			if(transientValues.isValueTransient(semanticObject, ExtensionPackage.Literals.REFINE__PREFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionPackage.Literals.REFINE__PREFIX));
			if(transientValues.isValueTransient(semanticObject, ExtensionPackage.Literals.REFINE__CLASS_ORIGINAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionPackage.Literals.REFINE__CLASS_ORIGINAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRefineAccess().getClassNewIDTerminalRuleCall_1_0(), semanticObject.getClassNew());
		feeder.accept(grammarAccess.getRefineAccess().getPrefixPrefixIDTerminalRuleCall_3_0_1(), semanticObject.getPrefix());
		feeder.accept(grammarAccess.getRefineAccess().getClassOriginalIDTerminalRuleCall_5_0(), semanticObject.getClassOriginal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type+=ID | (prefix+=[Prefix|ID] class+=ID))
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attribute=ID value=EString)
	 */
	protected void sequence_ValueAssignment(EObject context, ValueAssignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtensionPackage.Literals.VALUE_ASSIGNMENT__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionPackage.Literals.VALUE_ASSIGNMENT__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, ExtensionPackage.Literals.VALUE_ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionPackage.Literals.VALUE_ASSIGNMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValueAssignmentAccess().getAttributeIDTerminalRuleCall_0_0(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getValueAssignmentAccess().getValueEStringParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
}
