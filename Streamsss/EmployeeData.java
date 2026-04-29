package Streamsss;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class EmployeeData {

    class Employee{
        public int e_id;
        public String e_name;
        public double e_salary;
    }

    public static void main(String[] args) {

        List<Integer> salary = new LinkedList<>();
        salary.add(10000);
        salary.add(30000);
        salary.add(70000);
        salary.add(50000);
        salary.add(30000);
        salary.add(10000);

        List<Integer> salary2 = salary.stream().filter(x -> x>30000).toList();
        System.out.println(salary2);

        List<Integer> salary3 = salary.stream().distinct().sorted().findFirst().stream().toList();
        System.out.println(salary3);

        String[] names = new String[]{"Jack", "Shwet", "Divy", "RRP", "MOhit", "nitin"};
        String[] sorted = Arrays.stream(names).map(x -> x.toUpperCase()).sorted(Comparator.reverseOrder()).toArray(String[]::new);
        System.out.println(Arrays.toString(sorted));


    }
}
