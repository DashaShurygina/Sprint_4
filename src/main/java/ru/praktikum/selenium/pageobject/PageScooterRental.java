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
    private By rentalPeriod = By.xpath("//div[contains(text(),'двое суток')]");
    // срок аренды двое суток
    private By checkboxColorScooter = By.className("Checkbox_Input__14A2w");
    //чекбокс цвета самоката
    private By fieldCommentForTheCourier = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //поле ввода комментария для курьера
    private By buttonOrderToContinue = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[contains(text(),'Заказать')]");
    //кнопка заказать для продолжения оформления

    //окно подтверждение заказа
    private By buttonYes = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[contains(text(), 'Да')]");
    //кнопка Да в окне подтверждения заказа
    //окно заказ оформлен
    private By textOrderCompleted = By.xpath("//div[@class='Order_ModalHeader__3FDaJ']");
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
    public void checkDisplayedTextOrderCompleted() {
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
    }
}
