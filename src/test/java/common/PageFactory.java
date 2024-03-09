package common;

import pages.HomePage;

public class PageFactory {


    public static HomePage buildHomePage() {
        return new HomePage("/inventory.html");
    }

}
