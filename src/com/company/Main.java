package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args){
int[] a = {17, 21, 33, 38, 55, 60, 72, 88, 94};
int tr;
int intik = 72;
tr = binarySearch(a, intik);
        }
    public static int binarySearch(int[] a, int key)
    {
        int left = 0;                           // Establish the initial
        int right = a.length - 1;               // endpoints of the array

        while(left <= right)                    // Loop until endpoints cross
        {
            int midpoint = (left + right) / 2;  // Compute the current midpoint
            if(a[midpoint] == key)              // Target found; return its index
                return midpoint;
            else if(a[midpoint] < key)          // Target to right of midpoint
                left = midpoint + 1;
            else                                // Target to left of midpoint
                right = midpoint - 1;
        }
        return -1;                              // Target not found
    }


}






