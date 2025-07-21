import java.util.Scanner;

class Square{
    static void  PrintArray(int [] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static  int [] sortSquare(int [] arr){
        int n=arr.length;
        int left=0,right=n-1;
        int ans[]= new int[n];
        int k=n-1;//n-1,0
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k--]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
}


public class SortedSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the "+n+"element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] squaredArr = Square.sortSquare(arr);

        System.out.print("Sorted square array: ");
        Square.PrintArray(squaredArr);
    }
}
