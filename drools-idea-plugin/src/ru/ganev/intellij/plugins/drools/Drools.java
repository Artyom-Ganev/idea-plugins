package ru.ganev.intellij.plugins.drools;

import com.intellij.lang.Language;

/**
 * Drools programming language
 */
public class Drools extends Language {

    public static final String NAME = "Drools";

    public static final Drools INSTANCE = new Drools();

    protected Drools() {
        super(NAME);
    }
}
