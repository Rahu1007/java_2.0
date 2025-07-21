/*public class Star_program {
    public static  void main(String [] args){
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
}
*/
/*
public class Star_program {
    public static  void main(String[] args){
        for(int i=1;i<=4;i++){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
            System.out.println("");
        }

    }
}*/
/*
public  class Star_program {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
            System.out.print("*");}
            System.out.println("");
        }

    }
}*/
/*
public class Star_program {
    public static  void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}*/
/*
public class Star_program {
    public  static  void  main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}*/
/*
public class Star_program {
    public  static  void main(String[]args){
        int n=4;
        char ch='A';
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print(ch);
                        ch++;
                    }
                    System.out.println("");
                }
    }
}
 */

//advance pattern

/*
public class Star_program {
    public static  void hollow_rectangle(int total_row,int total_column){
        //outer loop
        for(int i =1;i<=total_row;i++){
            //inner loop - column
            for(int j=1;j<=total_column;j++){
                //cell-(i,j)
                if(i==1||i==total_row ||j==1||j==total_column){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void  main(String [] args){
        hollow_rectangle(7,5);
    }
}*/
/*
public class Star_program {
    public static  void inverted_rotated_half_prymid(int n){
        //outer loop
    for(int i=1;i<=n;i++){
        //inner loop space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i;j++){
        System.out.print("*");}
        System.out.println();
                }
     }
    public static  void main(String[]args){

        inverted_rotated_half_prymid(7);
    }
}*/

/*
public class Star_program {
    public static  void number_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public  static  void  main(String[] args){
number_triangle(5);
    }
}*/
/*
public  class Star_program {
    public static  void FLOYDS_triangle(int n){
        int counter=1;
        //outer loop
        for(int i=1;i<=n;i++){ // kis line mai print kera ga bo i print kera ga
            //inner loop
            for(int j=1;j<=i;j++){// kitne baar print kera ga bo j kera ga
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        FLOYDS_triangle(6);}
}*/
/*
public class Star_program {
    public  static  void zero_one_pattern(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
    public static  void main(String[] args){
    zero_one_pattern(5);
    }
}*/

/*
public  class Star_program {
    public  static  void BUTTERFLY_PATTERN(int n){
      //  1st half
     // outer loop
        for(int i=1;i<=n;i++)
        {
            //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");}
        //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");}
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");}
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");}
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");}
            System.out.println();
        }
    }
    public static  void  main(String [] args){
BUTTERFLY_PATTERN(7);
    }
}*/


/*
public  class Star_program {
    public static  void rhombus_pattern(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){//j<=n then this complete code change into a rombus
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        rhombus_pattern(6);
    }
}*/
/*
public  class Star_program {
    public  static  void hollow_rhombus(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //starts
            for( int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                System.out.print("*");}
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static  void  main(String [] args){
hollow_rhombus(4);
    }
}*/
/*
public class Star_program {
    public static void DIAMOND_pattern(int n){
        //outer loop
        //1st half
        for(int i=1;i<=n;i++){
            //space print
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static  void main(String[] args){
DIAMOND_pattern(6);
    }
}*/

/*
public class Star_program {
    public static void Number_pyramid(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //number
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static  void main(String[] args){
    Number_pyramid(4);
    }
}
*/
/*
public class Star_program {
    public static  void Palindromic_pattern(int n){
        for( int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //descending
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //ascending
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public  static  void main(String[] args){
Palindromic_pattern(5);
    }
}
*/





































//also see this code this ia a hollow diamond pattern not yet complete
//public class Star_program {
//    public static void Hollow_Diamond_Pattern(int n){
//       for(int i=1;i<=n;i++){
//           for(int j=1;j<=n-i;j++){
//               System.out.print(" ");
//           }
//           for(int j=1;j<=2*i+1;j++){
//               if(i==1||i==n||j==1||j==n){
//                   System.out.print("*");
//               }
//               else {
//                   System.out.print(" ");
//               }
//           }
//           System.out.println();
//       }
//    }
//    public static  void main(String[] args){
//        Hollow_Diamond_Pattern(4);
//    }
//}