package main.light;

import main.Background;
import main.GuiFactory;
import main.Text;

public class LightThemeFactory implements GuiFactory {

    public Text createText(){
        return new DarkText();
    }
    public Background createBackground(){
        return new LightBackground();
    }
}
