package com.example.catprofile.service;


import com.example.catprofile.model.CatFactResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
@Slf4j
@Service
public class CatFactService {
    private static final String CAT_FACT_URL = "https://catfact.ninja/fact";

    private RestTemplate createRestTemplateWithTimeout() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(3000); // 3 seconds
        factory.setReadTimeout(3000);
        return new RestTemplate(factory);
    }

    public String getCatFact() {
        try {
            RestTemplate restTemplate = createRestTemplateWithTimeout();
            CatFactResponse response = restTemplate.getForObject(CAT_FACT_URL, CatFactResponse.class);
            if (response != null && response.getFact() != null) {
                log.info("Fetched cat fact successfully: {}", response.getFact());
                return response.getFact();
            } else {
                log.warn("Received null or incomplete response from Cat Facts API.");
                return "No fact available.";
            }
        } catch (Exception e) {
            log.error("Error fetching cat fact: {}", e.getMessage());
            return "Could not fetch cat fact at the moment.";
        }
    }
}
