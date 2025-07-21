import java.lang.reflect.Array;
import java.util.Arrays;

public class ClimbingStair {

        public static int CS(int n){             // normal  recursion
//          if(n==0) return 1;// ya base case bhe use kr sakta hai
//        if(n<0) return 0;  // ya base case bhe use kr sakta hai
      if(n<=2) return n;
      return CS(n-1)+CS(n-2);

    }




    public static void main(String[] args) {
        int n=3;
        System.out.println(CS(n));  // recursion

//        int ways[]=new int[n+1];
//       Arrays.fill(ways,-1);

    }


}
