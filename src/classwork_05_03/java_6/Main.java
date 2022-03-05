package classwork_05_03.java_6;

public class Main {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 5, 0, 9, 8, 7, 6};
        Integer temp;
        for (int x = 0; x< a.size(); x=x+1){
            if (a[x] > a[x+1]){
                temp = a[x+1];
                a[x+1] = a[x];
                a[x] = temp;
            }
        }
    }
}
