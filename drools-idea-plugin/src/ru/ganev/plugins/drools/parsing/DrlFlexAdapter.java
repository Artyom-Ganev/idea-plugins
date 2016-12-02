package ru.ganev.plugins.drools.parsing;

import com.intellij.lexer.FlexAdapter;

/**
 *
 */
public class DrlFlexAdapter extends FlexAdapter {

    public DrlFlexAdapter() {
        super(new DrlFlexLexer());
    }
}
