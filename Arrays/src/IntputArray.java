import java.util.Arrays;
import java.util.Scanner;

public class IntputArray {
    static void printArray(int [] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("the size of array "+n+" = ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

        printArray(arr);
        int arr_2 []= arr;
        System.out.println("this is copy the array");
        printArray(arr_2);

        arr_2 [0]=sc.nextInt();
        arr_2 [1]= sc.nextInt();
        System.out.println("original array after changing ");
        printArray(arr);
        System.out.println("copies arr_2 after the changing");
        printArray(arr_2);

//
//        arr_2 = Arrays.copyOf(arr, 2);
//        printArray(arr_2);
//                                         [    )
        arr_2=Arrays.copyOfRange(arr,0,arr.length);     // also provide range 0 to infinity
        printArray(arr_2);
    }
}
