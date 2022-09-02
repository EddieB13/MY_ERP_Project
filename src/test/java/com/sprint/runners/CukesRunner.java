package com.sprint.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                //"pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html", // we first right the location where we want to open, then open cucumber-report.html
                "rerun:target/rerun.txt",            // for failed tests we provide a new page in order those test to be retested
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/sprint/step_definitions",
        dryRun = false,                               // turns off running step_definitions, just check for missing snippet,  when true= ON, when false = OFF
        tags = "@smoke",
        publish = true                                // generate a link to access reports through an auto generated URL in console
)
public class CukesRunner {
}
