package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.ProductPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DesktopsSteps {
    @And("click on {string}")
    public void clickOn(String showAllDesktop) {
        new HomePage().selectMenu("Show All Desktops");
    }

    @And("select sort by position {string}")
    public void selectSortByPosition(String ZtoA) {
        new DesktopPage().selectSortByOption("Name: Z to A");
    }

    @Then("I can see the products in descending order")
    public void iCanSeeTheProductsInDescendingOrder() {
        Assert.assertEquals(new DesktopPage().getProductsNameList(), "Name: Z to A", "Error Message");
    }

    @And("select sort by the position {string}")
    public void selectSortByThePosition(String AtoZ) {
        new DesktopPage().selectSortByOption("Name:A to Z");
    }

    @And("select delivery date {string}")
    public void selectDeliveryDate(int arg0, int arg1, int arg2) {
    }

    @And("enter qty {int} using select class")
    public void enterQtyUsingSelectClass(int arg0) {
        new ProductPage().enterQuantity("");
    }

    @And("click on {string} button")
    public void clickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("I click on link {string} display into success message")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @Then("I can see the Product name {string}")
    public void iCanSeeTheProductName(String arg0) {
        Assert.assertEquals(new ShoppingCartPage().getProductName(),"product name", "Error message displayed");
    }

    @Then("I can see the Delivery Date {string}")
    public void iCanSeeTheDeliveryDate(String arg0) {
        Assert.assertEquals(new ShoppingCartPage().getProductName(),"Delivery Date", "Error message displayed");
    }
    @And("select {string}")
    public void selectProduct() {
        new DesktopPage().selectProductByName("product");

    }
    @Then("I can see the {string}")
    public void iCanSeeTheModel() {
        Assert.assertEquals(new ShoppingCartPage().getModel(), "model", "Error Message");
    }

    @Then("I can see the Total {string}")
    public void iCanSeeTheTotal(String arg0)
    {
        Assert.assertEquals(new ShoppingCartPage().getTotal(),"total", "Error message");
    }
}
