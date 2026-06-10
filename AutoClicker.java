import java.awt.Robot;
import java.awt.event.InputEvent;

public class AutoClicker {
    public static void main(String[] args) throws Exception {

        Robot robot = new Robot();

        System.out.println("5秒後に開始（マイクラに切り替えて）");
        Thread.sleep(5000);

        while (true) {
            // 2.5〜3.2秒（2500〜3200ms）
            int wait = 2500 + (int)(Math.random() * 700);
            Thread.sleep(wait);

            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            System.out.println("クリック！ " + wait + "ms");
        }
    }
}