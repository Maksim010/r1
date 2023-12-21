package Massive;

public class TaskClass3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int x = 1, b = 4;
        boolean found1 = false;boolean found2=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                found1 = true;
            }
            if (arr[i] == b)
                 found2=true;

        }
        if (found1==found2)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
