package Lab4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import root.Employee;

/**
 *
 * @author Jonathon
 */
public class Startup {

    public static void main(String[] args) {
        Map thisMap = new TreeMap();
        Employee employee1 = new Employee("Williams", "Jonathon", "641-12-6165");
        thisMap.put(1, employee1);
        Employee employee2 = new Employee("Doe", "Jane", "453-41-2572");
        thisMap.put(2, employee2);
        Employee employee3 = new Employee("Thoere", "Josh", "744-52-4377");
        thisMap.put(3, employee3);
        Employee employee4 = new Employee("Brimley", "Wilford", "744-52-4377");
        thisMap.put(4, employee4);
        List thisList = new ArrayList(thisMap.values());
        Collections.sort(thisList);
        
        for (int i = 0; i < thisList.size(); i++) {
            
            System.out.println(thisList.get(i));
        }
    }
}
