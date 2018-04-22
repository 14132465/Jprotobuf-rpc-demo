# Jprotobuf-rpc-demo
This is a Jprotobuf rpc demo.


## 1. Why Jprotobuf-rpc-sorcket?

### 1.1 Introduction to Jprotobuf-rpc-sorcket
(1). The project is built based on Baidu [Jprotobuf-rpc-socket](https://github.com/baidu/Jprotobuf-rpc-socket). Here is the [user guide](https://github.com/baidu/Jprotobuf-rpc-socket/wiki/User-Guide).<br>
And the Jprotobuf-rpc-socket is built on [Protocol Buffer](https://developers.google.com/protocol-buffers/)(It is Google's language-neutral, platform-neutral, extensible mechanism for serializing structured data – think XML, but smaller, faster, and simpler. ) and Netty which is a impelementation of NIO.<br>

### 1.2 Why Jprotobuf-rpc-sorcket?
(1). Compare to another baidu rpc framework, [navi-pbrpc](https://github.com/neoremind/navi-pbrpc), Jprotobuf rpc supports more annotions, which makes it much more easier to use.<br>
(2). And another reason why we use the Jprotobuf-rpc-socket other than navi-pbrpc is, the creator of navi-pbrpc has left Baidu and the project hasn't been updatding for years, however the Jprotobuf-rpc-socket is still updating for bug fix and adding features.<br>
(3). Comparing to some other kinds of rpc framework like Google protobuf-rpc-pro and Facebook thrift, Jprotobuf-rpc-socket seems much more easier to use.<br>


## 2. Steps to test the demo
### 2.1 About this demo
Here is the logic picture.<br>

![gras](/framework.jpeg)


### 2.2. Steps to test the demo
(1). Compile the the project with command: <br>
```
mvn clean -Pdevelop package
```

You can add the flowing command behind to skip tests
```
-Dmaven.test.skip=true 
```

(2). Deploy the Jprotobuf-rpc-demo-api.war into the ROOT of tomcat.<br>
(3). Run the test case under the module: Jprotobuf-rpc-demo-facade called:<br>
```
HelloWorldServiceTest.testHelloWorldService()
```
(4). On linux, you can check if the rpc service running by command:<br>
```
lsof -i:1033
netstat -tunlp | grep 8150
```
If you see something like:<br>
```
COMMAND   PID     USER   FD   TYPE             DEVICE SIZE/OFF NODE NAME
java    60490 dddddddd  233u  IPv6 0xd360b8ddfd176255      0t0  TCP *:netinfo-local (LISTEN)
```
That means the service is running without error.<br>
