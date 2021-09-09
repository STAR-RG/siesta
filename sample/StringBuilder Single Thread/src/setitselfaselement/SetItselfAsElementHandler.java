package setitselfaselement;

import java.util.Set;
import org.aspectjml.lang.annotation.siesta.Before;

public class SetItselfAsElementHandler{

    @Before("* java.util.Set.add(..)")
    public static void vioSetAddItselfAsElement(String name, boolean isStatic, Object[] args) {
        Object set = args[0];
        Object el = args[1];

        if(set == el)
            throw new RuntimeException("Vio: set cannot add itself as an element.");
    }

    @Before("* java.util.Set.addAll(..)")
    public static void vioSetAddAllItselfAsElement(String name, boolean isStatic, Object[] args) {
        Object set = args[0];

        for (Object el : (Set) set) {
            if(set == el)
                throw new RuntimeException("Vio: set cannot add itself as an element.");
        }
    }


}
