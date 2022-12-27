package TbcPayTests;
import StepObject.BalanceTopUpSteps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.BalanceTopUpObject.IncorrectNumber;
import static DataObject.BalanceTopUpObject.PhoneNumber;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BalanceTopUpPageTest extends Utils.ChromeRunner {

    BalanceTopUpSteps step = new BalanceTopUpSteps();


    @Test
    @Description("Check Mobile Balance Top-up Without Registration/Authorization")
    @Severity(SeverityLevel.CRITICAL)

    public void topUpBalance() {
        step.clickTopUpPage()
                .numberInput(PhoneNumber)
                .checkNumber()
                .chooseService()
                .submitBtn()
                .chooseService()
                .cosmoBtn()
                .payBtn()
                .logInBtn()
                .closeBtn();
    }


    @Test
    @Description(" Mobile Balance Top-up with Incorrect Number ")
    @Severity(SeverityLevel.CRITICAL)

    public void topUpBalanceIncNumb () {
        step.clickTopUpPage_1()
                .numberInput_1(IncorrectNumber)
                .checkNumber_1();
        Assert.assertFalse($(byText("მონაცემი ვერ მოიძებნა. გთხოვთ გადაამოწმოთ")).is(Condition.empty));
    }
}
