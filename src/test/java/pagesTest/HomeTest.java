package pagesTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.Home;

import java.util.concurrent.TimeUnit;

public class HomeTest {
    WebDriver driver;
    @Test
    public void RadioButtonTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://courses.letskodeit.com/practice");

        Home homePage= PageFactory.initElements(driver, Home.class);
        homePage.verifyRadioButton();

    }

    @Test
    public void dropdownTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://courses.letskodeit.com/practice");

        Home homePage=PageFactory.initElements(driver,Home.class);
        homePage.verifydropdown();
}

    @Test
    public void multipleselectionTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://courses.letskodeit.com/practice");

        Home homePage=PageFactory.initElements(driver,Home.class);
        homePage.verifymultipleselection();
    }
    @Test
    public void checkboxTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://courses.letskodeit.com/practice");

        Home homePage=PageFactory.initElements(driver,Home.class);
        homePage.verifycheckbox();
    }

}
