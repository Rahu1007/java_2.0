import java.util.Scanner;

public class Binary_String {
    public static void BS(String s,int n){
        int m=s.length();
        if(m==n){
            System.out.println(s);
        return;
        }
        BS(s+0,n);
        BS(s+1,n);
//        if((m==0||s.charAt(m-1)=='0')){
//            BS(s+0,n);
//            BS(s+1,n);
//        }else{
//            BS(s+0,n);
//        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number single digit ");
        int n=sc.nextInt();
        BS("",n);
    }
}
