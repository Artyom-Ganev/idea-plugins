// This is a generated file. Not intended for manual editing.
package ru.ganev.intellij.plugins.drools.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ru.ganev.intellij.plugins.drools.psi.impl.*;

public interface DrlTypes {

  IElementType CLASS_NAME = new DrlElementType("CLASS_NAME");
  IElementType COMMENT = new DrlElementType("COMMENT");
  IElementType DROOLS_FILE = new DrlElementType("DROOLS_FILE");
  IElementType FUNCTION_DECLARATION = new DrlElementType("FUNCTION_DECLARATION");
  IElementType GLOBAL_STATEMENT = new DrlElementType("GLOBAL_STATEMENT");
  IElementType IMPORT_STATEMENT = new DrlElementType("IMPORT_STATEMENT");
  IElementType INTEGER_LITERAL = new DrlElementType("INTEGER_LITERAL");
  IElementType PACKAGE_IDENTIFIER = new DrlElementType("PACKAGE_IDENTIFIER");
  IElementType PACKAGE_NAME = new DrlElementType("PACKAGE_NAME");
  IElementType PACKAGE_STATEMENT = new DrlElementType("PACKAGE_STATEMENT");
  IElementType PARAMETER = new DrlElementType("PARAMETER");
  IElementType PARAMETER_LIST = new DrlElementType("PARAMETER_LIST");
  IElementType RULE_STATEMENT = new DrlElementType("RULE_STATEMENT");
  IElementType SALIENCE_STATEMENT = new DrlElementType("SALIENCE_STATEMENT");
  IElementType SIMPLE_IDENTIFIER = new DrlElementType("SIMPLE_IDENTIFIER");
  IElementType TYPE = new DrlElementType("TYPE");
  IElementType TYPE_SPECIFIER = new DrlElementType("TYPE_SPECIFIER");


  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == CLASS_NAME) {
        return new DrlClassNameImpl(node);
      }
      else if (type == COMMENT) {
        return new DrlCommentImpl(node);
      }
      else if (type == DROOLS_FILE) {
        return new DrlDroolsFileImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new DrlFunctionDeclarationImpl(node);
      }
      else if (type == GLOBAL_STATEMENT) {
        return new DrlGlobalStatementImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new DrlImportStatementImpl(node);
      }
      else if (type == INTEGER_LITERAL) {
        return new DrlIntegerLiteralImpl(node);
      }
      else if (type == PACKAGE_IDENTIFIER) {
        return new DrlPackageIdentifierImpl(node);
      }
      else if (type == PACKAGE_NAME) {
        return new DrlPackageNameImpl(node);
      }
      else if (type == PACKAGE_STATEMENT) {
        return new DrlPackageStatementImpl(node);
      }
      else if (type == PARAMETER) {
        return new DrlParameterImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new DrlParameterListImpl(node);
      }
      else if (type == RULE_STATEMENT) {
        return new DrlRuleStatementImpl(node);
      }
      else if (type == SALIENCE_STATEMENT) {
        return new DrlSalienceStatementImpl(node);
      }
      else if (type == SIMPLE_IDENTIFIER) {
        return new DrlSimpleIdentifierImpl(node);
      }
      else if (type == TYPE) {
        return new DrlTypeImpl(node);
      }
      else if (type == TYPE_SPECIFIER) {
        return new DrlTypeSpecifierImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
