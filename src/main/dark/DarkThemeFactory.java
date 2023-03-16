package main.dark;

import main.Background;
import main.GuiFactory;
import main.Text;

public class DarkThemeFactory implements GuiFactory {

    public Text createText(){
        return new LightText();
    }
    public Background createBackground(){
        return new DarkBackground();
    }
}
