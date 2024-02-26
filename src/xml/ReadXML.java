package xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

    public class ReadXML {
        public static void main(String[] args) {
            Book book = null;
            Books books=null;
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(Books.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                books = (Books) jaxbUnmarshaller.unmarshal( new File("src/data/data.books") );
            } catch (JAXBException e) {
                e.printStackTrace();
            }


            System.out.println(books);

        }

    }

