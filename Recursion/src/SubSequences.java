import java.util.ArrayList;

public class SubSequences {
    static ArrayList<String> getsubseqence(String s){
        ArrayList<String > ans= new ArrayList<>();
    //base case
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }

        char ch=s.charAt(0);
        ArrayList<String> smallans=getsubseqence(s.substring(1));
// smallans=["bc","b"."c"," "]
      //  ans=["bc","abc","b","ab","c","ac"]
        for(String ss:smallans){
            ans.add(ss);  // ""
            ans.add(ch+ss);  //a
        }
        return ans;
    }
    public static void main(String[] args) {
            ArrayList<String> ans= getsubseqence("abc");
for(String ss : ans){
    System.out.println(ss);
}
    }
}
