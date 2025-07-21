import java.util.Scanner;
public class AscendingOrder {
    static void incresingnumber(int n){
        if(n==1){
            System.out.print(n);
            return ;
        }
        incresingnumber(n-1);
        System.out.print(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        incresingnumber(n);
    }
}
