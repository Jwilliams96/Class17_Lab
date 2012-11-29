package Lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import root.Employee;

/**
 *
 * @author Jonathon
 */
public class Startup {

    public static void main(String[] args) {
        Map thisMap = new HashMap();
        Employee employee1 = new Employee("Williams", "Jonathon", "641-12-6165");
        thisMap.put(employee1.getSsn(), employee1);
        Employee employee2 = new Employee("Doe", "Jane", "453-41-2572");
        thisMap.put(employee2.getSsn(), employee2);
        Employee employee3 = new Employee("Thoere", "Josh", "744-52-4377");
        thisMap.put(employee3.getSsn(), employee3);
        Employee employee4 = new Employee("Brimley", "Wilford", "744-52-4377");
        thisMap.put(employee4.getSsn(), employee4);
        Set keys = thisMap.keySet();
        
        for (int i = 0; i < keys.size(); i++) {
            
            System.out.println(thisMap.get(keys.toArray()[i]));
        }
    }
}
