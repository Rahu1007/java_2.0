//find the last occurence of qn elemnet x in a given element


import java.util.*;



class LOE{
    int LOOE(int arr[], int x){          //x=target
       int  last_Idx = -1;
       for(int i=1;i<arr.length;i++){
           if(arr[i]==x){
                last_Idx=i;
           }
       }
return  last_Idx;
    }



}


public class Last_Occurance_of_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter " + n + "elements");
        for(int i=0;i< arr.length ;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the elements in the array for last occurence");
        int x=sc.nextInt();
        System.out.println("the count is "+x);

            LOE obj=new LOE();
            int last_occurrence=obj.LOOE(arr,x);
        System.out.println("the last occurrence is "+last_occurrence);
    }
}
