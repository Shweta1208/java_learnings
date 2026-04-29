package linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

    public static void reverse(List<Integer>ll){
        int size =  ll.size();
        for(int j=size;j>0;j--){
            System.out.print(ll.get(j-1)+" ");
        }
        System.out.println();
    }

    public static void reverse2(List<Integer> listt){
        Collections.reverse(listt);
        System.out.println(listt);
    }

    public static void main(String[] args){
        List<Integer> ll = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(ll);
        reverse(ll);
        reverse2(ll);
    }

}
