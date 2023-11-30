package datatypes;

public class Task2_16 {
    public static void main(String[] args) {
        int a=123;
        int once=a%10;
        int twice=(a/10)%10;
        int therd=(a/100)%10;
        int b=twice*100+therd*10+once;
        System.out.println(b);
    }
}
