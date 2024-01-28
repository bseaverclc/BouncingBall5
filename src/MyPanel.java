import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    int xLoc = 200;
    int xVel = 2;

    Ball myBall;
    public MyPanel(){

        setBackground(Color.GREEN);
         myBall = new Ball(200,300);
    }

    @Override
    public void paintComponent(Graphics g){
       super.paintComponent(g);
       // System.out.println("Hi");
//        g.setColor(Color.RED);
//        g.fillOval(xLoc,300,20,20);
        myBall.draw(g);
        myBall.move();
//        xLoc+=xVel;

        if(xLoc >= getWidth()-20){
            xVel = xVel*-1;
        }

        g.setColor(Color.BLUE);
        g.drawString("Hello World", 250,250);

        try {
            Thread.sleep(100);
        }
        catch(Exception e){
            System.out.println(e);
        }
        repaint();
    }




}
