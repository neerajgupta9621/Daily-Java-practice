package CollectionFramework;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your String: ");
        String userStr =sc.next();

        for (char ch : userStr.toCharArray()) {
            unique.add(ch);
        }
        System.out.printf("your String has %d unique charctars ", unique.size());
    }
}
