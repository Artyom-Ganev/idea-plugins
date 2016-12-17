// This is a generated file. Not intended for manual editing.
package ru.ganev.intellij.plugins.drools.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SimpleVariableDeclaration extends PsiElement {

  @NotNull
  SimpleModifier getModifier();

  @NotNull
  SimpleType getType();

  @NotNull
  List<SimpleVariableDeclarator> getVariableDeclaratorList();

}
