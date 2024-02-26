package Text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "src/Data/text";
       StringBuilder sb=new StringBuilder();
       try (FileReader fr=new FileReader(fileName)){
           System.out.println("Encoding: "+fr.getEncoding());
           fr.read();
           int i;
           while ((i= fr.read())!=-1)
           sb.append((char)i);


       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
        System.out.println(sb);
    }
}
