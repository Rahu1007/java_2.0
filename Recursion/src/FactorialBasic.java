public class FactorialBasic {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
//        int fact1=factorial(n-1);
//       int  fact=n*fact1;
//       return fact;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.print(factorial(5));
    }
}