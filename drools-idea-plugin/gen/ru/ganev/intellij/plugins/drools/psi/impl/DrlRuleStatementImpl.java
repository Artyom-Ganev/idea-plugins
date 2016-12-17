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

public class DrlRuleStatementImpl extends ASTWrapperPsiElement implements DrlRuleStatement {

  public DrlRuleStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DrlVisitor visitor) {
    visitor.visitRuleStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DrlVisitor) accept((DrlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DrlSalienceStatement getSalienceStatement() {
    return findNotNullChildByClass(DrlSalienceStatement.class);
  }

  @Override
  @NotNull
  public DrlSimpleIdentifier getSimpleIdentifier() {
    return findNotNullChildByClass(DrlSimpleIdentifier.class);
  }

}
