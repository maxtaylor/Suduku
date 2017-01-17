package com.mt.suduku.swing.custom.componenet;

import com.mt.suduku.swing.utils.SwingUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by root on 11/01/17.
 */
public final class Button extends JButton {

    private final Color colorInFocus = new Color(0xEFEFEF);
    private final Color colorOutFocus = Color.WHITE;

    private final int margin = 20;
    private final String name;

    public Button(String title, Icon icon, int width, int height) {

        super(title, icon);
        this.name = title;
        SwingUtils.setSize(this, width, height);
        setFont(new Font("Courier", Font.BOLD, 12));
        setBorder(BorderFactory.createEmptyBorder(margin, margin, margin, margin));
        setBackground(colorOutFocus);
        setOpaque(true);
        addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent mouseEvent) {
                setBackground(colorInFocus);
            }

            public void mouseExited(MouseEvent mouseEvent) {
                setBackground(colorOutFocus);
            }
        });
    }
}
