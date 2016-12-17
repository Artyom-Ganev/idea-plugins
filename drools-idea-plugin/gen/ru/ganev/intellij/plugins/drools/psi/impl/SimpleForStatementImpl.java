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

public class SimpleForStatementImpl extends ASTWrapperPsiElement implements SimpleForStatement {

  public SimpleForStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitForStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SimpleExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleExpression.class);
  }

  @Override
  @NotNull
  public SimpleStatement getStatement() {
    return findNotNullChildByClass(SimpleStatement.class);
  }

  @Override
  @Nullable
  public SimpleVariableDeclaration getVariableDeclaration() {
    return findChildByClass(SimpleVariableDeclaration.class);
  }

}
