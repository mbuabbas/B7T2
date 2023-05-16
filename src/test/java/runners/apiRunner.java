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
        features = "src/test/resources/features/API",
        glue = "step_definitions/API",
        stepNotifications = true,
        dryRun = false
        ,tags = "@AD-27"
)
public class apiRunner {
}
