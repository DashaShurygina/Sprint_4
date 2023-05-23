package ru.praktikum.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Класс главной страницы
public class MainPageYandexScooter {
    public MainPageYandexScooter(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    WebDriver webDriver;
    private By orderButton1 = By.className("Button_Button__ra12g");
    //кнопка заказать верхняя
    private By cookieButton = By.className("App_CookieButton__3cvqF");
    //кнопка принять куки нажимать перед нижней кнопкой заказать и перед кликом на вопросы
    private By orderButton2 = By.className("Button_Middle__1CSJM");
    //кнопка заказать нижняя
    private By firstQuestion = By.id("accordion__heading-0");
    //Сколько это стоит? И как оплатить?
    private By firstAnswer= By.id("accordion__panel-0");
    //Сутки — 400 рублей. Оплата курьеру — наличными или картой.
    private By secondQuestion = By.id("accordion__heading-1");
    //Хочу сразу несколько самокатов! Так можно?
    private By secondAnswer= By.id("accordion__panel-1");
    //Пока что у нас так: один заказ — один самокат...
    private By thirdQuestion = By.id("accordion__heading-2");
    //Как рассчитывается время аренды?
    private By thirdAnswer= By.id("accordion__panel-2");
    //Допустим, вы оформляете заказ на 8 мая...
    private By fourthQuestion = By.id("accordion__heading-3");
    //Можно ли заказать самокат прямо на сегодня?
    private By fourthAnswer= By.id("accordion__panel-3");
    //Только начиная с завтрашнего дня...
    private By fifthQuestion = By.id("accordion__heading-4");
    //Можно ли продлить заказ или вернуть самокат раньше?
    private By fifthAnswer= By.id("accordion__panel-4");
    //Пока что нет! Но если что-то срочное...
    private By sixthQuestion = By.id("accordion__heading-5");
    //Вы привозите зарядку вместе с самокатом?
    private By sixthAnswer= By.id("accordion__panel-5");
    //Самокат приезжает к вам с полной зарядкой...
    private By seventhQuestion = By.id("accordion__heading-6");
    //Можно ли отменить заказ?
    private By seventhAnswer= By.id("accordion__panel-6");
    //Да, пока самокат не привезли...
    private By eighthQuestion = By.id("accordion__heading-7");
    //Я жизу за МКАДом, привезёте?
    private By eighthAnswer= By.id("accordion__panel-7");
    //Да, обязательно. Всем самокатов!...

    //методы для главной страницы
    public void clickCookieButton() {
      webDriver.findElement(cookieButton).click();
    }
    public void clickQuestion(String Question) {
        webDriver.findElement(By.id(Question)).click();
    }
    public void clickOrderButton1() {
        webDriver.findElement(orderButton1).click();
    }
    public void clickOrderButton2() {
        webDriver.findElement(orderButton2).click();
    }
//    //надо параметризовать, пока оставлю так
//    public void clickFirstQuestion() {
//        webDriver.findElement(firstQuestion).click();
//    }
////    public void isDisplayedFirstAnswer () {
////        webDriver.findElement(firstAnswer).isDisplayed(); }
//    public void clickSecondQuestion() {
//        webDriver.findElement(secondQuestion).click();
//    }
////    public void isDisplayedSecondAnswer () {
////        webDriver.findElement(secondAnswer).isDisplayed();
////    }
//    public void clickThirdQuestion() {
//        webDriver.findElement(thirdQuestion).click();
//    }
////    public void isDisplayedThirdAnswer () {
////        webDriver.findElement(thirdAnswer).isDisplayed();
////    }
//    public void clickFourthQuestion() {
//        webDriver.findElement(fourthQuestion).click();
//    }
////    public void isDisplayedFourthAnswer () {
////        webDriver.findElement(fourthAnswer).isDisplayed();
////    }
//    public void clickFifthQuestion() {
//        webDriver.findElement(fifthQuestion).click();
//    }
////    public void isDisplayedFifthAnswer () {
////        webDriver.findElement(fifthAnswer).isDisplayed();
////    }
//    public void clickSixthQuestion() {
//        webDriver.findElement(sixthQuestion).click();
//    }
////    public void isDisplayedSixthAnswer () {
////        webDriver.findElement(sixthAnswer).isDisplayed();
////    }
//    public void clickSeventhQuestion() {
//        webDriver.findElement(seventhQuestion).click();
//    }
////    public void isDisplayedSeventhAnswer () {
////        webDriver.findElement(secondAnswer).isDisplayed();
////    }
//    public void clickEighthQuestion() {
//        webDriver.findElement(eighthQuestion).click();
//    }
////    public void isDisplayedEighthAnswer () {
////        webDriver.findElement(eighthAnswer).isDisplayed();
////    }
//
//    public void checkingAnswers(){
//        //метод проверки отображения ответов после нажатия на вопрос на главной странице
//        clickCookieButton();
//        clickFirstQuestion();
//        clickSecondQuestion();
//        clickThirdQuestion();
//        clickFourthQuestion();
//        clickFifthQuestion();
//        clickSixthQuestion();
//        clickSeventhQuestion();
//        clickEighthQuestion();
}

