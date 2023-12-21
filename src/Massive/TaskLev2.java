package Massive;

import java.util.Arrays;
import java.util.Random;

public class TaskLev2 {
    //    Сгенерировать возрастающую последовательность.
//    Сгенерировать последовательность в интервале 1..9 и перемешать ее.
//    Найти общие элементы в двух целочисленных массивах.
//    Удалить повторяющиеся элементы из массива.
//            Найти второй (после максимального) по величине элемент массива.
//    Найти все пары элементов массива, чья сумма равна заданному числу.
//    Дано два массива, элементы которых неупорядочены. Сравнить эти два массива.
//    Найти отсутствующее в массиве число.
//    Переместить все нулевые элементы в конец массива, не изменяя при этом порядок остальных элементов.
//    Вывести самую длинную последовательность чисел в массиве, в которой каждый последующий элемент больше
//    предыдущего на единицу. Исходный массив не отсортирован.
//    Найти мажоритарный элемент массива. Мажоритарным назовем такой элемент, число повторений которого в массиве
//    равно n/2, где n - длина массива.
//    Вывести все элементы-лидеры в массиве. Лидером назовем такой элемент, который больше всех элементов справа от него.
//
    public static void main(String[] args) {
        randomUp();//1
        randomInter();//2

    }static void randomUp(){

        int n=10;
        int []arr=new int[n];
        arr[0]=(int)(Math.random()*5)+1;
        for(int i=1;i<n;i++)
            arr[i]=arr[i-1]+(int)(Math.random()*5)+1;
       System.out.println(Arrays.toString(arr));



    }
    static void randomInter() {
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;
        Random random = new Random();
        for (int i = 1; i < arr.length; i++)
            swap(arr, random.nextInt(arr.length), random.nextInt(arr.length));
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=j;
        arr[j]=temp;


    }

}