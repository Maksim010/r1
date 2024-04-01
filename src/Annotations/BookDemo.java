package Annotations;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.common.value.qual.IntRangeFromPositive;

import java.lang.annotation.*;
import java.lang.reflect.Field;


public class BookDemo{
    public static void main(String[] args) {
        Book book = new Book("null", "null",2010,10);

        BookProcessor bookProcessor = new BookProcessor(book);

        bookProcessor.checkFieldsNonNull();
        bookProcessor.checkPositive();
        bookProcessor.print();

    }
}
@BookAnnotation("long")
class Book{

    @NonNulle
    public String title;
    @NonNulle
    public String author;
    public int year;


    @Positive
    public int pages;

    public Book(String title, String author, int year, int pages) {
        this.title = title;

        this.author
                = author;
        this.year = year;
        this.pages = pages;
    }

    public void printShort(){
        System.out.println("Title: "+title+", author:"+author);
    }

    public void printLong(){
        System.out.println("Title: "+title+", author:"+author+ ", year"+year);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface BookAnnotation{
    public String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NonNulle{}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@ interface Positive{}

class BookProcessor {
    private Book book;

    public BookProcessor(Book book) {

        this.book
                = book;
    }

    public void print() {
        //Java reflection
        Class clazz = Book.class;
        //Получить инфо об аннотации
        Annotation bookAnnotation = clazz.getAnnotation(BookAnnotation.class);

//System.out.println(bookAnnotation);
        if (bookAnnotation instanceof BookAnnotation) {
            if (((BookAnnotation) bookAnnotation).value().equals("short"))
                book.printShort();
            if (((BookAnnotation) bookAnnotation).value().equals("long"))
                book.printLong();
        }

        Annotation[] annotations = clazz.getAnnotations();
    }

    public void checkFieldsNonNull() {
        Field[] fields = book.getClass().getDeclaredFields();
        for (Field field : fields) {
            Annotation annotation = field.getAnnotation(NonNulle.class);
            try {
                if ((annotation != null) && field.get(book) == null)
                    System.err.println("Field " + field.getName() + " cannot be null");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void checkPositive() {
        Field[] fields = book.getClass().getDeclaredFields();
        for (Field field : fields) {
            Annotation annotation = field.getAnnotation(Positive.class);
            try {
                if ((annotation!=null) && (int)field.get(book) < 0) {
                    System.err.println("Field " + field.getName() + " not positive");
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}