
package co.com.choucair.certification.retotecnico.tasks;

        import co.com.choucair.certification.retotecnico.userinterface.SearchCoursePage;
        import net.serenitybdd.screenplay.Actor;
        import net.serenitybdd.screenplay.Task;
        import net.serenitybdd.screenplay.task;
        import net.serenitybdd.screenplay.actions.Click;
        import net.serenitybdd.screenplay.actions.Enter;

public class Search implements  Task{
    private string course;


    public Search the(String course) {
        this.Course = course;
    }

    public  static Search the(String course){ return task.instrumented(Search.class.course);}

    @Override
    public <T extends Actor> void performAs(T actor ){
        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_UC),
                Enter.theValue(course).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),
                Clik.on(SearchCoursePage.SELECT_COURSE)
        );
    }
}
