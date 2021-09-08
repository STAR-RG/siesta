package inputstreammarkreset;

import java.io.InputStream;
import org.aspectjml.lang.annotation.siesta.Before;

public class InputStreamMarkResetHandler{

	// TODO: figure out why I cant use these descriptions.
    // @Before("public void java.io.FileInputStream.reset()")
    // @Before("public void java.io.PushbackInputStream.reset()")
    // @Before("public void java.io.ObjectInputStream.reset()")
    // @Before("public void java.io.PipedInputStream.reset()")
    // public static void  vioReset(InputStream is) {
    //     if(!is.markSupported())
    //         throw new RuntimeException("Vio: mark() called on ");
    // }

    @Before("public void java.io.FileInputStream.mark(int)")
    @Before("public void java.io.PushbackInputStream.mark(int)")
    @Before("public void java.io.ObjectInputStream.mark(int)")
    @Before("public void java.io.PipedInputStream.mark(int)")
    public static void vioMark(InputStream is) {
        if(!is.markSupported())
            throw new RuntimeException("Vio: reset() called on ");
    }

}
