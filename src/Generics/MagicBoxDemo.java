package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class MagicBoxDemo {
    public static void main(String[] args) {
        MagicBox magicBox=new MagicBox();
        magicBox.setObject(1);
        magicBox.setObject("asd");
        magicBox.setObject(new ArrayList<String>(Arrays.asList("hocus","pocus","spell")));
        magicBox.setObject(new MagicBox());
        System.out.println(magicBox.getObject());

        Object object=magicBox.getObject();
        System.out.println(object.getClass());

        Class o= magicBox.getClass();//рефлексия
        System.out.println(o);//рефлексия


        MagicBoxGeneric<Integer> magicBoxGeneric=new MagicBoxGeneric<>();
        magicBoxGeneric.setObject(1);
        System.out.println(magicBoxGeneric.getObject());


        MagicBoxGeneric<MagicBoxGeneric<Integer>> magicBoxGeneric1=new MagicBoxGeneric<>();
        magicBoxGeneric1.setObject(new MagicBoxGeneric<>());
        magicBoxGeneric1.getObject().setObject(1);
        System.out.println(magicBoxGeneric1.getObject().getObject());
    }
}
class MagicBox{//контейнер
    private Object object;


    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "MagicBox{" +
                "object=" + object +
                '}';
    }
}

class MagicBoxGeneric<T>{//дженерик класс
    private T object;
    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }


}
