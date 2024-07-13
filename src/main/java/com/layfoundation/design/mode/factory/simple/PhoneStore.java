package com.layfoundation.design.mode.factory.simple;

import com.layfoundation.design.mode.factory.product.Phone;

public class PhoneStore {
    private SimpleFactory simpleFactory;

    public PhoneStore(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public Phone orderPhone(String type) {
        Phone phone = simpleFactory.createPhone(type);
        //包装
        //打包
        //物流
        //...
        return phone;
    }
}
