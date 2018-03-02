package com.island.jprotobuf.rpc.demo.service;

import com.island.jprotobuf.rpc.demo.facade.request.HelloWorldRequest;
import com.island.jprotobuf.rpc.demo.facade.response.HelloWorldResponse;

public interface HelloWorldRunService {

    /**
     * 真正运行helloWorld的服务
     * 
     * @param request
     * @return
     */
    HelloWorldResponse helloWorld(HelloWorldRequest request);

}
