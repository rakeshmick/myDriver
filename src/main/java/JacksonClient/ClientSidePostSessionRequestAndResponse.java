package JacksonClient;



import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.json.simple.JSONObject;
import java.util.LinkedHashMap;

/**
 * Created by rakeshprabhakaran on 20/09/2015.
 */
public class ClientSidePostSessionRequestAndResponse {
    //{"desiredCapabilities":{"browserName":"firefox"}}

    public  static void main(String[]args){

        final String uri = "http://127.0.0.1:4444/wd/hub/session";

        ClientSidePostSessionRequestAndResponse clientSidePostSessionRequestAndResponse = new ClientSidePostSessionRequestAndResponse();
        DriverStatus driverStatus= clientSidePostSessionRequestAndResponse.postRequestCreateDriverSession(uri);
        String sessionID= driverStatus.getSessionId();


        System.out.printf("session ID of this session is: "+ sessionID);

        clientSidePostSessionRequestAndResponse.deleteSession(sessionID,uri);


    }

    public void deleteSession(String sessionID, String url){
        RestTemplate restTemplate= new RestTemplate();
        restTemplate.delete(url+"/"+sessionID);
    }

    public DriverStatus postRequestCreateDriverSession(String uri){



        RestTemplate restTemplate = new RestTemplate();
        JSONObject request=new JSONObject();
        LinkedHashMap browserName= new LinkedHashMap();
        browserName.put("browserName","firefox");

        request.put("desiredCapabilities", browserName);


        //{"desiredCapabilities":{"browserName":"firefox"}}


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(request.toJSONString(), headers);
        DriverStatus driverStatus = restTemplate.postForObject(uri, entity, DriverStatus.class);
        return driverStatus;
    }

}
