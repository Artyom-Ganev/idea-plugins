// This is a generated file. Not intended for manual editing.
package ru.ganev.intellij.plugins.drools.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DrlDroolsFile extends PsiElement {

  @NotNull
  DrlFunctionDeclaration getFunctionDeclaration();

  @NotNull
  DrlGlobalStatement getGlobalStatement();

  @NotNull
  DrlImportStatement getImportStatement();

  @Nullable
  DrlPackageStatement getPackageStatement();

  @NotNull
  DrlRuleStatement getRuleStatement();

}
