package com.javastreams.bytearraystream;
import java.io.FileInputStream;
import java.io.IOException;

public class ImageComparator {

    public boolean areImagesIdentical(String file1, String file2)
            throws IOException {

        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);

        int b1, b2;
        while ((b1 = fis1.read()) != -1) {
            b2 = fis2.read();
            if (b1 != b2) {
                fis1.close();
                fis2.close();
                return false;
            }
        }

        fis1.close();
        fis2.close();
        return true;
    }
}
