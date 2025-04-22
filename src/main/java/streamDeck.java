import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class streamDeck {

    private final JPanel panel;
    private final JButton[] buttons;
    private final String[] apps = {"[a]Spotify", "[a]Discord", "[w]Youtube", "[a]Bambu Studio", "[a]Balatro", "[a]Rocket League", "[w]Onshape", "[w]Amazon", "[a]Steam", "[a]Minecraft", "   11", "   12", "   13", "   14", "   15"};
    private final hotkey[] hotkeys;


    public streamDeck() {
        hotkeys = new hotkey[10];
        createHotkeys();

        JFrame frame = new JFrame("StreamDeck");

        panel = new JPanel();
        GridLayout grid = new GridLayout(2, 5, 20, 20);
        panel.setLayout(grid);
        panel.setBackground(Color.BLACK);
        panel.setBorder(new EmptyBorder(20, 20, 20, 20));

        buttons = new JButton[10];

        for(int i = 0; i < buttons.length; i++) {
            createButton(i);
        }

        frame.setSize(new Dimension(1440, 900));
        frame.add(panel);
//        frame.setUndecorated(true);
        frame.setVisible(true);

    }

    private void createButton(int i) {
        //     JButton button = new JButton(apps[i].substring(3));
        JButton button = new roundButton(apps[i].substring(3));
        button.setBackground(hotkeys[i].getColor());
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Impact", Font.PLAIN, 40));
        button.setBorder(new LineBorder(Color.BLACK, 20, true));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hotkeys[i].action();

                button.setBackground(hotkeys[i].getColor().darker());

                Timer timer = new Timer(500, evt -> {
                   button.setBackground(hotkeys[i].getColor());
                });
                timer.setRepeats(false);
                timer.start();

            }
        });

        buttons[i] = button;
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