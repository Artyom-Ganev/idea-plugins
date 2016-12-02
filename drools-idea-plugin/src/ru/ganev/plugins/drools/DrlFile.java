package ru.ganev.plugins.drools;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileResolveScopeProvider;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiImportHolder;
import com.intellij.psi.search.GlobalSearchScope;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class DrlFile extends PsiFileBase implements PsiImportHolder, FileResolveScopeProvider {

    public DrlFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, Drools.INSTANCE);
    }

    @NotNull
    @Override
    public GlobalSearchScope getFileResolveScope() {
        return null;
    }

    @Override
    public boolean ignoreReferencedElementAccessibility() {
        return false;
    }

    @Override
    public boolean importClass(PsiClass aClass) {
        return false;
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return null;
    }
}
