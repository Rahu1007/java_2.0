import java.util.*;

class TripleSum{
    static int Sum(int arr[],int Target){
            int ans=0;

            for(int i=0;i< arr.length;i++){
                for(int j=i+1;j< arr.length;j++){
                    for(int k=j+1;k< arr.length;k++){
                        if(arr[i]+arr[j]+arr[k]==Target){
                            ans++;
                        }
                    }
                }
            }
            return ans;
    }

}
 
public class TargetTripleSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        System.out.println("enter the size of array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the "+n+ " element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target sum");
        int targetSum=sc.nextInt();
//        TripleSum obj=new TripleSum();
//        System.out.println(targetSum.Sum(arr, Target));
        System.out.println("Number of target sum is "+TripleSum.Sum(arr, targetSum));
        sc.close();
    }
}
