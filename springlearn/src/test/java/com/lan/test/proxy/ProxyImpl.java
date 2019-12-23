package com.lan.test.proxy;

/**
 * @author lanxinping
 * @Date 2019-12-19
 */
public class ProxyImpl implements ProxyInterface {
    @Override
    public void say() {
        System.out.println("你好，我是你的代理");
    }
}
