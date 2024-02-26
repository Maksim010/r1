package Text;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
        public static void main(String[] args) {
            //Задать имя файла
            String fileName = "src/Data/text";
            FileWriter fw = null;
            try {
                fw = new FileWriter(fileName,true);
            } catch (IOException e) {
                System.err.println("Не удалось создать файл");
            }
            String s = "Привет, мир!\n";
            try {
                fw.append(s);
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }