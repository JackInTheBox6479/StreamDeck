import javax.swing.*;
import java.awt.*;

public class roundButton extends JButton {

    public roundButton(String text) {
        super(text);
        setFocusPainted(false);
        setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 80, 80); // Rounded rectangle

        super.paintComponent(g);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Optional: draw a border if you want
        g.setColor(Color.BLACK);
        ((Graphics2D) g).drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 60, 60);
    }
}
