package two_words_two_output_19_02;

import java.util.ArrayList;
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
