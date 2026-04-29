package Streamsss;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class Salary {
    static void main() {
        int[] sal = {1000, 2000, 3000, 4000, 5000};
        OptionalInt second = Arrays.stream(sal)
                .distinct()
                .sorted() // Comparator.reverseOrder()
                .skip(1)
                .findFirst();
        System.out.println(second);
    }
}
