package ru.ganev.plugins.drools;

import javax.swing.Icon;

import com.intellij.openapi.fileTypes.FileTypeEditorHighlighterProviders;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import ru.ganev.plugins.drools.highlight.DrlEditorHighlighter;

/**
 *
 */
public class DrlFileType extends LanguageFileType {

    public static final DrlFileType DRL_FILE_TYPE = new DrlFileType();
    @NonNls
    public static final String DEFAULT_EXTENSION = "drl";
    @NonNls
    public static final String DOT_DEFAULT_EXTENSION = "." + DEFAULT_EXTENSION;
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
        return DrlBundle.message("drools.file.type.name");
    }

    @NonNls
    @NotNull
    @Override
    public String getDescription() {
        return DrlBundle.message("drools.file.type.description");
    }

    @NotNull
    @NonNls
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
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
