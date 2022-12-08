import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public String site = "https://qa-scooter.praktikum-services.ru/";

    public By scrollQuestions = By.id("accordion__heading-0");
    public void clickButton(By button){
        driver.findElement(button).click();
    }

    public By QuestionOne = By.xpath(".//div[@aria-controls='accordion__panel-0']");
    public By QuestionTwo = By.xpath(".//div[@aria-controls='accordion__panel-1']");
    public By QuestionThree = By.xpath(".//div[@aria-controls='accordion__panel-2']");
    public By QuestionFour = By.xpath(".//div[@aria-controls='accordion__panel-3']");
    public By QuestionFive = By.xpath(".//div[@aria-controls='accordion__panel-4']");
    public By QuestionSix = By.xpath(".//div[@aria-controls='accordion__panel-5']");
    public By QuestionSeven = By.xpath(".//div[@aria-controls='accordion__panel-6']");
    public By QuestionEight = By.xpath(".//div[@aria-controls='accordion__panel-7']");
    public void openSite() {
        driver.get(site);
    }
    public By QuestionOneText = By.id("accordion__panel-0");
    public By QuestionTwoText = By.id("accordion__panel-1");
    public By QuestionThreeText = By.id("accordion__panel-2");
    public By QuestionFourText = By.id("accordion__panel-3");
    public By QuestionFiveText = By.id("accordion__panel-4");
    public By QuestionSixText = By.id("accordion__panel-5");
    public By QuestionSevenText = By.id("accordion__panel-6");
    public By QuestionEightText = By.id("accordion__panel-7");



    public By getOfAccordionQuestion(int question){
        switch (question){
            case 0: return QuestionOne;
            case 1: return QuestionTwo;
            case 2: return QuestionThree;
            case 3: return QuestionFour;
            case 4: return QuestionFive;
            case 5: return QuestionSix;
            case 6: return QuestionSeven;
            case 7: return QuestionEight;
        }
        return null;
    }

    public By getOfAccordionAnswer(int answer){
        switch (answer){
            case 0: return QuestionOneText;
            case 1: return QuestionTwoText;
            case 2: return QuestionThreeText;
            case 3: return QuestionFourText;
            case 4: return QuestionFiveText;
            case 5: return QuestionSixText;
            case 6: return QuestionSevenText;
            case 7: return QuestionEightText;
        }
        return null;
    }

    public void scrollToImportantQuestions() {
        WebElement element = driver.findElement(scrollQuestions);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

}

