package Binary_search_29_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer k = Integer.parseInt(scanner.next());
        ArrayList<Integer> list_n = new ArrayList<>();
        ArrayList<Integer> list_k = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list_n.add(scanner.nextInt());
        }
        for (int i = 0; i < k; i++) {
            list_k.add(scanner.nextInt());
        }
        for (int i = 0; i<k; i++){
            if (list_n.contains(list_k.get(i))){
                System.out.println("YES");
            } else
            {
                System.out.println("NO");
            }
        }


    }
}