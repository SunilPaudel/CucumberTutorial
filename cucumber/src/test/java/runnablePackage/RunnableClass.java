package runnablePackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featureFile",
                 glue = {"stepDefinitation"})

public class RunnableClass {

}
