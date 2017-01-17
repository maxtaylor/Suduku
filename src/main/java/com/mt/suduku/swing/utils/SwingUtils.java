package com.mt.suduku.swing.utils;

import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 11/01/17.
 */
public final class SwingUtils {
    public static void setSize(JComponent component, int x, int y) {
        final Dimension dimension = new Dimension(x, y);
        component.setMinimumSize(dimension);
        component.setMaximumSize(dimension);
        component.setPreferredSize(dimension);
    }
}
