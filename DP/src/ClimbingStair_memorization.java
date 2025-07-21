import java.util.Arrays;

public class ClimbingStair_memorization {
    public static  int CS_by_Memo(int n,int ways[]){
        if(n<=2) return n;
        if(ways[n]!=-1){   // already calculate
            return ways[n];
        }
        ways[n]= CS_by_Memo(n-1,ways)+CS_by_Memo(n-2,ways);
        return ways[n];
    }
    public static void main(String[] args) {
        int n=7;


        int ways[]=new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(CS_by_Memo(n,ways));

    }
}

//n+1
//Aur tum soch rahe ho: n+1 kyun kara array ke size ke liye?
//
//👇 Simple Explanation:
//Agar n = 5, to tumhare program ko ways[0] se leke ways[5] tak values store karni hongi — total 6 values.
//
//Java me array index 0 se start hota hai, isliye agar tumhe n tak ke elements chahiye (like ways[0], ways[1], ..., ways[n]), to array ka size n+1 lena padta hai.
//
//📦 Visualization:
//int[] ways = new int[6];  // if n = 5
//Ye array ways[0] to ways[5] tak indices allow karega.
//
//Agar tum sirf new int[n] likhte (matlab new int[5]), to tum ways[5] ko access nahi kar paate — error aa jaata: ArrayIndexOutOfBoundsException.

//Bahut acha sawal hai! Tumne ye line likhi hai:
//
//java
//Copy
//Edit
//Arrays.fill(ways, -1);
//Ab samjhte hain iska matlab aur kyun use kiya gaya hai.
//
//📌 Arrays.fill(ways, -1) ka matlab:
//Ye line poore ways[] array ke har index me -1 daal deti hai.
//
//Example:
//
//Agar ways array me 6 elements hain (like ways[0] to ways[5]), to ye line sabko -1 kar degi:
//
//pgsql
//Copy
//Edit
//Before: [0, 0, 0, 0, 0, 0]   // Java default int = 0
//After:  [-1, -1, -1, -1, -1, -1]
//🧠 Kyun kiya gaya hai?
//Memoization me hum check karte hain:
//
//java
//Copy
//Edit
//if (ways[n] != -1)
//Ye line check karti hai:
//"Kya ways[n] pehle se calculate ho chuka hai?"
//
//Agar ways[n] == -1, matlab abhi tak calculate nahi hua, to calculate karo.
//
//Agar ways[n] != -1, to use stored value (repeat calculation mat karo).
//
//🔍 Agar Arrays.fill() nahi karte to kya hota?
//By default Java me int[] ka har value hota hai 0.
//To fir tumhare code ko ye samajhna mushkil ho jaata ki:
//
//ways[n] == 0 ka matlab kya hai? Kya answer 0 hai? Ya abhi calculate nahi hua?
//
//Is confusion ko door karne ke liye hum -1 set karte hain — ek clearly invalid value, jo batati hai ki abhi kuch store nahi hua