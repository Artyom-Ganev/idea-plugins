package ru.ganev.plugins.drools.lexer;

import com.intellij.psi.tree.ILazyParseableElementType;
import ru.ganev.plugins.drools.Drools;

/**
 *
 */
public class DrlJavaStatementElementType extends ILazyParseableElementType {

    private static final String DEBUG_NAME = "JAVA_STATEMENT";

    public DrlJavaStatementElementType() {
        super(DEBUG_NAME, Drools.INSTANCE);
    }

}
