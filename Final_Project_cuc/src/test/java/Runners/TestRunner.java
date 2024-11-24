
package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",    // Path to all feature files
        glue = "StepDefinitions",                     // Package containing step definition classes (ensure case matches)
        plugin = {"pretty", "html:target/TestReport.html"},  // Reporting options
        monochrome = true,                           // Better readability in the console
        dryRun = false,                              // Set to true to validate missing step definitions
        tags = "@Login or @LandingPage or @Wishlist" // Specify which scenarios to run
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // This class will use TestNG to run the Cucumber tests
}
//package Runners;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
//public class Testrunner {
//    @CucumberOptions(
//            features = "src/main/resources/Features",    // Path to all feature files
//            glue = "stepDefinitions",                   // Package containing step definition classes
//            plugin = {"pretty", "html:target/TestReport.html"}
////            monochrome = true,                          // Better readability in the console
////            dryRun = false,                             // Set to true to validate missing step defs
////            tags = "@Login or @LandingPage or @Wishlist" // Specify which scenarios to run
//    )
//    public class TestRunner extends AbstractTestNGCucumberTests {
//        // This class will use TestNG to run the Cucumber tests
//
//    }
//}


