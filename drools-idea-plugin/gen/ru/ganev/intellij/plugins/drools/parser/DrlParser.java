// This is a generated file. Not intended for manual editing.
package ru.ganev.intellij.plugins.drools.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static ru.ganev.intellij.plugins.drools.psi.DrlTypes.*;
import static ru.ganev.intellij.plugins.drools.psi.impl.DrlParserUtil.*;
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
    if (t == ARGLIST) {
      r = arglist(b, 0);
    }
    else if (t == BIT_EXPRESSION) {
      r = bit_expression(b, 0);
    }
    else if (t == CASTING_EXPRESSION) {
      r = casting_expression(b, 0);
    }
    else if (t == CHARACTER) {
      r = character(b, 0);
    }
    else if (t == CLASS_NAME) {
      r = class_name(b, 0);
    }
    else if (t == CREATING_EXPRESSION) {
      r = creating_expression(b, 0);
    }
    else if (t == DECIMAL_DIGITS) {
      r = decimal_digits(b, 0);
    }
    else if (t == DECLARE_STATEMENT) {
      r = declare_statement(b, 0);
    }
    else if (t == DO_STATEMENT) {
      r = do_statement(b, 0);
    }
    else if (t == DROOLS_UNIT) {
      r = drools_unit(b, 0);
    }
    else if (t == EXPONENT_PART) {
      r = exponent_part(b, 0);
    }
    else if (t == EXPRESSION) {
      r = expression(b, 0);
    }
    else if (t == FLOAT_LITERAL) {
      r = float_literal(b, 0);
    }
    else if (t == FLOAT_TYPE_SUFFIX) {
      r = float_type_suffix(b, 0);
    }
    else if (t == FOR_STATEMENT) {
      r = for_statement(b, 0);
    }
    else if (t == FUNCTION_DECLARATION) {
      r = function_declaration(b, 0);
    }
    else if (t == GLOBAL_STAEMENT) {
      r = global_staement(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = identifier(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = if_statement(b, 0);
    }
    else if (t == IMPORT_STATEMENT) {
      r = import_statement(b, 0);
    }
    else if (t == INTEGER_LITERAL) {
      r = integer_literal(b, 0);
    }
    else if (t == LITERAL_EXPRESSION) {
      r = literal_expression(b, 0);
    }
    else if (t == LOGICAL_EXPRESSION) {
      r = logical_expression(b, 0);
    }
    else if (t == NUMERIC_EXPRESSION) {
      r = numeric_expression(b, 0);
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
    else if (t == STATEMENT) {
      r = statement(b, 0);
    }
    else if (t == STATEMENT_BLOCK) {
      r = statement_block(b, 0);
    }
    else if (t == STRING) {
      r = string(b, 0);
    }
    else if (t == STRING_EXPRESSION) {
      r = string_expression(b, 0);
    }
    else if (t == SWITCH_STATEMENT) {
      r = switch_statement(b, 0);
    }
    else if (t == TESTING_EXPRESSION) {
      r = testing_expression(b, 0);
    }
    else if (t == TRY_STATEMENT) {
      r = try_statement(b, 0);
    }
    else if (t == TYPE) {
      r = type(b, 0);
    }
    else if (t == TYPE_SPECIFIER) {
      r = type_specifier(b, 0);
    }
    else if (t == VARIABLE_DECLARATION) {
      r = variable_declaration(b, 0);
    }
    else if (t == VARIABLE_DECLARATOR) {
      r = variable_declarator(b, 0);
    }
    else if (t == VARIABLE_INITIALIZER) {
      r = variable_initializer(b, 0);
    }
    else if (t == WHILE_STATEMENT) {
      r = while_statement(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return modifier(b, l + 1);
  }

  /* ********************************************************** */
  // expression { "," expression }
  public static boolean arglist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arglist")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGLIST, "<arglist>");
    r = expression(b, l + 1);
    r = r && arglist_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "," expression
  private static boolean arglist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arglist_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ("~" expression) | (expression (">>=" | "<<" | ">>" | ">>>") expression)
  public static boolean bit_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIT_EXPRESSION, "<bit expression>");
    r = bit_expression_0(b, l + 1);
    if (!r) r = bit_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "~" expression
  private static boolean bit_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "~");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression (">>=" | "<<" | ">>" | ">>>") expression
  private static boolean bit_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && bit_expression_1_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ">>=" | "<<" | ">>" | ">>>"
  private static boolean bit_expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_expression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ">>=");
    if (!r) r = consumeToken(b, "<<");
    if (!r) r = consumeToken(b, ">>");
    if (!r) r = consumeToken(b, ">>>");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "(" type ")" expression
  public static boolean casting_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "casting_expression")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, CASTING_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // "based on the unicode character set"
  public static boolean character(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "character")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHARACTER, "<character>");
    r = consumeToken(b, "based on the unicode character set");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier | ( package_name "." identifier )
  public static boolean class_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_NAME, "<class name>");
    r = identifier(b, l + 1);
    if (!r) r = class_name_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // package_name "." identifier
  private static boolean class_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = package_name(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "new" ((classe_name "(" [arglist] ")")
  //     | (type_specifier ["[" expression "]"] {"[" "]"})
  //     | ("(" expression ")"))
  public static boolean creating_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creating_expression")) return false;
    if (!nextTokenIs(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && creating_expression_1(b, l + 1);
    exit_section_(b, m, CREATING_EXPRESSION, r);
    return r;
  }

  // (classe_name "(" [arglist] ")")
  //     | (type_specifier ["[" expression "]"] {"[" "]"})
  //     | ("(" expression ")")
  private static boolean creating_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creating_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = creating_expression_1_0(b, l + 1);
    if (!r) r = creating_expression_1_1(b, l + 1);
    if (!r) r = creating_expression_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // classe_name "(" [arglist] ")"
  private static boolean creating_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creating_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASSE_NAME, LPAREN);
    r = r && creating_expression_1_0_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // [arglist]
  private static boolean creating_expression_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creating_expression_1_0_2")) return false;
    arglist(b, l + 1);
    return true;
  }

  // type_specifier ["[" expression "]"] {"[" "]"}
  private static boolean creating_expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creating_expression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_specifier(b, l + 1);
    r = r && creating_expression_1_1_1(b, l + 1);
    r = r && creating_expression_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ["[" expression "]"]
  private static boolean creating_expression_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creating_expression_1_1_1")) return false;
    creating_expression_1_1_1_0(b, l + 1);
    return true;
  }

  // "[" expression "]"
  private static boolean creating_expression_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creating_expression_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // "[" "]"
  private static boolean creating_expression_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creating_expression_1_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" expression ")"
  private static boolean creating_expression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creating_expression_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "0..9" { "0..9" }
  public static boolean decimal_digits(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_digits")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECIMAL_DIGITS, "<decimal digits>");
    r = consumeToken(b, "0..9");
    r = r && decimal_digits_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { "0..9" }
  private static boolean decimal_digits_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_digits_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "0..9");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "declare" identifier
  // 		      {identifier ":" type ";"}
  //                       end
  public static boolean declare_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_statement")) return false;
    if (!nextTokenIs(b, DECLARE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECLARE);
    r = r && identifier(b, l + 1);
    r = r && declare_statement_2(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, DECLARE_STATEMENT, r);
    return r;
  }

  // identifier ":" type ";"
  private static boolean declare_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "do" statement "while" "(" expression ")" ";"
  public static boolean do_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_statement")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO);
    r = r && statement(b, l + 1);
    r = r && consumeTokens(b, 0, WHILE, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, SEMICOLON);
    exit_section_(b, m, DO_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // [ package_statement ] 
  //       { import_statement } 
  //       { global_staement } 
  //       { declate_staement }
  //       { function_statement }
  //       { rule_statement }
  public static boolean drools_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drools_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DROOLS_UNIT, "<drools unit>");
    r = drools_unit_0(b, l + 1);
    r = r && drools_unit_1(b, l + 1);
    r = r && drools_unit_2(b, l + 1);
    r = r && consumeToken(b, DECLATE_STAEMENT);
    r = r && consumeToken(b, FUNCTION_STATEMENT);
    r = r && drools_unit_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ package_statement ]
  private static boolean drools_unit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drools_unit_0")) return false;
    package_statement(b, l + 1);
    return true;
  }

  // { import_statement }
  private static boolean drools_unit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drools_unit_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { global_staement }
  private static boolean drools_unit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drools_unit_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = global_staement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { rule_statement }
  private static boolean drools_unit_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drools_unit_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "e" [ "+" | "-" ] decimal_digits
  public static boolean exponent_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPONENT_PART, "<exponent part>");
    r = consumeToken(b, "e");
    r = r && exponent_part_1(b, l + 1);
    r = r && decimal_digits(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ "+" | "-" ]
  private static boolean exponent_part_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_part_1")) return false;
    exponent_part_1_0(b, l + 1);
    return true;
  }

  // "+" | "-"
  private static boolean exponent_part_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_part_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // numeric_expression 
  //     | testing_expression 
  //     | logical_expression 
  //     | string_expression 
  //     | bit_expression 
  //     | casting_expression 
  //     | creating_expression 
  //     | literal_expression 
  //     | "null" 
  //     | "super" 
  //     | "this" 
  //     | identifier 
  //     | ("(" expression ")") 
  //     | (expression (("(" [arglist] ")") | ("[" expression "]") | ("." expression) | ("," expression ) | ("instanceof" class_name)))
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = numeric_expression(b, l + 1);
    if (!r) r = testing_expression(b, l + 1);
    if (!r) r = logical_expression(b, l + 1);
    if (!r) r = string_expression(b, l + 1);
    if (!r) r = bit_expression(b, l + 1);
    if (!r) r = casting_expression(b, l + 1);
    if (!r) r = creating_expression(b, l + 1);
    if (!r) r = literal_expression(b, l + 1);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, SUPER);
    if (!r) r = consumeToken(b, THIS);
    if (!r) r = identifier(b, l + 1);
    if (!r) r = expression_12(b, l + 1);
    if (!r) r = expression_13(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" expression ")"
  private static boolean expression_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression (("(" [arglist] ")") | ("[" expression "]") | ("." expression) | ("," expression ) | ("instanceof" class_name))
  private static boolean expression_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && expression_13_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("(" [arglist] ")") | ("[" expression "]") | ("." expression) | ("," expression ) | ("instanceof" class_name)
  private static boolean expression_13_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_13_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_13_1_0(b, l + 1);
    if (!r) r = expression_13_1_1(b, l + 1);
    if (!r) r = expression_13_1_2(b, l + 1);
    if (!r) r = expression_13_1_3(b, l + 1);
    if (!r) r = expression_13_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" [arglist] ")"
  private static boolean expression_13_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_13_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expression_13_1_0_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // [arglist]
  private static boolean expression_13_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_13_1_0_1")) return false;
    arglist(b, l + 1);
    return true;
  }

  // "[" expression "]"
  private static boolean expression_13_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_13_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // "." expression
  private static boolean expression_13_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_13_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "," expression
  private static boolean expression_13_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_13_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "instanceof" class_name
  private static boolean expression_13_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_13_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "instanceof");
    r = r && class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (decimal_digits "." [decimal_digits] [exponent_part] [float_type_suffix])
  //       | ("." decimal_digits [exponent_part] [float_type_suffix])
  //       | (decimal_digits [exponent_part] [float_type_suffix])
  public static boolean float_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLOAT_LITERAL, "<float literal>");
    r = float_literal_0(b, l + 1);
    if (!r) r = float_literal_1(b, l + 1);
    if (!r) r = float_literal_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // decimal_digits "." [decimal_digits] [exponent_part] [float_type_suffix]
  private static boolean float_literal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_literal_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decimal_digits(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && float_literal_0_2(b, l + 1);
    r = r && float_literal_0_3(b, l + 1);
    r = r && float_literal_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [decimal_digits]
  private static boolean float_literal_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_literal_0_2")) return false;
    decimal_digits(b, l + 1);
    return true;
  }

  // [exponent_part]
  private static boolean float_literal_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_literal_0_3")) return false;
    exponent_part(b, l + 1);
    return true;
  }

  // [float_type_suffix]
  private static boolean float_literal_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_literal_0_4")) return false;
    float_type_suffix(b, l + 1);
    return true;
  }

  // "." decimal_digits [exponent_part] [float_type_suffix]
  private static boolean float_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_literal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && decimal_digits(b, l + 1);
    r = r && float_literal_1_2(b, l + 1);
    r = r && float_literal_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [exponent_part]
  private static boolean float_literal_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_literal_1_2")) return false;
    exponent_part(b, l + 1);
    return true;
  }

  // [float_type_suffix]
  private static boolean float_literal_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_literal_1_3")) return false;
    float_type_suffix(b, l + 1);
    return true;
  }

  // decimal_digits [exponent_part] [float_type_suffix]
  private static boolean float_literal_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_literal_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decimal_digits(b, l + 1);
    r = r && float_literal_2_1(b, l + 1);
    r = r && float_literal_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [exponent_part]
  private static boolean float_literal_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_literal_2_1")) return false;
    exponent_part(b, l + 1);
    return true;
  }

  // [float_type_suffix]
  private static boolean float_literal_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_literal_2_2")) return false;
    float_type_suffix(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "f" | "d"
  public static boolean float_type_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_type_suffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLOAT_TYPE_SUFFIX, "<float type suffix>");
    r = consumeToken(b, "f");
    if (!r) r = consumeToken(b, "d");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "for" "(" (variable_declaration | (expression ";") | ";") [expression] ";" [expression] ";" ")" statement
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, LPAREN);
    r = r && for_statement_2(b, l + 1);
    r = r && for_statement_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && for_statement_5(b, l + 1);
    r = r && consumeTokens(b, 0, SEMICOLON, RPAREN);
    r = r && statement(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // variable_declaration | (expression ";") | ";"
  private static boolean for_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_declaration(b, l + 1);
    if (!r) r = for_statement_2_1(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression ";"
  private static boolean for_statement_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [expression]
  private static boolean for_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_3")) return false;
    expression(b, l + 1);
    return true;
  }

  // [expression]
  private static boolean for_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_5")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "function" ("void" | type) identifier "(" [ parameter_list ] ")"
  //                          statement_block
  public static boolean function_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    r = consumeToken(b, "function");
    r = r && function_declaration_1(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && function_declaration_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && statement_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "void" | type
  private static boolean function_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VOID);
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
  // "global" class_name " " identifier ";"
  public static boolean global_staement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_staement")) return false;
    if (!nextTokenIs(b, GLOBAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GLOBAL);
    r = r && class_name(b, l + 1);
    r = r && consumeToken(b, " ");
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, GLOBAL_STAEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // "a..z,$,_" { "a..z,$,_,0..9,unicode character over 00C0" }
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = consumeToken(b, "a..z,$,_");
    r = r && identifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { "a..z,$,_,0..9,unicode character over 00C0" }
  private static boolean identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "a..z,$,_,0..9,unicode character over 00C0");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "if" "(" expression ")" statement ["else" statement]
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && statement(b, l + 1);
    r = r && if_statement_5(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // ["else" statement]
  private static boolean if_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5")) return false;
    if_statement_5_0(b, l + 1);
    return true;
  }

  // "else" statement
  private static boolean if_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "import" ( ( package_name "." "*" ";" ) | class_name ) ";"
  public static boolean import_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT);
    r = r && import_statement_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, IMPORT_STATEMENT, r);
    return r;
  }

  // ( package_name "." "*" ";" ) | class_name
  private static boolean import_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = import_statement_1_0(b, l + 1);
    if (!r) r = class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // package_name "." "*" ";"
  private static boolean import_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_statement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = package_name(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && consumeToken(b, "*");
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (("1..9" {"0..9" }) 
  //       | {"0..7"} 
  //       | ("0" "x" "0..9a..f" {"0..9a..f"})) ["l"]
  public static boolean integer_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_LITERAL, "<integer literal>");
    r = integer_literal_0(b, l + 1);
    r = r && integer_literal_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("1..9" {"0..9" }) 
  //       | {"0..7"} 
  //       | ("0" "x" "0..9a..f" {"0..9a..f"})
  private static boolean integer_literal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_literal_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = integer_literal_0_0(b, l + 1);
    if (!r) r = integer_literal_0_1(b, l + 1);
    if (!r) r = integer_literal_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "1..9" {"0..9" }
  private static boolean integer_literal_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_literal_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "1..9");
    r = r && integer_literal_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {"0..9" }
  private static boolean integer_literal_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_literal_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "0..9");
    exit_section_(b, m, null, r);
    return r;
  }

  // {"0..7"}
  private static boolean integer_literal_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_literal_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "0..7");
    exit_section_(b, m, null, r);
    return r;
  }

  // "0" "x" "0..9a..f" {"0..9a..f"}
  private static boolean integer_literal_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_literal_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "0");
    r = r && consumeToken(b, "x");
    r = r && consumeToken(b, "0..9a..f");
    r = r && integer_literal_0_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {"0..9a..f"}
  private static boolean integer_literal_0_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_literal_0_2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "0..9a..f");
    exit_section_(b, m, null, r);
    return r;
  }

  // ["l"]
  private static boolean integer_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_literal_1")) return false;
    consumeToken(b, "l");
    return true;
  }

  /* ********************************************************** */
  // integer_literal 
  //     | float_literal 
  //     | string 
  //     | character
  public static boolean literal_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPRESSION, "<literal expression>");
    r = integer_literal(b, l + 1);
    if (!r) r = float_literal(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = character(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ("!" expression)
  //     | (expression ("ampersand"
  //         | "ampersand="
  //         | "|"
  //         | "|="
  //         | "^"
  //         | "^="
  //         | ("ampersand" "ampersand")
  //         | "||="
  //         | "%"
  //         | "%=") expression)
  //     | (expression "?" expression ":" expression)
  //     | "true"
  //     | "false"
  public static boolean logical_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_EXPRESSION, "<logical expression>");
    r = logical_expression_0(b, l + 1);
    if (!r) r = logical_expression_1(b, l + 1);
    if (!r) r = logical_expression_2(b, l + 1);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "!" expression
  private static boolean logical_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression ("ampersand"
  //         | "ampersand="
  //         | "|"
  //         | "|="
  //         | "^"
  //         | "^="
  //         | ("ampersand" "ampersand")
  //         | "||="
  //         | "%"
  //         | "%=") expression
  private static boolean logical_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && logical_expression_1_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "ampersand"
  //         | "ampersand="
  //         | "|"
  //         | "|="
  //         | "^"
  //         | "^="
  //         | ("ampersand" "ampersand")
  //         | "||="
  //         | "%"
  //         | "%="
  private static boolean logical_expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ampersand");
    if (!r) r = consumeToken(b, "ampersand=");
    if (!r) r = consumeToken(b, "|");
    if (!r) r = consumeToken(b, "|=");
    if (!r) r = consumeToken(b, "^");
    if (!r) r = consumeToken(b, "^=");
    if (!r) r = logical_expression_1_1_6(b, l + 1);
    if (!r) r = consumeToken(b, "||=");
    if (!r) r = consumeToken(b, "%");
    if (!r) r = consumeToken(b, "%=");
    exit_section_(b, m, null, r);
    return r;
  }

  // "ampersand" "ampersand"
  private static boolean logical_expression_1_1_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_1_1_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ampersand");
    r = r && consumeToken(b, "ampersand");
    exit_section_(b, m, null, r);
    return r;
  }

  // expression "?" expression ":" expression
  private static boolean logical_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && consumeToken(b, "?");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "public" | "private" | "protected" | "static" | "final" | "native" | "synchronized" | "abstract" | "threadsafe" | "transient"
  static boolean modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modifier")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "private");
    if (!r) r = consumeToken(b, "protected");
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, FINAL);
    if (!r) r = consumeToken(b, NATIVE);
    if (!r) r = consumeToken(b, "synchronized");
    if (!r) r = consumeToken(b, ABSTRACT);
    if (!r) r = consumeToken(b, "threadsafe");
    if (!r) r = consumeToken(b, "transient");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (( "-" | "++" | "--" ) expression)
  //     | (expression ( "++" | "--"))
  //     | (expression ("+" | "+=" | "-" | "-=" | "*" | "*=" | "/" | "/=" | "%" | "%=") expression)
  public static boolean numeric_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMERIC_EXPRESSION, "<numeric expression>");
    r = numeric_expression_0(b, l + 1);
    if (!r) r = numeric_expression_1(b, l + 1);
    if (!r) r = numeric_expression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( "-" | "++" | "--" ) expression
  private static boolean numeric_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = numeric_expression_0_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "-" | "++" | "--"
  private static boolean numeric_expression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_expression_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, "++");
    if (!r) r = consumeToken(b, "--");
    exit_section_(b, m, null, r);
    return r;
  }

  // expression ( "++" | "--")
  private static boolean numeric_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && numeric_expression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "++" | "--"
  private static boolean numeric_expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_expression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "++");
    if (!r) r = consumeToken(b, "--");
    exit_section_(b, m, null, r);
    return r;
  }

  // expression ("+" | "+=" | "-" | "-=" | "*" | "*=" | "/" | "/=" | "%" | "%=") expression
  private static boolean numeric_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && numeric_expression_2_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "+" | "+=" | "-" | "-=" | "*" | "*=" | "/" | "/=" | "%" | "%="
  private static boolean numeric_expression_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_expression_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, "+=");
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, "-=");
    if (!r) r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "*=");
    if (!r) r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, "/=");
    if (!r) r = consumeToken(b, "%");
    if (!r) r = consumeToken(b, "%=");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier | ( package_name "." identifier )
  public static boolean package_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_NAME, "<package name>");
    r = identifier(b, l + 1);
    if (!r) r = package_name_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // package_name "." identifier
  private static boolean package_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = package_name(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && identifier(b, l + 1);
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
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type identifier { "[" "]" }
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = type(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && parameter_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "[" "]"
  private static boolean parameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, RBRACKET);
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
  // "rule"
  //                    {salience_statement}
  //                    "when"
  //                    "then"
  //                    "end"
  public static boolean rule_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_statement")) return false;
    if (!nextTokenIs(b, RULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RULE);
    r = r && rule_statement_1(b, l + 1);
    r = r && consumeTokens(b, 0, WHEN, THEN, END);
    exit_section_(b, m, RULE_STATEMENT, r);
    return r;
  }

  // {salience_statement}
  private static boolean rule_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_statement_1")) return false;
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
    if (!nextTokenIs(b, SALIENCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SALIENCE);
    r = r && integer_literal(b, l + 1);
    exit_section_(b, m, SALIENCE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // variable_declaration 
  //     | ( expression ";" ) 
  //     | ( statement_block ) 
  //     | ( if_statement ) 
  //     | ( do_statement ) 
  //     | ( while_statement ) 
  //     | ( for_statement ) 
  //     | ( try_statement ) 
  //     | ( switch_statement ) 
  //     | ( "synchronized" "(" expression ")" statement ) 
  //     | ( "return" [ expression ] ";" ) 
  //     | ( "throw" expression ";" ) 
  //     | ( identifier ":" statement ) 
  //     | ( "break" [ identifier ] ";" ) 
  //     | ( "continue" [ identifier ] ";" ) 
  //     | ( ";" )
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = variable_declaration(b, l + 1);
    if (!r) r = statement_1(b, l + 1);
    if (!r) r = statement_2(b, l + 1);
    if (!r) r = statement_3(b, l + 1);
    if (!r) r = statement_4(b, l + 1);
    if (!r) r = statement_5(b, l + 1);
    if (!r) r = statement_6(b, l + 1);
    if (!r) r = statement_7(b, l + 1);
    if (!r) r = statement_8(b, l + 1);
    if (!r) r = statement_9(b, l + 1);
    if (!r) r = statement_10(b, l + 1);
    if (!r) r = statement_11(b, l + 1);
    if (!r) r = statement_12(b, l + 1);
    if (!r) r = statement_13(b, l + 1);
    if (!r) r = statement_14(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expression ";"
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( statement_block )
  private static boolean statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( if_statement )
  private static boolean statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( do_statement )
  private static boolean statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = do_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( while_statement )
  private static boolean statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = while_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( for_statement )
  private static boolean statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = for_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( try_statement )
  private static boolean statement_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = try_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( switch_statement )
  private static boolean statement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = switch_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "synchronized" "(" expression ")" statement
  private static boolean statement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "synchronized");
    r = r && consumeToken(b, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "return" [ expression ] ";"
  private static boolean statement_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && statement_10_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ expression ]
  private static boolean statement_10_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_10_1")) return false;
    expression(b, l + 1);
    return true;
  }

  // "throw" expression ";"
  private static boolean statement_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THROW);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier ":" statement
  private static boolean statement_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "break" [ identifier ] ";"
  private static boolean statement_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BREAK);
    r = r && statement_13_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ identifier ]
  private static boolean statement_13_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_13_1")) return false;
    identifier(b, l + 1);
    return true;
  }

  // "continue" [ identifier ] ";"
  private static boolean statement_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTINUE);
    r = r && statement_14_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ identifier ]
  private static boolean statement_14_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_14_1")) return false;
    identifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // "{" { statement } "}"
  public static boolean statement_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && statement_block_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, STATEMENT_BLOCK, r);
    return r;
  }

  // { statement }
  private static boolean statement_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_block_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "''" {character} "''"
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING, "<string>");
    r = consumeToken(b, "''");
    r = r && string_1(b, l + 1);
    r = r && consumeToken(b, "''");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {character}
  private static boolean string_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = character(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression ("+" | "+=") expression
  public static boolean string_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_EXPRESSION, "<string expression>");
    r = expression(b, l + 1);
    r = r && string_expression_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "+" | "+="
  private static boolean string_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, "+=");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "switch" "(" expression ")" "{" {( "case" expression ":") | ("default" ":") | statement} "}"
  public static boolean switch_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement")) return false;
    if (!nextTokenIs(b, SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SWITCH, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LBRACE);
    r = r && switch_statement_5(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, SWITCH_STATEMENT, r);
    return r;
  }

  // ( "case" expression ":") | ("default" ":") | statement
  private static boolean switch_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = switch_statement_5_0(b, l + 1);
    if (!r) r = switch_statement_5_1(b, l + 1);
    if (!r) r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "case" expression ":"
  private static boolean switch_statement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // "default" ":"
  private static boolean switch_statement_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement_5_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFAULT);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression (">" | "<" | ">=" | "<=" | "==" | "!=") expression
  public static boolean testing_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testing_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TESTING_EXPRESSION, "<testing expression>");
    r = expression(b, l + 1);
    r = r && testing_expression_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ">" | "<" | ">=" | "<=" | "==" | "!="
  private static boolean testing_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "testing_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, ">=");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, NOT_EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "try" statement {"catch" "(" parameter ")" statement} ["finally" statement]
  public static boolean try_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement")) return false;
    if (!nextTokenIs(b, TRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRY);
    r = r && statement(b, l + 1);
    r = r && try_statement_2(b, l + 1);
    r = r && try_statement_3(b, l + 1);
    exit_section_(b, m, TRY_STATEMENT, r);
    return r;
  }

  // "catch" "(" parameter ")" statement
  private static boolean try_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CATCH, LPAREN);
    r = r && parameter(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ["finally" statement]
  private static boolean try_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_3")) return false;
    try_statement_3_0(b, l + 1);
    return true;
  }

  // "finally" statement
  private static boolean try_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FINALLY);
    r = r && statement(b, l + 1);
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
    r = consumeTokens(b, 0, LBRACKET, RBRACKET);
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

  /* ********************************************************** */
  // { modifier } type variable_declarator { "," variable_declarator } ";"
  public static boolean variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = variable_declaration_0(b, l + 1);
    r = r && type(b, l + 1);
    r = r && variable_declarator(b, l + 1);
    r = r && variable_declaration_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { modifier }
  private static boolean variable_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = modifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "," variable_declarator
  private static boolean variable_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && variable_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier {"[" "]"} ["=" variable_initializer]
  public static boolean variable_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATOR, "<variable declarator>");
    r = identifier(b, l + 1);
    r = r && variable_declarator_1(b, l + 1);
    r = r && variable_declarator_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "[" "]"
  private static boolean variable_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // ["=" variable_initializer]
  private static boolean variable_declarator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarator_2")) return false;
    variable_declarator_2_0(b, l + 1);
    return true;
  }

  // "=" variable_initializer
  private static boolean variable_declarator_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarator_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && variable_initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression | ("{" [variable_initializer {"," variable_initializer} [","]] "}")
  public static boolean variable_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_INITIALIZER, "<variable initializer>");
    r = expression(b, l + 1);
    if (!r) r = variable_initializer_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "{" [variable_initializer {"," variable_initializer} [","]] "}"
  private static boolean variable_initializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && variable_initializer_1_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [variable_initializer {"," variable_initializer} [","]]
  private static boolean variable_initializer_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializer_1_1")) return false;
    variable_initializer_1_1_0(b, l + 1);
    return true;
  }

  // variable_initializer {"," variable_initializer} [","]
  private static boolean variable_initializer_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializer_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_initializer(b, l + 1);
    r = r && variable_initializer_1_1_0_1(b, l + 1);
    r = r && variable_initializer_1_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "," variable_initializer
  private static boolean variable_initializer_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializer_1_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && variable_initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [","]
  private static boolean variable_initializer_1_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializer_1_1_0_2")) return false;
    consumeToken(b, ",");
    return true;
  }

  /* ********************************************************** */
  // "while" "(" expression ")" statement
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHILE, LPAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && statement(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

}
