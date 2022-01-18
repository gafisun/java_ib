package factorial_of_n;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s_n = scanner.nextLine();
        Integer n = Integer.parseInt(s_n);
        Integer factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}