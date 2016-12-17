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

public class SimpleCreatingExpressionImpl extends ASTWrapperPsiElement implements SimpleCreatingExpression {

  public SimpleCreatingExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitCreatingExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleArglist getArglist() {
    return findChildByClass(SimpleArglist.class);
  }

  @Override
  @Nullable
  public SimpleExpression getExpression() {
    return findChildByClass(SimpleExpression.class);
  }

  @Override
  @Nullable
  public SimpleTypeSpecifier getTypeSpecifier() {
    return findChildByClass(SimpleTypeSpecifier.class);
  }

}
