package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceScript = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to search for?:");

        String searchTerm = input.nextLine();
        int result = aliceScript.toLowerCase().indexOf(searchTerm.toLowerCase());
        int searchTermLength = searchTerm.length();
        System.out.println("Search term found at: " + result + ", length of " + searchTermLength);
        String modifiedScript = aliceScript.replace(searchTerm, "");
        System.out.println(modifiedScript);
    }
}
