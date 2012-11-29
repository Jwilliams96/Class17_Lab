package Lab2;

import java.util.HashSet;
import java.util.Set;
import root.Employee;

/**
 *
 * @author Jonathon
 */
public class Startup {
    public static void main(String[] args) {
        Set thisSet = new HashSet();
        thisSet.add(new Employee("Williams", "Jonathon", "641-12-6165"));
        thisSet.add(new Employee("Doe", "Jane", "453-41-2572"));
        thisSet.add(new Employee("Thoere", "Josh", "744-52-4377"));
        thisSet.add(new Employee("Brimley", "Wilford", "744-52-4377"));
        for (int i = 0; i < thisSet.size(); i++) {
            System.out.println(thisSet.toArray()[i]);
        }
    }
}
