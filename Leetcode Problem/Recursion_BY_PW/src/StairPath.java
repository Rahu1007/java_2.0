import java.util.Scanner;

public class StairPath {
        public static int S(int n){
            if(n<=2) return n;
            return  S(n-1)+S(n-2);
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of stair");
        int n=sc.nextInt();
        System.out.println(S(n));

    }
}
