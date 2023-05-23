package ru.praktikum.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.praktikum.selenium.pageobject.MainPageYandexScooter;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static ru.praktikum.selenium.config.AppConfig.APP_URL;

@RunWith(Parameterized.class)

public class CheckTextTest {
    WebDriver webDriver;
    private String question;
    private static String answer;
    private static String expected;

    public CheckTextTest(String question, String answer, String expected) {
        this.question = question;
        this.answer = answer;
        this.expected = expected;


    }

    @Parameterized.Parameters

    public static Object[][] getQuestions() {
        return new Object[][]{
                {"accordion__heading-0", "accordion__panel-0", "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {"accordion__heading-1", "accordion__panel-1", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {"accordion__heading-2", "accordion__panel-2", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {"accordion__heading-3", "accordion__panel-3", "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {"accordion__heading-4", "accordion__panel-4", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {"accordion__heading-5", "accordion__panel-5", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {"accordion__heading-6", "accordion__panel-6", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {"accordion__heading-7", "accordion__panel-7", "Да, обязательно. Всем самокатов! И Москве, и Московской области."},

        };
    }

    @Before
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    public void checkTextTest() {

        webDriver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
        webDriver.get(APP_URL);
        MainPageYandexScooter objHomePage = new MainPageYandexScooter(webDriver);
        objHomePage.clickCookieButton();
        objHomePage.clickQuestion(question);
        String actualAnswer = webDriver.findElement(By.id(answer)).getText();
        assertEquals("Не верный текст ответа", expected, actualAnswer);
    }


    @After
    public void teardown() {
        //Закрыть браузер
        webDriver.quit();
    }
}

