import java.util.Scanner;

public class Divide_array_in_2parts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");

        int n = sc.nextInt();
        int[] arr = new int[n];

        int total = 0, prefix = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        for (int i = 0; i < n - 1; i++) {
            prefix += arr[i];
            int ans=total-prefix;
            if (prefix==ans) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
