package Manifest;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class PoojOne {
    public static Map<String,Integer> getEmployeeDetails() {
        Map<String, Integer> m = new HashMap<>();
        m.put("Pooj", 25000);
        m.put("Rohit", 30000);
        return m;
    }

    static void main() {
        System.out.println(getEmployeeDetails());
    }
}
