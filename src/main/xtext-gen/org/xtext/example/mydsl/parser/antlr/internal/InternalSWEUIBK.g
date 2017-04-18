/*
 * generated by Xtext 2.9.2
 */
grammar InternalSWEUIBK;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.SWEUIBKGrammarAccess;

}

@parser::members {

 	private SWEUIBKGrammarAccess grammarAccess;

    public InternalSWEUIBKParser(TokenStream input, SWEUIBKGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Domainmodel";
   	}

   	@Override
   	protected SWEUIBKGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDomainmodel
entryRuleDomainmodel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDomainmodelRule()); }
	iv_ruleDomainmodel=ruleDomainmodel
	{ $current=$iv_ruleDomainmodel.current; }
	EOF;

// Rule Domainmodel
ruleDomainmodel returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsObjectDeclarationParserRuleCall_0_0());
				}
				lv_elements_0_0=ruleObjectDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainmodelRule());
					}
					add(
						$current,
						"elements",
						lv_elements_0_0,
						"org.xtext.example.mydsl.SWEUIBK.ObjectDeclaration");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainmodelAccess().getActionsObjectActionParserRuleCall_1_0());
				}
				lv_actions_1_0=ruleObjectAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainmodelRule());
					}
					add(
						$current,
						"actions",
						lv_actions_1_0,
						"org.xtext.example.mydsl.SWEUIBK.ObjectAction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleObjectDeclaration
entryRuleObjectDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectDeclarationRule()); }
	iv_ruleObjectDeclaration=ruleObjectDeclaration
	{ $current=$iv_ruleObjectDeclaration.current; }
	EOF;

// Rule ObjectDeclaration
ruleObjectDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getObjectDeclarationAccess().getMonitorDeclarationParserRuleCall_0());
		}
		this_MonitorDeclaration_0=ruleMonitorDeclaration
		{
			$current = $this_MonitorDeclaration_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getObjectDeclarationAccess().getAnalyzerDeclarationParserRuleCall_1());
		}
		this_AnalyzerDeclaration_1=ruleAnalyzerDeclaration
		{
			$current = $this_AnalyzerDeclaration_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getObjectDeclarationAccess().getPageDeclarationParserRuleCall_2());
		}
		this_PageDeclaration_2=rulePageDeclaration
		{
			$current = $this_PageDeclaration_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getObjectDeclarationAccess().getModelDeclarationParserRuleCall_3());
		}
		this_ModelDeclaration_3=ruleModelDeclaration
		{
			$current = $this_ModelDeclaration_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleModelDeclaration
entryRuleModelDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelDeclarationRule()); }
	iv_ruleModelDeclaration=ruleModelDeclaration
	{ $current=$iv_ruleModelDeclaration.current; }
	EOF;

// Rule ModelDeclaration
ruleModelDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Model'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelDeclarationAccess().getModelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getModelDeclarationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleMonitorDeclaration
entryRuleMonitorDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMonitorDeclarationRule()); }
	iv_ruleMonitorDeclaration=ruleMonitorDeclaration
	{ $current=$iv_ruleMonitorDeclaration.current; }
	EOF;

// Rule MonitorDeclaration
ruleMonitorDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Monitor'
		{
			newLeafNode(otherlv_0, grammarAccess.getMonitorDeclarationAccess().getMonitorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMonitorDeclarationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMonitorDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getMonitorDeclarationAccess().getMonitorInitializationParserRuleCall_2());
		}
		ruleMonitorInitialization
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMonitorInitialization
entryRuleMonitorInitialization returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMonitorInitializationRule()); }
	iv_ruleMonitorInitialization=ruleMonitorInitialization
	{ $current=$iv_ruleMonitorInitialization.current.getText(); }
	EOF;

// Rule MonitorInitialization
ruleMonitorInitialization returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getMonitorInitializationAccess().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleAnalyzerDeclaration
entryRuleAnalyzerDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnalyzerDeclarationRule()); }
	iv_ruleAnalyzerDeclaration=ruleAnalyzerDeclaration
	{ $current=$iv_ruleAnalyzerDeclaration.current; }
	EOF;

// Rule AnalyzerDeclaration
ruleAnalyzerDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Analyzer'
		{
			newLeafNode(otherlv_0, grammarAccess.getAnalyzerDeclarationAccess().getAnalyzerKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getAnalyzerDeclarationAccess().getAnalyzerParserRuleCall_1());
		}
		this_Analyzer_1=ruleAnalyzer
		{
			$current = $this_Analyzer_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAnalyzer
entryRuleAnalyzer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnalyzerRule()); }
	iv_ruleAnalyzer=ruleAnalyzer
	{ $current=$iv_ruleAnalyzer.current; }
	EOF;

