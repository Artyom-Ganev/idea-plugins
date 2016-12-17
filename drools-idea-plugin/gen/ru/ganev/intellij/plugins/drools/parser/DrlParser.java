// This is a generated file. Not intended for manual editing.
package ru.ganev.intellij.plugins.drools.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static ru.ganev.intellij.plugins.drools.psi.DrlTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DrlParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == CLASS_NAME) {
      r = class_name(b, 0);
    }
    else if (t == DROOLS_FILE) {
      r = droolsFile(b, 0);
    }
    else if (t == FUNCTION_DECLARATION) {
      r = function_declaration(b, 0);
    }
    else if (t == GLOBAL_STATEMENT) {
      r = global_statement(b, 0);
    }
    else if (t == IMPORT_STATEMENT) {
      r = import_statement(b, 0);
    }
    else if (t == INTEGER_LITERAL) {
      r = integer_literal(b, 0);
    }
    else if (t == PACKAGE_IDENTIFIER) {
      r = package_identifier(b, 0);
    }
    else if (t == PACKAGE_NAME) {
      r = package_name(b, 0);
    }
    else if (t == PACKAGE_STATEMENT) {
      r = package_statement(b, 0);
    }
    else if (t == PARAMETER) {
      r = parameter(b, 0);
    }
    else if (t == PARAMETER_LIST) {
      r = parameter_list(b, 0);
    }
    else if (t == RULE_STATEMENT) {
      r = rule_statement(b, 0);
    }
    else if (t == SALIENCE_STATEMENT) {
      r = salience_statement(b, 0);
    }
    else if (t == SIMPLE_IDENTIFIER) {
      r = simple_identifier(b, 0);
    }
    else if (t == TYPE) {
      r = type(b, 0);
    }
    else if (t == TYPE_SPECIFIER) {
      r = type_specifier(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return drl(b, l + 1);
  }

  /* ********************************************************** */
  // simple_identifier | ( package_name "." simple_identifier )
  public static boolean class_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_NAME, "<class name>");
    r = simple_identifier(b, l + 1);
    if (!r) r = class_name_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // package_name "." simple_identifier
  private static boolean class_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = package_name(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && simple_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  static boolean drl(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // [ package_statement ]
  //       { import_statement }
  //       { global_statement}
  //       { function_declaration }
  //       { rule_statement }
  public static boolean droolsFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "droolsFile")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DROOLS_FILE, "<drools file>");
    r = droolsFile_0(b, l + 1);
    r = r && droolsFile_1(b, l + 1);
    r = r && droolsFile_2(b, l + 1);
    r = r && droolsFile_3(b, l + 1);
    r = r && droolsFile_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ package_statement ]
  private static boolean droolsFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "droolsFile_0")) return false;
    package_statement(b, l + 1);
    return true;
  }

  // { import_statement }
  private static boolean droolsFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "droolsFile_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { global_statement}
  private static boolean droolsFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "droolsFile_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = global_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { function_declaration }
  private static boolean droolsFile_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "droolsFile_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { rule_statement }
  private static boolean droolsFile_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "droolsFile_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "function" ("void" | type) simple_identifier "(" [ parameter_list ] ")"
  public static boolean function_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    r = consumeToken(b, "function");
    r = r && function_declaration_1(b, l + 1);
    r = r && simple_identifier(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && function_declaration_4(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "void" | type
  private static boolean function_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "void");
    if (!r) r = type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ parameter_list ]
  private static boolean function_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_4")) return false;
    parameter_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "global" class_name " " simple_identifier ";"
  public static boolean global_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GLOBAL_STATEMENT, "<global statement>");
    r = consumeToken(b, "global");
    r = r && class_name(b, l + 1);
    r = r && consumeToken(b, " ");
    r = r && simple_identifier(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "import" ( ( package_name "." "*" ) | class_name ) ";"
  public static boolean import_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STATEMENT, "<import statement>");
    r = consumeToken(b, "import");
    r = r && import_statement_1(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( package_name "." "*" ) | class_name
  private static boolean import_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_statement_1_0(b, l + 1);
    if (!r) r = class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // package_name "." "*"
  private static boolean import_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = package_name(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && consumeToken(b, "*");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "0..9" {"0..9"}
  public static boolean integer_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_LITERAL, "<integer literal>");
    r = consumeToken(b, "0..9");
    r = r && integer_literal_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {"0..9"}
  private static boolean integer_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_literal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "0..9");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "a..z" { "a..z" }
  public static boolean package_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_IDENTIFIER, "<package identifier>");
    r = consumeToken(b, "a..z");
    r = r && package_identifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { "a..z" }
  private static boolean package_identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_identifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "a..z");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // package_identifier { "." package_identifier } ";"
  public static boolean package_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_NAME, "<package name>");
    r = package_identifier(b, l + 1);
    r = r && package_name_1(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "." package_identifier
  private static boolean package_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && package_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "package" package_name ";"
  public static boolean package_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_STATEMENT, "<package statement>");
    r = consumeToken(b, "package");
    r = r && package_name(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type simple_identifier { "[" "]" }
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = type(b, l + 1);
    r = r && simple_identifier(b, l + 1);
    r = r && parameter_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "[" "]"
  private static boolean parameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // parameter { "," parameter }
  public static boolean parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_LIST, "<parameter list>");
    r = parameter(b, l + 1);
    r = r && parameter_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "," parameter
  private static boolean parameter_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "rule" simple_identifier
  //                    {salience_statement}
  //                    "when"
  //                    "then"
  //                    "end"
  public static boolean rule_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE_STATEMENT, "<rule statement>");
    r = consumeToken(b, "rule");
    r = r && simple_identifier(b, l + 1);
    r = r && rule_statement_2(b, l + 1);
    r = r && consumeToken(b, "when");
    r = r && consumeToken(b, "then");
    r = r && consumeToken(b, "end");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {salience_statement}
  private static boolean rule_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = salience_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "salience" integer_literal
  public static boolean salience_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "salience_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SALIENCE_STATEMENT, "<salience statement>");
    r = consumeToken(b, "salience");
    r = r && integer_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "a..z" { "a..z,A..Z,0..9 " }
  public static boolean simple_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_IDENTIFIER, "<simple identifier>");
    r = consumeToken(b, "a..z");
    r = r && simple_identifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { "a..z,A..Z,0..9 " }
  private static boolean simple_identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_identifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "a..z,A..Z,0..9 ");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type_specifier { "[" "]" }
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = type_specifier(b, l + 1);
    r = r && type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "[" "]"
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "boolean" | "byte" | "char" | "short" | "int" | "float" | "long" | "double" | class_name
  public static boolean type_specifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_specifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SPECIFIER, "<type specifier>");
    r = consumeToken(b, "boolean");
    if (!r) r = consumeToken(b, "byte");
    if (!r) r = consumeToken(b, "char");
    if (!r) r = consumeToken(b, "short");
    if (!r) r = consumeToken(b, "int");
    if (!r) r = consumeToken(b, "float");
    if (!r) r = consumeToken(b, "long");
    if (!r) r = consumeToken(b, "double");
    if (!r) r = class_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
