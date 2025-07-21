import java.util.Scanner;

public class GreatestCommonDivisor {

    static int GCD(int x,int y){
        //method first
        while (x%y!=0){
            int rem =x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    static int gcd(int x ,int y){
        // euclid algo
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x ");
        int x=sc.nextInt();
        System.out.println("enter the value of y");
        int y= sc.nextInt();
       // GCD(x,y);
        System.out.println(GCD(x,y));
        System.out.println(gcd(x,y));

    }

}
