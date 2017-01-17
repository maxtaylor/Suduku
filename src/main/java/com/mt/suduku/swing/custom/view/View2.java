package com.mt.suduku.swing.custom.view;

import com.mt.suduku.swing.custom.componenet.Grid;
import com.mt.suduku.swing.utils.ButtonFactory;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

/**
 * Created by root on 12/01/17.
 */
public class View2 extends JPanel {
    private final JLabel timeLabel = new JLabel(new Date().toString());
    private final int margin = 100;


    public View2() {
        setLayout(new BorderLayout());
        // setBorder(BorderFactory.createEmptyBorder(margin, margin, margin, margin));
        add(getNorthPanel(), BorderLayout.NORTH);
        add(getEastPanel(), BorderLayout.EAST);
        add(new Grid(), BorderLayout.CENTER);
    }

    private JPanel getEastPanel() {
        final JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(Box.createRigidArea(new Dimension(0,500)));
        panel.add(ButtonFactory.creteMenuButton("Pause"));
        panel.add(ButtonFactory.creteMenuButton("Clear"));
        panel.add(ButtonFactory.creteMenuButton("New Puzzle"));
        return panel;
    }

    private JPanel getNorthPanel() {
        final JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(ButtonFactory.creteTopMenuButton("Back"));
        panel.add(ButtonFactory.creteTopMenuButton("Forward"));
        panel.add(Box.createRigidArea(new Dimension(500, 0)));
        panel.add(timeLabel);
        return panel;
    }
}
