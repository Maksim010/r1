package Calc;

public class Chinese {
    public static void main(String[] args) {


        String[] yearsName = {"Крыса", "Бык", "Тигр", "Кролик", "Дракон", "Змея", "Лошадь", "Овца", "Обезьяна", "Петух", "Собака", "Свинья"};
        int yearStart = 2020;int index=0;
        int year = 2023;
        if (year > yearStart) {
            index = (year - yearStart) % 12;
        }
        else {
            index=12-(yearStart-year)%12;
        }
        System.out.println(yearsName[index]);
    }
}
