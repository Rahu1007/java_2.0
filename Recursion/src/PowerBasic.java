public class PowerBasic {
    static int Power(int p,int q){
        if(q==0){
            return 1;
        }
        return (int) (Math.pow(p,q-1)*p);
    }
    public static void main(String[] args) {
        System.out.print(Power(5,3));
    }
}
