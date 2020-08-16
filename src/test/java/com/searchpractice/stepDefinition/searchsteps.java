package com.searchpractice.stepDefinition;

import com.searchpractice.webpages.searchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.is;

public class searchsteps {
    private searchPage SearchPage = new searchPage();

    @Given("^Customer is on homepage$")
    public void customer_is_on_homepage() throws Throwable {
        String actual = SearchPage.getCurrentUrl();


    }

    @When("^Customer search a \"([^\"]*)\"$")
    public void customer_search_a(String Product) throws Throwable {
          //SearchPage.search(Product);
          SearchPage.enterProduct(Product);

    }

    @When("^Customer clicks on a search button$")
    public void customer_clicks_on_a_search_button() throws Throwable {
        SearchPage.clickSearch();

    }

    @Then("^Customer can see all the product$")
    public void customer_can_see_all_the_product() throws Throwable {
        System.out.println("I can view all the product");

    }

}
