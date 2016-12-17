package ru.ganev.intellij.plugins.drools.parser;

import com.intellij.lexer.LookAheadLexer;

/**
 *
 */
public class DrlLexer extends LookAheadLexer {

    public DrlLexer() {
        super(new DrlFlexAdapter());
    }
}
