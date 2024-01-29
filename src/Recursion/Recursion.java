package Recursion;

public class Recursion {
     public static int index=0;
    public static void main(String[] args) {

       // recurse();
        //recurse1(0);
        System.out.println(sum(5));
    }
    static void recurse(){
        if(index==5)
            return;//выход из рекурсии
        index++;//Работа рекурсии
        System.out.println("hi");
        recurse();//вызов рекурсии
    }
    static void recurse1(int index){//используем аргумент для контроля рекурсивных вызывов
        if(index==5)
            return;//выход из рекурсии
        System.out.println("hi");
        recurse1(index+1);//вызов рекурсии
    }
    static int sum(int number){
        if(number==0)
            return 0;
        return number+sum(--number);
    }



}
