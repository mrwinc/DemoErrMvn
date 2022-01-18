package com.demo.mvn.service.impl;

import com.demo.mvn.service.ServiceA;

public class ServiceAImpl implements ServiceA {

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
