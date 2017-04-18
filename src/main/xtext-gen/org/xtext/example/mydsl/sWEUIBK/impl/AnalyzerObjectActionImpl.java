/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.sWEUIBK.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.sWEUIBK.AnalyzerObjectAction;
import org.xtext.example.mydsl.sWEUIBK.AnalyzerOperations;
import org.xtext.example.mydsl.sWEUIBK.SWEUIBKPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analyzer Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.sWEUIBK.impl.AnalyzerObjectActionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sWEUIBK.impl.AnalyzerObjectActionImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalyzerObjectActionImpl extends ObjectActionImpl implements AnalyzerObjectAction
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final AnalyzerOperations VALUE_EDEFAULT = AnalyzerOperations.LOADPAGE;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected AnalyzerOperations value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final String METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected String method = METHOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnalyzerObjectActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SWEUIBKPackage.Literals.ANALYZER_OBJECT_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnalyzerOperations getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(AnalyzerOperations newValue)
  {
    AnalyzerOperations oldValue = value;
    value = newValue == null ? VALUE_EDEFAULT : newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWEUIBKPackage.ANALYZER_OBJECT_ACTION__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(String newMethod)
  {
    String oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWEUIBKPackage.ANALYZER_OBJECT_ACTION__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SWEUIBKPackage.ANALYZER_OBJECT_ACTION__VALUE:
        return getValue();
      case SWEUIBKPackage.ANALYZER_OBJECT_ACTION__METHOD:
        return getMethod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SWEUIBKPackage.ANALYZER_OBJECT_ACTION__VALUE:
        setValue((AnalyzerOperations)newValue);
        return;
      case SWEUIBKPackage.ANALYZER_OBJECT_ACTION__METHOD:
        setMethod((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SWEUIBKPackage.ANALYZER_OBJECT_ACTION__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case SWEUIBKPackage.ANALYZER_OBJECT_ACTION__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SWEUIBKPackage.ANALYZER_OBJECT_ACTION__VALUE:
        return value != VALUE_EDEFAULT;
      case SWEUIBKPackage.ANALYZER_OBJECT_ACTION__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(", method: ");
    result.append(method);
    result.append(')');
    return result.toString();
  }

} //AnalyzerObjectActionImpl
