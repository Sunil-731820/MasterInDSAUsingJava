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
    }
}
