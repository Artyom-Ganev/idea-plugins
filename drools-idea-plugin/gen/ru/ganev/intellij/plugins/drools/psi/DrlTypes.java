// This is a generated file. Not intended for manual editing.
package ru.ganev.intellij.plugins.drools.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ru.ganev.intellij.plugins.drools.psi.impl.*;

public interface DrlTypes {

  IElementType ARGLIST = new DrlElementType("ARGLIST");
  IElementType BIT_EXPRESSION = new DrlElementType("BIT_EXPRESSION");
  IElementType CASTING_EXPRESSION = new DrlElementType("CASTING_EXPRESSION");
  IElementType CHARACTER = new DrlElementType("CHARACTER");
  IElementType CLASS_NAME = new DrlElementType("CLASS_NAME");
  IElementType CREATING_EXPRESSION = new DrlElementType("CREATING_EXPRESSION");
  IElementType DECIMAL_DIGITS = new DrlElementType("DECIMAL_DIGITS");
  IElementType DECLARE_STATEMENT = new DrlElementType("DECLARE_STATEMENT");
  IElementType DO_STATEMENT = new DrlElementType("DO_STATEMENT");
  IElementType DROOLS_UNIT = new DrlElementType("DROOLS_UNIT");
  IElementType EXPONENT_PART = new DrlElementType("EXPONENT_PART");
  IElementType EXPRESSION = new DrlElementType("EXPRESSION");
  IElementType FLOAT_LITERAL = new DrlElementType("FLOAT_LITERAL");
  IElementType FLOAT_TYPE_SUFFIX = new DrlElementType("FLOAT_TYPE_SUFFIX");
  IElementType FOR_STATEMENT = new DrlElementType("FOR_STATEMENT");
  IElementType FUNCTION_DECLARATION = new DrlElementType("FUNCTION_DECLARATION");
  IElementType GLOBAL_STAEMENT = new DrlElementType("GLOBAL_STAEMENT");
  IElementType IDENTIFIER = new DrlElementType("IDENTIFIER");
  IElementType IF_STATEMENT = new DrlElementType("IF_STATEMENT");
  IElementType IMPORT_STATEMENT = new DrlElementType("IMPORT_STATEMENT");
  IElementType INTEGER_LITERAL = new DrlElementType("INTEGER_LITERAL");
  IElementType LITERAL_EXPRESSION = new DrlElementType("LITERAL_EXPRESSION");
  IElementType LOGICAL_EXPRESSION = new DrlElementType("LOGICAL_EXPRESSION");
  IElementType NUMERIC_EXPRESSION = new DrlElementType("NUMERIC_EXPRESSION");
  IElementType PACKAGE_NAME = new DrlElementType("PACKAGE_NAME");
  IElementType PACKAGE_STATEMENT = new DrlElementType("PACKAGE_STATEMENT");
  IElementType PARAMETER = new DrlElementType("PARAMETER");
  IElementType PARAMETER_LIST = new DrlElementType("PARAMETER_LIST");
  IElementType RULE_STATEMENT = new DrlElementType("RULE_STATEMENT");
  IElementType SALIENCE_STATEMENT = new DrlElementType("SALIENCE_STATEMENT");
  IElementType STATEMENT = new DrlElementType("STATEMENT");
  IElementType STATEMENT_BLOCK = new DrlElementType("STATEMENT_BLOCK");
  IElementType STRING = new DrlElementType("STRING");
  IElementType STRING_EXPRESSION = new DrlElementType("STRING_EXPRESSION");
  IElementType SWITCH_STATEMENT = new DrlElementType("SWITCH_STATEMENT");
  IElementType TESTING_EXPRESSION = new DrlElementType("TESTING_EXPRESSION");
  IElementType TRY_STATEMENT = new DrlElementType("TRY_STATEMENT");
  IElementType TYPE = new DrlElementType("TYPE");
  IElementType TYPE_SPECIFIER = new DrlElementType("TYPE_SPECIFIER");
  IElementType VARIABLE_DECLARATION = new DrlElementType("VARIABLE_DECLARATION");
  IElementType VARIABLE_DECLARATOR = new DrlElementType("VARIABLE_DECLARATOR");
  IElementType VARIABLE_INITIALIZER = new DrlElementType("VARIABLE_INITIALIZER");
  IElementType WHILE_STATEMENT = new DrlElementType("WHILE_STATEMENT");

