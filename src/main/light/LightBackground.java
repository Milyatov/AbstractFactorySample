package main.light;

import main.Background;
import main.Main;

import java.awt.*;

public class LightBackground implements Background {

    @Override
    public void paint(Graphics2D g) {
        g.setColor(new Color(0xDDDDDD));
        g.fillRect(0, 0, Main.WIDTH, Main.HEIGHT);
    }
}
