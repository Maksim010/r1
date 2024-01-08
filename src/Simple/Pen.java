package Simple;

public class Pen {
    private Color color; //Класс (перечисление), объект
    //private (в пределах класса),
    // protected (в пределах этого и дочерних классов),
    // (default) (в пределах файла)
    //public (в пределах пакета)

    @Override
    public String toString() {
        return "Pen{" +
                "color=" + color +
                '}';
    }

    Pen(Color color){
        this.color=color;
    }

}

