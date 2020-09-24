package com.certificacion.sophos.utest.stepdefinitions;

import com.certificacion.sophos.utest.tasks.DataPersonal;
import com.certificacion.sophos.utest.tasks.HomePage;
import com.certificacion.sophos.utest.utils.Option;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class RegisterUsersStepdefinitions {

    @Managed (driver = "Chrome")
    WebDriver hisDriver;

    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Daniela toro");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));
    }
    @Given("^the user enters the page$")
    public void theUserEntersThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(HomePage.to(Option.PAGE));
    }

    @When("^You must fill out the form$")
    public void youMustFillOutTheForm(List<Map<String , String>> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(DataPersonal.data(data));

    }

    @Then("^the validate the register succes$")
    public void theValidateTheRegisterSucces() {

    }

}
