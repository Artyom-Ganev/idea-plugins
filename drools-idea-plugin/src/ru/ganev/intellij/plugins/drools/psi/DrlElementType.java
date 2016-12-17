package ru.ganev.intellij.plugins.drools.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import ru.ganev.intellij.plugins.drools.Drools;

/**
 *
 */
public class DrlElementType extends IElementType {

    public DrlElementType(@NotNull @NonNls String debugName) {
        super(debugName, Drools.INSTANCE);
    }
}
