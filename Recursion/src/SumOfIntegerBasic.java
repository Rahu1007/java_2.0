public class SumOfIntegerBasic {
    static  int SumOfInteger(int n){
        if(n>=0 && n<=9){ //base case n<=9 is because single digit is direct answer
            return n;
        }
        return SumOfInteger(n/10) + n%10; // rescursive work
    }
    public static void main(String[] args) {
        System.out.print(SumOfInteger(12345));
    }
}
