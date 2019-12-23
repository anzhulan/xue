package com.lan.test;

import java.util.Random;

/**
 * @author lanxinping
 * @Date 2019-12-19
 */
public class Prediction {
    private static Random rand = new Random(47);
    private boolean shadow = rand.nextDouble() > 0.5;

    @Override
    public String toString() {
        if (shadow)
            return "Six more weeks of Winter";
        else
            return "Early Spring";
    }
}