// Rule Analyzer
ruleAnalyzer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getAnalyzerAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAnalyzerRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRulePageDeclaration
entryRulePageDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPageDeclarationRule()); }
	iv_rulePageDeclaration=rulePageDeclaration
	{ $current=$iv_rulePageDeclaration.current; }
	EOF;

// Rule PageDeclaration
rulePageDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Page'
		{
			newLeafNode(otherlv_0, grammarAccess.getPageDeclarationAccess().getPageKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPageDeclarationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPageDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleObjectAction
entryRuleObjectAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectActionRule()); }
	iv_ruleObjectAction=ruleObjectAction
	{ $current=$iv_ruleObjectAction.current; }
	EOF;

// Rule ObjectAction
ruleObjectAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getObjectActionAccess().getMonitorObjectActionParserRuleCall_0());
		}
		this_MonitorObjectAction_0=ruleMonitorObjectAction
		{
			$current = $this_MonitorObjectAction_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getObjectActionAccess().getAnalyzerObjectActionParserRuleCall_1());
		}
		this_AnalyzerObjectAction_1=ruleAnalyzerObjectAction
		{
			$current = $this_AnalyzerObjectAction_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getObjectActionAccess().getPageObjectActionParserRuleCall_2());
		}
		this_PageObjectAction_2=rulePageObjectAction
		{
			$current = $this_PageObjectAction_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getObjectActionAccess().getModelActionParserRuleCall_3());
		}
		this_ModelAction_3=ruleModelAction
		{
			$current = $this_ModelAction_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleModelAction
entryRuleModelAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelActionRule()); }
	iv_ruleModelAction=ruleModelAction
	{ $current=$iv_ruleModelAction.current; }
	EOF;

// Rule ModelAction
ruleModelAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getModelActionAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelActionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getModelActionAccess().getFullStopKeyword_1());
		}
		otherlv_2='loadStructure'
		{
			newLeafNode(otherlv_2, grammarAccess.getModelActionAccess().getLoadStructureKeyword_2());
		}
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getModelActionAccess().getLeftParenthesisKeyword_3());
		}
		(
			{
				newCompositeNode(grammarAccess.getModelActionAccess().getModelStructureParserRuleCall_4());
			}
			ruleModelStructure
			{
				afterParserOrEnumRuleCall();
			}
		)+
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getModelActionAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleModelStructure
entryRuleModelStructure returns [String current=null]:
	{ newCompositeNode(grammarAccess.getModelStructureRule()); }
	iv_ruleModelStructure=ruleModelStructure
	{ $current=$iv_ruleModelStructure.current.getText(); }
	EOF;

// Rule ModelStructure
ruleModelStructure returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getModelStructureAccess().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleMonitorObjectAction
entryRuleMonitorObjectAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMonitorObjectActionRule()); }
	iv_ruleMonitorObjectAction=ruleMonitorObjectAction
	{ $current=$iv_ruleMonitorObjectAction.current; }
	EOF;

// Rule MonitorObjectAction
ruleMonitorObjectAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getMonitorObjectActionAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMonitorObjectActionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getMonitorObjectActionAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMonitorObjectActionAccess().getValueMonitorOperationsEnumRuleCall_2_0());
				}
				lv_value_2_0=ruleMonitorOperations
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMonitorObjectActionRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"org.xtext.example.mydsl.SWEUIBK.MonitorOperations");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getMonitorObjectActionAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMonitorObjectActionAccess().getMethodMethodParameterParserRuleCall_4_0());
				}
				lv_method_4_0=ruleMethodParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMonitorObjectActionRule());
					}
					set(
						$current,
						"method",
						lv_method_4_0,
						"org.xtext.example.mydsl.SWEUIBK.MethodParameter");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getMonitorObjectActionAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleAnalyzerObjectAction
entryRuleAnalyzerObjectAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnalyzerObjectActionRule()); }
	iv_ruleAnalyzerObjectAction=ruleAnalyzerObjectAction
	{ $current=$iv_ruleAnalyzerObjectAction.current; }
	EOF;

// Rule AnalyzerObjectAction
ruleAnalyzerObjectAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getAnalyzerObjectActionAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnalyzerObjectActionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getAnalyzerObjectActionAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnalyzerObjectActionAccess().getValueAnalyzerOperationsEnumRuleCall_2_0());
				}
				lv_value_2_0=ruleAnalyzerOperations
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnalyzerObjectActionRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"org.xtext.example.mydsl.SWEUIBK.AnalyzerOperations");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getAnalyzerObjectActionAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAnalyzerObjectActionAccess().getMethodMethodParameterParserRuleCall_4_0());
				}
				lv_method_4_0=ruleMethodParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnalyzerObjectActionRule());
					}
					set(
						$current,
						"method",
						lv_method_4_0,
						"org.xtext.example.mydsl.SWEUIBK.MethodParameter");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getAnalyzerObjectActionAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRulePageObjectAction
entryRulePageObjectAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPageObjectActionRule()); }
	iv_rulePageObjectAction=rulePageObjectAction
	{ $current=$iv_rulePageObjectAction.current; }
	EOF;

// Rule PageObjectAction
rulePageObjectAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getPageObjectActionAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPageObjectActionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getPageObjectActionAccess().getFullStopKeyword_1());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getPageObjectActionAccess().getValuePageOperationsEnumRuleCall_2_0_0_0());
						}
						lv_value_2_0=rulePageOperations
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPageObjectActionRule());
							}
							set(
								$current,
								"value",
								lv_value_2_0,
								"org.xtext.example.mydsl.SWEUIBK.PageOperations");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_3='('
				{
					newLeafNode(otherlv_3, grammarAccess.getPageObjectActionAccess().getLeftParenthesisKeyword_2_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getPageObjectActionAccess().getMethodMethodParameterParserRuleCall_2_0_2_0());
						}
						lv_method_4_0=ruleMethodParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPageObjectActionRule());
							}
							set(
								$current,
								"method",
								lv_method_4_0,
								"org.xtext.example.mydsl.SWEUIBK.MethodParameter");
							afterParserOrEnumRuleCall();
						}
					)
				)?
				otherlv_5=')'
				{
					newLeafNode(otherlv_5, grammarAccess.getPageObjectActionAccess().getRightParenthesisKeyword_2_0_3());
				}
			)
			    |
			{
				newCompositeNode(grammarAccess.getPageObjectActionAccess().getGenerateHeaderParserRuleCall_2_1());
			}
			ruleGenerateHeader
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleGenerateHeader
entryRuleGenerateHeader returns [String current=null]:
	{ newCompositeNode(grammarAccess.getGenerateHeaderRule()); }
	iv_ruleGenerateHeader=ruleGenerateHeader
	{ $current=$iv_ruleGenerateHeader.current.getText(); }
	EOF;

// Rule GenerateHeader
ruleGenerateHeader returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='generateHeaderList'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getGenerateHeaderAccess().getGenerateHeaderListKeyword_0());
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getGenerateHeaderAccess().getLeftParenthesisKeyword_1());
		}
		(
			{
				newCompositeNode(grammarAccess.getGenerateHeaderAccess().getHeaderParserRuleCall_2());
			}
			this_Header_2=ruleHeader
			{
				$current.merge(this_Header_2);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getGenerateHeaderAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleHeader
entryRuleHeader returns [String current=null]:
	{ newCompositeNode(grammarAccess.getHeaderRule()); }
	iv_ruleHeader=ruleHeader
	{ $current=$iv_ruleHeader.current.getText(); }
	EOF;

// Rule Header
ruleHeader returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getHeaderAccess().getSTRINGTerminalRuleCall_0());
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getHeaderAccess().getLeftParenthesisKeyword_1());
		}
		this_STRING_2=RULE_STRING
		{
			$current.merge(this_STRING_2);
		}
		{
			newLeafNode(this_STRING_2, grammarAccess.getHeaderAccess().getSTRINGTerminalRuleCall_2());
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getHeaderAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleMethodParameter
entryRuleMethodParameter returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMethodParameterRule()); }
	iv_ruleMethodParameter=ruleMethodParameter
	{ $current=$iv_ruleMethodParameter.current.getText(); }
	EOF;

// Rule MethodParameter
ruleMethodParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getMethodParameterAccess().getSTRINGTerminalRuleCall());
	}
;

// Rule MonitorOperations
ruleMonitorOperations returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='AddAnalyzer'
			{
				$current = grammarAccess.getMonitorOperationsAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getMonitorOperationsAccess().getADDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='RemoveAnalyzer'
			{
				$current = grammarAccess.getMonitorOperationsAccess().getREMOVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getMonitorOperationsAccess().getREMOVEEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule AnalyzerOperations
ruleAnalyzerOperations returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='LoadPage'
			{
				$current = grammarAccess.getAnalyzerOperationsAccess().getLOADPAGEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getAnalyzerOperationsAccess().getLOADPAGEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Execute'
			{
				$current = grammarAccess.getAnalyzerOperationsAccess().getEXECUTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getAnalyzerOperationsAccess().getEXECUTEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='RemovePage'
			{
				$current = grammarAccess.getAnalyzerOperationsAccess().getREMOVEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getAnalyzerOperationsAccess().getREMOVEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='LoadModel'
			{
				$current = grammarAccess.getAnalyzerOperationsAccess().getLOADMODELEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getAnalyzerOperationsAccess().getLOADMODELEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule PageOperations
rulePageOperations returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='url'
			{
				$current = grammarAccess.getPageOperationsAccess().getURLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPageOperationsAccess().getURLEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='connectType'
			{
				$current = grammarAccess.getPageOperationsAccess().getCONNECTIONTYPEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPageOperationsAccess().getCONNECTIONTYPEEnumLiteralDeclaration_1());
			}
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
