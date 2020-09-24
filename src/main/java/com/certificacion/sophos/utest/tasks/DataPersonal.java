
package com.certificacion.sophos.utest.tasks;

import com.certificacion.sophos.utest.interfaces.HomePage;
import com.certificacion.sophos.utest.interfaces.PersonalData;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

public class DataPersonal implements Task {
    private List<Map<String , String>> data;

    public DataPersonal(List<Map<String, String>> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).get("name")).into(HomePage.NAME));
        actor.attemptsTo(Enter.theValue(data.get(0).get("lastame")).into(HomePage.LASTAME));
        actor.attemptsTo(Enter.theValue(data.get(0).get("email")).into(HomePage.EMAIL));
        actor.attemptsTo(Click.on((WebElementFacade) HomePage.MONTH.resolveFor(actor).selectByVisibleText(data.get(0).get("month"))));
        actor.attemptsTo(Click.on((WebElementFacade) HomePage.DAY.resolveFor(actor).selectByVisibleText(data.get(0).get("day"))));
        actor.attemptsTo(Click.on((WebElementFacade) HomePage.YEAR.resolveFor(actor).selectByVisibleText(data.get(0).get("1998"))));
        actor.attemptsTo(Click.on(HomePage.NEXTFORM1));


    }
    public static Performable data(List<Map<String , String>> data){
        return Tasks.instrumented(DataPersonal.class,data);
    }

    }

