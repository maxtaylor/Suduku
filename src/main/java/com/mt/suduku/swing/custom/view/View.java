package com.mt.suduku.swing.custom.view;

import com.mt.suduku.start.SudukuProperties;
import com.mt.suduku.swing.custom.componenet.Menu;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 * Created by root on 11/01/17.
 */
public final class View extends JFrame {
    public View(SudukuProperties sudukuProperties) {
        setTitle(sudukuProperties.getProperty(getClass(), "title"));

        setJMenuBar(new Menu());
        getContentPane().add(new View1());

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }

        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                setLocationRelativeTo(null);
            }

        });
    }
}
