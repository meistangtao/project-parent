package com.tao.test;


import java.util.concurrent.Callable;

public class TestCallable  implements Callable {
    public static String get(){
        return "999999";
    }

    @Override
    public Object call() throws Exception {
        return "11111111";
    }
}
