package com.layfoundation.design.mode.factory.method;

import com.layfoundation.design.mode.factory.product.phone.Phone;

public abstract class AbstractFactory {
    public abstract Phone createPhone(String type);
}
