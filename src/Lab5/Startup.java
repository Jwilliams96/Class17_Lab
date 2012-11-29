package Lab5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import root.Employee;

/**
 *
 * @author Jonathon
 */
public class Startup {

    public static void main(String[] args) {
        Set thisSet = new TreeSet();
        thisSet.add(new Employee("Williams", "Jonathon", "641-12-6165"));
        thisSet.add(new Employee("Doe", "Jane", "453-41-2572"));
        thisSet.add(new Employee("Thoere", "Josh", "744-52-4377"));
        thisSet.add(new Employee("Brimley", "Wilford", "744-52-4377"));

        Iterator nextSet = thisSet.iterator();
       
        while (nextSet.hasNext()){
            
            System.out.println(nextSet.next());
        }
    }
}
