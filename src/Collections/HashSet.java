package Collections;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class HashSet {
    //Пользователь вводит натуральные числа, пока не введет ноль.
//Программа выводит массив неповторяющихся чисел, введенных пользователем
        public static void main(String[] args) {
            Set<Integer> hashSet = new java.util.HashSet<>();
            Scanner scanner = new Scanner(
                    System.in
            );
            int number = -1;
            while (number!=0){
                System.out.println("Enter a number: ");
                number = scanner.nextInt();
                hashSet.add(number);
            }
            System.out.println(Arrays.toString(hashSet.toArray()));
            hashSet.forEach(System.out::println);
        }
    }

