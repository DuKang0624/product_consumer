package com.dukang.product_consumer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Task
 * @Description TODO
 * @Auther dukang
 * @Date 2019/09/17 10:06
 * @Version 1.0
 */
public class Task {
    private List<String> taskList = new ArrayList<String>();

    public List<String> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<String> taskList) {
        this.taskList = taskList;
    }
}