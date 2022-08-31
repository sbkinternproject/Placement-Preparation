package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class MergeIntervals {
    public static void main(String[] args) {
        System.out.println("The Intervals Before Merging");
        int[][] Intervals = {{1,3},{2,4},{6,8},{9,10}};
        printArray(Intervals);
        int[][] answer = overlappedInterval(Intervals);
        System.out.println("The Intervals After Merging");
        printArray(answer);
    }
    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]+" and "+arr[i][1]);
        }
    }
    public static int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        ArrayList<Pair> list = new ArrayList<>();
        for(int i = 0; i < Intervals.length;i++){
            Pair newPair = new Pair(Intervals[i][0], Intervals[i][1]);
            list.add(newPair);
        }
        Collections.sort(list, new Sortbystart());
        // System.out.println(list);
        Stack<Pair> st = new Stack<>();
        for(int i = 0; i < list.size();i++){
            Pair p = list.get(i);
            if(i == 0 ){
                st.push(p);
            }else {
                if(p.start > st.peek().end){
                    st.push(p);
                }else{
                    st.peek().end = Math.max(st.peek().end, p.end);
                }
            }
        }
        // System.out.println(st);
        // for(int i = 0;i < st.size();i++){
        //     Intervals[i][0] = st.peek().start;
        //     Intervals[i][1] = st.peek().end;
        //     st.pop();
        // }
        Stack<Pair> st1 = new Stack<>();
        while(!st.isEmpty()){
            Pair pp = st.peek();
            st.pop();
            st1.push(pp);
        }
        
        //   for(int i = 0;i < st1.size();i++){
        //     Intervals[i][0] = st1.peek().start;
        //     Intervals[i][1] = st1.peek().end;
        //     st1.pop();
        // }
        // System.out.println(st1);
        int[][] answer = new int[st1.size()][2];
        //  for(int i = 0;i < st1.size();i++){
        //     answer[i][0] = st1.peek().start;
        //     answer[i][1] = st1.peek().end;
        //     st1.pop();
        // }
        int oo= 0;
        while(!st1.isEmpty()){
            answer[oo][0] = st1.peek().start;
            answer[oo][1] = st1.peek().end;
            st1.pop();
            oo++;
        }
        return answer;
    }
}
class Sortbystart implements Comparator<Pair>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Pair a, Pair b)
    {
        return a.start - b.start;
    }
}
class Pair{
    int start;
    int end;
    Pair(int start, int end){
        this.start = start;
        this.end = end;
    }
    public String toString(){
        return "Start is "+start+" and End is "+end+" \n";
    }
}

// 1,3
// 2,4
// 6,8
// 9,10
