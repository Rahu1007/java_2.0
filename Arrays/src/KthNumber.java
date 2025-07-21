import java.util.Scanner;

class Rotate {
    static int[] rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {   // first part of array
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {   // second part of array
            ans[j++] = arr[i];
        }
        return ans;
    }


    

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class KthNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        System.out.println("Original array:");
        Rotate.printArray(arr);

        int[] rotatedArray = Rotate.rotate(arr, k);

        System.out.println("Rotated array:");
        Rotate.printArray(rotatedArray);
    }
}
