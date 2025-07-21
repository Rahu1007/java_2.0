/*public class LinearSearchRecursion {
    static Boolean LinearSearch(int arr[] ,int target,int idx){
        //base case
        if(idx>= arr.length){
            return false;
        }
        //self work
        if(arr[idx]==target){
            return true;
        }
        //recursive work
        return LinearSearch(arr,target,idx+1);

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,9};
        int target=10;
        if(LinearSearch(arr,target,0)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
*/
public class LinearSearchRecursion {
    static int LinearSearch(int arr[] ,int target,int idx){
        //base case
        if(idx>= arr.length){
            return -1;
        }
        //self work
        if(arr[idx]==target){
            return idx;
        }
        //recursive work
        return LinearSearch(arr,target,idx+1);

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,9};
        int target=9;
        System.out.println("the index of the target  "+target+" is  = "+LinearSearch(arr,target,0));
    }
}
