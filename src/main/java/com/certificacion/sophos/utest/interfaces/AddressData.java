package com.certificacion.sophos.utest.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AddressData {
    public final static Target CITY  = Target.the("NEXTFORM1").locatedBy("//*[@id='city']");
    public final static Target CODEPOSTAL  = Target.the("NEXTFORM1").locatedBy("//*[@id='zip']");

}
