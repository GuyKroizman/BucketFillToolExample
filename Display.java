package com.company;

import java.util.Arrays;

public class Display {
    private static final int DISPLAY_HEIGHT = 10;
    private static final int DISPLAY_WIDTH = 30;

    private char[][] displayBuffer = new char[DISPLAY_HEIGHT][DISPLAY_WIDTH];

    public Display() {

        for (char[] row : displayBuffer) {
            for(int i = 0 ; i < DISPLAY_WIDTH ; i++) {
                row[i] = 'X';
            }
        }
    }

    @Override
    public String toString() {
        String r = "";

        for (char[] chars : displayBuffer) {
            for (char aChar : chars) {
                r += aChar;
            }
            r+= '\n';
        }
        return r;
    }

    public char getColor(Position position) {

        int x = position.getX();
        int y = position.getY();

        if(x < 0 || x >= DISPLAY_WIDTH)
            return 'f';

        if(y< 0 || y >= DISPLAY_HEIGHT)
            return 'f';

        return displayBuffer[y][x];
    }

    public void setColor(int x, int y, char fillingColor) {
        displayBuffer[y][x] = fillingColor;
    }
}
