import java.util.*;

class Sorted {
    static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {  // Start from i = 1 to avoid out-of-bounds access
            if (arr[i] < arr[i - 1]) {
                return false;  // No need for extra 'check' variable
            }
        }
        return true;
    }
}

public class Check_ele_is_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Corrected method call
        boolean result = Sorted.isSorted(arr);
        System.out.println("is the array sorted? = " + result);
    }
}
