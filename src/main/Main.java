package main;

import main.dark.DarkThemeFactory;
import main.light.LightThemeFactory;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    GuiFactory factory = new LightThemeFactory();
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;
    final JComboBox<String> box = new JComboBox<>();


    public Main() {
        this.setTitle("Abstract Factory");
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        box.addItem("Light");
        box.addItem("Dark");
        box.addActionListener((e -> {
            if("Light".equals(box.getSelectedItem())) {
                factory = new LightThemeFactory();
            } else if("Dark".equals(box.getSelectedItem())) {
                factory = new DarkThemeFactory();
            }
            repaint();
        }));
        this.add(box, BorderLayout.PAGE_START);

        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        this.remove(box);
        factory.createBackground().paint((Graphics2D) g);
        factory.createText().paint((Graphics2D) g);
        this.add(box, BorderLayout.PAGE_START);
    }

    public static void main(String[] args) {
        new Main();
    }
}