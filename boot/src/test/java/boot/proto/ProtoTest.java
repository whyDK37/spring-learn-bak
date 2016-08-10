package boot.proto;

import org.junit.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * Created by whydk on 2016/8/2.
 */
public class ProtoTest {
    private String baseUri = "http://localhost:8080/w";

    @Test
    public void testRead() {

        HttpHeaders headers = new HttpHeaders();
        RequestEntity<UserProtos.User> requestEntity =
                new RequestEntity<UserProtos.User>(headers, HttpMethod.POST, URI.create(baseUri + "/proto/read"));

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserProtos.User> responseEntity =
                restTemplate.exchange(requestEntity, UserProtos.User.class);

        System.out.println(responseEntity.getBody());
    }

    @Test
    public void testWrite() {
        UserProtos.User user = UserProtos.User.newBuilder().setId(1).setName("zhangsan").build();
        HttpHeaders headers = new HttpHeaders();
        RequestEntity<UserProtos.User> requestEntity =
                new RequestEntity<UserProtos.User>(user, headers, HttpMethod.POST, URI.create(baseUri + "/proto/write"));

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserProtos.User> responseEntity =
                restTemplate.exchange(requestEntity, UserProtos.User.class);
        System.out.println(responseEntity.getBody());
    }
}
