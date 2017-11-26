package com.zdh.api.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExceptionApiControllerTest {
    MockMvc mvc;

    @Before
    public void setup(){
        this.mvc = MockMvcBuilders.standaloneSetup(new RestApiController()).build();
    }

    @Test
    public void runtimeExcetption() throws Exception {
        RequestBuilder requestBuilder = get("/api/1.0/exception");
        mvc.perform(requestBuilder).andExpect(status().is4xxClientError());

    }

}