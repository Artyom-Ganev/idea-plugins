package ru.ganev.plugins.drools.lexer;

import com.intellij.lexer.FlexAdapter;

/**
 *
 */
public class DrlFlexAdapter extends FlexAdapter {

    public DrlFlexAdapter() {
        super(new DrlFlexLexer());
    }
}
