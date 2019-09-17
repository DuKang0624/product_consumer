package com.dukang.product_consumer;

/**
 * @ClassName Product
 * @Description TODO
 * @Auther dukang
 * @Date 2019/09/17 09:52
 * @Version 1.0
 */
public class Product implements Runnable {

    private Task task;
    public Product (Task task) {
        this.task = task;
    }
    @Override
    public void run() {
        int i = 0;
        while(true) {
            try {
                task.getTaskList().add(i + "");
                System.out.println("Product 生成了任务，任务id为：" + i);
                i++;
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}