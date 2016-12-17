package ru.ganev.intellij.plugins.drools.parser;

import java.io.IOException;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

/**
 *
 */
public class DrlFlexLexer implements FlexLexer {

    @Override
    public void yybegin(int i) {
    }

    @Override
    public int yystate() {
        return 0;
    }

    @Override
    public int getTokenStart() {
        return 0;
    }

    @Override
    public int getTokenEnd() {
        return 0;
    }

    @Override
    public IElementType advance() throws IOException {
        return null;
    }

    @Override
    public void reset(CharSequence charSequence, int i, int i1, int i2) {
    }
}
