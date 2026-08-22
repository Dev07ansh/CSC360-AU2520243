import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicalSquare extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set the color of the shape
        g.setColor(Color.BLUE);
        
        // drawRect(x, y, width, height) - drawn as an outline
        g.drawRect(50, 50, 150, 150); 

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw a Square");
        GraphicalSquare panel = new GraphicalSquare();
        
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
