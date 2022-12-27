package StepObject;
import PageObject.BalanceTopUpPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import java.time.Duration;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class BalanceTopUpSteps extends BalanceTopUpPage {

    @Step("Click Top up Balance Service ")
    public BalanceTopUpSteps clickTopUpPage() {
        MobilePoPUp.click();
        MobilePoPUp.shouldBe(Condition.enabled); Duration.ofMillis(2000);
        return this;
    }
    @Step("Number Input Step ")
    public BalanceTopUpSteps numberInput(String number ){
        PhoneNumberInput.setValue(number);
        PhoneNumberInput.shouldNot(Condition.empty); Duration.ofMillis(2000);
        return this;
    }
    @Step("Check Number Step ")
    public BalanceTopUpSteps checkNumber(){
        CheckBtn.click();
        CheckBtn.shouldBe(Condition.enabled); Duration.ofMillis(2000);
        return this;
    }
    @Step("Choose Service Step ")
    public BalanceTopUpSteps chooseService(){
        ChooseService.click();
        ChooseService.shouldBe(Condition.enabled); Duration.ofMillis(2000);
        return this;
    }
    @Step("Packet Submit Button ")
    public BalanceTopUpSteps submitBtn(){
        TitlePacket.click();
        TitlePacket.shouldBe(Condition.enabled); Duration.ofMillis(2000);
        return this;
    }
    @Step("Balance Top Up Step ")
    public BalanceTopUpSteps cosmoBtn(){
        CosmoTitleName.click();
        return this;
    }

    @Step("Pay Button Step ")
    public BalanceTopUpSteps payBtn(){
        PayBtn.pressEnter();
        return this;
    }

    @Step("Log In Button Step ")
    public BalanceTopUpSteps logInBtn(){
        LogInBtn.click();
        Assert.assertTrue(MobileNumber.is(Condition.not(Condition.empty)));
        return this;
    }

    @Step("Close Button Step ")
    public BalanceTopUpSteps closeBtn(){
        CloseBtn.click();
        return this;
    }



    @Step("Click Top Up Page Step ")
    public BalanceTopUpSteps clickTopUpPage_1() {
        MobilePoPUp.click();
        MobilePoPUp.shouldBe(Condition.enabled); Duration.ofMillis(2000);
        return this;
    }

    @Step("Number Input Step ")
    public BalanceTopUpSteps numberInput_1(String number ){
        PhoneNumberInput.setValue(number);
        PhoneNumberInput.shouldNot(Condition.empty); Duration.ofMillis(2000);
        return this;

    }

    @Step("Check Number Step ")
    public BalanceTopUpSteps checkNumber_1(){
        CheckBtn.click();
        Assert.assertFalse($(byText("მონაცემი ვერ მოიძებნა. გთხოვთ გადაამოწმოთ")).is(Condition.empty));
        return this;
    }

}
