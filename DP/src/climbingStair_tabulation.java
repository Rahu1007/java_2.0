public class climbingStair_tabulation {
    public static  int CS1(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1]+0;
            }else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
                int n=5;
        System.out.println(CS1(n));
    }
}





//🧠 Pehle context samjho:
//Yeh problem bhi Climbing Stairs ki hai — jisme har step pe tum ya to 1 step ya 2 step chadh sakte ho.
//
//Tumne Tabulation (Bottom-Up DP) approach use kiya hai.
//java
//Copy
//Edit
//int dp[] = new int[n + 1];
//dp[0] = 1;
//dp[i] ka matlab hai: number of ways to reach step i.
//
//dp[0] = 1 ka matlab hai: 0th step tak pahunchne ka ek hi tareeka hai — kuch mat karo (base case).
//
//🧩 Ab aati hai important line:
//java
//Copy
//Edit
//if(i == 1){
//    dp[i] = dp[i - 1] + 0;
//}
//Yeh likhne ka matlab:
//
//Jab hum step 1 pe pahuchne ki baat karte hain (i == 1),
//to sirf ek hi way hota hai — 0th step se 1 step chadh jao.
//
//To tum dp[1] = dp[0] + 0 kar rahe ho.
//
//Lekin + 0 likhna zaroori nahi hai. Ye simply:
//java
//Copy
//Edit
//dp[i] = dp[i - 1];
//bhi likh sakte ho.
//
//Yani: step 1 tak sirf ek tareeka hai — step 0 se ek kadam me aana.
//
//🚀 For steps ≥ 2:
//java
//Copy
//Edit
//dp[i] = dp[i - 1] + dp[i - 2];
//Tum i-1 step se ek kadam me aa sakte ho,
//
//Ya i-2 step se 2 kadam me aa sakte ho.
//Dono ke combinations mila ke total ways milte hain.