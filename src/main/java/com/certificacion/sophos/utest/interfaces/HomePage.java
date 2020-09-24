package com.certificacion.sophos.utest.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public final static Target REGISTER = Target.the("REGISTER").locatedBy("//*[@class='unauthenticated-nav-bar__sign-up']");
    public final static Target NAME = Target.the("NAME").locatedBy("//*[@id='firstName']");
    public final static Target LASTAME = Target.the("LASTAME").locatedBy("//*[@id='lastName']");
    public final static Target EMAIL = Target.the("EMAIL").locatedBy("//*[@id='email']");
    public final static Target MONTH = Target.the("MONTH").locatedBy("//*[@id='birthMonth']");
    public final static Target DAY = Target.the("DAY").locatedBy("//*[@id='birthDay']");
    public final static Target YEAR = Target.the("YEAR").locatedBy("//*[@id='birthYear']");
    public final static Target NEXTFORM1 = Target.the("NEXTFORM1").locatedBy("*//span[contains(text(),'Next: Location')]");


}
