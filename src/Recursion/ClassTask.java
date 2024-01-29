package Recursion;

public class ClassTask {
    /*
Вывести паттерн
1*1=
11*11=
...
Действия выровнять по знаку "равно"
 */
/*
Вывести паттерн
5*5=
5*55=
...
Действия выровнять по знаку "равно"
 */
/*
1*8+1=9
12*8+2=98
...

 */
    public static void main(String[] args) {
       number(6);
    }
        static void number (int index){
            StringBuilder sb=new StringBuilder();
            for (int i=1; i<=index;i++){
                sb.append(i);
                for (int j=1;j<=index-i;j++)
                    System.out.print(" ");
                System.out.printf("%d*8+%d=%d\n",Integer.parseInt(sb.toString()),i,(Integer.parseInt(sb.toString())*8+i));
            }
        }
    }

