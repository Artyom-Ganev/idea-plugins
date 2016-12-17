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

public class DrlParameterImpl extends ASTWrapperPsiElement implements DrlParameter {

  public DrlParameterImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DrlVisitor visitor) {
    visitor.visitParameter(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DrlVisitor) accept((DrlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DrlSimpleIdentifier getSimpleIdentifier() {
    return findNotNullChildByClass(DrlSimpleIdentifier.class);
  }

  @Override
  @NotNull
  public DrlType getType() {
    return findNotNullChildByClass(DrlType.class);
  }

}
