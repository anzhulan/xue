package com.lan.test;

/**
 * @author lanxinping
 * @Date 2019-12-19
 */
public class ProxyTest {
    interface Interface {
        void doSomeThing();
        void someThingElse(String arg);
    }

    class RealObject implements Interface {

        @Override
        public void doSomeThing() {
            System.out.println("doSomeThing");
        }

        @Override
        public void someThingElse(String arg) {
            System.out.println("somethingElse " + arg);
        }

        class SimpleProxy implements Interface {

            private Interface proxied;

            public SimpleProxy(Interface proxied) {
                this.proxied = proxied;
            }
            @Override
            public void doSomeThing() {
                System.out.println("simpleproxy dosomething");
                proxied.doSomeThing();
            }

            @Override
            public void someThingElse(String arg) {

            }
        }
    }
}
