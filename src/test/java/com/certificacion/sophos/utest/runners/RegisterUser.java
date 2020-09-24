package com.certificacion.sophos.utest.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/regiserteruser.feature",
        glue = "com.certificacion.sophos.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RegisterUser {
}
