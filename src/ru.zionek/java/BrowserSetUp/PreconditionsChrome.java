package BrowserSetUp;

import Locators.OverAllPage;
import org.junit.After;
import org.junit.Before;

/**
 * Created by 1 on 13.03.2018.
 */
public class PreconditionsChrome extends OverAllPage {


    @Before
    public void setUp() {
        driver.get("https://dropmail.me/ru/");
    }

    @After
    public void tearDown() {
        driver.close();
    }

//    public WebElement find(By element){
//        return driver.findElement(element);
//    }


}
