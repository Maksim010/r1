package Calc;

public class Task1_22 {
    public static void main(String[] args) {
        int x=1;
    double y=7*Math.pow(x,2)-3*x+6;
        System.out.printf("y=%f\n",y);
        double h =1.83,r=6350000;
        double l=Math.sqrt((r+h)*(r+h)-r*r);
        System.out.println(l+" метров");

/*Даны два ненулевых числа. Найти сумму, разность, произведение и
        частное их квадратов*/
        int a=2,b=3;
        int sum= a+b;
        System.out.println(sum);
        System.out.println(b-a+" Разность");
        System.out.println(a*b+" Произведение");
        System.out.println((1.*a*a/b/b)+" Частное");
        }
    }

