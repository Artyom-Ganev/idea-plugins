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

public class SimpleFunctionDeclarationImpl extends ASTWrapperPsiElement implements SimpleFunctionDeclaration {

  public SimpleFunctionDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitFunctionDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SimpleIdentifier getIdentifier() {
    return findNotNullChildByClass(SimpleIdentifier.class);
  }

  @Override
  @Nullable
  public SimpleParameterList getParameterList() {
    return findChildByClass(SimpleParameterList.class);
  }

  @Override
  @NotNull
  public SimpleStatementBlock getStatementBlock() {
    return findNotNullChildByClass(SimpleStatementBlock.class);
  }

  @Override
  @Nullable
  public SimpleType getType() {
    return findChildByClass(SimpleType.class);
  }

}
