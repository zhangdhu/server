package com.zdh.api.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.zdh.api.ApiApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestApiControllerTest {
    @Test
    public void getById() throws Exception {
        long uid = 100;
        RequestBuilder requestBuilder = get("/api/1.0/rest/param/" + uid);
        mvc.perform(requestBuilder).andExpect(status().isOk());
    }

    MockMvc mvc;

    @Before
    public void setup(){
        this.mvc = MockMvcBuilders.standaloneSetup(new RestApiController()).build();
    }

    @Test
    public void intdex() throws Exception {
        RequestBuilder requestBuilder = get("/api/1.0/rest");
        mvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(content().string("hello world"));
    }

    @Test
    public void param() throws Exception {
        RequestBuilder requestBuilder = get("/api/1.0/rest/param").param("name", "zhangdahu");
        mvc.perform(requestBuilder).andExpect(status().isOk());
//                .andExpect(content().string("hello world"));
    }

}