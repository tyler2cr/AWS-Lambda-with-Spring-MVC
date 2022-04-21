package com.amazonaws.serverless.sample.springboot2.controller;

import com.amazonaws.serverless.sample.springboot2.Application;
import com.amazonaws.serverless.sample.springboot2.StreamLambdaHandler;
import com.amazonaws.serverless.sample.springboot2.model.Pet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = Application.class)
@AutoConfigureMockMvc(printOnlyOnFailure = false)
public class PetsControllerTest {

    @Autowired
    public MockMvc mockMvc;

//    @Autowired
//    private TestRestTemplate testRestTemplate;
//
//    @LocalServerPort
//    private Integer port;

    @BeforeAll
    static void beforeAll() {
        StreamLambdaHandler streamLambdaHandler = new StreamLambdaHandler();
//        streamLambdaHandler.handler.
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createPet() {

    }

    @Test
    void listPets() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/pets"))
                .andExpect(MockMvcResultMatchers.status().isOk());
//        URI uri = baseUrl().path("/pets").build().toUri();
//
//        ResponseEntity<Pet[]> responseEntity = testRestTemplate.getForEntity(uri, Pet[].class);
//
//        assertThat(responseEntity.getStatusCode())
//                .isEqualTo(HttpStatus.OK);
    }

    @Test
    void testListPets() {
    }

//    private UriComponentsBuilder baseUrl() {
//        return UriComponentsBuilder.newInstance()
//                .host("localhost")
//                .port(port);
//    }
}