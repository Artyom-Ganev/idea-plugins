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

public class SimpleExpressionImpl extends ASTWrapperPsiElement implements SimpleExpression {

  public SimpleExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitExpression(this);
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
  public SimpleBitExpression getBitExpression() {
    return findChildByClass(SimpleBitExpression.class);
  }

  @Override
  @Nullable
  public SimpleCastingExpression getCastingExpression() {
    return findChildByClass(SimpleCastingExpression.class);
  }

  @Override
  @Nullable
  public SimpleClassName getClassName() {
    return findChildByClass(SimpleClassName.class);
  }

  @Override
  @Nullable
  public SimpleCreatingExpression getCreatingExpression() {
    return findChildByClass(SimpleCreatingExpression.class);
  }

  @Override
  @Nullable
  public SimpleExpression getExpression() {
    return findChildByClass(SimpleExpression.class);
  }

  @Override
  @Nullable
  public SimpleIdentifier getIdentifier() {
    return findChildByClass(SimpleIdentifier.class);
  }

  @Override
  @Nullable
  public SimpleLiteralExpression getLiteralExpression() {
    return findChildByClass(SimpleLiteralExpression.class);
  }

  @Override
  @Nullable
  public SimpleLogicalExpression getLogicalExpression() {
    return findChildByClass(SimpleLogicalExpression.class);
  }

  @Override
  @Nullable
  public SimpleNumericExpression getNumericExpression() {
    return findChildByClass(SimpleNumericExpression.class);
  }

  @Override
  @Nullable
  public SimpleStringExpression getStringExpression() {
    return findChildByClass(SimpleStringExpression.class);
  }

  @Override
  @Nullable
  public SimpleTestingExpression getTestingExpression() {
    return findChildByClass(SimpleTestingExpression.class);
  }

}
