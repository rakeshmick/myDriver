package JacksonClient;

/**
 * Created by rakeshprabhakaran on 20/09/2015.
 */
public class LetsDoWebAutomation {
    public static void main (String[] args){
        ClientSideConsumeDriverStatus consumeDriverStatus= new ClientSideConsumeDriverStatus();
        final String statusUri = "http://localhost:4444/wd/hub/status";
        String response =consumeDriverStatus.getRequestStatusOfDriver(statusUri);
        System.out.println(response);



    }
}
