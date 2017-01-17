package com.mt.suduku.swing.custom.componenet;

import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 12/01/17.
 */
public final class ErrorLog extends JPanel {

    private final JList x = new JList();

    public ErrorLog() {
        setLayout(new BorderLayout());
        add(new JScrollPane(x), BorderLayout.CENTER);
    }

}
