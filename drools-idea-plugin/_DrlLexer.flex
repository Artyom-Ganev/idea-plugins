package ru.ganev.intellij.plugins.drools.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static ru.ganev.intellij.plugins.drools.psi.DrlTypes.*;

%%

%{
  public _DrlLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _DrlLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+


%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }



}

[^] { return BAD_CHARACTER; }
