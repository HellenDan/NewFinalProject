package StepObject;
import PageObject.VacancyPage;
import PageObject.BalanceTopUpPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import java.io.File;
import java.time.Duration;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
public class VacancyPageSteps extends VacancyPage {


    @Step(" Fill Out Aplication Step ")
    public VacancyPageSteps fillOutApplication(){
        FillOutApplication.click();
        return this;
    }

    @Step(" Select Department Step ")
    public VacancyPageSteps selectDepartment(){
        SelectDepartment.click();
        return this;
    }

    @Step(" Choose Department Step ")
    public VacancyPageSteps chooseDepartment(){
        ChooseDepartment.click();
        return this;
    }
    @Step(" Name Input Step ")
    public VacancyPageSteps nameInput(String name){
        FirstNameInput.setValue(name);
        return this;
    }
    @Step(" Last Name Input Step ")
    public VacancyPageSteps lastNameInput(String lastName){
        LastNameInput.setValue(lastName);
        return this;
    }
    @Step("Number Input Step ")
    public VacancyPageSteps numberInput(String number){
        PhoneNumber.setValue(number);
        return this;
    }
    @Step("Uploud File Step ")
    public VacancyPageSteps uploudFile(){
        UploudFile.uploadFile(new File("File/test.png"));
        return this;
    }
    @Step("Comment Input Step ")
    public VacancyPageSteps commentInput(String comment){
        CommentInput.setValue(comment);
        CommentInput.shouldNot(Condition.empty);
        return this;
    }

    @Step("Sent Applicatopn Step")
    public VacancyPageSteps sentAplication(){
        SentAplication.click();
        SentAplication.shouldBe(Condition.enabled);
        return this;
    }

    @Step("Ok  Button Step ")
    public VacancyPageSteps okBtn(){
        OkBtn.click();
        return this;
    }



    @Step("Fill Out Application Step 2 ")
    public VacancyPageSteps fillOutApplication_1(){
    FillOutApplication.click();
    return this;
}

    @Step("Sent Application Step 2 ")
    public VacancyPageSteps sentAplication_1(){
        SentAplication.click();
        SentAplication.shouldBe(Condition.enabled); sleep(2000);
        return this;
    }

    @Step("Select Department Step 2 ")
    public VacancyPageSteps selectDepartment_1(){
        SelectDepartment.click();
        return this;
    }

    @Step("Choose Department Step 2 ")
    public VacancyPageSteps chooseDepartment_1(){
        ChooseDepartment.click();
        Assert.assertTrue($(byText("მიუთითე სახელი")).is(Condition.not(Condition.empty)));
        Assert.assertFalse($(byText("მიუთითე გვარი")).is(Condition.empty));
        Assert.assertFalse($(byText("გთხოვთ, მიუთითოთ 9 ციფრიანი მობილურის ნომერი")).is(Condition.empty));
        return this;
    }



}

