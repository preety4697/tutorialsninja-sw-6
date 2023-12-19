package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.ComponentsPage;
import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
        
    }

    @And("I hover on the Desktops tab and click")
    public void iHoverOnTheDesktopsTabAndClick() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }

    @And("call selectMenu method and pass the menu {string}")
    public void callSelectMenuMethodAndPassTheMenu(String menu) {
        new HomePage().selectMenu(menu);
    }

    @Then("I can see the text {string}")
    public void iCanSeeTheTextDesktops() {
        Assert.assertEquals(new DesktopPage().getDesktopsText(), "Desktops", "User navigated to Desktops Page");
    }

    @And("I hover on the Laptops & Notebooks tab and click")
    public void iHoverOnTheLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @And("I hover on the Components tab and click")
    public void iHoverOnTheComponentsTabAndClick() {
        new HomePage().mouseHoverOnComponentLinkAndClick();
    }


    @Then("I can see the text 'Components")
    public void iCanSeeTheTextComponents() {
        Assert.assertEquals(new ComponentsPage().getComponentsText(), "Desktops", "User navigated to Desktops Page");
    }
}
