package ru.ganev.intellij.plugins.drools.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import ru.ganev.intellij.plugins.drools.DrlFile;
import ru.ganev.intellij.plugins.drools.DrlTokenTypes;

/**
 *
 */
public class DrlParserDefinition implements ParserDefinition {

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new DrlLexer();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new DrlParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return DrlTokenTypes.DROOLS_FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return null;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return null;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return null;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return null;
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new DrlFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return null;
    }
}