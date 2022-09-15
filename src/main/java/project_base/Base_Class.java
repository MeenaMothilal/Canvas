package project_base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Base_Class {
    public static WebDriver driver;

    public static  WebDriver launchingBrowser(String browserName) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mural\\OneDrive\\Desktop\\Abinaya\\RestAPI\\45\\Interview\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver .manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        return driver;
    }
    public static void urlLaunch(String url) {
        driver.get(url);
    }
    public static void passInput(WebElement element, String input) {
        element.sendKeys(input);
    }
    public static void clickElement(WebElement element) {
        element.click();
    }
    public static void selectByVisibleText(WebElement element, String text) {
        Select s = new Select(element);
        s.selectByVisibleText(text);
    }
    public static void deselectByVisibleText(WebElement element, String text) {
        Select s = new Select(element);
        s.deselectByVisibleText(text);
    }
    public static void selectByIndex(WebElement element, String value) {
        Select s = new Select(element);
        s.selectByIndex(Integer.parseInt(value));
    }
    public static void deselectByIndex(WebElement element, String value) {
        Select s = new Select(element);
        s.deselectByIndex(Integer.parseInt(value));
    }
    public static void selectByValue(WebElement element, String value) {
        Select s = new Select(element);
        s.selectByValue(value);
    }
    public static void deselectByValue(WebElement element, String value) {
        Select s = new Select(element);
        s.deselectByValue(value);
    }
    public static void close(){
        driver.close();
    }
    public static void quit(){
        driver.quit();
    }
    public static void navigateToMethod(String url){
        driver.navigate().to(url);
    }
    public static void navigateToBack(){
        driver.navigate().back();
    }
    public static void navigateToForward(){
        driver.navigate().forward();
    }
    public static void navigateToRefresh(){
        driver.navigate().refresh();
    }
    public static void gettingMethod(String value){
        driver.get(value);
    }
    public static void alertMethodAccept(WebElement element){
        driver.switchTo().alert().accept();

    }
    public static void alertMethodDismiss(WebElement element){
        driver.switchTo().alert().dismiss();

    }
    public static void alertMethodSendKeys(WebElement element,String input){
        driver.switchTo().alert().sendKeys(input);

    }
    public static void moveToElementMethod(WebElement element){
        Actions ac = new Actions(driver);
        ac.moveToElement(element).build().perform();

    }
    public static void clickActionMethod(){
        Actions ac = new Actions(driver);
        ac.click().build().perform();
    }
    public static void contextClickActionMethod(WebElement element){
        Actions ac = new Actions(driver);
        ac.moveToElement(element).contextClick().build().perform();
    }
    public static void keyPressMethod() throws AWTException {
        Robot rc = new Robot();
        rc.keyPress(KeyEvent.VK_DOWN);
        rc.keyRelease(KeyEvent.VK_DOWN);
        rc.keyPress(KeyEvent.VK_ENTER);
        rc.keyRelease(KeyEvent.VK_ENTER);
        rc.mousePress(1);
        rc.mouseRelease(1);
    }
    public static void defalutFrame(){
        driver.switchTo().defaultContent();
    }
    public static void mainFrame(int index){
        driver.switchTo().frame(index);
    }
    public static void frameString(String input){
        driver.switchTo().frame(input);
    }
    public static void frameElement(WebElement element){
        driver.switchTo().frame(element);
    }
    public static void windowHandlingMethod(String id){
        driver.switchTo().window(id).getTitle();
    }

    public static void checkBox(WebElement element){
        element.click();
    }
    public static void multipleSelectMethod(WebElement element) {
        Select s = new Select(element);
        s.isMultiple();
    }
    public static void enabledMethod(WebElement element){
        element.isEnabled();
    }
    public static void displayedMethod(WebElement element){
        element.isDisplayed();
    }
    public static void selectMethod(WebElement element){
        element.isSelected();
    }
    public static void getTitleMethod(WebElement element){
        driver.getTitle();

    }
    public static void getCurrentUrlMethod(){
        driver.getCurrentUrl();

    }
    public static void getTextMethod(WebElement element){
        element.getText();

    }
    public static void getAttributeMethod(WebElement element,String value){
        element.getAttribute(value);

    }
    public static void waitMethod() throws InterruptedException {
        driver.wait();
    }
    public static void takeShotMethod(String url) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest  = new File(url);
        FileHandler.copy(src,dest);
    }
    public static void scrollDownView(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView;",element);
    }
    public static void scrollUpView(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView;",element);
    }
    public static void radioButton(WebElement element){
        element.click();
    }
    public static void getFirstSelectedOption(WebElement element){
        Select s = new Select(element);
        s.getFirstSelectedOption();
    }
    public static void getOptionsMethod(WebElement element){
        Select s = new Select(element);
        s.getOptions();    }


    public static void getALlSelectedOptionMethod(WebElement element) {
        Select s = new Select(element);
        s.getAllSelectedOptions();
    }
    public static void clearing(WebElement element){
        element.clear();
    }

}

