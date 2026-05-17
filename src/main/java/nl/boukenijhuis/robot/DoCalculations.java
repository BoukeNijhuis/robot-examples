package nl.boukenijhuis.robot;

import static java.awt.event.KeyEvent.*;

public class DoCalculations extends OpenCalculator {

    public static void main(String[] args) {
        new DoCalculations().execute();
    }

    public void execute() {
        // open the calculator
        super.execute();

        // wait for the calculator to open
        pause(1000);

        // type "5 - 3" and press enter
        pressKeys(VK_5, VK_MINUS, VK_3, VK_ENTER);


    }
}
