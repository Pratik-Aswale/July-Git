import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {


        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(40,"Pratik");
        hashMap.put(30,"Pooja");
        hashMap.put(10,"Dhanashri");
        hashMap.put(20,"Shraddha");

        TreeMap<Integer,String> treeMap=new TreeMap<>(hashMap);
        System.out.println("Sorted Key:"+treeMap);
    }
}
