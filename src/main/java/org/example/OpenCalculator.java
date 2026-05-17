package org.example;

import static java.awt.event.KeyEvent.*;

public class OpenCalculator extends OpenSpotlight {

    public static void main(String[] args) {
        new OpenCalculator().execute();
    }

    public void execute() {
        // open spotlight
        super.execute();

        // type "calc"
        pressKeys(VK_C, VK_A, VK_L, VK_C);

        // give the index time to find the calculator
        pause(1000);

        // press enter
        pressKeys(VK_ENTER);

        // give calculator time to open
        pause(1000);
    }
}
