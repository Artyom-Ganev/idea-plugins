package ru.ganev.intellij.plugins.drools.psi;

import javax.swing.*;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import ru.ganev.intellij.plugins.drools.DrlFileType;
import ru.ganev.intellij.plugins.drools.Drools;

/**
 *
 */
public class DrlFile extends PsiFileBase {

    public DrlFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, Drools.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return DrlFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return DrlFileType.FILE_DESCRIPTION;
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
