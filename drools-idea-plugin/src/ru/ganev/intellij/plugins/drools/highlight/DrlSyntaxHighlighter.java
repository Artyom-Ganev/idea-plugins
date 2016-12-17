package ru.ganev.intellij.plugins.drools.highlight;

import java.util.HashMap;
import java.util.Map;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import ru.ganev.intellij.plugins.drools.parser.DrlLexer;

/**
 *
 */
public class DrlSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Map<IElementType, TextAttributesKey> map = new HashMap<>();

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new DrlLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return SyntaxHighlighterBase.pack(map.get(tokenType));
    }

}
