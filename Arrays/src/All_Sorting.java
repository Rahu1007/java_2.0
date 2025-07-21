/*
public class All_Sorting {
    public static void BubbleSort(int arr[]){
    for(int turn=0;turn<arr.length-1;turn++){
        for(int j=0;j<arr.length-1-turn;j++){
            if(arr[j]>arr[j+1]){                //current element > next element
               //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    }
    public static void Printarr(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    int arr[]={5,4,1,2,3};
        BubbleSort(arr);
        Printarr(arr);
    }
}
*/

/*
public class All_Sorting {
    public static void SelectionSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++) {   // counting for turns
            int minimum = i;                        // minimum = current
            for(int j = i + 1; j < arr.length; j++) { // unsorted part of arr is searched
                if(arr[minimum] > arr[j]) {         // find the minimum element
                    minimum = j;
                }
            }
            int temp = arr[minimum];                // swap the minimum with the current element
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        SelectionSort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/


//import java.util.Arrays;
//import java.util.Collections;
//
//public class All_Sorting {                                  //Insertion sort ,inbulid sort or collection sort
//    public static void InsertionSort(/*int*/ Integer arr[]){
//        for(int i=1;i< arr.length;i++){
//            int current=arr[i];
//            int prev=i-1;
//            //finding the current position
//            while (prev>=0 && arr[prev] > arr[current]){ //ascending and also convert in decending arr[prev] < arr[current]
//                arr[prev+1]=arr[prev];
//                prev--;
//            }
//            //insertion
//            arr[prev+1]=arr[current];
//        }
//    }
//    public static void main(String[] args) {
////int
//  Integer arr[]={5,4,1,3,2};
////InsertionSort(arr); //also work
//
//        //Arrays.sort(arr,0,3);//also work this line
//      //  System.out.println(Arrays.toString(arr)); //working with Arrays.sort(arr);
//        Arrays.sort(arr, Collections .reverseOrder());
//        System.out.println(Arrays.toString(arr));
//    }
//
//}
/*import java.util.Arrays;
public class All_Sorting {
    public static void CountingSort(int arr[]){
    int larger=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        larger=Math.max(larger,arr[i]);
    }
    int count[]=new  int[larger+1];
     for(int i=0;i<arr.length;i++){
         count[arr[i]]++;
     }
     int j=0;
     for(int i=0;i<count.length;i++){
         while (count[i]>0){
             arr[j]=i;
             j++;
             count[i]--;
         }
     }
    }
    public static void main(String[] args) {
        int  arr[]={5,4,1,3,2};
     CountingSort(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}*/
//
//public class All_Sorting {
//    public static void Merge(int arr[],int mid ,int si,int ei) {
//        int merged[]=new int[ei-si+1];
//        int idx1=si;
//        int idx2=mid+1;
//        int x=0;
//        while (idx1<=mid && idx2<=ei){
//            if(arr[idx1] <=arr[idx2]){
//                merged[x++]=arr[idx1++];
//            }else {
//                merged[x++]=arr[idx2++];
//            }
//        }
//        while (idx1 <=mid){
//            merged[x++] = arr[idx2++];
//        }
//        for(int i=0,j=si,i<merged.length;i++,j++){
//            arr[j]=merged[i];
//        }
//    }
//    public static void Divide(int[] arr, int mid, int si){
//     if(si>ei){
//         return;
//     }
//        mid = si + (ei- si) / 2;
//     Divide(arr,si,mid);
//     Divide(arr,mid+1,ei);
//     Merge(arr,si,mid,ei);
//
//
//    }
//    public static void main(String[] args) {
//        int arr[]={6,3,9,5,2,8};
//        Divide(arr,0,n-1);
//        for(int i=0;i< arr.length;i++){
//            System.out.println(arr[i]+" ");
//        }
//        System.out.println();
//    }
//
//}