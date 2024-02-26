package xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;

public class WriteXML {
    public static void main(String[] args) {
        Book book=new Book();
        book.setId(123214214L);
        book.setName("Name");
        book.setDate(new Date());

        Books books = new Books();

        books.addBook(book);

        Book book2 = new Book();
        book2.setId(2L);
        book2.setName("Name 2");
        book2.setDate(new Date());

        books.addBook(book2);

        Book book3=new Book();
        book3.setId(3l);
        book3.setName("Name 3");
        book3.setDate(new Date());

        books.addBook(book3);

        try {
            JAXBContext context=JAXBContext.newInstance(Books.class);
            Marshaller marshaller=context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(books,new File("src/data/data.books"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
