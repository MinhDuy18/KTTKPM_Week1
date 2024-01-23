package vn.edu.iuh.fit.apigetway.service;


import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class APIGetAwayService {
    private final String urlApiUser = "http://localhost:8081/users";
    private final String urlApiProduct = "http://localhost:8080/products";

    RestTemplate restTemplate = new RestTemplate();
    public List<Map<String, Object>> getAllUser(){
        String url = urlApiUser;
        ResponseEntity<List<Map<String, Object>>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Map<String,Object>>>() {}
        );
        return responseEntity.getBody();
    }

    public List<Map<String, Object>> getAllProduct(){
        String url = urlApiProduct;
        ResponseEntity<List<Map<String, Object>>> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Map<String,Object>>>() {}
        );
        return responseEntity.getBody();
    }
}
