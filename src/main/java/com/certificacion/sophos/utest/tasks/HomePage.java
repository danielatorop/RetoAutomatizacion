package com.certificacion.sophos.utest.tasks;
import com.certificacion.sophos.utest.utils.Option;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class HomePage implements Task {
    Option option;

    public HomePage(Option option) {
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(option.URL()));
        actor.attemptsTo(Click.on(com.certificacion.sophos.utest.interfaces.HomePage.REGISTER));

    }
    public static Performable to(Option option){
        return Tasks.instrumented(HomePage.class, option);
    }
}
