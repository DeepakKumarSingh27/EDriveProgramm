package RaghuSir.DataStructure;

import java.util.Arrays;

public class BS {
   public static int binarySearch(int[] x,int ele) {
        return binarySearch(x,ele,0,x.length);
    }
    public  static  int binarySearch(int[] x,int ele,int low,int hing) {
        if (low > hing) return -1;
        int mid = (low + hing)/2;
        if (x[mid] == ele) return mid;
        if (x[mid] > ele)  return binarySearch(x,ele,low,mid - 1);
        else  return  binarySearch(x,ele,mid + 1,hing);
    }
    public static int binarysearch(int [] x,int low,int high,int k) {
       while (low <=  high) {
           int mid = (low + high) / 2;
           if (x[mid] < k) {
               low = mid + 1;
           } else if (x[mid] > k) {
               high = mid - 1;
           } else {
               return mid;
           }
       }
       return -1;
    }
    public static void main(String[] args) {
       int[] x = {1,2,3,4,5};
        System.out.println(binarysearch(x,0,x.length - 1,2));
        System.out.println(Arrays.toString(x));
        String s = Arrays.toString(x);
        System.out.println(s);
        int[] a = Arrays.copyOf(x,2);
        System.out.println(Arrays.toString(a));
        int[] b = Arrays.copyOfRange(x,1,4);
        System.out.println(Arrays.toString(b));
    }
}
