package priorityqueuenonnull;

import org.aspectjml.lang.annotation.siesta.Before;

public class PriorityQueueNonNullHandler {

    @Before("boolean java.util.PriorityQueue.add(..)")
    @Before("boolean java.util.PriorityQueue.offer(..)")
    public static void vioPriorityQueueNonNull(String name, boolean isStatic, Object[] args) {
        Object el = args[1];

        if(el == null) {
            throw new RuntimeException("Vio: priority queue doesn't accept a null element.");
        }
    }
}
