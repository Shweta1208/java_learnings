package others;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSalary {
    private int salary;
    private String name;
    private int age;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<EmployeeSalary> emp = new ArrayList<EmployeeSalary>();
        int sum =0;
        sum = emp.stream()
                .filter(e -> e.getAge() > 25)
                .mapToInt(EmployeeSalary::getSalary)
                .sum();
        System.out.println("Total Salary of employees older than 25: " + sum);
    }
}
