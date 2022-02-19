package The_Hailstone_problem;
/*The Hailstone problem. The Hailstone Series is generated
using the following high level algorithm:

- Pick a positive number ( 0 or greater )
- If it is odd, triple the number and add one.
- If it is even, divide the number by two.
- Go back to step 2

Input 26:
26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1, 4, 2, 1

Produce a trace table for your Hailstone Series algorithm,
given an input of 17.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] intik = in.nextLine().split(" ");
        Integer x = Integer.parseInt(intik[0]);
        while (x > 1) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = x*3 + 1;
            }
            System.out.println(x);
        }
    }
}
