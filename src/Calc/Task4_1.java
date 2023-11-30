package Calc;

public class Task4_1 {
    public static void main(String[] args) {
        double y,x=0;

            y=Math.sin(x)*Math.sin(x);
            y=1-2*Math.sin(x*x);
            if(x>0)
                y=Math.sin(x)*Math.sin(x);
            else
                y=1-2*Math.sin(x*x);
        System.out.println(y);



    }
}
