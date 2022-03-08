package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",
				"html:target/cucumber-reports",
				"json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/junit.xml",
				"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
		},
		features = "classpath:features", 
		glue = {"steps" },
		tags = { "@CadastroFicha, @CadastroSimulacao" },
		snippets = CucumberOptions.SnippetType.UNDERSCORE,
		strict = true,
		dryRun = false,
		monochrome = true 
		)
public class TestRunner {

}
