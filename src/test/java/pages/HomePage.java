package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage{

    public SelenideElement buttonsButton = $ ( By.xpath ( "//div[@class='element-list collapse show']//li[@class='btn btn-light '][(count(preceding-sibling::*)+1) = 5]" ));
    public SelenideElement clickMeButton = $ (By.xpath ("//div[@class='col-12 mt-4 col-md-6']//div[(count(preceding-sibling::*)+1) = 4]//button"));
    public SelenideElement getTextDynamicMessage = $(By.xpath ("//p[@id='dynamicClickMessage']"));
    public SelenideElement addButton = $(By.xpath ("//button[@id='addNewRecordButton']"));
    public SelenideElement firstNameText = $(By.xpath ("//input[@id='firstName']"));
    public SelenideElement surNameText = $(By.xpath ("//input[@id='lastName']"));
    public SelenideElement emailText = $(By.xpath ("//input[@id='userEmail']"));
    public SelenideElement ageText = $(By.xpath ("//input[@id='age']"));
    public SelenideElement salaryText = $(By.xpath ("//input[@id='salary']"));
    public SelenideElement departmentText = $(By.xpath ("//input[@id='department']"));
    public SelenideElement saveButton = $(By.xpath ("//button[@id='submit']"));
    public SelenideElement editButton = $(By.xpath ("//span[@id='edit-record-3']/svg"));
    public SelenideElement editedName=$("#app > div > div > div > div.col-12.mt-4.col-md-6 > div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.rt-table > div.rt-tbody > div:nth-child(3) > div > div:nth-child(1)");



    public HomePage(String pageUrl) {
        super(pageUrl);
    }



    public void editUser(String name, String surname, String email, String age, String salary, String department) {
        firstNameText.setValue(name);
        surNameText.setValue(surname);
        emailText.setValue(email);
        ageText.setValue(age);
        salaryText.setValue(salary);
        departmentText.setValue(department);
    }


}
