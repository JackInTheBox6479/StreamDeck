import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class streamDeck {

    private JPanel panel;
    private JButton[] buttons;
    private final String[] apps = {"[a]Spotify", "[a]Discord", "[w]Youtube", "[a]Bambu Studio", "[a]Balatro", "   6", "   7", "   8", "   9", "   10", "   11", "   12", "   13", "   14", "   15"};
    private hotkey[] hotkeys;
    private int j;


    public streamDeck() {
        hotkeys = new hotkey[15];
        createHotkeys();

        JFrame frame = new JFrame("StreamDeck");
        panel = new JPanel();
        GridLayout grid = new GridLayout(3, 5);
        panel.setLayout(grid);
        buttons = new JButton[15];

        for(int i = 0; i < buttons.length; i++) {
            createButton(i);
        }


        frame.setSize(new Dimension(1440, 900));
        frame.add(panel);
//        frame.setUndecorated(true);
        frame.setVisible(true);
    }

    private void createButton(int i) {
        JButton button = new JButton(apps[i].substring(3));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.LIGHT_GRAY);
        button.setFont(new Font("Arial", Font.PLAIN, 30));

        buttons[i] = button;

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hotkeys[i].action();
            }
        });

        panel.add(buttons[i]);
    }

    private void createHotkeys() {
        for(int i = 0; i < apps.length; i++) {
            if(apps[i].contains("[a]")) {
                hotkeys[i] = new appHotkey(apps[i].substring(3));
            }
            else if (apps[i].contains("[w]")) {
                hotkeys[i] = new websiteHotkey(apps[i].substring(3));
            }
        }
    }

}