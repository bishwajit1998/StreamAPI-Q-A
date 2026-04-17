/*
Find Maximum in a List
Question: Find the maximum number from a list of integers.
*/
import java.util.*;
class FindMax{
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,5688,7,8,9);
        int max = number.stream().max(Integer::compare).orElseThrow();
        System.out.println(max);
    }
}