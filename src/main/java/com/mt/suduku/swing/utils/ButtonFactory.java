package com.mt.suduku.swing.utils;

import com.mt.suduku.swing.custom.componenet.Button;

/**
 * Created by root on 12/01/17.
 */
public class ButtonFactory {

    private static final int gridWidth = 50;
    private static final int gridHeight = 50;
    private static final int menuWidth = 100;
    private static final int menuHeight = 100;
    private static final int topMenuWidth = 80;
    private static final int topMenuHeight = 80;

    public static Button creteGridButton(String title) {
        return new Button(title, null, gridWidth, gridHeight);
    }

    public static Button creteMenuButton(String title) {
        return new Button(title, null, menuWidth, menuHeight);
    }

    public static Button creteTopMenuButton(String title) {
        return new Button(title, null, topMenuWidth, topMenuHeight);
    }
}
