package Cycles;

import java.util.Random;

public class Cat {
    //Кот перемещается короткими бросками (по 5-7 шагов) по лесной тропинке.
    //За сколько перебежек он преодолеет расстояние в 50 шагов?
    public static void main(String[] args) {
        Random random=new Random();
        int a=0,counter=0;
        while(a<50){
            int b= random.nextInt(3)+5;
            a+=b;
            counter++;
        }
        System.out.println(counter);

    }
}
