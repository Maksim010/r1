package Cycles;

import java.util.Scanner;
public class Task5_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс доллар к рублю");
        double course=scanner.nextDouble();
        for(int i=1;i<20;i++) {
            System.out.printf("%d USD=%.2fBYN%n",i,i*course)    ;

        }



    }
}
