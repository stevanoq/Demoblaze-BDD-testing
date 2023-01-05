package pagesLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class element_locator {

    WebDriver driver;
    WebDriverWait wait;

    public element_locator(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@class='vjs-poster'])[1]")
    WebElement video;

    public String signup_tab = "(//a[normalize-space()='Sign up'])[1]";
    public String tag_table = "tr";
    public String first_table = "//tbody/tr[1]/td[2]";
    public String delete_button = "//tbody/tr[1]/td[4]/a[1]";
    public int prise_before_delete;
    public int prise_after_delete;
    public String prise_loc = "//h3[@id='totalp']";


    public boolean check_video(){
        boolean result;
        wait.until(ExpectedConditions.visibilityOf(video));
        if(video.isDisplayed()){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }

}
