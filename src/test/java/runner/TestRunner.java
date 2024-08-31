package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\Shubham Shrivastava\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\bookswagon_cucumber\\src\\test\\resources\\BooksWagon\\Search.feature",
glue = "steps")

public class TestRunner extends AbstractTestNGCucumberTests {

}
