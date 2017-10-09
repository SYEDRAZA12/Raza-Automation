package reporting;

import com.aventstack.extentreports.ExtentReports;
import org.testng.ITestContext;

public class ExtentManager {
    private static ExtentReports extent;
    private static ITestContext context;

    public synchronized static ExtentReports getInstance (){

        return extent;
    }
}
