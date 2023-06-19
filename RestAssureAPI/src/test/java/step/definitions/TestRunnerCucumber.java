package step.definitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"step.definitions"},
        plugin = { "pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}

)

public class TestRunnerCucumber {
}
