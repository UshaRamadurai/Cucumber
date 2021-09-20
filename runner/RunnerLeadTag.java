package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefinition.BaseClass;

@CucumberOptions(features="src/test/java/feature", glue="stepDefinition", publish=true, 
				 monochrome = true, tags="@regression or @smoke" )
public class RunnerLeadTag extends BaseClass{

}
