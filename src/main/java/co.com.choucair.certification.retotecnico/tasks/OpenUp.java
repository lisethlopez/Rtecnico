package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.Utestpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.perfomable;
import net.serenitybdd.screenplay.task;



public class OpenUp implements task {
    private co.com.choucair.retotecnico.userinterface.Utestpage Utestpage ;

    public OpenUp(co.com.choucair.retotecnico.userinterface.Utestpage utestpage) {
        Utestpage = utestpage;
    }

    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public  <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Open.browserOn(Utestpage));

    }
}