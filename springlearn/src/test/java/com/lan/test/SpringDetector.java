package com.lan.test;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lanxinping
 * @Date 2019-12-19
 */
public class SpringDetector {
    public static <T extends GroudHog>
        void detectSpring(Class<T> type) throws Exception{
        Constructor<T> ghog = type.getConstructor(int.class);
        Map<GroudHog,Prediction> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(ghog.newInstance(i),new Prediction());
        }
        System.out.println("map =" + map);
        GroudHog gh = ghog.newInstance(3);
        System.out.println("looking up prediction for " + gh);
        if (map.containsKey(gh)) {
            System.out.println(map.get(gh));
        } else {
            System.out.println("Key not found :" + gh);
        }
    }

    public static void main(String[] args) throws Exception {
        detectSpring(GroudHog.class);
    }
}
