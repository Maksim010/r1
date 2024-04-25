import java.util.*;

interface Condition {
    boolean isAppropriate(int n);
}



        public class qe {

            public static void main(String[] args) {

                System.out.println(sum(new int[]{10, 2, 4, 5}, n -> n % 2 == 0));
                List<String> list1 = new ArrayList<>();
                list1.add("1");
                list1.add("5");  list1.add("3");

                list1.add("0");

                Collections.sort(list1);
//              sort(list1);
                System.out.println(list1);


               new Example() {
                    @Override
                    public int process(int a) {
                        return 0;
                    }
                    @Override
                    public void show() {
                        System.out.println("qweqw");

                    }
                }.show();
            }

            private static int sum(int[] numbers, Condition condition) {
                int sum = 0;
                for (int number : numbers) {
                    if (condition.isAppropriate(number)) {
                        sum += number;
                    }
                }
                return sum;
            }

//            public static List<String> sort(List<String> list) {
//
//               list.sort(String::compareTo);
//                return list;
//            }
        }
interface Example {
    int process(int a);
    default void show() {
        System.out.println("default show()");
    }
}
