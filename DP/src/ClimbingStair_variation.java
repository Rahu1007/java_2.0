import java.util.Arrays;

public class ClimbingStair_variation {
    public static int cs(int n,int ways[]){
        if(n==0) return 1;
        if(n<0) return 0;
//        if(n<=2) return n;
        if(ways[n]!=-1){
            return ways[n];
        }
        return cs(n-1,ways)+cs(n-2,ways)+cs(n-3,ways);

    }
    public static void main(String[] args) {
        int n=5;
        int ways[]=new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(cs(n,ways));
    }
}
