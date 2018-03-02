package com.island.jprotobuf.rpc.demo.api.base;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

// ------------如果加入以下代码，所有继承该类的测试类都会遵循该配置，也可以不加，在测试类的方法上控制事务
// 这个非常关键，如果不加入这个注解配置，事务控制就会完全失效！
// @Transactional
// 这里的事务关联到配置文件中的事务控制器（transactionManager =
// "transactionManager"），同时//指定自动回滚（defaultRollback = true）。这样做操作的数据才不会污染数据库！
// @TransactionConfiguration(transactionManager = "transactionManager",
// defaultRollback = true)
// ------------
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextConfiguration(locations = { "classpath*:/spring/applicationContext-api-test.xml",
        "classpath*:/spring/webmvc-config-test.xml" })
// @Transactional(transactionManager = "transactionManager")
// @Rollback(value = false)
public class BaseMockMvcTest {
    @Autowired
    protected WebApplicationContext webApplicationContext;
    protected MockMvc mockMvc;

    // @Test
    public void testConfig() {
        System.out.println(webApplicationContext == null ? "web application is null" : "web applicatioin is loaded");
    }

    @Test
    public void init() {

    }

    @Before
    public void setUp() {
        this.mockMvc = webAppContextSetup(this.webApplicationContext).alwaysExpect(status().isOk()).build();
        // .alwaysExpect定义全局的结果验证器，每次执行请求时都进行验证的规则
        // .setViewResolvers(ViewResolver...resolvers)：设置视图解析器；
    }

}
