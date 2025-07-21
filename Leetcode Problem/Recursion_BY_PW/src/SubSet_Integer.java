import java.util.*;

public class SubSet_Integer {
    //step 1 is decleae this arr in static
        static  List<List<Integer>> arr;  // we declear arr globle because we can acces this easlie;
    public void helper(int i,int nums[] ,ArrayList<Integer> ans){
        if(i== nums.length){
            ArrayList<Integer>list=new ArrayList<>();
            for(int j=0;j< ans.size();j++){
                list.add(ans.get(j));
            }
            arr.add(list);
            return;
        }
        helper(i+1,nums,ans);//not take
        ans.add(nums[i]);
        helper(i+1,nums,ans);//teke
        ans.remove(ans.size()-1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        arr=new ArrayList<>();    // step 2
        ArrayList<Integer> ans=new ArrayList<>();
        helper(0,nums,ans);
        return arr;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        SubSet_Integer onj=new SubSet_Integer();  //ya object hai
        List<List<Integer>> result=onj.subsets(nums);
        System.out.println(result);

    }
}
