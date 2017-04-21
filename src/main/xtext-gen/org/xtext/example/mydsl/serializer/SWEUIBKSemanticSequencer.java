/*
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
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
import org.xtext.example.mydsl.sWEUIBK.Analyzer;
import org.xtext.example.mydsl.sWEUIBK.AnalyzerDeclaration;
import org.xtext.example.mydsl.sWEUIBK.AnalyzerObjectAction;
import org.xtext.example.mydsl.sWEUIBK.Domainmodel;
import org.xtext.example.mydsl.sWEUIBK.ModelAction;
import org.xtext.example.mydsl.sWEUIBK.ModelDeclaration;
import org.xtext.example.mydsl.sWEUIBK.ModelStructure;
import org.xtext.example.mydsl.sWEUIBK.MonitorDeclaration;
import org.xtext.example.mydsl.sWEUIBK.MonitorInitialization;
import org.xtext.example.mydsl.sWEUIBK.MonitorObjectAction;
import org.xtext.example.mydsl.sWEUIBK.ObjectAction;
import org.xtext.example.mydsl.sWEUIBK.ObjectDeclaration;
import org.xtext.example.mydsl.sWEUIBK.PageDeclaration;
import org.xtext.example.mydsl.sWEUIBK.PageObjectAction;
import org.xtext.example.mydsl.sWEUIBK.SWEUIBKPackage;
import org.xtext.example.mydsl.services.SWEUIBKGrammarAccess;

@SuppressWarnings("all")
public class SWEUIBKSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SWEUIBKGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SWEUIBKPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SWEUIBKPackage.ANALYZER:
				sequence_Analyzer(context, (Analyzer) semanticObject); 
				return; 
			case SWEUIBKPackage.ANALYZER_DECLARATION:
				sequence_AnalyzerDeclaration(context, (AnalyzerDeclaration) semanticObject); 
				return; 
			case SWEUIBKPackage.ANALYZER_OBJECT_ACTION:
				sequence_AnalyzerObjectAction(context, (AnalyzerObjectAction) semanticObject); 
				return; 
			case SWEUIBKPackage.DOMAINMODEL:
				sequence_Domainmodel(context, (Domainmodel) semanticObject); 
				return; 
			case SWEUIBKPackage.MODEL_ACTION:
				sequence_ModelAction(context, (ModelAction) semanticObject); 
				return; 
			case SWEUIBKPackage.MODEL_DECLARATION:
				sequence_ModelDeclaration(context, (ModelDeclaration) semanticObject); 
				return; 
			case SWEUIBKPackage.MODEL_STRUCTURE:
				sequence_ModelStructure(context, (ModelStructure) semanticObject); 
				return; 
			case SWEUIBKPackage.MONITOR_DECLARATION:
				sequence_MonitorDeclaration(context, (MonitorDeclaration) semanticObject); 
				return; 
			case SWEUIBKPackage.MONITOR_INITIALIZATION:
				sequence_MonitorInitialization(context, (MonitorInitialization) semanticObject); 
				return; 
			case SWEUIBKPackage.MONITOR_OBJECT_ACTION:
				sequence_MonitorObjectAction(context, (MonitorObjectAction) semanticObject); 
				return; 
			case SWEUIBKPackage.OBJECT_ACTION:
				sequence_ObjectAction(context, (ObjectAction) semanticObject); 
				return; 
			case SWEUIBKPackage.OBJECT_DECLARATION:
				sequence_ObjectDeclaration(context, (ObjectDeclaration) semanticObject); 
				return; 
			case SWEUIBKPackage.PAGE_DECLARATION:
				sequence_PageDeclaration(context, (PageDeclaration) semanticObject); 
				return; 
			case SWEUIBKPackage.PAGE_OBJECT_ACTION:
				sequence_PageObjectAction(context, (PageObjectAction) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AnalyzerDeclaration returns AnalyzerDeclaration
	 *
	 * Constraint:
	 *     name=Analyzer
	 */
	protected void sequence_AnalyzerDeclaration(ISerializationContext context, AnalyzerDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SWEUIBKPackage.Literals.ANALYZER_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWEUIBKPackage.Literals.ANALYZER_DECLARATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnalyzerDeclarationAccess().getNameAnalyzerParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AnalyzerObjectAction returns AnalyzerObjectAction
	 *
	 * Constraint:
	 *     (name=ID value=AnalyzerOperations method=MethodParameter?)
	 */
	protected void sequence_AnalyzerObjectAction(ISerializationContext context, AnalyzerObjectAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Analyzer returns Analyzer
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Analyzer(ISerializationContext context, Analyzer semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SWEUIBKPackage.Literals.ANALYZER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWEUIBKPackage.Literals.ANALYZER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnalyzerAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Domainmodel returns Domainmodel
	 *
	 * Constraint:
	 *     ((elements+=ObjectDeclaration+ actions+=ObjectAction+) | actions+=ObjectAction+)?
	 */
	protected void sequence_Domainmodel(ISerializationContext context, Domainmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelAction returns ModelAction
	 *
	 * Constraint:
	 *     (name=ID modelStructure=ModelStructure+)
	 */
	protected void sequence_ModelAction(ISerializationContext context, ModelAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelDeclaration returns ModelDeclaration
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ModelDeclaration(ISerializationContext context, ModelDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SWEUIBKPackage.Literals.MODEL_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWEUIBKPackage.Literals.MODEL_DECLARATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelStructure returns ModelStructure
	 *
	 * Constraint:
	 *     source=STRING
	 */
	protected void sequence_ModelStructure(ISerializationContext context, ModelStructure semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SWEUIBKPackage.Literals.MODEL_STRUCTURE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWEUIBKPackage.Literals.MODEL_STRUCTURE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelStructureAccess().getSourceSTRINGTerminalRuleCall_0(), semanticObject.getSource());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MonitorDeclaration returns MonitorDeclaration
	 *
	 * Constraint:
	 *     (name=ID url=MonitorInitialization)
	 */
	protected void sequence_MonitorDeclaration(ISerializationContext context, MonitorDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SWEUIBKPackage.Literals.MONITOR_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWEUIBKPackage.Literals.MONITOR_DECLARATION__NAME));
			if (transientValues.isValueTransient(semanticObject, SWEUIBKPackage.Literals.MONITOR_DECLARATION__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWEUIBKPackage.Literals.MONITOR_DECLARATION__URL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMonitorDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMonitorDeclarationAccess().getUrlMonitorInitializationParserRuleCall_2_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MonitorInitialization returns MonitorInitialization
	 *
	 * Constraint:
	 *     url=STRING
	 */
	protected void sequence_MonitorInitialization(ISerializationContext context, MonitorInitialization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SWEUIBKPackage.Literals.MONITOR_INITIALIZATION__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWEUIBKPackage.Literals.MONITOR_INITIALIZATION__URL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMonitorInitializationAccess().getUrlSTRINGTerminalRuleCall_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MonitorObjectAction returns MonitorObjectAction
	 *
	 * Constraint:
	 *     (name=ID value=MonitorOperations method=MethodParameter?)
	 */
	protected void sequence_MonitorObjectAction(ISerializationContext context, MonitorObjectAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ObjectAction returns ObjectAction
	 *
	 * Constraint:
	 *     (monitorAction=MonitorObjectAction | analyzerAction=AnalyzerObjectAction | pageAction=PageObjectAction | modelAction=ModelAction)
	 */
	protected void sequence_ObjectAction(ISerializationContext context, ObjectAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ObjectDeclaration returns ObjectDeclaration
	 *
	 * Constraint:
	 *     (monitor=MonitorDeclaration | analyzer=AnalyzerDeclaration | page=PageDeclaration | model=ModelDeclaration)
	 */
	protected void sequence_ObjectDeclaration(ISerializationContext context, ObjectDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PageDeclaration returns PageDeclaration
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_PageDeclaration(ISerializationContext context, PageDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SWEUIBKPackage.Literals.PAGE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SWEUIBKPackage.Literals.PAGE_DECLARATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPageDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PageObjectAction returns PageObjectAction
	 *
	 * Constraint:
	 *     (name=ID ((value=PageOperations method=MethodParameter?) | headerList=GenerateHeader))
	 */
	protected void sequence_PageObjectAction(ISerializationContext context, PageObjectAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
