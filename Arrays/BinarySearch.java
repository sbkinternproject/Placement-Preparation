package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // 10, 20, 30, 50, 60, 80, 110, 130, 140, 170
        // x = 110
        // Index : 6
        // ArrayList<Integer> list = new ArrayList<Integer>(
        //     Arrays.asList(10, 20, 30, 50, 60, 80, 110, 130, 140, 170)
        // );
        Integer arr[] = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
        Integer x = binarySearch(arr, 110, 0, arr.length -1);
        System.out.println("Index of 110 is "+x);
    }
    public static Integer binarySearch(Integer[] arr, Integer element, Integer i, Integer j){
        Integer mid = (j+i)/2;
        System.out.println("Mid Index is "+mid);
        if(arr[mid] == element){
            System.out.println("Value of i and j is "+i + " "+ j);
            return mid;
        }else if(arr[mid] > element) {
            System.out.println("Value of i and j is "+i + " "+ j);
            return binarySearch(arr, element, i, mid - 1);
        }else if(arr[mid] < element){
            System.out.println("Value of i and j is "+i + " "+ j);
            return binarySearch(arr, element, mid+1, j);
        }
        return null;
    }










    // public static Integer binarySearch(ArrayList<Integer> list, Integer element){
    //     Integer midElement = list.get(list.size() / 2);//arr[n/2]
    //     if(midElement == element){
    //         return list.size()/2;
    //     }else if(midElement > element){
    //         //Left Side
    //         for(Integer i = list.size()/2 + 1;i < list.size();i++){
    //             list.remove(i);
    //         }
    //         return binarySearch(list, element);
    //     }else if(midElement < element){
    //         //Right Side
    //         for(Integer i = 0;i <= list.size()/2 ;i++){
    //             list.remove(i);
    //         }
    //         return binarySearch(list, element);
    //     }
    //     // return -1;
    // }
}
