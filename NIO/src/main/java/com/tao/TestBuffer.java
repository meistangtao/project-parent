package com.tao;

import org.junit.Test;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public class TestBuffer {

    @Test
    public void test(){

//        new HashMap<String,String>();
//
//        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
//        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1024);
//        
//
//        System.out.println("byteBuffer = " + byteBuffer);
//
//        byteBuffer.put("qwer唐涛".getBytes());
//        System.out.println("byteBuffer = " + byteBuffer);
//
//        System.out.println("byteBuffer.get(1) ======= " + byteBuffer.get(1));
//
//
//        byteBuffer.flip();
//
//        byte[] bytes = new byte[7];
//        ByteBuffer buffer = byteBuffer.get(bytes);
//
//        System.out.println("buffer = " + buffer);
//        System.out.println("byteBuffer.get(1) = " + new String(bytes,0,bytes.length));
//
//
//        System.out.println("byteBuffer = " + byteBuffer);

//        if () {
//
//        }

//        AtomicInteger atomicInteger = new AtomicInteger();
//        System.out.println("atomicInteger.get() = " + atomicInteger.get());



    }

    public static void main(String[] args) {
        //AtomicInteger atomicInteger = new AtomicInteger(6);
        //System.out.println("atomicInteger.get() = " + atomicInteger.get());

       // System.out.println("atomicInteger.compareAndSet(12,14) = " + atomicInteger.compareAndSet(6, 14));

        //System.out.println("atomicInteger = " + atomicInteger);


//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
//                3,3,60L, TimeUnit.HOURS,new ArrayBlockingQueue<Runnable>(9));
//
//        ThreadLocal threadLocal = new ThreadLocal();
//        threadLocal.set("jjjkkkkk");
//
//        System.out.println("threadLocal.get() = " + threadLocal.get());
//
//        threadLocal.set(new Integer(111));
//
//        System.out.println("threadLocal.get() = " + threadLocal.get());
//
//        System.out.println("this = " );


//        float i=314_92.9_6_5f;
//        System.out.println("i = " + i);
//        info();

    }

    public static void info(){
        Gender mela = Gender.valueOf(Gender.class,"MALE");
        Gender famale = Gender.FAMALE;
        System.out.println("famale = " + famale);

    }

    public static void testBuffer(){

        ByteBuffer allocate = ByteBuffer.allocate(1024);

    }

}
