package com.lan.test;

/**
 * @author lanxinping
 * @Date 2019-12-19
 */
public class GroudHog {
    protected int number;
    public GroudHog(int n) {
        this.number = n;
    }
    public String toString() {
        return "GroudHog #" + number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof GroudHog && number == ((GroudHog) obj).number;
    }
}
