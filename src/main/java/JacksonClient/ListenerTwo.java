package JacksonClient;

import org.testng.ISuite;
import org.testng.ISuiteListener;

/**
 * Created by rakeshprabhakaran on 26/09/2015.
 */
public class ListenerTwo implements ISuiteListener{


    @Override
    public void onStart(ISuite suite) {
        System.out.println("\n Reached on Start");
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("\n Reached on Stop");
    }
}
