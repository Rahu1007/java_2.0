//public class Array {
//    public static void main(String[] args){
//        int marks[]= new int[50];
//        System.out.println("length of array " +marks.length);
//        System.out.println("enter the value ");
//        Scanner sc= new Scanner(System.in);
//        marks[0]=sc.nextInt();
//        marks[1]=sc.nextInt();
//        marks[2]=sc.nextInt();
//        System.out.println("phy"+marks[0]);
//        System.out.println("chem"+marks[1]);
//        System.out.println("math"+marks[2]);
//        int percentage = (marks[0]+marks[1]+marks[2])/3;
//        System.out.println("percentage "+percentage+"%");
//    }
//}
/*
public class Array {
    public static void update(int marks[]){
    for(int i=0;i< marks.length ;i++){
        marks[i]=marks[i] +1;
    }
    }
    public static void main(String [] args){
    int marks[]= {97,98,99};
    update(marks);

    for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]+ " ");
    }
        System.out.println( );
    }
}*/
//                                                                   this program for class work
/*public class Array {
    public static int Max_Min(){
    int arr[]= {3,4,52,1,66,42,14,673,8,33,24};
    int max=arr[0];
    int min=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i] > max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
    }
        System.out.println("Min element is: " + min);
        return max; }
    public static void main(String [] args){
        int max=Max_Min();
        System.out.println("max element is "+max);
    }
}*/

/*
public class Array {
    public static void Reverse(){
        int arr[] ={3,4,52,1,66,42,14,673,8,33,24};
        int i=0;
        int j=arr.length-1;
        while(i<j){
             int t=arr[i];
              arr[i] =arr[j];
                arr[j]=t;
                i++;
                j--;
        }
        // Print the reversed array
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        Reverse();
    }
}*/
//
//
//import java.util.Arrays;
//
//public class Array {
//
//    // Method to find k-th smallest element
//    public static int k_th_small(int[] arr, int k) {
//        Arrays.sort(arr);  // Sort the array in ascending order
//        return arr[k - 1]; // Return the k-th smallest element
//    }
//
//    // Method to find k-th largest element
//    public static int k_th_large(int[] arr, int k) {
//        Arrays.sort(arr);  // Sort the array in ascending order
//        return arr[arr.length - k]; // Return the k-th largest element
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {7, 10, 4, 3, 20, 15};  // Array to test
//        int k = 3;
//        System.out.println("3rd Smallest element: " + k_th_small(arr, k));
//        System.out.println("3rd Largest element: " + k_th_large(arr, k));
//    }
//}
/*
public class Array {
    public static int linearsearch(int[] ints, int num){
        for(int i=0;i<num.length;i++){
           if(num[i] ==key){
               return 1;
           }
        }
        return -1;

    }
    public static void main(String [] args){
        int num[] = {2,3,5,64,22,5,8,54,32};
        int key=5;
        int idx=linearsearch(num, key);
        if(idx == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is at idx i"+idx);
        }
    }
}*/

//
//public class Array {
//    public static void main(String[] args) {
//        int num[]= new int[50];
//        int numb[]= {1,2,3};
//        String ch[]={"a", "b","c"};
//    }
//}


/*public class Array {

    public static void main(String[] args) {
        int [] m=new int[3];
        m[0]=90;
        m[1]=98;
        m[2]=99;
        System.out.println( m[0]);
    }
}
*/

import java.util.Scanner;
import java.util.*;
//
//public class Array {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter thr input array");
//        int size=sc.nextInt();
//        int a[]=new int[size];
//
//        for(int i=0;i<size;i++){
//            a[i]=sc.nextInt();
//        }
//    }
//}
//
/*                                                  // Find the Maximum and Minimum Elements in an Array,
public class Array {
    public static void main(String[] args) {
        int a[]={50,60,40,20,90};
        int max=a[0],min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
} */
/*                          // Find the Maximum and Minimum Elements in an Array,
public class Array {
    public static void Max_Min(){
        int a[]={50,60,40,20,90};
        int max=a[0],min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("min = "+min);
        System.out.println("max = "+max);
    }
    public static void main(String[] args) {

        Max_Min();
    }
}
*/


                                                        //reverse an Array,
