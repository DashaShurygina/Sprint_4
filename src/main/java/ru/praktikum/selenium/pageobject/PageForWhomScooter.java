package ru.praktikum.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//класс страницы Для кого самокат
public class PageForWhomScooter {
   WebDriver webDriver;

 public PageForWhomScooter(WebDriver webDriver) {
  this.webDriver = webDriver;
 }

    private By fieldName = By.className("Input_Responsible__1jDKN");
    //поле имя
    private By fieldSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    //поле фамилия
    private By fieldAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //поле адрес
    private By fieldMetroStation = By.xpath(".//input[@placeholder='* Станция метро']");
    //поле станция метро
    private By metroStation = By.xpath(".//li[@data-index='3']");
    //нужная станция метро
    private By fieldPhoneNumber = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //поле номера телефона
    private By nextButton = By.className("Button_Middle__1CSJM");
    //кнопка далее

    //методы для страницы Для кого самокат
    public void sendKeysFieldName(String name) {
        webDriver.findElement(fieldName).sendKeys(name);
    }
    public void sendKeysFieldSurname(String surname) {
        webDriver.findElement(fieldSurname).sendKeys(surname);
    }
    public void sendKeysFieldAddress(String address) {
        webDriver.findElement(fieldAddress).sendKeys(address);
    }
    public void clickFieldMetroStation() {
     webDriver.findElement(fieldMetroStation).click();
    }
    public void clickMetroStation() {
     webDriver.findElement(metroStation).click();
    }
    public void sendKeysFieldPhoneNumber(String number) {
     webDriver.findElement(fieldPhoneNumber).sendKeys(number);
    }
    public void clickNextButton() {
     webDriver.findElement(nextButton).click();
    }
    public void completeTheFirstPage(String name, String surname, String address, String number) {
     sendKeysFieldName(name);
     sendKeysFieldSurname(surname);
     sendKeysFieldAddress(address);
     clickFieldMetroStation();
     clickMetroStation();
     sendKeysFieldPhoneNumber(number);
     clickNextButton();
    }

}
