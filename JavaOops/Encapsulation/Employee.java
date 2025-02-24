package JavaOops.Encapsulation;

public class Employee {
    private String Name;

    private int EmpID;

    private int Age;

    public int getAge() {
        return Age;
    }

    public int getEmpID() {
        return EmpID;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public void setName(String name) {
        Name = name;
    }

    public static void main(String[] args) {
        // Employee e=new Employee();
        Employee e = new Employee();

        e.setName("Robert");

        e.setAge(33);

        e.setEmpID(1253);

        System.out.println("Employee's name: " + e.getName());

        System.out.println("Employee's age: " + e.getAge());

        System.out.println("Employee's ID: " + e.getEmpID());

    }

}
