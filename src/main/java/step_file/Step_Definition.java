package step_file;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pom.HTML_Studio_Page;
import project_base.Base_Class;
import properties.File_Reader_Manager;

import java.awt.*;
import java.io.IOException;

public class Step_Definition extends Base_Class {
    public static WebDriver driver = launchingBrowser("chrome");
    public static HTML_Studio_Page html = new HTML_Studio_Page(driver);

    @Given("user has navigate to the url")
    public void user_has_navigate_to_the_url() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
        urlLaunch(url);
    }


    @When("user click on the draw a line")
    public void user_click_on_the_draw_a_line() {
       clickElement(html.getLine());
    }

    @Then("user can draw one horizontal line and vertical line should be intercept")
    public void user_can_draw_one_horizontal_line_and_vertical_line_should_be_intercept() throws AWTException {
        html.drawAHorizontalLine();
    }
    @When("user can click on draw a rectangle line")
    public void user_can_click_on_draw_a_rectangle_line() {
       clickElement(html.getRectangle());
    }

    @Then("user can draw a rectangle")
    public void user_can_draw_a_rectangle() {
        html.drawRectangle();

    }

    @Then("user can click use eraser and erase the horizontal line")
    public void user_can_click_use_eraser_and_erase_the_horizontal_line() {
        clickElement(html.getEraser());
        html.erase();
    }

}
