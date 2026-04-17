/*1. Filter Even Numbers from a List
Question: Given a list of integers, filter the even numbers.
*/
import java.util.*;
import java.util.stream.*;
public class FilterEven {
    public static void main(String[] args) {
    List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8);
    List<Integer> even = number.stream().filter(n->n%2==0).collect(Collectors.toList());
    System.out.println(even);
    
    }

}
