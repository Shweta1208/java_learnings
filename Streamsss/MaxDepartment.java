package Streamsss;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxDepartment {
    public static class Employee{
        public int id;
        public String name;
        public int salary;
        public String department;
        public Employee(int id, String name, int salary, String department) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.department = department;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 50000, "HR"));
        employees.add(new Employee(2, "Bob", 60000, "IT"));
        employees.add(new Employee(3, "Charlie", 55000, "HR"));
        employees.add(new Employee(4, "David", 70000, "IT"));
        employees.add(new Employee(5, "John", 80000, "IT"));
        employees.add(new Employee(6, "Robert", 90000, "IT"));
        employees.add(new Employee(7, "Sally", 90000, "IT"));
        employees.add(new Employee(8, "Jack", 90000, "HR"));


        // Get Employee Details, with sorted Employee name
//        List<Employee> sortedNames = employees.stream().
//                sorted(Comparator.comparing(x->x.name))
//                .collect(Collectors.toList());
        System.out.println("Employee Details with sorted Employee name :");
        employees.stream()
                .sorted(Comparator.comparing(x->x.name))
                .forEach(Employee -> System.out.println(Employee.toString()));

        //Employeee names
        System.out.println("Employee Names only :");
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

        // Get Employee Details, with sorted Employee name,salary, department
        System.out.println("Employee Details with sorted Employee name,salary, department :");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getSalary)
                        .thenComparing(Employee::getDepartment))
                .forEach(Employee -> System.out.println(Employee.toString()));


        // Get Max salary
        System.out.println("Employee Max Salary :");
        employees.stream()
                        .mapToInt(Employee::getSalary)
                            .max()
                                .ifPresent(System.out::println);



        // Get Sum of salary as per department, find the department with highhest salary
        System.out.println("Department with highest salary :");
        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summingInt(Employee::getSalary)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);

    }
}
