package Class;

import java.util.LinkedList;
import java.util.List;

public class DoctorCroaky {
    public static void main(String[] args) {
        Story.tellStory();
    }
}

    class Frog {
        public Frog went() {
            System.out.println("Went");
            return this;
        }

        public Frog sayHello() {
            System.out.println("say hellow");
            return this;
        }

        public Frog introduce() {
            System.out.println("introduce");
            return this;
        }

        public Frog advertise() {
            System.out.println("advertise");
            return this;
        }

        public Frog listen() {
            System.out.println("listen");
            return this;
        }
    }

    interface Animal {
        void come();
    }

    class Fox implements Animal {

        @Override
        public void come() {
            System.out.println("Лиса пришла");
        }

        public void ask() {
            System.out.println("Лиса спрашивает");
        }
    }

    class Dear implements Animal {

        @Override
        public void come() {
            System.out.println("Лось пришла");
        }
    }
        class Tortoise implements Animal{
            @Override
            public void come() {
                System.out.println("The tortoise came");
            }
        }

        class Story {
            private static List<Animal> animalList = new LinkedList<>();

            public static void tellStory() {
                Frog frog = new Frog();
                animalList.add(new Dear());//aнонимный объект
                animalList.add(new Tortoise());
                Animal fox = new Fox();
                animalList.add(fox);

                frog.went().sayHello();
                animalList.forEach(Animal::come);


                frog.introduce().advertise();
                ((Fox) fox).ask();
                frog.listen();
            }
        }


