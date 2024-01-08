package Simple;

public class Demo {
    public static void main(String[] args) {
        Pen pen=new Pen(Color.RED);
        System.out.println(pen);
        Car car=new Car();
        System.out.println(car);
        car.setColor(Color.BLUE);
        System.out.println(car);
        Variety variety=Variety.FUJI;
        System.out.println(variety);
        Apple apple=new Apple(0.2,Variety.GALA);
        System.out.println(apple);





    }
}




