/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.sWEUIBK;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.sWEUIBK.MonitorObjectAction#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sWEUIBK.MonitorObjectAction#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.sWEUIBK.SWEUIBKPackage#getMonitorObjectAction()
 * @model
 * @generated
 */
public interface MonitorObjectAction extends ObjectAction
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.sWEUIBK.MonitorOperations}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.sWEUIBK.MonitorOperations
   * @see #setValue(MonitorOperations)
   * @see org.xtext.example.mydsl.sWEUIBK.SWEUIBKPackage#getMonitorObjectAction_Value()
   * @model
   * @generated
   */
  MonitorOperations getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.sWEUIBK.MonitorObjectAction#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.sWEUIBK.MonitorOperations
   * @see #getValue()
   * @generated
   */
  void setValue(MonitorOperations value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see #setMethod(String)
   * @see org.xtext.example.mydsl.sWEUIBK.SWEUIBKPackage#getMonitorObjectAction_Method()
   * @model
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.sWEUIBK.MonitorObjectAction#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(String value);

} // MonitorObjectAction
