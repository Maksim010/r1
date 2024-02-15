package Collections;

import java.util.*;

public class Class {
//Имеется список книг. Вывести книги до определенного года издания и в отсортированном порядке.
    public static void main(String[] args) {


       ArrayList<Book> books=new ArrayList<>();


        books.add(new Book("Def",2000));

        books.add(new Book("Abc",1999));
        books.add(new Book("Ghi",1971));


       Comparator<Book>compYear=Comparator.comparing(book -> book.getYear());
       Collections.sort(books,compYear);

        for(Book book:books)
            if(book.getYear()<=1999)
                System.out.println(book);

    }
}
class Book implements Comparator<Book> {
   private String name;

    public int getYear() {
        return year;
    }

    private int year;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getYear()>o2.getYear())
            return 1;
        if(o1.getYear()<o2.getYear())
            return -1;
        return 0;
    }
}
