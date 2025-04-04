import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class App1Service {

    @Value("${app2.url}")
    private String app2Url;

    private final RestTemplate restTemplate = new RestTemplate();

    public String getDataFromApp2() {
        return restTemplate.getForObject(app2Url + "/data", String.class);
    }
}