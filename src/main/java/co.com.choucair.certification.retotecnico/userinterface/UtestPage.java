package co.com.choucair.certification.retotecnico.userinterface;


import co.com.choucair.retotecnico.userinterface.UtestPage;
        import javafx.concurrent.Task;
        import net.serenitybdd.screenplay.Actor;
        import net.serenitybdd.screenplay.perfomable;
        import net.serenitybdd.screenplay.task;
        import net.serenitybdd.core.pages.PageObject;
        import net.thucydides.core.annotations.DefaultUrl;


        @DefaultUrl("https://www.utest.com/welcome?from=signup.php")
        public class UtestPage extends PageObject{

        }



public class OpenUp implements task {
    private co.com.choucair.retotecnico.userinterface.UtestPage UtestPage ;
    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public  <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Open.browserOn(utestpage));
    }
}