package datatypes;

public class Chess {
    public static void main(String[] args) {
        int x1=3,y=2;
        int x2=5,y2=4;
        if(x1==x2||y==y2)
            System.out.println(true);
        else
            System.out.println(false);

        //слоон
        if(Math.abs(x1-x2)==Math.abs(y-y2))
            System.out.println(true);
        else
            System.out.println(false);

        //queen
        if((x1==x2||y==y2)||(Math.abs(x1-x2)==Math.abs(y-y2)))
        System.out.println(true);
        else
            System.out.println(false);
    }
}
