import java.util.Scanner;

public class Equlibrim_element {
        public static  void findEquilibriumIndex(int arr[]) {
            int n=arr.length;
            int sum=0;
            int leftsum=0;
            int rightsum=0;
            for(int i=0;i<n;i++){
                sum=sum+arr[i];
            }
            rightsum=sum;
            for(int i=0;i<n;i++){
                rightsum=rightsum-arr[i];
                if(leftsum==rightsum){
                    System.out.println("Equilibrium index found at: " + i);
                }
                leftsum=leftsum+arr[i];
            }
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the "+n+"element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      findEquilibriumIndex(arr);
//        System.out.println(arr[i]);
    }
}

//enter the size of array5
//Enter the 5element
//1 3 5 2 2
//Equilibrium index found at: 2