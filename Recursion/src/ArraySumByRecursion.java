public class ArraySumByRecursion {
    static int ArraySum(int arr[] ,int idx){
        //base case
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallAns=ArraySum(arr,idx+1);
        return smallAns+arr[idx];

    }
    public static void main(String[] args) {
    int arr[]={2,3,5,20,1};
        System.out.println(ArraySum(arr,0));
    }
}
