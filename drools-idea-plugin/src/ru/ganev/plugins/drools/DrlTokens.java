package ru.ganev.plugins.drools;

import com.intellij.psi.tree.IElementType;
import ru.ganev.plugins.drools.lexer.DrlJavaStatementElementType;

/**
 *
 */
public interface DrlTokens {

    IElementType JAVA_STATEMENT = new DrlJavaStatementElementType();
}
