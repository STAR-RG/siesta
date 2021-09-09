package setitselfaselement;

import java.util.TreeSet;

public class SetItselfAsElementPasses {
    public static void main(String[] args) {
        TreeSet<Integer> blah = new TreeSet<Integer>();
        TreeSet<Integer> blah_2 = new TreeSet<Integer>();

        blah.add(0);
        blah.add(1);
        blah.add(3);
        blah_2.add(4);
        blah_2.add(5);
        blah.addAll(blah_2);
    }
}
