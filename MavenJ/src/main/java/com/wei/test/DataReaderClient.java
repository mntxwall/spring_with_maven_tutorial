package com.wei.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by cw on 16-4-26.
 */
public class DataReaderClient {

  private ApplicationContext ctx = null;
  //    private Reader reader = null;
  private ReadService service = null;
  private TestService ts = null;


  public DataReaderClient() {
    ctx = new ClassPathXmlApplicationContext("spring.xml");
  }

  public String getData() {

    //reader = (Reader) ctx.getBean("fileReader");
    service = (ReadService) ctx.getBean("readService");
    return service.fetchData();
  }

  public void testServiceInit() {
    this.ts = (TestService) ctx.getBean("testService");
  }

  public void doingServiceTest() {
    ts.doSomething();
  }

  public void doingServiceSetTest() {
    ts.toSetSomething();
  }

  public void doingReaderTest() {
    TestReader dr = (TestReader) ctx.getBean("testReader");
    System.out.println("this is in the DataReaderClient " + dr.getIndex());
  }

  public void doingFactoryTest() {
    System.out.println(ctx.getBean("factoryTest"));
  }

  public String getFileName() {

    return service.getFileName();
  }

  public void getServiceProperties() {
    for (Object t : service.getProperties()) {
      System.out.println(t.toString());
    }
  }

  public static void main(String[] args) {

    DataReaderClient client = new DataReaderClient();
    //System.out.println("Data:" + client.getData());
    //System.out.println(client.getFileName());
    //client.getServiceProperties();

    //初始化TestService
    client.testServiceInit();

    client.doingServiceTest();
    client.doingServiceSetTest();
    client.doingReaderTest();
    client.doingFactoryTest();


  }
}
