import java.util.Scanner;

public class PrifixAndSuffix {
        public static boolean canSplit(int[] arr) {
            int totalSum = 0;
            for (int num : arr) {
                totalSum += num;
            }

            int prefixSum = 0;

            // We go only till length - 1 to avoid empty suffix
            for (int i = 0; i < arr.length - 1; i++) {
                prefixSum += arr[i];
                int suffixSum = totalSum - prefixSum;
                if (prefixSum == suffixSum) {
                    return true;
                }
            }

            return false;
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
            System.out.println("Can be split: " + canSplit(arr));
        }
}


//    enter the size of array4
//        Enter the 4element1 2 3 3
//
//enter the size of array5
//Enter the 5element1 2 3 4 6
