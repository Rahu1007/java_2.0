import java.util.Scanner;

public class Series_sumBasic {
    // alternating sum is varient question
    static int series_sum(int n){
        if(n==0){
            return 0;
        }
        return series_sum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("enter the number");
        int n=sc.nextInt();
        System.out.print("total sum of the number is "+series_sum(n));
    }
}
