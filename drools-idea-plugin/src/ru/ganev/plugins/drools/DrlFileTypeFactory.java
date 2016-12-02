package ru.ganev.plugins.drools;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class DrlFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(DrlFileType.DRL_FILE_TYPE, DrlFileType.DEFAULT_EXTENSION);
    }
}
