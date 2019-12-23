package com.lan.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author lanxinping
 * @Date 2019-12-19
 */
public class ListIteratorTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        ListIterator<Integer> it = list.listIterator(5);
        while (it.hasNext()) {
            Integer next = it.next();
            System.out.println("当前值：" + next);
            if (it.hasPrevious()) {
                int i = it.previousIndex();
                System.out.println("前一个索引：" + i);
            }
            int n = it.nextIndex();
            System.out.println("下一个索引:" + n);
        }
    }
}
