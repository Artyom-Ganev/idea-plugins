package ru.ganev.intellij.plugins.drools.highlight;

import com.intellij.ide.highlighter.JavaFileHighlighter;
import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.editor.ex.util.LayerDescriptor;
import com.intellij.openapi.editor.ex.util.LayeredLexerEditorHighlighter;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ganev.intellij.plugins.drools.psi.DrlTypes;

/**
 *
 */
public class DrlEditorHighlighter extends LayeredLexerEditorHighlighter {

    @Nullable
    private final VirtualFile vFile;

    public DrlEditorHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile, @NotNull EditorColorsScheme colors) {
        super(new DrlSyntaxHighlighter(), colors);
        this.vFile = virtualFile;
        this.registerLayer(DrlTypes.STATEMENT, new LayerDescriptor(new JavaFileHighlighter(), ""));
    }

}
