package PageObject;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BasketPage {

    public SelenideElement

    SearchInput = $(byText("ძიება")),
    SearchInput1 = $(byXpath("/html/body/div[8]/div/div/div/form/input")),

    SearchClick1 =$(byText("ძიება")),
    ChooseTopUpBalance =$(byText("მობილური ბალანსის შევსება")),
    NumberInput =$(byName("1213-abonentCode")),

    SubmitBtn =$(byId("service_input_submit_button")),

    ChooseService=$(byText("აირჩიეთ სერვისი")),
    ServiceBtn=$(byText("ბალანსის შევსება")),

    AddtoBasket =$(byText("კალათაში დამატება")),

    PayBtn=$(byXpath("//*[@id=\"mount\"]/header/div[1]/div/div/div/div[2]/div[3]/button[2]")),

    DeletXpath = $(By.xpath("//*[@id=\"mount\"]/header/div[1]/div/div/div/div[2]/div[1]/div/div[1]/button/img")),

    PriceInput =$(byClassName("h-10"));






}
