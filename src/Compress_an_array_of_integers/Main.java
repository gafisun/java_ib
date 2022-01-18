package Compress_an_array_of_integers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        for (int i = 0; i < n; i++) {
            if (list.get(i) == "") {
                list.remove(i);
                list.add("");
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
