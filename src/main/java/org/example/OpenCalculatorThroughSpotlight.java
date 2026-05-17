package org.example;

import static java.awt.event.KeyEvent.*;

public class OpenCalculatorThroughSpotlight extends RobotHelper {

    public static void main(String[] args) {
        new OpenCalculatorThroughSpotlight().execute();
    }

    public void execute() {
        // press the command key and space to bring up spotlight
        pressKeysAtTheSameTime(VK_META, VK_SPACE);

        // type "calc"
        pressKeys(VK_C, VK_A, VK_L, VK_C);

        // wait a second
        pause(1000);

        // press enter
        pressKeys(VK_ENTER);
    }
}
