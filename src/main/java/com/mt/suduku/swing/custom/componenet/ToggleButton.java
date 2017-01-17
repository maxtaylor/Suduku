package com.mt.suduku.swing.custom.componenet;

import com.mt.suduku.swing.utils.SwingUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by root on 11/01/17.
 */
public final class ToggleButton extends JToggleButton implements FocusListener {

    private final Color colorInFocus = Color.BLACK;
    private final Color colorOutFocus = Color.WHITE;

    public ToggleButton(String title, Icon icon) {
        super(title, icon);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        SwingUtils.setSize(this, 50, 50);
        focusLost(null);
    }

    public void focusGained(FocusEvent focusEvent) {
        setBackground(colorInFocus);
    }

    public void focusLost(FocusEvent focusEvent) {
        setBackground(colorOutFocus);
    }
}
