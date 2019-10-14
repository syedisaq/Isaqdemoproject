package runners;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import framework.Settings;
import framework.TimeStamp;
import org.testng.annotations.*;
import utility.TestBase;

import java.io.File;
import java.util.Properties;


@ExtendedCucumberOptions(jsonReport = "./target/cucumber-report/cucumber.json", jsonUsageReport = "./target/cucumber-report/cucumber-usage.json", outputFolder = "./target/cucumber-report", detailedReport = true, detailedAggregatedReport = true, overviewReport = true, usageReport = true)

@CucumberOptions(features = "./src/test/resources/features", glue = { "/Users/deekondanarender/Desktop/Qualitest/src/test/java/stepdefinitions" }, monochrome = true, plugin = { "pretty", "pretty:./target/cucumber-report/pretty.txt",
        "html:./target/cucumber-report", "json:./target/cucumber-report/cucumber.json",
        "junit:./target/cucumber-report/cucumber-junitreport.xml",
        "com.cucumber.listener.ExtentCucumberFormatter:" })

public class Runner extends TestBase {

    static String resultFolder;
    Properties properties = Settings.getInstance();

    @BeforeSuite
    private void beforeSuite() {
        initiateLogs();
        if ((Boolean.parseBoolean(properties.getProperty("SaveReports")))) {
            resultFolder = TimeStamp.getInstance();
        }
    }

    @BeforeClass
    private void beforeClass() {

        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath("./target/ExtentReport/InmarsatTestExecutionReport.html");
        new File("./target/ExtentReport/screenshots").mkdir();
    }

    @AfterClass
    private void afterClass() {
        Properties prop = Settings.getInstance();
        Reporter.loadXMLConfig(new File("./src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("Project Name", prop.getProperty("ProjectName"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", System.getProperty("os.name"));
    }

    @AfterTest
    private void afterTest() {
        generateCustomReports();
    }

    private void generateCustomReports() {
    }

    @AfterSuite()
    private void afterSuite() {
        if ((Boolean.parseBoolean(properties.getProperty("SaveReports")))) {
            //copyReportsFolder();
        }
    }
}
