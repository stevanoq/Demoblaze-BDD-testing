package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesLocator.element_locator;

public class Steps extends variable{
    WebDriverWait wait;
    WebDriver driver;

    @Given("i open browser and navigate to demoblaze")
    public void i_open_browser_and_navigate_to_demoblaze(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        elemen = new element_locator(driver, wait);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com/");
    }

    @When("i click {string} tab")
    public void i_click_tab(String tabName){
        String number = "";
        String tabXpath;
        if(tabName.equalsIgnoreCase("Home")){
            number = "1";
        }
        
        else if(tabName.equalsIgnoreCase("Contact")){
            number = "2";
        }
        
        else if(tabName.equalsIgnoreCase("About us")){
            number = "3";
        }

        else if(tabName.equalsIgnoreCase("Cart")){
            number = "4";
        }

        else if(tabName.equalsIgnoreCase("Log in")){
            number = "5";
        }

        else if(tabName.equalsIgnoreCase("Log out")){
            number ="6";
        }

        tabXpath = "(//a[@class='nav-link'])["+number+"]";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(tabXpath))).click();
    }

    @And("i click {string} button")
    public void i_click_button(String buttonName){
        String buttonXpath = "(//button[normalize-space()='"+buttonName+"'])[1]";
        if(buttonName.equalsIgnoreCase("delete")){
            buttonXpath = elemen.delete_button;
        }
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXpath))).click();
    }

    @When("check if alert message is same with {string}")
    public void check_if_alert_message_is_same_with(String expectedAlert){
        String get_alert = wait.until(ExpectedConditions.alertIsPresent()).getText();
        assertEquals(get_alert, expectedAlert);
    }

    @Then("accept alert")
    public void accept_alert(){
        wait.until(ExpectedConditions.alertIsPresent()).accept();
    }

    @And("i click x {string} button")
    public void i_click_x_button(String formName){
        String number = "";
        String xXpath;
        if(formName.equalsIgnoreCase("contact")){
            number = "1";
        }
        else if(formName.equalsIgnoreCase("signup")){
            number = "2";
        }
        else if(formName.equalsIgnoreCase("login")){
            number = "3";
        }
        else if(formName.equalsIgnoreCase("aboutus")){
            number = "4";
        }
        xXpath = "(//button[@type='button'][normalize-space()='Close'])["+number+"]";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xXpath))).click();
    }

    @And("i click close {string} button")
    public void i_click_close_button(String formName){
        String number ="";
        String closeXpath;
        if(formName.equalsIgnoreCase("contact")){
            number = "1";
        }
        else if(formName.equalsIgnoreCase("signup")){
            number = "2";
        }
        else if(formName.equalsIgnoreCase("login")){
            number = "3";
        }
        else if(formName.equalsIgnoreCase("aboutus")){
            number = "4";
        }
        closeXpath = "(//button[@type='button'][normalize-space()='Close'])["+ number +"]";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(closeXpath))).click();
    }

    @When("i enter {string} in {string} colum")
    public void i_enter_in_colum(String text, String id){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))).sendKeys(text);
    }

    @When("i clear {string} colum")
    public void i_clear_colum (String id){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))).clear();
    }

    @When("check if {string} is visible")
    public void check_if_is_visible(String id){
        boolean displayed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))).isDisplayed();
        boolean state = false;
        
        if(displayed){
            state = true;
        }
        else{
            state = false;
        }

        assertEquals(state, expectedState);
    }

    @Then("close browser")
    public void close_browser(){
        driver.close();
        driver.quit();
    }

    @Then("check if video is avalaible")
    public void check_if_video_is_avalaible(){
        boolean state = elemen.check_video();
        assertEquals(state, expectedState);
    }

    @And("check if form {string} is gone")
    public void check_if_form_is_gone(String formName) throws InterruptedException{
        String message = "";
        String formXpath;
        // Thread.sleep(1000);
        if(formName.equalsIgnoreCase("contact")){
            message = "New message";
        }
        else if(formName.equalsIgnoreCase("signup")){
            message = "Sign up";
        }
        else if(formName.equalsIgnoreCase("login")){
            message = "Log in";
        }
        else if(formName.equalsIgnoreCase("aboutus")){
            message = "About us";
        }
        // formXpath = "(//div[@class='modal-header'])["+number+"]";
        formXpath = "(//h5[normalize-space()='"+message+"'])[1]";
        boolean displayed = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(formXpath)));
        // boolean displayed = driver.findElement(By.xpath(formXpath)).isDisplayed();
        boolean state = false;
        
        if(displayed){
            state = true;
        }
        else{
            state = false;
        }

        assertEquals(state, expectedState);

    }

    @When("check if form {string} is appear")
    public void check_if_form_is_appear(String formName){
        String number = "";
        String formXpath;
        if(formName.equalsIgnoreCase("contact")){
            number = "1";
        }
        else if(formName.equalsIgnoreCase("signup")){
            number = "2";
        }
        else if(formName.equalsIgnoreCase("login") || formName.equalsIgnoreCase("placeOrder")){
            number = "3";
        }
        else if(formName.equalsIgnoreCase("aboutus")){
            number = "4";
        }
        formXpath = "(//div[@class='modal-header'])["+number+"]";
        boolean displayed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formXpath))).isDisplayed();
        boolean state = false;
        
        if(displayed){
            state = true;
        }
        else{
            state = false;
        }

        assertEquals(state, expectedState);

    }

    @And("i click sign up tab")
    public void i_click_sign_up_tab(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elemen.signup_tab))).click();
    }

    @And("i click {string} class button")
    public void i_click_class_button(String name){
        String xpath =  "//span[@class='"+name+"']";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
    }

    @Then("check if elemen {string} is appear")
    public void check_if_elemen_is_appear(String name){
        String number = "";
        String xpath;
        if(name.equalsIgnoreCase("head")){
            number = "1";
        }
        
        else if(name.equalsIgnoreCase("phone")){
            number = "2";
        }

        else if(name.equalsIgnoreCase("laptop")){
            number = "3";
        }

        else if(name.equalsIgnoreCase("monitor")){
            number = "4";
        }
        
        xpath = "//div[@id='contcont']//a["+number+"]";
        boolean displayed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).isDisplayed();
        boolean state = false;
        if(displayed){
            state = true;
        }
        
        else{
            state = false;
        }

        assertEquals(state, expectedState);
    }

    @When("i click elemen {string}")
    public void i_click_elemen(String name) throws InterruptedException{
        String number = "";
        String xpath;
        
        if(name.equalsIgnoreCase("phone")){
            number = "2";
        }

        else if(name.equalsIgnoreCase("laptop")){
            number = "3";
        }

        else if(name.equalsIgnoreCase("monitor")){
            number = "4";
        }
        
        xpath = "//div[@id='contcont']//a["+number+"]";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
        Thread.sleep(1000);
    }

    @Then("check if item {string} is appear")
    public void check_if_item_is_appear(String item){
        String xpath = "//a[normalize-space()='"+item+"']";
        boolean displayed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).isDisplayed();
        boolean result = false;
        if(displayed){
            result = true;
        }
        else{
            result = false;
        }
        assertEquals(result, expectedState);
    }

    @Then("i click item {string}")
    public void i_click_item(String item){
        String xpath = "//a[normalize-space()='"+item+"']";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
    }

    @When("item {string} is opened")
    public void item_is_opened(String item){
        String xpath = "//h2[normalize-space()='"+item+"']";
        boolean displayed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).isDisplayed();
        boolean result = false;
        if(displayed){
            result = true;
        }
        else{
            result = false;
        }
        assertEquals(result, expectedState);
    }

    @When("navigate back {string} times")
    public void navigate_back(String times){
        for(int i = 0; i < Integer.parseInt(times); i++ ){
            driver.navigate().back();
        }
    }

    @And("check if cart is not empty")
    public void check_if__is_not_empty(){
        
        int rows = driver.findElements(By.tagName(elemen.tag_table)).size();
        boolean state = false;
        if(rows != 0){
            state = true;
        }
        else{
            state = false;
        }
        assertEquals(state, expectedState);
    }

    @And("check if fist table is appear")
    public void check_if_fist_table_is_appear() throws InterruptedException{
        // Thread.sleep(1000);
        boolean displayed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elemen.first_table))).isDisplayed();
        boolean state = false;
        if(displayed){
            state = true;
        }
        else{
            state = false;
        }
        assertEquals(state, expectedState);
    }

    @And("get prize {string} delete")
    public void get_prize_delete(String when) {
        int before;
        int after;
        String total1, total2;
        if(when.equalsIgnoreCase("before")){
            for(int i = 0; i <= 5; i++){
                total1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elemen.prise_loc))).getText();
                before = Integer.parseInt(total1);
                elemen.prise_before_delete = before;
            }
            
        }

        else if(when.equalsIgnoreCase("after")){
            for(int i = 0; i <= 5; i++){
                total2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elemen.prise_loc))).getText();
                after =  Integer.parseInt(total2);
                elemen.prise_after_delete = after;
            }
            
        }
        System.out.println(elemen.prise_before_delete);
        System.out.println(elemen.prise_after_delete);
    }

    @When("check if prize after less than before")
    public void check_if_prize_after_less_than_before(){
        int before, after;
        boolean state = false;
        before = elemen.prise_before_delete;
        after = elemen.prise_after_delete;

        if(before > after){
            state = true;
        }
        else{
            state = false;
        }
        assertEquals(state, expectedState);
    }
}
