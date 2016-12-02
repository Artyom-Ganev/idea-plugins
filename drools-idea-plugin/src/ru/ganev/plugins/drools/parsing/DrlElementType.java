package ru.ganev.plugins.drools.parsing;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import ru.ganev.plugins.drools.Drools;

/**
 *
 */
public class DrlElementType extends IElementType {

    public DrlElementType(@NotNull @NonNls String debugName) {
        super(debugName, Drools.INSTANCE);
    }
}
