package com.island.jprotobuf.rpc.demo.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;

import com.island.jprotobuf.rpc.demo.api.base.BaseMockMvcTest;
import com.island.jprotobuf.rpc.demo.facade.request.HelloWorldRequest;
import com.island.jprotobuf.rpc.demo.facade.response.HelloWorldResponse;
import com.island.jprotobuf.rpc.demo.facade.service.PmpService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DeveloperControllerTest extends BaseMockMvcTest {

    @Autowired
    private PmpService pmpService;

    @Test
    public void testDeveloper() throws Exception {

        MvcResult result = mockMvc
                .perform(get("/developer/test").contentType(MediaType.APPLICATION_JSON).characterEncoding("UTF-8")
                        .header("requestTime", "").header("requestId", "")
                        .header("Content-type", "application/json;charset=UTF-8"))
                .andExpect(status().isOk()).andReturn();
        log.info("The result: " + result.getResponse().getContentAsString());
    }

    // @Test
    public void testRPCServer() {
        HelloWorldRequest request = new HelloWorldRequest();
        request.setRequest("David");
        HelloWorldResponse response = pmpService.helloWorld(request);
        log.info(response.toString());

        while (true) {

        }
    }

}
