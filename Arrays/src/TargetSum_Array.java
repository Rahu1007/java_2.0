class TS {
    static int Target(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }
}

public class TargetSum_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;

        int result = TS.Target(arr, target);
        System.out.println("Number of pairs with sum " + target + " = " + result);
    }
}
