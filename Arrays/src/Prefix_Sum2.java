import java.util.Scanner;

class SumPrefix1{
//    static void  PrintArray(int [] arr){
//        int n= arr.length;
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }


    static int [] MakePrefixSum(int [] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
}


public class Prefix_Sum2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the "+n+"element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        SumPrefix1.MakePrefixSum(arr);
        System.out.println("enter the queries");
        int q= sc.nextInt();
        while (q-->0){// this part also added
            System.out.println("enter the range 1-base index");
            int l= sc.nextInt();
            int r= sc.nextInt();
            l--;
            r--;
            int ans=arr[r]-(l>0 ? arr[l-1] : 0);
            System.out.println("sum"+ans);
        }


        System.out.println("Prefix sum array");
        SumPrefix.MakePrefixSum(arr);
       // SumPrefix.PrintArray(arr);
    }
}
