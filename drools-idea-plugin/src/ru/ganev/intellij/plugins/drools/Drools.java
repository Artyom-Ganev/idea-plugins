package ru.ganev.intellij.plugins.drools;

import com.intellij.lang.Language;

/**
 *
 */
public class Drools extends Language {

    public static final Drools INSTANCE = new Drools();

    protected Drools() {
        super("Drools");
    }
}
