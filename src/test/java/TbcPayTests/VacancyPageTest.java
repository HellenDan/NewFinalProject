package TbcPayTests;
import StepObject.VacancyPageSteps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.VacancyPageObject.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class VacancyPageTest extends Utils.ChromeRunner1 {

    VacancyPageSteps steps = new VacancyPageSteps();

    @Test
    @Description("Check Business Page Form With Postivie Case ")
    @Severity(SeverityLevel.CRITICAL)

    public void businessPageCheck() {
        steps.fillOutApplication()
                .selectDepartment()
                .chooseDepartment()
                .nameInput(Email)
                .lastNameInput(LastName)
                .numberInput(NumberPhone)
                .uploudFile()
                .commentInput(Comment)
                .sentAplication()
                .okBtn();

    }

    @Test
    @Description("Check Business Page Form With Negative Case ")
    @Severity(SeverityLevel.CRITICAL)
    public void businessPageCheck_1() {
        steps.fillOutApplication_1()
                .selectDepartment_1()
                .chooseDepartment_1()
                .sentAplication();
        Assert.assertTrue($(byText("მიუთითე სახელი")).is(Condition.not(Condition.empty)));

    }
}
