import java.util.*;

public class Longest_SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.next();

        int start = 0;
        int end = 0;
        int max_length = 0;
        List<Character> list = new ArrayList<>();

        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                max_length = Math.max(max_length, list.size());
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        System.out.print("Max length of substring without repeating characters: " + max_length);
    }
}
