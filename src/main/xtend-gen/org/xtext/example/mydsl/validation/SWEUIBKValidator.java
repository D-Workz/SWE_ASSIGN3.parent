/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.mydsl.sWEUIBK.AnalyzerObjectAction;
import org.xtext.example.mydsl.sWEUIBK.Domainmodel;
import org.xtext.example.mydsl.sWEUIBK.MonitorDeclaration;
import org.xtext.example.mydsl.sWEUIBK.MonitorObjectAction;
import org.xtext.example.mydsl.sWEUIBK.ObjectDeclaration;
import org.xtext.example.mydsl.sWEUIBK.PageDeclaration;
import org.xtext.example.mydsl.sWEUIBK.PageObjectAction;
import org.xtext.example.mydsl.sWEUIBK.SWEUIBKPackage;
import org.xtext.example.mydsl.validation.AbstractSWEUIBKValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class SWEUIBKValidator extends AbstractSWEUIBKValidator {
  public final static String INVALID_NAME = "invalidName";
  
  @Check
  public void checkempty2(final AnalyzerObjectAction action) {
    String _method = action.getMethod();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_method);
    if (_isNullOrEmpty) {
      this.error("Parameter missing", action, SWEUIBKPackage.Literals.ANALYZER_OBJECT_ACTION__METHOD);
    }
  }
  
  @Check
  public void checkmonitorempty(final MonitorObjectAction action) {
    String _method = action.getMethod();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_method);
    if (_isNullOrEmpty) {
      this.error("Parameter missing in ", action, null, (-1));
    }
  }
  
  @Check
  public void checkempty3(final AnalyzerObjectAction action) {
    String _method = action.getMethod();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_method);
    if (_isNullOrEmpty) {
      this.error("Parameter missing", action, SWEUIBKPackage.Literals.ANALYZER_OBJECT_ACTION__METHOD);
    }
  }
  
  @Check
  public void checkempty(final Domainmodel model) {
    EList<ObjectDeclaration> _elements = model.getElements();
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(_elements);
    if (_isNullOrEmpty) {
      this.error("Model needs to contain object creation", model, null, (-1));
    }
  }
  
  @Check
  public void checkLowerCaseAction(final AnalyzerObjectAction action) {
    String _name = action.getName();
    String _string = _name.toString();
    char _charAt = _string.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    if (_isUpperCase) {
      String _name_1 = action.getName();
      String _string_1 = _name_1.toString();
      String _plus = ("Only Lower case: " + _string_1);
      this.error(_plus, action, null, (-1));
    }
  }
  
  @Check
  public void checkLowerCaseAction2(final PageObjectAction action) {
    String _name = action.getName();
    String _string = _name.toString();
    char _charAt = _string.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    if (_isUpperCase) {
      String _name_1 = action.getName();
      String _string_1 = _name_1.toString();
      String _plus = ("Only Lower case: " + _string_1);
      this.error(_plus, action, null, (-1));
    }
  }
  
  @Check
  public void checkLowerCaseMonitor(final MonitorDeclaration action) {
    String _name = action.getName();
    String _string = _name.toString();
    char _charAt = _string.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    if (_isUpperCase) {
      String _name_1 = action.getName();
      String _string_1 = _name_1.toString();
      String _plus = ("Only Lower case: " + _string_1);
      this.error(_plus, action, null, (-1));
    }
  }
  
  @Check
  public void checkLowerCasePage(final PageDeclaration action) {
    String _name = action.getName();
    String _string = _name.toString();
    char _charAt = _string.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    if (_isUpperCase) {
      String _name_1 = action.getName();
      String _string_1 = _name_1.toString();
      String _plus = ("Only Lower case: " + _string_1);
      this.error(_plus, action, null, (-1));
    }
  }
}
