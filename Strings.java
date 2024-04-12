import java.util.*;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String args[]) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str1 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
        // System.err.println(name.length());

        // Concatanation
        String firstName = "Aaryan";
        String secondName = "Vijay";
        String fullName = firstName + " " + secondName;
        // System.out.println(fullName.charAt(0));
        printLetters(fullName);

    }
}