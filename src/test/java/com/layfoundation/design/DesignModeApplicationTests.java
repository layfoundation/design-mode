package com.layfoundation.design;

import com.layfoundation.design.mode.strategy.NotifyContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignModeApplicationTests {
    @Autowired
    NotifyContext notifyContext;

    @Test
    void strategy() {
        notifyContext.sendMessage("emailNotify");
        notifyContext.sendMessage("feishuNotify");
    }

}
