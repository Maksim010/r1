package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MobileCodes {
    public static void main(String[] args) {
        Map<Integer,String>hmap=new HashMap<>();
        hmap.put(24, "Белтелеком (Максифон)");
        hmap.put(25, "life");
        hmap.put(291, "Velcom");
        hmap.put(292, "МТС");
        hmap.put(293, "Velcom");
        hmap.put(294, "Diallog");
        hmap.put(295, "МТС");
        hmap.put(296, "Velcom");
        hmap.put(297, "МТС");
        hmap.put(298, "МТС");
        hmap.put(299, "Velcom");
        hmap.put(33, "МТС");
        hmap.put(44, "Velcom");

        String phone="+375298909090";
        Set set=hmap.entrySet();
        System.out.println(set);


        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
                Map.Entry entry=(Map.Entry) iterator.next();
                if(phone.indexOf(entry.getKey().toString())==4)
                    System.out.println(entry.getValue());
            }

    }
}
