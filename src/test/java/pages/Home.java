package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Home {
    WebDriver driver;

    @FindBy(xpath = "//input[@id='hondaradio']")
    WebElement radiobutton;

    @FindBy(xpath = "//select[@id='carselect']")
    WebElement dropdown;

    @FindBy(xpath = "//select[@id='multiple-select-example']")
    WebElement multipleselection;

    @FindBy(xpath = "//input[@id='bmwcheck']")
    WebElement checkbox;

    @FindBy(xpath = "//button[@id='openwindow']")
    WebElement SwitchWindow;

    public Home(WebDriver driver){

        this.driver=driver;
    }

    public void verifyRadioButton(){

        radiobutton.click();
    }

    public void verifydropdown() {

        Select select=new Select(dropdown);
        select.selectByIndex(1);
    }

    public void verifymultipleselection() {

        Select select=new Select(multipleselection);
        select.selectByIndex(1);
        //select.selectByValue("apple");
        //select.selectByVisibleText("peach");
    }

    public void verifycheckbox(){
        checkbox.click();

    }
}

