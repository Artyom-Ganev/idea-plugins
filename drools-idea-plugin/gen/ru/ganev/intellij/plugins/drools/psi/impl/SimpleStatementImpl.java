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

public class SimpleStatementImpl extends ASTWrapperPsiElement implements SimpleStatement {

  public SimpleStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SimpleDoStatement getDoStatement() {
    return findChildByClass(SimpleDoStatement.class);
  }

  @Override
  @Nullable
  public SimpleExpression getExpression() {
    return findChildByClass(SimpleExpression.class);
  }

  @Override
  @Nullable
  public SimpleForStatement getForStatement() {
    return findChildByClass(SimpleForStatement.class);
  }

  @Override
  @Nullable
  public SimpleIdentifier getIdentifier() {
    return findChildByClass(SimpleIdentifier.class);
  }

  @Override
  @Nullable
  public SimpleIfStatement getIfStatement() {
    return findChildByClass(SimpleIfStatement.class);
  }

  @Override
  @Nullable
  public SimpleStatement getStatement() {
    return findChildByClass(SimpleStatement.class);
  }

  @Override
  @Nullable
  public SimpleStatementBlock getStatementBlock() {
    return findChildByClass(SimpleStatementBlock.class);
  }

  @Override
  @Nullable
  public SimpleSwitchStatement getSwitchStatement() {
    return findChildByClass(SimpleSwitchStatement.class);
  }

  @Override
  @Nullable
  public SimpleTryStatement getTryStatement() {
    return findChildByClass(SimpleTryStatement.class);
  }

  @Override
  @Nullable
  public SimpleVariableDeclaration getVariableDeclaration() {
    return findChildByClass(SimpleVariableDeclaration.class);
  }

  @Override
  @Nullable
  public SimpleWhileStatement getWhileStatement() {
    return findChildByClass(SimpleWhileStatement.class);
  }

}
