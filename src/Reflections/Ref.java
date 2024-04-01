package Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ref {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {


        Method sum=Calc.class.getMethod("sum",int.class,double.class);
        Calc calc=new Calc();
        double res= (double) sum.invoke(calc,1,2);
        System.out.println(res);


        Method mult=Calc.class.getMethod("mult",float.class,long.class);
        Calc calc1=new Calc();
        double res1= (double) mult.invoke(calc1,1.123f,2);
        System.out.println(res1);


        Method and = Calc.class.getDeclaredMethod("and", boolean.class, boolean.class);
        and.setAccessible(true); //???
        boolean res3 = (boolean)and.invoke(calc,true, true);
        System.out.println(res3);

    }
    }
    //Класс, в котором содержатся методы с различным доступом и аргументами
    class Calc{

        public double sum(int a, double b) {
            return a + b;
        }

        public static double mult(float a, long b) {
            return a * b;
        }

        private boolean and(boolean a, boolean b) {
            return a && b;
        }

        protected int max(int a, int b) {
            return a > b ? a : b;
        }
}
