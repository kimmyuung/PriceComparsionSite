package com.example.pricecomparisonsite.ApiTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


public class CurStateStationAPISerivce {

    private final RestTemplate restTemplate;

    public CurStateStationAPISerivce(@Autowired RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Test
    public void getRequest() {
        // 요청을 보낼 URL
        String apiUrl = "https://data.ex.co.kr/openapi/business/curStateStation";

        // HTTP 헤더 설정
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // 요청 데이터 생성
        MultiValueMap<String, String> requestData = new LinkedMultiValueMap<>();
        requestData.add("key", "5000703152");

        requestData.add("type", "json");


        // HTTP GET 요청 보내기
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(apiUrl, requestData, String.class);

        // 응답 값
        String responseBody = responseEntity.getBody();
        System.out.println("GET Response: " + responseBody);
    }
}
