package setitselfaselement;
import java.util.TreeSet;

public class SetItselfAsElementViolation{
    public static void main(String[] args) {
        TreeSet<Object> blah = new TreeSet<Object>();
        TreeSet<Object> blah_2 = new TreeSet<Object>();

        blah.add(0);
        blah.add(1);
        blah.add(3);
        blah_2.add(4);
        blah_2.add(5);
        blah.add(blah);
    }
}
