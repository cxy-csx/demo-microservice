package com.csx.http;

import com.csx.http.service.HttpService;
import com.csx.model.R;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoHttpTestApplication.class)
class DemoHttpTestApplicationTests {

    @Autowired
    private HttpService httpService;

    @Test
    void contextLoads() {
        R r = httpService.get("https://movie.douban.com/j/search_subjects?type=movie&tag=%E6%9C%80%E6%96%B0&page_limit=50&page_start=0");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            System.out.println(objectMapper.writeValueAsString(r));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
//        System.out.println(1);
    }

}
