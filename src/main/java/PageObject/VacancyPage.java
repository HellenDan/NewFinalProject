package PageObject;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class VacancyPage {

    public SelenideElement

    FillOutApplication = $(byText("შეავსე განაცხადი")),
    SelectDepartment =$(byText("აირჩიე მიმართულება")),
    ChooseDepartment=$(byText("IT ტექნოლოგიები")),
    FirstNameInput =$(byName("firstName")),
    LastNameInput =$(byName("lastName")),
    PhoneNumber =$(byName("phoneNumber")),
    UploudFile =$(byXpath("//*[@id=\"mount\"]/main/div[2]/div/form/div[5]/input")),
    CommentInput =$(byName("comment")),
    SentAplication =$(byText("გაგზავნა")),
    OkBtn=($(byClassName("w-32")));


}
