import java.util.Scanner;

public class Largest_sum_contiguous_subArray {
    static int findMaxSum(int[] arr) {
        int maxi = arr[0];
        int prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix += arr[i];
//            prefix = Math.max(arr[i], prefix + arr[i]);  // either start new subarray or continue


            maxi = Math.max(maxi, prefix);// update global max
            if(prefix<0){
                prefix=0;
            }

        }

        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = findMaxSum(arr);
        System.out.println("Maximum sum of a contiguous subarray: " + maxSum);
    }
}