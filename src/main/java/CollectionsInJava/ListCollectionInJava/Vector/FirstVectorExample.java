package CollectionsInJava.ListCollectionInJava.Vector;

import java.util.Iterator;
import java.util.Vector;

public class FirstVectorExample {
    public static void main(String[] args) {
        System.out.println("This Is the first Example Of The Vector In Java");
        /*
         * 1 :
         * Vector
         * Vector uses a dynamic array to store the data elements. It is similar to
         * ArrayList. However, It is
         * synchronized and contains many methods that are not the part of Collection
         * framework.
         * Consider the following example
         */
        Vector<String> vector = new Vector<>();
        vector.add("Sunil");
        vector.add("Harish");
        vector.add("Sumanth");
        vector.add("Sid");
        System.out.println("The Vector is ");
        System.out.print(vector);

        // Displaying using the Iterator In java
        System.out.println("Through Iterator is ");
        Iterator itr = vector.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
