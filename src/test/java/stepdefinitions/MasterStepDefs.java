package stepdefinitions;

import cucumber.api.Scenario;
import framework.DriverFactory;
import framework.SeleniumTestParameters;
import org.apache.log4j.Logger;
import utility.TestBase;

import java.util.Properties;

public abstract class MasterStepDefs extends TestBase {

	 Logger log = Logger.getLogger(DriverFactory.class);

	protected static Scenario currentScenario;
	protected static SeleniumTestParameters currentTestParameters;
	protected static Properties properties;


	protected void pauseScript(int howLongToPause) {
		// convert to seconds
		howLongToPause = howLongToPause * 1000;

		try {
			Thread.sleep(howLongToPause);
		} catch (final InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}