package Collections;

import java.util.Comparator;

 class Sort implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getYear()>o2.getYear())
            return 1;
        if(o1.getYear()<o2.getYear())
            return -1;
        return 0;
    }

}
