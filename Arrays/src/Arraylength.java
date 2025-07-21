import java.util.Arrays;

public class Arraylength {
    public static void main(String[] args) {
        String str= Arrays.toString(new String[]{"hello", "world"});
        int length = str.length();
        System.out.println("Length of the array: " + length);

    }
}
