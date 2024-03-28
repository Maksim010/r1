package Generics;

import java.util.Date;
import java.util.function.Function;

public class MonadDemo {
    public static void main(String[] args) {
Monad <Integer> integerMonad=new Monad<>(1);
        Monad <Integer> stringMonad=integerMonad.bind(p->new Monad<>(p*2));
        Monad <Double> doubleMonad=stringMonad.bind(p->new Monad<>(p.doubleValue()*3));
        System.out.println(doubleMonad.getObj());
    }
}
interface IMonad<T>{
    <U> IMonad<U> bind(Function<T,Monad<U>> f);//Function, BiFunction, Consumer, Predicate, Supplier, BiConsumer
}

class Monad<T> implements IMonad<T>{
    private T obj;

    public Monad(T obj) {
        this.obj = obj;
    }

    @Override
    public <U> Monad<U> bind(Function<T, Monad<U>> f) {
        if (obj == null)
            return new Monad<U>(null);
        return f.apply(obj);
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}