package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonOrder {
    @Given("I have a search field on amazom page")
    public void iHaveASearchFieldOnAmazomPage() {
        System.out.println("Go to browser and search for amaozn page");
    }

    @When("I search for a product with name {string} and price {int}")
    public void iSearchForAProductWithNameAndPrice(String productName, String productPrice) {
        System.out.println("order the product with name"+productName+"and with the price of "+productPrice);
    }

    @Then("Product with name {string} should be displayed")
    public void productWithNameShouldBeDisplayed(String productName) {
        System.out.println("Product should appear the screen with name"+productName);
    }

    @Then("order id with {int}")
    public void orderIdWith(int orderId) {
        System.out.println("order id with "+orderId);
    }
}
