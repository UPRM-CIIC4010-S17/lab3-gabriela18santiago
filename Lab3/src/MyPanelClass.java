import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

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
                        //g.setColor(Color.BLUE);
                        //g.drawLine(x1, y1, x2, y2);
                        //g.setColor(Color.BLUE);
                        //g.drawLine(x1, y2, x2, y1);
                        
                        //Draw an Oval
                        //g.setColor(Color.LIGHT_GRAY);
                        //g.fillOval(x1 + 165 , y1 + 105 , 55, 55);
                      //Draw rectangles
                        g.setColor(Color.RED);
                        g.drawRect(x1, y1, width, 35);
                        g.fillRect(x1, y1, width, 35);
                        g.setColor(Color.WHITE);
                        g.drawRect(x1, y1, width, 65);
                        g.fillRect(x1, 35 , width, 35);               
                        g.setColor(Color.RED);
                        g.drawRect(x1, y1, width, 95);
                        g.fillRect(x1, 65, width,35);
                        g.setColor(Color.WHITE);
                        g.drawRect(x1, y1, width, 125);
                        g.fillRect(x1, 95, width,35);
                        g.setColor(Color.RED);
                        g.drawRect(x1, y1, width, 160);
                        g.fillRect(x1,  125, width,  35);
                        
                        Polygon p = new Polygon();
                        p.addPoint(x1 + 5, y1 + 25);
                        p.addPoint(x1 + 20, y1 + 10);
                        p.addPoint(x1 + 35, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 25);
                        //g.setColor(Color.YELLOW);
                        //g.fillPolygon(p);
                        Polygon p1= new Polygon();
                        p1.addPoint(0,0);
                        p1.addPoint(x1 , y1 );
                        p1.addPoint(145, 80);
                        	p1.addPoint(x1 , y1 + 160);
                        	p1.addPoint(x1 , y1 + 90);
                        	p1.addPoint(x1 , y1 + 65);
                        g.setColor(Color.BLUE);
                        g.drawPolygon(p1);
                        g.fillPolygon(p1);
                        	
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                      
            }
}
