public class Skip_Character {
    public  static char skip(int i, String s, String ans){
        if(i==s.length()) {
            System.out.println(ans);
            return 0;
        }
        if(s.charAt(i)!='a'){
            ans+=s.charAt(i);
            skip(i+1,s,ans);


        }
        return 0;
    }
    public static void main(String[] args) {
        String s="Raghav";
        System.out.println(skip(0,s,""));
    }
}
