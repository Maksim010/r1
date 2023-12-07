package Cycles;

public class While {
    public static void main(String[] args) {
//        int height = 0;
//        int hope = 1;
//        for (int i = 0; i < 20; i++) {
//            height += hope;
//            hope++;
//            if (height > 50) height = 50;
//            System.out.println(i + " " + height);
//            if (height == 50) {
//                break;
//            }
//            }
            int height=0;
           int  hope=1;
            int i=1;
            while(height<50){
                height += hope++;
                if(height>50)
                    height=50;
                System.out.println(i++ + " " + height);
            }
        }
    }



