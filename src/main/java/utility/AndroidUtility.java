package utility;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import net.thucydides.core.webdriver.WebDriverFacade;

import java.time.Duration;

public class AndroidUtility {
//    public static String flightBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView";
    private static final int midX = 540;
    private static final int midY = 960;

    public static void swipe(int startx, int starty, int endx, int endy, int duration) {
        new TouchAction(getCurrentDriver())
                .press(new PointOption().withCoordinates(startx, starty))
                .waitAction(new WaitOptions().withDuration(Duration.ofMillis(duration)))
                .moveTo(new PointOption().withCoordinates(endx, endy)).release().perform();
    }

    private static AndroidDriver getCurrentDriver() {
        return (AndroidDriver) ((WebDriverFacade) ThucydidesWebDriverSupport.getDriver()).getProxiedDriver();
    }

    public static void swipeDown(int distance){
        swipe(midX,midY,midX,midY+distance,500);
    }
    public static void swipeUp(int distance){
        swipe(midX,midY,midX,midY-distance,500);
    }
    public static void swipeLeft(int distance){
        swipe(midX,midY,midX-distance,midY,500);
    }
    public static void swipeRight(int distance){
        swipe(midX,midY,midX+distance,midY,500);
    }
}
