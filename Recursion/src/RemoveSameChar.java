import java.util.Scanner;

public class RemoveSameChar {
    //first method
    static String RecursionString(String s,int idx){
//base case
        if(idx==s.length()) {
            return " ";
        }
        //recursve work
        String smallans=RecursionString(s,idx+1);
        char currentchar =s.charAt(idx);
        //self work
        if(currentchar!='a'){
            return currentchar+smallans;
        }else{
            return smallans;
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String s=sc.nextLine();
        System.out.println(RecursionString(s,0));
       }
}
