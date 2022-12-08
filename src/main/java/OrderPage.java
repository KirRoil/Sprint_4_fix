import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private final WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public String siteOrder = "https://qa-scooter.praktikum-services.ru/order";

    public By orderButton = By.xpath(".//button[(@class = 'Button_Button__ra12g' and (text()='Заказать'))]");
    public By downOrderButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");
    public By nameOrder = By.xpath(".//input[@placeholder='* Имя']");
    public By surnameOrder = By.xpath(".//input[@placeholder='* Фамилия']");
    public By addressOrder = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    public By stationOrder = By.xpath(".//input[@placeholder='* Станция метро']");
    public By telephoneOrder = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    public By nextOrderButton = By.xpath(".//button[@class ='Button_Button__ra12g Button_Middle__1CSJM']");
    public By whenOrder = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    public By dateOrder = By.xpath(".//div[contains(@class, 'react-datepicker__day') and (@tabindex='0')]");
    public By dateNextMonthOrder = By.xpath(".//button[@aria-label ='Next Month']");
    public By periodOrder = By.className("Dropdown-placeholder");
    public By periodOrderDay = By.xpath(".//div[@class='Dropdown-option'][1]");
    public By periodOrderFourDay = By.xpath(".//div[@class='Dropdown-option'][4]");
    public By colorScooterBlack = By.xpath("//*[@id='black']");
    public By colorScooterGrey = By.xpath("//*[@id='grey']");
    public By commentOrder = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    public By yesButton = By.xpath(".//button[(@class = 'Button_Button__ra12g Button_Middle__1CSJM' and (text()='Да'))]");
    public By finishModalWindow = By.xpath(".//div[@class = 'Order_ModalHeader__3FDaJ']");

    public void clickOrderButton() { // Нажатие на кнопку Заказать в верхнем углу
        driver.findElement(orderButton).click();
    }

    public void clickDownOrderButton() {    // Нажатие на кнопку Заказать внизу
        driver.findElement(downOrderButton).click();
    }

    public void setNameOrder(String name) { // Метод для заполнения имени
        driver.findElement(nameOrder).sendKeys(name);
    }

    public void setSurnameOrder(String surname) {// Метод для заполнения фамилии
        driver.findElement(surnameOrder).sendKeys(surname);
    }

    public void setAddressOrder(String address) {   // Метод для заполнения адреса
        driver.findElement(addressOrder).sendKeys(address);
    }

    public void setStationOrder(By station) {   // Метод для заполнения станции
        driver.findElement(stationOrder).click();
        driver.findElement(station).click();
    }

    public void setTelephoneOrder(String telephone) { // Метод для заполнения телефона
        driver.findElement(telephoneOrder).sendKeys(telephone);
    }

    public void personalData(String username, String surname, String address, String number) {
        setNameOrder(username);
        setSurnameOrder(surname);
        setAddressOrder(address);
        setTelephoneOrder(number);
    }

    public void clickNextOrderButton() {    // Метод для нажатия на кнопку Далее
        driver.findElement(nextOrderButton).click();
    }

    public void setNextMonthDateButton() {
        driver.findElement(whenOrder).click();
        driver.findElement(dateNextMonthOrder).click();
        driver.findElement(dateOrder).click();
    }


    public void setDate() {
        driver.findElement(whenOrder).click();
        driver.findElement(dateOrder).click();
    }

    public void setPeriod(By element) {
        driver.findElement(periodOrder).click();
        driver.findElement(element).click();
    }

    public void setScooter(By element) { // Метод для выбора цвета самоката
        driver.findElement(element).click();
    }

    public void setComment(String element) { // Метод для записи комментария
        driver.findElement(commentOrder).sendKeys(element);
    }

    public void yesButtonClick() {  // Метод для клика по кнопке Да в заказе
        driver.findElement(yesButton).click();
    }

    public String getTextOfWindowOfSuccessfulOrder() { // Метод для возврата текста окна завершения заказа
        return driver.findElement(finishModalWindow).getText();
    }

    public String currentUrl() {    // Получение URL текущей страницы
        return driver.getCurrentUrl();
    }
}

