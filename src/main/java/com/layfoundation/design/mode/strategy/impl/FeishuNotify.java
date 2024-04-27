package com.layfoundation.design.mode.strategy.impl;

import com.layfoundation.design.mode.strategy.Notify;
import org.springframework.stereotype.Service;

@Service
public class FeishuNotify implements Notify {
    @Override
    public void sendMessage() {
        System.out.println("飞书通知");
    }
}
