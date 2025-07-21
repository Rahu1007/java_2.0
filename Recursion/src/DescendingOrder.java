import java.util.Scanner;
public class DescendingOrder {
        static void printDeacreasing(int n){
            if(n==1){
                System.out.print(n);
                return;
            }
            //self work
            System.out.println(n);
            //recursion work
            printDeacreasing(n-1);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            printDeacreasing(n);
        }
}
