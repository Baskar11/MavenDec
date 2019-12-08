package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/feature/Login.feature", monochrome=true, glue="steps", dryRun=false, snippets=SnippetType.CAMELCASE)

public class Runner extends AbstractTestNGCucumberTests{

}
