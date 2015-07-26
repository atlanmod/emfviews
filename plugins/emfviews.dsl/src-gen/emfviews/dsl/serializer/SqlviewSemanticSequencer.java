package emfviews.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import emfviews.dsl.services.SqlviewGrammarAccess;
import emfviews.dsl.sqlview.Attribute;
import emfviews.dsl.sqlview.Comparison;
import emfviews.dsl.sqlview.Condition;
import emfviews.dsl.sqlview.Expression;
import emfviews.dsl.sqlview.From;
import emfviews.dsl.sqlview.Left;
import emfviews.dsl.sqlview.Metamodel;
import emfviews.dsl.sqlview.MetamodelName;
import emfviews.dsl.sqlview.Model;
import emfviews.dsl.sqlview.Right;
import emfviews.dsl.sqlview.Select;
import emfviews.dsl.sqlview.SqlviewPackage;
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
public class SqlviewSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SqlviewGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SqlviewPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SqlviewPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case SqlviewPackage.CLASS:
				if(context == grammarAccess.getClassRule()) {
					sequence_Class(context, (emfviews.dsl.sqlview.Class) semanticObject); 
					return; 
				}
				else break;
			case SqlviewPackage.COMPARISON:
				if(context == grammarAccess.getComparisonRule()) {
					sequence_Comparison(context, (Comparison) semanticObject); 
					return; 
				}
				else break;
			case SqlviewPackage.CONDITION:
				if(context == grammarAccess.getConditionRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
					return; 
				}
				else break;
			case SqlviewPackage.EXPRESSION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case SqlviewPackage.FROM:
				if(context == grammarAccess.getFromRule()) {
					sequence_From(context, (From) semanticObject); 
					return; 
				}
				else break;
			case SqlviewPackage.LEFT:
				if(context == grammarAccess.getLeftRule()) {
					sequence_Left(context, (Left) semanticObject); 
					return; 
				}
				else break;
			case SqlviewPackage.METAMODEL:
				if(context == grammarAccess.getMetamodelRule()) {
					sequence_Metamodel(context, (Metamodel) semanticObject); 
					return; 
				}
				else break;
			case SqlviewPackage.METAMODEL_NAME:
				if(context == grammarAccess.getMetamodelNameRule()) {
					sequence_MetamodelName(context, (MetamodelName) semanticObject); 
					return; 
				}
				else break;
			case SqlviewPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case SqlviewPackage.RIGHT:
				if(context == grammarAccess.getRightRule()) {
					sequence_Right(context, (Right) semanticObject); 
					return; 
				}
				else break;
			case SqlviewPackage.SELECT:
				if(context == grammarAccess.getSelectRule()) {
					sequence_Select(context, (Select) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqlviewPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqlviewPackage.Literals.ATTRIBUTE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Class(EObject context, emfviews.dsl.sqlview.Class semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqlviewPackage.Literals.CLASS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqlviewPackage.Literals.CLASS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left+=Left right+=Right)
	 */
	protected void sequence_Comparison(EObject context, Comparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value+=Comparison value+=Comparison*)
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (select+=Select from+=From condition+=Condition+)
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (metamodel+=[MetamodelName|ID] class+=Class (metamodel+=[MetamodelName|ID] class+=Class)*)
	 */
	protected void sequence_From(EObject context, From semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (metamodel+=[MetamodelName|ID] class+=[Class|ID] attributeWhereLeft=Attribute)
	 */
	protected void sequence_Left(EObject context, Left semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_MetamodelName(EObject context, MetamodelName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqlviewPackage.Literals.METAMODEL_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqlviewPackage.Literals.METAMODEL_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMetamodelNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (metamodelURL+=EString metamodelName+=MetamodelName)
	 */
	protected void sequence_Metamodel(EObject context, Metamodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (viewName=ID metamodel+=Metamodel metamodel+=Metamodel* expression+=Expression)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((metamodel+=[MetamodelName|ID] class+=[Class|ID] attributeWhereRight=Attribute) | value=EString)
	 */
	protected void sequence_Right(EObject context, Right semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         select+='*' | 
	 *         (metamodel+=[MetamodelName|ID] class+=Class attribute+=Attribute (metamodel+=[MetamodelName|ID] class+=Class attribute+=Attribute)*)
	 *     )
	 */
	protected void sequence_Select(EObject context, Select semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
