package com.dukang.product_consumer;

import java.util.List;

/**
 * @ClassName Consumer
 * @Description TODO
 * @Auther dukang
 * @Date 2019/09/17 09:52
 * @Version 1.0
 */
public class Consumer implements Runnable {

    private Task task;
    public Consumer (Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        while(true) {
            try {
                List<String> taskList = task.getTaskList();
                if (taskList.size() > 0) {
                    String task = taskList.get(0);
                    System.out.println("Consumer 消费了任务，任务id为：" + task);
                    taskList.remove(0);
                }else {
                    System.out.println("无任务可处理！！！");
                }
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}