/*public class Array {

 public static void main(String[] args) {
    int a[]={10,20,30,40,50};
    //b4 reverse
     for(int val:a){
         System.out.println("before reverse value is this "+val);
     }
        //reverse logic
     int first=0;
     int last=a.length-1;
     while(last > first){
         int temp=a[first];
         a[first]=a[last];
         a[last]=temp;

         first++;
         last--;
     }
     //after reverse
     for(int val:a){
         System.out.println("after reverse value in this  "+val);
     }

 }
}*/
/*
    public class Array {
        public static void reverse(){
            int a[]={20,30,40,50,60,70};
            int i=0;
            int j= a.length-1;
            while(i<j){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                i++;
                j--;
            }
            System.out.println("reverse array");
            for(int num:a){
                System.out.print( " "+num);
            }
            System.out.println();
        }
public static void main(String[] args) {
                            reverse();
}
}
*/
                                                // Find the Kth Smallest/Largest Element in an Array.
//   public class Array {
//  public static void main(String[] args) {
//      int a[] = {20, 30, 40, 50, 60, 70};
//      int k = 5; // The value of k (1-based index)
//
//      // Sort the array in descending order
//      for (int i = 0; i < a.length - 1; i++) {
//          for (int j = i + 1; j < a.length; j++) {
//  // agar yaha pr pura nica wala for each loop laga du to linear sort ban jaya aga

//              if (a[i] < a[j]) { // Compare for descending order
//                  int temp = a[i];
//                  a[i] = a[j];
//                  a[j] = temp;
//              }
//          }
//      }
//      System.out.println("descending order");
//      for (int num : a) {
//          System.out.print(num + " ");
//      }
//      System.out.println();
//      // Print the kth largest element
//      if (k > 0 && k <= a.length) { // Validate k
//          System.out.println("The " + k + "th largest element is " + a[k - 1]);
//      } else {
//          System.out.println("Invalid value of k");
//      }
//  }
//   }
//

