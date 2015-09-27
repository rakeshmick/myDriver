package JacksonClient;

import org.json.simple.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;

import org.testng.annotations.Test;


/**
 * Created by rakeshprabhakaran on 25/09/2015.
 */
public class ClientSessionCreateAndDeleteTestNgTest {
    //{"desiredCapabilities":{"browserName":"firefox"}}
    @Test
    public void testCreationAndDelete(){

        final String uri = "http://127.0.0.1:4444/wd/hub/session";

        ClientSessionCreateAndDeleteTestNgTest clientSessionCreateAndDeleteTestNgTest = new ClientSessionCreateAndDeleteTestNgTest();
        DriverStatus driverStatus= clientSessionCreateAndDeleteTestNgTest.postRequestCreateDriverSession(uri);
        String sessionID= driverStatus.getSessionId();
        System.out.printf("session ID of this session is: "+ sessionID);
        clientSessionCreateAndDeleteTestNgTest.deleteSession(sessionID,uri);
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
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(request.toJSONString(), headers);
        DriverStatus driverStatus = restTemplate.postForObject(uri, entity, DriverStatus.class);
        return driverStatus;
    }

}
