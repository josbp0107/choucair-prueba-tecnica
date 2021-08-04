package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Select Cursos y Certificados")
            .located(By.xpath("//div[@id='certificaciones']/a"));
    public static final Target INPUT_COURSE = Target.the("Search the course")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Click on button Go")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Metodologia Bancolombia")
            .located(By.xpath("//section/div/div/div/h4/a"));
    public static final Target NAME_COURSE = Target.the("Extract the course name")
            .located(By.className("coursename"));
}
