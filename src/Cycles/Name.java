package Cycles;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name;
       do {
           name=scan.nextLine();
       }
        while (name.isBlank());
    }
}
