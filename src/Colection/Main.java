package Colection;

import java.util.HashSet;
import java.util.Set;


// Metoda HashSet
public class Main {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();
        Employee employee1 = new Employee("Name",1,1,"Dev");
        Employee employee2 = new Employee("Name",1,1,"Prof");
        Employee employee3 = employee1;
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        for(Employee employee : employeeSet){
            System.out.println(employee);
        }
        if(employee1.equals(employee3)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
