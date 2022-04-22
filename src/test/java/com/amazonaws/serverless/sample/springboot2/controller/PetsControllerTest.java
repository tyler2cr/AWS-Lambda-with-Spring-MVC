package com.amazonaws.serverless.sample.springboot2.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc(printOnlyOnFailure = false)
public class PetsControllerTest {

    @Autowired
    public MockMvc mockMvc;

    @Test
    void listPets() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/pets"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}