package ru.ganev.intellij.plugins.drools.parser;

import com.intellij.lexer.FlexAdapter;

/**
 *
 */
public class DrlFlexAdapter extends FlexAdapter {

    public DrlFlexAdapter() {
        super(new DrlFlexLexer());
    }
}
