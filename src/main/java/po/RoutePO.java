package po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static util.Util.*;

public class RoutePO extends BasePO {

    @FindBy(xpath = "//div[@id='sidebar']//a[@href='/directions']")
    private WebElement directionsButton;

    @FindBy(xpath = "//div[@id='sidebar']//input[@id='route_from']")
    private WebElement routeFrom;

    @FindBy(xpath = "//div[@id='sidebar']//input[@id='route_to']")
    private WebElement routeTo;

    @FindBy(xpath = "//div[@id='sidebar']//select[@name='routing_engines']")
    private WebElement transportDropdownMenu;

    @FindBy(xpath = "//div[@id='sidebar']//input[@class='routing_go btn btn-sm btn-primary']")
    private WebElement goButton;

    @FindBy(xpath = "//div[@id=\"sidebar_content\"]/p[contains(text(),'km')]")
    private WebElement distance;

    public RoutePO() {
        super();
    }

    public void navigateToUrl() {
        navigateToUrl(URL);
    }

    public void clickOnDirectionsButton() {
        directionsButton.click();
    }

    public void setRouteFrom() {
        sendKeys(routeFrom, ROUTE_FROM);
    }

    public void setRouteTo() {
        sendKeys(routeTo, ROUTE_TO);
    }

    public void selectBicycleOSRM() {
        Select transportOptions = new Select(transportDropdownMenu);
        transportOptions.selectByIndex(BICYCLE_OSRM_IDX);
    }

    public void clickOnGoButton() {
        waitForElementIsVisible(goButton);
        goButton.click();
    }

    public void verifyDistance() {
        waitForElementIsVisible(distance);
        boolean result = checkWhetherWebElementContainsText(distance, DISTANCE_BETWEEN_ROUTES);
        Assert.assertTrue(result);
    }
}
