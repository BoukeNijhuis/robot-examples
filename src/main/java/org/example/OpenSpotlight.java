package org.example;

import static java.awt.event.KeyEvent.*;

public class OpenSpotlight extends RobotHelper {

    public static void main(String[] args) {
        new OpenSpotlight().execute();
    }

    public void execute() {
        // press the command key and space to bring up spotlight
        pressKeysAtTheSameTime(VK_META, VK_SPACE);

        // give spotlight time to open
        pause(1000);
    }
}
