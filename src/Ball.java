import java.awt.*;
public class Ball {
    private int size;
    private Color color;
    private int speed;
    private int x, y;

    public Ball(int x, int y){
        this.x = x;
        this.y = y;
        size = 10;
        speed = 5;
        color = Color.BLUE;
    }

    public void draw(Graphics g2){
        g2.setColor(color);
        g2.fillOval(x,y,size,size);
    }

    public void move(){
        x+=speed;
    }






}
