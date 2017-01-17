package com.mt.suduku.swing.custom.view;

import com.mt.suduku.swing.utils.ButtonFactory;

import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 12/01/17.
 */
public final class View1 extends JPanel {

    private final int margin = 100;


    public View1() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(margin, margin, margin, margin));
        add(ButtonFactory.creteMenuButton("Easy"));
        add(ButtonFactory.creteMenuButton("Medium"));
        add(ButtonFactory.creteMenuButton("Hard"));
        add(ButtonFactory.creteMenuButton("Very Hard"));
        add(Box.createRigidArea(new Dimension(0, 500)));
        add(ButtonFactory.creteMenuButton("Create Your Own"));
    }
}
