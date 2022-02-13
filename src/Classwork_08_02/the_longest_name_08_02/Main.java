package Classwork_08_02.the_longest_name_08_02;
//Given a list of names, display the longest name.
//For example: N = 5
//names[] = { "Geek", "Geeks", "Geeksfor",
//  "GeeksforGeek", "GeeksforGeeks" }
//
//Output:
//GeeksforGeeks

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] intik = in.nextLine().split(" ");
        Integer max = 0;
        for (int i = 0; i < intik.length; i = i + 1) {
            if (intik[i].length() > intik[max].length()) {
                max = i;
            }
        }
        System.out.println(intik[max]);

    }
}
