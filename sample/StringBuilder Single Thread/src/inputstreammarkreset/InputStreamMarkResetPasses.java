package inputstreammarkreset;

import java.io.StringBufferInputStream;

public class InputStreamMarkResetPasses {

     public static void main(String[] args) {
        StringBufferInputStream is = new StringBufferInputStream("blah blah");
        is.mark(0);

    }

}
