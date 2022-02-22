package classwork_22_02.method_2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> stringchik = new ArrayList<>();
        String instr = in.nextLine();
        while (!Objects.equals(instr, "exit")){
            stringchik.add(instr);
            instr = in.nextLine();
        }
        for (int i = 0; i < stringchik.size(); i = i + 1) {
            System.out.println(stringchik.get(i));
        }
        for (String out : stringchik) {
            System.out.println(out);
        }

    }
}
