// This is a generated file. Not intended for manual editing.
package ru.ganev.intellij.plugins.drools.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SimpleFloatLiteral extends PsiElement {

  @NotNull
  List<SimpleDecimalDigits> getDecimalDigitsList();

  @Nullable
  SimpleExponentPart getExponentPart();

  @Nullable
  SimpleFloatTypeSuffix getFloatTypeSuffix();

}
