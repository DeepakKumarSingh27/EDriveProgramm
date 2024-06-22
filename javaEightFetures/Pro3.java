package RaghuSir.javaEightFetures;
import java.util.HashMap;
public class Pro3 {
    public static void main(String[] args) {
        int[] arr = {3,12,18,28,29,30,35,36,40,45};
        int target = 3;
        System.out.println(search(arr,target));
    }
    public static int search(int []arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) { // Corrected loop termination condition
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
