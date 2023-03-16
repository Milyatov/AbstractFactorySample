package main.light;

import main.Main;
import main.Text;

import java.awt.*;

public class DarkText implements Text {
    @Override
    public void paint(Graphics2D g) {
        g.setColor(new Color(0x555555));
        FontMetrics metrics = g.getFontMetrics();
        String text = "Hello World!";
        int width = metrics.stringWidth(text);
        int height = metrics.getHeight();
        int x = (Main.WIDTH - width) / 2;
        int y = (Main.HEIGHT - height) / 2;
        g.drawString(text, x, y);
    }
}
