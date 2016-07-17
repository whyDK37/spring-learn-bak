package boot.rest;

import boot.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 * Created by why on 2016/7/17.
 */
public class RestTemplateTest {
    ApplicationContext applicationContext;
    RestTemplate template;
    @Before
    public void before(){
        applicationContext = new ClassPathXmlApplicationContext("rest-resttemplate.xml");
        template = applicationContext.getBean("simpleRestTemplate",RestTemplate.class);
    }

    @Test
    public void test(){
        Map<String, String> vars = Collections.singletonMap("id", "42");
        template.execute("http://localhost:8080/user/{id}", HttpMethod.GET, new RequestCallback() {
            @Override
            public void doWithRequest(ClientHttpRequest request) throws IOException {
                System.out.println(request);
            }
        }, new ResponseExtractor<Object>() {
            @Override
            public Object extractData(ClientHttpResponse response) throws IOException {
                System.out.println(response);
                System.out.println(response.getStatusText());
                for (String key:response.getHeaders( ).keySet()) {
                    System.out.println(key+":"+response.getHeaders().get(key));
                }

                InputStream is = new BufferedInputStream(response.getBody());
                int readlength;
                while ((readlength=is.read()) > 0){

                }
                StringBuilder sb = new StringBuilder();


                return null;
            }
        }, vars);

        ResponseEntity<User> result = template.getForEntity("http://localhost:8080/user/{id}", User.class,vars);
        System.out.println(result.getBody().toString());
    }
}
