package desenhos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class Painel extends JPanel {

    public Painel() {
        this.setBackground(new Color(255, 255, 255));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
//        g.drawLine(100, 50, 600, 100);
//        g.drawRect(100, 100, 200, 200);
//        g.fillRect(100, 100, 200, 200);
//        g.drawArc(300, 300, 200, 200, 0, 300);
        Polygon p = new Polygon();
        
        p.addPoint(10, 10);
        p.addPoint(20, 100);
        p.addPoint(32, 78);
        p.addPoint(10, 10);
        
        g.drawPolygon(p);
    }

}
