package Patterns;

import java.util.ArrayList;

public class OneNutAndTwoBoys {//Медиатор
    public static void main(String[] args) {
        TallBoy mediator = new TallBoy();
        Boy first = new LittleBoy(mediator);
        Boy second = new LittleBoy(mediator);
        mediator.addBoy(first);
        mediator.addBoy(second);
        first.request(5);
        mediator.response();
    }
}

interface Mediator {
    void response();
    void setTotal(int total);
}

abstract class Boy {
    protected final Mediator mediator;

    public Boy(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive(int count);

    public abstract void request(int count);
}

class TallBoy implements Mediator {

    private final ArrayList<Boy> boys;
    private int total = 0;

    public TallBoy() {
        boys = new ArrayList<>();
    }

    public void addBoy(Boy boy) {
        boys.add(boy);
    }

    @Override
    public void response() {
        //let all other  know that this has changed
        int countOfBoys = boys.size();
        int count = total / countOfBoys;
        int remainder = total % countOfBoys;
        for (Boy currBoy : boys) {
            //don't tell ourselves
            currBoy.receive(count);
        }
        System.out.println("Patterns.Mediator: Total count of nuts is " + total + ". " + remainder + " nuts is (are) mine.");
    }

    @Override
    public void setTotal(int total) {

        this.total
                = total;
    }
}

class LittleBoy extends Boy {

    public LittleBoy(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(int count) {
        System.out.println("Patterns.Boy: I got " + count + " nuts. ");
    }

    @Override
    public void request(int count) {
        mediator.setTotal(count);
    }
}
