package C3;

import java.util.Scanner;

public class Factorial {
    static long a(int n) {
        if (n == 0) return 1;
        return n * a(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n (n >= 0): ");
        int n = sc.nextInt();
        System.out.println(n + "! = " + a(n));
    }
}
