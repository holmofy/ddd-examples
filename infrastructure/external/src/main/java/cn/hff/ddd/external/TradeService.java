package cn.hff.ddd.external;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component
public class TradeService {

    public interface TradeApi {
        void doSomething();
    }

    @DubboReference
    private TradeApi tradeApi;

    public void doSomething() {
        tradeApi.doSomething();
    }

}
