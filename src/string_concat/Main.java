package string_concat;

import java.util.Scanner;

//Given a 1D integer array, the program will iterate (step through it) through the array and
//
//output every element and its preceding and the
//
//following element, if the array holds [3,6,1,23], the output will be "3 is first, 6 is after 3 and below
//
//1, 1 is after 6 and before 23, 23 is last"
//
//You should create flowchart and Java program.
//
//Share results in github.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] intik = in.nextLine().split(" ");
        for (int i = 0; i < intik.length; i = i + 1) {
            if (i == 0) {
                System.out.print(intik[0] + " is first, ");
            } else if (i == intik.length - 1) {
                System.out.print(intik[i] + " is last");
            } else {
                System.out.print(intik[i] + " is after " + intik[i - 1] + " and before " + intik[i + 1] + ", ");
            }
        }
    }
}
