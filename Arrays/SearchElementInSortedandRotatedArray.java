package Arrays;
public class SearchElementInSortedandRotatedArray{
    public static void main(String[] args) {
        // arr[] = , key = 3
        // Found at index 8
        // Integer[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        Integer[] arr = {14,1,2,3,10,12,13};
        Integer elementIndexToBeFinded = 12;
        Integer x = modifiedBinarySearch(arr, elementIndexToBeFinded, 0, arr.length - 1);
        System.out.println("Index of 3 is "+ x);
    }
    public static Integer modifiedBinarySearch(Integer[] arr, Integer element, Integer i, Integer j){
        Integer mid = (i+j) /2;
        if(arr[mid] == element){
            return mid;
        }else if(arr[mid] >= arr[i]){
            //Left Side Sorted 
            if(element >= arr[i] && element <= arr[mid]){
                return modifiedBinarySearch(arr, element, i, mid - 1);
            }
            return modifiedBinarySearch(arr, element, mid + 1, j);
        }else{
            if(element >= arr[mid] && element <= arr[j]){
                return modifiedBinarySearch(arr, element, mid + 1, j);
            }
            return modifiedBinarySearch(arr, element, i, mid - 1);
        }
    }
}