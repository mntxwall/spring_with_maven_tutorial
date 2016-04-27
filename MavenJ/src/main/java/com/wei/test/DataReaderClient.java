package com.wei.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by cw on 16-4-26.
 */
public class DataReaderClient {

    private ApplicationContext ctx = null;
//    private Reader reader = null;
    private ReadService service = null;


    public DataReaderClient(){
        ctx = new ClassPathXmlApplicationContext("spring.xml");
    }

    public String getData(){
        //reader = (Reader) ctx.getBean("fileReader");
        service = (ReadService) ctx.getBean("readService");
        return service.fetchData();
    }


    public String getFileName(){

        return service.getFileName();
    }

    public void getServiceProperties(){
        for (Object t : service.getProperties()){
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args){

        DataReaderClient client = new DataReaderClient();
        System.out.println("Data:" + client.getData());
        System.out.println(client.getFileName());
        client.getServiceProperties();

    }
}
