package com.layfoundation.design.mode.strategy.impl;

import com.layfoundation.design.mode.strategy.Notify;
import org.springframework.stereotype.Service;

@Service
public class EmailNotify implements Notify {
    @Override
    public void sendMessage() {
        System.out.println("邮件通知");
    }
}
