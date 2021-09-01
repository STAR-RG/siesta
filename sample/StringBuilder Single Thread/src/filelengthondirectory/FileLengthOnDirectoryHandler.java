package filelengthondirectory;

import java.io.File;
import org.aspectjml.lang.annotation.siesta.Before;

public class FileLengthOnDirectoryHandler {

    // @Before("* java.io.File.length()")
    @Before("java.io.File.length()")
    public static void vioOnCall_length_LengthOnDirectory(File file) {
        if(file.isDirectory())
            throw new RuntimeException("Vio: File length on dir.");

    }
}
