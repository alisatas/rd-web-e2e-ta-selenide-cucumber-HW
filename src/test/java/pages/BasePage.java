package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import utils.PropertyManager;

public abstract class BasePage {

    protected String pageUrl;
    PropertyManager propertyManager = new PropertyManager();

    public BasePage(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void open() {
        String url = propertyManager.getProperty("APP_URL") ;
        Selenide.open(url);

    }
    public void openWebTable() {
        String url = propertyManager.getProperty("APP_WEBTABLES") ;
        Selenide.open(url);
    }
}
