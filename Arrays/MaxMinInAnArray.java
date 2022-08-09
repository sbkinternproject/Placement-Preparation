package Arrays;

import java.util.ArrayList;
import java.util.Scanner;
// minimum number of comparisons
public class MaxMinInAnArray{
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<Integer>();
        takeInput(list);
    }
    public static void takeInput(ArrayList<Integer> list ){
        System.out.println("Starting of the Input Taking Method");
        System.out.println("Enter the Number of Elements");
        Integer n = input.nextInt();
        for(int i = 0 ;i < n ;i++){
            System.out.print("Enter the Element no. "+(i+1)+" : ");
            list.add(input.nextInt());
            System.out.println();
        }
        System.out.println("End of the Input Taking Method");
    }

}