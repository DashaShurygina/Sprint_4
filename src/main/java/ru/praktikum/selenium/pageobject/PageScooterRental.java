package ru.praktikum.selenium.pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

//класс страницы Про аренду
public class PageScooterRental {
    WebDriver webDriver;

    public PageScooterRental(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    private By fieldDateInput = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //поле ввода даты начала аренды
    private By fieldRentalPeriod = By.className("Dropdown-placeholder");
    //поле срока аренды
    private By rentalPeriod = By.xpath(".//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]");
    // срок аренды двое суток
    private By checkboxColorScooter = By.className("Checkbox_Input__14A2w");
    //чекбокс цвета самоката
    private By fieldCommentForTheCourier = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //поле ввода комментария для курьера
    private By buttonOrderToContinue = By.xpath(".//html/body/div/div/div[2]/div[3]/button[2]");
    //кнопка заказать для продолжения оформления

    //окно подтверждение заказа
    private By buttonYes = By.xpath(".//html/body/div/div/div[2]/div[5]/div[2]/button[2]");
    //кнопка Да в окне подтверждения заказа
    //окно заказ оформлен
    private By textOrderCompleted = By.xpath(".//html/body/div/div/div[2]/div[5]/div[1]");
    //текст об оформлении заказа

    //методы для страницы Про аренду

    public void sendKeysFieldDateInput(String date) {
        webDriver.findElement(fieldDateInput).sendKeys(date);
    }
    public void enterFieldDateInput() {
        webDriver.findElement(fieldDateInput).sendKeys(Keys.ENTER);
    }
    public void clickFieldRentalPeriod() {
        webDriver.findElement(fieldRentalPeriod).click();
    }
    public void clickRentalPeriod() {
        webDriver.findElement(rentalPeriod).click();
    }
    public void clickCheckboxColorScooter() {
        webDriver.findElement(checkboxColorScooter).click();
    }
    public void sendKeysFieldCommentForTheCourier(String comment) {
        webDriver.findElement(fieldCommentForTheCourier).sendKeys(comment);
    }
    public void clickButtonOrderToContinue() {
        webDriver.findElement(buttonOrderToContinue).click();
    }
    public void clickButtonYes() {
        webDriver.findElement(buttonOrderToContinue).click();
    }
    public void isDisplayedTextOrderCompleted() {
        webDriver.findElement(textOrderCompleted).isDisplayed();
    }

    public void completeTheSecondPage(String date,String comment) {
        sendKeysFieldDateInput(date);
        enterFieldDateInput();
        clickFieldRentalPeriod();
        clickRentalPeriod();
        clickCheckboxColorScooter();
        sendKeysFieldCommentForTheCourier(comment);
        clickButtonOrderToContinue();
        clickButtonYes();
        isDisplayedTextOrderCompleted();
    }
}
