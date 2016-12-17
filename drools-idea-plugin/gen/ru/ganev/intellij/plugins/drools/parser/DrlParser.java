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
    r = parse_root_(t, b, 0);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return drlFile(b, l + 1);
  }

  /* ********************************************************** */
  // (property|COMMENT)*
  static boolean drlFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drlFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!drlFile_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "drlFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // property|COMMENT
  private static boolean drlFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drlFile_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROPERTY);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

}
