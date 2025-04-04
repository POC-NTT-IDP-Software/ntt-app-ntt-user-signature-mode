import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.app1.service.App1Service;

@RestController
public class App1Controller {

    @Autowired
    private App1Service app1Service;

    @GetMapping("/consume")
    public String consumeData() {
        return "App1 consumiendo: " + app1Service.getDataFromApp2();
    }
}