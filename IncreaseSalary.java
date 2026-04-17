/*
increase salary of people by 10 percent who has salary less than 20,000
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class IncreaseSalary{
    public static void main(String[] args) {
        List<Integer> salary = Arrays.asList(12000,2000,34000,40000,19000,20000);
        List<Integer> revisedSalary = salary.stream()
            .map(s -> s < 20000 ? (int)(s * 1.1) : s)
            .collect(Collectors.toList());
        System.out.println(revisedSalary);
    }
}