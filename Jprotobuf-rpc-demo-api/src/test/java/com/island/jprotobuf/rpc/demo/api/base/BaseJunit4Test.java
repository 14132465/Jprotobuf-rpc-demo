package com.island.jprotobuf.rpc.demo.api.base;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/spring/applicationContext-api-test.xml" })
// @TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class })
// @DbUnitConfiguration(databaseConnection = { "dbUnitDataSource" })
// ------------如果加入以下代码，所有继承该类的测试类都会遵循该配置，也可以不加，在测试类的方法上控制事务
// 这个非常关键，如果不加入这个注解配置，事务控制就会完全失效！
// @Transactional
// 这里的事务关联到配置文件中的事务控制器（transactionManager =
// "transactionManager"），同时//指定自动回滚（defaultRollback = true）。这样做操作的数据才不会污染数据库！
// @TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
// ------------
// @Transactional(transactionManager = "transactionManager")
// @Rollback(false)
public class BaseJunit4Test {
    private final static Logger LOGGER = LoggerFactory.getLogger(BaseJunit4Test.class);

    @Test
    public void init() {

    }

    /**
     * @Title: printServiceMethodsTime @Description: 此方法在每个测试方法结束后打印其调用的所有service方法的执行时间 @throws
     */
    @After
    public void printServiceMethodsTime() {
        ConcurrentHashMap<String, Long> methodTimeMap = new ConcurrentHashMap<>();
        Set<String> methodNameSet = methodTimeMap.keySet();
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("----------下面列出调用的service方法的执行时间start--------------");
        }
        for (String method : methodNameSet) {
            if (LOGGER.isInfoEnabled()) {
                LOGGER.info("方法 " + method + "执行时间为：" + methodTimeMap.get(method) + "毫秒。");
            }
        }
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("----------下面列出调用的service方法的执行时间end--------------");
        }
    }
}
