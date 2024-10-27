package com.example.pricecomparisonsite.api.controller;

import com.example.pricecomparisonsite.model.APIRequestDto.APIRequestDto;
import com.example.pricecomparisonsite.model.APIResponseDto.ResponseDto;
import org.apache.catalina.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

public class APIController {

    @GetMapping("/api/{id}")
    public ResponseEntity<String> curStateStationAPI(User user) {
       // String email = user.getUsername();

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("key","5000703152");
  //      headers.add("email",email);


        String apiUrl = "https://data.ex.co.kr/openapi/business/curStateStation";

        HttpEntity request = new HttpEntity(headers);
        ResponseEntity<APIRequestDto> response
                = restTemplate.exchange(apiUrl,
                HttpMethod.GET,
                request,
                APIRequestDto.class);

        //List<ResponseDto> response = userService.getUserLogResponse(response.getBody(), email);

        String res = ResponseEntity.accepted().toString();
        return ResponseEntity.ok(ResponseDto.success(res));
    }
}
