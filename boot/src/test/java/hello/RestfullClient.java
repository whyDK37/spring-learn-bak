package hello;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import web.pojo.Greeting;

/**
 * Created by whydk on 2016/7/19.
 */
public class RestfullClient {
    @Test
    public void test() {
        final String uri = "http://localhost:8080/greeting?id=12&content=我是内容";

        RestTemplate restTemplate = new RestTemplate();
//        Greeting result = restTemplate.getForObject(uri, Greeting.class);
        String result = restTemplate.getForObject(uri, String .class);

        System.out.println(result);
    }
}
