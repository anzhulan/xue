package com.lan.test;

import java.util.LinkedList;
import java.util.Random;

/**
 * 使用linkedList形成一个栈
 * @author lanxinping
 * @Date 2019-12-19
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 50; i++) {
            System.out.println(rand.nextInt(20));
        }
    }

    /**
     * 向栈顶添加元素
     */
    public void push(T t) {
        storage.addFirst(t);
    }

    /**
     * 弹出元素
     */
    public T peek() {
        return storage.getFirst();
    }

    /**
     * 移除
     * @return
     */
    public T pop() {
        return storage.removeFirst();
    }

    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
