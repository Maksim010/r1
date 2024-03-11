public class MediatorClass {//посредник

    public static void main(String[] args) {

    }
}
    interface Mediator {

public void response();
public void setTotal(int total);

        }

abstract class Boy {

    protected final MediatorClass mediator;

    public Boy(MediatorClass mediator) {
        this.mediator = mediator;
    }

    public abstract void receive(int count);

    public abstract void request(int count);
}
