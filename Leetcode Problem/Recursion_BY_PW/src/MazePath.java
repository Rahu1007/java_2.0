import java.util.Scanner;

public class MazePath {   // leetcode 62
    public static int Maze_path1(int row,int col,int m,int n){
        if(row==m || col==n) return 1;
        int RW=Maze_path1(row,col+1,m,n);
        int DW=Maze_path1(row+1,col,m,n);
        return RW+DW;
    }
    public static int Maze_Path(int m,int n){ //easy method but TLE
        if(m==1||n==1) return 1 ;
        int RW=Maze_Path(m,n-1);
        int DW=Maze_Path(m-1,n);
        return RW+DW;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the m");
        int m=sc.nextInt();
        System.out.println("enter the n");
        int n=sc.nextInt();
//        System.out.println(Maze_Path(m,n));
        System.out.println(Maze_path1(1,1,m,n));
    }
}
