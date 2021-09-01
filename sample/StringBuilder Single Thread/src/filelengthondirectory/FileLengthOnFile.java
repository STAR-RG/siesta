package filelengthondirectory;

import java.io.File;


public class FileLengthOnFile {

    public static void main(String[] args) {
        File testFile = new File("/pkglist.txt");
        testFile.length();
    }
}
