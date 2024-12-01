import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Java2DDrawing extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLUE);
        g2d.fill(new Rectangle2D.Double(50, 50, 100, 50));

        GradientPaint gradient = new GradientPaint(200, 200, Color.RED, 300, 300, Color.YELLOW);
        g2d.setPaint(gradient);
        g2d.fill(new Ellipse2D.Double(200, 200, 100, 100));

        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(Color.BLACK);
        g2d.drawLine(50, 300, 300, 300);

        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(Color.BLACK);
        g2d.drawLine(50, 300, 275, 50);

        g2d.setColor(Color.BLUE);
        g2d.fill(new Rectangle2D.Double(100,100,50,50));

        g2d.fillOval(270, 130, 60, 50);

        g2d.fillArc(30, 150, 110, 100, 5, 150);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java 2D Example");
        frame.add(new Java2DDrawing());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}