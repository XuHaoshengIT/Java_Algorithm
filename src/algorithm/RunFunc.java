package algorithm;

import java.util.Scanner;

public class RunFunc {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();

        System.out.println(Reverse.reverse(num));
        cin.close();
    }
}
