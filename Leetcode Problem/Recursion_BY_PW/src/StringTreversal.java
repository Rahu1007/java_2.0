public class StringTreversal {
    public static  void String1(int i,String s){
        if(i==s.length()) return;
        System.out.println(s.charAt(i));
        String1(i+1,s);
    }
    public static void main(String[] args) {
        String s="Raghav";
        String1(0,s);

    }
}
