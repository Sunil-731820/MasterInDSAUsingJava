package CollectionsInJava.ListCollectionInJava.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class FirstLinkedListExample {
    public static void main(String[] args) {
        System.out.println("This Is The Example of The Linked List");
        /*
         * 1:
         * LinkedList
         * LinkedList implements the Collection interface. It uses a doubly linked list
         * internally to store the
         * elements. It can store the duplicate elements. It maintains the insertion
         * order and is not
         * synchronized. In LinkedList, the manipulation is fast because no shifting is
         * required.
         * Consider the following example
         */

         LinkedList<String> linkedList = new LinkedList<>();
         linkedList.add("Sunil");
         linkedList.add("Harish");
         linkedList.add("Abhisek");
         linkedList.add("Sumanth");
         linkedList.add("Sid");
         System.out.println("The Linked List is ");
         System.out.println(linkedList);

         //Traversing the Data Using iterator in java

         Iterator itr = linkedList.iterator();
         while(itr.hasNext()){
            System.out.print(itr.next()+" ");
         }


    }
}
