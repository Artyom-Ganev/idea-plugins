package ru.ganev.intellij.plugins.drools;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import ru.ganev.intellij.plugins.drools.psi.DrlElementType;
import ru.ganev.intellij.plugins.drools.psi.DrlJavaStatementElementType;

/**
 *
 */
public interface DrlTokenTypes {

    IElementType JAVA_STATEMENT = new DrlJavaStatementElementType();
    IFileElementType DROOLS_FILE = new IFileElementType("DRL_FILE", Drools.INSTANCE);
    IElementType WHITE_SPACE = TokenType.WHITE_SPACE;
    IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;
    IElementType END_OF_LINE_COMMENT = new DrlElementType("END_OF_LINE_COMMENT");
    IElementType KEY_CHARACTERS = new DrlElementType("KEY_CHARACTERS");
    IElementType VALUE_CHARACTERS = new DrlElementType("VALUE_CHARACTERS");
    IElementType KEY_VALUE_SEPARATOR = new DrlElementType("KEY_VALUE_SEPARATOR");

    TokenSet COMMENTS = TokenSet.create(END_OF_LINE_COMMENT);
    TokenSet WHITESPACES = TokenSet.create(WHITE_SPACE);
}
