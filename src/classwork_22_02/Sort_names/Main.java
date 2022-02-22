//package classwork_22_02.Sort_names;
////        Sort names that reads a list of names and puts them into alphabetically
////        order using the selection sort algorithm.
////
////        Below is the selection sort algorithm used to sort an array of integers.
//
//import java.util.Scanner;
//
////        Complete the method selectionSort.
////        Modify the algorithm so that it will sort an ArrayList of Strings.
////        You will need to use the following ArrayList methods in your implementation:
////        Object get(int index)
////        void set(int index, Object element)
////
////        You will also need to use the String class's compareTo method
////        int compareTo(Object obj)
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String[] intik = in.nextLine().split(" ");
//        void selectionSort(int numbers[]) {
//            int i, j;
//            int min, temp;
//
//            for (i = 0; i < numbers.length-1; i++) {
//                min = i;
//                for (j = i+1; j < numbers.length; j++) {
//                    if (numbers[j] < numbers[min])
//                        min = j;
//                }
//                // swap
//                temp = numbers[i];
//                numbers[i] = numbers[min];
//                numbers[min] = temp;
//            }
//        }
//    }
//
//
//}
