package com.island.jprotobuf.rpc.demo.facade.response;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import lombok.Data;

@Data
public class HelloWorldResponse {

    @Protobuf(fieldType = FieldType.STRING, order = 1, required = true, description = "请求返回的信息")
    private String response;

    @Override
    public String toString() {
        return "HelloWorldResponse, response = " + response;
    }
}
