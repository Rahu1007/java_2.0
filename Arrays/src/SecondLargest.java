import java.util.Scanner;

class SecondLast {
    // Method to find maximum element
    static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)  // for (int value : arr)
        {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to find second maximum element
    static int findSecondMax(int arr[]) {
        int max = findMax(arr);
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)             // for (int value : arr)
        {
            if (arr[i]!= max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int secondLargest = SecondLast.findSecondMax(arr);
        System.out.println("Second largest element is: " + secondLargest);
    }
}
