package classwork_19_02.two_words_two_output_19_02;
//2) The program is to ask user for two words and then output
//the first two characters of the first word and
//the last two characters of the second word
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] intik = in.nextLine().split(" ");
        System.out.print(intik[0].charAt(0));
        System.out.print(intik[0].charAt(1) + " ");
        System.out.print(intik[1].charAt(intik[1].length()-2));
        System.out.print(intik[1].charAt(intik[1].length()-1));
    }
}
