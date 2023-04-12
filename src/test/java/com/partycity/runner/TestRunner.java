package com.partycity.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(
        features = "src/test/resources/feature",
        glue ="com.partycity.stepDefinition",
        tags = "",dryRun = true,
        		monochrome = true
        	)

public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}