// This is a generated file. Not intended for manual editing.
package ru.ganev.intellij.plugins.drools.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SimpleStatement extends PsiElement {

  @Nullable
  SimpleDoStatement getDoStatement();

  @Nullable
  SimpleExpression getExpression();

  @Nullable
  SimpleForStatement getForStatement();

  @Nullable
  SimpleIdentifier getIdentifier();

  @Nullable
  SimpleIfStatement getIfStatement();

  @Nullable
  SimpleStatement getStatement();

  @Nullable
  SimpleStatementBlock getStatementBlock();

  @Nullable
  SimpleSwitchStatement getSwitchStatement();

  @Nullable
  SimpleTryStatement getTryStatement();

  @Nullable
  SimpleVariableDeclaration getVariableDeclaration();

  @Nullable
  SimpleWhileStatement getWhileStatement();

}
