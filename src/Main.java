import java.util.*;

public class Main {
    public static void main(String[] args) {
        // не коллекция
        // Маps - словари, мапы, мапс, карты, ассоц.массивы

        // пары: key => value

        Map<Integer, ?> maps = new HashMap<>();

        //   Hash => некое число



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

    }
}