public class Array {
    public static int kth_small(int []arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static int kth_largest(int [] arr ,int k){
        Arrays.sort(arr);
        return arr[arr.length-k];
    }
    public static void main(String[] args) {
        int []arr={7,10,4,3,20,15};
        int k=3;
        System.out.println("3rd small "+ kth_small(arr,k));
        System.out.println("3rd largest "+ kth_largest(arr,k));
    }
}





















/*import java.util.Scanner;
public class Array {
    public static void mark(){
        int mark[]=new int[6];
        Scanner sc=new Scanner(System.in);
        mark[0]=sc.nextInt();
        mark[1]=sc.nextInt();
        mark[2]=sc.nextInt();
        System.out.println("phy"+mark[0]+" chem "+mark[1]+ "math "+mark[2] );
        int sum=mark[0]+mark[1]+mark[2];
        System.out.println("sum"+sum);
    }

    public static void main(String[] args) {
mark();
    }
}
*/
//
//import java .util.Scanner;
//public class Array {
//    public static void update() {
//        int mark[]=new int[5];
//        Scanner sc=new Scanner(System.in);
//        mark[0]=sc.nextInt();
//         mark[1]=sc.nextInt();
//         mark[2]=sc.nextInt();
//        System.out.println("ph"+mark[0]+ "ch"+mark[1]+ "math"+mark[2]);
//        for(int i=0;i<=mark.length;i++){
//            mark[i]=mark[i]+1;
//            System.out.println(mark[i]);
//        }
//    }
//    public static void main(String[] args) {
//        update();
//    }
//}
/*
public class Array {
    public static int LinearSearch(int num[], int key) {
        for(int i = 0; i < num.length; i++) { // Fix: Changed <= to <
            if(num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = {2, 3, 4, 5, 6, 7, 8, 12, 40, 34, 22, 23, 10};
        int key = 10;
        int idx = LinearSearch(num, key);
        if (idx == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key found at index: " + idx); // Improved output
        }
    }
}
*/

/*public class Array {
    public static int LinearParatic(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String ch[] = {"samosa", "dosa", "idli", "pasta"};
        String key = "idli";
        int idx = LinearParatic(ch, key);
        if (idx == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + idx);
        }
    }
}
*/
/*
public class Array {
    public static int LargestNumber(int[] num) {
        int largest = Integer.MIN_VALUE;
        // Initialize with the smallest possible value
        int smallest=   Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
            if(smallest>num[i]){
                smallest=num[i];
            }
        }

       System.out.println("smallest value "+smallest);
        return largest;
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 6, 3, 5};
        System.out.println("Largest value is: " + LargestNumber(num));
    }
}
*/
/*
public class Array {
    public static int BinarySearch(int arr[] ,int key) {
    int start=0,end= arr.length-1;
    while (start<=end){
        int mid=(start+end)/2;
        //comparision
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]<key){ //right
            start= mid+1;
        }
        if(arr[mid]>key){  //left
            end=mid-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("idx of this is key is "+BinarySearch(arr,key));
    }
}*/
/*
public class Array {
    public static void reverse(int arr[] ) {
    int first=0,last=arr.length-1;
    while(first<last){
     int temp =arr[last];
        arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
    }
    }
    public static void main(String[] args) {
    int arr[]={2,4,6,8,10,12};
    reverse(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}*/
/*
public class Array {
    public static void pair(int num[]){
        for(int i=0;i< num.length;i++){
            int current=num[i];
            for(int j=i+1;j< num.length;j++){
                System.out.println("("+current+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
int num[]={2,4,6,8,10,12};
    pair(num);
    }
}*/
/*
public class Array {
    public static void Subarray(int num[]){
    for(int i=0;i<num.length;i++){
        int start=i;
        for(int j=i;j< num.length;j++){
            int end =j;
            for (int k=start;k<=end;k++){
                System.out.print(num[k]+" ");
            }
            System.out.println();
    }
        System.out.println();

    }

    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12};
            Subarray(num);
    }
}*/

/*public class Array {
    public static void MaxsSubarryr(int num[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j< num.length;j++){
                int end =j;
                currentsum=0;
                for (int k=start;k<=end;k++){
                    currentsum+=num[k];
                }
                System.out.println(currentsum);
                if(maxsum <currentsum){
                    maxsum=currentsum;
                }
            }
        }
        System.out.print("maxsum="+maxsum);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12};
        MaxsSubarryr(num);
    }
}*/
/*
public class Array {
    public static void Prifixsum(int num[]) {
        int curr=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int [num.length];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){
    prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=0;j<num.length;j++){
                int end =j;
                curr=start==0 ? prefix[end]: prefix[end]-prefix[start-1];
                if(maxsum<curr){
                    maxsum=curr;
                }
            }
        }
        System.out.println("max sum="+maxsum);

    }
    public static void main(String[] args) {
    int num[]={1,-2,6,-1,3};
    Prifixsum(num);
    }
}*/
/*
public class Array {
    public static void kadanalgo(int num[]){
    int ms=Integer.MIN_VALUE; //maxsum
    int cs=0;
    for(int i=0;i<num.length;i++){
        cs=cs+num[i];
        if(cs<0){
            cs=0;
        }
        ms=Math.max(cs,ms);
    }
        System.out.println("Max sum of subarray  "+ms);
    }
    public static void main(String[] args) {
    int num[]={-2,-3,4,-1,-2,1,5,-3};
    kadanalgo(num);

    }
}*/