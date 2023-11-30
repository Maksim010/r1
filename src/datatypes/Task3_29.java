package datatypes;

import java.util.Scanner;

public class Task3_29 {
            public static void main(String[] args) {
                // Создание объекта Scanner для считывания данных от пользователя
                Scanner scanner = new Scanner(System.in);

                System.out.print("Введите год: ");
                int year = scanner.nextInt();

                int daysInYear;

                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    daysInYear = 366;
                } else {
                    daysInYear = 365;
                }

                System.out.println("Количество дней в году: " + daysInYear);
            }
        }