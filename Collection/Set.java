import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class Set {
    public static void main(String[] args) {
        /*
        * == HashSet == 
        */ 
        HashSet<String> hs = new HashSet<String>(); 

        // here data is not added in indexing approach 
        // we got hashCodes for elements which are being added
        hs.add("John"); 
        hs.add("Jennie"); 
        hs.add("John"); 
        hs.add("Jim"); 
        hs.add("Jack"); 
        hs.add("John"); 
        hs.add("Joe"); 

        // 1. Data is unique, no redundancy
        // 2. Data is unordered due to hashing
        System.out.println("set is: " + hs);

        // using iterator 
        Iterator<String> itr = hs.iterator(); 
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        /*
        * == TreeSet == 
        */ 
        TreeSet<String> ts = new TreeSet<String>(); 

        // Data is unordered but is alphabetically sorted
        ts.add("John"); 
        ts.add("Jennie"); 
        ts.add("John"); 
        ts.add("Jim"); 
        ts.add("Jack"); 
        ts.add("John"); 
        ts.add("Joe"); 

        // 1. Data is unique, no redundancy
        // 2. Data is unordered due to hashing
        System.out.println("set is: " + ts);

        // using iterator 
        Iterator<String> itr2 = ts.iterator(); 
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        String compared = "Jim"; 
        System.out.println("Higher than " + compared + ": " + ts.higher(compared));
        System.out.println("Lower than " + compared + ": " + ts.lower(compared));

        System.out.println("\n\nUsing custom comparator");
        TreeSet<String> ts2 = new TreeSet<>(new TreeComparator1()); 
        ts2.add("G"); 
        ts2.add("E"); 
        ts2.add("E"); 
        ts2.add("K"); 
        ts2.add("S"); 
        ts2.add("4"); 
        System.out.println("Set before using the comparator: "+ ts2); 
        System.out.println("The elements sorted in descending order:"); 
        for (String element : ts2) 
            System.out.print(element + " ");
    }

    static class TreeComparator1 implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1); // sort descending order 
        }
    }
} 