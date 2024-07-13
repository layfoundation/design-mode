package com.layfoundation.design.mode.factory.method;

import com.layfoundation.design.mode.factory.product.Huawei;
import com.layfoundation.design.mode.factory.product.Iphone;
import com.layfoundation.design.mode.factory.product.Phone;
import com.layfoundation.design.mode.factory.product.Xiaomi;

/**
 * 工厂方法模式
 */
public class FactoryMethod extends AbstractFactory {
    @Override
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
