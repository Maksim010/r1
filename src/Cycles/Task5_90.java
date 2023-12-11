package Cycles;

public class Task5_90 {
    public static void main(String[] args) {
        int fact=1;
        double sum=1,a=1.;
        int n=5;//найти 5!=1*2*3*4*5
        for(int i=0;i<10;i++){
        a*=(i+1);
        sum+=1./a;
        }
        System.out.println(sum);
        //for(int i=1;i<=n;i++){
          //  fact*=i;
           // System.out.println(fact);
        //}

    }
}
