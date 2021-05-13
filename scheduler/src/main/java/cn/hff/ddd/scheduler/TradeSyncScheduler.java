package cn.hff.ddd.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TradeSyncScheduler {

    @Scheduled(fixedDelay = 1000)
    public void sync() {

    }

}
