package com.island.jprotobuf.rpc.demo.facade.request;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import lombok.Data;

@Data
public class HelloWorldRequest {

    @Protobuf(fieldType = FieldType.STRING, order = 1, required = true, description = "请求的信息")
    private String request;

    @Override
    public String toString() {
        return "HelloWorldRequest, request:" + request;
    }

}
