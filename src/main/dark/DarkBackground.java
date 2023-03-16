package main.dark;

import main.Background;
import main.Main;

import java.awt.*;

public class DarkBackground implements Background {
    @Override
    public void paint(Graphics2D g) {
        g.setColor(new Color(0x555555));
        g.fillRect(0, 0, Main.WIDTH, Main.HEIGHT);
    }
}
