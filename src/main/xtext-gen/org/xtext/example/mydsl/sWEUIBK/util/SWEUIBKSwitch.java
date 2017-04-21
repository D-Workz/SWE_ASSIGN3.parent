/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.sWEUIBK.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.sWEUIBK.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.sWEUIBK.SWEUIBKPackage
 * @generated
 */
public class SWEUIBKSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SWEUIBKPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWEUIBKSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SWEUIBKPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SWEUIBKPackage.DOMAINMODEL:
      {
        Domainmodel domainmodel = (Domainmodel)theEObject;
        T result = caseDomainmodel(domainmodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SWEUIBKPackage.OBJECT_DECLARATION:
      {
        ObjectDeclaration objectDeclaration = (ObjectDeclaration)theEObject;
        T result = caseObjectDeclaration(objectDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SWEUIBKPackage.MODEL_DECLARATION:
      {
        ModelDeclaration modelDeclaration = (ModelDeclaration)theEObject;
        T result = caseModelDeclaration(modelDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SWEUIBKPackage.MONITOR_DECLARATION:
      {
        MonitorDeclaration monitorDeclaration = (MonitorDeclaration)theEObject;
        T result = caseMonitorDeclaration(monitorDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SWEUIBKPackage.MONITOR_INITIALIZATION:
      {
        MonitorInitialization monitorInitialization = (MonitorInitialization)theEObject;
        T result = caseMonitorInitialization(monitorInitialization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SWEUIBKPackage.ANALYZER_DECLARATION:
      {
        AnalyzerDeclaration analyzerDeclaration = (AnalyzerDeclaration)theEObject;
        T result = caseAnalyzerDeclaration(analyzerDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SWEUIBKPackage.ANALYZER:
      {
        Analyzer analyzer = (Analyzer)theEObject;
        T result = caseAnalyzer(analyzer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SWEUIBKPackage.PAGE_DECLARATION:
      {
        PageDeclaration pageDeclaration = (PageDeclaration)theEObject;
        T result = casePageDeclaration(pageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SWEUIBKPackage.OBJECT_ACTION:
      {
        ObjectAction objectAction = (ObjectAction)theEObject;
        T result = caseObjectAction(objectAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SWEUIBKPackage.MODEL_ACTION:
      {
        ModelAction modelAction = (ModelAction)theEObject;
        T result = caseModelAction(modelAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SWEUIBKPackage.MODEL_STRUCTURE:
      {
        ModelStructure modelStructure = (ModelStructure)theEObject;
        T result = caseModelStructure(modelStructure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SWEUIBKPackage.MONITOR_OBJECT_ACTION:
      {
        MonitorObjectAction monitorObjectAction = (MonitorObjectAction)theEObject;
        T result = caseMonitorObjectAction(monitorObjectAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SWEUIBKPackage.ANALYZER_OBJECT_ACTION:
      {
        AnalyzerObjectAction analyzerObjectAction = (AnalyzerObjectAction)theEObject;
        T result = caseAnalyzerObjectAction(analyzerObjectAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SWEUIBKPackage.PAGE_OBJECT_ACTION:
      {
        PageObjectAction pageObjectAction = (PageObjectAction)theEObject;
        T result = casePageObjectAction(pageObjectAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domainmodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainmodel(Domainmodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectDeclaration(ObjectDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelDeclaration(ModelDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monitor Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monitor Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonitorDeclaration(MonitorDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monitor Initialization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monitor Initialization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonitorInitialization(MonitorInitialization object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Analyzer Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Analyzer Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnalyzerDeclaration(AnalyzerDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Analyzer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Analyzer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnalyzer(Analyzer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageDeclaration(PageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectAction(ObjectAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelAction(ModelAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Structure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Structure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelStructure(ModelStructure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monitor Object Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monitor Object Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonitorObjectAction(MonitorObjectAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Analyzer Object Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Analyzer Object Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnalyzerObjectAction(AnalyzerObjectAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Object Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Object Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageObjectAction(PageObjectAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SWEUIBKSwitch
