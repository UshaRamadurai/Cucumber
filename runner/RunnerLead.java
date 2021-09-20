package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefinition.BaseClass;

@CucumberOptions(features="src/test/java/feature/MergeLead.feature", glue="stepDefinition", publish=true)
public class RunnerLead extends BaseClass{

}
