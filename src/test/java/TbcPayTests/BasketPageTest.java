package TbcPayTests;
import StepObject.BasketPageSteps;
import StepObject.VacancyPageSteps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.BasketPageObject.*;
import static DataObject.VacancyPageObject.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BasketPageTest extends Utils.ChromeRunner {

    BasketPageSteps steps = new BasketPageSteps();

    @Test
    @Description("Check Basket Page With Negative Case ")
    @Severity(SeverityLevel.CRITICAL)

    public void basketPage() {
        steps.searchClick()
                .searchText(SearchText)
                .chooseService()
                .numberInput(Number1)
                .submitBtn()
                .chooseServices()
                .serviceBtn()
                .addToBasket()
                .deletBtn();
        Assert.assertFalse($(byText("კალათა ცარიელია")).is(Condition.appear));

    }


    @Test
    @Description("Check Basket Page With Positive Case ")
    @Severity(SeverityLevel.CRITICAL)

    public void basketPageCheck(){
        steps.searchClick2()
                .searchText2(SearchText)
                .chooseService2()
                .numberInput2(Number1)
                .submitBtn2()
                .chooseServices2()
                .serviceBtn2()
                .addToBasket2();

    }

}

