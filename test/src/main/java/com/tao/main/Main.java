package com.tao.main;

import com.tao.bean.Contans;
import com.tao.test.TestCallable;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.*;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:beans.xml")
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 6, 60L, MILLISECONDS, new ArrayBlockingQueue<Runnable>(9));

        FutureTask<Object> objectFutureTask = new FutureTask<>(new TestCallable());
        threadPoolExecutor.submit(objectFutureTask);
        System.out.println("objectFutureTask.get() = " + objectFutureTask.get());
        threadPoolExecutor.shutdown();

        ArrayList<Object> objects1 = new ArrayList<>();
        objects1.add("ssss");
        objects1.add("ss");
        objects1.add("ssss");
        objects1.add("ssss");
        objects1.add("ssss");

        System.out.println("objects1 = " + objects1);

        ArrayList<Object> objects = new ArrayList<>(objects1);

        System.out.println("objects = " + objects);



    }


//    @Before
//    public void before(){
//        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
//    }

//    @Autowired
//    private  ApplicationContext applicationContext;
    @Test
    public void test() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object user = applicationContext.getBean("user");

        String kk = Contans.hh.kk;

        System.out.println("kk = " + kk);

        "".equals(Contans.hh.kk);

       // System.out.println("System.getenv() = " + System.getenv());

        System.out.println("System.getProperties() = " + System.getProperties());





    }

    @Test
    public void test1() throws Exception {

        //需要配置全路径，不适合
//        System.getProperties().load(new FileInputStream("/Users/taotao/IdeaProjects/demo/test/src/main/resources/tao"));
//        String lll = System.getProperty("lll");
//
//        System.out.println("lll = " + lll);

        //classes路径下读取配置文件配置
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("tao.properties");

        Properties properties = new Properties();

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        properties.load(inputStreamReader);

        String lll = properties.getProperty("lll");

        System.out.println("lll = " + lll);
    }

    @Test
    public void test2(){
        Calendar instance = Calendar.getInstance();
    }



}
