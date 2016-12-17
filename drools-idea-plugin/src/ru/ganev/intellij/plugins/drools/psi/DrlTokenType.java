package ru.ganev.intellij.plugins.drools.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import ru.ganev.intellij.plugins.drools.Drools;

/**
 * Drools file token type
 */
public class DrlTokenType extends IElementType {

    public DrlTokenType(@NotNull @NonNls String debugName) {
        super(debugName, Drools.INSTANCE);
    }

    @Override
    public String toString() {
        return "DrlTokenType." + super.toString();
    }

}
