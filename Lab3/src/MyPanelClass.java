import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.BLACK);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        //Draw a border
                        //g.setColor(Color.YELLOW);
                        //g.drawRect(x1, y1, width, height );
                        //Draw a inside border
                        //g.setColor(Color.WHITE);
                        //g.drawRect(x1 + 4, y1 + 4, width-8 , height-8 );
                        //Draw cross lines
                        //g.setColor(Color.WHITE);
                        //g.drawLine(x1, y1, x2, y2);
                        //g.setColor(Color.BLUE);
                        //g.drawLine(x1, y2, x2, y1);
                        //Draw a Oval
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval(x1 + 165 , y1 + 105 , 55, 55);
                       
            }
}
