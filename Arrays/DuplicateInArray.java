package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateInArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        System.out.println(arr);
        // It COntains only unique values, no repeation
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            set.add(arr.get(i));
        }
        System.out.println(set);
        if(set.size() == arr.size()){
            System.out.println("No Duplicates are Found!");
        }else{
            System.out.println("Duplicates Exists!");
        }
    }
}
