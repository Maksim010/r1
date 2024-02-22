package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class HomeTask1 {
    public static void main(String[] args) {
        LinkedList<PriorityQueue> list = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            PriorityQueue<String> queue = new PriorityQueue<>();
            for (int j = 0; j < 4; j++) {
                queue.add(String.format("Srting %s",i*5+j));
            }
            list.add(queue);
        }
        PriorityQueue<String> qu = list.get(2);
        qu.poll();
        qu.add("String my");


        for (int i = 0; i < list.size(); i++) {
            PriorityQueue<String> queue = list.get(i);
            while (!queue.isEmpty()) {
                String s = queue.poll();
                System.out.print(s + " ");
            }
            System.out.println(" ");


        }
    }
}
