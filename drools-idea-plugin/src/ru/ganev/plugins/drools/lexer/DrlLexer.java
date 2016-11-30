package ru.ganev.plugins.drools.lexer;

import com.intellij.lexer.LookAheadLexer;

/**
 *
 */
public class DrlLexer extends LookAheadLexer {

    public DrlLexer() {
        super(new DrlFlexAdapter());
    }
}
