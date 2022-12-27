package Utils;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner1{
    @BeforeTest
    public static void setUp (){
        open("https://tbcpay.ge/career/vacancies");
    }
}
