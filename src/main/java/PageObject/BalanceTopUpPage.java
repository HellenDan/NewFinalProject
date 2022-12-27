package PageObject;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BalanceTopUpPage {

    public SelenideElement

            MobilePoPUp = $(byText("მობილური ბალანსის შევსება")),
            PhoneNumberInput = $(byName("1213-abonentCode")),
            CheckBtn = $(byId("service_input_submit_button")),
            TitlePacket = $(byText("კოსმო")),
            ChooseService= $(byText("აირჩიეთ სერვისი")),
            CosmoTitleName =$(byText("კოსმო (28 დღე)")),
            PayBtn =$(byText("გადახდა")),
            LogInBtn=$(byText("შესვლა/რეგისტრაცია")),

            ErrorText=$(byText("გთხოვთ, შეიყვანოთ მობილურის ნომ")),
            CloseBtn =$(byClassName("text-4xl")),

            Error =$(byXpath("//*[@id=\"mount\"]/main/main/div[1]/div[1]/div[3]/p")),
             MobileNumber=$(byText("გთხოვთ, შეიყვანოთ მობილურის ნომერი")),

            ErrorTexts = $(byText("მონაცემი ვერ მოიძებნა. გთხოვთ გადაამოწმოთ"));


}
