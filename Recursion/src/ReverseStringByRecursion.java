import java.util.Scanner;

public class ReverseStringByRecursion {

    static String Reverse(String s,int idx){
        if(idx==s.length()) {
            return " ";
        }
        String smallAns=Reverse(s,idx+1);
        return  smallAns+s.charAt(idx);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String s= sc.nextLine();
        System.out.println(Reverse(s,0));
    }
}
