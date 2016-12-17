package ru.ganev.intellij.plugins.drools.lexer;

import com.intellij.lexer.FlexAdapter;
import ru.ganev.intellij.plugins.drools.parser._DrlLexer;

/**
 *
 */
public class DrlLexerAdapter extends FlexAdapter {

    public DrlLexerAdapter() {
        super(new _DrlLexer(null));
    }
}
