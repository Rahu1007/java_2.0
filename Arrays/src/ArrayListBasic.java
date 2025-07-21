import java.util.ArrayList;
//
//public class ArrayListBasic {
//    public static void main(String[] args) {
//        int array[]=new int[5];
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        array[0]=1;
//        array[1]=2;
//        list.add(1);//idx0
//        list.add(2);//idx1
//        list.add(3);//idx2
//        System.out.println(array[0]);
//        System.out.println(list.get(1));
//        System.out.println(array);
//        System.out.println(list);
//
//
//        //for each loop
//        for(int idx:array){
//            System.out.print(idx+" ");
//        }
//        System.out.print(list);
//        list.add(4);//idx3
//        list.add(5);//idx4
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        list.set(1,100);
//        System.out.println(list);
//    }
//}
/*public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        l1.add(11);
        l1.add(12);
        l1.add(13);
        l1.add(14);
        l1.add(15);
    //    for(int i=0;i< l1.size();i++){
      //      System.out.print(" " +l1.get(i));
       // }
        System.out.println("without loop"+l1);
        //print with random index
        l1.add(0,100);
        System.out.println(l1);
        //modification of arrays
        l1.set(0,10);
        System.out.println(l1);
        //remove of array
        l1.remove(3);
        System.out.println(l1);
        //remove the element
        l1.remove(Integer.valueOf(12));
        System.out.println(l1);

        //use String in arrays
        ArrayList a=new ArrayList();
        a.add("how ");
        a.add("your");
        a.add("day");
        System.out.println(a);
    }
}*/

//                  write a program  to reverse the ArraysList
/*
import java.util.Collections;
public class ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(11);
        l1.add(22);
        l1.add(13);
        l1.add(14);
        l1.add(115);
        System.out.println("original list "+l1);
        Collections.reverse(l1);
        System.out.println("after reverse "+l1);
        //ascending order
        Collections.sort(l1);
        System.out.println("ascending order"+l1);
        //decending order
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Decending order "+l1);
        //String of arrayslist
        ArrayList<String > s1=new ArrayList<>();
        s1.add("this ");
        s1.add("is");
        s1.add("programming");
        s1.add("languagea");
        s1.add("java");
        Collections.sort(s1); //ascending order becuz this based on ABCDEFGHIJKLMNOPQRST... letter in alphabet
        Collections.sort(s1,Collections.reverseOrder());
        System.out.println(s1);
    }
}
*/
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
