package Cycles;

import java.util.Random;

public class Task5_1 {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i=0;i<9;i++){
            int number= random.nextInt( 18)+3;
            System.out.println((number)+" ");
        }
        for(int i=0;i<9;i++){
            System.out.print("1th: "+ (i+1));
            System.out.println(" 2th:" +(9-i));
        }
        for(int i=0,j=0;i<9&&j<9 ;i++,j+=2){
            System.out.println(i+" "+j);

        }
       int i,j;
        for( i=0;i<9;i+=2) {
            System.out.print(i);






    }
}}
