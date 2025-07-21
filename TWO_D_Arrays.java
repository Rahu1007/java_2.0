import java.util.Scanner;
/*
public class TWO_D_Array {
                                                       searching any value in matrix
//    public static boolean Search(int matrix[][],int key){
//        for(int i=0;i<matrix.length;i++){ // matrix.length=row
//            for(int j=0;j<matrix[0].length;j++){  //matrix[0].length = coloum
//                if(matrix[i][j]==key){
//                    System.out.println("found at cell ("+i+","+j+")");
//                    return  true;
//                }
//            }
//        }
//        System.out.println("found is fail");
//        return false;
//    }

            //                                                                     two D matrix creating problem
    public static void main(String[] args) {
        System.out.println("enter the matrix value ");
    int matrix[][]=new int[3][3];
    int n=3,m=3;
    //int n=matrix.length,m=matrix[0].length;  row and coloum respectively
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){   //row wise move
            for(int j=0;j<n;j++){   // coloum wise move
                matrix[i][j]=sc.nextInt();
            }
        }
        //output start from hera
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


        //searching
      //  Search(matrix,10);
    }
}
*/
//                                              spiral matrix
//
//public class TWO_D_Array {
//    public static void Spiral(int matrix[][]){
//        int startRow=0;
//        int startColum=0;
//        int endRow= matrix.length-1;
//        int endColum=matrix[0].length-1;
//        while (startRow <= endRow && startColum <= endColum){
//            //top
//            for(int j=startColum;j<=endColum;j++){
//                System.out.print(matrix[startRow][j]+" ");
//            }
//            //right
//            for(int i=startRow+1;i<=endRow;i++){
//                System.out.print(matrix[i][endRow]+" ");
//            }
//            //bottom
//            for(int j=endColum-1;j>=startColum;j--){
//                if(startRow==endRow){
//                    break;
//                }
//                System.out.print(matrix[endRow][j]+" ");
//
//            }
//            //left
//            for(int i=endRow-1;i>=startRow+1;i--){
//                if(startColum==endColum){
//                    break;
//                }
//                System.out.print(matrix[i][startColum]+" ");
//            }
//            startRow++;
//            endRow--;
//            startColum++;
//            endColum--;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        int matrix[][]={
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//        };
//Spiral(matrix);
//    }
//}


/*                                                                          spiral matrix
public class TWO_D_Array {
    public static int[][] generateMatrix(int n) {
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int counter = 1;
        int[][] arr = new int[n][n];
        while(counter <= (n*n)){
            for(int i = left; i <= right && counter <= (n*n); i++){
                arr[top][i] = counter++;
            }
            for(int i = top+1; i <= bottom && counter <= (n*n); i++){
                arr[i][right] = counter++;
            }
            for(int i = right-1; i >= left && counter <= (n*n); i--){
                arr[bottom][i] = counter++;
            }
            for(int i = bottom-1; i >= top+1 && counter <= (n*n); i--){
                arr[i][left] = counter++;
            }
           // System.out.println(generateMatrix(3));
            top++;
            bottom--;
            left++;
            right--;
        }
        return arr;
    }
    public static void printMatrix(int [][] matrix){
        for(int[] row :matrix){
            for(int value :row){
                System.out.print(value+" \t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix= generateMatrix(4);
        printMatrix(matrix);
    }
}
*/
/*                                                                      digonal sum
public class TWO_D_Array {
    public static int DigonalSum(int matrix[][]){
        int sum=0;
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                if(i==j){
//                    sum+= matrix[i][j];
//                } else if (i+j==matrix.length-1) {
//                    sum+=matrix[i][j];
//                }
//            }
//        }
//return  sum;
        for(int i=0;i<matrix.length;i++) {
        sum+=matrix[i][i];
        if(i!=matrix.length-1-i)
sum+=matrix[i][matrix.length-i-1];
        }
return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}   };
        System.out.println(DigonalSum(matrix));
    }
}*/
/*
public class TWO_D_Array {
    public static int diagonalSum(int matrix[][]) {
            int sum=0;
            int n=matrix.length;
            for(int r=0,c=0;r<n;r++,c++){ //row =r,colum=c
                sum+=matrix[r][c];
            }
            for(int r=0,c=n-1;r<n;r++,c--){
                if(r!=c)
                    sum+=matrix[r][c];
            }
            return sum;
        }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
       int result = diagonalSum(matrix);
        System.out.println("Diagonal Sum: " + result);
}
}*/

/*
public class TWO_D_Array {
    public static boolean StairCase_Search(int matrix[][],int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found at (" + row + "," + col + ")");
                return true;
            }
    else if (key < matrix[row][col]) {
            col--;
        } else {
            row++;
        }
    }
        System.out.println("key not found ");
    return false;

    }
    public static void main(String[] args) {
int [][]matrix={
        {10,20,30,40},
        {15,25,35,45},
        {27,29,37,48},
        {32,33,39,50}
};
int key=33;
StairCase_Search(matrix,key);
    }
}*/

/*public class TWO_D_Arrays {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top=0;
        int n=matrix.length-1;
        while(top<=n){
            int mid=(top+n)/2;
            if(matrix[mid][0]<target && matrix[mid][matrix[mid].length-1]>target){
                break;
            }else if(matrix[mid][0] > target){
                n=mid-1;
            }else {
                top =mid+1;
            }
        }
        int row=(top+n)/2;
        int left=0;
        int right=matrix[row].length-1;
        while(left <= right){
            int mid =(left + right)/2;
            if(matrix[row][mid]==target){
                return true;
            }else if(matrix[row][mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TWO_D_Arrays obj = new TWO_D_Arrays();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;

        boolean result = obj.searchMatrix(matrix, target);
        System.out.println("Target found: " + result);
    }
}



*/