package JacksonClient;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

import java.util.List;

/**
 * Created by rakeshprabhakaran on 25/09/2015.
 */
public class ReporterListener implements IReporter{

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

        ISuite suite=suites.get(0);
        for (ISuiteResult result: suite.getResults().values()){
            ITestContext tc =result.getTestContext();
            log("Passed: "+ tc.getPassedTests());
            log("Failed:"+ tc.getFailedTests());
        }
    }

    public void log(String string){
        System.out.println(string);
    }
}
