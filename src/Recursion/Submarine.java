package Recursion;

public class Submarine {
    public static void main(String[] args) {
        submarine(0);
    }
    static void submarine(int depth){//используем аргумент для контроля рекурсивных вызывов
        if(depth==5)
            return;//выход из рекурсии
        System.out.println("hi "+depth);
//        System.out.println("hi "+depth);
        submarine(depth+1);//вызов рекурсии
        System.out.println("hi "+depth);
    }
}
