// This is a generated file. Not intended for manual editing.
package ru.ganev.intellij.plugins.drools.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SimpleExpression extends PsiElement {

  @Nullable
  SimpleArglist getArglist();

  @Nullable
  SimpleBitExpression getBitExpression();

  @Nullable
  SimpleCastingExpression getCastingExpression();

  @Nullable
  SimpleClassName getClassName();

  @Nullable
  SimpleCreatingExpression getCreatingExpression();

  @Nullable
  SimpleExpression getExpression();

  @Nullable
  SimpleIdentifier getIdentifier();

  @Nullable
  SimpleLiteralExpression getLiteralExpression();

  @Nullable
  SimpleLogicalExpression getLogicalExpression();

  @Nullable
  SimpleNumericExpression getNumericExpression();

  @Nullable
  SimpleStringExpression getStringExpression();

  @Nullable
  SimpleTestingExpression getTestingExpression();

}
