package com.island.jprotobuf.rpc.demo.api.rpc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.jprotobuf.pbrpc.ProtobufRPCService;
import com.baidu.jprotobuf.pbrpc.spring.annotation.RpcExporter;
import com.island.jprotobuf.rpc.demo.facade.constants.DemoConstants;
import com.island.jprotobuf.rpc.demo.facade.request.HelloWorldRequest;
import com.island.jprotobuf.rpc.demo.facade.response.HelloWorldResponse;
import com.island.jprotobuf.rpc.demo.facade.service.PmpService;
import com.island.jprotobuf.rpc.demo.service.HelloWorldRunService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RpcExporter(port = "1033", rpcServerOptionsBeanName = "rpcServerOptions")
@Service(DemoConstants.PMP_SERVICE)
public class PmpServiceImpl implements PmpService {

    @Autowired
    private HelloWorldRunService helloWorldRunService;

    @ProtobufRPCService(serviceName = DemoConstants.PMP_SERVICE, methodName = "helloWorld")
    @Override
    public HelloWorldResponse helloWorld(HelloWorldRequest request) {
        log.info("Called by request:" + request);
        HelloWorldResponse response = helloWorldRunService.helloWorld(request);
        return response;
    }

}
