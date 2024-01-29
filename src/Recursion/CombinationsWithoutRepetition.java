package Recursion;

public class CombinationsWithoutRepetition {
    static String s="123";
    static int n=s.length();
    public static void main(String[] args) {
        combinations(new StringBuilder(),0);
    }
    static void combinations(StringBuilder sb,int start){
        System.out.println(sb);
        for(int i=start;i<n;i++){
            sb.append(s.charAt(i));
            combinations(sb,i+1);
            sb.delete(sb.length()-1,sb.length());
        }
    }
}
