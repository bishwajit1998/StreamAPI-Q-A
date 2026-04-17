/*
Sort a List
Question: Sort a list of integers in descending order. 
*/

import java.util.*;
import java.util.stream.*;
public class SortList {
    public static void main(String[] args) {
    List<Integer> number = Arrays.asList(2,4,5,21,5,7,2,65,1);
    List<Integer> sortNumber = number.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    System.out.println(sortNumber);
    }

}
