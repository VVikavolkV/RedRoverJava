package lesson11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            System.out.println(driver.getTitle());

            WebElement textBox = driver.findElement(By.id("my-text-id"));

            textBox.sendKeys("Hello Selenium");

            String value = textBox.getDomProperty("value");
            System.out.println(value);






//            List<WebElement> elements =
//                    driver.findElements(By.cssSelector(".form-control"));
//
//            System.out.println(elements.size());


            List<WebElement> labels =
                    driver.findElements(By.cssSelector("label"));

            System.out.println("Labels found: " + labels.size());


//            for (WebElement label : labels) {
//                System.out.println(label.getText());
//            }

            for (WebElement label : labels) {
                if (!label.getText().isEmpty()) {
                    System.out.println(label.getText());
                }
            }



            textBox.clear();

            WebElement submitButton = driver.findElement(
                    By.cssSelector("button[type='submit']")
            );

            submitButton.click();

            WebElement message = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("message"))
            );

            System.out.println(message.getText());

        } finally {
            driver.quit();
        }
    }
}









//get()          → открыть страницу
//findElement()  → найти элемент
//sendKeys()     → ввести текст
//clear()        → очистить
//click()        → нажать
//getText()      → прочитать текст
//quit()         → закрыть браузерную сессию




//Maven
//  ↓
//скачивает Selenium
//  ↓
//Java + Selenium
//  ↓
//WebDriver
//  ↓
//ChromeDriver
//  ↓
//Chrome
//  ↓
//Сайт