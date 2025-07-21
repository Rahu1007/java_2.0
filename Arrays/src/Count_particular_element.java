//count the number of occurencce of a particular element x


import java.util.*;

class CPE {
     int count(int [] arr,int x){
        int count=0;
        for(int i=0;i< arr.length;i++){
                if(arr[i]==x){
                    count++;
                }
        }
        return count;
    }

}

public class Count_particular_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("the size of array "+n+" = ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the number of elements");
        int x=sc.nextInt();
        System.out.print("the count is "+x);

        CPE obj=new CPE();
        int result =obj.count(arr,x);
        System.out.print("the count of element is "+result);
//        sc.close();
    }
}
