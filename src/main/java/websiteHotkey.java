import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class websiteHotkey extends hotkey {

    public websiteHotkey(String name) {
        super(name);
    }

    @Override
    public void action() {
        String url = "https://www.google.com";
        switch (this.getName()) {
            case "Youtube":
                url = "www.youtube.com";
                break;
        }
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

}
