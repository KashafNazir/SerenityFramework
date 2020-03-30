package stkstarter;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.After;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;

//SerenityRunner instruments the step libraries and ensures that the test results will be recorded and
// reported on by the Serenity reporters.
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = {"@TC003"},
        plugin = {"pretty"},
        features = "src/test/resources/features.search"


        //Prints the Gherkin source with additional colors and stack traces for errors.
        //This will generate a HTML report at the location mentioned in the for-matter itself.
)

public class StkTestSuite {

}


