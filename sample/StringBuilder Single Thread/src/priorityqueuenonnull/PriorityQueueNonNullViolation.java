package priorityqueuenonnull;

import  java.util.PriorityQueue;

public class PriorityQueueNonNullViolation{

    public static void main(String[] args) {
        PriorityQueue<Integer> testQueue = new PriorityQueue<Integer>();
        testQueue.add(0);
        testQueue.add(null);
    }


}
