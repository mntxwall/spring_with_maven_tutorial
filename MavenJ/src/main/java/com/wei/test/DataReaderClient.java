package com.wei.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cw on 16-4-26.
 */
public class DataReaderClient {

    private ApplicationContext ctx = null;
    private Reader reader = null;

    public DataReaderClient(){
        ctx = new ClassPathXmlApplicationContext("spring.xml");
    }

    public String getData(){
        reader = (Reader) ctx.getBean("fileReader");
        return reader.read();
    }

    public static void main(String[] args){

        DataReaderClient client = new DataReaderClient();
        System.out.println("Data:" + client.getData());

    }
}
