package inputstreammarkreset;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;

public class InputStreamMarkResetViolation {

	// TODO: figure out why I cant use the classes below.
	public static void main(String[] args) {
		PipedInputStream piStream = new PipedInputStream();
		PushbackInputStream psStream = new PushbackInputStream(piStream);
		// FileInputStream fiStream = new FileInputStream("");
		// ObjectInputStream oiStream = new ObjectInputStream(fiStream);

		try {
			psStream.mark(0);
		} finally {

		}

		// psStream.reset();

		// fiStream.mark(0);
		// fiStream.reset();

		// // oiStream.mark(0);
		// // oiStream.reset();
		try {
			piStream.mark(0);
		} finally {

		}
		// piStream.reset();
	}

}
