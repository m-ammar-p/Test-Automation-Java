package step.def;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"step.def"},
        plugin = { "pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}

)
public class TestRunnerCucumber {
}
