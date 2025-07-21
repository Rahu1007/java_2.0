import java.util.Scanner;
public class Multipleofnumber {
    static void multipleofnumber(int n,int k){
        //base case
        if(k==1){
            System.out.println(n);
            return;
        }
        //rescursive work
        multipleofnumber(n,k-1);//5 10 15
        //self work
        System.out.println(n*k);//20
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        multipleofnumber(n,k);
    }

}