  IElementType ABSTRACT = new DrlTokenType("abstract");
  IElementType AND = new DrlTokenType("&&");
  IElementType AS = new DrlTokenType("as");
  IElementType ASSERT = new DrlTokenType("assert");
  IElementType ASYNC = new DrlTokenType("async");
  IElementType AWAIT = new DrlTokenType("await");
  IElementType BREAK = new DrlTokenType("break");
  IElementType CASE = new DrlTokenType("case");
  IElementType CATCH = new DrlTokenType("catch");
  IElementType CLASS = new DrlTokenType("class");
  IElementType CLASSE_NAME = new DrlTokenType("classe_name");
  IElementType CONST = new DrlTokenType("const");
  IElementType CONTINUE = new DrlTokenType("continue");
  IElementType DECLARE = new DrlTokenType("declare");
  IElementType DECLATE_STAEMENT = new DrlTokenType("declate_staement");
  IElementType DEFAULT = new DrlTokenType("default");
  IElementType DEFERRED = new DrlTokenType("deferred");
  IElementType DO = new DrlTokenType("do");
  IElementType DOT = new DrlTokenType(".");
  IElementType ELSE = new DrlTokenType("else");
  IElementType END = new DrlTokenType("end");
  IElementType ENUM = new DrlTokenType("enum");
  IElementType EQ = new DrlTokenType("==");
  IElementType EXPORT = new DrlTokenType("export");
  IElementType EXTENDS = new DrlTokenType("extends");
  IElementType EXTERNAL = new DrlTokenType("external");
  IElementType FACTORY = new DrlTokenType("factory");
  IElementType FALSE = new DrlTokenType("false");
  IElementType FINAL = new DrlTokenType("final");
  IElementType FINALLY = new DrlTokenType("finally");
  IElementType FOR = new DrlTokenType("for");
  IElementType FUNCTION_STATEMENT = new DrlTokenType("function_statement");
  IElementType GET = new DrlTokenType("get");
  IElementType GLOBAL = new DrlTokenType("global");
  IElementType HIDE = new DrlTokenType("hide");
  IElementType IF = new DrlTokenType("if");
  IElementType IMPLEMENTS = new DrlTokenType("implements");
  IElementType IMPORT = new DrlTokenType("import");
  IElementType IN = new DrlTokenType("in");
  IElementType IS = new DrlTokenType("is");
  IElementType LBRACE = new DrlTokenType("{");
  IElementType LBRACKET = new DrlTokenType("[");
  IElementType LIBRARY = new DrlTokenType("library");
  IElementType LPAREN = new DrlTokenType("(");
  IElementType MINUS = new DrlTokenType("-");
  IElementType NATIVE = new DrlTokenType("native");
  IElementType NEW = new DrlTokenType("new");
  IElementType NOT = new DrlTokenType("!");
  IElementType NOT_EQ = new DrlTokenType("!=");
  IElementType NULL = new DrlTokenType("null");
  IElementType OF = new DrlTokenType("of");
  IElementType ON = new DrlTokenType("on");
  IElementType OPERATOR = new DrlTokenType("operator");
  IElementType OR = new DrlTokenType("||");
  IElementType PART = new DrlTokenType("part");
  IElementType PLUS = new DrlTokenType("+");
  IElementType RBRACE = new DrlTokenType("}");
  IElementType RBRACKET = new DrlTokenType("]");
  IElementType RETHROW = new DrlTokenType("rethrow");
  IElementType RETURN = new DrlTokenType("return");
  IElementType RPAREN = new DrlTokenType(")");
  IElementType RULE = new DrlTokenType("rule");
  IElementType SALIENCE = new DrlTokenType("salience");
  IElementType SEMICOLON = new DrlTokenType(";");
  IElementType SET = new DrlTokenType("set");
  IElementType SHOW = new DrlTokenType("show");
  IElementType STATIC = new DrlTokenType("static");
  IElementType SUPER = new DrlTokenType("super");
  IElementType SWITCH = new DrlTokenType("switch");
  IElementType SYNC = new DrlTokenType("sync");
  IElementType THEN = new DrlTokenType("then");
  IElementType THIS = new DrlTokenType("this");
  IElementType THROW = new DrlTokenType("throw");
  IElementType TRUE = new DrlTokenType("true");
  IElementType TRY = new DrlTokenType("try");
  IElementType TYPEDEF = new DrlTokenType("typedef");
  IElementType VAR = new DrlTokenType("var");
  IElementType VOID = new DrlTokenType("void");
  IElementType WHEN = new DrlTokenType("when");
  IElementType WHILE = new DrlTokenType("while");
  IElementType WITH = new DrlTokenType("with");
  IElementType YIELD = new DrlTokenType("yield");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARGLIST) {
        return new SimpleArglistImpl(node);
      }
      else if (type == BIT_EXPRESSION) {
        return new SimpleBitExpressionImpl(node);
      }
      else if (type == CASTING_EXPRESSION) {
        return new SimpleCastingExpressionImpl(node);
      }
      else if (type == CHARACTER) {
        return new SimpleCharacterImpl(node);
      }
      else if (type == CLASS_NAME) {
        return new SimpleClassNameImpl(node);
      }
      else if (type == CREATING_EXPRESSION) {
        return new SimpleCreatingExpressionImpl(node);
      }
      else if (type == DECIMAL_DIGITS) {
        return new SimpleDecimalDigitsImpl(node);
      }
      else if (type == DECLARE_STATEMENT) {
        return new SimpleDeclareStatementImpl(node);
      }
      else if (type == DO_STATEMENT) {
        return new SimpleDoStatementImpl(node);
      }
      else if (type == DROOLS_UNIT) {
        return new SimpleDroolsUnitImpl(node);
      }
      else if (type == EXPONENT_PART) {
        return new SimpleExponentPartImpl(node);
      }
      else if (type == EXPRESSION) {
        return new SimpleExpressionImpl(node);
      }
      else if (type == FLOAT_LITERAL) {
        return new SimpleFloatLiteralImpl(node);
      }
      else if (type == FLOAT_TYPE_SUFFIX) {
        return new SimpleFloatTypeSuffixImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new SimpleForStatementImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new SimpleFunctionDeclarationImpl(node);
      }
      else if (type == GLOBAL_STAEMENT) {
        return new SimpleGlobalStaementImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new SimpleIdentifierImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new SimpleIfStatementImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new SimpleImportStatementImpl(node);
      }
      else if (type == INTEGER_LITERAL) {
        return new SimpleIntegerLiteralImpl(node);
      }
      else if (type == LITERAL_EXPRESSION) {
        return new SimpleLiteralExpressionImpl(node);
      }
      else if (type == LOGICAL_EXPRESSION) {
        return new SimpleLogicalExpressionImpl(node);
      }
      else if (type == NUMERIC_EXPRESSION) {
        return new SimpleNumericExpressionImpl(node);
      }
      else if (type == PACKAGE_NAME) {
        return new SimplePackageNameImpl(node);
      }
      else if (type == PACKAGE_STATEMENT) {
        return new SimplePackageStatementImpl(node);
      }
      else if (type == PARAMETER) {
        return new SimpleParameterImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new SimpleParameterListImpl(node);
      }
      else if (type == RULE_STATEMENT) {
        return new SimpleRuleStatementImpl(node);
      }
      else if (type == SALIENCE_STATEMENT) {
        return new SimpleSalienceStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new SimpleStatementImpl(node);
      }
      else if (type == STATEMENT_BLOCK) {
        return new SimpleStatementBlockImpl(node);
      }
      else if (type == STRING) {
        return new SimpleStringImpl(node);
      }
      else if (type == STRING_EXPRESSION) {
        return new SimpleStringExpressionImpl(node);
      }
      else if (type == SWITCH_STATEMENT) {
        return new SimpleSwitchStatementImpl(node);
      }
      else if (type == TESTING_EXPRESSION) {
        return new SimpleTestingExpressionImpl(node);
      }
      else if (type == TRY_STATEMENT) {
        return new SimpleTryStatementImpl(node);
      }
      else if (type == TYPE) {
        return new SimpleTypeImpl(node);
      }
      else if (type == TYPE_SPECIFIER) {
        return new SimpleTypeSpecifierImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new SimpleVariableDeclarationImpl(node);
      }
      else if (type == VARIABLE_DECLARATOR) {
        return new SimpleVariableDeclaratorImpl(node);
      }
      else if (type == VARIABLE_INITIALIZER) {
        return new SimpleVariableInitializerImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new SimpleWhileStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
