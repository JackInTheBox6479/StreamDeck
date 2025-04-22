import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class websiteHotkey extends hotkey {
private String url;

    public websiteHotkey(String name) {
        super(name);
        setColor(0,0,0);

        switch (this.getName()) {
            case "Youtube":
                url = "www.youtube.com";
                setColor(255, 0 ,0);
                break;
            case "Onshape":
                url = "www.onshape.com";
                setColor(100,188,79);
                break;
            case "Amazon":
                url = "www.amazon.com";
                setColor(35,47,62);
                break;
            default:
                url = "https://www.google.com";
                setColor(0,0,0);
                break;
        }
    }

    @Override
    public void action() {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

}
