package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Display display = new Display();

        // mouse click coordinates
        int x = 1;
        int y = 1;
        Position clickPosition = new Position(x, y);

        char colorToBeReplacedWithFillingColor = display.getColor(clickPosition);
        char fillingColor = '*';

        bucketFill(display, clickPosition, colorToBeReplacedWithFillingColor, fillingColor);

    }

    private static void bucketFill(Display display, Position clickPosition, char colorToBeReplacedWithFillingColor, char fillingColor) throws InterruptedException {

        int x = clickPosition.getX();
        int y = clickPosition.getY();

        display.setColor(x, y, fillingColor);

        JustForShow(display);

        Position position = new Position(x + 1, y);
        if(display.getColor(position) == colorToBeReplacedWithFillingColor) {
            bucketFill(display, position, colorToBeReplacedWithFillingColor, fillingColor);
        }

        position = new Position(x+1, y+1);
        if(display.getColor(position) == colorToBeReplacedWithFillingColor) {
            bucketFill(display, position, colorToBeReplacedWithFillingColor, fillingColor);
        }

        position = new Position(x, y+1);
        if(display.getColor(position) == colorToBeReplacedWithFillingColor) {
            bucketFill(display, position, colorToBeReplacedWithFillingColor, fillingColor);
        }

        position = new Position(x-1, y+1);
        if(display.getColor(position) == colorToBeReplacedWithFillingColor) {
            bucketFill(display, position, colorToBeReplacedWithFillingColor, fillingColor);
        }

        position = new Position(x-1, y);
        if(display.getColor(position) == colorToBeReplacedWithFillingColor) {
            bucketFill(display, position, colorToBeReplacedWithFillingColor, fillingColor);
        }

        position = new Position(x-1, y-1);
        if(display.getColor(position) == colorToBeReplacedWithFillingColor) {
            bucketFill(display, position, colorToBeReplacedWithFillingColor, fillingColor);
        }

        position = new Position(x, y-1);
        if(display.getColor(position) == colorToBeReplacedWithFillingColor) {
            bucketFill(display, position, colorToBeReplacedWithFillingColor, fillingColor);
        }

        position = new Position(x+1, y-1);
        if(display.getColor(position) == colorToBeReplacedWithFillingColor) {
            bucketFill(display, position, colorToBeReplacedWithFillingColor, fillingColor);
        }


    }

    private static void JustForShow(Display display) throws InterruptedException {
        System.out.println(display.toString());
        Thread.sleep(100);

        // clear the screen. kind of.
        for(int clear = 0; clear < 1000; clear++)
        {
            System.out.println("\b") ;
        }
    }


}
