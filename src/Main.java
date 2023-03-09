import java.util.*;

public class Main {
    public static void main(String[] args) {
        // не коллекция
        // Маps - словари, мапы, мапс, карты, ассоц.массивы

        // пары: key => value

        Map<Integer, ?> maps = new HashMap<>();

        //   Hash => некое число

        class Car { }
        HashMap<Car, Integer>  hashMap = new HashMap<>();


       HashMap<String,String> cities = new HashMap<>();

       cities.put("msk", "Moscow");
       // HASH(key) 9234583458 => msk, Moscow
       cities.put("spb", "St.Peter");
       cities.put("kzn", "Kazan");
       cities.put("oms", "Omsk");
       cities.put("spb", "St.Petersburg");

       for(Map.Entry<String,String> e: cities.entrySet()) {
           System.out.println(e.getKey() + "=> " + e.getValue());
       }

       //cities.get("msk"); // hash 9234583458
        class Person {
           public String name;
           public int year;

            public Person(String name, int year) {
                this.name = name;
                this.year = year;
            }
        }

        TreeMap<Integer, Person> treeMap = new TreeMap<>();

        treeMap.put(100, new Person("Ivan", 2000));
        treeMap.put(10, new Person("Olga", 2005));
        treeMap.put(1001, new Person("Petr", 1999));
        treeMap.put(67, new Person("Maria", 2009));
        treeMap.put(10, new Person("Anna", 2007));

        for(Map.Entry<Integer, Person> p: treeMap.entrySet()) {
            System.out.println(p.getKey() + "=> " + p.getValue().name + ", "+p.getValue().year);
        }
        //      Фамилия         Товар   Кол-во
        TreeMap<String, TreeMap<String, Integer>> shop = new TreeMap<>();
        // Ivanov paper 10
        TreeMap<String,Integer> inner = new TreeMap<>();
        TreeMap<String,Integer> buffer = new TreeMap<>();
        inner.put("paper", 10);
        shop.put("Ivanov", inner);
        // Ivanov paper 7
        if(shop.containsKey("Ivanov")) {
            buffer = shop.get("Ivanov"); // paper 10
            if(buffer.containsKey("paper")) {
                buffer.put("paper", buffer.get("paper")+7);
            }
            shop.put("Ivanov",buffer);
        } else {
            inner.put("marker", 200);
            shop.put("Petrov",inner);
        }


    }
}