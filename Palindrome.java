import java.util.*;

public class Palindrome {

    public static boolean isPallindrome(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // not a [pallindrome]
                return false;
            }

            // return true;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPallindrome(str));

    }

}
