public class Knapsack01_Tabulation {

//    public static int kt2(int val[], int wt[], int W) {
//        int n = val.length;
//        int dp[][] = new int[n+1][W+1];
//        // dp table already initialized to 0, so explicit init is not needed
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= W; j++) {
//                int v = val[i-1];   // <-- FIXED index here
//                int w = wt[i-1];
//                if (w <= j) {
//                    int incProfit = v + dp[i-1][j-w];
//                    int exoProfit = dp[i-1][j];
//                    dp[i][j] = Math.max(incProfit, exoProfit);
//                } else {
//                    dp[i][j] = dp[i-1][j];
//                }
//            }
//        }
//        return dp[n][W];
//    }



    public static int kt(int val[],int wt[],int W){
        int n= val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<=n;i++){   //initilize 0th column
            dp[i][0]=0;}
        for(int j=0;j<=W;j++){  //initilizing 0th row
            dp[0][j]=0; }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                int v=val[i-1];    //ith items val
                int w=wt[i-1];     //ith item wt
                if(w<=j){
                    int incProfit=v+dp[i-1][j-w];
                    int exoProfit=dp[i-1][j];
                    dp[i][j]=Math.max(incProfit,exoProfit);
                }else{
//                    int exoprofit
                    dp[i][j]  =dp[i-1][j];
//                    =exoprofit;

                }
            }
        }
        return dp[n][W];

    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int dp[][]=new int[val.length+1][W+1];
        for(int i=0;i< dp.length;i++){
            for(int j=0;j< dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(kt(val,wt,W));
    }
}
