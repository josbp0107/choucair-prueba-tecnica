package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private ChoucairAcademyPage choucairAcademyPage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    // Aqui ejecutaremos todas las acciones de nuestra prueba, los clic's, los ingresos, las selecciones etc
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}
