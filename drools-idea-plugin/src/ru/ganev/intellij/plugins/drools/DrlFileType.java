package ru.ganev.intellij.plugins.drools;

import javax.swing.*;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.vfs.CharsetToolkit;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

/**
 * Kind of file types capable to provide {@link Drools} language.
 */
public class DrlFileType extends LanguageFileType {

    public static final DrlFileType INSTANCE = new DrlFileType();

    private DrlFileType() {
        super(Drools.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return Drools.NAME;
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Drools file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "drl";
    }

    @Override
    public Icon getIcon() {
        return DrlIcon.DRL_ICON;
    }

    @Override
    public String getCharset(@NotNull VirtualFile file, @NotNull byte[] bytes) {
        return CharsetToolkit.UTF8;
    }
}
