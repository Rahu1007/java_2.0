import java.util.ArrayList;

public class All_lndices {
    static ArrayList<Integer> all_Indices(int a[], int target,int idx){
        ArrayList<Integer> ans= new ArrayList<>();
        //base case
        if(idx>=a.length){
            return  ans;
        }
        //self case
        if(a[idx]==target){
            ans.add(idx);
        }
        //recursion work
        ArrayList<Integer> SmallAns=all_Indices(a,target,idx+1);
        ans.addAll(SmallAns);
        return ans;
    }
    public static void main(String[] args) {
        int a[]= {1,2,3,4,4,4,5,22,4};
        int target=4;
        ArrayList<Integer> ans= all_Indices(a,target,0);
        for(Integer i:ans){
            System.out.print(" "+i);
        }

    }
}
