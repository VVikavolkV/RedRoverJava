package lesson11;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Подготовка");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Завершение");
    }

    @Test
    public void firstTest() {
        System.out.println("Первый тест");
    }

    @Test
    public void secondTest() {
        System.out.println("Второй тест");
    }
}