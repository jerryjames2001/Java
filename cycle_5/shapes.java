import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;
public class shapes extends JApplet {
    @Override
    public void paint(Graphics g){
        setSize(500,500);
      g.drawLine(50,50,100,50);
      g.setColor(Color.LIGHT_GRAY);
      g.fillRect(50, 70, 60, 60);
      g.setColor(Color.green);
      g.fillOval(50, 150, 70, 70);
    }
}
