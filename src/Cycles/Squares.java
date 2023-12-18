package Cycles;

import javax.swing.*;
import java.awt.*;

public class Squares extends JPanel {


    private final int width = 40;
    private final int height = 40;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(
                Color.BLUE
        );
        g2d.clearRect(0, 0, getParent().getWidth(), getParent().getHeight());

        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(
                Color.green
        );

        g2d.drawRect(0, 0, 100, 100);
        g2d.setColor(
                Color.RED
        );
        g2d.fillRect(5, 5, 95, 95);
    }


        /*
        //Изобразить 5х5 квадратов
        //В третьей строке оставить только 3 квадрата
        //Пропустить один средний квадрат
        //Пропустить 3-ю строку
        //Пропустить 3-й столбец
        //В первой строке - 1 квадрат, во 2 - 2 и т.д.
        //Квадраты размещены в шахматном порядке
         //Изобразить только главные диагонали
        */



    public static void drawRect(Graphics2D g2d, int left, int top, int width, int height) {
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(Color.green);
        g2d.fillRect(left, top, width, height);
        g2d.setColor(Color.gray);
        g2d.drawRect(left, top, width, height);
    }

    public static void main(String[] args) {
        // create frame for Main
        JFrame frame = new JFrame("Squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Squares app = new Squares();
        frame.add(app);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}