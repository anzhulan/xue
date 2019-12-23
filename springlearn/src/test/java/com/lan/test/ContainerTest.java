package com.lan.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author lanxinping
 * @Date 2019-12-19
 */
public class ContainerTest {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("1", "2", "3", "4", "5");
        List<String> list2 = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list2.add(i + "");
        }
        Iterator<String> iterator = list1.iterator();
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
            it.remove();
        }
        System.out.println(list2.toString());
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
