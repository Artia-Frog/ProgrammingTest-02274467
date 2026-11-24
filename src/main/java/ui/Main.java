package ui;

import ui.Person.*;



import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::setUpGUI);
    }
    private static void setUpGUI() {
        JFrame frame = new JFrame("Selection Window");
        frame.setSize(650, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setUpFeatures(frame);
        frame.setVisible(true);
    }

    private static void setUpFeatures(JFrame frame) {
        JButton moduleAdmin = new JButton("Module Administrator");
        JButton moduleLead = new JButton("Module Leader");

        moduleAdmin.addActionListener(e -> new ModuleAdmin());
        moduleLead.addActionListener(e -> new ModuleLeadWindow());

        JPanel selector = new JPanel(new FlowLayout());

        selector.add(moduleAdmin);
        selector.add(moduleLead);

        frame.add(selector,BorderLayout.CENTER);
    }
}