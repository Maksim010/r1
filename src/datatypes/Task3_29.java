package datatypes;

public class Task3_29 {
    public static void main(String[] args) {
        int x=5,b=12,z=4;
        boolean b1=(x%2==1)&&(b%2==1);
        boolean b2=(x<20)^(b<20);
        boolean b3=(x==0)||(b==0);
        boolean b4=(x<0)&&(b<0)&&(z<00);
        boolean b5=(x%5==0)^(b%5==0)^(z%5==0);
        boolean b6=(x>100)||(b>100)||(z>100);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);


    }
}