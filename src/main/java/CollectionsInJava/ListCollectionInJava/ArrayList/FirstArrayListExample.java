package CollectionsInJava.ListCollectionInJava.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class FirstArrayListExample {
    public static void main(String[] args) {
        System.out.println("This is The First Example Of The ArrayList in java Collections");
        ArrayList<Integer> arraylist = new ArrayList<>();
        for(int i=0;i<10;i++){
            arraylist.add(i);
        }
        //Displaying the Elelement using Iterator in Collections 
        Iterator itr = arraylist.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ->");
        }
        // Dipalying the Data Using for Loop
        System.out.println("Displaying the Data Using tyhe For Loop In java "); 
        for(int i=0;i<arraylist.size();i++){
            System.out.print(i+" ");
        }

        /* 1: 
         * What is a framework in Java
         * It provides readymade architecture.
         * It represents a set of classes and interfaces.
         * It is optiona
         */

         /*
          * 2:
          * What is Collection framework
          * The Collection framework represents a unified architecture for storing and
          * manipulating a group of
          * objects. It has:
          * 1. Interfaces and its implementations, i.e., classes
          * 
          */
          /*
           * 3:
           * 1 public boolean add(E e) It is used to insert an element in this collection.
           * 2 public boolean addAll(Collection<?
           * extends E> c)
           * It is used to insert the specified collection elements
           * in the invoking collection.
           * 3 public boolean remove(Object
           * element)
           * It is used to delete an element from the collection.
           * 4 public boolean
           * removeAll(Collection<?> c)
           * It is used to delete all the elements of the specified
           * collection from the invoking collection.
           * 
           * 5 default boolean
           * removeIf(Predicate<? super E>
           * filter)
           * It is used to delete all the elements of the collection
           * that satisfy the specified predicate.
           * 6 public boolean
           * retainAll(Collection<?> c)
           * It is used to delete all the elements of invoking
           * collection except the specified collection.
           * 7 public int size() It returns the total number of elements in the
           * collection.
           * 8 public void clear() It removes the total number of elements from the
           * collection.
           * 9 public boolean contains(Object
           * element)
           * It is used to search an element.
           * 10 public boolean
           * containsAll(Collection<?> c)
           * It is used to search the specified collection in the
           * collection.
           * 11 public Iterator iterator() It returns an iterator.
           * 12 public Object[] toArray() It converts collection into array.
           * 13 public <T> T[] toArray(T[] a) It converts collection into array. Here, the
           * runtime
           * type of the returned array is that of the specified
           * array.
           * 14 public boolean isEmpty() It checks if collection is empty.
           * 15 default Stream<E> parallelStream() It returns a possibly parallel Stream
           * with the
           * collection as its source.
           * 16 default Stream<E> stream() It returns a sequential Stream with the
           * collection as
           * its source.
           * 17 default Spliterator<E> spliterator() It generates a Spliterator over the
           * specified
           * elements in the collection.
           * 18 public boolean equals(Object
           * element)
           * It matches two collections.
           * 19 public int hashCode() It returns the hash code number of the collection.
           * 
           */

           /*
            * 4 :
            * List Interface
            * List interface is the child interface of Collection interface. It inhibits a
            * list type data structure in which
            * we can store the ordered collection of objects. It can have duplicate values.
            * List interface is implemented by the classes ArrayList, LinkedList, Vector,
            * and Stack.
            * To instantiate the List interface, we must use :
            */

            /*
             * 5 : This Is The Most important Things In the Colllections Of The Java 
             * List <data-type> list1= new ArrayList();
             * List <data-type> list2 = new LinkedList();
             * List <data-type> list3 = new Vector();
             * List <data-type> list4 = new Stack();
             */

             /*
              * 6 : Implementation Of That Interfaces :
              * List <data-type> list1= new ArrayList();
              */

            java.util.List<Integer> listOfNumber = new ArrayList<>();
            listOfNumber.add(12);
            listOfNumber.add(100);
            listOfNumber.add(2000);
            System.out.println("The New Array List using List interface In Java");
            //Displaying as The Whole List Not One By One
            System.out.println(listOfNumber);

            //Displaying the List Using Iterator in java Collections

            Iterator itr1 = listOfNumber.iterator();
            while(itr1.hasNext()){
                System.out.print(itr1.next()+"  ");
            }

            /*
             * 7 :
             * The ArrayList class implements the List interface. It uses a dynamic array to
             * store the duplicate
             * element of different data types. The ArrayList class maintains the insertion
             * order and is nonsynchronized. The elements stored in the ArrayList class can
             * be randomly accessed. Consider the
             * following example.
             * 
             */

             // The Use Of The ArrayList Implementation CLass

             ArrayList<String> arrList = new ArrayList<>();
            arrList.add("Sunil");
            arrList.add("Harish");
            arrList.add("Sumanth");
            arrList.add("Abhisek");
            arrList.add("Sid");
            System.out.println("The Array List is ");
            System.out.println(arrList);

            // Traversing Through the Iterator 
            Iterator itr2 = arrList.iterator();
            while(itr2.hasNext()){
                System.out.print(itr2.next()+"  ");
            }

            


    }
}
