package javaStreamAPI;

import java.util.Arrays;
import java.util.List;


    import java.util.*;

    class Employee {
        int id;
        String name;
        int salary;

        Employee(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }
    class StreamObject{

        public static void main(String[] args) {

            List<Employee> empList = Arrays.asList(
                    new Employee(1, "Amit", 30000),
                    new Employee(2, "Vishal", 50000),
                    new Employee(3, "Rahul", 25000),
                    new Employee(4,"kunj",100000)
            );

            empList.stream()
                    .filter(e -> e.salary > 30000)
                    .forEach(e -> System.out.println(e.name));
        }
    }


