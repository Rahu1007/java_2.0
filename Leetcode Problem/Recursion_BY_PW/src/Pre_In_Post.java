import java.util.Scanner;
//print zig-zac
public class Pre_In_Post {
    public static void pip(int n){
        if(n==0) return ;
        System.out.println("pre"+n);
        pip(n-1);
        System.out.println("in"+n);
        pip(n-1);
        System.out.println("post"+n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        pip(n);
    }
}
