package ui.Person;

import javax.swing.*;
import java.awt.*;

// One grid cell for one student
public abstract class Student extends JPanel {
    private final String name;
    private final String cid;
    private final String type;
    private final double total;


    private final JLabel label = new JLabel();

    public Student(String name, String cid, String type) {
        this.name = name;
        this.cid = cid;
        this.type = type;

        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.WHITE);
        add(label);
    }

    protected abstract double calcTotal();
}
