package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/features/Transaction.feature"},glue = {"StepDefinations", "AppHooks"},
		/**plugin = {"pretty",
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}**/
				tags= "@Sanitydateallfilter"
)

public class MyTestRunner {

}  