package Parsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;

public class TableBelarus {
    private static Document document;
    private static final String url = "https://en.wikipedia.org/wiki/List_of_cities_and_towns_in_Belarus";
    public static void main(String[] args) throws IOException {
        try {
            document = Jsoup.connect(url).get();
        } catch (IOException e) {
            System.err.println("Check HTTP connection to the url " + url);

        }
        //*[@id="mw-content-text"]/div[1]/table[2]/tbody/tr[2]/td[2]/span/span/span/img
        Elements images = document.select("table>tbody>tr>td>span>span>span>img");
        int index=0;
        for (Element image:images){
            String imageUrl = "https:"+image.attr("src");

            URL url = new URL(imageUrl);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(String.format("src/Parsing/images/%d.png",index++));

            byte[] b = new byte[2048];
            int length;

            while ((length = is.read(b)) != -1) {os.write(b, 0, length);
            }
            is.close();
            os.close();
        }
    }
}


