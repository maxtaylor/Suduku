package com.mt.suduku.swing.custom.componenet;

import com.mt.suduku.swing.utils.ButtonFactory;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 11/01/17.
 */
public final class Grid extends JComponent {
    private final int xSize = 9;
    private final int ySize = 9;
    private final Map<String, Button> mapOfSegments = new HashMap<String, Button>(xSize * ySize);

    public Grid() {
        setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.RED));
        setOpaque(false);
        setLayout(new GridLayout(xSize, ySize));
        for (int xIndex = 0; xIndex < xSize; xIndex++) {
            for (int yIndex = 0; yIndex < ySize; yIndex++) {
                final String key = "" + xIndex + yIndex;
                final Button button = ButtonFactory.creteMenuButton("" + xIndex + yIndex);
                mapOfSegments.put(key, button);
                add(button);
            }
        }
    }
}
