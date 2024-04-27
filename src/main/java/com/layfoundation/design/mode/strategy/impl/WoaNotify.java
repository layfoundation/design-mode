package com.layfoundation.design.mode.strategy.impl;

import com.layfoundation.design.mode.strategy.Notify;
import org.springframework.stereotype.Service;

@Service
public class WoaNotify implements Notify {
    @Override
    public void sendMessage() {
        System.out.println("woa通知");
    }
}
