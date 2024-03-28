package Generics;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;

public class BoundedDemo {
    public static void main(String[] args) {
        MBBounded<Animal> mbBounded=new MBBounded<>(new Cat());

        //wildcard
        MBBounded<?> mbBounded1=new MBBounded<Animal>(new Bird());

        MBBounded<? extends Bird> mbBounded2=new MBBounded<Bird>(new WhitePigeon());

        MBBounded<? super Pigeon> mbBounded3=new MBBounded<Bird>(new WhitePigeon());
    }
}
class MBBounded <T extends Animal>{
    private T Object;

    public MBBounded(T object) {
        Object = object;
    }

    public T getObject() {
        return Object;
    }
}