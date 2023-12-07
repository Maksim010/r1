package Cycles;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        solve2();
    }

    static void solve1() {
        Scanner scanner = new Scanner(System.in);
        int n = 1;//Чтобы войти в цикл
        while (n > 0) {
            System.out.println("Введите число");
            n = scanner.nextInt();
            // System.out.println(n);
        }

    }

    static void solve2() {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число");
            n = scanner.nextInt();

        }
        while (n>0);
    }
}

