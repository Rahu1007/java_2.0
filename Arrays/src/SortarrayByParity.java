import java.util.Scanner;
class SortEvenOdd{
    static void  PrintArray(int [] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void Swap(int  arr[], int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    static void SortedArrayEvenOdd(int [] arr){
        int n= arr.length;
        int left=0,right=n-1;
        while(left<right){
            if(arr[left] %2==1 && arr[right]%2==0){
                Swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] %2==0 ){
                left++;
            }
            if(arr[right] %2==1){
                right--;
            }
        }
    }
}
public class SortarrayByParity {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the "+n+"element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Sorted Even or Odd array: ");
        SortEvenOdd.SortedArrayEvenOdd(arr);
        SortEvenOdd.PrintArray(arr);
    }
}
