package com.javastreams.filehandling;
import java.io.File;

public class FileValidator {

    public static boolean isFileAvailable(String path) {
        File file = new File(path);
        return file.exists() && file.isFile();
    }
}
