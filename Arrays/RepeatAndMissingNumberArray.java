package Arrays;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class RepeatAndMissingNumberArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        // 3 1 2 5 3
        A.add(3);
        A.add(1);
        A.add(2);
        A.add(5);
        A.add(3);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(Integer i = 0; i < A.size();i++){
            if(map.containsKey(A.get(i))){
                map.put(A.get(i), map.get(A.get(i)) + 1);
            }else{
                map.put(A.get(i), 1);
            }
        }
        // for(Integer i:map){
        //     System.out.println(i);
        // }
        for (Integer name : map.keySet()) {
            System.out.println(name);
        }
        // for()
        System.out.println(map);
        for(Integer i = 1; i <= A.size();i++){
            if(!map.containsKey(i)){
                System.out.println("Missing Number is "+i);
                break;
            }
        }
        map.entrySet().forEach(entry->{
			// System.out.println(entry.getKey() + " = " + entry.getValue());  
            if(entry.getValue() > 1){
                System.out.println("Repeated Number is: "+entry.getKey());
            }
		}); 

    }
}
