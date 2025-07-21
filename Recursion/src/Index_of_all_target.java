public class Index_of_all_target {
    static void FindAllIndex(int arr[],int target,int idx)
    {        //base case
        if(idx==arr.length){
            return;
        }
        //self work
        if(arr[idx]==target){
            System.out.println(idx);
        }
        //recursion work
        FindAllIndex(arr,target,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,4,4,5,6};
        int target=4;
        FindAllIndex(arr,target,0);
    }
}
