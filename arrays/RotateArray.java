
import java.util.Arrays;

// public class Rotate {
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5,6};
//         int d=3;
//         rotateLeft(arr,d);
//     }
//     static void rotateLeft(int[] arr,int d){
//         int n=arr.length;
//         d=d%n;
//         reverse(arr, 0, n-1 );
//         reverse(arr, 0, d-1);
//         reverse(arr, d, n-1);
//         System.out.println(Arrays.toString(arr));
        
//     }
//     static void reverse(int[] arr,int start,int end){
        
//         while(start<end){
//             int temp=arr[start];
//             arr[start]=arr[end];
//             arr[end]=temp;
//             start++;
//             end--;
//         }
//     }
// }

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int d=3;
        rotateRight(arr,d);
    }
    static void rotateRight(int[] arr,int d){
        int n=arr.length;
        System.out.println(n);
        d=d%n;
        System.out.println(d);
        reverse(arr, n-d, n-1);
        reverse(arr, 0, n-d-1);
        reverse(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

            
        }
    }
}
