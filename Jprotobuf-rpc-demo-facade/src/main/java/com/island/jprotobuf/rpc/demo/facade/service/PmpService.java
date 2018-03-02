package com.island.jprotobuf.rpc.demo.facade.service;

import com.baidu.jprotobuf.pbrpc.ProtobufRPC;
import com.island.jprotobuf.rpc.demo.facade.constants.DemoConstants;
import com.island.jprotobuf.rpc.demo.facade.request.HelloWorldRequest;
import com.island.jprotobuf.rpc.demo.facade.response.HelloWorldResponse;

public interface PmpService {

    @ProtobufRPC(serviceName = DemoConstants.PMP_SERVICE,
            onceTalkTimeout = DemoConstants.DEFAULT_BACKEND_CLIENT_TIMEOUT,
            methodName = "helloWorld")
    public HelloWorldResponse helloWorld(HelloWorldRequest request);

}
