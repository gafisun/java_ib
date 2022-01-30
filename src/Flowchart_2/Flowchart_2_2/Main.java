package Flowchart_2.Flowchart_2_2;

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
        for (int i = 1; i < n; i++) {
            if (list_n.get(i) > list_n.get(i - 1)) {
                c = c + 1;
            }
        }
        System.out.println(c);
    }
}