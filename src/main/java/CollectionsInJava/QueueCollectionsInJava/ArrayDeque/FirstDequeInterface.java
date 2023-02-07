package CollectionsInJava.QueueCollectionsInJava.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class FirstDequeInterface {
    public static void main(String[] args) {
        System.out.println("This Is The EXampel Of The Deque in the Collections");
        /*
         * 1 :
         * Deque Interface
         * Deque interface extends the Queue interface. In Deque, we can remove and add
         * the elements from
         * both the side. Deque stands for a double-ended queue which enables us to
         * perform the operations
         * at both the ends.
         * Deque can be instantiated as:
         * Deque d = new ArrayDeque();
         */

         /*
          * 2 :
          * ArrayDeque
          * ArrayDeque class implements the Deque interface. It facilitates us to use the
          * Deque. Unlike queue,
          * we can add or delete the elements from both the ends.
          * ArrayDeque is faster than ArrayList and Stack and has no capacity
          * restrictions.
          * Consider the following example.
          * 
          */

          Deque<String> deque = new ArrayDeque<>();
          deque.add("Sunil");
          deque.add("Harish");
          deque.add("Sumanth");
          deque.add("Abhisek");
          deque.add("Sid");
          System.out.println("The Deque is ");
          System.out.println(deque);

        //   Traversing The ELmenet using iterator 
        Iterator itr = deque.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+"  ");
        }

        //Traversing Through the for Each Loop
        System.out.println();
        for(String str : deque){
            System.out.println(str);
        }
    }
}
