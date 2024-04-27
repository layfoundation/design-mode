package com.layfoundation.design.mode.strategy;

import org.springframework.stereotype.Service;

import java.util.Map;
import javax.annotation.Resource;

@Service
public class NotifyContext {
    @Resource
    private Map<String, Notify> notifies;

    public void sendMessage(String type) {
        Notify notify = notifies.get(type);
        notify.sendMessage();
    }
}
