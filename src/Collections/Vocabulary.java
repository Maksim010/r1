package Collections;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.io.*;
import java.util.*;

public class Vocabulary {
    public static void main(String[] args) {


        int count = 'z' - 'a' + 1;
        List<String> vocab = new LinkedList<>();

        //Заполнить словарь из файла
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("src/Data/Text.txt"))) {
            String s;
            do {
                s = br.readLine();
                if (s != null)
                    vocab.add(s);
            }
            while (s != null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Collections.sort(vocab);
//        System.out.println(vocab);

        ListIterator<String> it = vocab.listIterator(0);
        ListIterator<String> it2 = vocab.listIterator(vocab.size());
        int i = 0;
        while (it.hasNext() && i < 10) {
            System.out.print(it.next() + " ");
            i++;
        }
        System.out.println(" ");
        int y = 0;
        while (it2.hasPrevious() && y < 10) {
            System.out.print(it2.previous() + " ");
            y++;
        }
        System.out.println(" ");
        int maxLength = 0;
        for (String word : vocab)
            if (maxLength < word.length())
                maxLength = word.length();
        System.out.println(maxLength);


        int[] hist = new int[maxLength];
        for (String word : vocab)
            hist[word.length() - 1]++;

        for (int j = 0; j < maxLength; j++)
            System.out.printf("Букв %d,слов: %d%n", j + 1, hist[j]);


        System.out.println(" ");


        for (String word : vocab)
            if (word.equals(new StringBuilder(word).reverse().toString()) && word.length() > 1)
                System.out.println(word);


        Multimap<String, String> anagrams = ArrayListMultimap.create();
        for (String word : vocab) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            anagrams.put(key, word);
        }
        String key = "";
        String key2 = "";
        Map.Entry<String, String> entry2 = null;
        for (Map.Entry<String, String> entry : anagrams.entries()) {
            key = entry.getKey();
            if (key.equals(key2))
                System.out.println(entry2.getValue() + " " + entry.getValue());
            key2 = key;
            entry2 = entry;
        }


        //6. Найти слова с тремя одинаковыми буквами
        it = vocab.listIterator(0);
        while (it.hasNext()) {
            String s = it.next
                    ();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            count = 1;
            char c = ' ';
            for (i = 0; i < arr.length; i++) {
                char c2 = arr[i];
                if (c == c2) count++;
                else count = 1;
                if (count == 3) { //Проверить с 4-мя буквами
                    System.out.print(s + " ");
                    break;
                }
                c = c2;
            }
        }
        System.out.println();


        //7. Найти слова, где 3 буквы следуют в алфавитном порядке
        it = vocab.listIterator(0);
        while (it.hasNext()) {
            String s = it.next();
            char[] arr = s.toCharArray();
            count = 1;
            char c = ' ';
            for (i = 0; i < arr.length; i++) {
                char c2 = arr[i];
                if (c2 - c == 1) count++;
                else count = 1;
                if (count == 3) { //Проверить с 4-мя буквами
                    System.out.print(s + " ");
                    break;
                }
                c = c2;
            }
        }
    }
}
