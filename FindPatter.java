
import java.util.HashMap;
import java.util.List;
import java.util.stream.*;

/*
Find all names  with course : course_1 from a list
*/
class FindPatter{
    public static void main(String[] args) {
        HashMap<String,String> mp = new HashMap<>();
        mp.put("john","course_1");
        mp.put("alex","course_2");
        mp.put("linda","course_2");
        mp.put("fabian","course_1");
        mp.put("richard","course_2");
        mp.put("thomas","course_3");

        List<String> name = mp.entrySet().stream()
            .filter(entry -> entry.getValue().equals("course_1"))
            .map(entry -> entry.getKey())
            .collect(Collectors.toList());

        System.err.println(name);

    }
}