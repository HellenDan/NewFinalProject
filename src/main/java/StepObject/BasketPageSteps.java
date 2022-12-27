package StepObject;
import PageObject.BasketPage;
import PageObject.VacancyPage;
import PageObject.BalanceTopUpPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import javax.naming.Name;
import java.io.File;
import java.time.Duration;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class BasketPageSteps extends BasketPage {


    @Step("Search Click Step")
    public BasketPageSteps searchClick(){
        SearchInput.click();
        return this;
    }
    @Step("Search with Text Step ")
    public BasketPageSteps searchText(String text){
        SearchInput1.setValue(text).pressEnter();
        return this;
    }
    @Step("Choose Servise Step ")
    public BasketPageSteps chooseService(){
        ChooseTopUpBalance.click();
        return this;
    }
    @Step("Number Input Step ")
    public BasketPageSteps numberInput(String number){
        NumberInput.setValue(number);
        return this;
    }
    @Step("Submit Button Step ")
    public BasketPageSteps submitBtn(){
        SubmitBtn.click();
        return this;
    }
    @Step("Choose Service Step ")
    public BasketPageSteps chooseServices(){
        ChooseService.click();
        return this;
    }
    @Step("Choose Service Button Step ")

    public BasketPageSteps serviceBtn(){
        ServiceBtn.click();
        return this;
    }
    @Step("Add To Basket Step ")
    public BasketPageSteps addToBasket(){
        AddtoBasket.click();
        Assert.assertTrue($(byText("გთხოვთ, ჩაწეროთ თანხა 0.50-დან 1500.00 ლარამდე")).is(Condition.hidden));
        PayBtn.shouldBe(Condition.disabled);
        return this;
    }
    @Step("Delete Button Step")
    public BasketPageSteps deletBtn(){
        DeletXpath.click();
        Assert.assertFalse($(byText("კალათა ცარიელია")).is(Condition.appear));
        return this;
    }

    @Step("Choose Service Step ")
    public StepObject.BasketPageSteps searchClick2(){
          SearchInput.click();
          return this;
    }
    @Step("Choose Service Step ")
    public StepObject.BasketPageSteps searchText2(String text){
          SearchInput1.setValue(text).pressEnter();
          return this;
    }
    @Step("Choose Service Step 2 ")
    public StepObject.BasketPageSteps chooseService2(){
           ChooseTopUpBalance.click();
           return this;
    }
    @Step("Number Input Step 2  ")
    public StepObject.BasketPageSteps numberInput2(String number){
           NumberInput.setValue(number);
           return this;
    }
    @Step("Subbmit Button Step 2 ")
    public StepObject.BasketPageSteps submitBtn2(){
            SubmitBtn.click();
            return this;
    }
    @Step("Choose Service Step 3 ")
    public StepObject.BasketPageSteps chooseServices2(){
         ChooseService.click();
         return this;
    }
    @Step("Service Button Step 2 ")
    public StepObject.BasketPageSteps serviceBtn2(){
          ServiceBtn.click();
          return this;
    }
    @Step("Add Basket Step 2 ")
    public StepObject.BasketPageSteps addToBasket2(){
         AddtoBasket.click();
         return this;
    }

    @Step("Price Input Step ")
    public BasketPageSteps priceInput(){
         PriceInput.click();
         return this;
    }

    @Step("Price Click Step ")
    public BasketPageSteps priceClick(String Price){
          PriceInput.setValue(Price);
          //PayBtn.shouldBe(Condition.enabled);
          return this;
    }







}
