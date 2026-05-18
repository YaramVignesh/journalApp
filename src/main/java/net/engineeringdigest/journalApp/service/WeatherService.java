package net.engineeringdigest.journalApp.service;


import net.engineeringdigest.journalApp.api.response.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {

    private static final String apiKey = "529edb474e1eb1af9821bb895e590b64";

    private static final String API_URL =
            "http://api.weatherstack.com/current?access_key=API_KEY&query=CITY";

    @Autowired
    private RestTemplate restTemplate;

    public WeatherResponse getWeather(String city) {
        String finalAPI  = API_URL.replace("API_KEY", apiKey).replace("CITY", city);
        ResponseEntity<WeatherResponse> response =  restTemplate.exchange(finalAPI, HttpMethod.GET,null, WeatherResponse.class);
        response.getStatusCode();
        WeatherResponse body = response.getBody();
        return body;
        
    }

}
