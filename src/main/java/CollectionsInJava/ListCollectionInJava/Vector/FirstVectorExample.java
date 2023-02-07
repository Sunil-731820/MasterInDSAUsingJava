package CollectionsInJava.ListCollectionInJava.Vector;

import java.util.Vector;

public class FirstVectorExample {
    public static void main(String[] args) {
        System.out.println("This Is the first Example Of The Vector In Java");
        Vector<String> vector = new Vector<>();
        vector.add("Sunil");
        vector.add("Harish");
        vector.add("Sumanth");
        vector.add("Sid");
        System.out.println("The Vector is ");
        System.out.print(vector);
    }
}
