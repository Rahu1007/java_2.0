class Loop{
    void multiArray(){
        int [][] arr={{56,32,54},{43,53,76},{43,32,21}};
        for(int i=0;i< arr.length;i++){
            for( int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}


public class LoopArray {
    public static void main(String[] args) {
        Loop arr = new Loop();
        arr.multiArray();
    }
}
