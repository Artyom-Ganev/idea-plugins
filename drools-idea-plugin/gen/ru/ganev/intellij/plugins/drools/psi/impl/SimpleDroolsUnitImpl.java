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

public class SimpleDroolsUnitImpl extends ASTWrapperPsiElement implements SimpleDroolsUnit {

  public SimpleDroolsUnitImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitDroolsUnit(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SimpleGlobalStaement getGlobalStaement() {
    return findNotNullChildByClass(SimpleGlobalStaement.class);
  }

  @Override
  @NotNull
  public SimpleImportStatement getImportStatement() {
    return findNotNullChildByClass(SimpleImportStatement.class);
  }

  @Override
  @Nullable
  public SimplePackageStatement getPackageStatement() {
    return findChildByClass(SimplePackageStatement.class);
  }

  @Override
  @NotNull
  public SimpleRuleStatement getRuleStatement() {
    return findNotNullChildByClass(SimpleRuleStatement.class);
  }

}
