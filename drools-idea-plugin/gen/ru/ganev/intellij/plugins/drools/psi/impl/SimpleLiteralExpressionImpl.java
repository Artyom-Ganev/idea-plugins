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

public class SimpleLiteralExpressionImpl extends ASTWrapperPsiElement implements SimpleLiteralExpression {

  public SimpleLiteralExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitLiteralExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleCharacter getCharacter() {
    return findChildByClass(SimpleCharacter.class);
  }

  @Override
  @Nullable
  public SimpleFloatLiteral getFloatLiteral() {
    return findChildByClass(SimpleFloatLiteral.class);
  }

  @Override
  @Nullable
  public SimpleIntegerLiteral getIntegerLiteral() {
    return findChildByClass(SimpleIntegerLiteral.class);
  }

  @Override
  @Nullable
  public SimpleString getString() {
    return findChildByClass(SimpleString.class);
  }

}
