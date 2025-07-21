import java.util.ArrayList;

public class SubSets {
    static ArrayList<String> arr=new ArrayList<>();
    public static void set(int i,String s,String ans){
        if(i==s.length()){
//            System.out.println(ans);
            arr.add(ans);//2nd way
            return;
        }
        char ch= s.charAt(i);
            //i+n   increse index
        set(i+1,s,ans+ch);   //take
        set(i+1,s,ans);  //not take
    }
    public static void main(String[] args) {
            String s="abc";
            arr=new ArrayList<>();// 2nd way
       set(0,s,"");
        System.out.println(arr);//2nd way
    }
}
