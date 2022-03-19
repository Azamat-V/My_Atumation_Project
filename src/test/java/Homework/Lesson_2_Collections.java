package Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Lesson_2_Collections {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Value1hhkhk");
        collection.add("Value2jk");
        collection.add("Value3jkmcnv");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }

        System.out.println();

        collection.forEach(s -> System.out.println("stream = " + " " + s));

        System.out.println();

        for (String s : collection) {
            System.out.println("ForEach = " + s.length());
        }
        System.out.println();

        collection.stream().filter(s -> s.length() < 10).forEach(s -> System.out.println("Filtered = " + " " + s));
        collection.stream().filter(s -> s.contains("2")).forEach(s -> System.out.println("Size = " + " " + s));
        ArrayList<String> secondlist = (ArrayList<String>) collection.stream().filter(s -> s.length() < 14).collect(Collectors.toList());
        secondlist.forEach(s -> System.out.println("secondlist item = "+ " " +s));

        System.out.println();

        HashMap <String,String> student = new HashMap<>();
        student.put("student1", "3");
        student.put("student2", "4");
        student.put("student3", "5");
        student.put("student4", "2");

        Set<String>set;
        set = student.keySet();
        set.forEach(s -> System.out.println("students = " + " " + s));

        System.out.println();

        for (String s: set){
            System.out.println("students = " + " " + student.get(s));
        }

        System.out.println(student);

        for (Map.Entry<String, String> m: student.entrySet()){
            System.out.println("student = " + m.getKey());
            System.out.println("grade = " + m.getValue());

        }

    }


}
