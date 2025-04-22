import java.awt.*;

abstract class hotkey {

    private final String name;
    private Color color;

    public hotkey(String name) {
        this.name = name;
        color = new Color(0,0,0);
    }

    public String getName(){
        return name;
    }

    public void action(){
        System.out.println("action");
    }

    public void setColor(int r, int g, int b) {
        color = new Color(r, g, b);
    }

    public Color getColor() {
        return color;
    }

}
