package com.island.jprotobuf.rpc.demo.api.rpc;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.island.jprotobuf.rpc.demo.api.base.BaseJunit4Test;
import com.island.jprotobuf.rpc.demo.facade.request.HelloWorldRequest;
import com.island.jprotobuf.rpc.demo.facade.response.HelloWorldResponse;
import com.island.jprotobuf.rpc.demo.facade.service.PmpService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PmpServiceImplTest extends BaseJunit4Test {

    @Autowired
    private PmpService pmpService;

    @Test
    public void testPmpService() {
        HelloWorldRequest request = new HelloWorldRequest();
        request.setRequest("David");
        HelloWorldResponse response = pmpService.helloWorld(request);
        log.info(response.toString());
    }

    // @Test
    public void testRPCServer() {

        while (true) {

        }

    }
}
