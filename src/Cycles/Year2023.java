package Cycles;

public class Year2023 {
    public static void main(String[] args) {
        int year=2023;
        for(int i=0x1;i<=7;i++){
            int j=2*i;
            int n=i*256+j*16+i;

            System.out.println(n+" "+ Integer.toHexString(n));        }
    }
}
