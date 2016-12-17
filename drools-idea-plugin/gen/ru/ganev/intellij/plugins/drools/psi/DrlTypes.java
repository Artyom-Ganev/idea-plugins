// This is a generated file. Not intended for manual editing.
package ru.ganev.intellij.plugins.drools.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ru.ganev.intellij.plugins.drools.psi.impl.*;

public interface DrlTypes {


  IElementType COMMENT = new DrlTokenType("COMMENT");
  IElementType PROPERTY = new DrlTokenType("property");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
