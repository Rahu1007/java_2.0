public class ArrayRecursion {
    static void array(int arr[] ,int idx){
        if(idx== arr.length){ //base case
            return;
        }
        System.out.print(" "+arr[idx]); // self work   5
        array(arr,idx+1); // recursive work  6 7 8 9
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,19};
        array(arr,0); // also change index

    }
}
