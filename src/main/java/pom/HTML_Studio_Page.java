package pom;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class HTML_Studio_Page {
public WebDriver driver;

    public WebElement getLine() {
        return line;
    }

    public WebElement getRectangle() {
        return rectangle;
    }

    public WebElement getEraser() {
        return eraser;
    }
    public WebElement getCanvas() {
        return canvas;
    }

    public HTML_Studio_Page(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//input[@class='button line']")
private WebElement line;

@FindBy(xpath = "//input[@class='button rectangle']")
    private WebElement rectangle;
@FindBy(xpath = "//input[@class='button eraser']")
    private WebElement eraser;

@FindBy(xpath = "//canvas[@id='imageTemp']")
    private WebElement canvas;

public void drawAHorizontalLine() throws AWTException {
   Actions ac = new Actions(driver);
//    ac.moveToElement(canvas,250,250).build().perform();
    ac.moveToElement(canvas,-50,0).click().build().perform();
    //ac.click(canvas).build().perform();
    ac.moveToElement(canvas,50,0).click().build().perform();
    ac.moveToElement(canvas,0,-50).click().build().perform();
//    ac.click(canvas).build().perform();
    ac.moveToElement(canvas,0,50).click().build().perform();

}
public void drawRectangle(){
    Actions ac = new Actions(driver);
    ac.moveToElement(canvas,-50,100).click().build().perform();
    ac.moveToElement(canvas,100,200).click().build().perform();
}
public void erase(){
    Actions ac = new Actions(driver);
    ac.moveToElement(canvas,-50,0).clickAndHold().build().perform();
    ac.moveToElement(canvas,50,0).release().build().perform();
}
}


