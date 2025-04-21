import java.awt.*;
import java.io.File;
import java.io.IOException;

public class appHotkey extends hotkey {

    public appHotkey(String name) {
        super(name);
    }


    @Override
    public void action() {
        File file = new File("C:\\Users\\jackc\\AppData\\Roaming\\Spotify\\Spotify.exe");
        switch (this.getName()) {
            case "Spotify":
                file = new File("C:\\Users\\jackc\\AppData\\Roaming\\Spotify\\Spotify.exe");
                break;
            case "Discord":
                file = new File("C:\\Users\\jackc\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Discord Inc\\Discord.lnk");
                break;
            case "Bambu Studio":
                file = new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Bambu Studio\\Bambu Studio.lnk");
                break;
            case "Rocket League":
                file = new File("C:\\Program Files\\Epic Games\\rocketleague\\Binaries\\Win64\\RocketLeague.exe");
                break;
            case "Balatro":
                file = new File("C:\\Program Files (x86)\\Steam\\steamapps\\common\\Balatro\\Balatro.exe");
        }
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
