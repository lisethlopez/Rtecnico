package co.com.choucair.certification.retotecnico.tasks;


        import net.serenitybdd.screenplay.Actor;
        import net.serenitybdd.screenplay.Task;
        import net.serenitybdd.screenplay.Tasks;



public class Login implements task {

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    private String strUser;
    private String strPassword;
    public static Login onThePage(String strUser, String strPassword){
        return task.instrumented(Login.class,srtuser,SrtPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(UtestLoginPage.LOGIN_BUTTON),
                Enter.theValue("srtUser").into(UtestLoginPage.USER),
                Enter.theValue(("srtPassword")).into(UtestLoginPage.PASSWORD),
                Click.on(UtestLoginPage.ENTER_BUTTON)
        );



    }
}
