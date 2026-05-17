package org.example;

import java.awt.*;

public class RobotHelper {

    private final Robot robot;

    public RobotHelper() {
        try {
            this.robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public void pressKeysAtTheSameTime(int... list) {
        // press all keys
        for (int keyEvent : list) {
            robot.keyPress(keyEvent);
        }

        // release all keys
        for (int keyEvent : list) {
            robot.keyRelease(keyEvent);
        }
    }

    public void pressKeys(int... list) {
        for (int keyEvent : list) {
            robot.keyPress(keyEvent);
            pause(100);
            robot.keyRelease(keyEvent);
        }
    }

    public void pause(int millis) {
        robot.delay(millis);
    }
}
