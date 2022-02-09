package inmetrics.automacao.framework.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",
				"html:target/cucumber-report/report.html",
				"json:target/cucumber-report/report.json",
				"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
				}, 
		features = "classpath:features", 
		glue = {"inmetrics.automacao.steps" }, 
		tags = { "" }, 
		snippets = SnippetType.UNDERSCORE,
		strict = true, 
		dryRun = false,
		monochrome = true 
		)
public class TestRunner {  

}
