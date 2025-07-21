class ArrayExample{
    void multiDArray(){
        System.out.println("example of multiDarray");
        int [][] arr1={{56,43,21},{23,43,44},{13,93}};
        System.out.println(arr1[0][0]);
        System.out.println(arr1[0][1]);
        System.out.println(arr1[0][2]);
        System.out.println(arr1[1][0]);
        System.out.println(arr1[1][1]);
        System.out.println(arr1[1][2]);
        System.out.println(arr1[2][0]);
        System.out.println(arr1[2][1]);
    }
    void demoArray(){
        int [] arr= new int[3];
        float [] weights= new float[3];
        String [] names= new String[3];

        arr[0]=23;
        arr[1]=34;
        arr[2]=45;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }

}



public class Array1 {
    public static void main(String[] args) {
        ArrayExample ex= new ArrayExample();
        ex.demoArray();
        ex.multiDArray();
    }
}
