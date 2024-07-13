package com.layfoundation.design.mode.factory.simple;

import com.layfoundation.design.mode.factory.product.phone.Huawei;
import com.layfoundation.design.mode.factory.product.phone.Iphone;
import com.layfoundation.design.mode.factory.product.phone.Phone;
import com.layfoundation.design.mode.factory.product.phone.Xiaomi;

/**
 * 简单工厂。其实不是一个设计模式，而是一种编程习惯。
 */
public class SimpleFactory {
    public Phone createPhone(String type) {
        if ("xiaomi".equalsIgnoreCase(type)) {
            return new Xiaomi();
        } else if ("iphone".equalsIgnoreCase(type)) {
            return new Iphone();
        } else if ("huawei".equalsIgnoreCase(type)) {
            return new Huawei();
        } else {
            return null;
        }
    }
}

