package Prueba_Testing1Runer;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/Feactures/google.feature",
		glue = {"Definition_Test"},
	    format = {"pretty", "html:test_output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true,
		strict = true,
		dryRun = false
		)

public class TestingRunner_Google {

}
