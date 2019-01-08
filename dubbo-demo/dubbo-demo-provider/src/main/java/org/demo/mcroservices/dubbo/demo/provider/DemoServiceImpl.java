package org.demo.mcroservices.dubbo.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import org.demo.mcroservices.dubbo.demo.DemoService;

/**
 * 服务提供者
 * @author yxxcoder
 * @create 2019-01-06 下午8:32
 **/
@Service
public class DemoServiceImpl implements DemoService {
//    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public String sayHello(String name) {
//        logger.info("Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }

}
