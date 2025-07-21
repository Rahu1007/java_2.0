import java.util.Scanner;
public class AlternateSum {
        static int Alternatingsum(int n){
            if(n==0){    // base case
                return 0;
            }
            if(n%2==0){
                return Alternatingsum(n-1)-n;
            }
            else {
                return Alternatingsum(n-1)+n;
            }

        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("enter thr number");
        int n=sc.nextInt();
     //   Alternatingsum(n);
        System.out.print(Alternatingsum(n));

    }
}
