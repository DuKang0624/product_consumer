package com.dukang.product_consumer;

/**
 * @ClassName TestClass
 * @Description TODO
 * @Auther dukang
 * @Date 2019/09/17 09:53
 * @Version 1.0
 */
public class TestClass {
    public static void main(String[] args) {
        Task task = new Task();
        //使用构造方法将Task类传入两个线程，实现数据的共享
        new Thread(new Product(task)).start();
        new Thread(new Consumer(task)).start();
    }
}