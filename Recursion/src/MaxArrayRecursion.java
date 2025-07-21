public class MaxArrayRecursion {
    static int MaxArray(int arr[] ,int idx){
        if(idx==arr.length-1){  //base case
            return arr[idx];
        }
        int smallAns=MaxArray(arr,idx+1);
        return Math.max(arr[idx],smallAns);
    }
    public static void main(String[] args) {
int arr[]={3,10,13,2,51};
//MaxArray(arr,0);
        System.out.println(MaxArray(arr,0));
    }
}
