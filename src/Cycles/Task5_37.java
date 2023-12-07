package Cycles;

public class Task5_37 {
    public static void main(String[] args) {
        double x = 2;
        double sum = 1;
        int sign = -1;
        double pow = x;
        for (int i = 1; i <= 10; i++) {
            double a = pow * sign * (i + 1) / (i + 2);
            sign *= -1;
            sum += a;
            pow *= x;
        }
        System.out.println(sum);
    }
    }

