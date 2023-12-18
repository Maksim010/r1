public class Task {
    public static void main(String[] args) {
        double a=2./3;
        double sum=a;
        for(int i=2;i<5;i++){
            a*=2.*i/(2*i+1);
            sum+=a;
        }
        System.out.println(sum);
    }
}
