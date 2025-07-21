import java.util.Scanner;

public class Maximum_sum_of_subarray {

    static  int maxSumArr(int [] arr){
        int sum=0;
        int max_sum=arr[0];
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
            if(sum > max_sum){
                max_sum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max_sum;
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
        System.out.println(maxSumArr(arr));
    }
}
