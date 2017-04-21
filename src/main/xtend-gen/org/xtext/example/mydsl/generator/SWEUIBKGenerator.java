/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
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
import org.xtext.example.mydsl.sWEUIBK.PageOperations;

@SuppressWarnings("all")
public class SWEUIBKGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Domainmodel> _filter = Iterators.<Domainmodel>filter(_allContents, Domainmodel.class);
    final Procedure1<Domainmodel> _function = new Procedure1<Domainmodel>() {
      @Override
      public void apply(final Domainmodel it) {
        String _vnlContents = SWEUIBKGenerator.this.vnlContents(it);
        fsa.generateFile("Analyzer.java", _vnlContents);
      }
    };
    IteratorExtensions.<Domainmodel>forEach(_filter, _function);
  }
  
  public String vnlContents(final Domainmodel domainmodel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import com.fasterxml.jackson.databind.ObjectMapper;");
    _builder.newLine();
    _builder.append("import org.apache.http.Header;");
    _builder.newLine();
    _builder.append("import org.apache.http.message.BasicHeader;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.SWE.server.Monitor;");
    _builder.newLine();
    _builder.append("import com.SWE.server.Analyzer;");
    _builder.newLine();
    _builder.append("import com.SWE.server.Model;");
    _builder.newLine();
    _builder.append("import com.SWE.server.Page;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public static void main (String [] args){");
    _builder.newLine();
    _builder.newLine();
    {
      EList<ObjectDeclaration> _elements = domainmodel.getElements();
      for(final ObjectDeclaration objectInitialization : _elements) {
        {
          MonitorDeclaration _monitor = objectInitialization.getMonitor();
          boolean _notEquals = (!Objects.equal(_monitor, null));
          if (_notEquals) {
            _builder.append("    ");
            MonitorDeclaration _monitor_1 = objectInitialization.getMonitor();
            String _monitorInitialization = this.monitorInitialization(_monitor_1);
            _builder.append(_monitorInitialization, "    ");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          ModelDeclaration _model = objectInitialization.getModel();
          boolean _notEquals_1 = (!Objects.equal(_model, null));
          if (_notEquals_1) {
            _builder.append("    ");
            ModelDeclaration _model_1 = objectInitialization.getModel();
            String _modelInitialization = this.modelInitialization(_model_1);
            _builder.append(_modelInitialization, "    ");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          PageDeclaration _page = objectInitialization.getPage();
          boolean _notEquals_2 = (!Objects.equal(_page, null));
          if (_notEquals_2) {
            _builder.append("    ");
            PageDeclaration _page_1 = objectInitialization.getPage();
            String _pageInitialization = this.pageInitialization(_page_1);
            _builder.append(_pageInitialization, "    ");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        {
          AnalyzerDeclaration _analyzer = objectInitialization.getAnalyzer();
          boolean _notEquals_3 = (!Objects.equal(_analyzer, null));
          if (_notEquals_3) {
            _builder.append("    ");
            AnalyzerDeclaration _analyzer_1 = objectInitialization.getAnalyzer();
            String _analyzerInitialization = this.analyzerInitialization(_analyzer_1);
            _builder.append(_analyzerInitialization, "    ");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    {
      EList<ObjectAction> _actions = domainmodel.getActions();
      for(final ObjectAction objectAction : _actions) {
        {
          MonitorObjectAction _monitorAction = objectAction.getMonitorAction();
          boolean _notEquals_4 = (!Objects.equal(_monitorAction, null));
          if (_notEquals_4) {
            _builder.append("    ");
            _builder.append(objectAction, "    ");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          ModelAction _modelAction = objectAction.getModelAction();
          boolean _notEquals_5 = (!Objects.equal(_modelAction, null));
          if (_notEquals_5) {
            _builder.append("    ");
            ModelAction _modelAction_1 = objectAction.getModelAction();
            String _modelAction_2 = this.modelAction(_modelAction_1);
            _builder.append(_modelAction_2, "    ");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          PageObjectAction _pageAction = objectAction.getPageAction();
          boolean _notEquals_6 = (!Objects.equal(_pageAction, null));
          if (_notEquals_6) {
            _builder.append("    ");
            PageObjectAction _pageAction_1 = objectAction.getPageAction();
            String _pageAction_2 = this.pageAction(_pageAction_1);
            _builder.append(_pageAction_2, "    ");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        {
          AnalyzerObjectAction _analyzerAction = objectAction.getAnalyzerAction();
          boolean _notEquals_7 = (!Objects.equal(_analyzerAction, null));
          if (_notEquals_7) {
            _builder.append("    ");
            _builder.append(objectAction, "    ");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String modelInitialization(final ModelDeclaration model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Model ");
    String _name = model.getName();
    _builder.append(_name, "");
    _builder.append(" = new Model();");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String analyzerInitialization(final AnalyzerDeclaration analyzer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Analyzer ");
    Analyzer _name = analyzer.getName();
    String _name_1 = _name.getName();
    _builder.append(_name_1, "");
    _builder.append(" = new Analyzer();");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String monitorInitialization(final MonitorDeclaration monitor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Monitor ");
    String _name = monitor.getName();
    _builder.append(_name, "");
    _builder.append(" = new Monitor();");
    _builder.newLineIfNotEmpty();
    String _name_1 = monitor.getName();
    _builder.append(_name_1, "");
    _builder.append(".initialzeFromSource(\"");
    MonitorInitialization _url = monitor.getUrl();
    String _url_1 = _url.getUrl();
    _builder.append(_url_1, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String pageInitialization(final PageDeclaration page) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Page ");
    String _name = page.getName();
    _builder.append(_name, "");
    _builder.append(" = new Page();");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String modelAction(final ModelAction modelAction) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = modelAction.getName();
    _builder.append(_name, "");
    _builder.append(".initialzeFromSource(\"");
    ModelStructure _modelStructure = modelAction.getModelStructure();
    String _source = _modelStructure.getSource();
    _builder.append(_source, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String pageAction(final PageObjectAction pageAction) {
    StringConcatenation _builder = new StringConcatenation();
    {
      PageOperations _value = pageAction.getValue();
      boolean _equals = _value.equals("url");
      if (_equals) {
        _builder.append("  ");
        String _name = pageAction.getName();
        _builder.append(_name, "  ");
        _builder.append(".");
        PageOperations _value_1 = pageAction.getValue();
        _builder.append(_value_1, "  ");
        _builder.append(".");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      PageOperations _value_2 = pageAction.getValue();
      boolean _equals_1 = _value_2.equals("connectType");
      if (_equals_1) {
        _builder.append("  ");
        String _name_1 = pageAction.getName();
        _builder.append(_name_1, "  ");
        _builder.append(".setConnectionType(\"get\");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      PageOperations _value_3 = pageAction.getValue();
      boolean _equals_2 = _value_3.equals("url");
      if (_equals_2) {
        _builder.append("  ");
        String _name_2 = pageAction.getName();
        _builder.append(_name_2, "  ");
        _builder.append(".");
        PageOperations _value_4 = pageAction.getValue();
        _builder.append(_value_4, "  ");
        _builder.append(".");
        _builder.newLineIfNotEmpty();
        _builder.append("              \t\t");
        String _name_3 = pageAction.getName();
        _builder.append(_name_3, "              \t\t");
        _builder.append(".setConnectionType(\"get\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("ObjectMapper mapper = new ObjectMapper();");
    _builder.newLine();
    _builder.append("mapper.readValue(json, GRUModel.class);");
    _builder.newLine();
    return _builder.toString();
  }
}
