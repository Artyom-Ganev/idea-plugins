package ru.ganev.plugins.drools.highlighter;

import java.util.HashMap;
import java.util.Map;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import ru.ganev.plugins.drools.lexer.DrlLexer;

/**
 *
 */
public class DrlSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Map<IElementType, TextAttributesKey> map = new HashMap<>();

    @NotNull
    public Lexer getHighlightingLexer() {
        return new DrlLexer();
    }

    @NotNull
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return SyntaxHighlighterBase.pack(map.get(tokenType));
    }

}
