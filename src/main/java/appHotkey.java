import java.awt.*;
import java.io.File;
import java.io.IOException;

public class appHotkey extends hotkey {

    private File file;

    public appHotkey(String name) {
        super(name);
        setColor(0,0,0);
        file = new File("C:\\Users\\jackc\\AppData\\Roaming\\Spotify\\Spotify.exe");
        switch (this.getName()) {
            case "Spotify":
                setColor(30, 215, 96);
                file = new File("C:\\Users\\jackc\\AppData\\Roaming\\Spotify\\Spotify.exe");
                break;
            case "Discord":
                file = new File("C:\\Users\\jackc\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Discord Inc\\Discord.lnk");
                setColor(115, 138, 219);
                break;
            case "Bambu Studio":
                file = new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Bambu Studio\\Bambu Studio.lnk");
                setColor(35,165,67);
                break;
            case "Rocket League":
                setColor(30,75,142);
                file = new File("C:\\Program Files\\Epic Games\\rocketleague\\Binaries\\Win64\\RocketLeague.exe");
                break;
            case "Balatro":
                setColor(16,110,186);
                file = new File("C:\\Program Files (x86)\\Steam\\steamapps\\common\\Balatro\\Balatro.exe");
                break;
            case "Steam":
                setColor(4, 22, 63);
                file = new File("C:\\Program Files (x86)\\Steam\\steam.exe");
                break;
            case "Minecraft":
                setColor(60,133,39);
                file = new File("C:\\Program Files (x86)\\Minecraft Launcher\\MinecraftLauncher.exe");
                break;
            default:
                setColor(0,0,0);
        }
    }


    @Override
    public void action() {
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
