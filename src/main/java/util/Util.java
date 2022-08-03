package util;

import org.openqa.selenium.WebElement;

public class Util {

    public static final String URL = "https://www.openstreetmap.org/";

    public static final int DEFAULT_EXPLICIT_TIMEOUT = 10;

    public static final String ROUTE_FROM = "Радищева, Київ";

    public static final String ROUTE_TO = "Кембридж";

    public static final String DISTANCE_BETWEEN_ROUTES = "2423km";

    public static final int BICYCLE_OSRM_IDX = 1;

    public static boolean checkWhetherWebElementContainsText(WebElement element, String text) {
        return element.getText().contains(text);
    }

    private Util() {
    }
}
