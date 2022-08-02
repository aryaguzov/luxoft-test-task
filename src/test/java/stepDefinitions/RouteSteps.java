package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import po.RoutePO;

public class RouteSteps {

    private final RoutePO routePO;

    public RouteSteps(RoutePO routePO) {
        this.routePO = routePO;
    }

    @Given("The user accesses the OpenStreetMap home page")
    public void accessHomePage() {
        routePO.navigateToUrl();
    }

    @When("The user clicks on the directions button")
    public void clickOnDirectionsButton() {
        routePO.clickOnDirectionsButton();
    }

    @And("The user enters the location into the route-from field")
    public void fillInRouteFromField() {
        routePO.setRouteFrom();
    }

    @And("The user enters the location into the route-to field")
    public void fillInRouteToField() {
        routePO.setRouteTo();
    }

    @And("The user chooses Bicycle \\(OSRM) as a desired type of transport")
    public void chooseBicycleOSRM() {
        routePO.selectBicycleOSRM();
    }

    @And("The user clicks on the go button")
    public void clickOnGoButton() {
        routePO.clickOnGoButton();
    }

    @Then("The script should verify total distance of the route")
    public void verifyRouteDistance() {
        routePO.verifyDistance();
    }
}
