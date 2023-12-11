package Cycles;

public class Fibonachi {
    public static void main(String[] args) {
        int sum=2;
        System.out.println(1);
        for(int i=0;i<10;i++){
            if(i==0)
                continue;
            sum+=i-1;

            System.out.println(sum);

        }
    }
}
