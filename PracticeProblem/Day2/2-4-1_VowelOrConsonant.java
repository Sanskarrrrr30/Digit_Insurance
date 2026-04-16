import java.util.*;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
            ch = Character.toLowerCase(ch);

            switch(ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}