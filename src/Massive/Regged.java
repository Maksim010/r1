package Massive;


import java.util.Arrays;
import java.util.Random;

//отсортировать по кол-ву элементов в подмассиве
public class Regged {
    public static void main(String[] args) {
        int[][] arr;
        Random random = new Random();
        //Задаем случайное количество строк - 3..12
        int rows = random.nextInt(7)+3;
        arr= new int[rows][];
        for (int i=0; i<arr.length; i++) {
            int cols = random.nextInt(7)+1;
            arr[i] = new int[cols];
        }
        print(arr);
    }

    static void print(int[][] arr){
        for (int i=0; i<arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
    }
}
