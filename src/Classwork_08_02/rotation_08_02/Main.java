package Classwork_08_02.rotation_08_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nk = in.nextLine().split(" ");
        Integer n = Integer.parseInt(nk[0]);
        Integer k = Integer.parseInt(nk[1]);
        String[] intik = in.nextLine().split(" ");
        for (int i = k; i < n; i = i + 1) {
            System.out.print(intik[i]+ " ");
        }
        for (int i = 0; i < k; i = i + 1) {
            System.out.print(intik[i] + " ");
        }
    }
}
