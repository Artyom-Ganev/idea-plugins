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

public class SimpleVariableInitializerImpl extends ASTWrapperPsiElement implements SimpleVariableInitializer {

  public SimpleVariableInitializerImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitVariableInitializer(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleExpression getExpression() {
    return findChildByClass(SimpleExpression.class);
  }

  @Override
  @NotNull
  public List<SimpleVariableInitializer> getVariableInitializerList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleVariableInitializer.class);
  }

}
