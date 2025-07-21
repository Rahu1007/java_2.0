import java.util.Scanner;

class SumPrefix{
    static void  PrintArray(int [] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    static int [] MakePrefixSum(int [] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
}


public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the "+n+"element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       SumPrefix.MakePrefixSum(arr);
        SumPrefix.PrintArray(arr);

    }
}
