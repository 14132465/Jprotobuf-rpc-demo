package com.island.jprotobuf.rpc.demo.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.island.jprotobuf.rpc.demo.facade.request.HelloWorldRequest;
import com.island.jprotobuf.rpc.demo.facade.response.HelloWorldResponse;
import com.island.jprotobuf.rpc.demo.service.base.BaseJunit4Test;

import lombok.extern.slf4j.Slf4j;

/**
 * 测试服务层
 * 
 * @author David Yin
 * @date 2018/02/19
 *
 */
@Slf4j
public class HelloWorldRunServiceTest extends BaseJunit4Test {

    @Autowired
    private HelloWorldRunService helloWorldRunService;

    /**
     * 测试helloWorld的PB RPC方法
     */
    @Test
    public void testHelloWorld() {
        HelloWorldRequest request = new HelloWorldRequest();
        request.setRequest("David");
        HelloWorldResponse response = helloWorldRunService.helloWorld(request);
        log.info(response.toString());
    }

}
