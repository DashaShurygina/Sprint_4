package ru.praktikum.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.praktikum.selenium.pageobject.MainPageYandexScooter;
import ru.praktikum.selenium.pageobject.PageForWhomScooter;
import ru.praktikum.selenium.pageobject.PageScooterRental;

import java.util.concurrent.TimeUnit;

import static ru.praktikum.selenium.config.AppConfig.APP_URL;

public class SecondOrderTest {
    WebDriver webDriver;

    @Before
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    public void checkScooterOrder() {
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get(APP_URL);
        MainPageYandexScooter mainPageYandexScooter = new MainPageYandexScooter(webDriver);
        mainPageYandexScooter.clickCookieButton();
        mainPageYandexScooter.clickOrderButton2();
        PageForWhomScooter pageForWhomScooter = new PageForWhomScooter(webDriver);
        pageForWhomScooter.completeTheFirstPage("Маша", "Растеряша", "Москва улица", "89103365441");
        PageScooterRental pageScooterRental = new PageScooterRental(webDriver);
        pageScooterRental.completeTheSecondPage("25.05.2023", "тритри");
    }

    @After
    public void clean() {
        //Закрыть браузер
        webDriver.quit();
    }
}
