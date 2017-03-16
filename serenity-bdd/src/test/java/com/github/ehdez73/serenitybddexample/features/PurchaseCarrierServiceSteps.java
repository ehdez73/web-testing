package com.github.ehdez73.serenitybddexample.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PurchaseCarrierServiceSteps {


    @Given("^the user is on the website home page$")
    public void the_user_is_on_the_website_home_page() throws Throwable {
        // Do nothing
    }

    @When("^the user specify to send from \"([^\"]*)\"-\"([^\"]*)\" to \"([^\"]*)\"-\"([^\"]*)\"$")
    public void the_user_specify_to_send_from_to(String fromPostalZone, String FromPostalCode, String toPostalZone, String toPostalCode) throws Throwable {
       // Do nothing
    }

    @When("^the user specify the package dimensions as \"([^\"]*)\"x\"([^\"]*)\"x\"([^\"]*)\" cm3 and \"([^\"]*)\" kg$")
    public void the_user_specify_the_package_dimensions(String length, String width, String height, int weight ) throws Throwable {
       // Do nothing
    }

    @When("^the user search for services of type \"([^\"]*)\"$")
    public void the_user_search_for_services_of_type(String serviceType) throws Throwable {
       // Do nothing
    }

    @When("^the user specify the receiver as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void the_user_specify_the_receiver_as(String name, String surname, String address, String phone, String email) throws Throwable {
       // Do nothing
    }

    @When("^the user complete the payment$")
    public void the_user_complete_the_payment() throws Throwable {
       // Do nothing
    }

    @Then("^the user should see the shipment tracking info$")
    public void the_user_should_see_the_shipment_tracking_info() throws Throwable {
       // Do nothing
    }

    @Then("^the user should be able to download the recipt$")
    public void the_user_should_be_able_to_download_the_recipt() throws Throwable {
       // Do nothing
    }

}
