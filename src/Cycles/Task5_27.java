package Cycles;

import java.util.Scanner;

public class Task5_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числa  а и b");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++)
            sum+=i;
        System.out.println(sum);
    }
}
