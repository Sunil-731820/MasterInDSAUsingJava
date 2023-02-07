package CollectionsInJava.ListCollectionInJava.Stack;

import java.util.Iterator;
import java.util.Stack;

public class FirstStackExample {
    public static void main(String[] args) {
        System.out.println("This Is The First EXample Of The Stack ");

        /*
         * 1 :
         * Stack
         * The stack is the subclass of Vector. It implements the last-in-first-out data
         * structure, i.e., Stack. The
         * stack contains all of the methods of Vector class and also provides its
         * methods like boolean push(),
         * boolean peek(), boolean push(object o), which defines its properties.
         * Consider the following example.
         */

         Stack<String> stack = new Stack<>();
         stack.add("Sunil");
         stack.add("Harish");
         stack.add("Sumanth");
         stack.add("Abhisek");
         System.out.println("The Stack is ");
         System.out.println(stack);

         // traversing Through the Iterator
         Iterator itr = stack.iterator();
         while(itr.hasNext()){
            System.out.print(itr.next()+ "  ");
         }

         // 
         
    }
}
