public class FibonaciBasic {
        static int fibonaci(int n){
            if(n==0 || n==1){
                return n;
            }
            return fibonaci(n-1)+fibonaci(n-2);
        }
        public static void main(String[] args) {
            for(int i=0;i<=10;i++) {
                System.out.print(" "+fibonaci(i));
            }
        }
    }

