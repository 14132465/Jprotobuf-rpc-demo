package com.island.jprotobuf.rpc.demo.service.impl;

import org.springframework.stereotype.Component;

import com.island.jprotobuf.rpc.demo.facade.request.HelloWorldRequest;
import com.island.jprotobuf.rpc.demo.facade.response.HelloWorldResponse;
import com.island.jprotobuf.rpc.demo.service.HelloWorldRunService;

@Component
public class HelloWorldRunServiceImpl implements HelloWorldRunService {

    @Override
    public HelloWorldResponse helloWorld(HelloWorldRequest request) {
        HelloWorldResponse response = new HelloWorldResponse();
        response.setResponse("Hello " + request.getRequest());
        return response;
    }

}
