package demotest.cukes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "test/resources/Feature/IRIS.feature",
        glue = {"demotest.stepdefinition", "demotest.util"},
        format = {"json:cucumber-html-reports/cucumber.json",
                "html:cucumber-html-reports/MySample"},tags = {"@MT-123456"},monochrome = true
)

public class SmokeModuleCukesTest {

}
