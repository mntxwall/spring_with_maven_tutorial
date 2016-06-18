package com.wei.test;

/**
 * Created by cw on 6/18/16.
 */
public class Job implements Runnable{
    private int priority = 0;
    private String content = "";

    public Job(String content){
        this.priority = 0;
        this.content = content;
    }

    public Job(int priority, String content) {
        this.priority = priority;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public void run() {
        System.out.println(this.content + "is running");
    }
}
