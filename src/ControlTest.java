import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;



class Person {

    public static enum Sex {
        MAN,
        WOMAN
    }

    private final String name;
    private final Integer age;
    private final Sex sex;

    public static List<Person> persons = new ArrayList<>(
            (Arrays.asList(new Person("Alice", 25, Sex.WOMAN),
                    new Person("Bob", 30,
                            Sex.MAN
                    ),
                    new Person("Charlie", 35,
                            Sex.MAN
                    ),
                    new Person("Basil", 16,
                            Sex.MAN
                    ),
                    new Person("Peter", 23,
                            Sex.MAN
                    ),
                    new Person("Elen", 42, Sex.WOMAN),
                    new Person("John", 69,
                            Sex.MAN
                    )
            )));

    public Person(String name, Integer age, Sex sex) {

        this.name
                = name;
        this.age = age;

        this.sex
                = sex;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}


public class ControlTest {

    @Test
    public void test1a() throws IOException {
        try {
            Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1", "b1");
            String first = collection.stream().findFirst().orElse(null);
            String last = collection.stream().skip(collection.size() - 1).findAny().orElse(null);
            long count = collection.stream().count();
            String find = collection.stream().filter("a3"::equals).findFirst().get();
            List<String> selected = collection.stream().filter(s -> Pattern.compile("b.*").matcher(s).matches()).collect(Collectors.toList());
            System.out.println(Arrays.toString(selected.toArray()));
            System.out.println(last);
            System.out.println(count);
            System.out.println(find);


            Assertions.assertAll("exeption",
                    () -> Assertions.assertEquals(first, "a1"),
                    () -> Assertions.assertEquals(last, "b1")
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() throws IOException {
        File file=new File("src/tests/data.txt");
        PrintWriter out=new PrintWriter(file);
        IntStream .rangeClosed(1,26)
                .mapToObj(i->new StringBuilder().append(Character.toString(i+'a'-1))
                        .append(Integer.toString(i)).toString())
                .forEach(out::println);

        //Используя stream, записать в файл последовательность строк "a1,b2,c3,d4...z26"
        //Прочитать данные из файла. Проверить первую и последнюю записанные строки

    }

    @Test
    public void test1b() throws IOException {
        List<Person>mans=Person.persons.stream().filter(p->p.getAge()>=20&&p.getAge()<=30&&p.getSex()==Person.Sex.MAN).toList();
        double minAge=Person.persons.stream().filter(i->i.getSex()== Person.Sex.MAN).mapToInt(Person::getAge)
                .average().getAsDouble();
        long count=Person.persons.stream().filter(p->p.getAge()>=18).filter(p->(p.getSex()== Person.Sex.WOMAN&&p.getAge()<55)||(p.getSex()== Person.Sex.MAN&&p.getAge()<60)).count();
        Person older=Person.persons.stream().max(Comparator.comparing(Person::getAge)).get();
        List<Person>byName=Person.persons.stream().sorted((p1,p2)->-p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
        List<Person>sorted2=Person.persons.stream()
                .sorted((p1,p2)->p1.getSex()!=p2.getSex()?p1.getSex().compareTo(p2.getSex()):p1.getAge().compareTo(p2.getAge()))
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(sorted2.toArray()));
        Map<Person.Sex,List<Person>> group=Person.persons.stream()
                .collect(Collectors.groupingBy(Person::getSex));
        System.out.println(group);




        List<String> strings= Files.lines(Paths.get("src/tests/data.txt"))
                .collect(Collectors.toList());




        // Выбрать мужчин от 20 до 30 лет\
        // Найти средний возраст среди мужчин
        // Найти количество трудоспособных (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)
        // Найти человека с максимальным возрастом
        // Отсортировать по имени в обратном алфавитном порядке
        // Отсортировать сначала по полу, а потом по возрасту
        //Группировка по полу

    }


    @Test
    public void test2() {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // Получить все числа подряд, записать в массив целых чисел
        int[] numbers =
                collection.stream
                                ()
                        .mapToInt(s->Integer.parseInt(s.substring(1)))
                        .toArray();
        System.out.println(Arrays.toString(numbers));

        // Получить все числа подряд, записать в массив строк
        collection = Arrays.asList("1,2,0", "4,5");
        String[]strings=collection.stream().flatMap(s->Arrays.asList(s.split(",")).stream())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(strings));

        //Найти сумму всех чисел, которые хранятся через запятую в collection
        collection = Arrays.asList("1,2,0", "4,5", "1,2");
        int sum=collection.stream()
                .flatMapToInt(s->Arrays.asList(s.split(",")).stream()
                        .mapToInt(Integer::parseInt))
                        .sum();
        System.out.println(sum);
    }
}
