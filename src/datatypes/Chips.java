package datatypes;

public class Chips {
    public static void main(String[] args) {
        /*
Фишки. Имеется квадратная доска nxn, на крайние поля которой выставлены фишки.
Дано k - количество фишек.
Можно ли разместить все эти фишки, чтобы они заняли все крайние поля доски?
Например, на доску 2x2 можно выставить 4 фишки, а на доску 5x5 - 16.
 */
        int n1 = 7, n2 = n1;
        int k = 20;
        int edgeFields = (n1 + n1) + ((n2 - 2) * 2);
        if (edgeFields == k)
            System.out.println(true);
        else
            System.out.println(false);

        /*
Для трех чисел известна их четность. Определить, будет ли сумма четной.
y = A'B'C + A'BC' + AB'C' + ABC

 */
        int x1=1,x2=3,x3=4;
        boolean b1=x1%2==0;
        boolean b2=x2%2==0;
        boolean b3=x3%2==0;
         if (!b1&!b2&b3 | !b1&b2&!b3 | b1&!b2&!b3 | b1&b2&b3)
             System.out.println("even");
         else
        System.out.println("odd");
/*
Целое число должно делиться на 3 или на 5, при этом не может делиться на 3 и на 5 одновременно и не является при этом четным.
Написать программу для проверки этого условия для заданного числа.
A: делится на 3
B: делится на 5
С: является четным
 */
        int a=18;
if((a%3==0||a%5==0)&&(a%2!=0))
    System.out.println(true);
else
    System.out.println(false);
    }
}
