package CollectionsInJava.QueueCollectionsInJava.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class FirstPriorityExample {
    public static void main(String[] args) {
        System.out.println("This IS The EXample Of The Priority Queue");
        
        /*
         * 1 :
         * Queue Interface
         * Queue interface maintains the first-in-first-out order. It can be defined as
         * an ordered list that is used
         * to hold the elements which are about to be processed. There are various
         * classes like PriorityQueue,
         * Deque, and ArrayDeque which implements the Queue interface.
         * Queue interface can be instantiated as:
         * 
         */

         /*
          * 2:
          * Queue<String> q1 = new PriorityQueue();
          * Queue<String> q2 = new ArrayDeque();
          */

          /*
           * 3:
           * The PriorityQueue class implements the Queue interface. It holds the elements
           * or objects which are
           * to be processed by their priorities. PriorityQueue doesn't allow null values
           * to be stored in the queue.
           * Consider the following example.
           */

           PriorityQueue<String> pQueue = new PriorityQueue<>();
           pQueue.add("Sunil");
           pQueue.add("Harish");
           pQueue.add("Sumanth");
           pQueue.add("Abhisek");
           pQueue.add("Sid");
           System.out.println("The Queue is");
           System.out.println(pQueue);

           // Displaying using For Loop
           for(int i=0;i<pQueue.size();i++){
            System.out.print(i+"  ");
           }

           // Traversing The PQueue Using Iterator
           Iterator itr = pQueue.iterator();
           System.out.println();
           while(itr.hasNext()){
            System.out.print(itr.next()+"   ");
           }
    }
}
