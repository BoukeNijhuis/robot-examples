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
            reliabilityPause();
        }

        // release all keys
        for (int keyEvent : list) {
            robot.keyRelease(keyEvent);
            reliabilityPause();
        }
    }

    public void pressKeyMultipleTimes(int keyEvent, int times) {
        for (int i = 0; i < times; i++) {
            pressKeys(keyEvent);
        }
    }

    public void pressKeys(int... list) {
        for (int keyEvent : list) {
            robot.keyPress(keyEvent);
            robot.keyRelease(keyEvent);
        }
    }

    private void reliabilityPause() {
        // for reliability (without the OS has troubles keeping up)
        pause(100);
    }

    public void pause(int millis) {
        robot.delay(millis);
    }
}
