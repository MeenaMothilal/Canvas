package page_object_manager;

import org.openqa.selenium.WebDriver;
import pom.HTML_Studio_Page;

public class Page_Manager {
    public WebDriver driver;

    public Page_Manager(WebDriver driver) {
        this.driver = driver;

    }

    private HTML_Studio_Page html;

    public HTML_Studio_Page getHtml() {
        if (html == null) {
            html = new HTML_Studio_Page(driver);
        }

        return html;
    }
}