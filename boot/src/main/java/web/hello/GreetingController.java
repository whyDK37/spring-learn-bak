package web.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.pojo.Greeting;

/**
 * curl -X POST http://localhost:8080/greeting
 */
@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public Greeting index(Greeting greeting) {
        return greeting;
    }

}