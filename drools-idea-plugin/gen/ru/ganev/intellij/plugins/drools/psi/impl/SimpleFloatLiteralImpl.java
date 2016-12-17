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

public class SimpleFloatLiteralImpl extends ASTWrapperPsiElement implements SimpleFloatLiteral {

  public SimpleFloatLiteralImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitFloatLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SimpleDecimalDigits> getDecimalDigitsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SimpleDecimalDigits.class);
  }

  @Override
  @Nullable
  public SimpleExponentPart getExponentPart() {
    return findChildByClass(SimpleExponentPart.class);
  }

  @Override
  @Nullable
  public SimpleFloatTypeSuffix getFloatTypeSuffix() {
    return findChildByClass(SimpleFloatTypeSuffix.class);
  }

}