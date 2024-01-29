package Recursion;

public class CombinationsWithRepetition {
    static String s="123";
    static int n=s.length();
    static int r=2;
    public static void main(String[] args) {
        combinations(new StringBuilder(),0,r);
    }
    static void combinations(StringBuilder sb,int start,int r){
        if(sb.length()==r) {
            System.out.println(sb);
            return;
        }
        for(int i=0;i<n;i++){
            sb.append(s.charAt(i));
            combinations(sb,n,r);
            sb.delete(sb.length()-1,sb.length());
        }
    }
}
