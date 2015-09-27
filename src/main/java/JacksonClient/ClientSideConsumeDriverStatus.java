package JacksonClient;

import org.springframework.web.client.RestTemplate;

/**
 * Created by rakeshprabhakaran on 20/09/2015.
 */
public class ClientSideConsumeDriverStatus {


   public static void main(String[] args)
   {
       final String uri = "http://localhost:4444/wd/hub/status";
        ClientSideConsumeDriverStatus clientSideConsumeDriverStatus= new ClientSideConsumeDriverStatus();

       String result = clientSideConsumeDriverStatus.getRequestStatusOfDriver(uri);

       System.out.println(result);
   }

    public String getRequestStatusOfDriver(String uri){

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

}
