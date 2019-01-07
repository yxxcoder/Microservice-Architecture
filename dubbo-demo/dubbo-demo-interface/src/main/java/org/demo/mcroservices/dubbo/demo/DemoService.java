package org.demo.mcroservices.dubbo.demo;

/**
 * @author yxxcoder
 * @create 2019-01-06 下午8:28
 **/
public interface DemoService {

    /**
     * 提供者和消费者共用的接口
     * @param name
     * @return
     */
    String sayHello(String name);

}
