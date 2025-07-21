class max{
    void maxValue() {
        int arr[] = {1, 5, 3};
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        System.out.println(maxi);
    }
}



public class MaxofArray {
    public static void main(String[] args) {
        max obj=new max();
        obj.maxValue();
    }
}
