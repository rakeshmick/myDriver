package JacksonClient;

import org.springframework.web.client.RestTemplate;

/**
 * Created by rakeshprabhakaran on 20/09/2015.
 */
public class ClientSideConsumeDriverStatusToObject {

   /* @RequestMapping(value="/status",produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET)
    public String getStatusOfDriver(Model model)
    {
        model.addAttribute("status",get)
    }*/
   public static void main(String[] args)
   {
       final String uri = "http://localhost:4444/wd/hub/status";

       RestTemplate restTemplate = new RestTemplate();
       String result = restTemplate.getForObject(uri, String.class);

       DriverStatus driver=restTemplate.getForObject(uri,DriverStatus.class);

       System.out.println(result);
       System.out.println(driver.getState()+"  "+driver.getSessionId());
       System.out.println(driver);
   }

}
