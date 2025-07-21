//find the unique number in agiven Array where all elements are being  repete twice
//with one value being  uniqed
import jdk.dynalink.beans.StaticClass;

import java.util.*;

class FindUniqueNumber{
    static  int findunique(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

}

public class Number_repete_twice {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
    int n=sc.nextInt();
    int[] arr=new int[n];
        System.out.println("enter the number"+n+" of elements");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int uniqueNumber = FindUniqueNumber.findunique(arr);
        System.out.println("The unique number that repeats twice is: " + uniqueNumber);




    }
}
