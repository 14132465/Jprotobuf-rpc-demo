package com.island.jprotobuf.rpc.demo.dto;

import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import lombok.Data;

@Data
public class EchoInfo {

    @Protobuf
    public String message;
}
