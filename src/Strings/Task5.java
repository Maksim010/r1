package Strings;

import java.io.FilterOutputStream;

public class Task5 {
    public static void main(String[] args) {
        String word = "send";
        Player alice = new Player(new String[]{"plat", "rend","bear","soar","mare","pare","flap","neat","clan","pore"});
        Player bob = new Player(new String[]{"boar", "clap","farm","lend","near","peat","pure","more","plan","soap"});
        System.out.println("Word: "+word);
        int move = 1;
        int res=0;
        while (res==0) {
            if (move == 1) {
                int turn = alice.turn(word);

                if (turn != -1)
                    System.out.println(alice.getWords()[turn]);
                else{
                    System.out.println("Bobs win");
                    break;
                }
                move++;
            }else {
                int turn = bob.turn(word);

                if (turn != -1)
                    System.out.println(bob.getWords()[turn]);
                else{
                    System.out.println("Alice win");
                    break;
                }
                move=1;
            }
        }

        /*

        int answer1 = 0, answer2 = 0, result = 0; //result =0: draw; result=1: Alice won; result=-1: Bob won
        */
    }
}

class Player{
    public String[] getWords() {
        return words;
    }

    private String[] words;
    private int[] moves;
    private int score = 0;

    public Player(String[] words) {
        this.words = words;
        moves = new int[words.length];
    }

    public int turn(String word){
        int count, result = -1;
        for (int i=0; i<words.length; i++) {
            count = 0;
            for (int j = 0; j < 4; j++)
                if (words[i].charAt(j) == word.charAt(j)) count++;
            if (count==3 && moves[i]!=1) {
                result = i;
                moves[i] = 1;
                break;
            }
        }
        return result;
    }
}