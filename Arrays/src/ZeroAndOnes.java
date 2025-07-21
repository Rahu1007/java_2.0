import java.util.Scanner;

class ZeroAndOnesSort{


    static void  PrintArray(int [] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    static void Swap(int  arr[], int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    static  void SortZeroAndOne(int [] arr){
        int n= arr.length;
        int left=0,right=n-1;
        while(left<=right){
            if(arr[left] == 1 && arr[right]==0){
                    Swap(arr,left,right);
                    left++;
                    right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }


}



public class ZeroAndOnes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the "+n+"element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array: ");
        ZeroAndOnesSort.PrintArray(arr);

        ZeroAndOnesSort.SortZeroAndOne(arr);

        System.out.print("Sorted array: ");
        ZeroAndOnesSort.PrintArray(arr);
    }
}
