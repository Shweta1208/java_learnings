package linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkingList {

    public static void sample() {
        List<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(4);
        l2.add(5);
        List<Integer> l3 = l1.stream().filter(x->x%2==0).toList();
        System.out.println(l3.toString());
    }
    public static void main(String[] args) {
        sample();
    }

}
