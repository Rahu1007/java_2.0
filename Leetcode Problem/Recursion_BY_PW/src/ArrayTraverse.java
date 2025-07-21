public class ArrayTraverse {
    public static void Print(int i,int arr[]){
        if(i== arr.length) return;
        System.out.println(arr[i]);
        Print(i+1,arr);
    }
    public static void main(String[] args) {
        int arr[]={4,5,36,7,21,75,2};
        Print(0,arr);
    }

}
