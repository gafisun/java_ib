package random_words_01_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] intik = in.nextLine().split(" ");
        Integer intik_1 = (int) (Math.random()*intik.length);
        Integer intik_2 = (int) (Math.random()*intik.length);
        System.out.println(intik[intik_1] + " and " + intik[intik_2] + " are the best friends");
    }
}
