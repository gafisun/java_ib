package Arrays_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        Integer exchange;
        for (int i = 0; i < n - 2; i+=4) {
            exchange = list.get(i);
            list.set(i, list.get(i + 2));
            list.set(i + 2, exchange);
        }
        System.out.println(" ");
        for (int i = 1; i < n - 2; i+=4) {
            exchange = list.get(i);
            list.set(i, list.get(i + 2));
            list.set(i + 2, exchange);
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}