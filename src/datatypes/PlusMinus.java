package datatypes;

public class PlusMinus {
    public static void main(String[] args) {
        double t=1.0;
        String answer =  t>0?"above zero":"below zero";//тернарный оператор
        System.out.println(answer);


        //Дано двузначное число. Определить: одинаковы ли его цифры.
        int number=22;
        System.out.println(number/10==number%10?true:false);


    }
}
