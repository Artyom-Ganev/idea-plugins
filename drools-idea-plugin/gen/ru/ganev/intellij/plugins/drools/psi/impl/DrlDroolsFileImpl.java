// This is a generated file. Not intended for manual editing.
package ru.ganev.intellij.plugins.drools.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ru.ganev.intellij.plugins.drools.psi.DrlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import ru.ganev.intellij.plugins.drools.psi.*;

public class DrlDroolsFileImpl extends ASTWrapperPsiElement implements DrlDroolsFile {

  public DrlDroolsFileImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DrlVisitor visitor) {
    visitor.visitDroolsFile(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DrlVisitor) accept((DrlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DrlFunctionDeclaration getFunctionDeclaration() {
    return findNotNullChildByClass(DrlFunctionDeclaration.class);
  }

  @Override
  @NotNull
  public DrlGlobalStatement getGlobalStatement() {
    return findNotNullChildByClass(DrlGlobalStatement.class);
  }

  @Override
  @NotNull
  public DrlImportStatement getImportStatement() {
    return findNotNullChildByClass(DrlImportStatement.class);
  }

  @Override
  @Nullable
  public DrlPackageStatement getPackageStatement() {
    return findChildByClass(DrlPackageStatement.class);
  }

  @Override
  @NotNull
  public DrlRuleStatement getRuleStatement() {
    return findNotNullChildByClass(DrlRuleStatement.class);
  }

}
