package subarray_08_02;
//The task is to divide an array into two sub-array
//        (left and right) containing n/2 elements each and
//        do the sum of the subarrays and then multiply
//        both the subarrays.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] intik = in.nextLine().split(" ");
        Integer c_1 = 0, c_2 = 0;
        Integer p_1 = 1, p_2 = 1;
        for (int i = 0; i<(intik.length/2); i=i+1){
            c_1 = c_1 + Integer.parseInt(intik[i]);
            p_1 = p_1*Integer.parseInt(intik[i]);
        }
        for (int i = (intik.length/2); i<intik.length; i=i+1){
            c_2 = c_2 + Integer.parseInt(intik[i]);
            p_2 = p_2*Integer.parseInt(intik[i]);
        }
        System.out.println(c_1 +" " +c_2);
        System.out.println(p_1 +" " +p_2);
    }
}
