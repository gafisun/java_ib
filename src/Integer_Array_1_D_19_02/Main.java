package Integer_Array_1_D_19_02;

import java.util.ArrayList;
import java.util.Scanner;

//1) Given a 1D integer array, the program will iterate
//(step through it) through the array and find
//the difference between an element and the one immediately preceding
//it, then write those differences into another array,
//e.g. if the array holds [3,6,1,23],
//the resulting array will be [3,-5,22]
//from 6-3, 1-6, 23-1
//The program will then output the resulting array of differences.
//Also create a trace table.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] intik = in.nextLine().split(" ");
        ArrayList<Integer> listik = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        for(String j:intik){
            listik.add(Integer.parseInt(j));
        }
        for (int i = 0; i<listik.size()-1;i=i+1){
            System.out.print((listik.get(i+1)- listik.get(i)) + " ");
        }
    }
}
