package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/report.html",
                "json:target/cucumber-reports/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features/UI",
        glue = "step_definitions/UI",
        stepNotifications = true,
        dryRun = false
        ,tags = "@AD-7"
)
public class CukesRunner {

}
