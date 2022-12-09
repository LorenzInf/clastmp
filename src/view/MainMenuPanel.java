package view;

import controller.ProgramController;
import controller.ViewController;

import javax.swing.*;
import java.awt.*;

public class MainMenuPanel {
    private final ProgramController pc;
    private final ViewController vc;
    private JPanel panel1;
    private JButton logOutButton;
    private JLabel loggedInAsLabel;

    public MainMenuPanel(ViewController vc, ProgramController pc) {
        this.pc = pc;
        this.vc = vc;

        logOutButton.addActionListener(e -> {
            pc.resetSchueler();
            vc.setLoginPanel();
        });
    }

    public JPanel getPanel() {
        loggedInAsLabel.setText("  Logged in as " + pc.getSchueler().getFirstName() + " " + pc.getSchueler().getLastName() + " (" + pc.getSchueler().getSid() + ")");
        return panel1;
    }
}
