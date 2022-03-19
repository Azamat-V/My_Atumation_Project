package JavaSimple;

import com.sun.source.doctree.SeeTree;
import com.sun.source.tree.UsesTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collections {

    public static void main(String[] args) {
        int [] nums = new int[3];//массив зарезирвировано для 3-х значений
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        try {
            nums[1]=1;
        }catch (IndexOutOfBoundsException ex){//конструкция для отлова ошибок
            ex.printStackTrace();
        }finally {
            System.out.println("UUPS");
        }

        System.out.println(nums[1]);

        String [] str = {"2","4","8"};//массив строк
        System.out.println(str[1]);//вывод второго значения из массива т.к. начинается с массив в java начинается с нуля.

        System.out.println();

        ArrayList<String> list = new ArrayList<>();//Список(коллекция)
        list.add("jhkjhkj");
        list.add("hghkgkhgcnncngnfnf");
        list.add("878678");

        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));//вывод каждой строки списка(коллекции)

        }
        System.out.println();

        for (String s: list){
            System.out.println("ForEach = " + " " +s.length());//Вывод длинны для каждой строки списка(коллекции)
        }

        System.out.println();

        list.forEach(s -> System.out.println("stream =" + " " +s));//вывод каждой строки списка(коллекции)
        System.out.println();
        list.stream().filter(s -> s.length()<14).forEach(s -> System.out.println("filtered=" +s));//фильтрация вывод строк менее 14 символов
        System.out.println();
        list.stream().filter(s -> s.contains("8")).forEach(s -> System.out.println("filtered2=" +s));//фильтрация вывод строк которые содержат 8
        System.out.println();

       ArrayList<String > secondlist = (ArrayList<String>)list.stream().filter(s-> s.length()<14).collect(Collectors.toList());
       secondlist.forEach(s -> System.out.println("second list item = " + s));
        System.out.println();

        HashMap<String, String> map = new HashMap<>();
        map.put("Key1", "Value 1");

        map.put("Key2", "Value 2");
        map.put("Key3", "Value 3");
        map.put("Key4", "Value 4");
        map.put("Key1", "Hi!");
        System.out.println(map.get("Key1"));//перезапись Key 1 др. значением

        System.out.println();

        Set<String>set;//метод Set позволяет перебирать все ключи
        set=map.keySet();
        set.forEach(s-> System.out.println("keys = " +s));

        System.out.println();

        for (String s: set) {//Перебор ключей с помощью оператора for

            System.out.println("Keyvalue" + " = " + map.get(s));
        }
        System.out.println();

        for (Map.Entry<String,String> m: map.entrySet()){
            System.out.println("Key = " + m.getKey());
            System.out.println("Value = " + m.getValue());

        }

    }


}
