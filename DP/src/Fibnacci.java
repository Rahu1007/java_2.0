public class Fibnacci {
    public static int fib(int n ,int f[]){   // memorization
        if(n==0 || n==1) return n;   // base case
        if(f[n]!=0) {// that mean fibnice calculate hua hai
            return  f[n];
        }

        f[n] = fib(n-1,f)+fib(n-2,f);   // recursive call
        // f[n] agar calculate nai hai to usa calculte kro or return kro
        return f[n];
    }

    public static int fibTebulation(int n ){      // ya wala tabulation sa hua hai
        int dp[]=new int[n+1];      // n+1  size hai indexka , yaha pr array bana diya hai tabulation k satha jo ki ek table ka kaam kr raha hai
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];  // ans
    }

    public static void main(String[] args) {
        int n=8;
        int f[]=new int[n+1];   // n+1 size iss lea hai q ki jab hum fibonaci calculate krta hai to n+1 size k liya krta hai
//        System.out.println(fib(n ,f));
        System.out.println(fibTebulation(n));
    }

}
