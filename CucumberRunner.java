package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/Login.feature", glue="stepDefinition", publish=true)
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
