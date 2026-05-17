package org.example;

import static java.awt.event.KeyEvent.*;

public class PrepareForDemos extends RobotHelper {

    public static void main(String[] args) {
        new PrepareForDemos().execute();
    }

    public void execute() {
        cleanAndCloseCalculator();
        cleanAndCloseSpotlight();
    }

    private void cleanAndCloseSpotlight() {
        // open spotlight
        new OpenSpotlight().execute();

        // remove previous input and close spotlight
        pressKeys(VK_BACK_SPACE, VK_ESCAPE);
    }

    private void cleanAndCloseCalculator() {
        // start the calculator
        new OpenCalculator().execute();

        // remove previous input
        pressKeys(VK_ESCAPE);

        // close the calculator
        pressKeysAtTheSameTime(VK_META, VK_Q);
    }
}
