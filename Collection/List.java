import java.util.ArrayList;
import java.util.Iterator; 

public class List {
    public static void main(final String[] args) {

        /*
        * ===  ArrayList ===
        */ 

        // list1 can only store String objects
        final ArrayList<String> list1 = new ArrayList<String>();

        list1.add("John");
        list1.add("Mark");
        list1.add("Steve"); 
        list1.add("Marimar"); 
        list1.add("Pablo"); 
        list1.add("Escobar"); 

        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println("list1: " + list1); // shall prints the list in an ordered way

        // list2 can store any type of object
        final ArrayList list2 = new ArrayList();
        
        list2.add("John"); 
        list2.add(10); 
        list2.add(2.2); 

        Object o2 = list2.get(2); 
        System.out.println(o2);
        System.out.println("list2: " + list2); 

        // Iterating with Iterator interface 
        System.out.println("\n\nIterating with Iterator");
        Iterator<String> itr = list1.iterator(); 
        System.out.println(itr.next());
        System.out.println(itr.next());

        System.out.println("\nIterating all elements");
        Iterator<String> itr2 = list1.iterator(); 
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println("\nUsing Iterator, and remove \"Pablo\"");
        Iterator<String> itr3 = list1.iterator(); 
        while(itr3.hasNext()) {
            String element = itr3.next(); 
            System.out.println(element);
            if(element.equals("Pablo")) {
                itr3.remove();
            }
        }
        System.out.println("After remove \"Pablo\" : " + list1);

        System.out.println("\nAsynchronous operation\n");
        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i).equals("Steve")) {
                list1.remove(i); 
            }
            String element = list1.get(i); 
            System.out.println(element);
        }
        System.out.println("After remove \"Steve\" : " + list1);

        
    }
}