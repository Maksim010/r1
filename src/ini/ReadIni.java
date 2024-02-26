package ini;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

public class ReadIni {
    public static void main(String[] args) {
        String fileName = "src/data/data.ini";
        File file=new File(fileName);
        try {
            file.createNewFile();
            Wini ini=new Wini(file);
            String name=ini.get("options","name");
            int value= Integer.parseInt(ini.get("sections","value"));
            System.out.println(name+"\nvalue "+value);
            ini.store();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
