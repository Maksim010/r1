import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите свое имя");
        String a= scan.nextLine();
        System.out.println("Hello "+a);
    }
}
