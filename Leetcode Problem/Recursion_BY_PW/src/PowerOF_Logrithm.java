import java.util.Scanner;

public class PowerOF_Logrithm {      //time complxity = O(log b)
    public static int Pow(int a,int b){
        if(b==0 ) return 1;    // base case
        int ans=Pow(a,b/2);
        if(b%2==0) return ans*ans;    // agar b even hai to if chala ga
        else return ans*ans*a;//  agar b obb hai to else chala ga
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a (a is a base)");
        int a=sc.nextInt();
        System.out.println("enter the b  (b is a power)");
        int b= sc.nextInt();
        System.out.println(+a+" rais to "+b+ " = "+Pow(a,b));
    }
}
