package _01_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        ArrayList<Integer> list_n = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < n; i += 1) {
            list_n.add(scanner.nextInt());
        }
        HashSet<Integer> list_u = new HashSet<Integer>();
        for (int i = 0; i < n; i += 1) {
            list_u.add(list_n.get(i));
        }

        for (Integer i : list_u) {
            for (Integer j : list_n) {
                if (i == j) {
                    c += 1;
                }
            }
            System.out.println(i + " - " + c);
            c = 0;
        }
    }
}