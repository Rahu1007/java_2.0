public class Permutaion_string {

    public static void PS(String ans,String s){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            PS(ans+ch,right+left);
        }
    }

    public static void main(String[] args) {
        String s="abcd";
        PS("",s);
    }
}
