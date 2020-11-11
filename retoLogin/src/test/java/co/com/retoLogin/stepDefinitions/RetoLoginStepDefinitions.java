package co.com.retoLogin.stepDefinitions;


import co.com.retoLogin.interaction.dresses.Evening;
import co.com.retoLogin.interaction.open_browser.OpenBrowser;
import co.com.retoLogin.interaction.order.Validate;
import co.com.retoLogin.interaction.order.ValidateOrder;
import co.com.retoLogin.interaction.women.Blouse;
import co.com.retoLogin.questions.order_cart.Authentication;
import co.com.retoLogin.questions.order_cart.Products;
import co.com.retoLogin.tasks.clothe_options.DressesWoman;
import co.com.retoLogin.tasks.clothe_options.WomanClothes;
import co.com.retoLogin.tasks.home.ToReturn;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RetoLoginStepDefinitions {

    @Given("^The user is on Homepage$")
    public void theUserIsOnHomepage() {
        theActorCalled("Andres").wasAbleTo(OpenBrowser.withUrl());
    }

    @When("^the user select clothes woman$")
    public void theUserSelectClothesWoman(){
        theActorInTheSpotlight().attemptsTo(WomanClothes.add());
    }
    @When("^the user select blouse$")
    public void theUserSelectBlouse(){
        theActorInTheSpotlight().attemptsTo(Blouse.toNice());
    }
    @Then("^the user is returned to the homepage$")
    public void theUserIsReturnedToTheHomepage() {
        theActorInTheSpotlight().attemptsTo(ToReturn.atHome());
    }

    @Then("^user verifies the total products$")
    public void userVerifiesTheTotalProduct() {
        theActorInTheSpotlight().attemptsTo(Validate.onCart());
        theActorInTheSpotlight().should(seeThat(Products.amount()));
        theActorInTheSpotlight().attemptsTo(ValidateOrder.checkOut());
        theActorInTheSpotlight().should(seeThat(Authentication.success()));
    }

    @When("^the user select Dresses woman$")
    public void theUserSelectDressesWoman(){
        theActorInTheSpotlight().attemptsTo(DressesWoman.toAdd());
    }
    @When("^the user select evening dress$")
    public void theUserSelectEveningDress(){
        theActorInTheSpotlight().attemptsTo(Evening.specialDress());
    }
}
