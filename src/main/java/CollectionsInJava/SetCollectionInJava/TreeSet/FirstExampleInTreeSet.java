package CollectionsInJava.SetCollectionInJava.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class FirstExampleInTreeSet {
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Tree Set In java ");
		Set<StringBuffer> combinedData = new TreeSet<StringBuffer>();
		combinedData.add(new StringBuffer("A"));
		combinedData.add(new StringBuffer("B"));
		combinedData.add(new StringBuffer(1));
		System.out.println("The Tree Set data is ");
		System.out.println(combinedData);
		
		
	}

}
