package Simple;

import java.util.LinkedList;
import java.util.List;

public class Users {
    public static void main(String[] args) {

        User user=new User("Max","asdfasf");


        User guest=new Guest("Kate,","sdsd");


        User admin=new Admin("Julia","asdasd");


        List<User> users=new LinkedList<>();
        users.add(user);
        users.add(guest);
        users.add(admin);

        users.stream().forEach(System.out::println);
    }
}


