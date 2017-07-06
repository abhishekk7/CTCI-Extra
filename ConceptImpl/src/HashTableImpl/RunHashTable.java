package HashTableImpl;

/**
 * Created by Abhishek Kumar on 7/5/2017.
 */
public class RunHashTable {

    public static void main(String[] args) {
        Map<String, Integer> map = new Map<>();
        map.add("this", 1);
        map.add("coder", 2);
        map.add("this", 4);
        map.add("hi", 5);
        map.add("fb", 6);
        map.add("hi5", 3);
        System.out.println(map.size());
        System.out.println(map.remove("this"));
        System.out.println(map.remove("this"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
