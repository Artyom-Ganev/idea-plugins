package ru.ganev.plugins.drools;

import javax.swing.*;

import com.intellij.openapi.fileTypes.FileTypeEditorHighlighterProviders;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import ru.ganev.plugins.drools.highlighter.DrlEditorHighlighter;
import ru.ganev.plugins.drools.icons.DrlIcon;

/**
 *
 */
public class DrlFileType extends LanguageFileType {

    public static final DrlFileType DRL_FILE_TYPE = new DrlFileType();
    @NonNls
    private static final String DEFAULT_EXT = "drl";
    @NonNls
    private static final String DEFAULT_CHARSET = "UTF-8";

    private DrlFileType() {
        super(Drools.INSTANCE);
        FileTypeEditorHighlighterProviders.INSTANCE.addExplicitExtension(this,
                (project, fileType, virtualFile, colors) -> new DrlEditorHighlighter(project, virtualFile, colors));
    }

    @NotNull
    @NonNls
    @Override
    public String getName() {
        return DroolsProperties.FILE_TYPE_NAME;
    }

    @NonNls
    @NotNull
    @Override
    public String getDescription() {
        return DroolsProperties.FILE_TYPE_DESCRIPTION;
    }

    @NotNull
    @NonNls
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXT;
    }

    @Override
    public Icon getIcon() {
        return DrlIcon.ICON;
    }

    @Override
    public String getCharset(@NotNull VirtualFile file, @NotNull byte[] content) {
        return DEFAULT_CHARSET;
    }
}