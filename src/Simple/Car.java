package Simple;

public class Car {
    public Car(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private Color color=Color.GRAY;
    public Car(){

    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                '}';
    }
}
