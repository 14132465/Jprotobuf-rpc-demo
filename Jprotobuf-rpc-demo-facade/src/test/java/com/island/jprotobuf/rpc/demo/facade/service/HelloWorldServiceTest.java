package com.island.jprotobuf.rpc.demo.facade.service;

import org.junit.Test;

import com.baidu.jprotobuf.pbrpc.spring.annotation.HaRpcProxy;
import com.island.jprotobuf.rpc.demo.facade.constants.DemoConstants;
import com.island.jprotobuf.rpc.demo.facade.request.HelloWorldRequest;
import com.island.jprotobuf.rpc.demo.facade.response.HelloWorldResponse;
import com.island.jprotobuf.rpc.demo.service.base.BaseJunit4Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloWorldServiceTest extends BaseJunit4Test {

    @HaRpcProxy(namingServiceBeanName = DemoConstants.PMP_SERVICE,
            serviceInterface = PmpService.class,
            lookupStubOnStartup = false)
    private PmpService helloWorldService;

    @Test
    public void testHelloWorldService() {
        HelloWorldRequest request = new HelloWorldRequest();
        request.setRequest("Aha!");
        HelloWorldResponse response = helloWorldService.helloWorld(request);
        log.info(response.toString());
    }

}
